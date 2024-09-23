import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "Z")
    private static boolean field1177 = true;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1178 = true;

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1179 = 940;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1180 = 901;

    @OriginalMember(owner = "sc", name = "f", descriptor = "Z")
    private static boolean field1182 = true;

    @OriginalMember(owner = "sc", name = "g", descriptor = "Z")
    private static boolean field1183 = true;

    @OriginalMember(owner = "sc", name = "j", descriptor = "I")
    private static int field1186 = -475;

    @OriginalMember(owner = "sc", name = "k", descriptor = "I")
    private static int field1187 = 3;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1194 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

    @OriginalMember(owner = "sc", name = "h", descriptor = "B")
    private static byte field1184;

    @OriginalMember(owner = "sc", name = "i", descriptor = "B")
    private static byte field1185;

    @OriginalMember(owner = "sc", name = "s", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "sc", name = "e", descriptor = "Z")
    private static boolean field1181;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[I")
    private static int[] field1188;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[I")
    private static int[] field1193;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[C")
    private static char[][] field1189;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1191;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[C")
    private static char[][] field1192;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[[B")
    private static byte[][][] field1190;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lyb;)V")
    public static final void method393(Jagfile arg0) {
        Packet var1 = new Packet(16, arg0.method309("fragmentsenc.txt", null));
        Packet var2 = new Packet(16, arg0.method309("badenc.txt", null));
        Packet var3 = new Packet(16, arg0.method309("domainenc.txt", null));
        Packet var4 = new Packet(16, arg0.method309("tldlist.txt", null));
        method394(var1, var2, var3, var4);
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method394(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method396(arg1, 29365);
        method397((byte) 8, arg2);
        method398(field1180, arg0);
        method395(0, arg3);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILmb;)V")
    private static final void method395(int arg0, Packet arg1) {
        int var2 = arg1.method244();
        field1192 = new char[var2][];
        field1193 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1193[var3] = arg1.method239();
            char[] var5 = new char[arg1.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method239();
            }
            field1192[var3] = var5;
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;I)V")
    private static final void method396(Packet arg0, int arg1) {
        if (arg1 == 29365) {
            int var2 = arg0.method244();
            field1189 = new char[var2][];
            field1190 = new byte[var2][][];
            method399(field1190, arg0, 7, field1189);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLmb;)V")
    private static final void method397(byte arg0, Packet arg1) {
        if (arg0 == 8) {
            boolean var2 = false;
        }
        int var3 = arg1.method244();
        field1191 = new char[var3][];
        method400(field1191, arg1, field1181);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILmb;)V")
    private static final void method398(int arg0, Packet arg1) {
        field1188 = new int[arg1.method244()];
        for (int var2 = 0; var2 < field1188.length; var2++) {
            field1188[var2] = arg1.method241();
        }
        int var3 = 16 / arg0;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[[BLmb;I[[C)V")
    private static final void method399(byte[][][] arg0, Packet arg1, int arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method239();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method239()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method239();
                var7[var8][1] = (byte) arg1.method239();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
        if (arg2 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[CLmb;Z)V")
    private static final void method400(char[][] arg0, Packet arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method239()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method239();
            }
            arg0[var3] = var4;
        }
        if (arg2) {
            field1181 = !field1181;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method401(char[] arg0, int arg1) {
        int var2 = 17 / arg1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (method402(arg0[var4], false)) {
                arg0[var3] = arg0[var4];
            } else {
                arg0[var3] = ' ';
            }
            if (var3 == 0 || arg0[var3] != ' ' || arg0[var3 - 1] != ' ') {
                var3++;
            }
        }
        for (int var5 = var3; var5 < arg0.length; var5++) {
            arg0[var5] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method402(char arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method403(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method401(var4, 106);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method411(31155, var6);
        method406(2, var6);
        if (arg1) {
            field1180 = 359;
        }
        method407(var6, 0);
        method420(var6, (byte) 7);
        for (int var8 = 0; var8 < field1194.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1194[var8], var11 + 1)) != -1) {
                char[] var12 = field1194[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method404(-963, var6, var5.toCharArray());
        method405(var6, 987);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[C)V")
    private static final void method404(int arg0, char[] arg1, char[] arg2) {
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method428(arg2[var3], field1186)) {
                arg1[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method405(char[] arg0, int arg1) {
        boolean var2 = true;
        int var3 = 72 / arg1;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method425(4, var5)) {
                var2 = true;
            } else if (var2) {
                if (method427(3, var5)) {
                    var2 = false;
                }
            } else if (method428(var5, field1186)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method406(int arg0, char[] arg1) {
        if (arg0 < 2 || arg0 > 2) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1189.length - 1; var3 >= 0; var3--) {
                method415(field1182, field1190[var3], arg1, field1189[var3]);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)V")
    private static final void method407(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method415(field1182, null, var2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method415(field1182, null, var4, var5);
        for (int var6 = field1191.length - 1; var6 >= 0; var6--) {
            method408(var2, 0, var4, field1191[var6], arg0);
        }
        if (arg1 != 0) {
            field1178 = !field1178;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C[C[C)V")
    private static final void method408(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var5 = true;
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
                    if (var8 < arg3.length && (var13 = method417(var12, var11, 20062, arg3[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method417(var12, var11, 20062, arg3[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method423(0, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method409(arg4, true, var6, arg0);
                int var17 = method410(arg2, arg4, var7 - 1, 0);
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
        if (arg1 != 0) {
            field1186 = -288;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZI[C)I")
    private static final int method409(char[] arg0, boolean arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method423(0, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method423(0, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (!arg1) {
            return 2;
        } else if (var5 >= 3) {
            return 4;
        } else if (method423(0, arg0[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CII)I")
    private static final int method410(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method423(0, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != 0) {
                return field1179;
            }
            for (int var6 = arg2 + 1; var6 < arg1.length && method423(0, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method423(0, arg1[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)V")
    private static final void method411(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method415(field1182, null, var2, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg0 == 31155) {
            method415(field1182, null, var4, var5);
            for (int var6 = 0; var6 < field1192.length; var6++) {
                method412(arg1, field1192[var6], var2, field1193[var6], (byte) 10, var4);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CIB[C)V")
    private static final void method412(char[] arg0, char[] arg1, char[] arg2, int arg3, byte arg4, char[] arg5) {
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg1.length; var7 += var10) {
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
                    if (var9 < arg1.length && (var14 = method417(var13, var12, 20062, arg1[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method417(var13, var12, 20062, arg1[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method423(0, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method413(arg2, var7, arg0, 1);
                int var18 = method414(var8 - 1, arg0, 0, arg5);
                if (arg3 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg3 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg3 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method423(0, arg0[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method423(0, arg0[var24])) {
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
                                    if (arg5[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg5[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method423(0, arg0[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method423(0, arg0[var28])) {
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
        if (arg4 != 10) {
            field1180 = -106;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[CI)I")
    private static final int method413(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method423(0, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg3 != 1) {
                return 2;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method423(0, arg0[var6]); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method423(0, arg2[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method414(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 != 0) {
            return 2;
        } else if (arg0 + 1 == arg1.length) {
            return 2;
        } else {
            int var4 = arg0 + 1;
            while (true) {
                if (var4 < arg1.length && method423(0, arg1[var4])) {
                    if (arg1[var4] != '\\' && arg1[var4] != '/') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg0 + 1; var6 < arg1.length && method423(0, arg3[var6]); var6++) {
                    if (arg3[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 5) {
                    return 4;
                }
                if (method423(0, arg1[arg0 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[[B[C[C)V")
    public static final void method415(boolean arg0, byte[][] arg1, char[] arg2, char[] arg3) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        if (!arg0) {
            field1177 = true;
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
            label169: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label169;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg3.length && (var16 = method418(var15, -48874, arg3[var7], var14)) > 0) {
                        if (var16 == 1 && method426(var14, -662)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method426(var14, -662) || method426(var15, -662))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label169;
                        }
                        int var17;
                        if ((var17 = method418(var15, -48874, arg3[var7 - 1], var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method424(-580, var14)) {
                                break label169;
                            }
                            if (method423(0, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method426(var14, -662)) {
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
            if (var7 >= arg3.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method423(0, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method423(0, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method423(0, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method423(0, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method423(0, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method429(376, var27)) {
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
                    byte var21 = method419(var19, 597);
                    byte var22 = method419(var20, 597);
                    if (arg1 != null && method416(var21, field1184, var22, arg1)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method426(arg2[var33], -662)) {
                            var30++;
                        } else if (method425(4, arg2[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 + 1 - var32;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg2[var34] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BBB[[B)Z")
    private static final boolean method416(byte arg0, byte arg1, byte arg2, byte[][] arg3) {
        int var4 = 0;
        if (field1185 != arg1) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        if (arg3[var4][0] == arg0 && arg3[var4][1] == arg2) {
            return true;
        }
        int var6 = arg3.length - 1;
        if (arg3[var6][0] == arg0 && arg3[var6][1] == arg2) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg3[var7][0] == arg0 && arg3[var7][1] == arg2) {
                return true;
            }
            if (arg0 < arg3[var7][0] || arg3[var7][0] == arg0 && arg2 < arg3[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCIC)I")
    private static final int method417(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 20062) {
            field1180 = -460;
        }
        if (arg1 == arg3) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CICC)I")
    private static final int method418(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != -48874) {
            return field1187;
        } else if (arg2 == arg3) {
            return 1;
        } else {
            if (arg2 >= 'a' && arg2 <= 'm') {
                if (arg2 == 'a') {
                    if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                        if (arg3 == '/' && arg0 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'b') {
                    if (arg3 != '6' && arg3 != '8') {
                        if ((arg3 != '1' || arg0 != '3') && (arg3 != 'i' || arg0 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg2 == 'c') {
                    if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'd') {
                    if ((arg3 != '[' || arg0 != ')') && (arg3 != 'i' || arg0 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'e') {
                    if (arg3 != '3' && arg3 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'f') {
                    if (arg3 == 'p' && arg0 == 'h') {
                        return 2;
                    }
                    if (arg3 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'g') {
                    if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'h') {
                    if (arg3 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'i') {
                    if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'j') {
                    return 0;
                }
                if (arg2 == 'k') {
                    return 0;
                }
                if (arg2 == 'l') {
                    if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'm') {
                    return 0;
                }
            }
            if (arg2 >= 'n' && arg2 <= 'z') {
                if (arg2 == 'n') {
                    return 0;
                }
                if (arg2 == 'o') {
                    if (arg3 != '0' && arg3 != '*') {
                        if ((arg3 != '(' || arg0 != ')') && (arg3 != '[' || arg0 != ']') && (arg3 != '{' || arg0 != '}') && (arg3 != '<' || arg0 != '>')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg2 == 'p') {
                    return 0;
                }
                if (arg2 == 'q') {
                    return 0;
                }
                if (arg2 == 'r') {
                    return 0;
                }
                if (arg2 == 's') {
                    if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 't') {
                    if (arg3 != '7' && arg3 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'u') {
                    if (arg3 == 'v') {
                        return 1;
                    }
                    if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'v') {
                    if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'w') {
                    if (arg3 == 'v' && arg0 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg2 == 'x') {
                    if ((arg3 != ')' || arg0 != '(') && (arg3 != '}' || arg0 != '{') && (arg3 != ']' || arg0 != '[') && (arg3 != '>' || arg0 != '<')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'y') {
                    return 0;
                }
                if (arg2 == 'z') {
                    return 0;
                }
            }
            if (arg2 >= '0' && arg2 <= '9') {
                if (arg2 == '0') {
                    if (arg3 == 'o' || arg3 == 'O') {
                        return 1;
                    } else if ((arg3 != '(' || arg0 != ')') && (arg3 != '{' || arg0 != '}') && (arg3 != '[' || arg0 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg2 == '1') {
                    return arg3 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg2 == ',') {
                return arg3 == '.' ? 1 : 0;
            } else if (arg2 == '.') {
                return arg3 == ',' ? 1 : 0;
            } else if (arg2 == '!') {
                return arg3 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)B")
    private static final byte method419(char arg0, int arg1) {
        if (arg1 <= 0) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method420(char[] arg0, byte arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg1 == 7) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        int var7 = 0;
        while (true) {
            do {
                int var8;
                if ((var8 = method421(arg0, var3, true)) == -1) {
                    return;
                }
                boolean var9 = false;
                for (int var10 = var3; var10 >= 0 && var10 < var8 && !var9; var10++) {
                    if (!method423(0, arg0[var10]) && !method424(-580, arg0[var10])) {
                        var9 = true;
                    }
                }
                if (var9) {
                    var6 = 0;
                }
                if (var6 == 0) {
                    var7 = var8;
                }
                var3 = method422(arg0, true, var8);
                int var11 = 0;
                for (int var12 = var8; var12 < var3; var12++) {
                    var11 = var11 * 10 + arg0[var12] - 48;
                }
                if (var11 <= 255 && var3 - var8 <= 8) {
                    var6++;
                } else {
                    var6 = 0;
                }
            } while (var6 != 4);
            for (int var13 = var7; var13 < var3; var13++) {
                arg0[var13] = '*';
            }
            var6 = 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CIZ)I")
    private static final int method421(char[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1187 = 119;
        }
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZI)I")
    private static final int method422(char[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return field1187;
        }
        int var3 = arg2;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        if (arg0 != 0) {
            field1179 = -465;
        }
        return !method425(4, arg1) && !method426(arg1, -662);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method424(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method425(int arg0, char arg1) {
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method426(char arg0, int arg1) {
        if (arg1 >= 0) {
            field1183 = !field1183;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(IC)Z")
    private static final boolean method427(int arg0, char arg1) {
        if (arg0 < 3 || arg0 > 3) {
            field1179 = -99;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CI)Z")
    private static final boolean method428(char arg0, int arg1) {
        while (arg1 >= 0) {
            field1180 = -243;
        }
        if (arg0 >= 'A' && arg0 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(I[C)Z")
    private static final boolean method429(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method426(arg1[var3], -662) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method430(0, arg1);
        int var5 = 0;
        if (arg0 <= 0) {
            field1181 = !field1181;
        }
        int var6 = field1188.length - 1;
        if (field1188[var5] == var4 || field1188[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1188[var7] == var4) {
                return true;
            }
            if (var4 < field1188[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(I[C)I")
    public static final int method430(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 0) {
            field1179 = 247;
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
