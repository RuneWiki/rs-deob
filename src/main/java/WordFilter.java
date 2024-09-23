import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class WordFilter {

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    private static int field1124 = 800;

    @OriginalMember(owner = "pc", name = "b", descriptor = "Z")
    private static boolean field1125 = true;

    @OriginalMember(owner = "pc", name = "d", descriptor = "Z")
    private static boolean field1127 = true;

    @OriginalMember(owner = "pc", name = "e", descriptor = "Z")
    private static boolean field1128 = true;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    private static int field1130 = 20549;

    @OriginalMember(owner = "pc", name = "h", descriptor = "I")
    private static int field1131 = -40826;

    @OriginalMember(owner = "pc", name = "i", descriptor = "I")
    private static int field1132 = 975;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    private static int field1133 = 3;

    @OriginalMember(owner = "pc", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1140 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    private static int field1129;

    @OriginalMember(owner = "pc", name = "r", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "pc", name = "c", descriptor = "Z")
    private static boolean field1126;

    @OriginalMember(owner = "pc", name = "k", descriptor = "[I")
    private static int[] field1134;

    @OriginalMember(owner = "pc", name = "p", descriptor = "[I")
    private static int[] field1139;

    @OriginalMember(owner = "pc", name = "l", descriptor = "[[C")
    private static char[][] field1135;

    @OriginalMember(owner = "pc", name = "n", descriptor = "[[C")
    private static char[][] field1137;

    @OriginalMember(owner = "pc", name = "o", descriptor = "[[C")
    private static char[][] field1138;

    @OriginalMember(owner = "pc", name = "m", descriptor = "[[[B")
    private static byte[][][] field1136;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lyb;)V")
    public static final void method380(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method299("fragmentsenc.txt", null), true);
        Packet var2 = new Packet(arg0.method299("badenc.txt", null), true);
        Packet var3 = new Packet(arg0.method299("domainenc.txt", null), true);
        Packet var4 = new Packet(arg0.method299("tldlist.txt", null), true);
        method381(var1, var2, var3, var4);
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method381(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method383(0, arg1);
        method384(arg2, false);
        method385(arg0, false);
        method382(arg3, field1125);
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;Z)V")
    private static final void method382(Packet arg0, boolean arg1) {
        int var2 = arg0.method236();
        field1138 = new char[var2][];
        if (!arg1) {
            field1125 = !field1125;
        }
        field1139 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1139[var3] = arg0.method231();
            char[] var4 = new char[arg0.method231()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method231();
            }
            field1138[var3] = var4;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILmb;)V")
    private static final void method383(int arg0, Packet arg1) {
        int var2 = arg1.method236();
        field1135 = new char[var2][];
        if (arg0 != 0) {
            field1125 = !field1125;
        }
        field1136 = new byte[var2][][];
        method386(field1136, arg1, field1126, field1135);
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "(Lmb;Z)V")
    private static final void method384(Packet arg0, boolean arg1) {
        if (!arg1) {
            int var2 = arg0.method236();
            field1137 = new char[var2][];
            method387(true, field1137, arg0);
        }
    }

    @OriginalMember(owner = "pc", name = "c", descriptor = "(Lmb;Z)V")
    private static final void method385(Packet arg0, boolean arg1) {
        field1134 = new int[arg0.method236()];
        if (arg1) {
            field1124 = -345;
        }
        for (int var2 = 0; var2 < field1134.length; var2++) {
            field1134[var2] = arg0.method233();
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([[[BLmb;Z[[C)V")
    private static final void method386(byte[][][] arg0, Packet arg1, boolean arg2, char[][] arg3) {
        if (arg2) {
            return;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method231()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method231();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method231()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method231();
                var7[var8][1] = (byte) arg1.method231();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Z[[CLmb;)V")
    private static final void method387(boolean arg0, char[][] arg1, Packet arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method231()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method231();
            }
            arg1[var3] = var4;
        }
        if (!arg0) {
            field1124 = -324;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CZ)V")
    private static final void method388(char[] arg0, boolean arg1) {
        int var2 = 0;
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method389(arg0[var3], true)) {
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method389(char arg0, boolean arg1) {
        if (!arg1) {
            field1124 = -53;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method390(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method388(var4, false);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method398(var6, 0);
        method393(field1128, var6);
        method394(var6, -604);
        method407(var6, 286);
        for (int var8 = 0; var8 < field1140.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1140[var8], var11 + 1)) != -1) {
                char[] var12 = field1140[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method391(var6, var5.toCharArray(), true);
        method392(var6, -22707);
        long var9 = System.currentTimeMillis();
        if (arg0 != 22793) {
            field1127 = !field1127;
        }
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([C[CZ)V")
    private static final void method391(char[] arg0, char[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method415(arg1[var3], field1132)) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CI)V")
    private static final void method392(char[] arg0, int arg1) {
        if (arg1 != -22707) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method412(true, var4)) {
                var2 = true;
            } else if (var2) {
                if (method414(field1131, var4)) {
                    var2 = false;
                }
            } else if (method415(var4, field1132)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Z[C)V")
    private static final void method393(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1135.length - 1; var3 >= 0; var3--) {
                method402(field1136[var3], arg1, field1135[var3], (byte) -100);
            }
        }
        if (!arg0) {
            field1132 = -237;
        }
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "([CI)V")
    private static final void method394(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method402(null, var2, var3, (byte) -100);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        while (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method402(null, var4, var5, (byte) -100);
        for (int var6 = field1137.length - 1; var6 >= 0; var6--) {
            method395(field1137[var6], var4, var2, 681, arg0);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([C[C[CI[C)V")
    private static final void method395(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
        if (arg3 <= 0 || arg0.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg0.length; var6 += var9) {
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
                    if (var8 < arg0.length && (var13 = method404(var12, 928, var11, arg0[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method404(var12, 928, var11, arg0[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method410(false, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method396(arg4, (byte) 6, arg2, var6);
                int var17 = method397(arg1, true, arg4, var7 - 1);
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CB[CI)I")
    private static final int method396(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method410(false, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        if (arg1 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        for (int var7 = arg3 - 1; var7 >= 0 && method410(false, arg2[var7]); var7--) {
            if (arg2[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method410(false, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CZ[CI)I")
    private static final int method397(char[] arg0, boolean arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method410(false, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg2.length && method410(false, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (!arg1) {
                field1128 = !field1128;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method410(false, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "c", descriptor = "([CI)V")
    private static final void method398(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 0) {
            field1132 = -97;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method402(null, var2, var3, (byte) -100);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method402(null, var4, var5, (byte) -100);
        for (int var6 = 0; var6 < field1138.length; var6++) {
            method399(field1138[var6], field1130, var4, field1139[var6], var2, arg0);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CI[CI[C[C)V")
    private static final void method399(char[] arg0, int arg1, char[] arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg0.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg5.length - arg0.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label137: while (true) {
                while (true) {
                    if (var9 >= arg5.length) {
                        break label137;
                    }
                    boolean var12 = false;
                    char var13 = arg5[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg5.length) {
                        var14 = arg5[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg0.length && (var15 = method404(var14, 928, var13, arg0[var10])) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label137;
                        }
                        int var16;
                        if ((var16 = method404(var14, 928, var13, arg0[var10 - 1])) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg0.length || !method410(false, var13)) {
                                break label137;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg0.length) {
                boolean var17 = false;
                int var18 = method400(0, arg5, arg4, var7);
                int var19 = method401(true, arg2, var9 - 1, arg5);
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
                    int var20 = var7;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var7 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg4[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg4[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method410(false, arg5[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method410(false, arg5[var25])) {
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
                        for (int var29 = var21 + 1; var29 < arg5.length; var29++) {
                            if (var28) {
                                if (method410(false, arg5[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method410(false, arg5[var29])) {
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
        if (arg1 != 20549) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method400(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method410(false, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg0 != 0) {
                field1125 = !field1125;
            }
            for (int var6 = arg3 - 1; var6 >= 0 && method410(false, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method410(false, arg1[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Z[CI[C)I")
    private static final int method401(boolean arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method410(false, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (!arg0) {
                return field1131;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && method410(false, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method410(false, arg3[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "([[B[C[CB)V")
    public static final void method402(byte[][] arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg3 != -100) {
            field1128 = !field1128;
        }
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label168: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label168;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg2.length && (var16 = method405(arg2[var7], 48428, var14, var15)) > 0) {
                        if (var16 == 1 && method413(0, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method413(0, var14) || method413(0, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label168;
                        }
                        int var17;
                        if ((var17 = method405(arg2[var7 - 1], 48428, var14, var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method411(-639, var14)) {
                                break label168;
                            }
                            if (method410(false, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method413(0, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label168;
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
                    if (var5 - 1 < 0 || method410(false, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method410(false, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method410(false, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method410(false, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method410(false, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method416(var27, 1)) {
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
                    byte var21 = method406(-10356, var19);
                    byte var22 = method406(-10356, var20);
                    if (arg0 != null && method403(var21, var22, arg0, (byte) -104)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    for (int var32 = var5; var32 < var6; var32++) {
                        if (method413(0, arg1[var32])) {
                            var30++;
                        } else if (method412(true, arg1[var32])) {
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean method403(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        if (arg3 != -104) {
            field1129 = 247;
        }
        int var4 = 0;
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg1) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg0 && arg2[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg0 && arg2[var6][1] == arg1) {
                return true;
            }
            if (arg0 < arg2[var6][0] || arg2[var6][0] == arg0 && arg1 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(CICC)I")
    private static final int method404(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 <= 0) {
            return field1124;
        } else if (arg2 == arg3) {
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

    @OriginalMember(owner = "pc", name = "b", descriptor = "(CICC)I")
    private static final int method405(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 48428) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg2) {
            return 1;
        }
        if (arg0 >= 'a' && arg0 <= 'm') {
            if (arg0 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if (arg2 == '1' && arg3 == '3') {
                        return 2;
                    }
                    return 0;
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
                if (arg2 == '[' && arg3 == ')') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'f') {
                if (arg2 == 'p' && arg3 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'g') {
                if (arg2 != '9' && arg2 != '6') {
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
                    if ((arg2 != '(' || arg3 != ')') && (arg2 != '[' || arg3 != ']') && (arg2 != '{' || arg3 != '}') && (arg2 != '<' || arg3 != '>')) {
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
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'v') {
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'w') {
                if (arg2 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'x') {
                if ((arg2 != ')' || arg3 != '(') && (arg2 != '}' || arg3 != '{') && (arg2 != ']' || arg3 != '[') && (arg2 != '>' || arg3 != '<')) {
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
                } else if ((arg2 != '(' || arg3 != ')') && (arg2 != '{' || arg3 != '}') && (arg2 != '[' || arg3 != ']')) {
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "(IC)B")
    private static final byte method406(int arg0, char arg1) {
        if (arg0 != -10356) {
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

    @OriginalMember(owner = "pc", name = "d", descriptor = "([CI)V")
    private static final void method407(char[] arg0, int arg1) {
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
                if ((var6 = method408(arg0, true, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method410(false, arg0[var8]) && !method411(-639, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method409(-1000, var6, arg0);
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

    @OriginalMember(owner = "pc", name = "a", descriptor = "([CZI)I")
    private static final int method408(char[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return 0;
        }
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(II[C)I")
    private static final int method409(int arg0, int arg1, char[] arg2) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = arg1;
        while (true) {
            if (var4 < arg2.length && var4 >= 0) {
                if (arg2[var4] >= '0' && arg2[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method410(boolean arg0, char arg1) {
        if (arg0) {
            field1127 = !field1127;
        }
        return !method412(true, arg1) && !method413(0, arg1);
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "(IC)Z")
    private static final boolean method411(int arg0, char arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "pc", name = "b", descriptor = "(ZC)Z")
    private static final boolean method412(boolean arg0, char arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "pc", name = "c", descriptor = "(IC)Z")
    private static final boolean method413(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "pc", name = "d", descriptor = "(IC)Z")
    private static final boolean method414(int arg0, char arg1) {
        if (arg0 != -40826) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(CI)Z")
    private static final boolean method415(char arg0, int arg1) {
        if (arg1 <= 0) {
            field1131 = -182;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "pc", name = "e", descriptor = "([CI)Z")
    private static final boolean method416(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method413(0, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg1 < 1 || arg1 > 1) {
            field1128 = !field1128;
        }
        if (var2) {
            return true;
        }
        int var4 = method417(arg0, 3);
        int var5 = 0;
        int var6 = field1134.length - 1;
        if (field1134[var5] == var4 || field1134[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1134[var7] == var4) {
                return true;
            }
            if (var4 < field1134[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "pc", name = "f", descriptor = "([CI)I")
    public static final int method417(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 < field1133 || arg1 > field1133) {
            field1133 = 108;
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
