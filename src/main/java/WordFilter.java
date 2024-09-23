import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class WordFilter {

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    private static int field1111 = 353;

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    private static int field1112 = 353;

    @OriginalMember(owner = "pc", name = "c", descriptor = "Z")
    private static boolean field1113 = true;

    @OriginalMember(owner = "pc", name = "d", descriptor = "B")
    private static byte field1114 = 4;

    @OriginalMember(owner = "pc", name = "e", descriptor = "B")
    private static byte field1115 = 4;

    @OriginalMember(owner = "pc", name = "f", descriptor = "B")
    private static byte field1116 = 72;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    private static int field1117 = -133;

    @OriginalMember(owner = "pc", name = "h", descriptor = "I")
    private static int field1118 = -150;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    private static int field1120 = 16953;

    @OriginalMember(owner = "pc", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1129 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "pc", name = "i", descriptor = "I")
    private static int field1119;

    @OriginalMember(owner = "pc", name = "t", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "pc", name = "k", descriptor = "Z")
    private static boolean field1121;

    @OriginalMember(owner = "pc", name = "l", descriptor = "Z")
    private static boolean field1122;

    @OriginalMember(owner = "pc", name = "m", descriptor = "[I")
    private static int[] field1123;

    @OriginalMember(owner = "pc", name = "r", descriptor = "[I")
    private static int[] field1128;

    @OriginalMember(owner = "pc", name = "n", descriptor = "[[C")
    private static char[][] field1124;

    @OriginalMember(owner = "pc", name = "p", descriptor = "[[C")
    private static char[][] field1126;

    @OriginalMember(owner = "pc", name = "q", descriptor = "[[C")
    private static char[][] field1127;

    @OriginalMember(owner = "pc", name = "o", descriptor = "[[[B")
    private static byte[][][] field1125;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lyb;)V")
    public static final void method376(Jagfile arg0) {
        Packet var1 = new Packet(699, arg0.method295("fragmentsenc.txt", null));
        Packet var2 = new Packet(699, arg0.method295("badenc.txt", null));
        Packet var3 = new Packet(699, arg0.method295("domainenc.txt", null));
        Packet var4 = new Packet(699, arg0.method295("tldlist.txt", null));
        method377(var1, var2, var3, var4);
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method377(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method379(arg1, (byte) 5);
        method380(arg2, 0);
        method381(5631, arg0);
        method378((byte) 4, arg3);
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(BLmb;)V")
    private static final void method378(byte arg0, Packet arg1) {
        int var2 = arg1.method236();
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            field1119 = 66;
        }
        field1127 = new char[var2][];
        field1128 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1128[var4] = arg1.method231();
            char[] var5 = new char[arg1.method231()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method231();
            }
            field1127[var4] = var5;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;B)V")
    private static final void method379(Packet arg0, byte arg1) {
        int var2 = arg0.method236();
        field1124 = new char[var2][];
        field1125 = new byte[var2][][];
        if (arg1 == 5) {
            method382(field1124, true, arg0, field1125);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;I)V")
    private static final void method380(Packet arg0, int arg1) {
        int var2 = arg0.method236();
        if (arg1 != 0) {
            field1122 = !field1122;
        }
        field1126 = new char[var2][];
        method383(arg0, false, field1126);
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILmb;)V")
    private static final void method381(int arg0, Packet arg1) {
        field1123 = new int[arg1.method236()];
        for (int var2 = 0; var2 < field1123.length; var2++) {
            field1123[var2] = arg1.method233();
        }
        if (arg0 == 5631) {
            ;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([[CZLmb;[[[B)V")
    private static final void method382(char[][] arg0, boolean arg1, Packet arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method231()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method231();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method231()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method231();
                var7[var8][1] = (byte) arg2.method231();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;Z[[C)V")
    private static final void method383(Packet arg0, boolean arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method231()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method231();
            }
            arg2[var3] = var4;
        }
        if (arg1) {
            field1119 = 249;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CI)V")
    private static final void method384(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method385(arg0[var3], true)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1 > 0) {
            for (int var4 = var2; var4 < arg0.length; var4++) {
                arg0[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method385(char arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method386(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method384(var4, field1111);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method394(-534, var6);
        method389(var6, -35653);
        method390(var6, (byte) 5);
        method403(var6, true);
        int var8 = 38 / arg1;
        for (int var9 = 0; var9 < field1129.length; var9++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field1129[var9], var12 + 1)) != -1) {
                char[] var13 = field1129[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method387(var6, var5.toCharArray(), -430);
        method388(var6, (byte) -6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([C[CI)V")
    private static final void method387(char[] arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method411(arg1[var3], (byte) -9)) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CB)V")
    private static final void method388(char[] arg0, byte arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var5 = arg0[var3];
            if (!method408(false, var5)) {
                var2 = true;
            } else if (var2) {
                if (method410(var5, false)) {
                    var2 = false;
                }
            } else if (method411(var5, (byte) -9)) {
                arg0[var3] = (char) (var5 + 'a' - 65);
            }
        }
        if (arg1 != -6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "([CI)V")
    private static final void method389(char[] arg0, int arg1) {
        if (arg1 != -35653) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1124.length - 1; var4 >= 0; var4--) {
                method398(field1124[var4], -150, field1125[var4], arg0);
            }
        }
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "([CB)V")
    private static final void method390(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method398(var3, -150, null, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 == 5) {
            method398(var5, -150, null, var4);
            for (int var6 = field1126.length - 1; var6 >= 0; var6--) {
                method391(var4, arg0, var2, field1126[var6], field1114);
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([C[C[C[CB)V")
    private static final void method391(char[] arg0, char[] arg1, char[] arg2, char[] arg3, byte arg4) {
        if (arg3.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg3.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg1.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg1[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg1.length) {
                        var13 = arg1[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method400(0, arg3[var9], var13, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method400(0, arg3[var9 - 1], var13, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method406(true, var12)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method392(var6, arg2, arg1, field1116);
                int var18 = method393(var8 - 1, arg0, arg1, true);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg1[var19] = '*';
                    }
                }
            }
        }
        if (field1115 == arg4) {
            boolean var7 = false;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method392(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method406(true, arg2[var4]); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg3 != 72) {
            field1119 = -347;
        }
        for (int var6 = arg0 - 1; var6 >= 0 && method406(true, arg1[var6]); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method406(true, arg2[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(I[C[CZ)I")
    private static final int method393(int arg0, char[] arg1, char[] arg2, boolean arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method406(true, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method406(true, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (!arg3) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method406(true, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(I[C)V")
    private static final void method394(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method398(var3, -150, null, var2);
        char[] var4 = (char[]) arg1.clone();
        if (arg0 >= 0) {
            field1121 = !field1121;
        }
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method398(var5, -150, null, var4);
        for (int var6 = 0; var6 < field1127.length; var6++) {
            method395(field1127[var6], var4, arg1, var2, false, field1128[var6]);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([C[C[C[CZI)V")
    private static final void method395(char[] arg0, char[] arg1, char[] arg2, char[] arg3, boolean arg4, int arg5) {
        if (arg4 || arg0.length > arg2.length) {
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
                    if (var9 < arg0.length && (var14 = method400(0, arg0[var9], var13, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method400(0, arg0[var9 - 1], var13, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method406(true, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method396(arg3, var7, false, arg2);
                int var18 = method397(-133, arg2, var8 - 1, arg1);
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
                                if (method406(true, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method406(true, arg2[var24])) {
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
                                if (method406(true, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method406(true, arg2[var28])) {
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CIZ[C)I")
    private static final int method396(char[] arg0, int arg1, boolean arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method406(true, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2) {
                field1122 = !field1122;
            }
            for (int var6 = arg1 - 1; var6 >= 0 && method406(true, arg0[var6]); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method406(true, arg3[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method397(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var5 = arg2 + 1;
        while (true) {
            if (var5 < arg1.length && method406(true, arg1[var5])) {
                if (arg1[var5] != '\\' && arg1[var5] != '/') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg1.length && method406(true, arg3[var7]); var7++) {
                if (arg3[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method406(true, arg1[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CI[[B[C)V")
    public static final void method398(char[] arg0, int arg1, byte[][] arg2, char[] arg3) {
        if (arg0.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label169: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label169;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg0.length && (var16 = method401((byte) 109, var14, var15, arg0[var7])) > 0) {
                        if (var16 == 1 && method409(var14, 8071)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method409(var14, 8071) || method409(var15, 8071))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label169;
                        }
                        int var17;
                        if ((var17 = method401((byte) 109, var14, var15, arg0[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method407(var14, (byte) -30)) {
                                break label169;
                            }
                            if (method406(true, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method409(var14, 8071)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label169;
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
                    if (var5 - 1 < 0 || method406(true, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method406(true, arg3[var6]) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method406(true, arg3[var26]) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method406(true, arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method406(true, arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method412(-397, var27)) {
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
                        var19 = arg3[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg3.length) {
                        var20 = arg3[var6];
                    }
                    byte var21 = method402(var19, true);
                    byte var22 = method402(var20, true);
                    if (arg2 != null && method399(false, arg2, var22, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    for (int var32 = var5; var32 < var6; var32++) {
                        if (method409(arg3[var32], 8071)) {
                            var30++;
                        } else if (method408(false, arg3[var32])) {
                            var31++;
                        }
                    }
                    if (var30 <= var31) {
                        for (int var33 = var5; var33 < var6; var33++) {
                            arg3[var33] = '*';
                        }
                    }
                }
            }
        }
        while (arg1 >= 0) {
            field1121 = !field1121;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Z[[BBB)Z")
    private static final boolean method399(boolean arg0, byte[][] arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg1[var4][0] == arg3 && arg1[var4][1] == arg2) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg0) {
            throw new NullPointerException();
        } else if (arg1[var5][0] == arg3 && arg1[var5][1] == arg2) {
            return true;
        } else {
            do {
                int var6 = (var4 + var5) / 2;
                if (arg1[var6][0] == arg3 && arg1[var6][1] == arg2) {
                    return true;
                }
                if (arg3 < arg1[var6][0] || arg1[var6][0] == arg3 && arg2 < arg1[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ICCC)I")
    private static final int method400(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            field1122 = !field1122;
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "(BCCC)I")
    private static final int method401(byte arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 109) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                    if (arg1 == '/' && arg2 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg1 != '6' && arg1 != '8') {
                    if (arg1 == '1' && arg2 == '3') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'c') {
                if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                if (arg1 == '[' && arg2 == ')') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'e') {
                if (arg1 != '3' && arg1 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg1 == 'p' && arg2 == 'h') {
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
                    if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
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
                if (arg1 != '7' && arg1 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'u') {
                if (arg1 == 'v') {
                    return 1;
                }
                if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg1 == 'v' && arg2 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
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
                } else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
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

    @OriginalMember(owner = "pc", name = "b", descriptor = "(CZ)B")
    private static final byte method402(char arg0, boolean arg1) {
        if (!arg1) {
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CZ)V")
    private static final void method403(char[] arg0, boolean arg1) {
        boolean var2 = false;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method404(var4, arg0, (byte) 9)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method406(true, arg0[var9]) && !method407(arg0[var9], (byte) -30)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method405(arg0, var7, true);
                int var10 = 0;
                for (int var11 = var7; var11 < var4; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var4 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var4; var12++) {
                arg0[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(I[CB)I")
    private static final int method404(int arg0, char[] arg1, byte arg2) {
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        if (arg2 == 9) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CIZ)I")
    private static final int method405(char[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method406(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return !method408(false, arg1) && !method409(arg1, 8071);
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(CB)Z")
    private static final boolean method407(char arg0, byte arg1) {
        if (arg1 != -30) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "(ZC)Z")
    private static final boolean method408(boolean arg0, char arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(CI)Z")
    private static final boolean method409(char arg0, int arg1) {
        if (arg1 != 8071) {
            field1111 = 163;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "pc", name = "c", descriptor = "(CZ)Z")
    private static final boolean method410(char arg0, boolean arg1) {
        if (arg1) {
            field1119 = 413;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "(CB)Z")
    private static final boolean method411(char arg0, byte arg1) {
        if (arg1 != -9) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "(I[C)Z")
    private static final boolean method412(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method409(arg1[var3], 8071) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method413(field1120, arg1);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var5 = 0;
        int var6 = field1123.length - 1;
        if (field1123[var5] == var4 || field1123[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1123[var7] == var4) {
                return true;
            }
            if (var4 < field1123[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "pc", name = "c", descriptor = "(I[C)I")
    public static final int method413(int arg0, char[] arg1) {
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
        if (arg0 != 16953) {
            field1119 = -276;
        }
        return var2;
    }
}
