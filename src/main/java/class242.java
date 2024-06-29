import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class242 extends class18 {

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public int field3929 = 0;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "[I")
    private int[] field3928;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "[I")
    private int[] field3932;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "[I")
    private int[] field3927;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "[I")
    private int[] field3940;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    private int field3926;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field3931 = new StringBuffer(100);

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    private static int field3937 = 0;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    private static int field3938 = 256;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    private static int field3941 = 0;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    private static int field3943 = -1;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    private static int field3934 = -1;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    private static int field3936 = -1;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
    private static int field3947 = 0;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "[Ljava/lang/String;")
    private static String[] field3944 = new String[100];

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
    private static int field3942 = -1;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    private static int field3945 = 0;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    private static int field3946 = 256;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "[B")
    private byte[] field3939;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "[I")
    private int[] field3930;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "[I")
    private int[] field3933;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "[Lul;")
    private class192[] field3925;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)V")
    private final void method1651(int arg0, int arg1, int arg2) {
        field3942 = -1;
        field3936 = -1;
        field3943 = arg1;
        field3934 = arg1;
        field3941 = arg0;
        field3947 = arg0;
        field3946 = arg2;
        field3938 = arg2;
        field3937 = 0;
        field3945 = 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(C)I")
    private final int method1652(char arg0) {
        return this.field3933[class56.method428(arg0, 51) & 0xFF];
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1653(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1654(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1670(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1661(arg0, arg1 - this.method1674(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1655(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1670(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1661(arg0, arg1 - this.method1674(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1656(String arg0, int arg1) {
        int var3 = this.method1663(arg0, new int[] { arg1 }, field3944);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1674(field3944[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1657(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1670(arg3, arg4);
            this.method1659(arg0, arg1 - this.method1674(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([B)V")
    private final void method1658(byte[] arg0) {
        this.field3933 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3933.length; var2++) {
                this.field3933[var2] = arg0[var2] & 0xFF;
            }
            this.field3929 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3933[var4] = arg0[var3++] & 0xFF;
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
        this.field3939 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3939[(var13 << 8) + var14] = (byte) method1653(var9, var11, var6, this.field3933, var5, var13, var14);
                    }
                }
            }
        }
        this.field3929 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method1659(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3929;
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
                                    int var11 = class57.method438(var10.substring(4), 47);
                                    class192 var12 = this.field3925[var11];
                                    int var13 = this.field3930 == null ? var12.field2980 : this.field3930[var11];
                                    if (field3938 == 256) {
                                        var12.method1296(arg1, this.field3929 + var4 - var13);
                                    } else {
                                        var12.method1290(arg1, this.field3929 + var4 - var13, field3938);
                                    }
                                    arg1 += var12.field2981;
                                    var6 = '\u0000';
                                } catch (Exception var18) {
                                }
                            } else {
                                this.method1668(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var14 = (char) (class56.method428(var9, 98) & 0xFF);
                    if (this.field3939 != null && var6 != '\u0000') {
                        arg1 += this.field3939[(var6 << 8) + var14];
                    }
                    int var15 = this.field3927[var14];
                    int var16 = this.field3940[var14];
                    if (var14 == ' ') {
                        if (field3937 > 0) {
                            field3945 += field3937;
                            arg1 += field3945 >> 8;
                            field3945 &= 0xFF;
                        }
                    } else if (field3938 == 256) {
                        if (field3934 != -1) {
                            this.method1678(var14, this.field3928[var14] + arg1 + 1, this.field3932[var14] + var4 + 1, var15, var16, field3934, true);
                        }
                        this.method1678(var14, this.field3928[var14] + arg1, this.field3932[var14] + var4, var15, var16, field3947, false);
                    } else {
                        if (field3934 != -1) {
                            this.method1677(var14, this.field3928[var14] + arg1 + 1, this.field3932[var14] + var4 + 1, var15, var16, field3934, field3938, true);
                        }
                        this.method1677(var14, this.field3928[var14] + arg1, this.field3932[var14] + var4, var15, var16, field3947, field3938, false);
                    }
                    int var17 = this.field3933[var14];
                    if (field3942 != -1) {
                        class211.method1412(arg1, (int) ((double) this.field3929 * 0.7D) + var4, var17, field3942);
                    }
                    if (field3936 != -1) {
                        class211.method1412(arg1, this.field3929 + var4 + 1, var17, field3936);
                    }
                    arg1 += var17;
                    var6 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([Lul;[I)V")
    public final void method1660(class192[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field3925 = arg0;
        this.field3930 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
    private final void method1661(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3929;
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
                                    int var16 = class57.method438(var13.substring(4), 47);
                                    class192 var17 = this.field3925[var16];
                                    int var18 = this.field3930 == null ? var17.field2980 : this.field3930[var16];
                                    if (field3938 == 256) {
                                        var17.method1296(arg1 + var14, this.field3929 + var6 - var18 + var15);
                                    } else {
                                        var17.method1290(arg1 + var14, this.field3929 + var6 - var18 + var15, field3938);
                                    }
                                    arg1 += var17.field2981;
                                    var8 = '\u0000';
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1668(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var19 = (char) (class56.method428(var12, 121) & 0xFF);
                    if (this.field3939 != null && var8 != '\u0000') {
                        arg1 += this.field3939[(var8 << 8) + var19];
                    }
                    int var20 = this.field3927[var19];
                    int var21 = this.field3940[var19];
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
                        if (field3937 > 0) {
                            field3945 += field3937;
                            arg1 += field3945 >> 8;
                            field3945 &= 0xFF;
                        }
                    } else if (field3938 == 256) {
                        if (field3934 != -1) {
                            this.method1678(var19, this.field3928[var19] + arg1 + var22 + 1, this.field3932[var19] + var6 + 1 + var23, var20, var21, field3934, true);
                        }
                        this.method1678(var19, this.field3928[var19] + arg1 + var22, this.field3932[var19] + var6 + var23, var20, var21, field3947, false);
                    } else {
                        if (field3934 != -1) {
                            this.method1677(var19, this.field3928[var19] + arg1 + var22 + 1, this.field3932[var19] + var6 + 1 + var23, var20, var21, field3934, field3938, true);
                        }
                        this.method1677(var19, this.field3928[var19] + arg1 + var22, this.field3932[var19] + var6 + var23, var20, var21, field3947, field3938, false);
                    }
                    int var24 = this.field3933[var19];
                    if (field3942 != -1) {
                        class211.method1412(arg1, (int) ((double) this.field3929 * 0.7D) + var6, var24, field3942);
                    }
                    if (field3936 != -1) {
                        class211.method1412(arg1, this.field3929 + var6, var24, field3936);
                    }
                    arg1 += var24;
                    var8 = var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
    public final int method1662(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1651(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1661(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public final int method1663(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class263.method1777(field3931, 0, ' ', 1);
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
                    field3931.append('<');
                    field3931.append(var15);
                    field3931.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field3931.toString().substring(var5, field3931.length());
                        var11++;
                        var5 = field3931.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1652('<');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1652('>');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1652(' ');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1652('\u00ad');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1652('×');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1652('€');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1652('©');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1652('®');
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class57.method438(var15.substring(4), 47);
                            var4 += this.field3925[var16].field2981;
                            var10 = '\u0000';
                        } catch (Exception var17) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field3931.append(var14);
                        var14 = (char) (class56.method428(var14, 40) & 0xFF);
                        var4 += this.field3933[var14];
                        if (this.field3939 != null && var10 != '\u0000') {
                            var4 += this.field3939[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field3931.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field3931.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field3931.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field3931.length() > var5) {
            arg2[var11] = field3931.toString().substring(var5, field3931.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
    public final int method1664(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1651(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field3935 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field3935 - this.field3926) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field3926;
        }
        if (arg7 == 1) {
            var19 = this.method1674(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1674(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1661(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1674(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field3935;
            arg11[2] = var19;
            arg11[3] = this.field3935 + this.field3926;
        }
        return var15;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method1665(String arg0, int arg1) {
        return this.method1663(arg0, new int[] { arg1 }, field3944);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1666(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1670(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8);
        }
        this.method1661(arg0, arg1 - this.method1674(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()V")
    public static void method1667() {
        field3931 = null;
        field3944 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method1668(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3947 = class47.method351(arg0.substring(4), 1, 16);
                return;
            }
            if (arg0.equals("/col")) {
                field3947 = field3941;
                return;
            }
            if (arg0.startsWith("trans=")) {
                field3938 = class57.method438(arg0.substring(6), 47);
                return;
            }
            if (arg0.equals("/trans")) {
                field3938 = field3946;
                return;
            }
            if (arg0.startsWith("str=")) {
                field3942 = class47.method351(arg0.substring(4), 1, 16);
                return;
            }
            if (arg0.equals("str")) {
                field3942 = 8388608;
                return;
            }
            if (arg0.equals("/str")) {
                field3942 = -1;
                return;
            }
            if (arg0.startsWith("u=")) {
                field3936 = class47.method351(arg0.substring(2), 1, 16);
                return;
            }
            if (arg0.equals("u")) {
                field3936 = 0;
                return;
            }
            if (arg0.equals("/u")) {
                field3936 = -1;
                return;
            }
            if (arg0.startsWith("shad=")) {
                field3934 = class47.method351(arg0.substring(5), 1, 16);
                return;
            }
            if (arg0.equals("shad")) {
                field3934 = 0;
                return;
            }
            if (arg0.equals("/shad")) {
                field3934 = field3943;
                return;
            }
            if (arg0.equals("br")) {
                this.method1651(field3941, field3943, field3946);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Ljava/lang/String;I)V")
    private final void method1669(String arg0, int arg1) {
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
            field3937 = (arg1 - this.method1674(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
    private final void method1670(int arg0, int arg1) {
        field3942 = -1;
        field3936 = -1;
        field3943 = arg1;
        field3934 = arg1;
        field3941 = arg0;
        field3947 = arg0;
        field3946 = 256;
        field3938 = 256;
        field3937 = 0;
        field3945 = 0;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1671(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1670(arg3, arg4);
            this.method1659(arg0, arg1 - this.method1674(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
    public final int method1672(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1651(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3929;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field3935 + this.field3926 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1663(arg0, var12, field3944);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3935 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3935 - this.field3926 - (var13 - 1) * arg10) / 2 + this.field3935 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field3926 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3935 - this.field3926 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3935 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1659(field3944[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1659(field3944[var16], arg1 + (arg3 - this.method1674(field3944[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1659(field3944[var16], arg1 + arg3 - this.method1674(field3944[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1659(field3944[var16], arg1, var14);
            } else {
                this.method1669(field3944[var16], arg3);
                this.method1659(field3944[var16], arg1, var14);
                field3937 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
    public final int method1673(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Ljava/lang/String;)I")
    public final int method1674(String arg0) {
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
                                    int var9 = class57.method438(var8.substring(4), 47);
                                    var4 += this.field3925[var9].field2981;
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
                    char var10 = (char) (class56.method428(var7, 52) & 0xFF);
                    var4 += this.field3933[var10];
                    if (this.field3939 != null && var3 != '\u0000') {
                        var4 += this.field3939[(var3 << 8) + var10];
                    }
                    var3 = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1675(String arg0) {
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

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
    public final void method1676(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1670(arg3, arg4);
            this.method1659(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method1678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([B[I[I[I[I)V")
    public class242(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field3928 = arg1;
        this.field3932 = arg2;
        this.field3927 = arg3;
        this.field3940 = arg4;
        this.method1658(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field3932[var8] < var6 && this.field3940[var8] != 0) {
                var6 = this.field3932[var8];
            }
            if (this.field3940[var8] + this.field3932[var8] > var7) {
                var7 = this.field3940[var8] + this.field3932[var8];
            }
        }
        this.field3935 = this.field3929 - var6;
        this.field3926 = var7 - this.field3929;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([B)V")
    public class242(byte[] arg0) {
        this.method1658(arg0);
    }
}
