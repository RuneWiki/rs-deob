import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LJNJPDAK")
public class class33 {

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "Z")
    private static boolean field1103 = true;

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "I")
    private static int field1104 = 21302;

    @OriginalMember(owner = "client!LJNJPDAK", name = "e", descriptor = "I")
    private static int field1107 = 4;

    @OriginalMember(owner = "client!LJNJPDAK", name = "g", descriptor = "I")
    private static int field1109 = 2;

    @OriginalMember(owner = "client!LJNJPDAK", name = "h", descriptor = "I")
    private static int field1110 = 2;

    @OriginalMember(owner = "client!LJNJPDAK", name = "i", descriptor = "Z")
    private static boolean field1111 = true;

    @OriginalMember(owner = "client!LJNJPDAK", name = "j", descriptor = "I")
    private static int field1112 = -549;

    @OriginalMember(owner = "client!LJNJPDAK", name = "k", descriptor = "I")
    private static int field1113 = -549;

    @OriginalMember(owner = "client!LJNJPDAK", name = "l", descriptor = "I")
    private static int field1114 = -89;

    @OriginalMember(owner = "client!LJNJPDAK", name = "m", descriptor = "Z")
    private static boolean field1115 = true;

    @OriginalMember(owner = "client!LJNJPDAK", name = "u", descriptor = "[Ljava/lang/String;")
    private static final String[] field1123 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!LJNJPDAK", name = "f", descriptor = "I")
    private static int field1108;

    @OriginalMember(owner = "client!LJNJPDAK", name = "n", descriptor = "I")
    private static int field1116;

    @OriginalMember(owner = "client!LJNJPDAK", name = "c", descriptor = "Z")
    private static boolean field1105;

    @OriginalMember(owner = "client!LJNJPDAK", name = "d", descriptor = "Z")
    private static boolean field1106;

    @OriginalMember(owner = "client!LJNJPDAK", name = "v", descriptor = "Z")
    public static boolean field1124;

    @OriginalMember(owner = "client!LJNJPDAK", name = "o", descriptor = "[I")
    private static int[] field1117;

    @OriginalMember(owner = "client!LJNJPDAK", name = "t", descriptor = "[I")
    private static int[] field1122;

    @OriginalMember(owner = "client!LJNJPDAK", name = "p", descriptor = "[[C")
    private static char[][] field1118;

    @OriginalMember(owner = "client!LJNJPDAK", name = "r", descriptor = "[[C")
    private static char[][] field1120;

    @OriginalMember(owner = "client!LJNJPDAK", name = "s", descriptor = "[[C")
    private static char[][] field1121;

    @OriginalMember(owner = "client!LJNJPDAK", name = "q", descriptor = "[[[B")
    private static byte[][][] field1119;

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(LNXFIIFAD;)V")
    public static final void method318(class41 arg0) {
        class37 var1 = new class37(arg0.method431("fragmentsenc.txt", null), -670);
        class37 var2 = new class37(arg0.method431("badenc.txt", null), -670);
        class37 var3 = new class37(arg0.method431("domainenc.txt", null), -670);
        class37 var4 = new class37(arg0.method431("tldlist.txt", null), -670);
        method319(var1, var2, var3, var4);
        if (class3.field51) {
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(LMNKDCXXG;LMNKDCXXG;LMNKDCXXG;LMNKDCXXG;)V")
    private static final void method319(class37 arg0, class37 arg1, class37 arg2, class37 arg3) {
        method321(field1105, arg1);
        method322(arg2, 949);
        method323(false, arg0);
        method320((byte) 4, arg3);
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(BLMNKDCXXG;)V")
    private static final void method320(byte arg0, class37 arg1) {
        int var2 = arg1.method391();
        field1121 = new char[var2][];
        field1122 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1122[var3] = arg1.method386();
            char[] var5 = new char[arg1.method386()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method386();
            }
            field1121[var3] = var5;
        }
        if (arg0 == 4) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(ZLMNKDCXXG;)V")
    private static final void method321(boolean arg0, class37 arg1) {
        int var2 = arg1.method391();
        field1118 = new char[var2][];
        field1119 = new byte[var2][][];
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        method324(field1118, 549, field1119, arg1);
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(LMNKDCXXG;I)V")
    private static final void method322(class37 arg0, int arg1) {
        int var2 = arg0.method391();
        field1120 = new char[var2][];
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        method325(4, field1120, arg0);
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(ZLMNKDCXXG;)V")
    private static final void method323(boolean arg0, class37 arg1) {
        if (!arg0) {
            field1117 = new int[arg1.method391()];
            for (int var2 = 0; var2 < field1117.length; var2++) {
                field1117[var2] = arg1.method388();
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([[CI[[[BLMNKDCXXG;)V")
    private static final void method324(char[][] arg0, int arg1, byte[][][] arg2, class37 arg3) {
        if (arg1 <= 0) {
            field1116 = -339;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg3.method386()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method386();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg3.method386()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method386();
                var7[var8][1] = (byte) arg3.method386();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[[CLMNKDCXXG;)V")
    private static final void method325(int arg0, char[][] arg1, class37 arg2) {
        if (field1107 != arg0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method386()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method386();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[C)V")
    private static final void method326(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method327(703, arg1[var3])) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var4 = var2; var4 < arg1.length; var4++) {
            arg1[var4] = ' ';
        }
        if (arg0 != 0) {
            field1116 = -139;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(IC)Z")
    private static final boolean method327(int arg0, char arg1) {
        int var2 = 13 / arg0;
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method328(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method326(0, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method336(0, var6);
        method331((byte) -27, var6);
        method332(var6, 2);
        if (field1104 != arg0) {
            field1105 = !field1105;
        }
        method345(var6, true);
        for (int var8 = 0; var8 < field1123.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1123[var8], var11 + 1)) != -1) {
                char[] var12 = field1123[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method329(var5.toCharArray(), field1108, var6);
        method330((byte) -33, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CI[C)V")
    private static final void method329(char[] arg0, int arg1, char[] arg2) {
        if (arg1 != 0) {
            field1106 = !field1106;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method353(-89, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(B[C)V")
    private static final void method330(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var5 = arg1[var3];
            if (!method350(335, var5)) {
                var2 = true;
            } else if (var2) {
                if (method352((byte) 3, var5)) {
                    var2 = false;
                }
            } else if (method353(-89, var5)) {
                arg1[var3] = (char) (var5 + 'a' - 65);
            }
        }
        if (arg0 != -33) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(B[C)V")
    private static final void method331(byte arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1118.length - 1; var3 >= 0; var3--) {
                method340(6, field1118[var3], arg1, field1119[var3]);
            }
        }
        if (arg0 == -27) {
            ;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CI)V")
    private static final void method332(char[] arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            return;
        }
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method340(6, var3, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method340(6, var5, var4, null);
        for (int var6 = field1120.length - 1; var6 >= 0; var6--) {
            method333(var2, arg0, 8, field1120[var6], var4);
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method333(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg3.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        if (arg2 != 8) {
            return;
        }
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg3.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg1[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg1.length) {
                        var12 = arg1[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg3.length && (var13 = method342(var12, false, arg3[var8], var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method342(var12, false, arg3[var8 - 1], var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method348(false, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method334(field1109, arg0, arg1, var6);
                int var17 = method335(var7 - 1, arg1, arg4, -533);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg1[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[C[CI)I")
    private static final int method334(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method348(false, arg2[var4]); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        if (field1110 != arg0) {
            field1105 = !field1105;
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method348(false, arg1[var6]); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method348(false, arg2[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(I[C[CI)I")
    private static final int method335(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method348(false, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            while (arg3 >= 0) {
                field1108 = -300;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method348(false, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method348(false, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(I[C)V")
    private static final void method336(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        char[] var4 = new char[] { 'd', 'o', 't' };
        method340(6, var4, var2, null);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method340(6, var6, var5, null);
        for (int var7 = 0; var7 < field1121.length; var7++) {
            method337(arg1, (byte) 4, field1122[var7], var5, field1121[var7], var2);
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CBI[C[C[C)V")
    private static final void method337(char[] arg0, byte arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg1 != 4) {
            field1106 = !field1106;
        }
        if (arg4.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method342(var13, false, arg4[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method342(var13, false, arg4[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method348(false, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method338(var7, (byte) 1, arg0, arg5);
                int var18 = method339(arg3, -295, arg0, var8 - 1);
                if (arg2 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg2 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg2 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg2 == 3 && var17 > 2 && var18 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var16) {
                    int var19 = var7;
                    int var20 = var8 - 1;
                    if (var17 > 2) {
                        if (var17 == 4) {
                            boolean var21 = false;
                            for (int var22 = var7 - 1; var22 >= 0; var22--) {
                                if (var21) {
                                    if (arg5[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg5[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method348(false, arg0[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method348(false, arg0[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg0.length; var26++) {
                                if (var25) {
                                    if (arg3[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg3[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method348(false, arg0[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method348(false, arg0[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg0[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(IB[C[C)I")
    private static final int method338(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method348(false, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method348(false, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg1 == 1) {
                boolean var7 = false;
                if (var5 >= 3) {
                    return 4;
                }
                if (method348(false, arg2[arg0 - 1])) {
                    return 1;
                }
                return 0;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CI[CI)I")
    private static final int method339(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method348(false, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            while (arg1 >= 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg2.length && method348(false, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method348(false, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[C[C[[B)V")
    public static final void method340(int arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        if (arg0 < 6 || arg0 > 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var10;
        for (int var6 = 0; var6 <= arg2.length - arg1.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label167: while (true) {
                while (true) {
                    if (var7 >= arg2.length || var12 && var13) {
                        break label167;
                    }
                    boolean var14 = false;
                    char var15 = arg2[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg2.length) {
                        var16 = arg2[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg1.length && (var17 = method343(var16, (byte) 8, var15, arg1[var8])) > 0) {
                        if (var17 == 1 && method351(var15, (byte) 7)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method351(var15, (byte) 7) || method351(var16, (byte) 7))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label167;
                        }
                        int var18;
                        if ((var18 = method343(var16, (byte) 8, var15, arg1[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method349(var15, false)) {
                                break label167;
                            }
                            if (method348(false, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method351(var15, (byte) 7)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label167;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg1.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var6 - 1 < 0 || method348(false, arg2[var6 - 1]) && arg2[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg2.length || method348(false, arg2[var7]) && arg2[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method348(false, arg2[var27]) || arg2[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg2.length && (!method348(false, arg2[var27 + var29]) || arg2[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg2[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method348(false, arg2[var27 - 1]) || arg2[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method354(var28, true)) {
                                    var26 = true;
                                }
                            }
                            var27++;
                        }
                        if (!var26) {
                            var19 = false;
                        }
                    }
                } else {
                    char var20 = ' ';
                    if (var6 - 1 >= 0) {
                        var20 = arg2[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg2.length) {
                        var21 = arg2[var7];
                    }
                    byte var22 = method344((byte) 3, var20);
                    byte var23 = method344((byte) 3, var21);
                    if (arg3 != null && method341(var23, true, arg3, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method351(arg2[var34], (byte) 7)) {
                            var31++;
                        } else if (method350(335, arg2[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg2[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(BZ[[BB)Z")
    private static final boolean method341(byte arg0, boolean arg1, byte[][] arg2, byte arg3) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = 0;
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg0) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg3 && arg2[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg2[var7][0] == arg3 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg3 < arg2[var7][0] || arg2[var7][0] == arg3 && arg0 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CZCC)I")
    private static final int method342(char arg0, boolean arg1, char arg2, char arg3) {
        if (arg1) {
            field1104 = 164;
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg2 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg3 == '(' && arg0 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg2 == 's' && arg3 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CBCC)I")
    private static final int method343(char arg0, byte arg1, char arg2, char arg3) {
        if (arg1 == 8) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg3 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg2 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'j') {
                return 0;
            }
            if (arg3 == 'k') {
                return 0;
            }
            if (arg3 == 'l') {
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'm') {
                return 0;
            }
        }
        if (arg3 >= 'n' && arg3 <= 'z') {
            if (arg3 == 'n') {
                return 0;
            }
            if (arg3 == 'o') {
                if (arg2 != '0' && arg2 != '*') {
                    if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg3 == 'p') {
                return 0;
            }
            if (arg3 == 'q') {
                return 0;
            }
            if (arg3 == 'r') {
                return 0;
            }
            if (arg3 == 's') {
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg2 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'y') {
                return 0;
            }
            if (arg3 == 'z') {
                return 0;
            }
        }
        if (arg3 >= '0' && arg3 <= '9') {
            if (arg3 == '0') {
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg3 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg3 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg3 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(BC)B")
    private static final byte method344(byte arg0, char arg1) {
        if (arg0 != 3) {
            field1104 = 137;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return (byte) (arg1 + 1 - 'a');
        } else if (arg1 == '\'') {
            return 28;
        } else if (arg1 >= '0' && arg1 <= '9') {
            return (byte) (arg1 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "([CZ)V")
    private static final void method345(char[] arg0, boolean arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method346(var3, arg0, -816)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method348(false, arg0[var9]) && !method349(arg0[var9], false)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var6 = var7;
                }
                var3 = method347(field1112, var7, arg0);
                int var10 = 0;
                for (int var11 = var7; var11 < var3; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var3 - var7 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var12 = var6; var12 < var3; var12++) {
                arg0[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(I[CI)I")
    private static final int method346(int arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            field1116 = -171;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(II[C)I")
    private static final int method347(int arg0, int arg1, char[] arg2) {
        if (arg0 >= 0) {
            return 3;
        }
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(ZC)Z")
    private static final boolean method348(boolean arg0, char arg1) {
        if (arg0) {
            field1107 = 354;
        }
        return !method350(335, arg1) && !method351(arg1, (byte) 7);
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CZ)Z")
    private static final boolean method349(char arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(IC)Z")
    private static final boolean method350(int arg0, char arg1) {
        int var2 = 17 / arg0;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "a", descriptor = "(CB)Z")
    private static final boolean method351(char arg0, byte arg1) {
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "(BC)Z")
    private static final boolean method352(byte arg0, char arg1) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "c", descriptor = "(IC)Z")
    private static final boolean method353(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "b", descriptor = "([CZ)Z")
    private static final boolean method354(char[] arg0, boolean arg1) {
        boolean var2 = true;
        if (!arg1) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method351(arg0[var3], (byte) 7) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method355((byte) 0, arg0);
        int var5 = 0;
        int var6 = field1117.length - 1;
        if (field1117[var5] == var4 || field1117[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1117[var7] == var4) {
                return true;
            }
            if (var4 < field1117[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!LJNJPDAK", name = "c", descriptor = "(B[C)I")
    public static final int method355(byte arg0, char[] arg1) {
        if (arg0 != 0) {
            return field1112;
        }
        boolean var2 = false;
        if (arg1.length > 6) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[arg1.length - var4 - 1];
            if (var5 >= 'a' && var5 <= 'z') {
                var3 = var3 * 38 + var5 + 1 - 'a';
            } else if (var5 == '\'') {
                var3 = var3 * 38 + 27;
            } else if (var5 >= '0' && var5 <= '9') {
                var3 = var3 * 38 + var5 + 28 - '0';
            } else if (var5 != '\u0000') {
                return 0;
            }
        }
        return var3;
    }
}
