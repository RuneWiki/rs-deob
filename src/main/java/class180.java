import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class180 extends class312 {

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public int field2757 = 0;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "[I")
    private int[] field2769;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "[I")
    private int[] field2750;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "[I")
    public int[] field2772;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[I")
    public int[] field2758;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    private int field2768;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    private int field2752;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field2751 = new StringBuffer(100);

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    private static int field2760 = 256;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    private static int field2764 = 0;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    private static int field2756 = -1;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    private static int field2761 = 0;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    private static int field2755 = -1;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "[Ljava/lang/String;")
    private static String[] field2762 = new String[100];

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    private static int field2767 = 0;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    private static int field2766 = 256;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    private static int field2770 = -1;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    private static int field2759 = 0;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    private static int field2771 = -1;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "[B")
    private byte[] field2765;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
    private int[] field2753;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "[I")
    private int[] field2763;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[Lph;")
    private class79[] field2754;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 3)
    private final void method1226(int arg0, int arg1) {
        field2770 = -1;
        field2756 = -1;
        field2755 = arg1;
        field2771 = arg1;
        field2767 = arg0;
        field2761 = arg0;
        field2766 = 256;
        field2760 = 256;
        field2759 = 0;
        field2764 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;)V", line = 14)
    private final void method1227(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2761 = class170.method1148(true, 16, arg0.substring(4));
            } else if (arg0.equals("/col")) {
                field2761 = field2767;
            } else if (arg0.startsWith("trans=")) {
                field2760 = class154.method1073(26, arg0.substring(6));
            } else if (arg0.equals("/trans")) {
                field2760 = field2766;
            } else if (arg0.startsWith("str=")) {
                field2770 = class170.method1148(true, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                field2770 = 8388608;
            } else if (arg0.equals("/str")) {
                field2770 = -1;
            } else if (arg0.startsWith("u=")) {
                field2756 = class170.method1148(true, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                field2756 = 0;
            } else if (arg0.equals("/u")) {
                field2756 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2771 = class170.method1148(true, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                field2771 = 0;
            } else if (arg0.equals("/shad")) {
                field2771 = field2755;
            } else if (arg0.equals("br")) {
                this.method1234(field2767, field2755, field2766);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 75)
    public final int method1228(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1234(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field2768 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field2768 - this.field2752) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field2752;
        }
        if (arg7 == 1) {
            var19 = this.method1247(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1247(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1244(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1247(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field2768;
            arg11[2] = var19;
            arg11[3] = this.field2768 + this.field2752;
        }
        return var15;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 140)
    public final int method1229(String arg0, int arg1) {
        return this.method1235(arg0, new int[] { arg1 }, field2762);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 146)
    public final int method1230(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1234(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field2757;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field2768 + this.field2752 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1235(arg0, var12, field2762);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field2768 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field2768 - this.field2752 - (var13 - 1) * arg10) / 2 + this.field2768 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field2752 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field2768 - this.field2752 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field2768 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1233(field2762[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1233(field2762[var16], arg1 + (arg3 - this.method1247(field2762[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1233(field2762[var16], arg1 + arg3 - this.method1247(field2762[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1233(field2762[var16], arg1, var14);
            } else {
                this.method1243(field2762[var16], arg3);
                this.method1233(field2762[var16], arg1, var14);
                field2759 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 226)
    public final void method1231(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1226(arg3, arg4);
            this.method1233(arg0, arg1 - this.method1247(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lph;[I)V", line = 233)
    public final void method1232(class79[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field2754 = arg0;
        this.field2763 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 246)
    private final void method1233(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2757;
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
                                    int var11 = class154.method1073(76, var10.substring(4));
                                    class79 var12 = this.field2754[var11];
                                    int var13 = this.field2763 == null ? var12.field1175 : this.field2763[var11];
                                    if (field2760 == 256) {
                                        var12.method159(arg1, this.field2757 + var4 - var13);
                                    } else {
                                        var12.method157(arg1, this.field2757 + var4 - var13, field2760);
                                    }
                                    arg1 += var12.field1171;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method1227(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class110.method745(var9, (byte) 19) & 0xFF);
                    if (this.field2765 != null && var6 != '\u0000') {
                        arg1 += this.field2765[(var6 << 8) + var15];
                    }
                    int var16 = this.field2772[var15];
                    int var17 = this.field2758[var15];
                    if (var15 == ' ') {
                        if (field2759 > 0) {
                            field2764 += field2759;
                            arg1 += field2764 >> 8;
                            field2764 &= 0xFF;
                        }
                    } else if (field2760 == 256) {
                        if (field2771 != -1) {
                            this.method1246(var15, this.field2769[var15] + arg1 + 1, this.field2750[var15] + var4 + 1, var16, var17, field2771, true);
                        }
                        this.method1246(var15, this.field2769[var15] + arg1, this.field2750[var15] + var4, var16, var17, field2761, false);
                    } else {
                        if (field2771 != -1) {
                            this.method1242(var15, this.field2769[var15] + arg1 + 1, this.field2750[var15] + var4 + 1, var16, var17, field2771, field2760, true);
                        }
                        this.method1242(var15, this.field2769[var15] + arg1, this.field2750[var15] + var4, var16, var17, field2761, field2760, false);
                    }
                    int var18 = this.field2753[var15];
                    if (field2770 != -1) {
                        if (class333.field5166) {
                            class238.method1626(arg1, (int) ((double) this.field2757 * 0.7D) + var4, var18, field2770);
                        } else {
                            class57.method385(arg1, (int) ((double) this.field2757 * 0.7D) + var4, var18, field2770);
                        }
                    }
                    if (field2756 != -1) {
                        if (class333.field5166) {
                            class238.method1626(arg1, this.field2757 + var4 + 1, var18, field2756);
                        } else {
                            class57.method385(arg1, this.field2757 + var4 + 1, var18, field2756);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V", line = 401)
    private final void method1234(int arg0, int arg1, int arg2) {
        field2770 = -1;
        field2756 = -1;
        field2755 = arg1;
        field2771 = arg1;
        field2767 = arg0;
        field2761 = arg0;
        field2766 = arg2;
        field2760 = arg2;
        field2759 = 0;
        field2764 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 412)
    public final int method1235(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class297.method1947(-25053, field2751, 0, ' ');
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
                    field2751.append('<');
                    field2751.append(var15);
                    field2751.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field2751.toString().substring(var5, field2751.length());
                        var11++;
                        var5 = field2751.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1239('<');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1239('>');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1239(' ');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1239('\u00ad');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1239('×');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1239('€');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1239('©');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1239('®');
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class154.method1073(-116, var15.substring(4));
                            var4 += this.field2754[var16].field1171;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field2751.append(var14);
                        var14 = (char) (class110.method745(var14, (byte) 19) & 0xFF);
                        var4 += this.field2753[var14];
                        if (this.field2765 != null && var10 != '\u0000') {
                            var4 += this.field2765[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field2751.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field2751.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field2751.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field2751.length() > var5) {
            arg2[var11] = field2751.toString().substring(var5, field2751.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 613)
    public final int method1236(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1230(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 616)
    public final void method1237(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1226(arg3, arg4);
            this.method1233(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 627)
    public static final String method1238(String arg0) {
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

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(C)I", line = 668)
    private final int method1239(char arg0) {
        return this.field2753[class110.method745(arg0, (byte) 19) & 0xFF];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 673)
    private static final int method1240(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 722)
    public final void method1241(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1226(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1244(arg0, arg1 - this.method1247(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1337)
    public class180(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field2769 = arg1;
        this.field2750 = arg2;
        this.field2772 = arg3;
        this.field2758 = arg4;
        this.method1250(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field2750[var8] < var6 && this.field2758[var8] != 0) {
                var6 = this.field2750[var8];
            }
            if (this.field2758[var8] + this.field2750[var8] > var7) {
                var7 = this.field2758[var8] + this.field2750[var8];
            }
        }
        this.field2768 = this.field2757 - var6;
        this.field2752 = var7 - this.field2757;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V", line = 1368)
    public class180(byte[] arg0) {
        this.method1250(arg0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 753)
    private final void method1243(String arg0, int arg1) {
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
            field2759 = (arg1 - this.method1247(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 789)
    private final void method1244(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2757;
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
                                    int var16 = class154.method1073(102, var13.substring(4));
                                    class79 var17 = this.field2754[var16];
                                    int var18 = this.field2763 == null ? var17.field1175 : this.field2763[var16];
                                    if (field2760 == 256) {
                                        var17.method159(arg1 + var14, this.field2757 + var6 - var18 + var15);
                                    } else {
                                        var17.method157(arg1 + var14, this.field2757 + var6 - var18 + var15, field2760);
                                    }
                                    arg1 += var17.field1171;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method1227(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class110.method745(var12, (byte) 19) & 0xFF);
                    if (this.field2765 != null && var8 != '\u0000') {
                        arg1 += this.field2765[(var8 << 8) + var20];
                    }
                    int var21 = this.field2772[var20];
                    int var22 = this.field2758[var20];
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
                        if (field2759 > 0) {
                            field2764 += field2759;
                            arg1 += field2764 >> 8;
                            field2764 &= 0xFF;
                        }
                    } else if (field2760 == 256) {
                        if (field2771 != -1) {
                            this.method1246(var20, this.field2769[var20] + arg1 + var23 + 1, this.field2750[var20] + var6 + 1 + var24, var21, var22, field2771, true);
                        }
                        this.method1246(var20, this.field2769[var20] + arg1 + var23, this.field2750[var20] + var6 + var24, var21, var22, field2761, false);
                    } else {
                        if (field2771 != -1) {
                            this.method1242(var20, this.field2769[var20] + arg1 + var23 + 1, this.field2750[var20] + var6 + 1 + var24, var21, var22, field2771, field2760, true);
                        }
                        this.method1242(var20, this.field2769[var20] + arg1 + var23, this.field2750[var20] + var6 + var24, var21, var22, field2761, field2760, false);
                    }
                    int var25 = this.field2753[var20];
                    if (field2770 != -1) {
                        if (class333.field5166) {
                            class238.method1626(arg1, (int) ((double) this.field2757 * 0.7D) + var6, var25, field2770);
                        } else {
                            class57.method385(arg1, (int) ((double) this.field2757 * 0.7D) + var6, var25, field2770);
                        }
                    }
                    if (field2756 != -1) {
                        if (class333.field5166) {
                            class238.method1626(arg1, this.field2757 + var6, var25, field2756);
                        } else {
                            class57.method385(arg1, this.field2757 + var6, var25, field2756);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 989)
    public final void method1245(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1226(arg3, arg4);
            this.method1233(arg0, arg1 - this.method1247(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(Ljava/lang/String;)I", line = 1009)
    public final int method1247(String arg0) {
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
                                    int var9 = class154.method1073(-112, var8.substring(4));
                                    var4 += this.field2754[var9].field1171;
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
                    char var11 = (char) (class110.method745(var7, (byte) 19) & 0xFF);
                    var4 += this.field2753[var11];
                    if (this.field2765 != null && var3 != '\u0000') {
                        var4 += this.field2765[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1105)
    public final void method1248(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1226(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1244(arg0, arg1 - this.method1247(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1133)
    public final int method1249(String arg0, int arg1) {
        int var3 = this.method1235(arg0, new int[] { arg1 }, field2762);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1247(field2762[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([B)V", line = 1152)
    private final void method1250(byte[] arg0) {
        this.field2753 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2753.length; var2++) {
                this.field2753[var2] = arg0[var2] & 0xFF;
            }
            this.field2757 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2753[var4] = arg0[var3++] & 0xFF;
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
        this.field2765 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2765[(var17 << 8) + var18] = (byte) method1240(var9, var13, var6, this.field2753, var5, var17, var18);
                    }
                }
            }
        }
        this.field2757 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 1270)
    public final int method1251(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1234(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1244(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 1303)
    public final void method1252(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1226(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method1244(arg0, arg1 - this.method1247(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 1331)
    public static void method1253() {
        field2751 = null;
        field2762 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method1242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method1246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
