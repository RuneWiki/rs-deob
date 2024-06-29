import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class312 extends class305 {

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public int field4733 = 0;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
    private int[] field4737;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "[I")
    private int[] field4738;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "[I")
    public int[] field4739;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "[I")
    public int[] field4734;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field4746;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field4731 = new StringBuffer(100);

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "[Ljava/lang/String;")
    private static String[] field4740 = new String[100];

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private static int field4743 = 256;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private static int field4742 = -1;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    private static int field4747 = -1;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    private static int field4749 = -1;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    private static int field4750 = 0;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    private static int field4745 = 0;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    private static int field4751 = 0;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    private static int field4741 = 256;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    private static int field4748 = -1;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    private static int field4752 = 0;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "[B")
    private byte[] field4735;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
    private int[] field4730;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "[I")
    private int[] field4736;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "[Ltf;")
    private class112[] field4744;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 4)
    public final int method2104(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class78.method573(0, field4731, false, ' ');
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
                    field4731.append('<');
                    field4731.append(var15);
                    field4731.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field4731.toString().substring(var5, field4731.length());
                        var11++;
                        var5 = field4731.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method2113('<');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method2113('>');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method2113(' ');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method2113('\u00ad');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method2113('×');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method2113('€');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method2113('©');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method2113('®');
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class321.method2236(var15.substring(4), 125);
                            var4 += this.field4744[var16].field1971;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field4731.append(var14);
                        var14 = (char) (class114.method739(false, var14) & 0xFF);
                        var4 += this.field4730[var14];
                        if (this.field4735 != null && var10 != '\u0000') {
                            var4 += this.field4735[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field4731.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field4731.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field4731.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field4731.length() > var5) {
            arg2[var11] = field4731.toString().substring(var5, field4731.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 205)
    public final void method2105(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2122(arg3, arg4);
            this.method2106(arg0, arg1 - this.method2118(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 214)
    private final void method2106(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4733;
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
                                    int var11 = class321.method2236(var10.substring(4), 94);
                                    class112 var12 = this.field4744[var11];
                                    int var13 = this.field4736 == null ? var12.field1973 : this.field4736[var11];
                                    if (field4743 == 256) {
                                        var12.method717(arg1, this.field4733 + var4 - var13);
                                    } else {
                                        var12.method718(arg1, this.field4733 + var4 - var13, field4743);
                                    }
                                    arg1 += var12.field1971;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method2126(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class114.method739(false, var9) & 0xFF);
                    if (this.field4735 != null && var6 != '\u0000') {
                        arg1 += this.field4735[(var6 << 8) + var15];
                    }
                    int var16 = this.field4739[var15];
                    int var17 = this.field4734[var15];
                    if (var15 == ' ') {
                        if (field4751 > 0) {
                            field4745 += field4751;
                            arg1 += field4745 >> 8;
                            field4745 &= 0xFF;
                        }
                    } else if (field4743 == 256) {
                        if (field4749 != -1) {
                            this.method1574(var15, this.field4737[var15] + arg1 + 1, this.field4738[var15] + var4 + 1, var16, var17, field4749, true);
                        }
                        this.method1574(var15, this.field4737[var15] + arg1, this.field4738[var15] + var4, var16, var17, field4750, false);
                    } else {
                        if (field4749 != -1) {
                            this.method1571(var15, this.field4737[var15] + arg1 + 1, this.field4738[var15] + var4 + 1, var16, var17, field4749, field4743, true);
                        }
                        this.method1571(var15, this.field4737[var15] + arg1, this.field4738[var15] + var4, var16, var17, field4750, field4743, false);
                    }
                    int var18 = this.field4730[var15];
                    if (field4742 != -1) {
                        if (class249.field3893) {
                            class115.method750(arg1, (int) ((double) this.field4733 * 0.7D) + var4, var18, field4742);
                        } else {
                            class270.method1812(arg1, (int) ((double) this.field4733 * 0.7D) + var4, var18, field4742);
                        }
                    }
                    if (field4747 != -1) {
                        if (class249.field3893) {
                            class115.method750(arg1, this.field4733 + var4 + 1, var18, field4747);
                        } else {
                            class270.method1812(arg1, this.field4733 + var4 + 1, var18, field4747);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 372)
    public final int method2107(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method2128(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method2117(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 401)
    public final void method2108(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2122(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method2117(arg0, arg1 - this.method2118(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 419)
    public final int method2109(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method2128(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field4733;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4746 + this.field4732 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method2104(arg0, var12, field4740);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4746 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4746 - this.field4732 - (var13 - 1) * arg10) / 2 + this.field4746 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4732 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4746 - this.field4732 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4746 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method2106(field4740[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method2106(field4740[var16], arg1 + (arg3 - this.method2118(field4740[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method2106(field4740[var16], arg1 + arg3 - this.method2118(field4740[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method2106(field4740[var16], arg1, var14);
            } else {
                this.method2114(field4740[var16], arg3);
                this.method2106(field4740[var16], arg1, var14);
                field4751 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 493)
    public final int method2110(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method2109(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 497)
    private static final int method2111(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 547)
    public final void method2112(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2122(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method2117(arg0, arg1 - this.method2118(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(C)I", line = 570)
    private final int method2113(char arg0) {
        return this.field4730[class114.method739(false, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 578)
    private final void method2114(String arg0, int arg1) {
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
            field4751 = (arg1 - this.method2118(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 609)
    public final int method2115(String arg0, int arg1) {
        return this.method2104(arg0, new int[] { arg1 }, field4740);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 615)
    public final void method2116(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2122(arg3, arg4);
            this.method2106(arg0, arg1 - this.method2118(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 623)
    private final void method2117(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4733;
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
                                    int var16 = class321.method2236(var13.substring(4), 70);
                                    class112 var17 = this.field4744[var16];
                                    int var18 = this.field4736 == null ? var17.field1973 : this.field4736[var16];
                                    if (field4743 == 256) {
                                        var17.method717(arg1 + var14, this.field4733 + var6 - var18 + var15);
                                    } else {
                                        var17.method718(arg1 + var14, this.field4733 + var6 - var18 + var15, field4743);
                                    }
                                    arg1 += var17.field1971;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2126(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class114.method739(false, var12) & 0xFF);
                    if (this.field4735 != null && var8 != '\u0000') {
                        arg1 += this.field4735[(var8 << 8) + var20];
                    }
                    int var21 = this.field4739[var20];
                    int var22 = this.field4734[var20];
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
                        if (field4751 > 0) {
                            field4745 += field4751;
                            arg1 += field4745 >> 8;
                            field4745 &= 0xFF;
                        }
                    } else if (field4743 == 256) {
                        if (field4749 != -1) {
                            this.method1574(var20, this.field4737[var20] + arg1 + var23 + 1, this.field4738[var20] + var6 + 1 + var24, var21, var22, field4749, true);
                        }
                        this.method1574(var20, this.field4737[var20] + arg1 + var23, this.field4738[var20] + var6 + var24, var21, var22, field4750, false);
                    } else {
                        if (field4749 != -1) {
                            this.method1571(var20, this.field4737[var20] + arg1 + var23 + 1, this.field4738[var20] + var6 + 1 + var24, var21, var22, field4749, field4743, true);
                        }
                        this.method1571(var20, this.field4737[var20] + arg1 + var23, this.field4738[var20] + var6 + var24, var21, var22, field4750, field4743, false);
                    }
                    int var25 = this.field4730[var20];
                    if (field4742 != -1) {
                        if (class249.field3893) {
                            class115.method750(arg1, (int) ((double) this.field4733 * 0.7D) + var6, var25, field4742);
                        } else {
                            class270.method1812(arg1, (int) ((double) this.field4733 * 0.7D) + var6, var25, field4742);
                        }
                    }
                    if (field4747 != -1) {
                        if (class249.field3893) {
                            class115.method750(arg1, this.field4733 + var6, var25, field4747);
                        } else {
                            class270.method1812(arg1, this.field4733 + var6, var25, field4747);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1327)
    public class312(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field4737 = arg1;
        this.field4738 = arg2;
        this.field4739 = arg3;
        this.field4734 = arg4;
        this.method2123(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field4738[var8] < var6 && this.field4734[var8] != 0) {
                var6 = this.field4738[var8];
            }
            if (this.field4738[var8] + this.field4734[var8] > var7) {
                var7 = this.field4738[var8] + this.field4734[var8];
            }
        }
        this.field4746 = this.field4733 - var6;
        this.field4732 = var7 - this.field4733;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V", line = 1362)
    public class312(byte[] arg0) {
        this.method2123(arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)I", line = 810)
    public final int method2118(String arg0) {
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
                                    int var9 = class321.method2236(var8.substring(4), 74);
                                    var4 += this.field4744[var9].field1971;
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
                    char var11 = (char) (class114.method739(false, var7) & 0xFF);
                    var4 += this.field4730[var11];
                    if (this.field4735 != null && var3 != '\u0000') {
                        var4 += this.field4735[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 906)
    public static final String method2119(String arg0) {
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

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 949)
    public final void method2120(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2122(arg3, arg4);
            this.method2106(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 958)
    public final int method2121(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method2128(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field4746 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field4746 - this.field4732) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field4732;
        }
        if (arg7 == 1) {
            var19 = this.method2118(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method2118(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method2117(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method2118(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field4746;
            arg11[2] = var19;
            arg11[3] = this.field4746 + this.field4732;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 1026)
    private final void method2122(int arg0, int arg1) {
        field4742 = -1;
        field4747 = -1;
        field4748 = arg1;
        field4749 = arg1;
        field4752 = arg0;
        field4750 = arg0;
        field4741 = 256;
        field4743 = 256;
        field4751 = 0;
        field4745 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([B)V", line = 1040)
    private final void method2123(byte[] arg0) {
        this.field4730 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4730.length; var2++) {
                this.field4730[var2] = arg0[var2] & 0xFF;
            }
            this.field4733 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4730[var4] = arg0[var3++] & 0xFF;
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
        this.field4735 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4735[(var17 << 8) + var18] = (byte) method2111(var9, var13, var6, this.field4730, var5, var17, var18);
                    }
                }
            }
        }
        this.field4733 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 1158)
    public final void method2124(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method2122(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method2117(arg0, arg1 - this.method2118(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([Ltf;[I)V", line = 1181)
    public final void method2125(class112[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field4744 = arg0;
        this.field4736 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Ljava/lang/String;)V", line = 1196)
    private final void method2126(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4750 = class1.method3(arg0.substring(4), (byte) 46, 16);
            } else if (arg0.equals("/col")) {
                field4750 = field4752;
            } else if (arg0.startsWith("trans=")) {
                field4743 = class321.method2236(arg0.substring(6), 99);
            } else if (arg0.equals("/trans")) {
                field4743 = field4741;
            } else if (arg0.startsWith("str=")) {
                field4742 = class1.method3(arg0.substring(4), (byte) 71, 16);
            } else if (arg0.equals("str")) {
                field4742 = 8388608;
            } else if (arg0.equals("/str")) {
                field4742 = -1;
            } else if (arg0.startsWith("u=")) {
                field4747 = class1.method3(arg0.substring(2), (byte) 61, 16);
            } else if (arg0.equals("u")) {
                field4747 = 0;
            } else if (arg0.equals("/u")) {
                field4747 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4749 = class1.method3(arg0.substring(5), (byte) 86, 16);
            } else if (arg0.equals("shad")) {
                field4749 = 0;
            } else if (arg0.equals("/shad")) {
                field4749 = field4748;
            } else if (arg0.equals("br")) {
                this.method2128(field4752, field4748, field4741);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V", line = 1273)
    public static void method2127() {
        field4731 = null;
        field4740 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 1280)
    private final void method2128(int arg0, int arg1, int arg2) {
        field4742 = -1;
        field4747 = -1;
        field4748 = arg1;
        field4749 = arg1;
        field4752 = arg0;
        field4750 = arg0;
        field4741 = arg2;
        field4743 = arg2;
        field4751 = 0;
        field4745 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(Ljava/lang/String;I)I", line = 1294)
    public final int method2129(String arg0, int arg1) {
        int var3 = this.method2104(arg0, new int[] { arg1 }, field4740);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method2118(field4740[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
