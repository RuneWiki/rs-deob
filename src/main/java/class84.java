import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class84 extends class301 {

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public int field1450 = 0;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
    private int[] field1442;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "[I")
    private int[] field1441;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
    public int[] field1440;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[I")
    public int[] field1447;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field1445 = new StringBuffer(100);

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    private static int field1453 = -1;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    private static int field1452 = 256;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    private static int field1457 = 256;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    private static int field1455 = -1;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[Ljava/lang/String;")
    private static String[] field1459 = new String[100];

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    private static int field1460 = -1;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    private static int field1451 = -1;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    private static int field1461 = 0;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    private static int field1462 = 0;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    private static int field1458 = 0;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    private static int field1454 = 0;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "[B")
    private byte[] field1449;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[I")
    private int[] field1444;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
    private int[] field1456;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[Lob;")
    private class323[] field1443;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 6)
    public final void method619(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method635(arg3, arg4);
            this.method645(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 14)
    private static final int method620(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(C)I", line = 62)
    private final int method621(char arg0) {
        return this.field1444[class148.method1065(arg0, -1) & 0xFF];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 66)
    public static final String method622(String arg0) {
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Lob;[I)V", line = 115)
    public final void method624(class323[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field1443 = arg0;
        this.field1456 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V", line = 127)
    private final void method625(int arg0, int arg1, int arg2) {
        field1451 = -1;
        field1455 = -1;
        field1453 = arg1;
        field1460 = arg1;
        field1458 = arg0;
        field1454 = arg0;
        field1452 = arg2;
        field1457 = arg2;
        field1462 = 0;
        field1461 = 0;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 136)
    public final void method626(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method635(arg3, arg4);
            this.method645(arg0, arg1 - this.method636(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 148)
    public final int method627(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method625(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field1446 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field1446 - this.field1448) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field1448;
        }
        if (arg7 == 1) {
            var19 = this.method636(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method636(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method643(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method636(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field1446;
            arg11[2] = var19;
            arg11[3] = this.field1448 + this.field1446;
        }
        return var15;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 212)
    public final void method628(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method635(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method643(arg0, arg1 - this.method636(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 236)
    public final void method629(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method635(arg3, arg4);
            this.method645(arg0, arg1 - this.method636(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 243)
    public final int method630(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class73.method557(' ', (byte) -4, 0, field1445);
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
                    field1445.append('<');
                    field1445.append(var15);
                    field1445.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field1445.toString().substring(var5, field1445.length());
                        var11++;
                        var5 = field1445.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method621('<');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method621('>');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method621(' ');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method621('\u00ad');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method621('×');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method621('€');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method621('©');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method621('®');
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class86.method656(var15.substring(4), (byte) -110);
                            var4 += this.field1443[var16].field5239;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field1445.append(var14);
                        var14 = (char) (class148.method1065(var14, -1) & 0xFF);
                        var4 += this.field1444[var14];
                        if (this.field1449 != null && var10 != '\u0000') {
                            var4 += this.field1449[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field1445.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field1445.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field1445.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field1445.length() > var5) {
            arg2[var11] = field1445.toString().substring(var5, field1445.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 445)
    public static void method631() {
        field1445 = null;
        field1459 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 451)
    private final void method632(String arg0, int arg1) {
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
            field1462 = (arg1 - this.method636(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([B)V", line = 486)
    private final void method633(byte[] arg0) {
        this.field1444 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field1444.length; var2++) {
                this.field1444[var2] = arg0[var2] & 0xFF;
            }
            this.field1450 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field1444[var4] = arg0[var3++] & 0xFF;
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
        this.field1449 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field1449[(var17 << 8) + var18] = (byte) method620(var9, var13, var6, this.field1444, var5, var17, var18);
                    }
                }
            }
        }
        this.field1450 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 603)
    public final int method634(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method641(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 606)
    private final void method635(int arg0, int arg1) {
        field1451 = -1;
        field1455 = -1;
        field1453 = arg1;
        field1460 = arg1;
        field1458 = arg0;
        field1454 = arg0;
        field1452 = 256;
        field1457 = 256;
        field1462 = 0;
        field1461 = 0;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;)I", line = 616)
    public final int method636(String arg0) {
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
                                    int var9 = class86.method656(var8.substring(4), (byte) -86);
                                    var4 += this.field1443[var9].field5239;
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
                    char var11 = (char) (class148.method1065(var7, -1) & 0xFF);
                    var4 += this.field1444[var11];
                    if (this.field1449 != null && var3 != '\u0000') {
                        var4 += this.field1449[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 713)
    public final int method637(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = this.field1450;
        }
        int var4 = this.method630(arg0, new int[] { arg1 }, field1459);
        int var5 = (var4 - 1) * arg2;
        return this.field1446 + var5 + this.field1448;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 725)
    public final int method639(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method625(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method643(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 753)
    public final void method640(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method635(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method643(arg0, arg1 - this.method636(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 874)
    public class84(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field1442 = arg1;
        this.field1441 = arg2;
        this.field1440 = arg3;
        this.field1447 = arg4;
        this.method633(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field1441[var8] < var6 && this.field1447[var8] != 0) {
                var6 = this.field1441[var8];
            }
            if (this.field1447[var8] + this.field1441[var8] > var7) {
                var7 = this.field1447[var8] + this.field1441[var8];
            }
        }
        this.field1446 = this.field1450 - var6;
        this.field1448 = var7 - this.field1450;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V", line = 1088)
    public class84(byte[] arg0) {
        this.method633(arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 785)
    public final int method641(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method625(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field1450;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field1448 + this.field1446 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method630(arg0, var12, field1459);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field1446 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field1446 - this.field1448 - (var13 - 1) * arg10) / 2 + this.field1446 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field1448 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field1446 - this.field1448 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field1446 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method645(field1459[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method645(field1459[var16], arg1 + (arg3 - this.method636(field1459[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method645(field1459[var16], arg1 + arg3 - this.method636(field1459[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method645(field1459[var16], arg1, var14);
            } else {
                this.method632(field1459[var16], arg3);
                this.method645(field1459[var16], arg1, var14);
                field1462 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 866)
    public final int method642(String arg0, int arg1) {
        return this.method630(arg0, new int[] { arg1 }, field1459);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 906)
    private final void method643(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1450;
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
                                    int var16 = class86.method656(var13.substring(4), (byte) -120);
                                    class323 var17 = this.field1443[var16];
                                    int var18 = this.field1456 == null ? var17.field5228 : this.field1456[var16];
                                    if (field1457 == 256) {
                                        var17.method34(arg1 + var14, this.field1450 + var6 - var18 + var15);
                                    } else {
                                        var17.method32(arg1 + var14, this.field1450 + var6 - var18 + var15, field1457);
                                    }
                                    arg1 += var17.field5239;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method646(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class148.method1065(var12, -1) & 0xFF);
                    if (this.field1449 != null && var8 != '\u0000') {
                        arg1 += this.field1449[(var8 << 8) + var20];
                    }
                    int var21 = this.field1440[var20];
                    int var22 = this.field1447[var20];
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
                        if (field1462 > 0) {
                            field1461 += field1462;
                            arg1 += field1461 >> 8;
                            field1461 &= 0xFF;
                        }
                    } else if (field1457 == 256) {
                        if (field1460 != -1) {
                            this.method623(var20, this.field1442[var20] + arg1 + var23 + 1, this.field1441[var20] + var6 + 1 + var24, var21, var22, field1460, true);
                        }
                        this.method623(var20, this.field1442[var20] + arg1 + var23, this.field1441[var20] + var6 + var24, var21, var22, field1454, false);
                    } else {
                        if (field1460 != -1) {
                            this.method638(var20, this.field1442[var20] + arg1 + var23 + 1, this.field1441[var20] + var6 + 1 + var24, var21, var22, field1460, field1457, true);
                        }
                        this.method638(var20, this.field1442[var20] + arg1 + var23, this.field1441[var20] + var6 + var24, var21, var22, field1454, field1457, false);
                    }
                    int var25 = this.field1444[var20];
                    if (field1451 != -1) {
                        if (class241.field4016) {
                            class337.method2371(arg1, (int) ((double) this.field1450 * 0.7D) + var6, var25, field1451);
                        } else {
                            class270.method1897(arg1, (int) ((double) this.field1450 * 0.7D) + var6, var25, field1451);
                        }
                    }
                    if (field1455 != -1) {
                        if (class241.field4016) {
                            class337.method2371(arg1, this.field1450 + var6, var25, field1455);
                        } else {
                            class270.method1897(arg1, this.field1450 + var6, var25, field1455);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1092)
    public final void method644(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method635(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method643(arg0, arg1 - this.method636(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;II)V", line = 1119)
    private final void method645(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1450;
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
                                    int var11 = class86.method656(var10.substring(4), (byte) -50);
                                    class323 var12 = this.field1443[var11];
                                    int var13 = this.field1456 == null ? var12.field5228 : this.field1456[var11];
                                    if (field1457 == 256) {
                                        var12.method34(arg1, this.field1450 + var4 - var13);
                                    } else {
                                        var12.method32(arg1, this.field1450 + var4 - var13, field1457);
                                    }
                                    arg1 += var12.field5239;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method646(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class148.method1065(var9, -1) & 0xFF);
                    if (this.field1449 != null && var6 != '\u0000') {
                        arg1 += this.field1449[(var6 << 8) + var15];
                    }
                    int var16 = this.field1440[var15];
                    int var17 = this.field1447[var15];
                    if (var15 == ' ') {
                        if (field1462 > 0) {
                            field1461 += field1462;
                            arg1 += field1461 >> 8;
                            field1461 &= 0xFF;
                        }
                    } else if (field1457 == 256) {
                        if (field1460 != -1) {
                            this.method623(var15, this.field1442[var15] + arg1 + 1, this.field1441[var15] + var4 + 1, var16, var17, field1460, true);
                        }
                        this.method623(var15, this.field1442[var15] + arg1, this.field1441[var15] + var4, var16, var17, field1454, false);
                    } else {
                        if (field1460 != -1) {
                            this.method638(var15, this.field1442[var15] + arg1 + 1, this.field1441[var15] + var4 + 1, var16, var17, field1460, field1457, true);
                        }
                        this.method638(var15, this.field1442[var15] + arg1, this.field1441[var15] + var4, var16, var17, field1454, field1457, false);
                    }
                    int var18 = this.field1444[var15];
                    if (field1451 != -1) {
                        if (class241.field4016) {
                            class337.method2371(arg1, (int) ((double) this.field1450 * 0.7D) + var4, var18, field1451);
                        } else {
                            class270.method1897(arg1, (int) ((double) this.field1450 * 0.7D) + var4, var18, field1451);
                        }
                    }
                    if (field1455 != -1) {
                        if (class241.field4016) {
                            class337.method2371(arg1, this.field1450 + var4 + 1, var18, field1455);
                        } else {
                            class270.method1897(arg1, this.field1450 + var4 + 1, var18, field1455);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Ljava/lang/String;)V", line = 1285)
    private final void method646(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field1454 = class207.method1436(16, 0, arg0.substring(4));
            } else if (arg0.equals("/col")) {
                field1454 = field1458;
            } else if (arg0.startsWith("trans=")) {
                field1457 = class86.method656(arg0.substring(6), (byte) -107);
            } else if (arg0.equals("/trans")) {
                field1457 = field1452;
            } else if (arg0.startsWith("str=")) {
                field1451 = class207.method1436(16, 0, arg0.substring(4));
            } else if (arg0.equals("str")) {
                field1451 = 8388608;
            } else if (arg0.equals("/str")) {
                field1451 = -1;
            } else if (arg0.startsWith("u=")) {
                field1455 = class207.method1436(16, 0, arg0.substring(2));
            } else if (arg0.equals("u")) {
                field1455 = 0;
            } else if (arg0.equals("/u")) {
                field1455 = -1;
            } else if (arg0.startsWith("shad=")) {
                field1460 = class207.method1436(16, 0, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                field1460 = 0;
            } else if (arg0.equals("/shad")) {
                field1460 = field1453;
            } else if (arg0.equals("br")) {
                this.method625(field1458, field1453, field1452);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1360)
    public final int method647(String arg0, int arg1) {
        int var3 = this.method630(arg0, new int[] { arg1 }, field1459);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method636(field1459[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);
}
