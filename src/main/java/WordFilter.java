import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class WordFilter {

    @OriginalMember(owner = "mc", name = "a", descriptor = "B")
    private static byte field1090 = 4;

    @OriginalMember(owner = "mc", name = "d", descriptor = "B")
    private static byte field1093 = -89;

    @OriginalMember(owner = "mc", name = "e", descriptor = "I")
    private static int field1094 = 48104;

    @OriginalMember(owner = "mc", name = "f", descriptor = "I")
    private static int field1095 = 710;

    @OriginalMember(owner = "mc", name = "g", descriptor = "I")
    private static int field1096 = 710;

    @OriginalMember(owner = "mc", name = "h", descriptor = "I")
    private static int field1097 = 175;

    @OriginalMember(owner = "mc", name = "i", descriptor = "Z")
    private static boolean field1098 = true;

    @OriginalMember(owner = "mc", name = "k", descriptor = "I")
    private static int field1100 = 568;

    @OriginalMember(owner = "mc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1107 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1091;

    @OriginalMember(owner = "mc", name = "s", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "mc", name = "c", descriptor = "Z")
    private static boolean field1092;

    @OriginalMember(owner = "mc", name = "j", descriptor = "Z")
    private static boolean field1099;

    @OriginalMember(owner = "mc", name = "l", descriptor = "[I")
    private static int[] field1101;

    @OriginalMember(owner = "mc", name = "q", descriptor = "[I")
    private static int[] field1106;

    @OriginalMember(owner = "mc", name = "m", descriptor = "[[C")
    private static char[][] field1102;

    @OriginalMember(owner = "mc", name = "o", descriptor = "[[C")
    private static char[][] field1104;

    @OriginalMember(owner = "mc", name = "p", descriptor = "[[C")
    private static char[][] field1105;

    @OriginalMember(owner = "mc", name = "n", descriptor = "[[[B")
    private static byte[][][] field1103;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lub;)V")
    public static final void method325(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method250(field1090, "fragmentsenc.txt", null), 0);
        Packet var2 = new Packet(arg0.method250(field1090, "badenc.txt", null), 0);
        Packet var3 = new Packet(arg0.method250(field1090, "domainenc.txt", null), 0);
        Packet var4 = new Packet(arg0.method250(field1090, "tldlist.txt", null), 0);
        method326(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method326(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method328(arg1, false);
        method329(0, arg2);
        method330(arg0, 760);
        method327((byte) 9, arg3);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BLkb;)V")
    private static final void method327(byte arg0, Packet arg1) {
        if (arg0 != 9) {
            return;
        }
        int var2 = arg1.method214();
        field1105 = new char[var2][];
        field1106 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1106[var3] = arg1.method209();
            char[] var4 = new char[arg1.method209()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method209();
            }
            field1105[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Z)V")
    private static final void method328(Packet arg0, boolean arg1) {
        int var2 = arg0.method214();
        field1102 = new char[var2][];
        if (!arg1) {
            field1103 = new byte[var2][][];
            method331((byte) -89, field1102, field1103, arg0);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILkb;)V")
    private static final void method329(int arg0, Packet arg1) {
        if (arg0 != 0) {
            field1091 = -405;
        }
        int var2 = arg1.method214();
        field1104 = new char[var2][];
        method332(field1094, arg1, field1104);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method330(Packet arg0, int arg1) {
        if (arg1 > 0) {
            field1101 = new int[arg0.method214()];
            for (int var2 = 0; var2 < field1101.length; var2++) {
                field1101[var2] = arg0.method211();
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[[C[[[BLkb;)V")
    private static final void method331(byte arg0, char[][] arg1, byte[][][] arg2, Packet arg3) {
        if (field1093 != arg0) {
            return;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg3.method209()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method209();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg3.method209()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method209();
                var7[var8][1] = (byte) arg3.method209();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILkb;[[C)V")
    private static final void method332(int arg0, Packet arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method209()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method209();
            }
            arg2[var3] = var4;
        }
        if (arg0 == 48104) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI)V")
    private static final void method333(char[] arg0, int arg1) {
        if (arg1 != 13142) {
            field1092 = !field1092;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method334(arg0[var3], field1095)) {
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
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method335(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method333(var4, 13142);
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        String var6 = (new String(var4)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method343(-786, var7);
        method338(var7, field1098);
        method339(var7, 16829);
        method352(var7, false);
        for (int var9 = 0; var9 < field1107.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1107[var9], var12 + 1)) != -1) {
                char[] var13 = field1107[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method336(var6.toCharArray(), var7, 175);
        method337(var7, 40151);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CI)V")
    private static final void method336(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method360(arg0[var3], (byte) 24)) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2 <= 0) {
            field1098 = !field1098;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CI)V")
    private static final void method337(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method357(3, var4)) {
                var2 = true;
            } else if (var2) {
                if (method359(false, var4)) {
                    var2 = false;
                }
            } else if (method360(var4, (byte) 24)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1 == 40151) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CZ)V")
    private static final void method338(char[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1102.length - 1; var3 >= 0; var3--) {
                method347(arg0, field1100, field1103[var3], field1102[var3]);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "([CI)V")
    private static final void method339(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method347(var2, field1100, null, var3);
        char[] var4 = (char[]) arg0.clone();
        if (arg1 != 16829) {
            field1098 = !field1098;
        }
        char[] var5 = new char[] { 'd', 'o', 't' };
        method347(var4, field1100, null, var5);
        for (int var6 = field1104.length - 1; var6 >= 0; var6--) {
            method340(3, arg0, field1104[var6], var2, var4);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method340(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0 < 3 || arg0 > 3) {
            field1098 = !field1098;
        }
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label65: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label65;
                    }
                    boolean var10 = false;
                    char var11 = arg1[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg1.length) {
                        var12 = arg1[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg2.length && (var13 = method349(3, arg2[var8], var12, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label65;
                        }
                        int var14;
                        if ((var14 = method349(3, arg2[var8 - 1], var12, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method355(var11, 0)) {
                                break label65;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method341(8, var6, arg3, arg1);
                int var17 = method342(arg4, arg1, var7 - 1, 0);
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II[C[C)I")
    private static final int method341(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method355(arg3[var4], 0); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg0 != 8) {
            return 0;
        }
        for (int var6 = arg1 - 1; var6 >= 0 && method355(arg2[var6], 0); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method355(arg3[arg1 - 1], 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CII)I")
    private static final int method342(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method355(arg1[var4], 0)) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != 0) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg2 + 1; var7 < arg1.length && method355(arg0[var7], 0); var7++) {
                if (arg0[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method355(arg1[arg2 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C)V")
    private static final void method343(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0 >= 0) {
            field1098 = !field1098;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method347(var2, field1100, null, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method347(var4, field1100, null, var5);
        for (int var6 = 0; var6 < field1105.length; var6++) {
            method344(arg1, field1099, field1106[var6], field1105[var6], var4, var2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CZI[C[C[C)V")
    private static final void method344(char[] arg0, boolean arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg1 || arg3.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method349(3, arg3[var9], var13, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method349(3, arg3[var9 - 1], var13, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method355(var12, 0)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method345(arg0, arg5, var7, 12);
                int var18 = method346(arg0, false, var8 - 1, arg4);
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
                                if (method355(arg0[var24], 0)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method355(arg0[var24], 0)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg0.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method355(arg0[var28], 0)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method355(arg0[var28], 0)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg0[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([C[CII)I")
    private static final int method345(char[] arg0, char[] arg1, int arg2, int arg3) {
        int var4 = 34 / arg3;
        if (arg2 == 0) {
            return 2;
        }
        int var5 = arg2 - 1;
        while (true) {
            if (var5 >= 0 && method355(arg0[var5], 0)) {
                if (arg0[var5] != ',' && arg0[var5] != '.') {
                    var5--;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg2 - 1; var7 >= 0 && method355(arg1[var7], 0); var7--) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method355(arg0[arg2 - 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CZI[C)I")
    private static final int method346(char[] arg0, boolean arg1, int arg2, char[] arg3) {
        if (arg1) {
            return field1097;
        } else if (arg2 + 1 == arg0.length) {
            return 2;
        } else {
            int var4 = arg2 + 1;
            while (true) {
                if (var4 < arg0.length && method355(arg0[var4], 0)) {
                    if (arg0[var4] != '\\' && arg0[var4] != '/') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg2 + 1; var6 < arg0.length && method355(arg3[var6], 0); var6++) {
                    if (arg3[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 5) {
                    return 4;
                }
                if (method355(arg0[arg2 + 1], 0)) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI[[B[C)V")
    public static final void method347(char[] arg0, int arg1, byte[][] arg2, char[] arg3) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg0.length - arg3.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label164: while (true) {
                while (true) {
                    if (var7 >= arg0.length || var12 && var13) {
                        break label164;
                    }
                    boolean var14 = false;
                    char var15 = arg0[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg0.length) {
                        var16 = arg0[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg3.length && (var17 = method350(var16, false, var15, arg3[var8])) > 0) {
                        if (var17 == 1 && method358((byte) 56, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method358((byte) 56, var15) || method358((byte) 56, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label164;
                        }
                        int var18;
                        if ((var18 = method350(var16, false, var15, arg3[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method356(var15, 123)) {
                                break label164;
                            }
                            if (method355(var15, 0) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method358((byte) 56, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label164;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg3.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var6 - 1 < 0 || method355(arg0[var6 - 1], 0) && arg0[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg0.length || method355(arg0[var7], 0) && arg0[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method355(arg0[var27], 0) || arg0[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg0.length && (!method355(arg0[var27 + var29], 0) || arg0[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg0[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method355(arg0[var27 - 1], 0) || arg0[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method361(var28, 528)) {
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
                        var20 = arg0[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg0.length) {
                        var21 = arg0[var7];
                    }
                    byte var22 = method351(var20, -995);
                    byte var23 = method351(var21, -995);
                    if (arg2 != null && method348(var22, var23, true, arg2)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    for (int var33 = var6; var33 < var7; var33++) {
                        if (method358((byte) 56, arg0[var33])) {
                            var31++;
                        } else if (method357(3, arg0[var33])) {
                            var32++;
                        }
                    }
                    if (var31 <= var32) {
                        for (int var34 = var6; var34 < var7; var34++) {
                            arg0[var34] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BBZ[[B)Z")
    private static final boolean method348(byte arg0, byte arg1, boolean arg2, byte[][] arg3) {
        if (!arg2) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg3[var4][0] == arg0 && arg3[var4][1] == arg1) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg3[var5][0] == arg0 && arg3[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg3[var6][0] == arg0 && arg3[var6][1] == arg1) {
                return true;
            }
            if (arg0 < arg3[var6][0] || arg3[var6][0] == arg0 && arg1 < arg3[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ICCC)I")
    private static final int method349(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 3) {
            field1095 = -405;
        }
        if (arg1 == arg3) {
            return 1;
        } else if (arg1 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg3 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CZCC)I")
    private static final int method350(char arg0, boolean arg1, char arg2, char arg3) {
        if (arg1) {
            field1095 = -448;
        }
        if (arg2 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if (arg2 == '1' && arg0 == '3') {
                        return 2;
                    }
                    return 0;
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
                if (arg2 == '[' && arg0 == ')') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg2 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg2 != '9' && arg2 != '6') {
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
                    if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
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
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg2 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
                } else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
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

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CI)B")
    private static final byte method351(char arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
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

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CZ)V")
    private static final void method352(char[] arg0, boolean arg1) {
        boolean var2 = false;
        if (arg1) {
            field1091 = 208;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method353(var3, arg0, 0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method355(arg0[var8], 0) && !method356(arg0[var8], 123)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method354(574, var6, arg0);
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
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return arg2 == 0 ? -1 : field1094;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II[C)I")
    private static final int method354(int arg0, int arg1, char[] arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 <= 0) {
                return 4;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(CI)Z")
    private static final boolean method355(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return !method357(3, arg0) && !method358((byte) 56, arg0);
    }

    @OriginalMember(owner = "mc", name = "d", descriptor = "(CI)Z")
    private static final boolean method356(char arg0, int arg1) {
        if (arg1 <= 0) {
            field1098 = !field1098;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IC)Z")
    private static final boolean method357(int arg0, char arg1) {
        if (arg0 != 3) {
            field1100 = 260;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BC)Z")
    private static final boolean method358(byte arg0, char arg1) {
        if (arg0 != 56) {
            field1094 = 162;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method359(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CB)Z")
    private static final boolean method360(char arg0, byte arg1) {
        if (arg1 != 24) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "d", descriptor = "([CI)Z")
    private static final boolean method361(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method358((byte) 56, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method362(false, arg0);
        int var5 = 50 / arg1;
        int var6 = 0;
        int var7 = field1101.length - 1;
        if (field1101[var6] == var4 || field1101[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1101[var8] == var4) {
                return true;
            }
            if (var4 < field1101[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[C)I")
    public static final int method362(boolean arg0, char[] arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1.length > 6) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[arg1.length - var4 - 1];
            if (var5 >= 'a' && var5 <= 'z') {
                var3 = var3 * 38 + var5 + 1 - 'a';
            } else if (var5 == '\'') {
                var3 = var3 * 38 + 27;
            } else if (var5 >= '0' && var5 <= '9') {
                var3 = var3 * 38 + var5 + 28 - '0';
            } else if (var5 != '\u0000') {
                return 0;
            }
        }
        return var3;
    }
}
