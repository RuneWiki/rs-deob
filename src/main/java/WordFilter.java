import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1187 = 986;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1188 = true;

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1189 = true;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1190 = 9;

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1191 = -747;

    @OriginalMember(owner = "sc", name = "f", descriptor = "B")
    private static byte field1192 = 7;

    @OriginalMember(owner = "sc", name = "g", descriptor = "B")
    private static byte field1193 = 21;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1194 = 7;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1195 = 7;

    @OriginalMember(owner = "sc", name = "j", descriptor = "Z")
    private static boolean field1196 = true;

    @OriginalMember(owner = "sc", name = "k", descriptor = "Z")
    private static boolean field1197 = true;

    @OriginalMember(owner = "sc", name = "l", descriptor = "I")
    private static int field1198 = 1;

    @OriginalMember(owner = "sc", name = "m", descriptor = "I")
    private static int field1199 = 8;

    @OriginalMember(owner = "sc", name = "t", descriptor = "[Ljava/lang/String;")
    private static final String[] field1206 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "u", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[I")
    private static int[] field1200;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[I")
    private static int[] field1205;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1201;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[[C")
    private static char[][] field1203;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[[C")
    private static char[][] field1204;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[[B")
    private static byte[][][] field1202;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method385(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method295("fragmentsenc.txt", null), 185);
        Packet var2 = new Packet(arg0.method295("badenc.txt", null), 185);
        Packet var3 = new Packet(arg0.method295("domainenc.txt", null), 185);
        Packet var4 = new Packet(arg0.method295("tldlist.txt", null), 185);
        method386(var1, var2, var3, var4);
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method386(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method388(arg1, 6);
        method389(arg2, field1191);
        method390(arg0, true);
        method387(3, arg3);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method387(int arg0, Packet arg1) {
        if (arg0 != 3) {
            field1187 = -170;
        }
        int var2 = arg1.method230();
        field1204 = new char[var2][];
        field1205 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1205[var3] = arg1.method225();
            char[] var4 = new char[arg1.method225()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method225();
            }
            field1204[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method388(Packet arg0, int arg1) {
        int var2 = arg0.method230();
        if (arg1 < 6 || arg1 > 6) {
            field1188 = !field1188;
        }
        field1201 = new char[var2][];
        field1202 = new byte[var2][][];
        method391(arg0, (byte) 7, field1202, field1201);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Llb;I)V")
    private static final void method389(Packet arg0, int arg1) {
        int var2 = arg0.method230();
        if (arg1 >= 0) {
            field1187 = -118;
        }
        field1203 = new char[var2][];
        method392(field1203, false, arg0);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z)V")
    private static final void method390(Packet arg0, boolean arg1) {
        field1200 = new int[arg0.method230()];
        if (arg1) {
            for (int var2 = 0; var2 < field1200.length; var2++) {
                field1200[var2] = arg0.method227();
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B[[[B[[C)V")
    private static final void method391(Packet arg0, byte arg1, byte[][][] arg2, char[][] arg3) {
        if (field1192 == arg1) {
            boolean var4 = false;
        } else {
            field1191 = 116;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            char[] var6 = new char[arg0.method225()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg0.method225();
            }
            arg3[var5] = var6;
            byte[][] var8 = new byte[arg0.method225()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg0.method225();
                var8[var9][1] = (byte) arg0.method225();
            }
            if (var8.length > 0) {
                arg2[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[CZLlb;)V")
    private static final void method392(char[][] arg0, boolean arg1, Packet arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method225()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method225();
            }
            arg0[var3] = var4;
        }
        if (arg1) {
            field1189 = !field1189;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method393(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method394(arg0[var3], (byte) 53)) {
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
        if (arg1 < 2 || arg1 > 2) {
            field1187 = -499;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)Z")
    private static final boolean method394(char arg0, byte arg1) {
        if (arg1 != 53) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method395(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        if (arg1 < 7 || arg1 > 7) {
            field1189 = !field1189;
        }
        method393(var4, 2);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method403(field1194, var6);
        method398(var6, (byte) -37);
        method399(true, var6);
        method412(var6, false);
        for (int var8 = 0; var8 < field1206.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1206[var8], var11 + 1)) != -1) {
                char[] var12 = field1206[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method396((byte) 21, var6, var5.toCharArray());
        method397(var6, 4);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C[C)V")
    private static final void method396(byte arg0, char[] arg1, char[] arg2) {
        if (field1193 != arg0) {
            field1194 = 41;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method420(arg2[var3], 8)) {
                arg1[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method397(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method417((byte) 1, var4)) {
                var2 = true;
            } else if (var2) {
                if (method419(-802, var4)) {
                    var2 = false;
                }
            } else if (method420(var4, 8)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method398(char[] arg0, byte arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1201.length - 1; var3 >= 0; var3--) {
                method407(field1202[var3], arg0, field1201[var3], 6);
            }
        }
        if (arg1 == -37) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C)V")
    private static final void method399(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (!arg0) {
            field1191 = 19;
        }
        method407(null, var2, var3, 6);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method407(null, var4, var5, 6);
        for (int var6 = field1203.length - 1; var6 >= 0; var6--) {
            method400(field1203[var6], var2, var4, 8079, arg1);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CI[C)V")
    private static final void method400(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        if (arg3 != 8079) {
            field1189 = !field1189;
        }
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg0.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label66: while (true) {
                while (true) {
                    if (var7 >= arg4.length) {
                        break label66;
                    }
                    boolean var10 = false;
                    char var11 = arg4[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg4.length) {
                        var12 = arg4[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg0.length && (var13 = method409(2, var12, var11, arg0[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label66;
                        }
                        int var14;
                        if ((var14 = method409(2, var12, var11, arg0[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method415(var11, (byte) 6)) {
                                break label66;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method401(-642, arg1, arg4, var6);
                int var17 = method402(8, arg2, var7 - 1, arg4);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method401(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method415(arg2[var4], (byte) 6); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        if (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        for (int var7 = arg3 - 1; var7 >= 0 && method415(arg1[var7], (byte) 6); var7--) {
            if (arg1[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method415(arg2[arg3 - 1], (byte) 6)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method402(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method415(arg3[var4], (byte) 6)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != 8) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg3.length && method415(arg1[var7], (byte) 6); var7++) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method415(arg3[arg2 + 1], (byte) 6)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method403(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (field1195 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method407(null, var2, var3, 6);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method407(null, var5, var6, 6);
        for (int var7 = 0; var7 < field1204.length; var7++) {
            method404(field1204[var7], arg1, var5, field1205[var7], field1196, var2);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CIZ[C)V")
    private static final void method404(char[] arg0, char[] arg1, char[] arg2, int arg3, boolean arg4, char[] arg5) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        if (!arg4) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var11;
        for (int var8 = 0; var8 <= arg1.length - arg0.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label128: while (true) {
                while (true) {
                    if (var9 >= arg1.length) {
                        break label128;
                    }
                    boolean var12 = false;
                    char var13 = arg1[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg1.length) {
                        var14 = arg1[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg0.length && (var15 = method409(2, var14, var13, arg0[var10])) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label128;
                        }
                        int var16;
                        if ((var16 = method409(2, var14, var13, arg0[var10 - 1])) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg0.length || !method415(var13, (byte) 6)) {
                                break label128;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg0.length) {
                boolean var17 = false;
                int var18 = method405((byte) 101, arg5, arg1, var8);
                int var19 = method406(-827, arg2, var9 - 1, arg1);
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
                                if (method415(arg1[var25], (byte) 6)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method415(arg1[var25], (byte) 6)) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg1.length; var27++) {
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
                        for (int var29 = var21 + 1; var29 < arg1.length; var29++) {
                            if (var28) {
                                if (method415(arg1[var29], (byte) 6)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method415(arg1[var29], (byte) 6)) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg1[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C[CI)I")
    private static final int method405(byte arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method415(arg2[var4], (byte) 6)) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method415(arg1[var6], (byte) 6); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 != 101) {
                field1196 = !field1196;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method415(arg2[arg3 - 1], (byte) 6)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[CI[C)I")
    private static final int method406(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method415(arg3[var4], (byte) 6)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && method415(arg1[var6], (byte) 6); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            while (arg0 >= 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method415(arg3[arg2 + 1], (byte) 6)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method407(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 != 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label168: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label168;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg2.length && (var17 = method410(field1197, var15, var16, arg2[var8])) > 0) {
                        if (var17 == 1 && method418(var15, 0)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method418(var15, 0) || method418(var16, 0))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label168;
                        }
                        int var18;
                        if ((var18 = method410(field1197, var15, var16, arg2[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method416(-783, var15)) {
                                break label168;
                            }
                            if (method415(var15, (byte) 6) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method418(var15, 0)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label168;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg2.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var6 - 1 < 0 || method415(arg1[var6 - 1], (byte) 6) && arg1[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method415(arg1[var7], (byte) 6) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method415(arg1[var27], (byte) 6) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method415(arg1[var27 + var29], (byte) 6) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method415(arg1[var27 - 1], (byte) 6) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method421(9, var28)) {
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
                        var20 = arg1[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg1.length) {
                        var21 = arg1[var7];
                    }
                    byte var22 = method411(11772, var20);
                    byte var23 = method411(11772, var21);
                    if (arg0 != null && method408(var23, arg0, var22, true)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method418(arg1[var34], 0)) {
                            var31++;
                        } else if (method417((byte) 1, arg1[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg1[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[[BBZ)Z")
    private static final boolean method408(byte arg0, byte[][] arg1, byte arg2, boolean arg3) {
        int var4 = 0;
        if (!arg3) {
            field1188 = !field1188;
        }
        if (arg1[var4][0] == arg2 && arg1[var4][1] == arg0) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg2 && arg1[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg2 && arg1[var6][1] == arg0) {
                return true;
            }
            if (arg2 < arg1[var6][0] || arg1[var6][0] == arg2 && arg0 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ICCC)I")
    private static final int method409(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 2) {
            field1197 = !field1197;
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg2 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZCCC)I")
    private static final int method410(boolean arg0, char arg1, char arg2, char arg3) {
        if (!arg0) {
            field1194 = 148;
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
                    if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
                        return 0;
                    }
                    return 2;
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
                if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
                    return 0;
                }
                return 2;
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
                if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)B")
    private static final byte method411(int arg0, char arg1) {
        if (arg0 != 11772) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method412(char[] arg0, boolean arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg1) {
            field1187 = 439;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method413(arg0, var3, field1198)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method415(arg0[var8], (byte) 6) && !method416(-783, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method414(5, var6, arg0);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII)I")
    private static final int method413(char[] arg0, int arg1, int arg2) {
        if (arg2 < 1 || arg2 > 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg1; var4 < arg0.length && var4 >= 0; var4++) {
            if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C)I")
    private static final int method414(int arg0, int arg1, char[] arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 < 5 || arg0 > 5) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CB)Z")
    private static final boolean method415(char arg0, byte arg1) {
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        return !method417((byte) 1, arg0) && !method418(arg0, 0);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method416(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method417(byte arg0, char arg1) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method418(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method419(int arg0, char arg1) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method420(char arg0, int arg1) {
        if (arg1 < field1199 || arg1 > field1199) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)Z")
    private static final boolean method421(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method418(arg1[var3], 0) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg0 != 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2) {
            return true;
        }
        int var5 = method422(arg1, 0);
        int var6 = 0;
        int var7 = field1200.length - 1;
        if (field1200[var6] == var5 || field1200[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1200[var8] == var5) {
                return true;
            }
            if (var5 < field1200[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)I")
    public static final int method422(char[] arg0, int arg1) {
        if (arg1 != 0) {
            return field1191;
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
