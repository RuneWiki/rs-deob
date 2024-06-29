import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class48 extends class86 {

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public int field733 = 0;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "[I")
    private int[] field734;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "[I")
    private int[] field738;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "[I")
    public int[] field736;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "[I")
    public int[] field742;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field731 = new StringBuffer(100);

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    private static int field744 = 256;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    private static int field748 = 0;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    private static int field747 = 0;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    private static int field746 = -1;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    private static int field745 = 256;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private static int field743 = -1;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    private static int field750 = -1;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    private static int field752 = 0;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "[Ljava/lang/String;")
    private static String[] field751 = new String[100];

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    private static int field749 = -1;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    private static int field753 = 0;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "[B")
    private byte[] field740;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "[I")
    private int[] field737;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "[I")
    private int[] field739;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "[Lob;")
    private class292[] field741;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;)V", line = 5)
    private final void method424(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field747 = class212.method1535(1000, 16, arg0.substring(4));
            } else if (arg0.equals("/col")) {
                field747 = field753;
            } else if (arg0.startsWith("trans=")) {
                field745 = class28.method194(arg0.substring(6), 10);
            } else if (arg0.equals("/trans")) {
                field745 = field744;
            } else if (arg0.startsWith("str=")) {
                field746 = class212.method1535(1000, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                field746 = 8388608;
            } else if (arg0.equals("/str")) {
                field746 = -1;
            } else if (arg0.startsWith("u=")) {
                field750 = class212.method1535(1000, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                field750 = 0;
            } else if (arg0.equals("/u")) {
                field750 = -1;
            } else if (arg0.startsWith("shad=")) {
                field743 = class212.method1535(1000, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                field743 = 0;
            } else if (arg0.equals("/shad")) {
                field743 = field749;
            } else if (arg0.equals("br")) {
                this.method443(field753, field749, field744);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 72)
    private static final int method425(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Ljava/lang/String;)I", line = 118)
    public final int method426(String arg0) {
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
                                    int var9 = class28.method194(var8.substring(4), 10);
                                    var4 += this.field741[var9].field4582;
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
                    char var11 = (char) (class39.method356(1, var7) & 0xFF);
                    var4 += this.field739[var11];
                    if (this.field740 != null && var3 != '\u0000') {
                        var4 += this.field740[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 213)
    public final int method427(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method446(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 216)
    private final void method428(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field733;
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
                                    int var16 = class28.method194(var13.substring(4), 10);
                                    class292 var17 = this.field741[var16];
                                    int var18 = this.field737 == null ? var17.field4578 : this.field737[var16];
                                    if (field745 == 256) {
                                        var17.method589(arg1 + var14, this.field733 + var6 - var18 + var15);
                                    } else {
                                        var17.method582(arg1 + var14, this.field733 + var6 - var18 + var15, field745);
                                    }
                                    arg1 += var17.field4582;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method424(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class39.method356(1, var12) & 0xFF);
                    if (this.field740 != null && var8 != '\u0000') {
                        arg1 += this.field740[(var8 << 8) + var20];
                    }
                    int var21 = this.field736[var20];
                    int var22 = this.field742[var20];
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
                        if (field748 > 0) {
                            field752 += field748;
                            arg1 += field752 >> 8;
                            field752 &= 0xFF;
                        }
                    } else if (field745 == 256) {
                        if (field743 != -1) {
                            this.method436(var20, this.field734[var20] + arg1 + var23 + 1, this.field738[var20] + var6 + 1 + var24, var21, var22, field743, true);
                        }
                        this.method436(var20, this.field734[var20] + arg1 + var23, this.field738[var20] + var6 + var24, var21, var22, field747, false);
                    } else {
                        if (field743 != -1) {
                            this.method448(var20, this.field734[var20] + arg1 + var23 + 1, this.field738[var20] + var6 + 1 + var24, var21, var22, field743, field745, true);
                        }
                        this.method448(var20, this.field734[var20] + arg1 + var23, this.field738[var20] + var6 + var24, var21, var22, field747, field745, false);
                    }
                    int var25 = this.field739[var20];
                    if (field746 != -1) {
                        if (class36.field534) {
                            class194.method1408(arg1, (int) ((double) this.field733 * 0.7D) + var6, var25, field746);
                        } else {
                            class168.method1242(arg1, (int) ((double) this.field733 * 0.7D) + var6, var25, field746);
                        }
                    }
                    if (field750 != -1) {
                        if (class36.field534) {
                            class194.method1408(arg1, this.field733 + var6, var25, field750);
                        } else {
                            class168.method1242(arg1, this.field733 + var6, var25, field750);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 400)
    public final int method429(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class307.method2130((byte) -107, field731, 0, ' ');
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
                    field731.append('<');
                    field731.append(var15);
                    field731.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field731.toString().substring(var5, field731.length());
                        var11++;
                        var5 = field731.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method431('<');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method431('>');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method431(' ');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method431('\u00ad');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method431('×');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method431('€');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method431('©');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method431('®');
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class28.method194(var15.substring(4), 10);
                            var4 += this.field741[var16].field4582;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field731.append(var14);
                        var14 = (char) (class39.method356(1, var14) & 0xFF);
                        var4 += this.field739[var14];
                        if (this.field740 != null && var10 != '\u0000') {
                            var4 += this.field740[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field731.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field731.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field731.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field731.length() > var5) {
            arg2[var11] = field731.toString().substring(var5, field731.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 605)
    public final int method430(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method443(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method428(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(C)I", line = 632)
    private final int method431(char arg0) {
        return this.field739[class39.method356(1, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 635)
    private final void method432(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field733;
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
                                    int var11 = class28.method194(var10.substring(4), 10);
                                    class292 var12 = this.field741[var11];
                                    int var13 = this.field737 == null ? var12.field4578 : this.field737[var11];
                                    if (field745 == 256) {
                                        var12.method589(arg1, this.field733 + var4 - var13);
                                    } else {
                                        var12.method582(arg1, this.field733 + var4 - var13, field745);
                                    }
                                    arg1 += var12.field4582;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method424(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class39.method356(1, var9) & 0xFF);
                    if (this.field740 != null && var6 != '\u0000') {
                        arg1 += this.field740[(var6 << 8) + var15];
                    }
                    int var16 = this.field736[var15];
                    int var17 = this.field742[var15];
                    if (var15 == ' ') {
                        if (field748 > 0) {
                            field752 += field748;
                            arg1 += field752 >> 8;
                            field752 &= 0xFF;
                        }
                    } else if (field745 == 256) {
                        if (field743 != -1) {
                            this.method436(var15, this.field734[var15] + arg1 + 1, this.field738[var15] + var4 + 1, var16, var17, field743, true);
                        }
                        this.method436(var15, this.field734[var15] + arg1, this.field738[var15] + var4, var16, var17, field747, false);
                    } else {
                        if (field743 != -1) {
                            this.method448(var15, this.field734[var15] + arg1 + 1, this.field738[var15] + var4 + 1, var16, var17, field743, field745, true);
                        }
                        this.method448(var15, this.field734[var15] + arg1, this.field738[var15] + var4, var16, var17, field747, field745, false);
                    }
                    int var18 = this.field739[var15];
                    if (field746 != -1) {
                        if (class36.field534) {
                            class194.method1408(arg1, (int) ((double) this.field733 * 0.7D) + var4, var18, field746);
                        } else {
                            class168.method1242(arg1, (int) ((double) this.field733 * 0.7D) + var4, var18, field746);
                        }
                    }
                    if (field750 != -1) {
                        if (class36.field534) {
                            class194.method1408(arg1, this.field733 + var4 + 1, var18, field750);
                        } else {
                            class168.method1242(arg1, this.field733 + var4 + 1, var18, field750);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Lob;[I)V", line = 791)
    public final void method433(class292[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field741 = arg0;
        this.field737 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 803)
    public final void method434(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method445(arg3, arg4);
            this.method432(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B)V", line = 813)
    private final void method435(byte[] arg0) {
        this.field739 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field739.length; var2++) {
                this.field739[var2] = arg0[var2] & 0xFF;
            }
            this.field733 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field739[var4] = arg0[var3++] & 0xFF;
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
        this.field740 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field740[(var17 << 8) + var18] = (byte) method425(var9, var13, var6, this.field739, var5, var17, var18);
                    }
                }
            }
        }
        this.field733 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 932)
    public static final String method437(String arg0) {
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

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 973)
    public final int method438(String arg0, int arg1) {
        int var3 = this.method429(arg0, new int[] { arg1 }, field751);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method426(field751[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 992)
    public final void method439(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method445(arg3, arg4);
            this.method432(arg0, arg1 - this.method426(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 1001)
    public final int method440(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method443(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field735 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field735 - this.field732) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field732;
        }
        if (arg7 == 1) {
            var19 = this.method426(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method426(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method428(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method426(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field735;
            arg11[2] = var19;
            arg11[3] = this.field735 + this.field732;
        }
        return var15;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 1072)
    public final void method441(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method445(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method428(arg0, arg1 - this.method426(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 1095)
    public final int method442(String arg0, int arg1) {
        return this.method429(arg0, new int[] { arg1 }, field751);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V", line = 1100)
    private final void method443(int arg0, int arg1, int arg2) {
        field746 = -1;
        field750 = -1;
        field749 = arg1;
        field743 = arg1;
        field753 = arg0;
        field747 = arg0;
        field744 = arg2;
        field745 = arg2;
        field748 = 0;
        field752 = 0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 1111)
    public final void method444(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method445(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method428(arg0, arg1 - this.method426(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V", line = 1129)
    private final void method445(int arg0, int arg1) {
        field746 = -1;
        field750 = -1;
        field749 = arg1;
        field743 = arg1;
        field753 = arg0;
        field747 = arg0;
        field744 = 256;
        field745 = 256;
        field748 = 0;
        field752 = 0;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1322)
    public class48(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field734 = arg1;
        this.field738 = arg2;
        this.field736 = arg3;
        this.field742 = arg4;
        this.method435(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field738[var8] < var6 && this.field742[var8] != 0) {
                var6 = this.field738[var8];
            }
            if (this.field742[var8] + this.field738[var8] > var7) {
                var7 = this.field742[var8] + this.field738[var8];
            }
        }
        this.field735 = this.field733 - var6;
        this.field732 = var7 - this.field733;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V", line = 1361)
    public class48(byte[] arg0) {
        this.method435(arg0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 1142)
    public final int method446(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method443(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field733;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field735 + this.field732 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method429(arg0, var12, field751);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field735 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field735 - this.field732 - (var13 - 1) * arg10) / 2 + this.field735 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field732 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field735 - this.field732 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field735 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method432(field751[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method432(field751[var16], arg1 + (arg3 - this.method426(field751[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method432(field751[var16], arg1 + arg3 - this.method426(field751[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method432(field751[var16], arg1, var14);
            } else {
                this.method449(field751[var16], arg3);
                this.method432(field751[var16], arg1, var14);
                field748 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 1223)
    public final void method447(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method445(arg3, arg4);
            this.method432(arg0, arg1 - this.method426(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Ljava/lang/String;I)V", line = 1242)
    private final void method449(String arg0, int arg1) {
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
            field748 = (arg1 - this.method426(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1280)
    public final void method450(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method445(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method428(arg0, arg1 - this.method426(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 1314)
    public static void method451() {
        field731 = null;
        field751 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
