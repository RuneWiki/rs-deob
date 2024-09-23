import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class WordFilter {

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1073 = 24882;

    @OriginalMember(owner = "mc", name = "c", descriptor = "I")
    private static int field1074 = -178;

    @OriginalMember(owner = "mc", name = "e", descriptor = "I")
    private static int field1076 = 16180;

    @OriginalMember(owner = "mc", name = "f", descriptor = "I")
    private static int field1077 = 383;

    @OriginalMember(owner = "mc", name = "g", descriptor = "B")
    private static byte field1078 = 6;

    @OriginalMember(owner = "mc", name = "h", descriptor = "I")
    private static int field1079 = -81;

    @OriginalMember(owner = "mc", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1087 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "mc", name = "d", descriptor = "I")
    private static int field1075;

    @OriginalMember(owner = "mc", name = "q", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "mc", name = "a", descriptor = "Z")
    private static boolean field1072;

    @OriginalMember(owner = "mc", name = "i", descriptor = "Z")
    private static boolean field1080;

    @OriginalMember(owner = "mc", name = "j", descriptor = "[I")
    private static int[] field1081;

    @OriginalMember(owner = "mc", name = "o", descriptor = "[I")
    private static int[] field1086;

    @OriginalMember(owner = "mc", name = "k", descriptor = "[[C")
    private static char[][] field1082;

    @OriginalMember(owner = "mc", name = "m", descriptor = "[[C")
    private static char[][] field1084;

    @OriginalMember(owner = "mc", name = "n", descriptor = "[[C")
    private static char[][] field1085;

    @OriginalMember(owner = "mc", name = "l", descriptor = "[[[B")
    private static byte[][][] field1083;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lub;)V")
    public static final void method333(Jagfile arg0) {
        Packet var1 = new Packet(363, arg0.read("fragmentsenc.txt", null, (byte) 2));
        Packet var2 = new Packet(363, arg0.read("badenc.txt", null, (byte) 2));
        Packet var3 = new Packet(363, arg0.read("domainenc.txt", null, (byte) 2));
        Packet var4 = new Packet(363, arg0.read("tldlist.txt", null, (byte) 2));
        method334(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method334(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method336(-33152, arg1);
        method337(arg2, -717);
        method338(24882, arg0);
        method335(true, arg3);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZLkb;)V")
    private static final void method335(boolean arg0, Packet arg1) {
        int var2 = arg1.method221();
        field1085 = new char[var2][];
        field1086 = new int[var2];
        if (!arg0) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field1086[var3] = arg1.method216();
            char[] var4 = new char[arg1.method216()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method216();
            }
            field1085[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILkb;)V")
    private static final void method336(int arg0, Packet arg1) {
        int var2 = arg1.method221();
        if (arg0 != -33152) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1082 = new char[var2][];
        field1083 = new byte[var2][][];
        method339(field1083, field1082, arg1, (byte) 1);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method337(Packet arg0, int arg1) {
        int var2 = arg0.method221();
        if (arg1 < 0) {
            field1084 = new char[var2][];
            method340(-178, arg0, field1084);
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(ILkb;)V")
    private static final void method338(int arg0, Packet arg1) {
        field1081 = new int[arg1.method221()];
        for (int var2 = 0; var2 < field1081.length; var2++) {
            field1081[var2] = arg1.method218();
        }
        if (field1073 != arg0) {
            field1072 = !field1072;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[[B[[CLkb;B)V")
    private static final void method339(byte[][][] arg0, char[][] arg1, Packet arg2, byte arg3) {
        if (arg3 != 1) {
            return;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            char[] var6 = new char[arg2.method216()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg2.method216();
            }
            arg1[var5] = var6;
            byte[][] var8 = new byte[arg2.method216()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg2.method216();
                var8[var9][1] = (byte) arg2.method216();
            }
            if (var8.length > 0) {
                arg0[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILkb;[[C)V")
    private static final void method340(int arg0, Packet arg1, char[][] arg2) {
        label32: while (true) {
            if (arg0 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label32;
                    }
                    var6++;
                }
            }
            for (int var3 = 0; var3 < arg2.length; var3++) {
                char[] var4 = new char[arg1.method216()];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    var4[var5] = (char) arg1.method216();
                }
                arg2[var3] = var4;
            }
            return;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI)V")
    private static final void method341(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method342(16180, arg0[var3])) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1 != 0) {
            field1072 = !field1072;
        }
        for (int var4 = var2; var4 < arg0.length; var4++) {
            arg0[var4] = ' ';
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IC)Z")
    private static final boolean method342(int arg0, char arg1) {
        if (field1076 != arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method343(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method341(var4, 0);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method351(var6, 0);
        method346(true, var6);
        method347((byte) 120, var6);
        method360(8, var6);
        for (int var8 = 0; var8 < field1087.length; var8++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field1087[var8], var12 + 1)) != -1) {
                char[] var13 = field1087[var8].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        if (arg1 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        method344(var6, 135, var5.toCharArray());
        method345((byte) 6, var6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI[C)V")
    private static final void method344(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method368(0, arg2[var3])) {
                arg0[var3] = arg2[var3];
            }
        }
        int var4 = 76 / arg1;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[C)V")
    private static final void method345(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 != 6) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method365(-175, var5)) {
                var2 = true;
            } else if (var2) {
                if (method367((byte) 0, var5)) {
                    var2 = false;
                }
            } else if (method368(0, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[C)V")
    private static final void method346(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1082.length - 1; var3 >= 0; var3--) {
                method355((byte) -102, field1083[var3], arg1, field1082[var3]);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(B[C)V")
    private static final void method347(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method355((byte) -102, null, var2, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method355((byte) -102, null, var4, var5);
        if (arg0 == 120) {
            for (int var6 = field1084.length - 1; var6 >= 0; var6--) {
                method348(var4, -706, var2, field1084[var6], arg1);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI[C[C[C)V")
    private static final void method348(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        if (arg1 >= 0) {
            field1076 = -499;
        }
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg3.length; var6 += var9) {
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
                    if (var8 < arg3.length && (var13 = method357(-81, var12, arg3[var8], var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method357(-81, var12, arg3[var8 - 1], var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method363(var11, 2)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method349(var6, arg4, (byte) 6, arg2);
                int var17 = method350(arg0, arg4, var7 - 1, -808);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CB[C)I")
    private static final int method349(int arg0, char[] arg1, byte arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method363(arg1[var4], 2); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        if (field1078 != arg2) {
            return field1074;
        }
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = arg0 - 1; var7 >= 0 && method363(arg3[var7], 2); var7--) {
            if (arg3[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method363(arg1[arg0 - 1], 2)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CII)I")
    private static final int method350(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            return field1075;
        } else if (arg2 + 1 == arg1.length) {
            return 2;
        } else {
            int var4 = arg2 + 1;
            while (true) {
                if (var4 < arg1.length && method363(arg1[var4], 2)) {
                    if (arg1[var4] != '.' && arg1[var4] != ',') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg2 + 1; var6 < arg1.length && method363(arg0[var6], 2); var6++) {
                    if (arg0[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method363(arg1[arg2 + 1], 2)) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CI)V")
    private static final void method351(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method355((byte) -102, null, var2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg1 != 0) {
            field1072 = !field1072;
        }
        method355((byte) -102, null, var4, var5);
        for (int var6 = 0; var6 < field1085.length; var6++) {
            method352(var4, field1086[var6], true, arg0, field1085[var6], var2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CIZ[C[C[C)V")
    private static final void method352(char[] arg0, int arg1, boolean arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg4.length > arg3.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg3.length - arg4.length; var8 += var11) {
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
                    if (var10 < arg4.length && (var15 = method357(-81, var14, arg4[var10], var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label129;
                        }
                        int var16;
                        if ((var16 = method357(-81, var14, arg4[var10 - 1], var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg4.length || !method363(var13, 2)) {
                                break label129;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg4.length) {
                boolean var17 = false;
                int var18 = method353(arg3, false, arg5, var8);
                int var19 = method354(arg0, -678, var9 - 1, arg3);
                if (arg1 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg1 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg1 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg1 == 3 && var18 > 2 && var19 > 0) {
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
                                    if (arg5[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg5[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method363(arg3[var25], 2)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method363(arg3[var25], 2)) {
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
                                    if (arg0[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg0[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg3.length; var29++) {
                            if (var28) {
                                if (method363(arg3[var29], 2)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method363(arg3[var29], 2)) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CZ[CI)I")
    private static final int method353(char[] arg0, boolean arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method363(arg0[var4], 2)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg3 - 1; var7 >= 0 && method363(arg2[var7], 2); var7--) {
                if (arg2[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method363(arg0[arg3 - 1], 2)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CII[C)I")
    private static final int method354(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method363(arg3[var4], 2)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && method363(arg0[var6], 2); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (arg1 >= 0) {
                return 3;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method363(arg3[arg2 + 1], 2)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[[B[C[C)V")
    public static final void method355(byte arg0, byte[][] arg1, char[] arg2, char[] arg3) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        if (arg0 != -102) {
            field1077 = -198;
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
                    if (var7 < arg3.length && (var16 = method358(var15, arg3[var7], var14, 7326)) > 0) {
                        if (var16 == 1 && method366(var14, 10361)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method366(var14, 10361) || method366(var15, 10361))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label163;
                        }
                        int var17;
                        if ((var17 = method358(var15, arg3[var7 - 1], var14, 7326)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method364(var14, (byte) 13)) {
                                break label163;
                            }
                            if (method363(var14, 2) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method366(var14, 10361)) {
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
                    if (var5 - 1 < 0 || method363(arg2[var5 - 1], 2) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method363(arg2[var6], 2) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method363(arg2[var26], 2) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method363(arg2[var26 + var28], 2) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method363(arg2[var26 - 1], 2) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method369(var27, 6)) {
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
                    byte var21 = method359(0, var19);
                    byte var22 = method359(0, var20);
                    if (arg1 != null && method356(841, var21, arg1, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    for (int var32 = var5; var32 < var6; var32++) {
                        if (method366(arg2[var32], 10361)) {
                            var30++;
                        } else if (method365(-175, arg2[var32])) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IB[[BB)Z")
    private static final boolean method356(int arg0, byte arg1, byte[][] arg2, byte arg3) {
        if (arg0 <= 0) {
            field1080 = !field1080;
        }
        int var4 = 0;
        if (arg2[var4][0] == arg1 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg1 && arg2[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg1 && arg2[var6][1] == arg3) {
                return true;
            }
            if (arg1 < arg2[var6][0] || arg2[var6][0] == arg1 && arg3 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ICCC)I")
    private static final int method357(int arg0, char arg1, char arg2, char arg3) {
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCCI)I")
    private static final int method358(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != 7326) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg2) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if (arg2 == '1' && arg0 == '3') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'd') {
                if (arg2 == '[' && arg0 == ')') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'f') {
                if (arg2 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'g') {
                if (arg2 != '9' && arg2 != '6') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                if (arg2 != '0' && arg2 != '*') {
                    if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
                        return 0;
                    }
                    return 2;
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
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'v') {
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg2 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg1 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg1 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg1 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg1 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(IC)B")
    private static final byte method359(int arg0, char arg1) {
        if (arg0 != 0) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C)V")
    private static final void method360(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != 8) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method361(149, arg1, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method363(arg1[var8], 2) && !method364(arg1[var8], (byte) 13)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method362(6, var6, arg1);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CI)I")
    private static final int method361(int arg0, char[] arg1, int arg2) {
        int var3 = 66 / arg0;
        for (int var4 = arg2; var4 < arg1.length && var4 >= 0; var4++) {
            if (arg1[var4] >= '0' && arg1[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II[C)I")
    private static final int method362(int arg0, int arg1, char[] arg2) {
        if (arg0 != 6) {
            return 4;
        }
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CI)Z")
    private static final boolean method363(char arg0, int arg1) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        return !method365(-175, arg0) && !method366(arg0, 10361);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CB)Z")
    private static final boolean method364(char arg0, byte arg1) {
        if (arg1 != 13) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(IC)Z")
    private static final boolean method365(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CI)Z")
    private static final boolean method366(char arg0, int arg1) {
        if (arg1 != 10361) {
            field1073 = -124;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BC)Z")
    private static final boolean method367(byte arg0, char arg1) {
        if (arg0 != 0) {
            field1074 = -254;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "mc", name = "d", descriptor = "(IC)Z")
    private static final boolean method368(int arg0, char arg1) {
        if (arg0 < 0 || arg0 > 0) {
            field1072 = !field1072;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "([CI)Z")
    private static final boolean method369(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method366(arg0[var3], 10361) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method370(5, arg0);
        int var5 = 0;
        if (arg1 != 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = field1081.length - 1;
        if (field1081[var5] == var4 || field1081[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var7) / 2;
            if (field1081[var8] == var4) {
                return true;
            }
            if (var4 < field1081[var8]) {
                var7 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var7 && var5 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(I[C)I")
    public static final int method370(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var5 = arg1[arg1.length - var3 - 1];
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
        if (arg0 < 5 || arg0 > 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }
}
