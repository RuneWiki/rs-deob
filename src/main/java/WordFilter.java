import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class WordFilter {

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1042 = 33724;

    @OriginalMember(owner = "mc", name = "d", descriptor = "Z")
    private static boolean field1044 = true;

    @OriginalMember(owner = "mc", name = "e", descriptor = "I")
    private static int field1045 = 3;

    @OriginalMember(owner = "mc", name = "f", descriptor = "I")
    private static int field1046 = -171;

    @OriginalMember(owner = "mc", name = "h", descriptor = "I")
    private static int field1048 = 3;

    @OriginalMember(owner = "mc", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1056 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "mc", name = "q", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "mc", name = "a", descriptor = "Z")
    private static boolean field1041;

    @OriginalMember(owner = "mc", name = "c", descriptor = "Z")
    private static boolean field1043;

    @OriginalMember(owner = "mc", name = "g", descriptor = "Z")
    private static boolean field1047;

    @OriginalMember(owner = "mc", name = "i", descriptor = "Z")
    private static boolean field1049;

    @OriginalMember(owner = "mc", name = "j", descriptor = "[I")
    private static int[] field1050;

    @OriginalMember(owner = "mc", name = "o", descriptor = "[I")
    private static int[] field1055;

    @OriginalMember(owner = "mc", name = "k", descriptor = "[[C")
    private static char[][] field1051;

    @OriginalMember(owner = "mc", name = "m", descriptor = "[[C")
    private static char[][] field1053;

    @OriginalMember(owner = "mc", name = "n", descriptor = "[[C")
    private static char[][] field1054;

    @OriginalMember(owner = "mc", name = "l", descriptor = "[[[B")
    private static byte[][][] field1052;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lub;)V")
    public static final void method325(Jagfile arg0) {
        Packet var1 = new Packet(575, arg0.method250(null, 3, "fragmentsenc.txt"));
        Packet var2 = new Packet(575, arg0.method250(null, 3, "badenc.txt"));
        Packet var3 = new Packet(575, arg0.method250(null, 3, "domainenc.txt"));
        Packet var4 = new Packet(575, arg0.method250(null, 3, "tldlist.txt"));
        method326(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method326(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method328((byte) 85, arg1);
        method329(arg2, 8);
        method330(arg0, false);
        method327(arg3, true);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Z)V")
    private static final void method327(Packet arg0, boolean arg1) {
        if (!arg1) {
            field1041 = !field1041;
        }
        int var2 = arg0.method214();
        field1054 = new char[var2][];
        field1055 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1055[var3] = arg0.method209();
            char[] var4 = new char[arg0.method209()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method209();
            }
            field1054[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BLkb;)V")
    private static final void method328(byte arg0, Packet arg1) {
        int var2 = arg1.method214();
        field1051 = new char[var2][];
        field1052 = new byte[var2][][];
        method331(field1051, arg1, field1052, 782);
        if (arg0 != 85) {
            field1042 = 139;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method329(Packet arg0, int arg1) {
        int var2 = arg0.method214();
        field1053 = new char[var2][];
        if (arg1 == 8) {
            method332((byte) 4, arg0, field1053);
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(Lkb;Z)V")
    private static final void method330(Packet arg0, boolean arg1) {
        if (arg1) {
            field1042 = 176;
        }
        field1050 = new int[arg0.method214()];
        for (int var2 = 0; var2 < field1050.length; var2++) {
            field1050[var2] = arg0.method211();
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[CLkb;[[[BI)V")
    private static final void method331(char[][] arg0, Packet arg1, byte[][][] arg2, int arg3) {
        if (arg3 != 782) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            char[] var6 = new char[arg1.method209()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg1.method209();
            }
            arg0[var5] = var6;
            byte[][] var8 = new byte[arg1.method209()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg1.method209();
                var8[var9][1] = (byte) arg1.method209();
            }
            if (var8.length > 0) {
                arg2[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BLkb;[[C)V")
    private static final void method332(byte arg0, Packet arg1, char[][] arg2) {
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            char[] var6 = new char[arg1.method209()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg1.method209();
            }
            arg2[var5] = var6;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI)V")
    private static final void method333(char[] arg0, int arg1) {
        if (arg1 >= 0) {
            field1049 = !field1049;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method334(arg0[var3], 0)) {
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
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CI)Z")
    private static final boolean method334(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method335(String arg0, byte arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method333(var4, -171);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method343(var6, 6);
        method338((byte) 2, var6);
        method339(var6, 1);
        method352(var6, (byte) -96);
        for (int var8 = 0; var8 < field1056.length; var8++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field1056[var8], var12 + 1)) != -1) {
                char[] var13 = field1056[var8].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method336(-987, var6, var5.toCharArray());
        method337(var6, 0);
        long var9 = System.currentTimeMillis();
        if (arg1 != 2) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C[C)V")
    private static final void method336(int arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method360(5, arg2[var3])) {
                arg1[var3] = arg2[var3];
            }
        }
        while (arg0 >= 0) {
            field1046 = -9;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CI)V")
    private static final void method337(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method357(var4, (byte) 3)) {
                var2 = true;
            } else if (var2) {
                if (method359(var4, -40593)) {
                    var2 = false;
                }
            } else if (method360(5, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1 != 0) {
            field1042 = -83;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[C)V")
    private static final void method338(byte arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1051.length - 1; var4 >= 0; var4--) {
                method347(field1052[var4], 5, arg1, field1051[var4]);
            }
        }
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            field1041 = !field1041;
        }
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "([CI)V")
    private static final void method339(char[] arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            field1046 = -77;
        }
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method347(null, 5, var2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method347(null, 5, var4, var5);
        for (int var6 = field1053.length - 1; var6 >= 0; var6--) {
            method340(var4, var2, field1053[var6], (byte) 5, arg0);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[C[CB[C)V")
    private static final void method340(char[] arg0, char[] arg1, char[] arg2, byte arg3, char[] arg4) {
        if (arg3 != 5 || arg2.length > arg4.length) {
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
                    if (var8 < arg2.length && (var13 = method349(var12, var11, false, arg2[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method349(var12, var11, false, arg2[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method355(125, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method341(field1047, var6, arg1, arg4);
                int var17 = method342((byte) 1, arg0, arg4, var7 - 1);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZI[C[C)I")
    private static final int method341(boolean arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0) {
            return field1045;
        } else if (arg1 == 0) {
            return 2;
        } else {
            for (int var4 = arg1 - 1; var4 >= 0 && method355(125, arg3[var4]); var4--) {
                if (arg3[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method355(125, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method355(125, arg3[arg1 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[C[CI)I")
    private static final int method342(byte arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 != 1) {
            return 1;
        } else if (arg3 + 1 == arg2.length) {
            return 2;
        } else {
            int var4 = arg3 + 1;
            while (true) {
                if (var4 < arg2.length && method355(125, arg2[var4])) {
                    if (arg2[var4] != '.' && arg2[var4] != ',') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg3 + 1; var6 < arg2.length && method355(125, arg1[var6]); var6++) {
                    if (arg1[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method355(125, arg2[arg3 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "d", descriptor = "([CI)V")
    private static final void method343(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method347(null, 5, var2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method347(null, 5, var4, var5);
        for (int var6 = 0; var6 < field1054.length; var6++) {
            method344(var2, var4, 920, arg0, field1055[var6], field1054[var6]);
        }
        if (arg1 < 6 || arg1 > 6) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CI[CI[C)V")
    private static final void method344(char[] arg0, char[] arg1, int arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var7 = 8 / arg2;
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
                    if (var10 < arg5.length && (var15 = method349(var14, var13, false, arg5[var10])) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label124;
                        }
                        int var16;
                        if ((var16 = method349(var14, var13, false, arg5[var10 - 1])) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg5.length || !method355(125, var13)) {
                                break label124;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg5.length) {
                boolean var17 = false;
                int var18 = method345(3, var8, arg0, arg3);
                int var19 = method346(arg3, arg1, 3, var9 - 1);
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
                                if (method355(125, arg3[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method355(125, arg3[var25])) {
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
                                    if (arg1[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg1[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg3.length; var29++) {
                            if (var28) {
                                if (method355(125, arg3[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method355(125, arg3[var29])) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II[C[C)I")
    private static final int method345(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method355(125, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method355(125, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 >= 3 && arg0 <= 3) {
                if (var5 >= 3) {
                    return 4;
                }
                if (method355(125, arg3[arg1 - 1])) {
                    return 1;
                }
                return 0;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CII)I")
    private static final int method346(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method355(125, arg0[var4])) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (field1048 != arg2) {
                return field1046;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg0.length && method355(125, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method355(125, arg0[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[BI[C[C)V")
    public static final void method347(byte[][] arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        if (arg1 != 5) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg3.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label163: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label163;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg3.length && (var16 = method350(arg3[var7], var15, 0, var14)) > 0) {
                        if (var16 == 1 && method358(-769, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method358(-769, var14) || method358(-769, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label163;
                        }
                        int var17;
                        if ((var17 = method350(arg3[var7 - 1], var15, 0, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method356(533, var14)) {
                                break label163;
                            }
                            if (method355(125, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method358(-769, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label163;
                            }
                        }
                    }
                }
            }
            if (var7 >= arg3.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method355(125, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method355(125, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method355(125, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method355(125, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method355(125, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method361(var27, 0)) {
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
                    byte var21 = method351(false, var19);
                    byte var22 = method351(false, var20);
                    if (arg0 != null && method348(arg0, -510, var21, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    for (int var32 = var5; var32 < var6; var32++) {
                        if (method358(-769, arg2[var32])) {
                            var30++;
                        } else if (method357(arg2[var32], (byte) 3)) {
                            var31++;
                        }
                    }
                    if (var30 <= var31) {
                        for (int var33 = var5; var33 < var6; var33++) {
                            arg2[var33] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[BIBB)Z")
    private static final boolean method348(byte[][] arg0, int arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (arg0[var4][0] == arg2 && arg0[var4][1] == arg3) {
            return true;
        } else {
            int var5 = arg0.length - 1;
            if (arg0[var5][0] == arg2 && arg0[var5][1] == arg3) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg0[var6][0] == arg2 && arg0[var6][1] == arg3) {
                    return true;
                }
                if (arg2 < arg0[var6][0] || arg0[var6][0] == arg2 && arg3 < arg0[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCZC)I")
    private static final int method349(char arg0, char arg1, boolean arg2, char arg3) {
        if (arg2) {
            return field1046;
        } else if (arg1 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg1 == '(' && arg0 == ')') {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCIC)I")
    private static final int method350(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 0) {
            field1044 = !field1044;
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
                    if (arg3 == '1' && arg1 == '3') {
                        return 2;
                    }
                    return 0;
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
                if (arg3 == '[' && arg1 == ')') {
                    return 2;
                }
                return 0;
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
                if (arg3 != '9' && arg3 != '6') {
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
                    if ((arg3 != '(' || arg1 != ')') && (arg3 != '[' || arg1 != ']') && (arg3 != '{' || arg1 != '}') && (arg3 != '<' || arg1 != '>')) {
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
                if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZC)B")
    private static final byte method351(boolean arg0, char arg1) {
        if (arg0) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CB)V")
    private static final void method352(char[] arg0, byte arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg1 != -96) {
            field1049 = !field1049;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method353(var3, arg0, -731)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method355(125, arg0[var8]) && !method356(533, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method354(var6, arg0, 7);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CI)I")
    private static final int method353(int arg0, char[] arg1, int arg2) {
        label35: while (true) {
            if (arg2 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label35;
                    }
                    var4++;
                }
            }
            for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    return var3;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(I[CI)I")
    private static final int method354(int arg0, char[] arg1, int arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 < 7 || arg2 > 7) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IC)Z")
    private static final boolean method355(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return !method357(arg1, (byte) 3) && !method358(-769, arg1);
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(IC)Z")
    private static final boolean method356(int arg0, char arg1) {
        int var2 = 12 / arg0;
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CB)Z")
    private static final boolean method357(char arg0, byte arg1) {
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(IC)Z")
    private static final boolean method358(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CI)Z")
    private static final boolean method359(char arg0, int arg1) {
        if (arg1 != -40593) {
            field1049 = !field1049;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "mc", name = "d", descriptor = "(IC)Z")
    private static final boolean method360(int arg0, char arg1) {
        if (arg0 != 5) {
            field1043 = !field1043;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "e", descriptor = "([CI)Z")
    private static final boolean method361(char[] arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method358(-769, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method362(arg0, 0);
        int var5 = 0;
        int var6 = field1050.length - 1;
        if (field1050[var5] == var4 || field1050[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1050[var7] == var4) {
                return true;
            }
            if (var4 < field1050[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "mc", name = "f", descriptor = "([CI)I")
    public static final int method362(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != 0) {
            return 2;
        }
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
