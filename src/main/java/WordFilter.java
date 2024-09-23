import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1167 = 8;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1170 = -48;

    @OriginalMember(owner = "sc", name = "e", descriptor = "B")
    private static byte field1171 = 117;

    @OriginalMember(owner = "sc", name = "f", descriptor = "B")
    private static byte field1172 = -13;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1173 = 6;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1174 = -35226;

    @OriginalMember(owner = "sc", name = "j", descriptor = "I")
    private static int field1176 = 881;

    @OriginalMember(owner = "sc", name = "l", descriptor = "I")
    private static int field1178 = -864;

    @OriginalMember(owner = "sc", name = "m", descriptor = "Z")
    private static boolean field1179 = true;

    @OriginalMember(owner = "sc", name = "n", descriptor = "Z")
    private static boolean field1180 = true;

    @OriginalMember(owner = "sc", name = "o", descriptor = "B")
    private static byte field1181 = 7;

    @OriginalMember(owner = "sc", name = "p", descriptor = "I")
    private static int field1182 = -28760;

    @OriginalMember(owner = "sc", name = "x", descriptor = "[Ljava/lang/String;")
    private static final String[] field1190 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1169;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1175;

    @OriginalMember(owner = "sc", name = "k", descriptor = "I")
    private static int field1177;

    @OriginalMember(owner = "sc", name = "y", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1168;

    @OriginalMember(owner = "sc", name = "q", descriptor = "Z")
    private static boolean field1183;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[I")
    private static int[] field1184;

    @OriginalMember(owner = "sc", name = "w", descriptor = "[I")
    private static int[] field1189;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[[C")
    private static char[][] field1185;

    @OriginalMember(owner = "sc", name = "u", descriptor = "[[C")
    private static char[][] field1187;

    @OriginalMember(owner = "sc", name = "v", descriptor = "[[C")
    private static char[][] field1188;

    @OriginalMember(owner = "sc", name = "t", descriptor = "[[[B")
    private static byte[][][] field1186;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lyb;)V")
    public static final void method393(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method309("fragmentsenc.txt", null), (byte) 3);
        Packet var2 = new Packet(arg0.method309("badenc.txt", null), (byte) 3);
        Packet var3 = new Packet(arg0.method309("domainenc.txt", null), (byte) 3);
        Packet var4 = new Packet(arg0.method309("tldlist.txt", null), (byte) 3);
        method394(var1, var2, var3, var4);
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method394(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method396(0, arg1);
        method397(arg2, -48);
        method398(arg0, (byte) 3);
        method395(arg3, 2);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;I)V")
    private static final void method395(Packet arg0, int arg1) {
        int var2 = arg0.method244();
        if (arg1 != 2) {
            return;
        }
        field1188 = new char[var2][];
        field1189 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1189[var3] = arg0.method239();
            char[] var4 = new char[arg0.method239()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method239();
            }
            field1188[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILmb;)V")
    private static final void method396(int arg0, Packet arg1) {
        int var2 = arg1.method244();
        field1185 = new char[var2][];
        field1186 = new byte[var2][][];
        method399(field1185, arg1, 0, field1186);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Lmb;I)V")
    private static final void method397(Packet arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = arg0.method244();
        field1187 = new char[var3][];
        method400(arg0, field1187, -67);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;B)V")
    private static final void method398(Packet arg0, byte arg1) {
        field1184 = new int[arg0.method244()];
        if (arg1 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < field1184.length; var3++) {
            field1184[var3] = arg0.method241();
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[CLmb;I[[[B)V")
    private static final void method399(char[][] arg0, Packet arg1, int arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg1.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method239();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg1.method239()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method239();
                var7[var8][1] = (byte) arg1.method239();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg2 != 0) {
            field1167 = -126;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;[[CI)V")
    private static final void method400(Packet arg0, char[][] arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method239()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method239();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method401(char[] arg0, byte arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method402(-37569, arg0[var3])) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1 != 53) {
            field1169 = -364;
        }
        for (int var4 = var2; var4 < arg0.length; var4++) {
            arg0[var4] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method402(int arg0, char arg1) {
        if (arg0 != -37569) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method403(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method401(var4, (byte) 53);
        if (field1172 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        String var6 = (new String(var4)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method411(var7, -48528);
        method406(var7, true);
        method407(382, var7);
        method420(var7, 9);
        for (int var9 = 0; var9 < field1190.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1190[var9], var12 + 1)) != -1) {
                char[] var13 = field1190[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method404((byte) 7, var6.toCharArray(), var7);
        method405(var7, (byte) 6);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C[C)V")
    private static final void method404(byte arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg2[var3] != '*' && method428(arg1[var3], -724)) {
                arg2[var3] = arg1[var3];
            }
        }
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CB)V")
    private static final void method405(char[] arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var2 = false;
        } else {
            field1169 = 106;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method425(8, var5)) {
                var3 = true;
            } else if (var3) {
                if (method427(var5, field1182)) {
                    var3 = false;
                }
            } else if (method428(var5, -724)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method406(char[] arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1185.length - 1; var4 >= 0; var4--) {
                method415(arg0, (byte) 89, field1186[var4], field1185[var4]);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method407(int arg0, char[] arg1) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        char[] var3 = (char[]) arg1.clone();
        char[] var4 = new char[] { '(', 'a', ')' };
        method415(var3, (byte) 89, null, var4);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method415(var5, (byte) 89, null, var6);
        for (int var7 = field1187.length - 1; var7 >= 0; var7--) {
            method408(var3, 6, arg1, var5, field1187[var7]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C[C[C)V")
    private static final void method408(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1 < field1173 || arg1 > field1173 || arg4.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg4.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg2.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg2[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg2.length) {
                        var12 = arg2[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg4.length && (var13 = method417(arg4[var8], var11, var12, field1177)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method417(arg4[var8 - 1], var11, var12, field1177)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method423(var11, true)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method409(var6, arg0, arg2, field1174);
                int var17 = method410(arg2, field1175, var7 - 1, arg3);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg2[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method409(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 != -35226) {
            field1183 = !field1183;
        }
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method423(arg2[var4], true); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method423(arg1[var6], true); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method423(arg2[arg0 - 1], true)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII[C)I")
    private static final int method410(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method423(arg0[var4], true)) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 0) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg2 + 1; var7 < arg0.length && method423(arg3[var7], true); var7++) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method423(arg0[arg2 + 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method411(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != -48528) {
            field1182 = 146;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method415(var2, (byte) 89, null, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method415(var4, (byte) 89, null, var5);
        for (int var6 = 0; var6 < field1188.length; var6++) {
            method412(arg0, field1189[var6], var4, field1188[var6], var2, 38262);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C[C[CI)V")
    private static final void method412(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label137: while (true) {
                while (true) {
                    if (var9 >= arg0.length) {
                        break label137;
                    }
                    boolean var12 = false;
                    char var13 = arg0[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg0.length) {
                        var14 = arg0[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg3.length && (var15 = method417(arg3[var10], var13, var14, field1177)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label137;
                        }
                        int var16;
                        if ((var16 = method417(arg3[var10 - 1], var13, var14, field1177)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg3.length || !method423(var13, true)) {
                                break label137;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg3.length) {
                boolean var17 = false;
                int var18 = method413(false, arg4, var7, arg0);
                int var19 = method414(var9 - 1, arg0, arg2, (byte) 0);
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
                                if (method423(arg0[var25], true)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method423(arg0[var25], true)) {
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
                                if (method423(arg0[var29], true)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method423(arg0[var29], true)) {
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
        if (arg5 != 38262) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[CI[C)I")
    private static final int method413(boolean arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method423(arg3[var4], true)) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg0) {
                field1168 = !field1168;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method423(arg1[var6], true); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method423(arg3[arg2 - 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method414(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method423(arg1[var4], true)) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method423(arg2[var6], true); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 != 0) {
                field1173 = 153;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method423(arg1[arg0 + 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB[[B[C)V")
    public static final void method415(char[] arg0, byte arg1, byte[][] arg2, char[] arg3) {
        if (arg1 != 89) {
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
            label167: while (true) {
                while (true) {
                    if (var7 >= arg0.length || var12 && var13) {
                        break label167;
                    }
                    boolean var14 = false;
                    char var15 = arg0[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg0.length) {
                        var16 = arg0[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg3.length && (var17 = method418(arg3[var8], var16, field1178, var15)) > 0) {
                        if (var17 == 1 && method426(470, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method426(470, var15) || method426(470, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label167;
                        }
                        int var18;
                        if ((var18 = method418(arg3[var8 - 1], var16, field1178, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method424(var15, true)) {
                                break label167;
                            }
                            if (method423(var15, true) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method426(470, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label167;
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
                    if (var6 - 1 < 0 || method423(arg0[var6 - 1], true) && arg0[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg0.length || method423(arg0[var7], true) && arg0[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method423(arg0[var27], true) || arg0[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg0.length && (!method423(arg0[var27 + var29], true) || arg0[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg0[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method423(arg0[var27 - 1], true) || arg0[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method429(0, var28)) {
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
                    byte var22 = method419(var20, field1179);
                    byte var23 = method419(var21, field1179);
                    if (arg2 != null && method416(var22, 881, arg2, var23)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method426(470, arg0[var34])) {
                            var31++;
                        } else if (method425(8, arg0[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 + 1 - var33;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg0[var35] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BI[[BB)Z")
    private static final boolean method416(byte arg0, int arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg1 <= 0) {
            field1169 = 234;
        }
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
            return true;
        }
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCI)I")
    private static final int method417(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != 0) {
            return field1170;
        } else if (arg0 == arg1) {
            return 1;
        } else if (arg0 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg0 == 's' && arg1 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCIC)I")
    private static final int method418(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 >= 0) {
            field1179 = !field1179;
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
                    if ((arg3 != '1' || arg1 != '3') && (arg3 != 'i' || arg1 != '3')) {
                        return 0;
                    }
                    return 2;
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
                if ((arg3 != '[' || arg1 != ')') && (arg3 != 'i' || arg1 != ')')) {
                    return 0;
                }
                return 2;
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
                if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
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
                    if (arg3 == '(' && arg1 == ')' || arg3 == '[' && arg1 == ']' || arg3 == '{' && arg1 == '}' || arg3 == '<' && arg1 == '>') {
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
                if (arg3 == '\\' && arg1 == '/' || arg3 == '\\' && arg1 == '|' || arg3 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)B")
    private static final byte method419(char arg0, boolean arg1) {
        if (!arg1) {
            field1169 = -95;
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method420(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg1 < 9 || arg1 > 9) {
            return;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method421(field1180, arg0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method423(arg0[var8], true) && !method424(arg0[var8], true)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method422(var6, arg0, (byte) 7);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[CI)I")
    private static final int method421(boolean arg0, char[] arg1, int arg2) {
        if (!arg0) {
            return field1178;
        }
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CB)I")
    private static final int method422(int arg0, char[] arg1, byte arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (field1181 == arg2) {
                boolean var4 = false;
            } else {
                field1180 = !field1180;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CZ)Z")
    private static final boolean method423(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return !method425(8, arg0) && !method426(470, arg0);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CZ)Z")
    private static final boolean method424(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method425(int arg0, char arg1) {
        if (arg0 != 8) {
            field1173 = 68;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method426(int arg0, char arg1) {
        int var2 = 23 / arg0;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method427(char arg0, int arg1) {
        if (field1182 != arg1) {
            field1167 = 81;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method428(char arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'A' && arg0 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)Z")
    private static final boolean method429(int arg0, char[] arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method426(470, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method430(arg1, (byte) 9);
        int var5 = 0;
        int var6 = field1184.length - 1;
        if (field1184[var5] == var4 || field1184[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1184[var7] == var4) {
                return true;
            }
            if (var4 < field1184[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CB)I")
    public static final int method430(char[] arg0, byte arg1) {
        if (arg1 != 9) {
            return field1177;
        } else if (arg0.length > 6) {
            return 0;
        } else {
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
            return var2;
        }
    }
}
