import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class WordFilter {

    @OriginalMember(owner = "mc", name = "c", descriptor = "Z")
    private static boolean field1063 = true;

    @OriginalMember(owner = "mc", name = "d", descriptor = "B")
    private static byte field1064 = -105;

    @OriginalMember(owner = "mc", name = "e", descriptor = "B")
    private static byte field1065 = -40;

    @OriginalMember(owner = "mc", name = "f", descriptor = "B")
    private static byte field1066 = 7;

    @OriginalMember(owner = "mc", name = "g", descriptor = "B")
    private static byte field1067 = 2;

    @OriginalMember(owner = "mc", name = "i", descriptor = "I")
    private static int field1069 = -142;

    @OriginalMember(owner = "mc", name = "j", descriptor = "I")
    private static int field1070 = -25272;

    @OriginalMember(owner = "mc", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1077 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "mc", name = "a", descriptor = "I")
    private static int field1061;

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1062;

    @OriginalMember(owner = "mc", name = "r", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "mc", name = "h", descriptor = "Z")
    private static boolean field1068;

    @OriginalMember(owner = "mc", name = "k", descriptor = "[I")
    private static int[] field1071;

    @OriginalMember(owner = "mc", name = "p", descriptor = "[I")
    private static int[] field1076;

    @OriginalMember(owner = "mc", name = "l", descriptor = "[[C")
    private static char[][] field1072;

    @OriginalMember(owner = "mc", name = "n", descriptor = "[[C")
    private static char[][] field1074;

    @OriginalMember(owner = "mc", name = "o", descriptor = "[[C")
    private static char[][] field1075;

    @OriginalMember(owner = "mc", name = "m", descriptor = "[[[B")
    private static byte[][][] field1073;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lub;)V")
    public static final void method333(Jagfile arg0) {
        Packet var1 = new Packet((byte) 64, arg0.method257(null, "fragmentsenc.txt", -31149));
        Packet var2 = new Packet((byte) 64, arg0.method257(null, "badenc.txt", -31149));
        Packet var3 = new Packet((byte) 64, arg0.method257(null, "domainenc.txt", -31149));
        Packet var4 = new Packet((byte) 64, arg0.method257(null, "tldlist.txt", -31149));
        method334(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method334(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method336(581, arg1);
        method337(665, arg2);
        method338(arg0, 557);
        method335(214, arg3);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILkb;)V")
    private static final void method335(int arg0, Packet arg1) {
        int var2 = arg1.method221();
        field1075 = new char[var2][];
        int var3 = 99 / arg0;
        field1076 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1076[var4] = arg1.method216();
            char[] var5 = new char[arg1.method216()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method216();
            }
            field1075[var4] = var5;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(ILkb;)V")
    private static final void method336(int arg0, Packet arg1) {
        int var2 = arg1.method221();
        field1072 = new char[var2][];
        field1073 = new byte[var2][][];
        method339(-139, field1072, field1073, arg1);
        int var3 = 66 / arg0;
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(ILkb;)V")
    private static final void method337(int arg0, Packet arg1) {
        int var2 = arg1.method221();
        field1074 = new char[var2][];
        method340(arg1, 4932, field1074);
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method338(Packet arg0, int arg1) {
        field1071 = new int[arg0.method221()];
        for (int var2 = 0; var2 < field1071.length; var2++) {
            field1071[var2] = arg0.method218();
        }
        if (arg1 == 557) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[[C[[[BLkb;)V")
    private static final void method339(int arg0, char[][] arg1, byte[][][] arg2, Packet arg3) {
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg3.method216()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method216();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg3.method216()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method216();
                var7[var8][1] = (byte) arg3.method216();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        while (arg0 >= 0) {
            field1070 = 6;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I[[C)V")
    private static final void method340(Packet arg0, int arg1, char[][] arg2) {
        if (arg1 != 4932) {
            field1068 = !field1068;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method216()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method216();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C)V")
    private static final void method341(int arg0, char[] arg1) {
        if (arg0 < 5 || arg0 > 5) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method342(24073, arg1[var3])) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IC)Z")
    private static final boolean method342(int arg0, char arg1) {
        if (arg0 != 24073) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method343(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method341(5, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        int var7 = 99 / arg1;
        String var8 = var5.toLowerCase();
        method351((byte) 77, var6);
        method346(var6, (byte) 104);
        method347(0, var6);
        method360(var6, (byte) -105);
        for (int var9 = 0; var9 < field1077.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1077[var9], var12 + 1)) != -1) {
                char[] var13 = field1077[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method344(var6, var5.toCharArray(), true);
        method345(0, var6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CZ)V")
    private static final void method344(char[] arg0, char[] arg1, boolean arg2) {
        if (!arg2) {
            field1063 = !field1063;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method368(arg1[var3], (byte) 7)) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(I[C)V")
    private static final void method345(int arg0, char[] arg1) {
        if (arg0 != 0) {
            field1069 = 97;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method365(var4, false)) {
                var2 = true;
            } else if (var2) {
                if (method367(false, var4)) {
                    var2 = false;
                }
            } else if (method368(var4, (byte) 7)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CB)V")
    private static final void method346(char[] arg0, byte arg1) {
        if (arg1 != 104) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1072.length - 1; var4 >= 0; var4--) {
                method355(field1072[var4], arg0, field1063, field1073[var4]);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(I[C)V")
    private static final void method347(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method355(var3, var2, field1063, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method355(var5, var4, field1063, null);
        for (int var6 = field1074.length - 1; var6 >= 0; var6--) {
            method348(arg1, var4, field1062, var2, field1074[var6]);
        }
        if (arg0 != 0) {
            field1068 = !field1068;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method348(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method357(var12, true, var13, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method357(var12, true, var13, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method363(var12, -4123)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method349(arg3, (byte) -2, arg0, var7);
                int var18 = method350(var8 - 1, arg1, arg0, (byte) -52);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg0[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CB[CI)I")
    private static final int method349(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method363(arg2[var4], -4123); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg1 != -2) {
            return 4;
        }
        for (int var6 = arg3 - 1; var6 >= 0 && method363(arg0[var6], -4123); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method363(arg2[arg3 - 1], -4123)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method350(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method363(arg2[var4], -4123)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method363(arg1[var6], -4123); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 != -52) {
                return field1062;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method363(arg2[arg0 + 1], -4123)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[C)V")
    private static final void method351(byte arg0, char[] arg1) {
        if (arg0 != 77) {
            field1068 = !field1068;
        }
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method355(var3, var2, field1063, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method355(var5, var4, field1063, null);
        for (int var6 = 0; var6 < field1075.length; var6++) {
            method352(field1075[var6], (byte) -119, var2, arg1, var4, field1076[var6]);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CB[C[C[CI)V")
    private static final void method352(char[] arg0, byte arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg0.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        if (arg1 != -119) {
            field1069 = -162;
        }
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg3.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg3[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg3.length) {
                        var13 = arg3[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method357(var12, true, var13, arg0[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method357(var12, true, var13, arg0[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method363(var12, -4123)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method353(0, arg3, arg2, var7);
                int var18 = method354((byte) 9, var8 - 1, arg3, arg4);
                if (arg5 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg5 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg5 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg5 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method363(arg3[var24], -4123)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method363(arg3[var24], -4123)) {
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
                                    if (arg4[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg4[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg3.length; var28++) {
                            if (var27) {
                                if (method363(arg3[var28], -4123)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method363(arg3[var28], -4123)) {
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
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method353(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method363(arg1[var4], -4123)) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method363(arg2[var6], -4123); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 != 0) {
                field1061 = -436;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method363(arg1[arg3 - 1], -4123)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BI[C[C)I")
    private static final int method354(byte arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method363(arg2[var4], -4123)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg0 != 9) {
                field1062 = -39;
            }
            for (int var6 = arg1 + 1; var6 < arg2.length && method363(arg3[var6], -4123); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method363(arg2[arg1 + 1], -4123)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CZ[[B)V")
    public static final void method355(char[] arg0, char[] arg1, boolean arg2, byte[][] arg3) {
        if (!arg2) {
            field1062 = -386;
        }
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label163: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label163;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg0.length && (var16 = method358(arg0[var7], var14, var15, (byte) -33)) > 0) {
                        if (var16 == 1 && method366(18, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method366(18, var14) || method366(18, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label163;
                        }
                        int var17;
                        if ((var17 = method358(arg0[var7 - 1], var14, var15, (byte) -33)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method364(var14, (byte) -40)) {
                                break label163;
                            }
                            if (method363(var14, -4123) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method366(18, var14)) {
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
            if (var7 >= arg0.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method363(arg1[var5 - 1], -4123) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method363(arg1[var6], -4123) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method363(arg1[var26], -4123) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method363(arg1[var26 + var28], -4123) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method363(arg1[var26 - 1], -4123) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method369(field1067, var27)) {
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
                    byte var21 = method359(var19, true);
                    byte var22 = method359(var20, true);
                    if (arg3 != null && method356(arg3, var21, var22, -36293)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    for (int var32 = var5; var32 < var6; var32++) {
                        if (method366(18, arg1[var32])) {
                            var30++;
                        } else if (method365(arg1[var32], false)) {
                            var31++;
                        }
                    }
                    if (var30 <= var31) {
                        for (int var33 = var5; var33 < var6; var33++) {
                            arg1[var33] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[BBBI)Z")
    private static final boolean method356(byte[][] arg0, byte arg1, byte arg2, int arg3) {
        int var4 = 0;
        if (arg0[var4][0] == arg1 && arg0[var4][1] == arg2) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg3 != -36293) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0[var5][0] == arg1 && arg0[var5][1] == arg2) {
            return true;
        }
        do {
            int var7 = (var4 + var5) / 2;
            if (arg0[var7][0] == arg1 && arg0[var7][1] == arg2) {
                return true;
            }
            if (arg1 < arg0[var7][0] || arg0[var7][0] == arg1 && arg2 < arg0[var7][1]) {
                var5 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CZCC)I")
    private static final int method357(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            return 2;
        } else if (arg0 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg0 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCCB)I")
    private static final int method358(char arg0, char arg1, char arg2, byte arg3) {
        if (arg3 != -33) {
            return 2;
        } else if (arg0 == arg1) {
            return 1;
        } else {
            if (arg0 >= 'a' && arg0 <= 'm') {
                if (arg0 == 'a') {
                    if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                        if (arg1 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'b') {
                    if (arg1 != '6' && arg1 != '8') {
                        if (arg1 == '1' && arg2 == '3') {
                            return 2;
                        }
                        return 0;
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
                    if (arg1 == '[' && arg2 == ')') {
                        return 2;
                    }
                    return 0;
                }
                if (arg0 == 'e') {
                    if (arg1 != '3' && arg1 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'f') {
                    if (arg1 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg1 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'g') {
                    if (arg1 != '9' && arg1 != '6') {
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
                        if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
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
                    if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'v') {
                    if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'w') {
                    if (arg1 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg0 == 'x') {
                    if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
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
                    } else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CZ)B")
    private static final byte method359(char arg0, boolean arg1) {
        if (!arg1) {
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

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CB)V")
    private static final void method360(char[] arg0, byte arg1) {
        boolean var2 = false;
        if (field1064 != arg1) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method361(var3, 715, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method363(arg0[var8], -4123) && !method364(arg0[var8], (byte) -40)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method362(var6, arg0, true);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II[C)I")
    private static final int method361(int arg0, int arg1, char[] arg2) {
        if (arg1 <= 0) {
            field1061 = 34;
        }
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CZ)I")
    private static final int method362(int arg0, char[] arg1, boolean arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (!arg2) {
                return 0;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CI)Z")
    private static final boolean method363(char arg0, int arg1) {
        if (arg1 != -4123) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method365(arg0, false) && !method366(18, arg0);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CB)Z")
    private static final boolean method364(char arg0, byte arg1) {
        if (field1065 != arg1) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CZ)Z")
    private static final boolean method365(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(IC)Z")
    private static final boolean method366(int arg0, char arg1) {
        int var2 = 15 / arg0;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method367(boolean arg0, char arg1) {
        if (arg0) {
            field1061 = 461;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CB)Z")
    private static final boolean method368(char arg0, byte arg1) {
        if (field1066 != arg1) {
            field1068 = !field1068;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(B[C)Z")
    private static final boolean method369(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (!method366(18, arg1[var4]) && arg1[var4] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var5 = method370((byte) 5, arg1);
        int var6 = 0;
        int var7 = field1071.length - 1;
        if (field1071[var6] == var5 || field1071[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1071[var8] == var5) {
                return true;
            }
            if (var5 < field1071[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(B[C)I")
    public static final int method370(byte arg0, char[] arg1) {
        if (arg0 != 5) {
            return 3;
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
