import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PPZVZYJC")
public class class47 {

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "I")
    private static int field1309 = 42058;

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "I")
    private static int field1310 = 875;

    @OriginalMember(owner = "client!PPZVZYJC", name = "c", descriptor = "Z")
    private static boolean field1311 = true;

    @OriginalMember(owner = "client!PPZVZYJC", name = "e", descriptor = "Z")
    private static boolean field1313 = true;

    @OriginalMember(owner = "client!PPZVZYJC", name = "g", descriptor = "Z")
    private static boolean field1315 = true;

    @OriginalMember(owner = "client!PPZVZYJC", name = "h", descriptor = "I")
    private static int field1316 = 969;

    @OriginalMember(owner = "client!PPZVZYJC", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1324 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!PPZVZYJC", name = "d", descriptor = "I")
    private static int field1312;

    @OriginalMember(owner = "client!PPZVZYJC", name = "f", descriptor = "Z")
    private static boolean field1314;

    @OriginalMember(owner = "client!PPZVZYJC", name = "i", descriptor = "Z")
    private static boolean field1317;

    @OriginalMember(owner = "client!PPZVZYJC", name = "q", descriptor = "Z")
    public static boolean field1325;

    @OriginalMember(owner = "client!PPZVZYJC", name = "j", descriptor = "[I")
    private static int[] field1318;

    @OriginalMember(owner = "client!PPZVZYJC", name = "o", descriptor = "[I")
    private static int[] field1323;

    @OriginalMember(owner = "client!PPZVZYJC", name = "k", descriptor = "[[C")
    private static char[][] field1319;

    @OriginalMember(owner = "client!PPZVZYJC", name = "m", descriptor = "[[C")
    private static char[][] field1321;

    @OriginalMember(owner = "client!PPZVZYJC", name = "n", descriptor = "[[C")
    private static char[][] field1322;

    @OriginalMember(owner = "client!PPZVZYJC", name = "l", descriptor = "[[[B")
    private static byte[][][] field1320;

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(LHBJEXSJX;)V")
    public static final void method470(class24 arg0) {
        class18 var1 = new class18(arg0.method348("fragmentsenc.txt", null), 0);
        class18 var2 = new class18(arg0.method348("badenc.txt", null), 0);
        class18 var3 = new class18(arg0.method348("domainenc.txt", null), 0);
        class18 var4 = new class18(arg0.method348("tldlist.txt", null), 0);
        method471(var1, var2, var3, var4);
        if (class13.field714) {
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(LEYMNCFMK;LEYMNCFMK;LEYMNCFMK;LEYMNCFMK;)V")
    private static final void method471(class18 arg0, class18 arg1, class18 arg2, class18 arg3) {
        method473(arg1, (byte) 0);
        method474(arg2, -58);
        method475(arg0, (byte) 0);
        method472(-261, arg3);
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(ILEYMNCFMK;)V")
    private static final void method472(int arg0, class18 arg1) {
        int var2 = arg1.method244();
        field1322 = new char[var2][];
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1323 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1323[var4] = arg1.method239();
            char[] var5 = new char[arg1.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method239();
            }
            field1322[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(LEYMNCFMK;B)V")
    private static final void method473(class18 arg0, byte arg1) {
        int var2 = arg0.method244();
        field1319 = new char[var2][];
        if (arg1 == 0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1320 = new byte[var2][][];
        method476(field1319, 376, field1320, arg0);
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(LEYMNCFMK;I)V")
    private static final void method474(class18 arg0, int arg1) {
        int var2 = arg0.method244();
        field1321 = new char[var2][];
        if (arg1 < 0) {
            method477(arg0, true, field1321);
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(LEYMNCFMK;B)V")
    private static final void method475(class18 arg0, byte arg1) {
        field1318 = new int[arg0.method244()];
        if (arg1 == 0) {
            boolean var2 = false;
            for (int var3 = 0; var3 < field1318.length; var3++) {
                field1318[var3] = arg0.method241();
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([[CI[[[BLEYMNCFMK;)V")
    private static final void method476(char[][] arg0, int arg1, byte[][][] arg2, class18 arg3) {
        if (arg1 != 376) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            char[] var6 = new char[arg3.method239()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg3.method239();
            }
            arg0[var5] = var6;
            byte[][] var8 = new byte[arg3.method239()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg3.method239();
                var8[var9][1] = (byte) arg3.method239();
            }
            if (var8.length > 0) {
                arg2[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(LEYMNCFMK;Z[[C)V")
    private static final void method477(class18 arg0, boolean arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method239()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method239();
            }
            arg2[var3] = var4;
        }
        if (!arg1) {
            field1311 = !field1311;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Z[C)V")
    private static final void method478(boolean arg0, char[] arg1) {
        int var2 = 0;
        if (!arg0) {
            field1311 = !field1311;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method479(arg1[var3], false)) {
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

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CZ)Z")
    private static final boolean method479(char arg0, boolean arg1) {
        if (arg1) {
            field1312 = -286;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method480(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method478(true, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        if (arg0) {
            throw new NullPointerException();
        }
        method488(var6, 62);
        method483(-822, var6);
        method484(var6, (byte) 5);
        method497(var6, -923);
        for (int var8 = 0; var8 < field1324.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1324[var8], var11 + 1)) != -1) {
                char[] var12 = field1324[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method481(var6, var5.toCharArray(), (byte) -124);
        method482(false, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([C[CB)V")
    private static final void method481(char[] arg0, char[] arg1, byte arg2) {
        if (arg2 != -124) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (arg0[var4] != '*' && method505(arg1[var4], false)) {
                arg0[var4] = arg1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(Z[C)V")
    private static final void method482(boolean arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var5 = arg1[var3];
            if (!method502((byte) -10, var5)) {
                var2 = true;
            } else if (var2) {
                if (method504(var5, 8)) {
                    var2 = false;
                }
            } else if (method505(var5, false)) {
                arg1[var3] = (char) (var5 + 'a' - 65);
            }
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[C)V")
    private static final void method483(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1319.length - 1; var3 >= 0; var3--) {
                method492(field1320[var3], arg1, field1319[var3], false);
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CB)V")
    private static final void method484(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 == 5) {
            boolean var3 = false;
        } else {
            field1310 = -424;
        }
        char[] var4 = new char[] { '(', 'a', ')' };
        method492(null, var2, var4, false);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method492(null, var5, var6, false);
        for (int var7 = field1321.length - 1; var7 >= 0; var7--) {
            method485(0, field1321[var7], var5, arg0, var2);
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method485(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        if (arg0 != 0) {
            field1310 = -177;
        }
        int var9;
        for (int var6 = 0; var6 <= arg3.length - arg1.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg3.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg3[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg3.length) {
                        var12 = arg3[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg1.length && (var13 = method494(arg1[var8], true, var11, var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method494(arg1[var8 - 1], true, var11, var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method500(var11, field1316)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method486(var6, arg4, arg3, 8);
                int var17 = method487(arg2, var7 - 1, arg3, 0);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg3[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[C[CI)I")
    private static final int method486(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method500(arg2[var4], field1316); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg3 < 8 || arg3 > 8) {
            field1316 = -463;
        }
        for (int var6 = arg0 - 1; var6 >= 0 && method500(arg1[var6], field1316); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method500(arg2[arg0 - 1], field1316)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CI[CI)I")
    private static final int method487(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method500(arg2[var4], field1316)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != 0) {
                return field1309;
            }
            for (int var6 = arg1 + 1; var6 < arg2.length && method500(arg0[var6], field1316); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method500(arg2[arg1 + 1], field1316)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CI)V")
    private static final void method488(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method492(null, var2, var3, false);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method492(null, var4, var5, false);
        for (int var6 = 0; var6 < field1322.length; var6++) {
            method489(field1323[var6], var2, field1315, arg0, var4, field1322[var6]);
        }
        if (arg1 <= 0) {
            field1314 = !field1314;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[CZ[C[C[C)V")
    private static final void method489(int arg0, char[] arg1, boolean arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg3.length - arg5.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label129: while (true) {
                while (true) {
                    if (var9 >= arg3.length) {
                        break label129;
                    }
                    boolean var12 = false;
                    char var13 = arg3[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg3.length) {
                        var14 = arg3[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg5.length && (var15 = method494(arg5[var10], true, var13, var14)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label129;
                        }
                        int var16;
                        if ((var16 = method494(arg5[var10 - 1], true, var13, var14)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg5.length || !method500(var13, field1316)) {
                                break label129;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg5.length) {
                boolean var17 = false;
                int var18 = method490(var8, arg1, 0, arg3);
                int var19 = method491(arg4, var9 - 1, true, arg3);
                if (arg0 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg0 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg0 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg0 == 3 && var18 > 2 && var19 > 0) {
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
                                    if (arg1[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg1[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method500(arg3[var25], field1316)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method500(arg3[var25], field1316)) {
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
                                    if (arg4[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg4[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg3.length; var29++) {
                            if (var28) {
                                if (method500(arg3[var29], field1316)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method500(arg3[var29], field1316)) {
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

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(I[CI[C)I")
    private static final int method490(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 != 0) {
            return 1;
        } else if (arg0 == 0) {
            return 2;
        } else {
            int var4 = arg0 - 1;
            while (true) {
                if (var4 >= 0 && method500(arg3[var4], field1316)) {
                    if (arg3[var4] != ',' && arg3[var4] != '.') {
                        var4--;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg0 - 1; var6 >= 0 && method500(arg1[var6], field1316); var6--) {
                    if (arg1[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method500(arg3[arg0 - 1], field1316)) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CIZ[C)I")
    private static final int method491(char[] arg0, int arg1, boolean arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method500(arg3[var4], field1316)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method500(arg0[var6], field1316); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (!arg2) {
                return 1;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method500(arg3[arg1 + 1], field1316)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([[B[C[CZ)V")
    public static final void method492(byte[][] arg0, char[] arg1, char[] arg2, boolean arg3) {
        if (arg3) {
            field1312 = -301;
        }
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var9) {
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
                    if (var7 < arg2.length && (var16 = method495(var14, 0, arg2[var7], var15)) > 0) {
                        if (var16 == 1 && method503((byte) -56, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method503((byte) -56, var14) || method503((byte) -56, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method495(var14, 0, arg2[var7 - 1], var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method501(-45631, var14)) {
                                break label167;
                            }
                            if (method500(var14, field1316) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method503((byte) -56, var14)) {
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
                    if (var5 - 1 < 0 || method500(arg1[var5 - 1], field1316) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method500(arg1[var6], field1316) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method500(arg1[var26], field1316) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method500(arg1[var26 + var28], field1316) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method500(arg1[var26 - 1], field1316) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method506(var27, 897)) {
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
                    byte var21 = method496(534, var19);
                    byte var22 = method496(534, var20);
                    if (arg0 != null && method493(var22, (byte) -106, arg0, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method503((byte) -56, arg1[var33])) {
                            var30++;
                        } else if (method502((byte) -10, arg1[var33])) {
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

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean method493(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg3 && arg2[var4][1] == arg0) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg1 != -106) {
            field1312 = 317;
        }
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg3 && arg2[var6][1] == arg0) {
                return true;
            }
            if (arg3 < arg2[var6][0] || arg2[var6][0] == arg3 && arg0 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CZCC)I")
    private static final int method494(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            return 3;
        } else if (arg0 == arg2) {
            return 1;
        } else if (arg0 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg2 == '(' && arg3 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg0 == 's' && arg2 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CICC)I")
    private static final int method495(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 0) {
            return field1312;
        } else if (arg0 == arg2) {
            return 1;
        } else {
            if (arg2 >= 'a' && arg2 <= 'm') {
                if (arg2 == 'a') {
                    if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                        if (arg0 == '/' && arg3 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'b') {
                    if (arg0 != '6' && arg0 != '8') {
                        if ((arg0 != '1' || arg3 != '3') && (arg0 != 'i' || arg3 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg2 == 'c') {
                    if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'd') {
                    if ((arg0 != '[' || arg3 != ')') && (arg0 != 'i' || arg3 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'e') {
                    if (arg0 != '3' && arg0 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'f') {
                    if (arg0 == 'p' && arg3 == 'h') {
                        return 2;
                    }
                    if (arg0 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'g') {
                    if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'h') {
                    if (arg0 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'i') {
                    if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                    if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                    if (arg0 != '0' && arg0 != '*') {
                        if ((arg0 != '(' || arg3 != ')') && (arg0 != '[' || arg3 != ']') && (arg0 != '{' || arg3 != '}') && (arg0 != '<' || arg3 != '>')) {
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
                    if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 't') {
                    if (arg0 != '7' && arg0 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'u') {
                    if (arg0 == 'v') {
                        return 1;
                    }
                    if ((arg0 != '\\' || arg3 != '/') && (arg0 != '\\' || arg3 != '|') && (arg0 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'v') {
                    if ((arg0 != '\\' || arg3 != '/') && (arg0 != '\\' || arg3 != '|') && (arg0 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'w') {
                    if (arg0 == 'v' && arg3 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg2 == 'x') {
                    if ((arg0 != ')' || arg3 != '(') && (arg0 != '}' || arg3 != '{') && (arg0 != ']' || arg3 != '[') && (arg0 != '>' || arg3 != '<')) {
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
                    if (arg0 == 'o' || arg0 == 'O') {
                        return 1;
                    } else if ((arg0 != '(' || arg3 != ')') && (arg0 != '{' || arg3 != '}') && (arg0 != '[' || arg3 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg2 == '1') {
                    return arg0 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg2 == ',') {
                return arg0 == '.' ? 1 : 0;
            } else if (arg2 == '.') {
                return arg0 == ',' ? 1 : 0;
            } else if (arg2 == '!') {
                return arg0 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(IC)B")
    private static final byte method496(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1312 = -468;
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

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "([CI)V")
    private static final void method497(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        while (true) {
            do {
                int var7;
                if ((var7 = method498(arg0, 0, var3)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method500(arg0[var9], field1316) && !method501(-45631, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var7;
                }
                var3 = method499(false, arg0, var7);
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
            for (int var12 = var5; var12 < var3; var12++) {
                arg0[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "([CII)I")
    private static final int method498(char[] arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 > 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg2; var4 < arg0.length && var4 >= 0; var4++) {
            if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(Z[CI)I")
    private static final int method499(boolean arg0, char[] arg1, int arg2) {
        if (arg0) {
            field1311 = !field1311;
        }
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(CI)Z")
    private static final boolean method500(char arg0, int arg1) {
        int var2 = 69 / arg1;
        return !method502((byte) -10, arg0) && !method503((byte) -56, arg0);
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(IC)Z")
    private static final boolean method501(int arg0, char arg1) {
        if (arg0 != -45631) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "a", descriptor = "(BC)Z")
    private static final boolean method502(byte arg0, char arg1) {
        if (arg0 != -10) {
            field1315 = !field1315;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(BC)Z")
    private static final boolean method503(byte arg0, char arg1) {
        if (arg0 != -56) {
            field1316 = 348;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(CI)Z")
    private static final boolean method504(char arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "b", descriptor = "(CZ)Z")
    private static final boolean method505(char arg0, boolean arg1) {
        if (arg1) {
            field1317 = !field1317;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "c", descriptor = "([CI)Z")
    private static final boolean method506(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method503((byte) -56, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method507(arg0, -553);
        if (arg1 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        int var7 = field1318.length - 1;
        if (field1318[var6] == var4 || field1318[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1318[var8] == var4) {
                return true;
            }
            if (var4 < field1318[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "client!PPZVZYJC", name = "d", descriptor = "([CI)I")
    public static final int method507(char[] arg0, int arg1) {
        if (arg1 >= 0) {
            return 4;
        } else if (arg0.length > 6) {
            return 0;
        } else {
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
            return var2;
        }
    }
}
