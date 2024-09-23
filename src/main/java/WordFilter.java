import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class WordFilter {

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private static boolean field1170 = true;

    @OriginalMember(owner = "qc", name = "c", descriptor = "I")
    private static int field1172 = -5797;

    @OriginalMember(owner = "qc", name = "e", descriptor = "Z")
    private static boolean field1174 = true;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    private static int field1175 = -556;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    private static int field1176 = -556;

    @OriginalMember(owner = "qc", name = "h", descriptor = "B")
    private static byte field1177 = 15;

    @OriginalMember(owner = "qc", name = "i", descriptor = "B")
    private static byte field1178 = 2;

    @OriginalMember(owner = "qc", name = "j", descriptor = "Z")
    private static boolean field1179 = true;

    @OriginalMember(owner = "qc", name = "k", descriptor = "I")
    private static int field1180 = 27016;

    @OriginalMember(owner = "qc", name = "l", descriptor = "I")
    private static int field1181 = 9;

    @OriginalMember(owner = "qc", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1188 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

    @OriginalMember(owner = "qc", name = "d", descriptor = "I")
    private static int field1173;

    @OriginalMember(owner = "qc", name = "b", descriptor = "Z")
    private static boolean field1171;

    @OriginalMember(owner = "qc", name = "t", descriptor = "Z")
    public static boolean field1189;

    @OriginalMember(owner = "qc", name = "m", descriptor = "[I")
    private static int[] field1182;

    @OriginalMember(owner = "qc", name = "r", descriptor = "[I")
    private static int[] field1187;

    @OriginalMember(owner = "qc", name = "n", descriptor = "[[C")
    private static char[][] field1183;

    @OriginalMember(owner = "qc", name = "p", descriptor = "[[C")
    private static char[][] field1185;

    @OriginalMember(owner = "qc", name = "q", descriptor = "[[C")
    private static char[][] field1186;

    @OriginalMember(owner = "qc", name = "o", descriptor = "[[[B")
    private static byte[][][] field1184;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lyb;)V")
    public static final void method389(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method308("fragmentsenc.txt", null), false);
        Packet var2 = new Packet(arg0.method308("badenc.txt", null), false);
        Packet var3 = new Packet(arg0.method308("domainenc.txt", null), false);
        Packet var4 = new Packet(arg0.method308("tldlist.txt", null), false);
        method390(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method390(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method392(arg1, 6);
        method393(arg2, -826);
        method394(false, arg0);
        method391(arg3, (byte) 66);
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lmb;B)V")
    private static final void method391(Packet arg0, byte arg1) {
        int var2 = arg0.method243();
        if (arg1 != 66) {
            return;
        }
        field1186 = new char[var2][];
        field1187 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1187[var3] = arg0.method238();
            char[] var4 = new char[arg0.method238()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method238();
            }
            field1186[var3] = var4;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lmb;I)V")
    private static final void method392(Packet arg0, int arg1) {
        int var2 = arg0.method243();
        field1183 = new char[var2][];
        field1184 = new byte[var2][][];
        if (arg1 < 6 || arg1 > 6) {
            field1171 = !field1171;
        }
        method395(arg0, field1184, field1183, 1);
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "(Lmb;I)V")
    private static final void method393(Packet arg0, int arg1) {
        int var2 = arg0.method243();
        field1185 = new char[var2][];
        if (arg1 >= 0) {
            field1170 = !field1170;
        }
        method396(field1185, arg0, 0);
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ZLmb;)V")
    private static final void method394(boolean arg0, Packet arg1) {
        if (arg0) {
            field1172 = 215;
        }
        field1182 = new int[arg1.method243()];
        for (int var2 = 0; var2 < field1182.length; var2++) {
            field1182[var2] = arg1.method240();
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Lmb;[[[B[[CI)V")
    private static final void method395(Packet arg0, byte[][][] arg1, char[][] arg2, int arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method238()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method238();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method238()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method238();
                var7[var8][1] = (byte) arg0.method238();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg3 < 1 || arg3 > 1) {
            field1172 = 64;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([[CLmb;I)V")
    private static final void method396(char[][] arg0, Packet arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method238()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method238();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Z[C)V")
    private static final void method397(boolean arg0, char[] arg1) {
        int var2 = 0;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method398(0, arg1[var4])) {
                arg1[var2] = arg1[var4];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var5 = var2; var5 < arg1.length; var5++) {
            arg1[var5] = ' ';
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IC)Z")
    private static final boolean method398(int arg0, char arg1) {
        if (arg0 != 0) {
            field1173 = 348;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method399(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        method397(false, var4);
        String var6 = (new String(var4)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method407(var7, -303);
        method402(var7, field1177);
        method403(var7, (byte) 1);
        method416(var7, 264);
        for (int var9 = 0; var9 < field1188.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1188[var9], var12 + 1)) != -1) {
                char[] var13 = field1188[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method400(var6.toCharArray(), var7, field1175);
        method401(var7, false);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([C[CI)V")
    private static final void method400(char[] arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method424(-663, arg0[var3])) {
                arg1[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([CZ)V")
    private static final void method401(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method421(-209, var4)) {
                var2 = true;
            } else if (var2) {
                if (method423(var4, field1181)) {
                    var2 = false;
                }
            } else if (method424(-663, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1) {
            field1171 = !field1171;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([CB)V")
    private static final void method402(char[] arg0, byte arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1183.length - 1; var4 >= 0; var4--) {
                method411(field1183[var4], 404, field1184[var4], arg0);
            }
        }
        if (arg1 != 15) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "([CB)V")
    private static final void method403(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method411(var3, 404, null, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 != 1) {
            return;
        }
        boolean var6 = false;
        method411(var5, 404, null, var4);
        for (int var7 = field1185.length - 1; var7 >= 0; var7--) {
            method404(field1185[var7], arg0, (byte) 57, var4, var2);
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([C[CB[C[C)V")
    private static final void method404(char[] arg0, char[] arg1, byte arg2, char[] arg3, char[] arg4) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg0.length; var6 += var9) {
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
                    if (var8 < arg0.length && (var13 = method413(arg0[var8], var12, var11, true)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method413(arg0[var8 - 1], var12, var11, true)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method419(31802, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method405(var6, true, arg1, arg4);
                int var17 = method406(arg3, var7 - 1, -412, arg1);
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
        if (arg2 == 57) {
            ;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(IZ[C[C)I")
    private static final int method405(int arg0, boolean arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method419(31802, arg2[var4]); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method419(31802, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (!arg1) {
            return 2;
        } else if (var5 >= 3) {
            return 4;
        } else if (method419(31802, arg2[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([CII[C)I")
    private static final int method406(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var5 = arg1 + 1;
        while (true) {
            if (var5 < arg3.length && method419(31802, arg3[var5])) {
                if (arg3[var5] != '.' && arg3[var5] != ',') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg3.length && method419(31802, arg0[var7]); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method419(31802, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([CI)V")
    private static final void method407(char[] arg0, int arg1) {
        label25: while (true) {
            if (arg1 >= 0) {
                int var7 = 1;
                while (true) {
                    if (var7 <= 0) {
                        continue label25;
                    }
                    var7++;
                }
            }
            char[] var2 = (char[]) arg0.clone();
            char[] var3 = new char[] { 'd', 'o', 't' };
            method411(var3, 404, null, var2);
            char[] var4 = (char[]) arg0.clone();
            char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
            method411(var5, 404, null, var4);
            for (int var6 = 0; var6 < field1186.length; var6++) {
                method408(arg0, var2, var4, field1187[var6], (byte) 2, field1186[var6]);
            }
            return;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([C[C[CIB[C)V")
    private static final void method408(char[] arg0, char[] arg1, char[] arg2, int arg3, byte arg4, char[] arg5) {
        if (arg5.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        if (field1178 == arg4) {
            boolean var7 = false;
        } else {
            field1171 = !field1171;
        }
        int var11;
        for (int var8 = 0; var8 <= arg0.length - arg5.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label134: while (true) {
                while (true) {
                    if (var9 >= arg0.length) {
                        break label134;
                    }
                    boolean var12 = false;
                    char var13 = arg0[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg0.length) {
                        var14 = arg0[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg5.length && (var15 = method413(arg5[var10], var14, var13, true)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label134;
                        }
                        int var16;
                        if ((var16 = method413(arg5[var10 - 1], var14, var13, true)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg5.length || !method419(31802, var13)) {
                                break label134;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg5.length) {
                boolean var17 = false;
                int var18 = method409(true, arg1, arg0, var8);
                int var19 = method410(arg0, (byte) -54, arg2, var9 - 1);
                if (arg3 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg3 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg3 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var18 > 2 && var19 > 0) {
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
                                if (method419(31802, arg0[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method419(31802, arg0[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg0.length; var27++) {
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
                        for (int var29 = var21 + 1; var29 < arg0.length; var29++) {
                            if (var28) {
                                if (method419(31802, arg0[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method419(31802, arg0[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg0[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(Z[C[CI)I")
    private static final int method409(boolean arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method419(31802, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (!arg0) {
                field1174 = !field1174;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method419(31802, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method419(31802, arg2[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([CB[CI)I")
    private static final int method410(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg1 != -54) {
            field1181 = 21;
        }
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method419(31802, arg0[var4])) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg0.length && method419(31802, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method419(31802, arg0[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "([CI[[B[C)V")
    public static final void method411(char[] arg0, int arg1, byte[][] arg2, char[] arg3) {
        if (arg0.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label162: while (true) {
                while (true) {
                    if (var7 >= arg3.length || var12 && var13) {
                        break label162;
                    }
                    boolean var14 = false;
                    char var15 = arg3[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg3.length) {
                        var16 = arg3[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg0.length && (var17 = method414(arg0[var8], var16, var15, -18724)) > 0) {
                        if (var17 == 1 && method422(var15, 27016)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method422(var15, 27016) || method422(var16, 27016))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label162;
                        }
                        int var18;
                        if ((var18 = method414(arg0[var8 - 1], var16, var15, -18724)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method420(414, var15)) {
                                break label162;
                            }
                            if (method419(31802, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method422(var15, 27016)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label162;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg0.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var5 - 1 < 0 || method419(31802, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg3.length || method419(31802, arg3[var7]) && arg3[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method419(31802, arg3[var27]) || arg3[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg3.length && (!method419(31802, arg3[var27 + var29]) || arg3[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg3[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method419(31802, arg3[var27 - 1]) || arg3[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method425(true, var28)) {
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
                        var20 = arg3[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg3.length) {
                        var21 = arg3[var7];
                    }
                    byte var22 = method415(var20, -855);
                    byte var23 = method415(var21, -855);
                    if (arg2 != null && method412(var22, false, arg2, var23)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method422(arg3[var34], 27016)) {
                            var31++;
                        } else if (method421(-209, arg3[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 + 1 - var33;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg3[var35] = '*';
                        }
                    }
                }
            }
        }
        int var6 = 6 / arg1;
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(BZ[[BB)Z")
    private static final boolean method412(byte arg0, boolean arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg1) {
            throw new NullPointerException();
        } else if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
            return true;
        } else {
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
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(CCCZ)I")
    private static final int method413(char arg0, char arg1, char arg2, boolean arg3) {
        if (!arg3) {
            field1179 = !field1179;
        }
        if (arg0 == arg2) {
            return 1;
        } else if (arg0 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "qc", name = "a", descriptor = "(CCCI)I")
    private static final int method414(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != -18724) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
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

    @OriginalMember(owner = "qc", name = "a", descriptor = "(CI)B")
    private static final byte method415(char arg0, int arg1) {
        if (arg1 >= 0) {
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

    @OriginalMember(owner = "qc", name = "b", descriptor = "([CI)V")
    private static final void method416(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 <= 0) {
            return;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method417(0, arg0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method419(31802, arg0[var8]) && !method420(414, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method418(var6, arg0, 530);
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

    @OriginalMember(owner = "qc", name = "a", descriptor = "(I[CI)I")
    private static final int method417(int arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return arg0 >= 0 && arg0 <= 0 ? -1 : field1176;
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "(I[CI)I")
    private static final int method418(int arg0, char[] arg1, int arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 <= 0) {
                field1173 = -430;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "(IC)Z")
    private static final boolean method419(int arg0, char arg1) {
        if (arg0 != 31802) {
            field1172 = -138;
        }
        return !method421(-209, arg1) && !method422(arg1, 27016);
    }

    @OriginalMember(owner = "qc", name = "c", descriptor = "(IC)Z")
    private static final boolean method420(int arg0, char arg1) {
        int var2 = 33 / arg0;
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "qc", name = "d", descriptor = "(IC)Z")
    private static final boolean method421(int arg0, char arg1) {
        while (arg0 >= 0) {
            field1176 = 385;
        }
        if ((arg1 < 'a' || arg1 > 'z') && (arg1 < 'A' || arg1 > 'Z')) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "(CI)Z")
    private static final boolean method422(char arg0, int arg1) {
        if (field1180 != arg1) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "qc", name = "c", descriptor = "(CI)Z")
    private static final boolean method423(char arg0, int arg1) {
        if (arg1 != 9) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "qc", name = "e", descriptor = "(IC)Z")
    private static final boolean method424(int arg0, char arg1) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'A' && arg1 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "(Z[C)Z")
    private static final boolean method425(boolean arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method422(arg1[var3], 27016) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method426(arg1, true);
        int var5 = 0;
        if (!arg0) {
            throw new NullPointerException();
        }
        int var6 = field1182.length - 1;
        if (field1182[var5] == var4 || field1182[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1182[var7] == var4) {
                return true;
            }
            if (var4 < field1182[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "qc", name = "b", descriptor = "([CZ)I")
    public static final int method426(char[] arg0, boolean arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (!arg1) {
            return 1;
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
