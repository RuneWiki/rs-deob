import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OCOLATKS")
public class class36 {

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "I")
    private static int field1060 = 8;

    @OriginalMember(owner = "OCOLATKS", name = "c", descriptor = "I")
    private static int field1062 = 9561;

    @OriginalMember(owner = "OCOLATKS", name = "e", descriptor = "B")
    private static byte field1064 = 3;

    @OriginalMember(owner = "OCOLATKS", name = "f", descriptor = "B")
    private static byte field1065 = -94;

    @OriginalMember(owner = "OCOLATKS", name = "g", descriptor = "B")
    private static byte field1066 = -94;

    @OriginalMember(owner = "OCOLATKS", name = "h", descriptor = "I")
    private static int field1067 = 647;

    @OriginalMember(owner = "OCOLATKS", name = "i", descriptor = "I")
    private static int field1068 = 9;

    @OriginalMember(owner = "OCOLATKS", name = "j", descriptor = "I")
    private static int field1069 = -10223;

    @OriginalMember(owner = "OCOLATKS", name = "k", descriptor = "Z")
    private static boolean field1070 = true;

    @OriginalMember(owner = "OCOLATKS", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1077 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "Z")
    private static boolean field1061;

    @OriginalMember(owner = "OCOLATKS", name = "d", descriptor = "Z")
    private static boolean field1063;

    @OriginalMember(owner = "OCOLATKS", name = "s", descriptor = "Z")
    public static boolean field1078;

    @OriginalMember(owner = "OCOLATKS", name = "l", descriptor = "[I")
    private static int[] field1071;

    @OriginalMember(owner = "OCOLATKS", name = "q", descriptor = "[I")
    private static int[] field1076;

    @OriginalMember(owner = "OCOLATKS", name = "m", descriptor = "[[C")
    private static char[][] field1072;

    @OriginalMember(owner = "OCOLATKS", name = "o", descriptor = "[[C")
    private static char[][] field1074;

    @OriginalMember(owner = "OCOLATKS", name = "p", descriptor = "[[C")
    private static char[][] field1075;

    @OriginalMember(owner = "OCOLATKS", name = "n", descriptor = "[[[B")
    private static byte[][][] field1073;

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(LFIGUVTWB;)V")
    public static final void method359(class15 arg0) {
        class33 var1 = new class33(field1060, arg0.method209("fragmentsenc.txt", null));
        class33 var2 = new class33(field1060, arg0.method209("badenc.txt", null));
        class33 var3 = new class33(field1060, arg0.method209("domainenc.txt", null));
        class33 var4 = new class33(field1060, arg0.method209("tldlist.txt", null));
        method360(var1, var2, var3, var4);
        if (class37.field1083) {
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(LMUKVLYLC;LMUKVLYLC;LMUKVLYLC;LMUKVLYLC;)V")
    private static final void method360(class33 arg0, class33 arg1, class33 arg2, class33 arg3) {
        method362(true, arg1);
        method363(-23285, arg2);
        method364(738, arg0);
        method361(true, arg3);
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(ZLMUKVLYLC;)V")
    private static final void method361(boolean arg0, class33 arg1) {
        if (!arg0) {
            return;
        }
        int var2 = arg1.method297();
        field1075 = new char[var2][];
        field1076 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1076[var3] = arg1.method292();
            char[] var4 = new char[arg1.method292()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method292();
            }
            field1075[var3] = var4;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(ZLMUKVLYLC;)V")
    private static final void method362(boolean arg0, class33 arg1) {
        if (!arg0) {
            field1060 = -31;
        }
        int var2 = arg1.method297();
        field1072 = new char[var2][];
        field1073 = new byte[var2][][];
        method365(-49984, arg1, field1073, field1072);
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(ILMUKVLYLC;)V")
    private static final void method363(int arg0, class33 arg1) {
        int var2 = arg1.method297();
        if (arg0 != -23285) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1074 = new char[var2][];
        method366(field1074, arg1, (byte) 36);
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(ILMUKVLYLC;)V")
    private static final void method364(int arg0, class33 arg1) {
        field1071 = new int[arg1.method297()];
        if (arg0 <= 0) {
            field1070 = !field1070;
        }
        for (int var2 = 0; var2 < field1071.length; var2++) {
            field1071[var2] = arg1.method294();
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(ILMUKVLYLC;[[[B[[C)V")
    private static final void method365(int arg0, class33 arg1, byte[][][] arg2, char[][] arg3) {
        if (arg0 != -49984) {
            field1070 = !field1070;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method292()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method292();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method292()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method292();
                var7[var8][1] = (byte) arg1.method292();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([[CLMUKVLYLC;B)V")
    private static final void method366(char[][] arg0, class33 arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var5 = new char[arg1.method292()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method292();
            }
            arg0[var3] = var5;
        }
        if (arg2 != 36) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(Z[C)V")
    private static final void method367(boolean arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method368(arg1[var3], 0)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = var2; var5 < arg1.length; var5++) {
            arg1[var5] = ' ';
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(CI)Z")
    private static final boolean method368(char arg0, int arg1) {
        if (arg1 < 0 || arg1 > 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method369(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method367(false, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method377(false, var6);
        method372(var6, field1065);
        method373(-842, var6);
        method386(var6, -669);
        for (int var8 = 0; var8 < field1077.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1077[var8], var11 + 1)) != -1) {
                char[] var12 = field1077[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        if (arg1) {
            throw new NullPointerException();
        }
        method370(var6, field1064, var5.toCharArray());
        method371(var6, false);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([CB[C)V")
    private static final void method370(char[] arg0, byte arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method394(-373, arg2[var3])) {
                arg0[var3] = arg2[var3];
            }
        }
        if (arg1 != 3) {
            field1069 = -199;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([CZ)V")
    private static final void method371(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var5 = arg0[var3];
            if (!method391(656, var5)) {
                var2 = true;
            } else if (var2) {
                if (method393(var5, (byte) -96)) {
                    var2 = false;
                }
            } else if (method394(-373, var5)) {
                arg0[var3] = (char) (var5 + 'a' - 65);
            }
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([CB)V")
    private static final void method372(char[] arg0, byte arg1) {
        if (field1066 != arg1) {
            field1069 = 48;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1072.length - 1; var3 >= 0; var3--) {
                method381(field1072[var3], arg0, field1073[var3], false);
            }
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(I[C)V")
    private static final void method373(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method381(var3, var2, null, false);
        char[] var4 = (char[]) arg1.clone();
        if (arg0 >= 0) {
            return;
        }
        char[] var5 = new char[] { 'd', 'o', 't' };
        method381(var5, var4, null, false);
        for (int var6 = field1074.length - 1; var6 >= 0; var6--) {
            method374(var2, var4, field1067, arg1, field1074[var6]);
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method374(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg3.length - arg4.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label57: while (true) {
                while (true) {
                    if (var8 >= arg3.length) {
                        break label57;
                    }
                    boolean var11 = false;
                    char var12 = arg3[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg3.length) {
                        var13 = arg3[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method383(var12, var13, 682, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label57;
                        }
                        int var15;
                        if ((var15 = method383(var12, var13, 682, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method389(var12, (byte) 6)) {
                                break label57;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method375(arg0, arg3, var6, -39);
                int var18 = method376(arg3, 0, var8 - 1, arg1);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg3[var19] = '*';
                    }
                }
            }
        }
        int var7 = 18 / arg2;
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([C[CII)I")
    private static final int method375(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method389(arg1[var4], (byte) 6); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method389(arg0[var6], (byte) 6); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (arg3 >= 0) {
            return 1;
        } else if (var5 >= 3) {
            return 4;
        } else if (method389(arg1[arg2 - 1], (byte) 6)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([CII[C)I")
    private static final int method376(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method389(arg0[var4], (byte) 6)) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg0.length && method389(arg3[var6], (byte) 6); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg1 != 0) {
                field1061 = !field1061;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method389(arg0[arg2 + 1], (byte) 6)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(Z[C)V")
    private static final void method377(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0) {
            field1067 = 300;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method381(var3, var2, null, false);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method381(var5, var4, null, false);
        for (int var6 = 0; var6 < field1075.length; var6++) {
            method378(field1076[var6], var4, var2, 981, arg1, field1075[var6]);
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(I[C[CI[C[C)V")
    private static final void method378(int arg0, char[] arg1, char[] arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg3 <= 0 || arg5.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method383(var12, var13, 682, arg5[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method383(var12, var13, 682, arg5[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method389(var12, (byte) 6)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method379(arg4, arg2, false, var7);
                int var18 = method380(0, arg1, var8 - 1, arg4);
                if (arg0 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg0 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg0 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg0 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg2[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg2[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method389(arg4[var24], (byte) 6)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method389(arg4[var24], (byte) 6)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg4.length; var26++) {
                                if (var25) {
                                    if (arg1[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg1[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method389(arg4[var28], (byte) 6)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method389(arg4[var28], (byte) 6)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg4[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([C[CZI)I")
    private static final int method379(char[] arg0, char[] arg1, boolean arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method389(arg0[var4], (byte) 6)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2) {
                return field1060;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method389(arg1[var6], (byte) 6); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method389(arg0[arg3 - 1], (byte) 6)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(I[CI[C)I")
    private static final int method380(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method389(arg3[var4], (byte) 6)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg0 < 0 || arg0 > 0) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg2 + 1; var7 < arg3.length && method389(arg1[var7], (byte) 6); var7++) {
                if (arg1[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method389(arg3[arg2 + 1], (byte) 6)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([C[C[[BZ)V")
    public static final void method381(char[] arg0, char[] arg1, byte[][] arg2, boolean arg3) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        if (arg3) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg0.length && (var16 = method384(field1068, var14, var15, arg0[var7])) > 0) {
                        if (var16 == 1 && method392(var14, -807)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method392(var14, -807) || method392(var15, -807))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method384(field1068, var14, var15, arg0[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method390(-568, var14)) {
                                break label167;
                            }
                            if (method389(var14, (byte) 6) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method392(var14, -807)) {
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
            if (var7 >= arg0.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method389(arg1[var5 - 1], (byte) 6) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method389(arg1[var6], (byte) 6) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method389(arg1[var26], (byte) 6) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method389(arg1[var26 + var28], (byte) 6) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method389(arg1[var26 - 1], (byte) 6) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method395(var27, 40)) {
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
                        var19 = arg1[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg1.length) {
                        var20 = arg1[var6];
                    }
                    byte var21 = method385(var19, (byte) 108);
                    byte var22 = method385(var20, (byte) 108);
                    if (arg2 != null && method382(arg2, var22, 381, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method392(arg1[var33], -807)) {
                            var30++;
                        } else if (method391(656, arg1[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg1[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([[BBIB)Z")
    private static final boolean method382(byte[][] arg0, byte arg1, int arg2, byte arg3) {
        int var4 = 0;
        if (arg0[var4][0] == arg3 && arg0[var4][1] == arg1) {
            return true;
        }
        int var5 = arg0.length - 1;
        int var6 = 38 / arg2;
        if (arg0[var5][0] == arg3 && arg0[var5][1] == arg1) {
            return true;
        }
        do {
            int var7 = (var4 + var5) / 2;
            if (arg0[var7][0] == arg3 && arg0[var7][1] == arg1) {
                return true;
            }
            if (arg3 < arg0[var7][0] || arg0[var7][0] == arg3 && arg1 < arg0[var7][1]) {
                var5 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(CCIC)I")
    private static final int method383(char arg0, char arg1, int arg2, char arg3) {
        int var4 = 94 / arg2;
        if (arg0 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg0 == '(' && arg1 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg3 == 's' && arg0 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(ICCC)I")
    private static final int method384(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 9) {
            field1068 = 127;
        }
        if (arg1 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                    if (arg1 == '/' && arg2 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg1 != '6' && arg1 != '8') {
                    if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg3 == 'c') {
                if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'e') {
                if (arg1 != '3' && arg1 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg1 == 'p' && arg2 == 'h') {
                    return 2;
                }
                if (arg1 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'h') {
                if (arg1 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'i') {
                if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                if (arg1 != '0' && arg1 != '*') {
                    if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
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
                if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 't') {
                if (arg1 != '7' && arg1 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'u') {
                if (arg1 == 'v') {
                    return 1;
                }
                if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg1 == 'v' && arg2 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
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
                if (arg1 == 'o' || arg1 == 'O') {
                    return 1;
                } else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg3 == '1') {
                return arg1 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            return arg1 == '.' ? 1 : 0;
        } else if (arg3 == '.') {
            return arg1 == ',' ? 1 : 0;
        } else if (arg3 == '!') {
            return arg1 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(CB)B")
    private static final byte method385(char arg0, byte arg1) {
        if (arg1 != 108) {
            field1063 = !field1063;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return (byte) (arg0 + 1 - 'a');
        } else if (arg0 == '\'') {
            return 28;
        } else if (arg0 >= '0' && arg0 <= '9') {
            return (byte) (arg0 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "([CI)V")
    private static final void method386(char[] arg0, int arg1) {
        if (arg1 >= 0) {
            field1068 = -53;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method387((byte) 8, var3, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method389(arg0[var8], (byte) 6) && !method390(-568, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method388(var6, (byte) 52, arg0);
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

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(BI[C)I")
    private static final int method387(byte arg0, int arg1, char[] arg2) {
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg0 != 8) {
            field1068 = 123;
        }
        return -1;
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(IB[C)I")
    private static final int method388(int arg0, byte arg1, char[] arg2) {
        if (arg1 != 52) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = arg0;
        while (true) {
            if (var4 < arg2.length && var4 >= 0) {
                if (arg2[var4] >= '0' && arg2[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(CB)Z")
    private static final boolean method389(char arg0, byte arg1) {
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        return !method391(656, arg0) && !method392(arg0, -807);
    }

    @OriginalMember(owner = "OCOLATKS", name = "a", descriptor = "(IC)Z")
    private static final boolean method390(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(IC)Z")
    private static final boolean method391(int arg0, char arg1) {
        int var2 = 92 / arg0;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(CI)Z")
    private static final boolean method392(char arg0, int arg1) {
        if (arg1 >= 0) {
            field1061 = !field1061;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "OCOLATKS", name = "c", descriptor = "(CB)Z")
    private static final boolean method393(char arg0, byte arg1) {
        if (arg1 != -96) {
            field1062 = 375;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "OCOLATKS", name = "c", descriptor = "(IC)Z")
    private static final boolean method394(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "([CI)Z")
    private static final boolean method395(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method392(arg0[var3], -807) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method396(9, arg0);
        int var5 = 0;
        int var6 = 0 / arg1;
        int var7 = field1071.length - 1;
        if (field1071[var5] == var4 || field1071[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var7) / 2;
            if (field1071[var8] == var4) {
                return true;
            }
            if (var4 < field1071[var8]) {
                var7 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var7 && var5 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "OCOLATKS", name = "b", descriptor = "(I[C)I")
    public static final int method396(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 9) {
            field1063 = !field1063;
        }
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
        return var2;
    }
}
