import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ULPSDNZC")
public class class59 {

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "Z")
    private static boolean field1492 = true;

    @OriginalMember(owner = "ULPSDNZC", name = "b", descriptor = "I")
    private static int field1493 = -1681;

    @OriginalMember(owner = "ULPSDNZC", name = "d", descriptor = "I")
    private static int field1495 = -471;

    @OriginalMember(owner = "ULPSDNZC", name = "e", descriptor = "I")
    private static int field1496 = 9;

    @OriginalMember(owner = "ULPSDNZC", name = "f", descriptor = "I")
    private static int field1497 = 19413;

    @OriginalMember(owner = "ULPSDNZC", name = "g", descriptor = "Z")
    private static boolean field1498 = true;

    @OriginalMember(owner = "ULPSDNZC", name = "h", descriptor = "I")
    private static int field1499 = -44;

    @OriginalMember(owner = "ULPSDNZC", name = "i", descriptor = "B")
    private static byte field1500 = 8;

    @OriginalMember(owner = "ULPSDNZC", name = "j", descriptor = "Z")
    private static boolean field1501 = true;

    @OriginalMember(owner = "ULPSDNZC", name = "k", descriptor = "I")
    private static int field1502 = 5;

    @OriginalMember(owner = "ULPSDNZC", name = "l", descriptor = "Z")
    private static boolean field1503 = true;

    @OriginalMember(owner = "ULPSDNZC", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1510 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "ULPSDNZC", name = "c", descriptor = "Z")
    private static boolean field1494;

    @OriginalMember(owner = "ULPSDNZC", name = "t", descriptor = "Z")
    public static boolean field1511;

    @OriginalMember(owner = "ULPSDNZC", name = "m", descriptor = "[I")
    private static int[] field1504;

    @OriginalMember(owner = "ULPSDNZC", name = "r", descriptor = "[I")
    private static int[] field1509;

    @OriginalMember(owner = "ULPSDNZC", name = "n", descriptor = "[[C")
    private static char[][] field1505;

    @OriginalMember(owner = "ULPSDNZC", name = "p", descriptor = "[[C")
    private static char[][] field1507;

    @OriginalMember(owner = "ULPSDNZC", name = "q", descriptor = "[[C")
    private static char[][] field1508;

    @OriginalMember(owner = "ULPSDNZC", name = "o", descriptor = "[[[B")
    private static byte[][][] field1506;

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(LFNOQZAYQ;)V")
    public static final void method462(class14 arg0) {
        class11 var1 = new class11(arg0.method246("fragmentsenc.txt", null), field1492);
        class11 var2 = new class11(arg0.method246("badenc.txt", null), field1492);
        class11 var3 = new class11(arg0.method246("domainenc.txt", null), field1492);
        class11 var4 = new class11(arg0.method246("tldlist.txt", null), field1492);
        method463(var1, var2, var3, var4);
        if (class2.field14) {
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(LDNRIFKTO;LDNRIFKTO;LDNRIFKTO;LDNRIFKTO;)V")
    private static final void method463(class11 arg0, class11 arg1, class11 arg2, class11 arg3) {
        method465(arg1, -19172);
        method466(field1495, arg2);
        method467(arg0, true);
        method464(arg3, true);
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(LDNRIFKTO;Z)V")
    private static final void method464(class11 arg0, boolean arg1) {
        int var2 = arg0.method194();
        field1508 = new char[var2][];
        if (!arg1) {
            return;
        }
        field1509 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1509[var3] = arg0.method189();
            char[] var4 = new char[arg0.method189()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method189();
            }
            field1508[var3] = var4;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(LDNRIFKTO;I)V")
    private static final void method465(class11 arg0, int arg1) {
        int var2 = arg0.method194();
        if (arg1 != -19172) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1505 = new char[var2][];
        field1506 = new byte[var2][][];
        method468(field1505, true, field1506, arg0);
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(ILDNRIFKTO;)V")
    private static final void method466(int arg0, class11 arg1) {
        int var2 = arg1.method194();
        field1507 = new char[var2][];
        if (arg0 >= 0) {
            field1503 = !field1503;
        }
        method469(field1507, false, arg1);
    }

    @OriginalMember(owner = "ULPSDNZC", name = "b", descriptor = "(LDNRIFKTO;Z)V")
    private static final void method467(class11 arg0, boolean arg1) {
        field1504 = new int[arg0.method194()];
        if (!arg1) {
            field1492 = true;
        }
        for (int var2 = 0; var2 < field1504.length; var2++) {
            field1504[var2] = arg0.method191();
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([[CZ[[[BLDNRIFKTO;)V")
    private static final void method468(char[][] arg0, boolean arg1, byte[][][] arg2, class11 arg3) {
        if (!arg1) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg3.method189()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method189();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg3.method189()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method189();
                var7[var8][1] = (byte) arg3.method189();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([[CZLDNRIFKTO;)V")
    private static final void method469(char[][] arg0, boolean arg1, class11 arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var5 = new char[arg2.method189()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method189();
            }
            arg0[var3] = var5;
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([CI)V")
    private static final void method470(char[] arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (method471(arg0[var4], 89)) {
                arg0[var3] = arg0[var4];
            } else {
                arg0[var3] = ' ';
            }
            if (var3 == 0 || arg0[var3] != ' ' || arg0[var3 - 1] != ' ') {
                var3++;
            }
        }
        for (int var5 = var3; var5 < arg0.length; var5++) {
            arg0[var5] = ' ';
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(CI)Z")
    private static final boolean method471(char arg0, int arg1) {
        if (arg1 != 89) {
            field1495 = -236;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method472(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method470(var4, 480);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method480(17327, var6);
        method475(true, var6);
        method476(var6, true);
        if (arg0) {
            field1502 = 315;
        }
        method489(var6, true);
        for (int var8 = 0; var8 < field1510.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1510[var8], var11 + 1)) != -1) {
                char[] var12 = field1510[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method473(var6, var5.toCharArray(), -989);
        method474(var6, true);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([C[CI)V")
    private static final void method473(char[] arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method497(true, arg1[var3])) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([CZ)V")
    private static final void method474(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method494(var4, 0)) {
                var2 = true;
            } else if (var2) {
                if (method496(var4, true)) {
                    var2 = false;
                }
            } else if (method497(true, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (!arg1) {
            field1494 = true;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(Z[C)V")
    private static final void method475(boolean arg0, char[] arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1505.length - 1; var4 >= 0; var4--) {
                method484(field1506[var4], arg1, field1505[var4], 911);
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "b", descriptor = "([CZ)V")
    private static final void method476(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method484(null, var2, var3, 911);
        if (!arg1) {
            field1495 = -482;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method484(null, var4, var5, 911);
        for (int var6 = field1507.length - 1; var6 >= 0; var6--) {
            method477(arg0, var4, 3, field1507[var6], var2);
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method477(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg2 != 3) {
            field1503 = !field1503;
        }
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg0.length - arg3.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label66: while (true) {
                while (true) {
                    if (var7 >= arg0.length) {
                        break label66;
                    }
                    boolean var10 = false;
                    char var11 = arg0[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg0.length) {
                        var12 = arg0[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg3.length && (var13 = method486(var12, arg3[var8], 694, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label66;
                        }
                        int var14;
                        if ((var14 = method486(var12, arg3[var8 - 1], 694, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method492(var11, field1500)) {
                                break label66;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method478(arg0, true, arg4, var6);
                int var17 = method479(arg1, 788, var7 - 1, arg0);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg0[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([CZ[CI)I")
    private static final int method478(char[] arg0, boolean arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method492(arg0[var4], field1500); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method492(arg2[var6], field1500); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (!arg1) {
            return field1502;
        } else if (var5 >= 3) {
            return 4;
        } else if (method492(arg0[arg3 - 1], field1500)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([CII[C)I")
    private static final int method479(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method492(arg3[var4], field1500)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 66 / arg1;
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg3.length && method492(arg0[var7], field1500); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method492(arg3[arg2 + 1], field1500)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(I[C)V")
    private static final void method480(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method484(null, var2, var3, 911);
        if (arg0 != 17327) {
            field1492 = true;
        }
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method484(null, var4, var5, 911);
        for (int var6 = 0; var6 < field1508.length; var6++) {
            method481(field1508[var6], var2, arg1, 9, var4, field1509[var6]);
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([C[C[CI[CI)V")
    private static final void method481(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4, int arg5) {
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg2.length - arg0.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label139: while (true) {
                while (true) {
                    if (var9 >= arg2.length) {
                        break label139;
                    }
                    boolean var12 = false;
                    char var13 = arg2[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg2.length) {
                        var14 = arg2[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg0.length && (var15 = method486(var14, arg0[var10], 694, var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label139;
                        }
                        int var16;
                        if ((var16 = method486(var14, arg0[var10 - 1], 694, var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg0.length || !method492(var13, field1500)) {
                                break label139;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg0.length) {
                boolean var17 = false;
                int var18 = method482(var7, true, arg1, arg2);
                int var19 = method483(19413, arg4, var9 - 1, arg2);
                if (arg5 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg5 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg5 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg5 == 3 && var18 > 2 && var19 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var17) {
                    int var20 = var7;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var7 - 1; var23 >= 0; var23--) {
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
                                if (method492(arg2[var25], field1500)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method492(arg2[var25], field1500)) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg2.length; var27++) {
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
                        for (int var29 = var21 + 1; var29 < arg2.length; var29++) {
                            if (var28) {
                                if (method492(arg2[var29], field1500)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method492(arg2[var29], field1500)) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg2[var30] = '*';
                    }
                }
            }
        }
        if (arg3 < field1496 || arg3 > field1496) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(IZ[C[C)I")
    private static final int method482(int arg0, boolean arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method492(arg3[var4], field1500)) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (!arg1) {
                field1493 = 81;
            }
            for (int var6 = arg0 - 1; var6 >= 0 && method492(arg2[var6], field1500); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method492(arg3[arg0 - 1], field1500)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(I[CI[C)I")
    private static final int method483(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (field1497 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var5 = arg2 + 1;
        while (true) {
            if (var5 < arg3.length && method492(arg3[var5], field1500)) {
                if (arg3[var5] != '\\' && arg3[var5] != '/') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg3.length && method492(arg1[var7], field1500); var7++) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method492(arg3[arg2 + 1], field1500)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method484(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        int var4 = 4 / arg3;
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label163: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label163;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg2.length && (var17 = method487(true, var16, var15, arg2[var8])) > 0) {
                        if (var17 == 1 && method495((byte) 0, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method495((byte) 0, var15) || method495((byte) 0, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label163;
                        }
                        int var18;
                        if ((var18 = method487(true, var16, var15, arg2[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method493(var15, 35772)) {
                                break label163;
                            }
                            if (method492(var15, field1500) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method495((byte) 0, var15)) {
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
                    if (var6 - 1 < 0 || method492(arg1[var6 - 1], field1500) && arg1[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method492(arg1[var7], field1500) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method492(arg1[var27], field1500) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method492(arg1[var27 + var29], field1500) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method492(arg1[var27 - 1], field1500) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method498(var28, 0)) {
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
                        var20 = arg1[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg1.length) {
                        var21 = arg1[var7];
                    }
                    byte var22 = method488(var20, 393);
                    byte var23 = method488(var21, 393);
                    if (arg0 != null && method485(var22, var23, 248, arg0)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method495((byte) 0, arg1[var34])) {
                            var31++;
                        } else if (method494(arg1[var34], 0)) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg1[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(BBI[[B)Z")
    private static final boolean method485(byte arg0, byte arg1, int arg2, byte[][] arg3) {
        int var4 = 18 / arg2;
        int var5 = 0;
        if (arg3[var5][0] == arg0 && arg3[var5][1] == arg1) {
            return true;
        }
        int var6 = arg3.length - 1;
        if (arg3[var6][0] == arg0 && arg3[var6][1] == arg1) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg3[var7][0] == arg0 && arg3[var7][1] == arg1) {
                return true;
            }
            if (arg0 < arg3[var7][0] || arg3[var7][0] == arg0 && arg1 < arg3[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(CCIC)I")
    private static final int method486(char arg0, char arg1, int arg2, char arg3) {
        int var4 = 64 / arg2;
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

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(ZCCC)I")
    private static final int method487(boolean arg0, char arg1, char arg2, char arg3) {
        if (!arg0) {
            return 3;
        } else if (arg2 == arg3) {
            return 1;
        } else {
            if (arg3 >= 'a' && arg3 <= 'm') {
                if (arg3 == 'a') {
                    if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                        if (arg2 == '/' && arg1 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'b') {
                    if (arg2 != '6' && arg2 != '8') {
                        if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
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
                    if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
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
                    if (arg2 == 'p' && arg1 == 'h') {
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
                        if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
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
                    if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'v') {
                    if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'w') {
                    if (arg2 == 'v' && arg1 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg3 == 'x') {
                    if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
                    } else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
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
    }

    @OriginalMember(owner = "ULPSDNZC", name = "b", descriptor = "(CI)B")
    private static final byte method488(char arg0, int arg1) {
        int var2 = 4 / arg1;
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

    @OriginalMember(owner = "ULPSDNZC", name = "c", descriptor = "([CZ)V")
    private static final void method489(char[] arg0, boolean arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (!arg1) {
            return;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method490(var3, field1499, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method492(arg0[var8], field1500) && !method493(arg0[var8], 35772)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method491(arg0, var6, (byte) 4);
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

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(II[C)I")
    private static final int method490(int arg0, int arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return arg1 >= 0 ? field1499 : -1;
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "([CIB)I")
    private static final int method491(char[] arg0, int arg1, byte arg2) {
        if (arg2 == 4) {
            boolean var3 = false;
        } else {
            field1498 = !field1498;
        }
        int var4 = arg1;
        while (true) {
            if (var4 < arg0.length && var4 >= 0) {
                if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(CB)Z")
    private static final boolean method492(char arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var2 = false;
        }
        return !method494(arg0, 0) && !method495((byte) 0, arg0);
    }

    @OriginalMember(owner = "ULPSDNZC", name = "c", descriptor = "(CI)Z")
    private static final boolean method493(char arg0, int arg1) {
        if (arg1 != 35772) {
            field1495 = 396;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ULPSDNZC", name = "d", descriptor = "(CI)Z")
    private static final boolean method494(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(BC)Z")
    private static final boolean method495(byte arg0, char arg1) {
        if (arg0 == 0) {
            boolean var2 = false;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(CZ)Z")
    private static final boolean method496(char arg0, boolean arg1) {
        if (!arg1) {
            field1499 = 480;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(ZC)Z")
    private static final boolean method497(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "ULPSDNZC", name = "b", descriptor = "([CI)Z")
    private static final boolean method498(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method495((byte) 0, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method499((byte) 0, arg0);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        int var5 = 0;
        int var6 = field1504.length - 1;
        if (field1504[var5] == var4 || field1504[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1504[var7] == var4) {
                return true;
            }
            if (var4 < field1504[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "ULPSDNZC", name = "a", descriptor = "(B[C)I")
    public static final int method499(byte arg0, char[] arg1) {
        if (arg0 != 0) {
            return 1;
        } else if (arg1.length > 6) {
            return 0;
        } else {
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
}
