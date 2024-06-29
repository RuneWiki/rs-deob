import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SQZXZVWD")
public class class46 {

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "I")
    private static int field1337 = 7;

    @OriginalMember(owner = "client!SQZXZVWD", name = "d", descriptor = "I")
    private static int field1340 = -234;

    @OriginalMember(owner = "client!SQZXZVWD", name = "e", descriptor = "I")
    private static int field1341 = 504;

    @OriginalMember(owner = "client!SQZXZVWD", name = "f", descriptor = "I")
    private static int field1342 = 504;

    @OriginalMember(owner = "client!SQZXZVWD", name = "h", descriptor = "B")
    private static byte field1344 = 3;

    @OriginalMember(owner = "client!SQZXZVWD", name = "i", descriptor = "B")
    private static byte field1345 = 3;

    @OriginalMember(owner = "client!SQZXZVWD", name = "j", descriptor = "I")
    private static int field1346 = 2;

    @OriginalMember(owner = "client!SQZXZVWD", name = "k", descriptor = "Z")
    private static boolean field1347 = true;

    @OriginalMember(owner = "client!SQZXZVWD", name = "l", descriptor = "B")
    private static byte field1348 = -28;

    @OriginalMember(owner = "client!SQZXZVWD", name = "m", descriptor = "I")
    private static int field1349 = 3;

    @OriginalMember(owner = "client!SQZXZVWD", name = "n", descriptor = "I")
    private static int field1350 = -871;

    @OriginalMember(owner = "client!SQZXZVWD", name = "o", descriptor = "I")
    private static int field1351 = 45944;

    @OriginalMember(owner = "client!SQZXZVWD", name = "q", descriptor = "B")
    private static byte field1353 = 36;

    @OriginalMember(owner = "client!SQZXZVWD", name = "r", descriptor = "B")
    private static byte field1354 = 9;

    @OriginalMember(owner = "client!SQZXZVWD", name = "s", descriptor = "I")
    private static int field1355 = -578;

    @OriginalMember(owner = "client!SQZXZVWD", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1362 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "Z")
    private static boolean field1338;

    @OriginalMember(owner = "client!SQZXZVWD", name = "c", descriptor = "Z")
    private static boolean field1339;

    @OriginalMember(owner = "client!SQZXZVWD", name = "g", descriptor = "Z")
    private static boolean field1343;

    @OriginalMember(owner = "client!SQZXZVWD", name = "p", descriptor = "Z")
    private static boolean field1352;

    @OriginalMember(owner = "client!SQZXZVWD", name = "A", descriptor = "Z")
    public static boolean field1363;

    @OriginalMember(owner = "client!SQZXZVWD", name = "t", descriptor = "[I")
    private static int[] field1356;

    @OriginalMember(owner = "client!SQZXZVWD", name = "y", descriptor = "[I")
    private static int[] field1361;

    @OriginalMember(owner = "client!SQZXZVWD", name = "u", descriptor = "[[C")
    private static char[][] field1357;

    @OriginalMember(owner = "client!SQZXZVWD", name = "w", descriptor = "[[C")
    private static char[][] field1359;

    @OriginalMember(owner = "client!SQZXZVWD", name = "x", descriptor = "[[C")
    private static char[][] field1360;

    @OriginalMember(owner = "client!SQZXZVWD", name = "v", descriptor = "[[[B")
    private static byte[][][] field1358;

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(LXOJZVVDK;)V")
    public static final void method403(class60 arg0) {
        class41 var1 = new class41(888, arg0.method560("fragmentsenc.txt", null));
        class41 var2 = new class41(888, arg0.method560("badenc.txt", null));
        class41 var3 = new class41(888, arg0.method560("domainenc.txt", null));
        class41 var4 = new class41(888, arg0.method560("tldlist.txt", null));
        method404(var1, var2, var3, var4);
        if (class8.field622) {
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(LPQBRPYKE;LPQBRPYKE;LPQBRPYKE;LPQBRPYKE;)V")
    private static final void method404(class41 arg0, class41 arg1, class41 arg2, class41 arg3) {
        method406(field1341, arg1);
        method407(0, arg2);
        method408(arg0, -572);
        method405(arg3, 1);
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(LPQBRPYKE;I)V")
    private static final void method405(class41 arg0, int arg1) {
        int var2 = arg0.method345();
        field1360 = new char[var2][];
        if (arg1 < 1 || arg1 > 1) {
            field1339 = !field1339;
        }
        field1361 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1361[var3] = arg0.method340();
            char[] var4 = new char[arg0.method340()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method340();
            }
            field1360[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(ILPQBRPYKE;)V")
    private static final void method406(int arg0, class41 arg1) {
        int var2 = arg1.method345();
        if (arg0 <= 0) {
            field1340 = -18;
        }
        field1357 = new char[var2][];
        field1358 = new byte[var2][][];
        method409(field1357, field1358, arg1, -897);
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(ILPQBRPYKE;)V")
    private static final void method407(int arg0, class41 arg1) {
        if (arg0 != 0) {
            field1338 = !field1338;
        }
        int var2 = arg1.method345();
        field1359 = new char[var2][];
        method410(field1359, -129, arg1);
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(LPQBRPYKE;I)V")
    private static final void method408(class41 arg0, int arg1) {
        field1356 = new int[arg0.method345()];
        for (int var2 = 0; var2 < field1356.length; var2++) {
            field1356[var2] = arg0.method342();
        }
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([[C[[[BLPQBRPYKE;I)V")
    private static final void method409(char[][] arg0, byte[][][] arg1, class41 arg2, int arg3) {
        while (arg3 >= 0) {
            field1339 = !field1339;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method340()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method340();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method340()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method340();
                var7[var8][1] = (byte) arg2.method340();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([[CILPQBRPYKE;)V")
    private static final void method410(char[][] arg0, int arg1, class41 arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method340()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method340();
            }
            arg0[var3] = var4;
        }
        while (arg1 >= 0) {
            field1340 = 318;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([CI)V")
    private static final void method411(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method412(arg0[var3], false)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var4 = var2; var4 < arg0.length; var4++) {
            arg0[var4] = ' ';
        }
        if (arg1 >= 0) {
            field1337 = 252;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CZ)Z")
    private static final boolean method412(char arg0, boolean arg1) {
        if (arg1) {
            field1339 = !field1339;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method413(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        if (arg0) {
            field1352 = !field1352;
        }
        char[] var4 = arg1.toCharArray();
        method411(var4, -870);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method421((byte) 49, var6);
        method416(true, var6);
        method417(var6, field1346);
        method430(-871, var6);
        for (int var8 = 0; var8 < field1362.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1362[var8], var11 + 1)) != -1) {
                char[] var12 = field1362[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method414(field1344, var5.toCharArray(), var6);
        method415(2, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(B[C[C)V")
    private static final void method414(byte arg0, char[] arg1, char[] arg2) {
        if (field1345 == arg0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            if (arg2[var5] != '*' && method438(7, arg1[var5])) {
                arg2[var5] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[C)V")
    private static final void method415(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method435(6, var4)) {
                var2 = true;
            } else if (var2) {
                if (method437(-16078, var4)) {
                    var2 = false;
                }
            } else if (method438(7, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg0 < 2 || arg0 > 2) {
            ;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Z[C)V")
    private static final void method416(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1357.length - 1; var3 >= 0; var3--) {
                method425(3, field1357[var3], arg1, field1358[var3]);
            }
        }
        if (!arg0) {
            field1355 = -71;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "([CI)V")
    private static final void method417(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg1 < 2 || arg1 > 2) {
            field1352 = !field1352;
        }
        method425(3, var3, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method425(3, var5, var4, null);
        for (int var6 = field1359.length - 1; var6 >= 0; var6--) {
            method418(false, arg0, var4, var2, field1359[var6]);
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(Z[C[C[C[C)V")
    private static final void method418(boolean arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        if (arg0) {
            field1346 = -228;
        }
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg4.length; var6 += var9) {
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
                    if (var8 < arg4.length && (var13 = method427((byte) -78, var12, arg4[var8], var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method427((byte) -78, var12, arg4[var8 - 1], var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method433(var11, (byte) 5)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method419(196, var6, arg1, arg3);
                int var17 = method420(arg1, var7 - 1, arg2, 589);
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

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(II[C[C)I")
    private static final int method419(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method433(arg2[var4], (byte) 5); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 55 / arg0;
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method433(arg3[var7], (byte) 5); var7--) {
            if (arg3[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method433(arg2[arg1 - 1], (byte) 5)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([CI[CI)I")
    private static final int method420(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg0.length && method433(arg0[var4], (byte) 5)) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 <= 0) {
                return 0;
            }
            for (int var6 = arg1 + 1; var6 < arg0.length && method433(arg2[var6], (byte) 5); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method433(arg0[arg1 + 1], (byte) 5)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(B[C)V")
    private static final void method421(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0 != 49) {
            field1355 = 134;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method425(3, var3, var2, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method425(3, var5, var4, null);
        for (int var6 = 0; var6 < field1360.length; var6++) {
            method422(5, var2, field1361[var6], arg1, field1360[var6], var4);
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[CI[C[C[C)V")
    private static final void method422(int arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg4.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label131: while (true) {
                while (true) {
                    if (var8 >= arg3.length) {
                        break label131;
                    }
                    boolean var11 = false;
                    char var12 = arg3[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg3.length) {
                        var13 = arg3[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method427((byte) -78, var13, arg4[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label131;
                        }
                        int var15;
                        if ((var15 = method427((byte) -78, var13, arg4[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method433(var12, (byte) 5)) {
                                break label131;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method423(arg3, arg1, var7, true);
                int var18 = method424(arg5, arg3, var8 - 1, true);
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
                                if (method433(arg3[var24], (byte) 5)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method433(arg3[var24], (byte) 5)) {
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
                                    if (arg5[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg5[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg3.length; var28++) {
                            if (var27) {
                                if (method433(arg3[var28], (byte) 5)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method433(arg3[var28], (byte) 5)) {
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
        if (arg0 < 5 || arg0 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "([C[CIZ)I")
    private static final int method423(char[] arg0, char[] arg1, int arg2, boolean arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method433(arg0[var4], (byte) 5)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method433(arg1[var6], (byte) 5); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (!arg3) {
                return 0;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method433(arg0[arg2 - 1], (byte) 5)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "([C[CIZ)I")
    private static final int method424(char[] arg0, char[] arg1, int arg2, boolean arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method433(arg1[var4], (byte) 5)) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (!arg3) {
                return field1355;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method433(arg0[var6], (byte) 5); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method433(arg1[arg2 + 1], (byte) 5)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[C[C[[B)V")
    public static final void method425(int arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label176: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label176;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method428(arg1[var7], var15, var14, true)) > 0) {
                        if (var16 == 1 && method436(field1352, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method436(field1352, var14) || method436(field1352, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label176;
                        }
                        int var17;
                        if ((var17 = method428(arg1[var7 - 1], var15, var14, true)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method434(0, var14)) {
                                break label176;
                            }
                            if (method433(var14, (byte) 5) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method436(field1352, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label176;
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
                    if (var5 - 1 < 0 || method433(arg2[var5 - 1], (byte) 5) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method433(arg2[var6], (byte) 5) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method433(arg2[var26], (byte) 5) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method433(arg2[var26 + var28], (byte) 5) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method433(arg2[var26 - 1], (byte) 5) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method439((byte) 36, var27)) {
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
                        var19 = arg2[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg2.length) {
                        var20 = arg2[var6];
                    }
                    byte var21 = method429(var19, field1349);
                    byte var22 = method429(var20, field1349);
                    if (arg3 != null && method426(var22, var21, 838, arg3)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method436(field1352, arg2[var33])) {
                            var30++;
                        } else if (method435(6, arg2[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg2[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
        if (arg0 < 3 || arg0 > 3) {
            field1343 = !field1343;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(BBI[[B)Z")
    private static final boolean method426(byte arg0, byte arg1, int arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg3[var4][0] == arg1 && arg3[var4][1] == arg0) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg2 <= 0) {
            field1338 = !field1338;
        }
        if (arg3[var5][0] == arg1 && arg3[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg3[var6][0] == arg1 && arg3[var6][1] == arg0) {
                return true;
            }
            if (arg1 < arg3[var6][0] || arg3[var6][0] == arg1 && arg0 < arg3[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(BCCC)I")
    private static final int method427(byte arg0, char arg1, char arg2, char arg3) {
        if (arg0 != -78) {
            field1347 = !field1347;
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg2 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg3 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CCCZ)I")
    private static final int method428(char arg0, char arg1, char arg2, boolean arg3) {
        if (!arg3) {
            field1352 = !field1352;
        }
        if (arg0 == arg2) {
            return 1;
        }
        if (arg0 >= 'a' && arg0 <= 'm') {
            if (arg0 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg0 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'd') {
                if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'f') {
                if (arg2 == 'p' && arg1 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'g') {
                if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                if (arg2 != '0' && arg2 != '*') {
                    if (arg2 == '(' && arg1 == ')' || arg2 == '[' && arg1 == ']' || arg2 == '{' && arg1 == '}' || arg2 == '<' && arg1 == '>') {
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
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if (arg2 == '\\' && arg1 == '/' || arg2 == '\\' && arg1 == '|' || arg2 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'v') {
                if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'w') {
                if (arg2 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'x') {
                if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg0 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg0 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg0 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg0 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CI)B")
    private static final byte method429(char arg0, int arg1) {
        if (arg1 < field1349 || arg1 > field1349) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return (byte) (arg0 + 1 - 'a');
        } else if (arg0 == '\'') {
            return 28;
        } else if (arg0 >= '0' && arg0 <= '9') {
            return (byte) (arg0 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(I[C)V")
    private static final void method430(int arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 >= 0) {
            field1349 = -286;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method431(var3, arg1, 7)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method433(arg1[var8], (byte) 5) && !method434(0, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method432(45944, arg1, var6);
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

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(I[CI)I")
    private static final int method431(int arg0, char[] arg1, int arg2) {
        if (arg2 != 7) {
            return 0;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(I[CI)I")
    private static final int method432(int arg0, char[] arg1, int arg2) {
        if (field1351 != arg0) {
            return 2;
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

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(CB)Z")
    private static final boolean method433(char arg0, byte arg1) {
        if (arg1 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method435(6, arg0) && !method436(field1352, arg0);
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(IC)Z")
    private static final boolean method434(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(IC)Z")
    private static final boolean method435(int arg0, char arg1) {
        if (arg0 != 6) {
            field1338 = !field1338;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "a", descriptor = "(ZC)Z")
    private static final boolean method436(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "c", descriptor = "(IC)Z")
    private static final boolean method437(int arg0, char arg1) {
        if (arg0 != -16078) {
            field1338 = !field1338;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "d", descriptor = "(IC)Z")
    private static final boolean method438(int arg0, char arg1) {
        if (arg0 != 7) {
            field1350 = -23;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "b", descriptor = "(B[C)Z")
    private static final boolean method439(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method436(field1352, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method440((byte) 9, arg1);
        int var5 = 0;
        if (field1353 != arg0) {
            field1350 = 130;
        }
        int var6 = field1356.length - 1;
        if (field1356[var5] == var4 || field1356[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1356[var7] == var4) {
                return true;
            }
            if (var4 < field1356[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!SQZXZVWD", name = "c", descriptor = "(B[C)I")
    public static final int method440(byte arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (field1354 != arg0) {
            return field1341;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[arg1.length - var4 - 1];
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
        return var2;
    }
}
