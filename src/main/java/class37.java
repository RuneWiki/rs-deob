import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MOLFGQQL")
public class class37 {

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "Z")
    private static boolean field1084 = true;

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "I")
    private static int field1085 = 536;

    @OriginalMember(owner = "client!MOLFGQQL", name = "e", descriptor = "I")
    private static int field1088 = 8;

    @OriginalMember(owner = "client!MOLFGQQL", name = "f", descriptor = "B")
    private static byte field1089 = 27;

    @OriginalMember(owner = "client!MOLFGQQL", name = "g", descriptor = "I")
    private static int field1090 = 34134;

    @OriginalMember(owner = "client!MOLFGQQL", name = "j", descriptor = "I")
    private static int field1093 = -800;

    @OriginalMember(owner = "client!MOLFGQQL", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1102 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!MOLFGQQL", name = "c", descriptor = "I")
    private static int field1086;

    @OriginalMember(owner = "client!MOLFGQQL", name = "h", descriptor = "I")
    private static int field1091;

    @OriginalMember(owner = "client!MOLFGQQL", name = "i", descriptor = "I")
    private static int field1092;

    @OriginalMember(owner = "client!MOLFGQQL", name = "d", descriptor = "Z")
    private static boolean field1087;

    @OriginalMember(owner = "client!MOLFGQQL", name = "k", descriptor = "Z")
    private static boolean field1094;

    @OriginalMember(owner = "client!MOLFGQQL", name = "l", descriptor = "Z")
    private static boolean field1095;

    @OriginalMember(owner = "client!MOLFGQQL", name = "t", descriptor = "Z")
    public static boolean field1103;

    @OriginalMember(owner = "client!MOLFGQQL", name = "m", descriptor = "[I")
    private static int[] field1096;

    @OriginalMember(owner = "client!MOLFGQQL", name = "r", descriptor = "[I")
    private static int[] field1101;

    @OriginalMember(owner = "client!MOLFGQQL", name = "n", descriptor = "[[C")
    private static char[][] field1097;

    @OriginalMember(owner = "client!MOLFGQQL", name = "p", descriptor = "[[C")
    private static char[][] field1099;

    @OriginalMember(owner = "client!MOLFGQQL", name = "q", descriptor = "[[C")
    private static char[][] field1100;

    @OriginalMember(owner = "client!MOLFGQQL", name = "o", descriptor = "[[[B")
    private static byte[][][] field1098;

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(LUUIGNTAD;)V")
    public static final void method359(class59 arg0) {
        class10 var1 = new class10(arg0.method545("fragmentsenc.txt", null), field1085);
        class10 var2 = new class10(arg0.method545("badenc.txt", null), field1085);
        class10 var3 = new class10(arg0.method545("domainenc.txt", null), field1085);
        class10 var4 = new class10(arg0.method545("tldlist.txt", null), field1085);
        method360(var1, var2, var3, var4);
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(LCMGGUSPR;LCMGGUSPR;LCMGGUSPR;LCMGGUSPR;)V")
    private static final void method360(class10 arg0, class10 arg1, class10 arg2, class10 arg3) {
        method362(true, arg1);
        method363(arg2, 2);
        method364(arg0, 0);
        method361((byte) 2, arg3);
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(BLCMGGUSPR;)V")
    private static final void method361(byte arg0, class10 arg1) {
        int var2 = arg1.method199();
        field1100 = new char[var2][];
        field1101 = new int[var2];
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            field1086 = -73;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            field1101[var4] = arg1.method194();
            char[] var5 = new char[arg1.method194()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method194();
            }
            field1100[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(ZLCMGGUSPR;)V")
    private static final void method362(boolean arg0, class10 arg1) {
        int var2 = arg1.method199();
        field1097 = new char[var2][];
        if (!arg0) {
            field1085 = 492;
        }
        field1098 = new byte[var2][][];
        method365(arg1, field1098, field1097, (byte) 91);
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(LCMGGUSPR;I)V")
    private static final void method363(class10 arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            field1084 = !field1084;
        }
        int var2 = arg0.method199();
        field1099 = new char[var2][];
        method366(field1099, arg0, field1088);
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(LCMGGUSPR;I)V")
    private static final void method364(class10 arg0, int arg1) {
        field1096 = new int[arg0.method199()];
        for (int var2 = 0; var2 < field1096.length; var2++) {
            field1096[var2] = arg0.method196();
        }
        if (arg1 != 0) {
            field1084 = !field1084;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(LCMGGUSPR;[[[B[[CB)V")
    private static final void method365(class10 arg0, byte[][][] arg1, char[][] arg2, byte arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method194()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method194();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method194()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method194();
                var7[var8][1] = (byte) arg0.method194();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg3 != 91) {
            field1087 = !field1087;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([[CLCMGGUSPR;I)V")
    private static final void method366(char[][] arg0, class10 arg1, int arg2) {
        if (arg2 != 8) {
            field1094 = !field1094;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method194()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method194();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[C)V")
    private static final void method367(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method368(arg1[var3], true)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg0 != 14237) {
            field1085 = 282;
        }
        for (int var4 = var2; var4 < arg1.length; var4++) {
            arg1[var4] = ' ';
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CZ)Z")
    private static final boolean method368(char arg0, boolean arg1) {
        if (!arg1) {
            field1086 = -48;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method369(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method367(14237, var4);
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method377(false, var6);
        method372(var6, 891);
        method373(var6, 0);
        method386(var6, (byte) 68);
        for (int var8 = 0; var8 < field1102.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1102[var8], var11 + 1)) != -1) {
                char[] var12 = field1102[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method370(var6, -18593, var5.toCharArray());
        method371(field1090, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI[C)V")
    private static final void method370(char[] arg0, int arg1, char[] arg2) {
        if (arg1 != -18593) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            if (arg0[var4] != '*' && method394(true, arg2[var4])) {
                arg0[var4] = arg2[var4];
            }
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(I[C)V")
    private static final void method371(int arg0, char[] arg1) {
        if (arg0 != 34134) {
            field1087 = !field1087;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method391(var4, field1092)) {
                var2 = true;
            } else if (var2) {
                if (method393(var4, field1093)) {
                    var2 = false;
                }
            } else if (method394(true, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI)V")
    private static final void method372(char[] arg0, int arg1) {
        if (arg1 <= 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1097.length - 1; var3 >= 0; var3--) {
                method381((byte) 8, field1097[var3], field1098[var3], arg0);
            }
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "([CI)V")
    private static final void method373(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 0) {
            field1093 = -234;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method381((byte) 8, var3, null, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method381((byte) 8, var5, null, var4);
        for (int var6 = field1099.length - 1; var6 >= 0; var6--) {
            method374(var2, -205, field1099[var6], var4, arg0);
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI[C[C[C)V")
    private static final void method374(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg2.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg2.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg4.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg4[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg4.length) {
                        var12 = arg4[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg2.length && (var13 = method383(3, var11, var12, arg2[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method383(3, var11, var12, arg2[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method389(var11, (byte) 8)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method375(var6, arg0, arg4, -15266);
                int var17 = method376(arg3, var7 - 1, (byte) 6, arg4);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg4[var18] = '*';
                    }
                }
            }
        }
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[C[CI)I")
    private static final int method375(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 != -15266) {
            field1088 = -192;
        }
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method389(arg2[var4], (byte) 8); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method389(arg1[var6], (byte) 8); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method389(arg2[arg0 - 1], (byte) 8)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CIB[C)I")
    private static final int method376(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method389(arg3[var4], (byte) 8)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg2 == 6) {
                boolean var5 = false;
            } else {
                field1090 = 277;
            }
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg3.length && method389(arg0[var7], (byte) 8); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method389(arg3[arg1 + 1], (byte) 8)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(Z[C)V")
    private static final void method377(boolean arg0, char[] arg1) {
        if (arg0) {
            field1092 = -132;
        }
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method381((byte) 8, var3, null, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method381((byte) 8, var5, null, var4);
        for (int var6 = 0; var6 < field1100.length; var6++) {
            method378(-31217, var2, field1101[var6], arg1, var4, field1100[var6]);
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[CI[C[C[C)V")
    private static final void method378(int arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg3.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg3[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg3.length) {
                        var13 = arg3[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method383(3, var12, var13, arg5[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method383(3, var12, var13, arg5[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method389(var12, (byte) 8)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method379(arg1, true, arg3, var7);
                int var18 = method380(arg3, field1091, arg4, var8 - 1);
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
                                    if (arg1[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg1[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method389(arg3[var24], (byte) 8)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method389(arg3[var24], (byte) 8)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg3.length; var26++) {
                                if (var25) {
                                    if (arg4[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg4[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg3.length; var28++) {
                            if (var27) {
                                if (method389(arg3[var28], (byte) 8)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method389(arg3[var28], (byte) 8)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg3[var29] = '*';
                    }
                }
            }
        }
        if (arg0 == -31217) {
            ;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CZ[CI)I")
    private static final int method379(char[] arg0, boolean arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method389(arg2[var4], (byte) 8)) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method389(arg0[var6], (byte) 8); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (!arg1) {
                field1090 = 362;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method389(arg2[arg3 - 1], (byte) 8)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CI[CI)I")
    private static final int method380(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method389(arg0[var4], (byte) 8)) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 0) {
                return 0;
            }
            for (int var6 = arg3 + 1; var6 < arg0.length && method389(arg2[var6], (byte) 8); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method389(arg0[arg3 + 1], (byte) 8)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(B[C[[B[C)V")
    public static final void method381(byte arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method384(arg1[var7], var15, 2, var14)) > 0) {
                        if (var16 == 1 && method392(743, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method392(743, var14) || method392(743, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method384(arg1[var7 - 1], var15, 2, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method390((byte) -125, var14)) {
                                break label167;
                            }
                            if (method389(var14, (byte) 8) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method392(743, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label167;
                            }
                        }
                    }
                }
            }
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method389(arg3[var5 - 1], (byte) 8) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method389(arg3[var6], (byte) 8) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method389(arg3[var26], (byte) 8) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method389(arg3[var26 + var28], (byte) 8) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method389(arg3[var26 - 1], (byte) 8) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method395(var27, (byte) 0)) {
                                    var25 = true;
                                }
                            }
                            var26++;
                        }
                        if (!var25) {
                            var18 = false;
                        }
                    }
                } else {
                    char var19 = ' ';
                    if (var5 - 1 >= 0) {
                        var19 = arg3[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg3.length) {
                        var20 = arg3[var6];
                    }
                    byte var21 = method385(-35667, var19);
                    byte var22 = method385(-35667, var20);
                    if (arg2 != null && method382(var22, var21, arg2, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method392(743, arg3[var33])) {
                            var30++;
                        } else if (method391(arg3[var33], field1092)) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg3[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
        if (arg0 != 8) {
            field1085 = -222;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(BB[[BI)Z")
    private static final boolean method382(byte arg0, byte arg1, byte[][] arg2, int arg3) {
        int var4 = 0;
        if (arg3 != 0) {
            field1084 = !field1084;
        }
        if (arg2[var4][0] == arg1 && arg2[var4][1] == arg0) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg1 && arg2[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg1 && arg2[var6][1] == arg0) {
                return true;
            }
            if (arg1 < arg2[var6][0] || arg2[var6][0] == arg1 && arg0 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(ICCC)I")
    private static final int method383(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 3) {
            return field1085;
        } else if (arg1 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg1 == '(' && arg2 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg3 == 's' && arg1 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CCIC)I")
    private static final int method384(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 2) {
            field1087 = !field1087;
        }
        if (arg0 == arg3) {
            return 1;
        }
        if (arg0 >= 'a' && arg0 <= 'm') {
            if (arg0 == 'a') {
                if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                    if (arg3 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'b') {
                if (arg3 != '6' && arg3 != '8') {
                    if ((arg3 != '1' || arg1 != '3') && (arg3 != 'i' || arg1 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg0 == 'c') {
                if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'd') {
                if ((arg3 != '[' || arg1 != ')') && (arg3 != 'i' || arg1 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'e') {
                if (arg3 != '3' && arg3 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'f') {
                if (arg3 == 'p' && arg1 == 'h') {
                    return 2;
                }
                if (arg3 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'g') {
                if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'h') {
                if (arg3 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'i') {
                if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'j') {
                return 0;
            }
            if (arg0 == 'k') {
                return 0;
            }
            if (arg0 == 'l') {
                if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'm') {
                return 0;
            }
        }
        if (arg0 >= 'n' && arg0 <= 'z') {
            if (arg0 == 'n') {
                return 0;
            }
            if (arg0 == 'o') {
                if (arg3 != '0' && arg3 != '*') {
                    if (arg3 == '(' && arg1 == ')' || arg3 == '[' && arg1 == ']' || arg3 == '{' && arg1 == '}' || arg3 == '<' && arg1 == '>') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'p') {
                return 0;
            }
            if (arg0 == 'q') {
                return 0;
            }
            if (arg0 == 'r') {
                return 0;
            }
            if (arg0 == 's') {
                if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 't') {
                if (arg3 != '7' && arg3 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'u') {
                if (arg3 == 'v') {
                    return 1;
                }
                if (arg3 == '\\' && arg1 == '/' || arg3 == '\\' && arg1 == '|' || arg3 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'v') {
                if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'w') {
                if (arg3 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'x') {
                if ((arg3 != ')' || arg1 != '(') && (arg3 != '}' || arg1 != '{') && (arg3 != ']' || arg1 != '[') && (arg3 != '>' || arg1 != '<')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'y') {
                return 0;
            }
            if (arg0 == 'z') {
                return 0;
            }
        }
        if (arg0 >= '0' && arg0 <= '9') {
            if (arg0 == '0') {
                if (arg3 == 'o' || arg3 == 'O') {
                    return 1;
                } else if ((arg3 != '(' || arg1 != ')') && (arg3 != '{' || arg1 != '}') && (arg3 != '[' || arg1 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg0 == '1') {
                return arg3 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg0 == ',') {
            return arg3 == '.' ? 1 : 0;
        } else if (arg0 == '.') {
            return arg3 == ',' ? 1 : 0;
        } else if (arg0 == '!') {
            return arg3 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(IC)B")
    private static final byte method385(int arg0, char arg1) {
        if (arg0 != -35667) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return (byte) (arg1 + 1 - 'a');
        } else if (arg1 == '\'') {
            return 28;
        } else if (arg1 >= '0' && arg1 <= '9') {
            return (byte) (arg1 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "([CB)V")
    private static final void method386(char[] arg0, byte arg1) {
        boolean var2 = false;
        if (arg1 != 68) {
            field1093 = -71;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method387(var3, arg0, false)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method389(arg0[var8], (byte) 8) && !method390((byte) -125, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method388(var6, 11510, arg0);
                int var9 = 0;
                for (int var10 = var6; var10 < var3; var10++) {
                    var9 = var9 * 10 + arg0[var10] - 48;
                }
                if (var9 <= 255 && var3 - var6 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var11 = var5; var11 < var3; var11++) {
                arg0[var11] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(I[CZ)I")
    private static final int method387(int arg0, char[] arg1, boolean arg2) {
        if (arg2) {
            return 0;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(II[C)I")
    private static final int method388(int arg0, int arg1, char[] arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg1 != 11510) {
                field1094 = !field1094;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CB)Z")
    private static final boolean method389(char arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return !method391(arg0, field1092) && !method392(743, arg0);
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(BC)Z")
    private static final boolean method390(byte arg0, char arg1) {
        if (arg0 != -125) {
            field1084 = !field1084;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(CI)Z")
    private static final boolean method391(char arg0, int arg1) {
        if (arg1 != 0) {
            field1093 = 456;
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(IC)Z")
    private static final boolean method392(int arg0, char arg1) {
        int var2 = 8 / arg0;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(CI)Z")
    private static final boolean method393(char arg0, int arg1) {
        while (arg1 >= 0) {
            field1092 = -290;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "a", descriptor = "(ZC)Z")
    private static final boolean method394(boolean arg0, char arg1) {
        if (!arg0) {
            field1095 = !field1095;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "([CB)Z")
    private static final boolean method395(char[] arg0, byte arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method392(743, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2) {
            return true;
        }
        int var5 = method396(true, arg0);
        int var6 = 0;
        int var7 = field1096.length - 1;
        if (field1096[var6] == var5 || field1096[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1096[var8] == var5) {
                return true;
            }
            if (var5 < field1096[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "client!MOLFGQQL", name = "b", descriptor = "(Z[C)I")
    public static final int method396(boolean arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[arg1.length - var3 - 1];
            if (var4 >= 'a' && var4 <= 'z') {
                var2 = var2 * 38 + var4 + 1 - 'a';
            } else if (var4 == '\'') {
                var2 = var2 * 38 + 27;
            } else if (var4 >= '0' && var4 <= '9') {
                var2 = var2 * 38 + var4 + 28 - '0';
            } else if (var4 != '\u0000') {
                return 0;
            }
        }
        if (!arg0) {
            field1095 = !field1095;
        }
        return var2;
    }
}
