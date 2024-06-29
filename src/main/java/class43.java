import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PRVYVGOX")
public class class43 {

    @OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "I")
    private static int field1365 = 366;

    @OriginalMember(owner = "client!PRVYVGOX", name = "d", descriptor = "I")
    private static int field1366 = -560;

    @OriginalMember(owner = "client!PRVYVGOX", name = "e", descriptor = "I")
    private static int field1367 = -309;

    @OriginalMember(owner = "client!PRVYVGOX", name = "f", descriptor = "B")
    private static byte field1368 = 9;

    @OriginalMember(owner = "client!PRVYVGOX", name = "g", descriptor = "I")
    private static int field1369 = 275;

    @OriginalMember(owner = "client!PRVYVGOX", name = "h", descriptor = "I")
    private static int field1370 = -12999;

    @OriginalMember(owner = "client!PRVYVGOX", name = "o", descriptor = "[Ljava/lang/String;")
    private static final String[] field1377 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "Z")
    private static boolean field1363;

    @OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "Z")
    private static boolean field1364;

    @OriginalMember(owner = "client!PRVYVGOX", name = "p", descriptor = "Z")
    public static boolean field1378;

    @OriginalMember(owner = "client!PRVYVGOX", name = "i", descriptor = "[I")
    private static int[] field1371;

    @OriginalMember(owner = "client!PRVYVGOX", name = "n", descriptor = "[I")
    private static int[] field1376;

    @OriginalMember(owner = "client!PRVYVGOX", name = "j", descriptor = "[[C")
    private static char[][] field1372;

    @OriginalMember(owner = "client!PRVYVGOX", name = "l", descriptor = "[[C")
    private static char[][] field1374;

    @OriginalMember(owner = "client!PRVYVGOX", name = "m", descriptor = "[[C")
    private static char[][] field1375;

    @OriginalMember(owner = "client!PRVYVGOX", name = "k", descriptor = "[[[B")
    private static byte[][][] field1373;

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(LIEMHZJLX;)V")
    public static final void method441(class23 arg0) {
        class38 var1 = new class38(0, arg0.method242("fragmentsenc.txt", null));
        class38 var2 = new class38(0, arg0.method242("badenc.txt", null));
        class38 var3 = new class38(0, arg0.method242("domainenc.txt", null));
        class38 var4 = new class38(0, arg0.method242("tldlist.txt", null));
        method442(var1, var2, var3, var4);
        if (class66.field1692) {
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(LMVHXDWGI;LMVHXDWGI;LMVHXDWGI;LMVHXDWGI;)V")
    private static final void method442(class38 arg0, class38 arg1, class38 arg2, class38 arg3) {
        method444(arg1, 366);
        method445(arg2, 0);
        method446(arg0, 453);
        method443(arg3, (byte) 123);
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(LMVHXDWGI;B)V")
    private static final void method443(class38 arg0, byte arg1) {
        int var2 = arg0.method362();
        if (arg1 != 123) {
            field1364 = !field1364;
        }
        field1375 = new char[var2][];
        field1376 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1376[var3] = arg0.method357();
            char[] var4 = new char[arg0.method357()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method357();
            }
            field1375[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(LMVHXDWGI;I)V")
    private static final void method444(class38 arg0, int arg1) {
        int var2 = arg0.method362();
        field1372 = new char[var2][];
        if (arg1 > 0) {
            field1373 = new byte[var2][][];
            method447(arg0, field1373, field1372, 5);
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(LMVHXDWGI;I)V")
    private static final void method445(class38 arg0, int arg1) {
        int var2 = arg0.method362();
        if (arg1 == 0) {
            field1374 = new char[var2][];
            method448(arg0, 23262, field1374);
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "(LMVHXDWGI;I)V")
    private static final void method446(class38 arg0, int arg1) {
        int var2 = 76 / arg1;
        field1371 = new int[arg0.method362()];
        for (int var3 = 0; var3 < field1371.length; var3++) {
            field1371[var3] = arg0.method359();
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(LMVHXDWGI;[[[B[[CI)V")
    private static final void method447(class38 arg0, byte[][][] arg1, char[][] arg2, int arg3) {
        if (arg3 != 5) {
            field1364 = !field1364;
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method357()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method357();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method357()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method357();
                var7[var8][1] = (byte) arg0.method357();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(LMVHXDWGI;I[[C)V")
    private static final void method448(class38 arg0, int arg1, char[][] arg2) {
        if (arg1 != 23262) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method357()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method357();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CI)V")
    private static final void method449(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method450(-309, arg0[var3])) {
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
            ;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(IC)Z")
    private static final boolean method450(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method451(String arg0, byte arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method449(var4, field1366);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method459(19914, var6);
        if (arg1 != 8) {
            field1364 = !field1364;
        }
        method454(var6, 0);
        method455(var6, 0);
        method468(var6, false);
        for (int var8 = 0; var8 < field1377.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1377[var8], var11 + 1)) != -1) {
                char[] var12 = field1377[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method452(var5.toCharArray(), (byte) 9, var6);
        method453(field1369, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CB[C)V")
    private static final void method452(char[] arg0, byte arg1, char[] arg2) {
        if (field1368 != arg1) {
            field1365 = -247;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method476(6, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(I[C)V")
    private static final void method453(int arg0, char[] arg1) {
        boolean var2 = true;
        int var3 = 86 / arg0;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method473(var5, -12999)) {
                var2 = true;
            } else if (var2) {
                if (method475(true, var5)) {
                    var2 = false;
                }
            } else if (method476(6, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "([CI)V")
    private static final void method454(char[] arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1372.length - 1; var3 >= 0; var3--) {
                method463(arg0, field1373[var3], field1372[var3], -334);
            }
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "([CI)V")
    private static final void method455(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method463(var2, null, var3, -334);
        char[] var4 = (char[]) arg0.clone();
        if (arg1 != 0) {
            return;
        }
        char[] var5 = new char[] { 'd', 'o', 't' };
        method463(var4, null, var5, -334);
        for (int var6 = field1374.length - 1; var6 >= 0; var6--) {
            method456(var2, field1374[var6], 16919, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method456(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg2 != 16919 || arg1.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg1.length; var6 += var9) {
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
                    if (var8 < arg1.length && (var13 = method465(var12, (byte) 0, var11, arg1[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method465(var12, (byte) 0, var11, arg1[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method471(var11, (byte) -26)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method457(arg4, arg0, (byte) 7, var6);
                int var17 = method458(-30052, var7 - 1, arg4, arg3);
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

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[CBI)I")
    private static final int method457(char[] arg0, char[] arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method471(arg0[var4], (byte) -26); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        if (arg2 != 7) {
            field1365 = 217;
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method471(arg1[var6], (byte) -26); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method471(arg0[arg3 - 1], (byte) -26)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(II[C[C)I")
    private static final int method458(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method471(arg2[var4], (byte) -26)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != -30052) {
                field1364 = !field1364;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg2.length && method471(arg3[var6], (byte) -26); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method471(arg2[arg1 + 1], (byte) -26)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(I[C)V")
    private static final void method459(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg0 != 19914) {
            field1365 = -178;
        }
        method463(var2, null, var3, -334);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method463(var4, null, var5, -334);
        for (int var6 = 0; var6 < field1375.length; var6++) {
            method460(field1375[var6], var4, arg1, field1376[var6], 0, var2);
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[C[CII[C)V")
    private static final void method460(char[] arg0, char[] arg1, char[] arg2, int arg3, int arg4, char[] arg5) {
        if (arg4 != 0 || arg0.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method465(var13, (byte) 0, var12, arg0[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method465(var13, (byte) 0, var12, arg0[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method471(var12, (byte) -26)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method461(arg2, var7, (byte) 1, arg5);
                int var18 = method462(arg1, var8 - 1, arg2, -18966);
                if (arg3 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg3 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg3 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method471(arg2[var24], (byte) -26)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method471(arg2[var24], (byte) -26)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg2.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg2.length; var28++) {
                            if (var27) {
                                if (method471(arg2[var28], (byte) -26)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method471(arg2[var28], (byte) -26)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg2[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CIB[C)I")
    private static final int method461(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method471(arg0[var4], (byte) -26)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method471(arg3[var6], (byte) -26); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg2 == 1) {
                boolean var7 = false;
            } else {
                field1367 = 98;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method471(arg0[arg1 - 1], (byte) -26)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CI[CI)I")
    private static final int method462(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method471(arg2[var4], (byte) -26)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != -18966) {
                field1366 = 45;
            }
            for (int var6 = arg1 + 1; var6 < arg2.length && method471(arg0[var6], (byte) -26); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method471(arg2[arg1 + 1], (byte) -26)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([C[[B[CI)V")
    public static final void method463(char[] arg0, byte[][] arg1, char[] arg2, int arg3) {
        label255: while (true) {
            if (arg3 >= 0) {
                int var35 = 1;
                while (true) {
                    if (var35 <= 0) {
                        continue label255;
                    }
                    var35++;
                }
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
                label174: while (true) {
                    while (true) {
                        if (var6 >= arg0.length || var11 && var12) {
                            break label174;
                        }
                        boolean var13 = false;
                        char var14 = arg0[var6];
                        char var15 = 0;
                        if (var6 + 1 < arg0.length) {
                            var15 = arg0[var6 + 1];
                        }
                        int var16;
                        if (var7 < arg2.length && (var16 = method466(arg2[var7], var15, (byte) 9, var14)) > 0) {
                            if (var16 == 1 && method474(0, var14)) {
                                var11 = true;
                            }
                            if (var16 == 2 && (method474(0, var14) || method474(0, var15))) {
                                var11 = true;
                            }
                            var6 += var16;
                            var7++;
                        } else {
                            if (var7 == 0) {
                                break label174;
                            }
                            int var17;
                            if ((var17 = method466(arg2[var7 - 1], var15, (byte) 9, var14)) > 0) {
                                var6 += var17;
                                if (var7 == 1) {
                                    var9++;
                                }
                            } else {
                                if (var7 >= arg2.length || !method472((byte) 2, var14)) {
                                    break label174;
                                }
                                if (method471(var14, (byte) -26) && var14 != '\'') {
                                    var10 = true;
                                }
                                if (method474(0, var14)) {
                                    var12 = true;
                                }
                                var6++;
                                var8++;
                                if (var8 * 100 / (var6 - var5) > 90) {
                                    break label174;
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
                        if (var5 - 1 < 0 || method471(arg0[var5 - 1], (byte) -26) && arg0[var5 - 1] != '\'') {
                            var23 = true;
                        }
                        if (var6 >= arg0.length || method471(arg0[var6], (byte) -26) && arg0[var6] != '\'') {
                            var24 = true;
                        }
                        if (!var23 || !var24) {
                            boolean var25 = false;
                            int var26 = var5 - 2;
                            if (var23) {
                                var26 = var5;
                            }
                            while (!var25 && var26 < var6) {
                                if (var26 >= 0 && (!method471(arg0[var26], (byte) -26) || arg0[var26] == '\'')) {
                                    char[] var27 = new char[3];
                                    int var28;
                                    for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method471(arg0[var26 + var28], (byte) -26) || arg0[var26 + var28] == '\''); var28++) {
                                        var27[var28] = arg0[var26 + var28];
                                    }
                                    boolean var29 = true;
                                    if (var28 == 0) {
                                        var29 = false;
                                    }
                                    if (var28 < 3 && var26 - 1 >= 0 && (!method471(arg0[var26 - 1], (byte) -26) || arg0[var26 - 1] == '\'')) {
                                        var29 = false;
                                    }
                                    if (var29 && !method477(true, var27)) {
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
                        byte var21 = method467(var19, 0);
                        byte var22 = method467(var20, 0);
                        if (arg1 != null && method464(var22, true, arg1, var21)) {
                            var18 = false;
                        }
                    }
                    if (var18) {
                        int var30 = 0;
                        int var31 = 0;
                        int var32 = -1;
                        for (int var33 = var5; var33 < var6; var33++) {
                            if (method474(0, arg0[var33])) {
                                var30++;
                            } else if (method473(arg0[var33], -12999)) {
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
            return;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(BZ[[BB)Z")
    private static final boolean method464(byte arg0, boolean arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2[var4][0] == arg3 && arg2[var4][1] == arg0) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg3 && arg2[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg2[var7][0] == arg3 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg3 < arg2[var7][0] || arg2[var7][0] == arg3 && arg0 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CBCC)I")
    private static final int method465(char arg0, byte arg1, char arg2, char arg3) {
        if (arg1 != 0) {
            field1363 = !field1363;
        }
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

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CCBC)I")
    private static final int method466(char arg0, char arg1, byte arg2, char arg3) {
        if (arg2 != 9) {
            field1364 = !field1364;
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

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CI)B")
    private static final byte method467(char arg0, int arg1) {
        if (arg1 != 0) {
            field1363 = !field1363;
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

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "([CZ)V")
    private static final void method468(char[] arg0, boolean arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1) {
            return;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method469(var3, -598, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method471(arg0[var8], (byte) -26) && !method472((byte) 2, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method470(false, arg0, var6);
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

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(II[C)I")
    private static final int method469(int arg0, int arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 >= 0) {
            field1365 = -31;
        }
        return -1;
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Z[CI)I")
    private static final int method470(boolean arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0) {
                return 2;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(CB)Z")
    private static final boolean method471(char arg0, byte arg1) {
        if (arg1 != -26) {
            throw new NullPointerException();
        }
        return !method473(arg0, -12999) && !method474(0, arg0);
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(BC)Z")
    private static final boolean method472(byte arg0, char arg1) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(CI)Z")
    private static final boolean method473(char arg0, int arg1) {
        if (field1370 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "b", descriptor = "(IC)Z")
    private static final boolean method474(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(ZC)Z")
    private static final boolean method475(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "(IC)Z")
    private static final boolean method476(int arg0, char arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "a", descriptor = "(Z[C)Z")
    private static final boolean method477(boolean arg0, char[] arg1) {
        boolean var2 = true;
        if (!arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method474(0, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method478(157, arg1);
        int var5 = 0;
        int var6 = field1371.length - 1;
        if (field1371[var5] == var4 || field1371[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1371[var7] == var4) {
                return true;
            }
            if (var4 < field1371[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!PRVYVGOX", name = "c", descriptor = "(I[C)I")
    public static final int method478(int arg0, char[] arg1) {
        if (arg0 <= 0) {
            field1370 = 216;
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
