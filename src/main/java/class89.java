import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class89 extends class196 {

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public int field1318 = 0;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "[I")
    private int[] field1315;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "[I")
    private int[] field1334;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "[I")
    public int[] field1326;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[I")
    public int[] field1316;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field1317 = new StringBuffer(100);

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    private static int field1319 = 256;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    private static int field1322 = 0;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private static int field1324 = 0;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    private static int field1330 = 0;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    private static int field1327 = 256;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    private static int field1333 = -1;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "[Ljava/lang/String;")
    private static String[] field1328 = new String[100];

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    private static int field1336 = -1;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    private static int field1332 = -1;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    private static int field1337 = -1;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    private static int field1323 = 0;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[B")
    private byte[] field1320;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "[I")
    private int[] field1325;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "[I")
    private int[] field1335;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "[Lbk;")
    private class157[] field1321;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 5)
    public static final String method610(String arg0) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 46)
    private final void method611(String arg0, int arg1) {
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
            field1323 = (arg1 - this.method632(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 77)
    public static void method612() {
        field1317 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 81)
    public final int method613(String arg0, int arg1) {
        return this.method629(arg0, new int[] { arg1 }, field1328);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 92)
    public final int method614(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method634(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 95)
    public final int method615(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method628(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field1331 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field1331 - this.field1329) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field1329;
        }
        if (arg7 == 1) {
            var19 = this.method632(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method632(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method619(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method632(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field1331;
            arg11[2] = var19;
            arg11[3] = this.field1331 + this.field1329;
        }
        return var15;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 161)
    private static final int method616(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 212)
    public final void method617(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method618(arg3, arg4);
            this.method635(arg0, arg1 - this.method632(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 219)
    private final void method618(int arg0, int arg1) {
        field1333 = -1;
        field1332 = -1;
        field1336 = arg1;
        field1337 = arg1;
        field1330 = arg0;
        field1322 = arg0;
        field1327 = 256;
        field1319 = 256;
        field1323 = 0;
        field1324 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 228)
    private final void method619(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1318;
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
                                    int var16 = class286.method1991(-126, var13.substring(4));
                                    class157 var17 = this.field1321[var16];
                                    int var18 = this.field1325 == null ? var17.field2360 : this.field1325[var16];
                                    if (field1319 == 256) {
                                        var17.method396(arg1 + var14, this.field1318 + var6 - var18 + var15);
                                    } else {
                                        var17.method397(arg1 + var14, this.field1318 + var6 - var18 + var15, field1319);
                                    }
                                    arg1 += var17.field2361;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method623(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class67.method450(-74, var12) & 0xFF);
                    if (this.field1320 != null && var8 != '\u0000') {
                        arg1 += this.field1320[(var8 << 8) + var20];
                    }
                    int var21 = this.field1326[var20];
                    int var22 = this.field1316[var20];
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
                        if (field1323 > 0) {
                            field1324 += field1323;
                            arg1 += field1324 >> 8;
                            field1324 &= 0xFF;
                        }
                    } else if (field1319 == 256) {
                        if (field1337 != -1) {
                            this.method173(var20, this.field1315[var20] + arg1 + var23 + 1, this.field1334[var20] + var6 + 1 + var24, var21, var22, field1337, true);
                        }
                        this.method173(var20, this.field1315[var20] + arg1 + var23, this.field1334[var20] + var6 + var24, var21, var22, field1322, false);
                    } else {
                        if (field1337 != -1) {
                            this.method175(var20, this.field1315[var20] + arg1 + var23 + 1, this.field1334[var20] + var6 + 1 + var24, var21, var22, field1337, field1319, true);
                        }
                        this.method175(var20, this.field1315[var20] + arg1 + var23, this.field1334[var20] + var6 + var24, var21, var22, field1322, field1319, false);
                    }
                    int var25 = this.field1335[var20];
                    if (field1333 != -1) {
                        if (class117.field1817) {
                            class308.method2135(arg1, (int) ((double) this.field1318 * 0.7D) + var6, var25, field1333);
                        } else {
                            class46.method313(arg1, (int) ((double) this.field1318 * 0.7D) + var6, var25, field1333);
                        }
                    }
                    if (field1332 != -1) {
                        if (class117.field1817) {
                            class308.method2135(arg1, this.field1318 + var6, var25, field1332);
                        } else {
                            class46.method313(arg1, this.field1318 + var6, var25, field1332);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 412)
    public final void method620(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method618(arg3, arg4);
            this.method635(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lbk;[I)V", line = 420)
    public final void method621(class157[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field1321 = arg0;
        this.field1325 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(C)I", line = 432)
    private final int method622(char arg0) {
        return this.field1335[class67.method450(-82, arg0) & 0xFF];
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Ljava/lang/String;)V", line = 436)
    private final void method623(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field1322 = class196.method1352((byte) 125, 16, arg0.substring(4));
            } else if (arg0.equals("/col")) {
                field1322 = field1330;
            } else if (arg0.startsWith("trans=")) {
                field1319 = class286.method1991(-81, arg0.substring(6));
            } else if (arg0.equals("/trans")) {
                field1319 = field1327;
            } else if (arg0.startsWith("str=")) {
                field1333 = class196.method1352((byte) 127, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                field1333 = 8388608;
            } else if (arg0.equals("/str")) {
                field1333 = -1;
            } else if (arg0.startsWith("u=")) {
                field1332 = class196.method1352((byte) 127, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                field1332 = 0;
            } else if (arg0.equals("/u")) {
                field1332 = -1;
            } else if (arg0.startsWith("shad=")) {
                field1337 = class196.method1352((byte) 127, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                field1337 = 0;
            } else if (arg0.equals("/shad")) {
                field1337 = field1336;
            } else if (arg0.equals("br")) {
                this.method628(field1330, field1336, field1327);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 498)
    public final void method624(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method618(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method619(arg0, arg1 - this.method632(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 522)
    public final int method625(String arg0, int arg1) {
        int var3 = this.method629(arg0, new int[] { arg1 }, field1328);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method632(field1328[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([B)V", line = 546)
    private final void method626(byte[] arg0) {
        this.field1335 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field1335.length; var2++) {
                this.field1335[var2] = arg0[var2] & 0xFF;
            }
            this.field1318 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field1335[var4] = arg0[var3++] & 0xFF;
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
        this.field1320 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field1320[(var17 << 8) + var18] = (byte) method616(var9, var13, var6, this.field1335, var5, var17, var18);
                    }
                }
            }
        }
        this.field1318 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 663)
    public final void method627(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method618(arg3, arg4);
            this.method635(arg0, arg1 - this.method632(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1329)
    public class89(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field1315 = arg1;
        this.field1334 = arg2;
        this.field1326 = arg3;
        this.field1316 = arg4;
        this.method626(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field1334[var8] < var6 && this.field1316[var8] != 0) {
                var6 = this.field1334[var8];
            }
            if (this.field1334[var8] + this.field1316[var8] > var7) {
                var7 = this.field1334[var8] + this.field1316[var8];
            }
        }
        this.field1331 = this.field1318 - var6;
        this.field1329 = var7 - this.field1318;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V", line = 1360)
    public class89(byte[] arg0) {
        this.method626(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V", line = 693)
    private final void method628(int arg0, int arg1, int arg2) {
        field1333 = -1;
        field1332 = -1;
        field1336 = arg1;
        field1337 = arg1;
        field1330 = arg0;
        field1322 = arg0;
        field1327 = arg2;
        field1319 = arg2;
        field1323 = 0;
        field1324 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 709)
    public final int method629(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class7.method18((byte) -17, field1317, ' ', 0);
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
                    field1317.append('<');
                    field1317.append(var15);
                    field1317.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field1317.toString().substring(var5, field1317.length());
                        var11++;
                        var5 = field1317.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method622('<');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method622('>');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method622(' ');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method622('\u00ad');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method622('×');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method622('€');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method622('©');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method622('®');
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class286.method1991(-84, var15.substring(4));
                            var4 += this.field1321[var16].field2361;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field1317.append(var14);
                        var14 = (char) (class67.method450(-111, var14) & 0xFF);
                        var4 += this.field1335[var14];
                        if (this.field1320 != null && var10 != '\u0000') {
                            var4 += this.field1320[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field1317.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field1317.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field1317.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field1317.length() > var5) {
            arg2[var11] = field1317.toString().substring(var5, field1317.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 910)
    public final void method630(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method618(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method619(arg0, arg1 - this.method632(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 930)
    public final void method631(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method618(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method619(arg0, arg1 - this.method632(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Ljava/lang/String;)I", line = 957)
    public final int method632(String arg0) {
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
                                    int var9 = class286.method1991(-94, var8.substring(4));
                                    var4 += this.field1321[var9].field2361;
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
                    char var11 = (char) (class67.method450(-62, var7) & 0xFF);
                    var4 += this.field1335[var11];
                    if (this.field1320 != null && var3 != '\u0000') {
                        var4 += this.field1320[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 1056)
    public final int method633(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method628(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method619(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 1096)
    public final int method634(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method628(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field1318;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field1331 + this.field1329 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method629(arg0, var12, field1328);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field1331 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field1331 - this.field1329 - (var13 - 1) * arg10) / 2 + this.field1331 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field1329 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field1331 - this.field1329 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field1331 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method635(field1328[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method635(field1328[var16], arg1 + (arg3 - this.method632(field1328[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method635(field1328[var16], arg1 + arg3 - this.method632(field1328[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method635(field1328[var16], arg1, var14);
            } else {
                this.method611(field1328[var16], arg3);
                this.method635(field1328[var16], arg1, var14);
                field1323 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 1171)
    private final void method635(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1318;
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
                                    int var11 = class286.method1991(-79, var10.substring(4));
                                    class157 var12 = this.field1321[var11];
                                    int var13 = this.field1325 == null ? var12.field2360 : this.field1325[var11];
                                    if (field1319 == 256) {
                                        var12.method396(arg1, this.field1318 + var4 - var13);
                                    } else {
                                        var12.method397(arg1, this.field1318 + var4 - var13, field1319);
                                    }
                                    arg1 += var12.field2361;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method623(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class67.method450(-89, var9) & 0xFF);
                    if (this.field1320 != null && var6 != '\u0000') {
                        arg1 += this.field1320[(var6 << 8) + var15];
                    }
                    int var16 = this.field1326[var15];
                    int var17 = this.field1316[var15];
                    if (var15 == ' ') {
                        if (field1323 > 0) {
                            field1324 += field1323;
                            arg1 += field1324 >> 8;
                            field1324 &= 0xFF;
                        }
                    } else if (field1319 == 256) {
                        if (field1337 != -1) {
                            this.method173(var15, this.field1315[var15] + arg1 + 1, this.field1334[var15] + var4 + 1, var16, var17, field1337, true);
                        }
                        this.method173(var15, this.field1315[var15] + arg1, this.field1334[var15] + var4, var16, var17, field1322, false);
                    } else {
                        if (field1337 != -1) {
                            this.method175(var15, this.field1315[var15] + arg1 + 1, this.field1334[var15] + var4 + 1, var16, var17, field1337, field1319, true);
                        }
                        this.method175(var15, this.field1315[var15] + arg1, this.field1334[var15] + var4, var16, var17, field1322, field1319, false);
                    }
                    int var18 = this.field1335[var15];
                    if (field1333 != -1) {
                        if (class117.field1817) {
                            class308.method2135(arg1, (int) ((double) this.field1318 * 0.7D) + var4, var18, field1333);
                        } else {
                            class46.method313(arg1, (int) ((double) this.field1318 * 0.7D) + var4, var18, field1333);
                        }
                    }
                    if (field1332 != -1) {
                        if (class117.field1817) {
                            class308.method2135(arg1, this.field1318 + var4 + 1, var18, field1332);
                        } else {
                            class46.method313(arg1, this.field1318 + var4 + 1, var18, field1332);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
