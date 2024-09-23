import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HUPJRXOW")
public class class25 {

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "I")
    private static int field868 = -73;

    @OriginalMember(owner = "HUPJRXOW", name = "c", descriptor = "Z")
    private static boolean field870 = true;

    @OriginalMember(owner = "HUPJRXOW", name = "e", descriptor = "I")
    private static int field872 = -726;

    @OriginalMember(owner = "HUPJRXOW", name = "g", descriptor = "I")
    private static int field874 = 34839;

    @OriginalMember(owner = "HUPJRXOW", name = "h", descriptor = "I")
    private static int field875 = 512;

    @OriginalMember(owner = "HUPJRXOW", name = "i", descriptor = "I")
    private static int field876 = 6;

    @OriginalMember(owner = "HUPJRXOW", name = "j", descriptor = "I")
    private static int field877 = 4;

    @OriginalMember(owner = "HUPJRXOW", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field884 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "HUPJRXOW", name = "d", descriptor = "I")
    private static int field871;

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "Z")
    private static boolean field869;

    @OriginalMember(owner = "HUPJRXOW", name = "f", descriptor = "Z")
    private static boolean field873;

    @OriginalMember(owner = "HUPJRXOW", name = "r", descriptor = "Z")
    public static boolean field885;

    @OriginalMember(owner = "HUPJRXOW", name = "k", descriptor = "[I")
    private static int[] field878;

    @OriginalMember(owner = "HUPJRXOW", name = "p", descriptor = "[I")
    private static int[] field883;

    @OriginalMember(owner = "HUPJRXOW", name = "l", descriptor = "[[C")
    private static char[][] field879;

    @OriginalMember(owner = "HUPJRXOW", name = "n", descriptor = "[[C")
    private static char[][] field881;

    @OriginalMember(owner = "HUPJRXOW", name = "o", descriptor = "[[C")
    private static char[][] field882;

    @OriginalMember(owner = "HUPJRXOW", name = "m", descriptor = "[[[B")
    private static byte[][][] field880;

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(LXRWUKRPO;)V")
    public static final void method288(class65 arg0) {
        class21 var1 = new class21(arg0.method581("fragmentsenc.txt", null), -49015);
        class21 var2 = new class21(arg0.method581("badenc.txt", null), -49015);
        class21 var3 = new class21(arg0.method581("domainenc.txt", null), -49015);
        class21 var4 = new class21(arg0.method581("tldlist.txt", null), -49015);
        method289(var1, var2, var3, var4);
        if (class62.field1590) {
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(LGLMIQHJI;LGLMIQHJI;LGLMIQHJI;LGLMIQHJI;)V")
    private static final void method289(class21 arg0, class21 arg1, class21 arg2, class21 arg3) {
        method291(field871, arg1);
        method292(4232, arg2);
        method293(arg0, true);
        method290(arg3, true);
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(LGLMIQHJI;Z)V")
    private static final void method290(class21 arg0, boolean arg1) {
        int var2 = arg0.method249();
        if (!arg1) {
            return;
        }
        field882 = new char[var2][];
        field883 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field883[var3] = arg0.method244();
            char[] var4 = new char[arg0.method244()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method244();
            }
            field882[var3] = var4;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(ILGLMIQHJI;)V")
    private static final void method291(int arg0, class21 arg1) {
        int var2 = arg1.method249();
        field879 = new char[var2][];
        field880 = new byte[var2][][];
        method294(field879, (byte) -97, field880, arg1);
        if (arg0 != 0) {
            field869 = true;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "(ILGLMIQHJI;)V")
    private static final void method292(int arg0, class21 arg1) {
        int var2 = arg1.method249();
        field881 = new char[var2][];
        method295(field881, arg1, -726);
        if (arg0 != 4232) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "(LGLMIQHJI;Z)V")
    private static final void method293(class21 arg0, boolean arg1) {
        if (!arg1) {
            field870 = !field870;
        }
        field878 = new int[arg0.method249()];
        for (int var2 = 0; var2 < field878.length; var2++) {
            field878[var2] = arg0.method246();
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([[CB[[[BLGLMIQHJI;)V")
    private static final void method294(char[][] arg0, byte arg1, byte[][][] arg2, class21 arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg3.method244()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method244();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg3.method244()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method244();
                var7[var8][1] = (byte) arg3.method244();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (arg1 != -97) {
            field877 = 23;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([[CLGLMIQHJI;I)V")
    private static final void method295(char[][] arg0, class21 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method244()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method244();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(Z[C)V")
    private static final void method296(boolean arg0, char[] arg1) {
        int var2 = 0;
        if (arg0) {
            field877 = 67;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method297(arg1[var3], field873)) {
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
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(CZ)Z")
    private static final boolean method297(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method298(String arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method296(false, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method306(var6, (byte) 8);
        method301(-277, var6);
        method302(3, var6);
        method315(var6, 525);
        for (int var8 = 0; var8 < field884.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field884[var8], var11 + 1)) != -1) {
                char[] var12 = field884[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method299(-349, var5.toCharArray(), var6);
        method300(var6, (byte) 105);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(I[C[C)V")
    private static final void method299(int arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg2[var3] != '*' && method323(arg1[var3], -122)) {
                arg2[var3] = arg1[var3];
            }
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([CB)V")
    private static final void method300(char[] arg0, byte arg1) {
        boolean var2 = true;
        if (arg1 != 105) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method320(var4, -625)) {
                var2 = true;
            } else if (var2) {
                if (method322(var4, -71)) {
                    var2 = false;
                }
            } else if (method323(var4, -122)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(I[C)V")
    private static final void method301(int arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field879.length - 1; var3 >= 0; var3--) {
                method310(field880[var3], arg1, field879[var3], field875);
            }
        }
        if (arg0 >= 0) {
            field870 = !field870;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "(I[C)V")
    private static final void method302(int arg0, char[] arg1) {
        if (arg0 != 3) {
            field872 = -172;
        }
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method310(null, var2, var3, field875);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method310(null, var4, var5, field875);
        for (int var6 = field881.length - 1; var6 >= 0; var6--) {
            method303(false, var4, field881[var6], var2, arg1);
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(Z[C[C[C[C)V")
    private static final void method303(boolean arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0) {
            field872 = 154;
        }
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
                    if (var8 < arg2.length && (var13 = method312(var12, 175, var11, arg2[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method312(var12, 175, var11, arg2[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method318(0, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method304(arg3, var6, (byte) 5, arg4);
                int var17 = method305(var7 - 1, 0, arg1, arg4);
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
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([CIB[C)I")
    private static final int method304(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method318(0, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method318(0, arg0[var6]); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (arg2 != 5) {
            return field875;
        }
        boolean var7 = false;
        if (var5 >= 3) {
            return 4;
        } else if (method318(0, arg3[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(II[C[C)I")
    private static final int method305(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method318(0, arg3[var4])) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != 0) {
                field869 = true;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg3.length && method318(0, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method318(0, arg3[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "([CB)V")
    private static final void method306(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method310(null, var2, var3, field875);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method310(null, var4, var5, field875);
        for (int var6 = 0; var6 < field882.length; var6++) {
            method307(field882[var6], var4, field883[var6], var2, arg0, true);
        }
        if (arg1 == 8) {
            boolean var7 = false;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([C[CI[C[CZ)V")
    private static final void method307(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, boolean arg5) {
        if (!arg5) {
            field873 = !field873;
        }
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method312(var13, 175, var12, arg0[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method312(var13, 175, var12, arg0[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method318(0, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method308(34839, arg4, arg3, var7);
                int var18 = method309(arg1, arg4, true, var8 - 1);
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
                                    if (arg3[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg3[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method318(0, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method318(0, arg4[var24])) {
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
                                if (method318(0, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method318(0, arg4[var28])) {
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

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(I[C[CI)I")
    private static final int method308(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method318(0, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method318(0, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (field874 != arg0) {
                field873 = !field873;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method318(0, arg1[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([C[CZI)I")
    private static final int method309(char[] arg0, char[] arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return field875;
        } else if (arg3 + 1 == arg1.length) {
            return 2;
        } else {
            int var4 = arg3 + 1;
            while (true) {
                if (var4 < arg1.length && method318(0, arg1[var4])) {
                    if (arg1[var4] != '\\' && arg1[var4] != '/') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg3 + 1; var6 < arg1.length && method318(0, arg0[var6]); var6++) {
                    if (arg0[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 5) {
                    return 4;
                }
                if (method318(0, arg1[arg3 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method310(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label176: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label176;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg2.length && (var17 = method313(var16, arg2[var8], field876, var15)) > 0) {
                        if (var17 == 1 && method321(true, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method321(true, var15) || method321(true, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label176;
                        }
                        int var18;
                        if ((var18 = method313(var16, arg2[var8 - 1], field876, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method319(-22185, var15)) {
                                break label176;
                            }
                            if (method318(0, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method321(true, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label176;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg2.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var5 - 1 < 0 || method318(0, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method318(0, arg1[var7]) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method318(0, arg1[var27]) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method318(0, arg1[var27 + var29]) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method318(0, arg1[var27 - 1]) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method324((byte) 7, var28)) {
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
                    if (var5 - 1 >= 0) {
                        var20 = arg1[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg1.length) {
                        var21 = arg1[var7];
                    }
                    byte var22 = method314(-105, var20);
                    byte var23 = method314(-105, var21);
                    if (arg0 != null && method311(arg0, var23, false, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method321(true, arg1[var34])) {
                            var31++;
                        } else if (method320(arg1[var34], -625)) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg1[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
        if (arg3 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([[BBZB)Z")
    private static final boolean method311(byte[][] arg0, byte arg1, boolean arg2, byte arg3) {
        int var4 = 0;
        if (arg2) {
            field871 = 172;
        }
        if (arg0[var4][0] == arg3 && arg0[var4][1] == arg1) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg0[var5][0] == arg3 && arg0[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg0[var6][0] == arg3 && arg0[var6][1] == arg1) {
                return true;
            }
            if (arg3 < arg0[var6][0] || arg0[var6][0] == arg3 && arg1 < arg0[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(CICC)I")
    private static final int method312(char arg0, int arg1, char arg2, char arg3) {
        int var4 = 21 / arg1;
        if (arg2 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg2 == '(' && arg0 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg3 == 's' && arg2 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(CCIC)I")
    private static final int method313(char arg0, char arg1, int arg2, char arg3) {
        if (field876 != arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg3) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                    if (arg3 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg3 != '6' && arg3 != '8') {
                    if ((arg3 != '1' || arg0 != '3') && (arg3 != 'i' || arg0 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg1 == 'c') {
                if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'd') {
                if ((arg3 != '[' || arg0 != ')') && (arg3 != 'i' || arg0 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'e') {
                if (arg3 != '3' && arg3 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'f') {
                if (arg3 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg3 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'g') {
                if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'h') {
                if (arg3 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'i') {
                if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'j') {
                return 0;
            }
            if (arg1 == 'k') {
                return 0;
            }
            if (arg1 == 'l') {
                if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'm') {
                return 0;
            }
        }
        if (arg1 >= 'n' && arg1 <= 'z') {
            if (arg1 == 'n') {
                return 0;
            }
            if (arg1 == 'o') {
                if (arg3 != '0' && arg3 != '*') {
                    if (arg3 == '(' && arg0 == ')' || arg3 == '[' && arg0 == ']' || arg3 == '{' && arg0 == '}' || arg3 == '<' && arg0 == '>') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'p') {
                return 0;
            }
            if (arg1 == 'q') {
                return 0;
            }
            if (arg1 == 'r') {
                return 0;
            }
            if (arg1 == 's') {
                if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 't') {
                if (arg3 != '7' && arg3 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'u') {
                if (arg3 == 'v') {
                    return 1;
                }
                if (arg3 == '\\' && arg0 == '/' || arg3 == '\\' && arg0 == '|' || arg3 == '|' && arg0 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'v') {
                if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg3 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg3 != ')' || arg0 != '(') && (arg3 != '}' || arg0 != '{') && (arg3 != ']' || arg0 != '[') && (arg3 != '>' || arg0 != '<')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'y') {
                return 0;
            }
            if (arg1 == 'z') {
                return 0;
            }
        }
        if (arg1 >= '0' && arg1 <= '9') {
            if (arg1 == '0') {
                if (arg3 == 'o' || arg3 == 'O') {
                    return 1;
                } else if ((arg3 != '(' || arg0 != ')') && (arg3 != '{' || arg0 != '}') && (arg3 != '[' || arg0 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg1 == '1') {
                return arg3 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg1 == ',') {
            return arg3 == '.' ? 1 : 0;
        } else if (arg1 == '.') {
            return arg3 == ',' ? 1 : 0;
        } else if (arg1 == '!') {
            return arg3 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(IC)B")
    private static final byte method314(int arg0, char arg1) {
        while (arg0 >= 0) {
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

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([CI)V")
    private static final void method315(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method316(arg0, var3, 0)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method318(0, arg0[var9]) && !method319(-22185, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var3 = method317(arg0, var7, 4);
                int var10 = 0;
                for (int var11 = var7; var11 < var3; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var3 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var3; var12++) {
                arg0[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "([CII)I")
    private static final int method316(char[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field870 = !field870;
        }
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "([CII)I")
    private static final int method317(char[] arg0, int arg1, int arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (field877 != arg2) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "(IC)Z")
    private static final boolean method318(int arg0, char arg1) {
        if (arg0 != 0) {
            field871 = 256;
        }
        return !method320(arg1, -625) && !method321(true, arg1);
    }

    @OriginalMember(owner = "HUPJRXOW", name = "c", descriptor = "(IC)Z")
    private static final boolean method319(int arg0, char arg1) {
        if (arg0 != -22185) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(CI)Z")
    private static final boolean method320(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(ZC)Z")
    private static final boolean method321(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "(CI)Z")
    private static final boolean method322(char arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "HUPJRXOW", name = "c", descriptor = "(CI)Z")
    private static final boolean method323(char arg0, int arg1) {
        while (arg1 >= 0) {
            field876 = 204;
        }
        if (arg0 >= 'A' && arg0 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "HUPJRXOW", name = "a", descriptor = "(B[C)Z")
    private static final boolean method324(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            if (!method321(true, arg1[var5]) && arg1[var5] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var6 = method325(arg1, 0);
        int var7 = 0;
        int var8 = field878.length - 1;
        if (field878[var7] == var6 || field878[var8] == var6) {
            return true;
        }
        do {
            int var9 = (var7 + var8) / 2;
            if (field878[var9] == var6) {
                return true;
            }
            if (var6 < field878[var9]) {
                var8 = var9;
            } else {
                var7 = var9;
            }
        } while (var7 != var8 && var7 + 1 != var8);
        return false;
    }

    @OriginalMember(owner = "HUPJRXOW", name = "b", descriptor = "([CI)I")
    public static final int method325(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var5 = arg0[arg0.length - var3 - 1];
            if (var5 >= 'a' && var5 <= 'z') {
                var2 = var2 * 38 + var5 + 1 - 'a';
            } else if (var5 == '\'') {
                var2 = var2 * 38 + 27;
            } else if (var5 >= '0' && var5 <= '9') {
                var2 = var2 * 38 + var5 + 28 - '0';
            } else if (var5 != '\u0000') {
                return 0;
            }
        }
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }
}
