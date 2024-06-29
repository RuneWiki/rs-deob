import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class171 extends class172 {

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public int field2725 = 0;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "[I")
    private int[] field2717;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "[I")
    private int[] field2730;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "[I")
    public int[] field2722;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "[I")
    public int[] field2718;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    private int field2719;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Ljava/lang/StringBuffer;")
    private static StringBuffer field2723 = new StringBuffer(100);

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    private static int field2728 = 0;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[Ljava/lang/String;")
    private static String[] field2727 = new String[100];

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    private static int field2732 = 256;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    private static int field2735 = 0;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    private static int field2731 = 0;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    private static int field2738 = -1;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    private static int field2729 = -1;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    private static int field2736 = -1;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    private static int field2737 = 256;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    private static int field2734 = -1;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    private static int field2739 = 0;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "[B")
    private byte[] field2726;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "[I")
    private int[] field2720;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "[I")
    private int[] field2724;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "[Lem;")
    private class285[] field2733;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V", line = 4)
    private final void method1322(byte[] arg0) {
        this.field2720 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2720.length; var2++) {
                this.field2720[var2] = arg0[var2] & 0xFF;
            }
            this.field2725 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2720[var4] = arg0[var3++] & 0xFF;
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
        this.field2726 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2726[(var17 << 8) + var18] = (byte) method1333(var9, var13, var6, this.field2720, var5, var17, var18);
                    }
                }
            }
        }
        this.field2725 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 123)
    public static void method1323() {
        field2723 = null;
        field2727 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 129)
    public final void method1324(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1327(arg3, arg4);
            this.method1339(arg0, arg1 - this.method1338(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(C)I", line = 139)
    private final int method1325(char arg0) {
        return this.field2720[class162.method1258(arg0, -8226) & 0xFF];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I", line = 142)
    public final int method1326(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        this.method1334(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
        int var18 = this.field2721 + arg2;
        int var19 = -1;
        if (arg8 == 1) {
            var18 += (arg4 - this.field2721 - this.field2719) / 2;
        } else if (arg8 == 2) {
            var18 = arg2 + arg4 - this.field2719;
        }
        if (arg7 == 1) {
            var19 = this.method1338(arg0) + var15;
            var17 = (arg3 - var19) / 2 + arg1;
        } else if (arg7 == 2) {
            var19 = this.method1338(arg0) + var15;
            var17 = arg3 + arg1 - var19;
        }
        this.method1342(arg0, var17, var18, var14, (int[]) null);
        if (arg11 != null) {
            if (var19 == -1) {
                var19 = this.method1338(arg0) + var15;
            }
            arg11[0] = var17;
            arg11[1] = var18 - this.field2721;
            arg11[2] = var19;
            arg11[3] = this.field2721 + this.field2719;
        }
        return var15;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 206)
    private final void method1327(int arg0, int arg1) {
        field2729 = -1;
        field2734 = -1;
        field2736 = arg1;
        field2738 = arg1;
        field2728 = arg0;
        field2731 = arg0;
        field2737 = 256;
        field2732 = 256;
        field2735 = 0;
        field2739 = 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ljava/lang/String;IIII)V", line = 217)
    public final void method1328(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1327(arg3, arg4);
            this.method1339(arg0, arg1 - this.method1338(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 227)
    public final void method1329(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1327(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method1342(arg0, arg1 - this.method1338(arg0) / 2, arg2, var8, var9);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 251)
    public final int method1330(String arg0, int arg1) {
        int var3 = this.method1343(arg0, new int[] { arg1 }, field2727);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1338(field2727[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([Lem;[I)V", line = 275)
    public final void method1331(class285[] arg0, int[] arg1) {
        if (arg1 != null && arg0.length != arg1.length) {
            throw new IllegalArgumentException();
        }
        this.field2733 = arg0;
        this.field2724 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Ljava/lang/String;IIII)V", line = 288)
    public final void method1332(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1327(arg3, arg4);
            this.method1339(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 296)
    private static final int method1333(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V", line = 342)
    private final void method1334(int arg0, int arg1, int arg2) {
        field2729 = -1;
        field2734 = -1;
        field2736 = arg1;
        field2738 = arg1;
        field2728 = arg0;
        field2731 = arg0;
        field2737 = arg2;
        field2732 = arg2;
        field2735 = 0;
        field2739 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;)V", line = 352)
    private final void method1335(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2731 = class352.method2484(arg0.substring(4), -99999999, 16);
            } else if (arg0.equals("/col")) {
                field2731 = field2728;
            } else if (arg0.startsWith("trans=")) {
                field2732 = class130.method996(arg0.substring(6), 30958);
            } else if (arg0.equals("/trans")) {
                field2732 = field2737;
            } else if (arg0.startsWith("str=")) {
                field2729 = class352.method2484(arg0.substring(4), -99999999, 16);
            } else if (arg0.equals("str")) {
                field2729 = 8388608;
            } else if (arg0.equals("/str")) {
                field2729 = -1;
            } else if (arg0.startsWith("u=")) {
                field2734 = class352.method2484(arg0.substring(2), -99999999, 16);
            } else if (arg0.equals("u")) {
                field2734 = 0;
            } else if (arg0.equals("/u")) {
                field2734 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2738 = class352.method2484(arg0.substring(5), -99999999, 16);
            } else if (arg0.equals("shad")) {
                field2738 = 0;
            } else if (arg0.equals("/shad")) {
                field2738 = field2736;
            } else if (arg0.equals("br")) {
                this.method1334(field2728, field2736, field2737);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 414)
    public final int method1336(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = this.field2725;
        }
        int var4 = this.method1343(arg0, new int[] { arg1 }, field2727);
        int var5 = (var4 - 1) * arg2;
        return this.field2721 + var5 + this.field2719;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 427)
    private final void method1337(String arg0, int arg1) {
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
            field2735 = (arg1 - this.method1338(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ljava/lang/String;)I", line = 459)
    public final int method1338(String arg0) {
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
                                    int var9 = class130.method996(var8.substring(4), 30958);
                                    var4 += this.field2733[var9].field4642;
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
                    char var11 = (char) (class162.method1258(var7, -8226) & 0xFF);
                    var4 += this.field2720[var11];
                    if (this.field2726 != null && var3 != '\u0000') {
                        var4 += this.field2726[(var3 << 8) + var11];
                    }
                    var3 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ljava/lang/String;II)V", line = 555)
    private final void method1339(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2725;
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
                                    int var11 = class130.method996(var10.substring(4), 30958);
                                    class285 var12 = this.field2733[var11];
                                    int var13 = this.field2724 == null ? var12.field4644 : this.field2724[var11];
                                    if (field2732 == 256) {
                                        var12.method2015(arg1, this.field2725 + var4 - var13);
                                    } else {
                                        var12.method2014(arg1, this.field2725 + var4 - var13, field2732);
                                    }
                                    arg1 += var12.field4642;
                                    var6 = '\u0000';
                                } catch (Exception var19) {
                                }
                            } else {
                                this.method1335(var10);
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var5 == -1) {
                    char var15 = (char) (class162.method1258(var9, -8226) & 0xFF);
                    if (this.field2726 != null && var6 != '\u0000') {
                        arg1 += this.field2726[(var6 << 8) + var15];
                    }
                    int var16 = this.field2722[var15];
                    int var17 = this.field2718[var15];
                    if (var15 == ' ') {
                        if (field2735 > 0) {
                            field2739 += field2735;
                            arg1 += field2739 >> 8;
                            field2739 &= 0xFF;
                        }
                    } else if (field2732 == 256) {
                        if (field2738 != -1) {
                            this.method751(var15, this.field2717[var15] + arg1 + 1, this.field2730[var15] + var4 + 1, var16, var17, field2738, true);
                        }
                        this.method751(var15, this.field2717[var15] + arg1, this.field2730[var15] + var4, var16, var17, field2731, false);
                    } else {
                        if (field2738 != -1) {
                            this.method753(var15, this.field2717[var15] + arg1 + 1, this.field2730[var15] + var4 + 1, var16, var17, field2738, field2732, true);
                        }
                        this.method753(var15, this.field2717[var15] + arg1, this.field2730[var15] + var4, var16, var17, field2731, field2732, false);
                    }
                    int var18 = this.field2720[var15];
                    if (field2729 != -1) {
                        if (class42.field607) {
                            class244.method1856(arg1, (int) ((double) this.field2725 * 0.7D) + var4, var18, field2729);
                        } else {
                            class246.method1891(arg1, (int) ((double) this.field2725 * 0.7D) + var4, var18, field2729);
                        }
                    }
                    if (field2734 != -1) {
                        if (class42.field607) {
                            class244.method1856(arg1, this.field2725 + var4 + 1, var18, field2734);
                        } else {
                            class246.method1891(arg1, this.field2725 + var4 + 1, var18, field2734);
                        }
                    }
                    arg1 += var18;
                    var6 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I", line = 710)
    public final int method1340(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1345(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 713)
    public final void method1341(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1327(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method1342(arg0, arg1 - this.method1338(arg0) / 2, arg2, (int[]) null, var11);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V", line = 736)
    private final void method1342(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2725;
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
                                    int var16 = class130.method996(var13.substring(4), 30958);
                                    class285 var17 = this.field2733[var16];
                                    int var18 = this.field2724 == null ? var17.field4644 : this.field2724[var16];
                                    if (field2732 == 256) {
                                        var17.method2015(arg1 + var14, this.field2725 + var6 - var18 + var15);
                                    } else {
                                        var17.method2014(arg1 + var14, this.field2725 + var6 - var18 + var15, field2732);
                                    }
                                    arg1 += var17.field4642;
                                    var8 = '\u0000';
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method1335(var13);
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var7 == -1) {
                    char var20 = (char) (class162.method1258(var12, -8226) & 0xFF);
                    if (this.field2726 != null && var8 != '\u0000') {
                        arg1 += this.field2726[(var8 << 8) + var20];
                    }
                    int var21 = this.field2722[var20];
                    int var22 = this.field2718[var20];
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
                        if (field2735 > 0) {
                            field2739 += field2735;
                            arg1 += field2739 >> 8;
                            field2739 &= 0xFF;
                        }
                    } else if (field2732 == 256) {
                        if (field2738 != -1) {
                            this.method751(var20, this.field2717[var20] + arg1 + var23 + 1, this.field2730[var20] + var6 + 1 + var24, var21, var22, field2738, true);
                        }
                        this.method751(var20, this.field2717[var20] + arg1 + var23, this.field2730[var20] + var6 + var24, var21, var22, field2731, false);
                    } else {
                        if (field2738 != -1) {
                            this.method753(var20, this.field2717[var20] + arg1 + var23 + 1, this.field2730[var20] + var6 + 1 + var24, var21, var22, field2738, field2732, true);
                        }
                        this.method753(var20, this.field2717[var20] + arg1 + var23, this.field2730[var20] + var6 + var24, var21, var22, field2731, field2732, false);
                    }
                    int var25 = this.field2720[var20];
                    if (field2729 != -1) {
                        if (class42.field607) {
                            class244.method1856(arg1, (int) ((double) this.field2725 * 0.7D) + var6, var25, field2729);
                        } else {
                            class246.method1891(arg1, (int) ((double) this.field2725 * 0.7D) + var6, var25, field2729);
                        }
                    }
                    if (field2734 != -1) {
                        if (class42.field607) {
                            class244.method1856(arg1, this.field2725 + var6, var25, field2734);
                        } else {
                            class246.method1891(arg1, this.field2725 + var6, var25, field2734);
                        }
                    }
                    arg1 += var25;
                    var8 = var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I", line = 920)
    public final int method1343(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        class258.method1976(' ', 0, field2723, (byte) -117);
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
                    field2723.append('<');
                    field2723.append(var15);
                    field2723.append('>');
                    if (var15.equals("br")) {
                        arg2[var11] = field2723.toString().substring(var5, field2723.length());
                        var11++;
                        var5 = field2723.length();
                        var4 = 0;
                        var6 = -1;
                        var10 = '\u0000';
                    } else if (var15.equals("lt")) {
                        var4 += this.method1325('<');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 60];
                        }
                        var10 = '<';
                    } else if (var15.equals("gt")) {
                        var4 += this.method1325('>');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 62];
                        }
                        var10 = '>';
                    } else if (var15.equals("nbsp")) {
                        var4 += this.method1325(' ');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 160];
                        }
                        var10 = ' ';
                    } else if (var15.equals("shy")) {
                        var4 += this.method1325('\u00ad');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 173];
                        }
                        var10 = '\u00AD';
                    } else if (var15.equals("times")) {
                        var4 += this.method1325('×');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 215];
                        }
                        var10 = '×';
                    } else if (var15.equals("euro")) {
                        var4 += this.method1325('€');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 128];
                        }
                        var10 = '€';
                    } else if (var15.equals("copy")) {
                        var4 += this.method1325('©');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 169];
                        }
                        var10 = '©';
                    } else if (var15.equals("reg")) {
                        var4 += this.method1325('®');
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + 174];
                        }
                        var10 = '®';
                    } else if (var15.startsWith("img=")) {
                        try {
                            int var16 = class130.method996(var15.substring(4), 30958);
                            var4 += this.field2733[var16].field4642;
                            var10 = '\u0000';
                        } catch (Exception var18) {
                        }
                    }
                    var14 = '\u0000';
                }
                if (var9 == -1) {
                    if (var14 != '\u0000') {
                        field2723.append(var14);
                        var14 = (char) (class162.method1258(var14, -8226) & 0xFF);
                        var4 += this.field2720[var14];
                        if (this.field2726 != null && var10 != '\u0000') {
                            var4 += this.field2726[(var10 << 8) + var14];
                        }
                        var10 = var14;
                    }
                    if (var14 == ' ') {
                        var6 = field2723.length();
                        var7 = var4;
                        var8 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var6 >= 0) {
                        arg2[var11] = field2723.toString().substring(var5, var6 - var8);
                        var11++;
                        var5 = var6;
                        var6 = -1;
                        var4 -= var7;
                        var10 = '\u0000';
                    }
                    if (var14 == '-') {
                        var6 = field2723.length();
                        var7 = var4;
                        var8 = 0;
                    }
                }
            }
        }
        if (field2723.length() > var5) {
            arg2[var11] = field2723.toString().substring(var5, field2723.length());
            var11++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B[I[I[I[I)V", line = 1283)
    public class171(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        this.field2717 = arg1;
        this.field2730 = arg2;
        this.field2722 = arg3;
        this.field2718 = arg4;
        this.method1322(arg0);
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        for (int var8 = 0; var8 < 256; var8++) {
            if (this.field2730[var8] < var6 && this.field2718[var8] != 0) {
                var6 = this.field2730[var8];
            }
            if (this.field2730[var8] + this.field2718[var8] > var7) {
                var7 = this.field2730[var8] + this.field2718[var8];
            }
        }
        this.field2721 = this.field2725 - var6;
        this.field2719 = var7 - this.field2725;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V", line = 1317)
    public class171(byte[] arg0) {
        this.method1322(arg0);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 1134)
    public final int method1344(String arg0, int arg1) {
        return this.method1343(arg0, new int[] { arg1 }, field2727);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I", line = 1137)
    public final int method1345(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1334(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field2725;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field2721 + this.field2719 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1343(arg0, var12, field2727);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field2721 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field2721 - this.field2719 - (var13 - 1) * arg10) / 2 + this.field2721 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field2719 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field2721 - this.field2719 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field2721 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1339(field2727[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1339(field2727[var16], arg1 + (arg3 - this.method1338(field2727[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1339(field2727[var16], arg1 + arg3 - this.method1338(field2727[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1339(field2727[var16], arg1, var14);
            } else {
                this.method1337(field2727[var16], arg3);
                this.method1339(field2727[var16], arg1, var14);
                field2735 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 1217)
    public final void method1346(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1327(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method1342(arg0, arg1 - this.method1338(arg0) / 2, arg2, (int[]) null, var8);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I", line = 1240)
    public final int method1347(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1334(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = var10;
            if ((arg5.nextInt() & 0x3) == 0) {
                var10++;
            }
        }
        this.method1342(arg0, arg1, arg2, var9, (int[]) null);
        return var10;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1325)
    public static final String method1348(String arg0) {
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

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIZ)V")
    public abstract void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIZ)V")
    public abstract void method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
