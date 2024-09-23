import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JSEWQIYU")
public class class29 {

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "I")
    private static int field906 = 1;

    @OriginalMember(owner = "JSEWQIYU", name = "d", descriptor = "I")
    private static int field908 = 564;

    @OriginalMember(owner = "JSEWQIYU", name = "f", descriptor = "I")
    private static int field910 = 6;

    @OriginalMember(owner = "JSEWQIYU", name = "g", descriptor = "Z")
    private static boolean field911 = true;

    @OriginalMember(owner = "JSEWQIYU", name = "h", descriptor = "Z")
    private static boolean field912 = true;

    @OriginalMember(owner = "JSEWQIYU", name = "i", descriptor = "I")
    private static int field913 = -738;

    @OriginalMember(owner = "JSEWQIYU", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field920 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "JSEWQIYU", name = "e", descriptor = "I")
    private static int field909;

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "Z")
    private static boolean field905;

    @OriginalMember(owner = "JSEWQIYU", name = "c", descriptor = "Z")
    private static boolean field907;

    @OriginalMember(owner = "JSEWQIYU", name = "q", descriptor = "Z")
    public static boolean field921;

    @OriginalMember(owner = "JSEWQIYU", name = "j", descriptor = "[I")
    private static int[] field914;

    @OriginalMember(owner = "JSEWQIYU", name = "o", descriptor = "[I")
    private static int[] field919;

    @OriginalMember(owner = "JSEWQIYU", name = "k", descriptor = "[[C")
    private static char[][] field915;

    @OriginalMember(owner = "JSEWQIYU", name = "m", descriptor = "[[C")
    private static char[][] field917;

    @OriginalMember(owner = "JSEWQIYU", name = "n", descriptor = "[[C")
    private static char[][] field918;

    @OriginalMember(owner = "JSEWQIYU", name = "l", descriptor = "[[[B")
    private static byte[][][] field916;

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(LBYZSQZUF;)V")
    public static final void method280(class7 arg0) {
        class24 var1 = new class24(0, arg0.method29("fragmentsenc.txt", null));
        class24 var2 = new class24(0, arg0.method29("badenc.txt", null));
        class24 var3 = new class24(0, arg0.method29("domainenc.txt", null));
        class24 var4 = new class24(0, arg0.method29("tldlist.txt", null));
        method281(var1, var2, var3, var4);
        if (class64.field1590) {
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(LIMUIZRAF;LIMUIZRAF;LIMUIZRAF;LIMUIZRAF;)V")
    private static final void method281(class24 arg0, class24 arg1, class24 arg2, class24 arg3) {
        method283(2, arg1);
        method284(0, arg2);
        method285(arg0, (byte) -80);
        method282(arg3, 3);
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(LIMUIZRAF;I)V")
    private static final void method282(class24 arg0, int arg1) {
        int var2 = arg0.method243();
        field918 = new char[var2][];
        field919 = new int[var2];
        if (arg1 != 3) {
            field912 = true;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field919[var3] = arg0.method238();
            char[] var4 = new char[arg0.method238()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method238();
            }
            field918[var3] = var4;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(ILIMUIZRAF;)V")
    private static final void method283(int arg0, class24 arg1) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = arg1.method243();
        field915 = new char[var3][];
        field916 = new byte[var3][][];
        method286(-49103, field916, arg1, field915);
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(ILIMUIZRAF;)V")
    private static final void method284(int arg0, class24 arg1) {
        int var2 = arg1.method243();
        field917 = new char[var2][];
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        method287(arg1, field917, 1);
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(LIMUIZRAF;B)V")
    private static final void method285(class24 arg0, byte arg1) {
        field914 = new int[arg0.method243()];
        if (arg1 == -80) {
            for (int var2 = 0; var2 < field914.length; var2++) {
                field914[var2] = arg0.method240();
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(I[[[BLIMUIZRAF;[[C)V")
    private static final void method286(int arg0, byte[][][] arg1, class24 arg2, char[][] arg3) {
        if (arg0 != -49103) {
            field912 = true;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg2.method238()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method238();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg2.method238()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method238();
                var7[var8][1] = (byte) arg2.method238();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(LIMUIZRAF;[[CI)V")
    private static final void method287(class24 arg0, char[][] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method238()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method238();
            }
            arg1[var3] = var4;
        }
        if (field906 == arg2) {
            ;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(I[C)V")
    private static final void method288(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method289(arg1[var3], 4)) {
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
        while (arg0 >= 0) {
            field912 = true;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(CI)Z")
    private static final boolean method289(char arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method290(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method288(-198, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method298((byte) -15, var6);
        method293(false, var6);
        method294(field907, var6);
        int var8 = 75 / arg1;
        method307(142, var6);
        for (int var9 = 0; var9 < field920.length; var9++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field920[var9], var12 + 1)) != -1) {
                char[] var13 = field920[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method291(var5.toCharArray(), var6, false);
        method292(-35122, var6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([C[CZ)V")
    private static final void method291(char[] arg0, char[] arg1, boolean arg2) {
        if (arg2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (arg1[var4] != '*' && method315(field910, arg0[var4])) {
                arg1[var4] = arg0[var4];
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(I[C)V")
    private static final void method292(int arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 != -35122) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method312((byte) 2, var5)) {
                var2 = true;
            } else if (var2) {
                if (method314(var5, -862)) {
                    var2 = false;
                }
            } else if (method315(field910, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(Z[C)V")
    private static final void method293(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field915.length - 1; var4 >= 0; var4--) {
                method302(arg1, false, field915[var4], field916[var4]);
            }
        }
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(Z[C)V")
    private static final void method294(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method302(var2, false, var3, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg0) {
            field912 = true;
        }
        method302(var4, false, var5, null);
        for (int var6 = field917.length - 1; var6 >= 0; var6--) {
            method295(field917[var6], var2, -698, var4, arg1);
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method295(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg0.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label64: while (true) {
                while (true) {
                    if (var7 >= arg4.length) {
                        break label64;
                    }
                    boolean var10 = false;
                    char var11 = arg4[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg4.length) {
                        var12 = arg4[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg0.length && (var13 = method304(var12, arg0[var8], false, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label64;
                        }
                        int var14;
                        if ((var14 = method304(var12, arg0[var8 - 1], false, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method310(-304, var11)) {
                                break label64;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method296(var6, arg1, 0, arg4);
                int var17 = method297(arg3, (byte) 8, arg4, var7 - 1);
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
        if (arg2 >= 0) {
            field912 = true;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(I[CI[C)I")
    private static final int method296(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method310(-304, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method310(-304, arg1[var6]); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (arg2 != 0) {
            field913 = -333;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method310(-304, arg3[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([CB[CI)I")
    private static final int method297(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method310(-304, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 == 8) {
                boolean var6 = false;
            } else {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            for (int var8 = arg3 + 1; var8 < arg2.length && method310(-304, arg0[var8]); var8++) {
                if (arg0[var8] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method310(-304, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(B[C)V")
    private static final void method298(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method302(var2, false, var3, null);
        char[] var4 = (char[]) arg1.clone();
        if (arg0 != -15) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method302(var4, false, var6, null);
        for (int var7 = 0; var7 < field918.length; var7++) {
            method299(var2, 76, var4, arg1, field919[var7], field918[var7]);
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([CI[C[CI[C)V")
    private static final void method299(char[] arg0, int arg1, char[] arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var7 = 46 / arg1;
        int var11;
        for (int var8 = 0; var8 <= arg3.length - arg5.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label124: while (true) {
                while (true) {
                    if (var9 >= arg3.length) {
                        break label124;
                    }
                    boolean var12 = false;
                    char var13 = arg3[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg3.length) {
                        var14 = arg3[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg5.length && (var15 = method304(var14, arg5[var10], false, var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label124;
                        }
                        int var16;
                        if ((var16 = method304(var14, arg5[var10 - 1], false, var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg5.length || !method310(-304, var13)) {
                                break label124;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg5.length) {
                boolean var17 = false;
                int var18 = method300(var8, arg3, 7, arg0);
                int var19 = method301(var9 - 1, arg3, arg2, (byte) 0);
                if (arg4 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg4 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg4 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg4 == 3 && var18 > 2 && var19 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var17) {
                    int var20 = var8;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var8 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg0[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg0[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method310(-304, arg3[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method310(-304, arg3[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg3.length; var27++) {
                                if (var26) {
                                    if (arg2[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg2[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg3.length; var29++) {
                            if (var28) {
                                if (method310(-304, arg3[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method310(-304, arg3[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg3[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(I[CI[C)I")
    private static final int method300(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 < 7 || arg2 > 7) {
            return field906;
        } else if (arg0 == 0) {
            return 2;
        } else {
            int var4 = arg0 - 1;
            while (true) {
                if (var4 >= 0 && method310(-304, arg1[var4])) {
                    if (arg1[var4] != ',' && arg1[var4] != '.') {
                        var4--;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg0 - 1; var6 >= 0 && method310(-304, arg3[var6]); var6--) {
                    if (arg3[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method310(-304, arg1[arg0 - 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(I[C[CB)I")
    private static final int method301(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method310(-304, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg3 == 0) {
                boolean var5 = false;
            } else {
                field912 = true;
            }
            int var6 = 0;
            for (int var7 = arg0 + 1; var7 < arg1.length && method310(-304, arg2[var7]); var7++) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method310(-304, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([CZ[C[[B)V")
    public static final void method302(char[] arg0, boolean arg1, char[] arg2, byte[][] arg3) {
        if (arg1 || arg2.length > arg0.length) {
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
            label167: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg2.length && (var16 = method305(arg2[var7], var14, false, var15)) > 0) {
                        if (var16 == 1 && method313(var14, (byte) 4)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method313(var14, (byte) 4) || method313(var15, (byte) 4))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method305(arg2[var7 - 1], var14, false, var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method311(var14, 0)) {
                                break label167;
                            }
                            if (method310(-304, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method313(var14, (byte) 4)) {
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
            if (var7 >= arg2.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method310(-304, arg0[var5 - 1]) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method310(-304, arg0[var6]) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method310(-304, arg0[var26]) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method310(-304, arg0[var26 + var28]) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method310(-304, arg0[var26 - 1]) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method316(var27, 0)) {
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
                    byte var21 = method306(564, var19);
                    byte var22 = method306(564, var20);
                    if (arg3 != null && method303(var22, arg3, var21, false)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method313(arg0[var33], (byte) 4)) {
                            var30++;
                        } else if (method312((byte) 2, arg0[var33])) {
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

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(B[[BBZ)Z")
    private static final boolean method303(byte arg0, byte[][] arg1, byte arg2, boolean arg3) {
        if (arg3) {
            field905 = !field905;
        }
        int var4 = 0;
        if (arg1[var4][0] == arg2 && arg1[var4][1] == arg0) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg2 && arg1[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg2 && arg1[var6][1] == arg0) {
                return true;
            }
            if (arg2 < arg1[var6][0] || arg1[var6][0] == arg2 && arg0 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(CCZC)I")
    private static final int method304(char arg0, char arg1, boolean arg2, char arg3) {
        if (arg2) {
            field905 = !field905;
        }
        if (arg1 == arg3) {
            return 1;
        } else if (arg1 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg3 == '(' && arg0 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg1 == 's' && arg3 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(CCZC)I")
    private static final int method305(char arg0, char arg1, boolean arg2, char arg3) {
        if (arg2) {
            return field913;
        } else if (arg0 == arg1) {
            return 1;
        } else {
            if (arg0 >= 'a' && arg0 <= 'm') {
                if (arg0 == 'a') {
                    if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                        if (arg1 == '/' && arg3 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'b') {
                    if (arg1 != '6' && arg1 != '8') {
                        if ((arg1 != '1' || arg3 != '3') && (arg1 != 'i' || arg3 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg0 == 'c') {
                    if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'd') {
                    if ((arg1 != '[' || arg3 != ')') && (arg1 != 'i' || arg3 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'e') {
                    if (arg1 != '3' && arg1 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'f') {
                    if (arg1 == 'p' && arg3 == 'h') {
                        return 2;
                    }
                    if (arg1 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'g') {
                    if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'h') {
                    if (arg1 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'i') {
                    if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                    if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                    if (arg1 != '0' && arg1 != '*') {
                        if ((arg1 != '(' || arg3 != ')') && (arg1 != '[' || arg3 != ']') && (arg1 != '{' || arg3 != '}') && (arg1 != '<' || arg3 != '>')) {
                            return 0;
                        }
                        return 2;
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
                    if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 't') {
                    if (arg1 != '7' && arg1 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'u') {
                    if (arg1 == 'v') {
                        return 1;
                    }
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'v') {
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'w') {
                    if (arg1 == 'v' && arg3 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg0 == 'x') {
                    if ((arg1 != ')' || arg3 != '(') && (arg1 != '}' || arg3 != '{') && (arg1 != ']' || arg3 != '[') && (arg1 != '>' || arg3 != '<')) {
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
                    if (arg1 == 'o' || arg1 == 'O') {
                        return 1;
                    } else if ((arg1 != '(' || arg3 != ')') && (arg1 != '{' || arg3 != '}') && (arg1 != '[' || arg3 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg0 == '1') {
                    return arg1 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg0 == ',') {
                return arg1 == '.' ? 1 : 0;
            } else if (arg0 == '.') {
                return arg1 == ',' ? 1 : 0;
            } else if (arg0 == '!') {
                return arg1 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(IC)B")
    private static final byte method306(int arg0, char arg1) {
        int var2 = 1 / arg0;
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

    @OriginalMember(owner = "JSEWQIYU", name = "c", descriptor = "(I[C)V")
    private static final void method307(int arg0, char[] arg1) {
        if (arg0 <= 0) {
            field906 = 37;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method308(arg1, (byte) 6, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method310(-304, arg1[var8]) && !method311(arg1[var8], 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method309(field909, arg1, var6);
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

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([CBI)I")
    private static final int method308(char[] arg0, byte arg1, int arg2) {
        if (arg1 != 6) {
            return 2;
        }
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(I[CI)I")
    private static final int method309(int arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != 0) {
                field907 = true;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(IC)Z")
    private static final boolean method310(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return !method312((byte) 2, arg1) && !method313(arg1, (byte) 4);
    }

    @OriginalMember(owner = "JSEWQIYU", name = "b", descriptor = "(CI)Z")
    private static final boolean method311(char arg0, int arg1) {
        if (arg1 != 0) {
            field906 = -83;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(BC)Z")
    private static final boolean method312(byte arg0, char arg1) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "(CB)Z")
    private static final boolean method313(char arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var2 = false;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "JSEWQIYU", name = "c", descriptor = "(CI)Z")
    private static final boolean method314(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "c", descriptor = "(IC)Z")
    private static final boolean method315(int arg0, char arg1) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([CI)Z")
    private static final boolean method316(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method313(arg0[var3], (byte) 4) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method317(arg0, (byte) 1);
        int var5 = 0;
        int var6 = field914.length - 1;
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (field914[var5] == var4 || field914[var6] == var4) {
            return true;
        } else {
            do {
                int var7 = (var5 + var6) / 2;
                if (field914[var7] == var4) {
                    return true;
                }
                if (var4 < field914[var7]) {
                    var6 = var7;
                } else {
                    var5 = var7;
                }
            } while (var5 != var6 && var5 + 1 != var6);
            return false;
        }
    }

    @OriginalMember(owner = "JSEWQIYU", name = "a", descriptor = "([CB)I")
    public static final int method317(char[] arg0, byte arg1) {
        if (arg1 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0.length > 6) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[arg0.length - var4 - 1];
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
