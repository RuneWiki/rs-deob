import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KMKDGUZT")
public class class30 {

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "I")
    private static int field1048 = 25914;

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "Z")
    private static boolean field1049 = true;

    @OriginalMember(owner = "KMKDGUZT", name = "c", descriptor = "B")
    private static byte field1050 = 66;

    @OriginalMember(owner = "KMKDGUZT", name = "d", descriptor = "I")
    private static int field1051 = 17009;

    @OriginalMember(owner = "KMKDGUZT", name = "e", descriptor = "I")
    private static int field1052 = 604;

    @OriginalMember(owner = "KMKDGUZT", name = "f", descriptor = "I")
    private static int field1053 = 8;

    @OriginalMember(owner = "KMKDGUZT", name = "g", descriptor = "Z")
    private static boolean field1054 = true;

    @OriginalMember(owner = "KMKDGUZT", name = "h", descriptor = "B")
    private static byte field1055 = -2;

    @OriginalMember(owner = "KMKDGUZT", name = "i", descriptor = "B")
    private static byte field1056 = -2;

    @OriginalMember(owner = "KMKDGUZT", name = "k", descriptor = "Z")
    private static boolean field1058 = true;

    @OriginalMember(owner = "KMKDGUZT", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1065 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "KMKDGUZT", name = "j", descriptor = "I")
    private static int field1057;

    @OriginalMember(owner = "KMKDGUZT", name = "s", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "KMKDGUZT", name = "l", descriptor = "[I")
    private static int[] field1059;

    @OriginalMember(owner = "KMKDGUZT", name = "q", descriptor = "[I")
    private static int[] field1064;

    @OriginalMember(owner = "KMKDGUZT", name = "m", descriptor = "[[C")
    private static char[][] field1060;

    @OriginalMember(owner = "KMKDGUZT", name = "o", descriptor = "[[C")
    private static char[][] field1062;

    @OriginalMember(owner = "KMKDGUZT", name = "p", descriptor = "[[C")
    private static char[][] field1063;

    @OriginalMember(owner = "KMKDGUZT", name = "n", descriptor = "[[[B")
    private static byte[][][] field1061;

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(LMNPBQFWE;)V")
    public static final void method359(class37 arg0) {
        class3 var1 = new class3(false, arg0.method429("fragmentsenc.txt", null));
        class3 var2 = new class3(false, arg0.method429("badenc.txt", null));
        class3 var3 = new class3(false, arg0.method429("domainenc.txt", null));
        class3 var4 = new class3(false, arg0.method429("tldlist.txt", null));
        method360(var1, var2, var3, var4);
        if (class38.field1228) {
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(LBJPWOXRJ;LBJPWOXRJ;LBJPWOXRJ;LBJPWOXRJ;)V")
    private static final void method360(class3 arg0, class3 arg1, class3 arg2, class3 arg3) {
        method362(false, arg1);
        method363(-38943, arg2);
        method364(arg0, (byte) -125);
        method361(field1050, arg3);
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(BLBJPWOXRJ;)V")
    private static final void method361(byte arg0, class3 arg1) {
        int var2 = arg1.method20();
        field1063 = new char[var2][];
        field1064 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1064[var3] = arg1.method15();
            char[] var4 = new char[arg1.method15()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method15();
            }
            field1063[var3] = var4;
        }
        if (arg0 == 66) {
            ;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(ZLBJPWOXRJ;)V")
    private static final void method362(boolean arg0, class3 arg1) {
        if (arg0) {
            field1049 = !field1049;
        }
        int var2 = arg1.method20();
        field1060 = new char[var2][];
        field1061 = new byte[var2][][];
        method365(arg1, field1061, field1060, 17009);
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    private static final void method363(int arg0, class3 arg1) {
        if (arg0 == -38943) {
            int var2 = arg1.method20();
            field1062 = new char[var2][];
            method366(-304, arg1, field1062);
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(LBJPWOXRJ;B)V")
    private static final void method364(class3 arg0, byte arg1) {
        if (arg1 == -125) {
            field1059 = new int[arg0.method20()];
            for (int var2 = 0; var2 < field1059.length; var2++) {
                field1059[var2] = arg0.method17();
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(LBJPWOXRJ;[[[B[[CI)V")
    private static final void method365(class3 arg0, byte[][][] arg1, char[][] arg2, int arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method15()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method15();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method15()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method15();
                var7[var8][1] = (byte) arg0.method15();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (field1051 != arg3) {
            field1058 = !field1058;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(ILBJPWOXRJ;[[C)V")
    private static final void method366(int arg0, class3 arg1, char[][] arg2) {
        while (arg0 >= 0) {
            field1048 = -36;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method15()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method15();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CI)V")
    private static final void method367(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method368(arg0[var3], false)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1 == 0) {
            for (int var4 = var2; var4 < arg0.length; var4++) {
                arg0[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(CZ)Z")
    private static final boolean method368(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method369(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method367(var4, 0);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method377(-351, var6);
        method372(var6, true);
        method373(-285, var6);
        if (arg0 != -42231) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        method386(false, var6);
        for (int var9 = 0; var9 < field1065.length; var9++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field1065[var9], var12 + 1)) != -1) {
                char[] var13 = field1065[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method370(var6, var5.toCharArray(), 131);
        method371(var6, field1052);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([C[CI)V")
    private static final void method370(char[] arg0, char[] arg1, int arg2) {
        if (arg2 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (arg0[var4] != '*' && method394(arg1[var4], (byte) 6)) {
                arg0[var4] = arg1[var4];
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "([CI)V")
    private static final void method371(char[] arg0, int arg1) {
        int var2 = 3 / arg1;
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method391(var5, -12923)) {
                var3 = true;
            } else if (var3) {
                if (method393(var5, 0)) {
                    var3 = false;
                }
            } else if (method394(var5, (byte) 6)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CZ)V")
    private static final void method372(char[] arg0, boolean arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1060.length - 1; var3 >= 0; var3--) {
                method381(arg0, true, field1060[var3], field1061[var3]);
            }
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(I[C)V")
    private static final void method373(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        while (arg0 >= 0) {
            field1058 = !field1058;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method381(var2, true, var3, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method381(var4, true, var5, null);
        for (int var6 = field1062.length - 1; var6 >= 0; var6--) {
            method374(arg1, field1062[var6], (byte) -120, var4, var2);
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([C[CB[C[C)V")
    private static final void method374(char[] arg0, char[] arg1, byte arg2, char[] arg3, char[] arg4) {
        if (arg2 != -120) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg1.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label62: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label62;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method383(arg1[var9], var13, 2, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method383(arg1[var9 - 1], var13, 2, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method389(var12, 160)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method375(arg4, var7, (byte) 36, arg0);
                int var18 = method376(arg3, var8 - 1, arg0, 86);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg0[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CIB[C)I")
    private static final int method375(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method389(arg3[var4], 160); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method389(arg0[var6], 160); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (arg2 != 36) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method389(arg3[arg1 - 1], 160)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CI[CI)I")
    private static final int method376(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method389(arg2[var4], 160)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg3 <= 0) {
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg2.length && method389(arg0[var6], 160); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method389(arg2[arg1 + 1], 160)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "(I[C)V")
    private static final void method377(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method381(var2, true, var3, null);
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method381(var4, true, var5, null);
        for (int var6 = 0; var6 < field1063.length; var6++) {
            method378(var2, false, var4, field1063[var6], field1064[var6], arg1);
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CZ[C[CI[C)V")
    private static final void method378(char[] arg0, boolean arg1, char[] arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg1) {
            field1052 = -283;
        }
        if (arg3.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method383(arg3[var9], var13, 2, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method383(arg3[var9 - 1], var13, 2, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method389(var12, 160)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method379((byte) 2, arg5, var7, arg0);
                int var18 = method380(arg2, var8 - 1, (byte) 55, arg5);
                if (arg4 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg4 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg4 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg4 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg0[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg0[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method389(arg5[var24], 160)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method389(arg5[var24], 160)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg5.length; var26++) {
                                if (var25) {
                                    if (arg2[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg2[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method389(arg5[var28], 160)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method389(arg5[var28], 160)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg5[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(B[CI[C)I")
    private static final int method379(byte arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 != 2) {
            field1051 = 207;
        }
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method389(arg1[var4], 160)) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method389(arg3[var6], 160); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method389(arg1[arg2 - 1], 160)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "([CIB[C)I")
    private static final int method380(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method389(arg3[var4], 160)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 != 55) {
                return field1052;
            }
            for (int var6 = arg1 + 1; var6 < arg3.length && method389(arg0[var6], 160); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method389(arg3[arg1 + 1], 160)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CZ[C[[B)V")
    public static final void method381(char[] arg0, boolean arg1, char[] arg2, byte[][] arg3) {
        if (!arg1) {
            field1049 = !field1049;
        }
        if (arg2.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg2.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label172: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label172;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg2.length && (var16 = method384(var14, -312, var15, arg2[var7])) > 0) {
                        if (var16 == 1 && method392(field1054, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method392(field1054, var14) || method392(field1054, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method384(var14, -312, var15, arg2[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method390(var14, true)) {
                                break label172;
                            }
                            if (method389(var14, 160) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method392(field1054, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label172;
                            }
                        }
                    }
                }
            }
            if (var7 >= arg2.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method389(arg0[var5 - 1], 160) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method389(arg0[var6], 160) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method389(arg0[var26], 160) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method389(arg0[var26 + var28], 160) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method389(arg0[var26 - 1], 160) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method395(var27, field1055)) {
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
                        var19 = arg0[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg0.length) {
                        var20 = arg0[var6];
                    }
                    byte var21 = method385(5, var19);
                    byte var22 = method385(5, var20);
                    if (arg3 != null && method382(var21, arg3, false, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method392(field1054, arg0[var33])) {
                            var30++;
                        } else if (method391(arg0[var33], -12923)) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg0[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(B[[BZB)Z")
    private static final boolean method382(byte arg0, byte[][] arg1, boolean arg2, byte arg3) {
        int var4 = 0;
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg3) {
            return true;
        }
        int var6 = arg1.length - 1;
        if (arg1[var6][0] == arg0 && arg1[var6][1] == arg3) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg1[var7][0] == arg0 && arg1[var7][1] == arg3) {
                return true;
            }
            if (arg0 < arg1[var7][0] || arg1[var7][0] == arg0 && arg3 < arg1[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(CCIC)I")
    private static final int method383(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 < 2 || arg2 > 2) {
            return 3;
        } else if (arg0 == arg3) {
            return 1;
        } else if (arg0 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg3 == '(' && arg1 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg0 == 's' && arg3 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(CICC)I")
    private static final int method384(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 >= 0) {
            return 3;
        } else if (arg0 == arg3) {
            return 1;
        } else {
            if (arg3 >= 'a' && arg3 <= 'm') {
                if (arg3 == 'a') {
                    if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                        if (arg0 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'b') {
                    if (arg0 != '6' && arg0 != '8') {
                        if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg3 == 'c') {
                    if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'd') {
                    if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'e') {
                    if (arg0 != '3' && arg0 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'f') {
                    if (arg0 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg0 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg3 == 'g') {
                    if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'h') {
                    if (arg0 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg3 == 'i') {
                    if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                    if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                    if (arg0 != '0' && arg0 != '*') {
                        if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
                    if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 't') {
                    if (arg0 != '7' && arg0 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'u') {
                    if (arg0 == 'v') {
                        return 1;
                    }
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'v') {
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'w') {
                    if (arg0 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg3 == 'x') {
                    if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
                    if (arg0 == 'o' || arg0 == 'O') {
                        return 1;
                    } else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg3 == '1') {
                    return arg0 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg3 == ',') {
                return arg0 == '.' ? 1 : 0;
            } else if (arg3 == '.') {
                return arg0 == ',' ? 1 : 0;
            } else if (arg3 == '!') {
                return arg0 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(IC)B")
    private static final byte method385(int arg0, char arg1) {
        if (arg0 != 5) {
            field1051 = 427;
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

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(Z[C)V")
    private static final void method386(boolean arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0) {
            field1052 = -478;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method387(8, var3, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method389(arg1[var8], 160) && !method390(arg1[var8], true)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method388(726, var6, arg1);
                int var9 = 0;
                for (int var10 = var6; var10 < var3; var10++) {
                    var9 = var9 * 10 + arg1[var10] - 48;
                }
                if (var9 <= 255 && var3 - var6 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var11 = var5; var11 < var3; var11++) {
                arg1[var11] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(II[C)I")
    private static final int method387(int arg0, int arg1, char[] arg2) {
        if (field1053 != arg0) {
            return 4;
        }
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "(II[C)I")
    private static final int method388(int arg0, int arg1, char[] arg2) {
        if (arg0 <= 0) {
            field1049 = !field1049;
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

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(CI)Z")
    private static final boolean method389(char arg0, int arg1) {
        if (arg1 <= 0) {
            field1048 = -327;
        }
        return !method391(arg0, -12923) && !method392(field1054, arg0);
    }

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "(CZ)Z")
    private static final boolean method390(char arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "KMKDGUZT", name = "b", descriptor = "(CI)Z")
    private static final boolean method391(char arg0, int arg1) {
        if (arg1 != -12923) {
            field1054 = !field1054;
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(ZC)Z")
    private static final boolean method392(boolean arg0, char arg1) {
        if (!arg0) {
            field1048 = -11;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "KMKDGUZT", name = "c", descriptor = "(CI)Z")
    private static final boolean method393(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "(CB)Z")
    private static final boolean method394(char arg0, byte arg1) {
        if (arg1 != 6) {
            field1048 = -435;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "KMKDGUZT", name = "a", descriptor = "([CB)Z")
    private static final boolean method395(char[] arg0, byte arg1) {
        if (field1056 != arg1) {
            field1058 = !field1058;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method392(field1054, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method396(arg0, 0);
        int var5 = 0;
        int var6 = field1059.length - 1;
        if (field1059[var5] == var4 || field1059[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1059[var7] == var4) {
                return true;
            }
            if (var4 < field1059[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "KMKDGUZT", name = "c", descriptor = "([CI)I")
    public static final int method396(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[arg0.length - var3 - 1];
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
        if (arg1 != 0) {
            field1057 = 192;
        }
        return var2;
    }
}
