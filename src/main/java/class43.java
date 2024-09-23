import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MUWLFOWQ")
public class class43 {

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "I")
    private static int field1084 = 3;

    @OriginalMember(owner = "MUWLFOWQ", name = "b", descriptor = "Z")
    private static boolean field1085 = true;

    @OriginalMember(owner = "MUWLFOWQ", name = "c", descriptor = "I")
    private static int field1086 = -1921;

    @OriginalMember(owner = "MUWLFOWQ", name = "d", descriptor = "I")
    private static int field1087 = -343;

    @OriginalMember(owner = "MUWLFOWQ", name = "e", descriptor = "I")
    private static int field1088 = -34888;

    @OriginalMember(owner = "MUWLFOWQ", name = "f", descriptor = "B")
    private static byte field1089 = 7;

    @OriginalMember(owner = "MUWLFOWQ", name = "i", descriptor = "Z")
    private static boolean field1092 = true;

    @OriginalMember(owner = "MUWLFOWQ", name = "k", descriptor = "I")
    private static int field1094 = 232;

    @OriginalMember(owner = "MUWLFOWQ", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1101 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "MUWLFOWQ", name = "g", descriptor = "I")
    private static int field1090;

    @OriginalMember(owner = "MUWLFOWQ", name = "h", descriptor = "Z")
    private static boolean field1091;

    @OriginalMember(owner = "MUWLFOWQ", name = "j", descriptor = "Z")
    private static boolean field1093;

    @OriginalMember(owner = "MUWLFOWQ", name = "s", descriptor = "Z")
    public static boolean field1102;

    @OriginalMember(owner = "MUWLFOWQ", name = "l", descriptor = "[I")
    private static int[] field1095;

    @OriginalMember(owner = "MUWLFOWQ", name = "q", descriptor = "[I")
    private static int[] field1100;

    @OriginalMember(owner = "MUWLFOWQ", name = "m", descriptor = "[[C")
    private static char[][] field1096;

    @OriginalMember(owner = "MUWLFOWQ", name = "o", descriptor = "[[C")
    private static char[][] field1098;

    @OriginalMember(owner = "MUWLFOWQ", name = "p", descriptor = "[[C")
    private static char[][] field1099;

    @OriginalMember(owner = "MUWLFOWQ", name = "n", descriptor = "[[[B")
    private static byte[][][] field1097;

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(LVSUYIIVA;)V")
    public static final void method372(class62 arg0) {
        class8 var1 = new class8(arg0.method570("fragmentsenc.txt", null), 792);
        class8 var2 = new class8(arg0.method570("badenc.txt", null), 792);
        class8 var3 = new class8(arg0.method570("domainenc.txt", null), 792);
        class8 var4 = new class8(arg0.method570("tldlist.txt", null), 792);
        method373(var1, var2, var3, var4);
        if (class67.field1668) {
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(LCFARFRSG;LCFARFRSG;LCFARFRSG;LCFARFRSG;)V")
    private static final void method373(class8 arg0, class8 arg1, class8 arg2, class8 arg3) {
        method375(arg1, 0);
        method376(arg2, 0);
        method377(arg0, 338);
        method374(arg3, -1921);
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(LCFARFRSG;I)V")
    private static final void method374(class8 arg0, int arg1) {
        int var2 = arg0.method35();
        field1099 = new char[var2][];
        field1100 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1100[var3] = arg0.method30();
            char[] var4 = new char[arg0.method30()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method30();
            }
            field1099[var3] = var4;
        }
        if (field1086 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "b", descriptor = "(LCFARFRSG;I)V")
    private static final void method375(class8 arg0, int arg1) {
        int var2 = arg0.method35();
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1096 = new char[var2][];
        field1097 = new byte[var2][][];
        method378(false, field1097, arg0, field1096);
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "c", descriptor = "(LCFARFRSG;I)V")
    private static final void method376(class8 arg0, int arg1) {
        if (arg1 == 0) {
            int var2 = arg0.method35();
            field1098 = new char[var2][];
            method379(8, field1098, arg0);
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "d", descriptor = "(LCFARFRSG;I)V")
    private static final void method377(class8 arg0, int arg1) {
        if (arg1 <= 0) {
            field1084 = 377;
        }
        field1095 = new int[arg0.method35()];
        for (int var2 = 0; var2 < field1095.length; var2++) {
            field1095[var2] = arg0.method32();
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(Z[[[BLCFARFRSG;[[C)V")
    private static final void method378(boolean arg0, byte[][][] arg1, class8 arg2, char[][] arg3) {
        if (arg0) {
            field1094 = 239;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg2.method30()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method30();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg2.method30()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method30();
                var7[var8][1] = (byte) arg2.method30();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[[CLCFARFRSG;)V")
    private static final void method379(int arg0, char[][] arg1, class8 arg2) {
        if (arg0 != 8) {
            field1085 = !field1085;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method30()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method30();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[C)V")
    private static final void method380(int arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 != -28168) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method381(field1087, arg1[var4])) {
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

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(IC)Z")
    private static final boolean method381(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method382(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        while (arg0 >= 0) {
            field1085 = !field1085;
        }
        method380(-28168, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method390(-242, var6);
        method385(var6, -544);
        method386(var6, (byte) 24);
        method399(0, var6);
        for (int var8 = 0; var8 < field1101.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1101[var8], var11 + 1)) != -1) {
                char[] var12 = field1101[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method383(field1088, var5.toCharArray(), var6);
        method384(var6, (byte) 7);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[C[C)V")
    private static final void method383(int arg0, char[] arg1, char[] arg2) {
        if (arg0 != -34888) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (arg2[var4] != '*' && method407(arg1[var4], -458)) {
                arg2[var4] = arg1[var4];
            }
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "([CB)V")
    private static final void method384(char[] arg0, byte arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method404((byte) -70, var4)) {
                var2 = true;
            } else if (var2) {
                if (method406(-509, var4)) {
                    var2 = false;
                }
            } else if (method407(var4, -458)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (field1089 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "([CI)V")
    private static final void method385(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1096.length - 1; var3 >= 0; var3--) {
                method394(field1097[var3], arg0, (byte) 2, field1096[var3]);
            }
        }
        while (arg1 >= 0) {
            field1084 = 161;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "b", descriptor = "([CB)V")
    private static final void method386(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method394(null, var2, (byte) 2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 == 24) {
            method394(null, var4, (byte) 2, var5);
            for (int var6 = field1098.length - 1; var6 >= 0; var6--) {
                method387(arg0, var2, (byte) -51, var4, field1098[var6]);
            }
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "([C[CB[C[C)V")
    private static final void method387(char[] arg0, char[] arg1, byte arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg0.length - arg4.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label70: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label70;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method396(5, var13, arg4[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label70;
                        }
                        int var15;
                        if ((var15 = method396(5, var13, arg4[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method402(var12, 0)) {
                                break label70;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method388(23210, var6, arg0, arg1);
                int var18 = method389(field1090, arg0, var8 - 1, arg3);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg0[var19] = '*';
                    }
                }
            }
        }
        if (arg2 != -51) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(II[C[C)I")
    private static final int method388(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method402(arg2[var4], 0); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method402(arg3[var6], 0); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (arg0 != 23210) {
            return field1087;
        } else if (var5 >= 3) {
            return 4;
        } else if (method402(arg2[arg1 - 1], 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[CI[C)I")
    private static final int method389(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method402(arg1[var4], 0)) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != 0) {
                return 0;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method402(arg3[var6], 0); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method402(arg1[arg2 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "b", descriptor = "(I[C)V")
    private static final void method390(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method394(null, var2, (byte) 2, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method394(null, var4, (byte) 2, var5);
        if (arg0 < 0) {
            for (int var6 = 0; var6 < field1099.length; var6++) {
                method391(field1091, field1100[var6], var2, var4, field1099[var6], arg1);
            }
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(ZI[C[C[C[C)V")
    private static final void method391(boolean arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg4.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var11;
        for (int var8 = 0; var8 <= arg5.length - arg4.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label128: while (true) {
                while (true) {
                    if (var9 >= arg5.length) {
                        break label128;
                    }
                    boolean var12 = false;
                    char var13 = arg5[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg5.length) {
                        var14 = arg5[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg4.length && (var15 = method396(5, var14, arg4[var10], var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label128;
                        }
                        int var16;
                        if ((var16 = method396(5, var14, arg4[var10 - 1], var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg4.length || !method402(var13, 0)) {
                                break label128;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg4.length) {
                boolean var17 = false;
                int var18 = method392(var8, arg5, arg2, 769);
                int var19 = method393(var9 - 1, arg5, arg3, field1092);
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
                                    if (arg2[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg2[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method402(arg5[var25], 0)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method402(arg5[var25], 0)) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg5.length; var27++) {
                                if (var26) {
                                    if (arg3[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg3[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg5.length; var29++) {
                            if (var28) {
                                if (method402(arg5[var29], 0)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method402(arg5[var29], 0)) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg5[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[C[CI)I")
    private static final int method392(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method402(arg1[var4], 0)) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 41 / arg3;
            int var6 = 0;
            for (int var7 = arg0 - 1; var7 >= 0 && method402(arg2[var7], 0); var7--) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method402(arg1[arg0 - 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[C[CZ)I")
    private static final int method393(int arg0, char[] arg1, char[] arg2, boolean arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method402(arg1[var4], 0)) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (!arg3) {
                field1088 = 22;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method402(arg2[var6], 0); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method402(arg1[arg0 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "([[B[CB[C)V")
    public static final void method394(byte[][] arg0, char[] arg1, byte arg2, char[] arg3) {
        if (arg3.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg1.length - arg3.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label172: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label172;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg3.length && (var17 = method397(arg3[var8], var15, var16, 0)) > 0) {
                        if (var17 == 1 && method405(var15, (byte) 0)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method405(var15, (byte) 0) || method405(var16, (byte) 0))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label172;
                        }
                        int var18;
                        if ((var18 = method397(arg3[var8 - 1], var15, var16, 0)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method403(false, var15)) {
                                break label172;
                            }
                            if (method402(var15, 0) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method405(var15, (byte) 0)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label172;
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
                    if (var5 - 1 < 0 || method402(arg1[var5 - 1], 0) && arg1[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method402(arg1[var7], 0) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method402(arg1[var27], 0) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method402(arg1[var27 + var29], 0) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method402(arg1[var27 - 1], 0) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method408(-899, var28)) {
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
                        var20 = arg1[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg1.length) {
                        var21 = arg1[var7];
                    }
                    byte var22 = method398(var20, false);
                    byte var23 = method398(var21, false);
                    if (arg0 != null && method395(var23, 323, arg0, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method405(arg1[var34], (byte) 0)) {
                            var31++;
                        } else if (method404((byte) -70, arg1[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg1[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
        if (arg2 == 2) {
            boolean var6 = false;
        } else {
            field1091 = !field1091;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(BI[[BB)Z")
    private static final boolean method395(byte arg0, int arg1, byte[][] arg2, byte arg3) {
        int var4 = 79 / arg1;
        int var5 = 0;
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg0) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg3 && arg2[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg2[var7][0] == arg3 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg3 < arg2[var7][0] || arg2[var7][0] == arg3 && arg0 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(ICCC)I")
    private static final int method396(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 < 5 || arg0 > 5) {
            field1087 = 456;
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

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(CCCI)I")
    private static final int method397(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != 0) {
            return field1086;
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
                        if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
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
                    if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
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
                    if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
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

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(CZ)B")
    private static final byte method398(char arg0, boolean arg1) {
        if (arg1) {
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

    @OriginalMember(owner = "MUWLFOWQ", name = "c", descriptor = "(I[C)V")
    private static final void method399(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != 0) {
            field1085 = !field1085;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method400(40409, arg1, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method402(arg1[var8], 0) && !method403(false, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method401(arg1, var6, 0);
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

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(I[CI)I")
    private static final int method400(int arg0, char[] arg1, int arg2) {
        if (arg0 != 40409) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg2; var4 < arg1.length && var4 >= 0; var4++) {
            if (arg1[var4] >= '0' && arg1[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "([CII)I")
    private static final int method401(char[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return 2;
        }
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(CI)Z")
    private static final boolean method402(char arg0, int arg1) {
        if (arg1 != 0) {
            field1093 = !field1093;
        }
        return !method404((byte) -70, arg0) && !method405(arg0, (byte) 0);
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(ZC)Z")
    private static final boolean method403(boolean arg0, char arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(BC)Z")
    private static final boolean method404(byte arg0, char arg1) {
        if (arg0 != -70) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(CB)Z")
    private static final boolean method405(char arg0, byte arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "b", descriptor = "(IC)Z")
    private static final boolean method406(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "b", descriptor = "(CI)Z")
    private static final boolean method407(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if (arg0 >= 'A' && arg0 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "d", descriptor = "(I[C)Z")
    private static final boolean method408(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method405(arg1[var3], (byte) 0) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method409(false, arg1);
        int var5 = 0;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var6 = field1095.length - 1;
        if (field1095[var5] == var4 || field1095[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1095[var7] == var4) {
                return true;
            }
            if (var4 < field1095[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "MUWLFOWQ", name = "a", descriptor = "(Z[C)I")
    public static final int method409(boolean arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0) {
            field1087 = 407;
        }
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
