import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FZULSWUT")
public class class19 {

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "I")
    private static int field850 = 6;

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "I")
    private static int field851 = 4;

    @OriginalMember(owner = "FZULSWUT", name = "c", descriptor = "I")
    private static int field852 = 354;

    @OriginalMember(owner = "FZULSWUT", name = "e", descriptor = "I")
    private static int field854 = 8;

    @OriginalMember(owner = "FZULSWUT", name = "f", descriptor = "I")
    private static int field855 = -163;

    @OriginalMember(owner = "FZULSWUT", name = "g", descriptor = "Z")
    private static boolean field856 = true;

    @OriginalMember(owner = "FZULSWUT", name = "h", descriptor = "Z")
    private static boolean field857 = true;

    @OriginalMember(owner = "FZULSWUT", name = "i", descriptor = "Z")
    private static boolean field858 = true;

    @OriginalMember(owner = "FZULSWUT", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field865 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "FZULSWUT", name = "d", descriptor = "Z")
    private static boolean field853;

    @OriginalMember(owner = "FZULSWUT", name = "q", descriptor = "Z")
    public static boolean field866;

    @OriginalMember(owner = "FZULSWUT", name = "j", descriptor = "[I")
    private static int[] field859;

    @OriginalMember(owner = "FZULSWUT", name = "o", descriptor = "[I")
    private static int[] field864;

    @OriginalMember(owner = "FZULSWUT", name = "k", descriptor = "[[C")
    private static char[][] field860;

    @OriginalMember(owner = "FZULSWUT", name = "m", descriptor = "[[C")
    private static char[][] field862;

    @OriginalMember(owner = "FZULSWUT", name = "n", descriptor = "[[C")
    private static char[][] field863;

    @OriginalMember(owner = "FZULSWUT", name = "l", descriptor = "[[[B")
    private static byte[][][] field861;

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(LEAXVDNXA;)V")
    public static final void method295(class12 arg0) {
        class5 var1 = new class5(2, arg0.method255("fragmentsenc.txt", null));
        class5 var2 = new class5(2, arg0.method255("badenc.txt", null));
        class5 var3 = new class5(2, arg0.method255("domainenc.txt", null));
        class5 var4 = new class5(2, arg0.method255("tldlist.txt", null));
        method296(var1, var2, var3, var4);
        if (class45.field1265) {
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(LCKBTFRZM;LCKBTFRZM;LCKBTFRZM;LCKBTFRZM;)V")
    private static final void method296(class5 arg0, class5 arg1, class5 arg2, class5 arg3) {
        method298(arg1, false);
        method299(arg2, true);
        method300(field852, arg0);
        method297(489, arg3);
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(ILCKBTFRZM;)V")
    private static final void method297(int arg0, class5 arg1) {
        int var2 = arg1.method49();
        int var3 = 33 / arg0;
        field863 = new char[var2][];
        field864 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field864[var4] = arg1.method44();
            char[] var5 = new char[arg1.method44()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method44();
            }
            field863[var4] = var5;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(LCKBTFRZM;Z)V")
    private static final void method298(class5 arg0, boolean arg1) {
        int var2 = arg0.method49();
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field860 = new char[var2][];
        field861 = new byte[var2][][];
        method301(field860, 7, field861, arg0);
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "(LCKBTFRZM;Z)V")
    private static final void method299(class5 arg0, boolean arg1) {
        int var2 = arg0.method49();
        field862 = new char[var2][];
        if (!arg1) {
            field858 = !field858;
        }
        method302(-861, arg0, field862);
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "(ILCKBTFRZM;)V")
    private static final void method300(int arg0, class5 arg1) {
        field859 = new int[arg1.method49()];
        if (arg0 <= 0) {
            field857 = !field857;
        }
        for (int var2 = 0; var2 < field859.length; var2++) {
            field859[var2] = arg1.method46();
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([[CI[[[BLCKBTFRZM;)V")
    private static final void method301(char[][] arg0, int arg1, byte[][][] arg2, class5 arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg3.method44()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method44();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg3.method44()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method44();
                var7[var8][1] = (byte) arg3.method44();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (arg1 < 7 || arg1 > 7) {
            field852 = -345;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(ILCKBTFRZM;[[C)V")
    private static final void method302(int arg0, class5 arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method44()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method44();
            }
            arg2[var3] = var4;
        }
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([CB)V")
    private static final void method303(char[] arg0, byte arg1) {
        int var2 = 0;
        if (arg1 != 9) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (method304(false, arg0[var4])) {
                arg0[var2] = arg0[var4];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var5 = var2; var5 < arg0.length; var5++) {
            arg0[var5] = ' ';
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(ZC)Z")
    private static final boolean method304(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method305(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method303(var4, (byte) 9);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method313(636, var6);
        if (arg0 != 6) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        method308(-127, var6);
        method309(9, var6);
        method322(5, var6);
        for (int var9 = 0; var9 < field865.length; var9++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field865[var9], var12 + 1)) != -1) {
                char[] var13 = field865[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method306(var6, true, var5.toCharArray());
        method307(var6, -37514);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([CZ[C)V")
    private static final void method306(char[] arg0, boolean arg1, char[] arg2) {
        if (!arg1) {
            field857 = !field857;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method330(true, arg2[var3])) {
                arg0[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([CI)V")
    private static final void method307(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 != -37514) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method327(-79, var5)) {
                var2 = true;
            } else if (var2) {
                if (method329(var5, 8)) {
                    var2 = false;
                }
            } else if (method330(true, var5)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(I[C)V")
    private static final void method308(int arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field860.length - 1; var3 >= 0; var3--) {
                method317(624, field861[var3], field860[var3], arg1);
            }
        }
        while (arg0 >= 0) {
            field853 = !field853;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "(I[C)V")
    private static final void method309(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method317(624, null, var3, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg0 >= 9 && arg0 <= 9) {
            method317(624, null, var5, var4);
            for (int var6 = field862.length - 1; var6 >= 0; var6--) {
                method310(field862[var6], var2, var4, true, arg1);
            }
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([C[C[CZ[C)V")
    private static final void method310(char[] arg0, char[] arg1, char[] arg2, boolean arg3, char[] arg4) {
        if (!arg3) {
            field851 = -30;
        }
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg0.length; var6 += var9) {
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
                    if (var8 < arg0.length && (var13 = method319(var11, var12, field854, arg0[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method319(var11, var12, field854, arg0[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method325(false, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method311(arg4, 97, var6, arg1);
                int var17 = method312(arg2, var7 - 1, arg4, 3);
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

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([CII[C)I")
    private static final int method311(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method325(false, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        if (arg1 <= 0) {
            return 4;
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method325(false, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method325(false, arg0[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([CI[CI)I")
    private static final int method312(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 < 3 || arg3 > 3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var5 = arg1 + 1;
        while (true) {
            if (var5 < arg2.length && method325(false, arg2[var5])) {
                if (arg2[var5] != '.' && arg2[var5] != ',') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg2.length && method325(false, arg0[var7]); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method325(false, arg2[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "c", descriptor = "(I[C)V")
    private static final void method313(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method317(624, null, var3, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method317(624, null, var5, var4);
        for (int var6 = 0; var6 < field863.length; var6++) {
            method314(var4, var2, field863[var6], 8, field864[var6], arg1);
        }
        if (arg0 != 636) {
            field857 = !field857;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([C[C[CII[C)V")
    private static final void method314(char[] arg0, char[] arg1, char[] arg2, int arg3, int arg4, char[] arg5) {
        if (arg2.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg2.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg2.length && (var14 = method319(var12, var13, field854, arg2[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method319(var12, var13, field854, arg2[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg2.length || !method325(false, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg2.length) {
                boolean var16 = false;
                int var17 = method315(arg5, var7, arg1, (byte) -57);
                int var18 = method316(arg0, var8 - 1, 2, arg5);
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
                                if (method325(false, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method325(false, arg5[var24])) {
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
                                    if (arg0[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg0[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method325(false, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method325(false, arg5[var28])) {
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
        if (arg3 != 8) {
            field856 = !field856;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "([CI[CB)I")
    private static final int method315(char[] arg0, int arg1, char[] arg2, byte arg3) {
        if (arg3 != -57) {
            return 4;
        } else if (arg1 == 0) {
            return 2;
        } else {
            int var4 = arg1 - 1;
            while (true) {
                if (var4 >= 0 && method325(false, arg0[var4])) {
                    if (arg0[var4] != ',' && arg0[var4] != '.') {
                        var4--;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg1 - 1; var6 >= 0 && method325(false, arg2[var6]); var6--) {
                    if (arg2[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method325(false, arg0[arg1 - 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "([CII[C)I")
    private static final int method316(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 != 2) {
            field856 = !field856;
        }
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method325(false, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method325(false, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method325(false, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(I[[B[C[C)V")
    public static final void method317(int arg0, byte[][] arg1, char[] arg2, char[] arg3) {
        if (arg2.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var5 = 6 / arg0;
        int var10;
        for (int var6 = 0; var6 <= arg3.length - arg2.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label163: while (true) {
                while (true) {
                    if (var7 >= arg3.length || var12 && var13) {
                        break label163;
                    }
                    boolean var14 = false;
                    char var15 = arg3[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg3.length) {
                        var16 = arg3[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg2.length && (var17 = method320(0, var15, arg2[var8], var16)) > 0) {
                        if (var17 == 1 && method328(15817, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method328(15817, var15) || method328(15817, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label163;
                        }
                        int var18;
                        if ((var18 = method320(0, var15, arg2[var8 - 1], var16)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method326(var15, 572)) {
                                break label163;
                            }
                            if (method325(false, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method328(15817, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label163;
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
                    if (var6 - 1 < 0 || method325(false, arg3[var6 - 1]) && arg3[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg3.length || method325(false, arg3[var7]) && arg3[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method325(false, arg3[var27]) || arg3[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg3.length && (!method325(false, arg3[var27 + var29]) || arg3[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg3[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method325(false, arg3[var27 - 1]) || arg3[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method331(var28, 0)) {
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
                        var20 = arg3[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg3.length) {
                        var21 = arg3[var7];
                    }
                    byte var22 = method321((byte) 7, var20);
                    byte var23 = method321((byte) 7, var21);
                    if (arg1 != null && method318(var22, (byte) -109, arg1, var23)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method328(15817, arg3[var34])) {
                            var31++;
                        } else if (method327(-79, arg3[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg3[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean method318(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg1 != -109) {
            field852 = 308;
        }
        if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg0 && arg2[var6][1] == arg3) {
                return true;
            }
            if (arg0 < arg2[var6][0] || arg2[var6][0] == arg0 && arg3 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(CCIC)I")
    private static final int method319(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 < 8 || arg2 > 8) {
            field854 = 87;
        }
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

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(ICCC)I")
    private static final int method320(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            return 0;
        } else if (arg1 == arg2) {
            return 1;
        } else {
            if (arg2 >= 'a' && arg2 <= 'm') {
                if (arg2 == 'a') {
                    if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                        if (arg1 == '/' && arg3 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'b') {
                    if (arg1 != '6' && arg1 != '8') {
                        if ((arg1 != '1' || arg3 != '3') && (arg1 != 'i' || arg3 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg2 == 'c') {
                    if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'd') {
                    if ((arg1 != '[' || arg3 != ')') && (arg1 != 'i' || arg3 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'e') {
                    if (arg1 != '3' && arg1 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'f') {
                    if (arg1 == 'p' && arg3 == 'h') {
                        return 2;
                    }
                    if (arg1 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'g') {
                    if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'h') {
                    if (arg1 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'i') {
                    if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'j') {
                    return 0;
                }
                if (arg2 == 'k') {
                    return 0;
                }
                if (arg2 == 'l') {
                    if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'm') {
                    return 0;
                }
            }
            if (arg2 >= 'n' && arg2 <= 'z') {
                if (arg2 == 'n') {
                    return 0;
                }
                if (arg2 == 'o') {
                    if (arg1 != '0' && arg1 != '*') {
                        if ((arg1 != '(' || arg3 != ')') && (arg1 != '[' || arg3 != ']') && (arg1 != '{' || arg3 != '}') && (arg1 != '<' || arg3 != '>')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg2 == 'p') {
                    return 0;
                }
                if (arg2 == 'q') {
                    return 0;
                }
                if (arg2 == 'r') {
                    return 0;
                }
                if (arg2 == 's') {
                    if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 't') {
                    if (arg1 != '7' && arg1 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'u') {
                    if (arg1 == 'v') {
                        return 1;
                    }
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'v') {
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'w') {
                    if (arg1 == 'v' && arg3 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg2 == 'x') {
                    if ((arg1 != ')' || arg3 != '(') && (arg1 != '}' || arg3 != '{') && (arg1 != ']' || arg3 != '[') && (arg1 != '>' || arg3 != '<')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'y') {
                    return 0;
                }
                if (arg2 == 'z') {
                    return 0;
                }
            }
            if (arg2 >= '0' && arg2 <= '9') {
                if (arg2 == '0') {
                    if (arg1 == 'o' || arg1 == 'O') {
                        return 1;
                    } else if ((arg1 != '(' || arg3 != ')') && (arg1 != '{' || arg3 != '}') && (arg1 != '[' || arg3 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg2 == '1') {
                    return arg1 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg2 == ',') {
                return arg1 == '.' ? 1 : 0;
            } else if (arg2 == '.') {
                return arg1 == ',' ? 1 : 0;
            } else if (arg2 == '!') {
                return arg1 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(BC)B")
    private static final byte method321(byte arg0, char arg1) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            field854 = 344;
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

    @OriginalMember(owner = "FZULSWUT", name = "d", descriptor = "(I[C)V")
    private static final void method322(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 != 5) {
            field857 = !field857;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method323(field855, arg1, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method325(false, arg1[var8]) && !method326(arg1[var8], 572)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method324((byte) 4, var6, arg1);
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

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(I[CI)I")
    private static final int method323(int arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(BI[C)I")
    private static final int method324(byte arg0, int arg1, char[] arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != 4) {
                field858 = !field858;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "(ZC)Z")
    private static final boolean method325(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return !method327(-79, arg1) && !method328(15817, arg1);
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(CI)Z")
    private static final boolean method326(char arg0, int arg1) {
        if (arg1 <= 0) {
            field858 = !field858;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(IC)Z")
    private static final boolean method327(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "(IC)Z")
    private static final boolean method328(int arg0, char arg1) {
        if (arg0 != 15817) {
            field856 = !field856;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "(CI)Z")
    private static final boolean method329(char arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "FZULSWUT", name = "c", descriptor = "(ZC)Z")
    private static final boolean method330(boolean arg0, char arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "FZULSWUT", name = "b", descriptor = "([CI)Z")
    private static final boolean method331(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method328(15817, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method332(true, arg0);
        int var5 = 0;
        int var6 = field859.length - 1;
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (field859[var5] == var4 || field859[var6] == var4) {
            return true;
        } else {
            do {
                int var7 = (var5 + var6) / 2;
                if (field859[var7] == var4) {
                    return true;
                }
                if (var4 < field859[var7]) {
                    var6 = var7;
                } else {
                    var5 = var7;
                }
            } while (var5 != var6 && var5 + 1 != var6);
            return false;
        }
    }

    @OriginalMember(owner = "FZULSWUT", name = "a", descriptor = "(Z[C)I")
    public static final int method332(boolean arg0, char[] arg1) {
        if (!arg0) {
            field855 = 496;
        }
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
        return var2;
    }
}
