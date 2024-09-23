import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class WordFilter {

    @OriginalMember(owner = "mc", name = "a", descriptor = "Z")
    private static boolean field1072 = true;

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1073 = 5;

    @OriginalMember(owner = "mc", name = "d", descriptor = "Z")
    private static boolean field1075 = true;

    @OriginalMember(owner = "mc", name = "e", descriptor = "Z")
    private static boolean field1076 = true;

    @OriginalMember(owner = "mc", name = "f", descriptor = "I")
    private static int field1077 = 3;

    @OriginalMember(owner = "mc", name = "g", descriptor = "B")
    private static byte field1078 = 3;

    @OriginalMember(owner = "mc", name = "h", descriptor = "B")
    private static byte field1079 = 3;

    @OriginalMember(owner = "mc", name = "i", descriptor = "Z")
    private static boolean field1080 = true;

    @OriginalMember(owner = "mc", name = "j", descriptor = "I")
    private static int field1081 = 22945;

    @OriginalMember(owner = "mc", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1088 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "mc", name = "r", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "mc", name = "c", descriptor = "Z")
    private static boolean field1074;

    @OriginalMember(owner = "mc", name = "k", descriptor = "[I")
    private static int[] field1082;

    @OriginalMember(owner = "mc", name = "p", descriptor = "[I")
    private static int[] field1087;

    @OriginalMember(owner = "mc", name = "l", descriptor = "[[C")
    private static char[][] field1083;

    @OriginalMember(owner = "mc", name = "n", descriptor = "[[C")
    private static char[][] field1085;

    @OriginalMember(owner = "mc", name = "o", descriptor = "[[C")
    private static char[][] field1086;

    @OriginalMember(owner = "mc", name = "m", descriptor = "[[[B")
    private static byte[][][] field1084;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lub;)V")
    public static final void method324(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method249("fragmentsenc.txt", true, null), field1072);
        Packet var2 = new Packet(arg0.method249("badenc.txt", true, null), field1072);
        Packet var3 = new Packet(arg0.method249("domainenc.txt", true, null), field1072);
        Packet var4 = new Packet(arg0.method249("tldlist.txt", true, null), field1072);
        method325(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method325(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method327(arg1, -537);
        method328((byte) 4, arg2);
        method329(arg0, 0);
        method326(arg3, -586);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method326(Packet arg0, int arg1) {
        int var2 = arg0.method213();
        while (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        field1086 = new char[var2][];
        field1087 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1087[var3] = arg0.method208();
            char[] var4 = new char[arg0.method208()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method208();
            }
            field1086[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(Lkb;I)V")
    private static final void method327(Packet arg0, int arg1) {
        int var2 = arg0.method213();
        field1083 = new char[var2][];
        field1084 = new byte[var2][][];
        method330(field1084, 3, field1083, arg0);
        while (arg1 >= 0) {
            field1073 = -121;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BLkb;)V")
    private static final void method328(byte arg0, Packet arg1) {
        int var2 = arg1.method213();
        field1085 = new char[var2][];
        if (arg0 != 4) {
            field1073 = -37;
        }
        method331(255, field1085, arg1);
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(Lkb;I)V")
    private static final void method329(Packet arg0, int arg1) {
        if (arg1 == 0) {
            field1082 = new int[arg0.method213()];
            for (int var2 = 0; var2 < field1082.length; var2++) {
                field1082[var2] = arg0.method210();
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[[BI[[CLkb;)V")
    private static final void method330(byte[][][] arg0, int arg1, char[][] arg2, Packet arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg3.method208()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method208();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg3.method208()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method208();
                var7[var8][1] = (byte) arg3.method208();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
        if (field1077 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[[CLkb;)V")
    private static final void method331(int arg0, char[][] arg1, Packet arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method208()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method208();
            }
            arg1[var3] = var4;
        }
        if (arg0 <= 0) {
            field1075 = !field1075;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[C)V")
    private static final void method332(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (!method333(arg1[var2], -441)) {
                arg1[var2] = ' ';
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CI)Z")
    private static final boolean method333(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method334(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toLowerCase().toCharArray();
        method332(false, var4);
        method342(1454, var4);
        method337(var4, false);
        method338(var4, -397);
        method351(0, var4);
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < field1088.length; var6++) {
            int var9 = -1;
            while ((var9 = arg1.indexOf(field1088[var6], var9 + 1)) != -1) {
                char[] var10 = field1088[var6].toCharArray();
                for (int var11 = 0; var11 < var10.length; var11++) {
                    var4[var9 + var11] = var10[var11];
                }
            }
        }
        method335(var4, arg1.toCharArray(), 9);
        method336(var4, 728);
        long var7 = System.currentTimeMillis();
        return (new String(var4)).trim();
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CI)V")
    private static final void method335(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method359(true, arg1[var3])) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2 != 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI)V")
    private static final void method336(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var5 = arg0[var3];
            if (!method356(22945, var5)) {
                var2 = true;
            } else if (var2) {
                if (method358(var5, 0)) {
                    var2 = false;
                }
            } else if (method359(true, var5)) {
                arg0[var3] = (char) (var5 + 'a' - 65);
            }
        }
        int var4 = 45 / arg1;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CZ)V")
    private static final void method337(char[] arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1083.length - 1; var3 >= 0; var3--) {
                method346(field1083[var3], field1084[var3], field1078, arg0);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CI)V")
    private static final void method338(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method346(var3, null, field1078, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method346(var5, null, field1078, var4);
        for (int var6 = field1085.length - 1; var6 >= 0; var6--) {
            method339(false, arg0, var2, var4, field1085[var6]);
        }
        while (arg1 >= 0) {
            field1073 = 247;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[C[C[C[C)V")
    private static final void method339(boolean arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        if (arg0) {
            return;
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
                    if (var8 < arg4.length && (var13 = method348(var12, var11, arg4[var8], (byte) 6)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method348(var12, var11, arg4[var8 - 1], (byte) 6)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method354(true, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method340(arg1, 0, var6, arg2);
                int var17 = method341(395, var7 - 1, arg3, arg1);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CII[C)I")
    private static final int method340(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method354(true, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method354(true, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (arg1 != 0) {
            return field1077;
        } else if (var5 >= 3) {
            return 4;
        } else if (method354(true, arg0[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II[C[C)I")
    private static final int method341(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method354(true, arg3[var4])) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 <= 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg3.length && method354(true, arg2[var7]); var7++) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method354(true, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C)V")
    private static final void method342(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg0 != 1454) {
            field1076 = !field1076;
        }
        method346(var3, null, field1078, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method346(var5, null, field1078, var4);
        for (int var6 = 0; var6 < field1086.length; var6++) {
            method343(var4, field1086[var6], 0, var2, arg1, field1087[var6]);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CI[C[CI)V")
    private static final void method343(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg2 != 0 || arg1.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg1.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method348(var13, var12, arg1[var9], (byte) 6)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method348(var13, var12, arg1[var9 - 1], (byte) 6)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method354(true, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method344(937, arg4, var7, arg3);
                int var18 = method345(true, var8 - 1, arg0, arg4);
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
                                if (method354(true, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method354(true, arg4[var24])) {
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
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method354(true, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method354(true, arg4[var28])) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method344(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method354(true, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            int var6 = 65 / arg0;
            for (int var7 = arg2 - 1; var7 >= 0 && method354(true, arg3[var7]); var7--) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method354(true, arg1[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZI[C[C)I")
    private static final int method345(boolean arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method354(true, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method354(true, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (!arg0) {
                field1077 = -226;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method354(true, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[[BB[C)V")
    private static final void method346(char[] arg0, byte[][] arg1, byte arg2, char[] arg3) {
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
            label135: while (true) {
                while (true) {
                    if (var7 >= arg3.length) {
                        break label135;
                    }
                    boolean var12 = false;
                    char var13 = arg3[var7];
                    char var14 = 0;
                    if (var7 + 1 < arg3.length) {
                        var14 = arg3[var7 + 1];
                    }
                    int var15;
                    if (var8 < arg0.length && (var15 = method349(var14, var13, (byte) -9, arg0[var8])) > 0) {
                        var7 += var15;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label135;
                        }
                        int var16;
                        if ((var16 = method349(var14, var13, (byte) -9, arg0[var8 - 1])) > 0) {
                            var7 += var16;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method355(3, var13)) {
                                break label135;
                            }
                            if (method354(true, var13) && var13 != '\'') {
                                var11 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label135;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var17 = true;
                if (var11) {
                    boolean var22 = false;
                    boolean var23 = false;
                    if (var5 - 1 < 0 || method354(true, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var22 = true;
                    }
                    if (var7 >= arg3.length || method354(true, arg3[var7]) && arg3[var7] != '\'') {
                        var23 = true;
                    }
                    if (!var22 || !var23) {
                        boolean var24 = false;
                        int var25 = var5 - 2;
                        if (var22) {
                            var25 = var5;
                        }
                        while (!var24 && var25 < var7) {
                            if (var25 >= 0 && (!method354(true, arg3[var25]) || arg3[var25] == '\'')) {
                                char[] var26 = new char[3];
                                int var27;
                                for (var27 = 0; var27 < 3 && var25 + var27 < arg3.length && (!method354(true, arg3[var25 + var27]) || arg3[var25 + var27] == '\''); var27++) {
                                    var26[var27] = arg3[var25 + var27];
                                }
                                boolean var28 = true;
                                if (var27 == 0) {
                                    var28 = false;
                                }
                                if (var27 < 3 && var25 - 1 >= 0 && (!method354(true, arg3[var25 - 1]) || arg3[var25 - 1] == '\'')) {
                                    var28 = false;
                                }
                                if (var28 && !method360(var26, 837)) {
                                    var24 = true;
                                }
                            }
                            var25++;
                        }
                        if (!var24) {
                            var17 = false;
                        }
                    }
                } else {
                    char var18 = ' ';
                    if (var5 - 1 >= 0) {
                        var18 = arg3[var5 - 1];
                    }
                    char var19 = ' ';
                    if (var7 < arg3.length) {
                        var19 = arg3[var7];
                    }
                    byte var20 = method350(var18, true);
                    byte var21 = method350(var19, true);
                    if (arg1 != null && method347(false, arg1, var20, var21)) {
                        var17 = false;
                    }
                }
                if (var17) {
                    int var29 = 0;
                    for (int var30 = var5; var30 < var7; var30++) {
                        if (method357(arg3[var30], (byte) 7)) {
                            var29++;
                        }
                    }
                    if (var29 * 100 / (var7 - var5) <= 50) {
                        for (int var31 = var5; var31 < var7; var31++) {
                            arg3[var31] = '*';
                        }
                    }
                }
            }
        }
        if (field1079 == arg2) {
            boolean var6 = false;
        } else {
            field1074 = !field1074;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[[BBB)Z")
    private static final boolean method347(boolean arg0, byte[][] arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg0) {
            throw new NullPointerException();
        } else if (arg1[var4][0] == arg2 && arg1[var4][1] == arg3) {
            return true;
        } else {
            int var5 = arg1.length - 1;
            if (arg1[var5][0] == arg2 && arg1[var5][1] == arg3) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg1[var6][0] == arg2 && arg1[var6][1] == arg3) {
                    return true;
                }
                if (arg2 < arg1[var6][0] || arg1[var6][0] == arg2 && arg3 < arg1[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCCB)I")
    private static final int method348(char arg0, char arg1, char arg2, byte arg3) {
        if (arg3 == 6) {
            boolean var4 = false;
        } else {
            field1073 = -477;
        }
        if (arg1 == arg2) {
            return 1;
        } else if (arg2 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg2 == 's' && arg1 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCBC)I")
    private static final int method349(char arg0, char arg1, byte arg2, char arg3) {
        if (arg2 != -9) {
            field1073 = -424;
        }
        if (arg1 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                    if (arg1 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg1 == '1' && arg0 == '3') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'c') {
                if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                return 0;
            }
            if (arg3 == 'e') {
                if (arg1 != '3' && arg1 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg1 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg1 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg1 != '9' && arg1 != '6') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'h') {
                if (arg1 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'i') {
                if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                if (arg1 != '0' && arg1 != '*') {
                    if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
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
                if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 't') {
                if (arg1 == '7') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'u') {
                if (arg1 == 'v') {
                    return 1;
                }
                if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg1 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
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
                if (arg1 == 'o' || arg1 == 'O') {
                    return 1;
                } else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg3 == '1') {
                return arg1 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            return arg1 == '.' ? 1 : 0;
        } else if (arg3 == '.') {
            return arg1 == ',' ? 1 : 0;
        } else if (arg3 == '!') {
            return arg1 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CZ)B")
    private static final byte method350(char arg0, boolean arg1) {
        if (!arg1) {
            field1074 = !field1074;
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

    @OriginalMember(owner = "mc", name = "b", descriptor = "(I[C)V")
    private static final void method351(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method352(false, arg1, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method354(true, arg1[var8]) && !method355(3, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method353(var6, arg1, false);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[CI)I")
    private static final int method352(boolean arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        if (arg0) {
            field1080 = !field1080;
        }
        return -1;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CZ)I")
    private static final int method353(int arg0, char[] arg1, boolean arg2) {
        if (arg2) {
            return 0;
        }
        int var3 = arg0;
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method354(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return !method356(22945, arg1) && !method357(arg1, (byte) 7);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IC)Z")
    private static final boolean method355(int arg0, char arg1) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(IC)Z")
    private static final boolean method356(int arg0, char arg1) {
        if (field1081 != arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CB)Z")
    private static final boolean method357(char arg0, byte arg1) {
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CI)Z")
    private static final boolean method358(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(ZC)Z")
    private static final boolean method359(boolean arg0, char arg1) {
        if (!arg0) {
            field1075 = !field1075;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "([CI)Z")
    private static final boolean method360(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method357(arg0[var3], (byte) 7) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method361(arg0, -965);
        int var5 = 0;
        int var6 = field1082.length - 1;
        if (arg1 <= 0) {
            field1080 = !field1080;
        }
        if (field1082[var5] == var4 || field1082[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1082[var7] == var4) {
                return true;
            }
            if (var4 < field1082[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "mc", name = "d", descriptor = "([CI)I")
    private static final int method361(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
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
        while (arg1 >= 0) {
            field1075 = !field1075;
        }
        return var2;
    }
}
