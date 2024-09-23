import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "b", descriptor = "I")
    private static int field1210 = 35138;

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1211 = 39405;

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1213 = -20584;

    @OriginalMember(owner = "sc", name = "g", descriptor = "B")
    private static byte field1215 = 9;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1217 = 9;

    @OriginalMember(owner = "sc", name = "j", descriptor = "I")
    private static int field1218 = 633;

    @OriginalMember(owner = "sc", name = "k", descriptor = "Z")
    private static boolean field1219 = true;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1226 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1212;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1214;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1216;

    @OriginalMember(owner = "sc", name = "s", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "sc", name = "a", descriptor = "Z")
    private static boolean field1209;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[I")
    private static int[] field1220;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[I")
    private static int[] field1225;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[C")
    private static char[][] field1221;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1223;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[C")
    private static char[][] field1224;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[[B")
    private static byte[][][] field1222;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method299("fragmentsenc.txt", null), -26728);
        Packet var2 = new Packet(arg0.method299("badenc.txt", null), -26728);
        Packet var3 = new Packet(arg0.method299("domainenc.txt", null), -26728);
        Packet var4 = new Packet(arg0.method299("tldlist.txt", null), -26728);
        method392(var1, var2, var3, var4);
        if (Linkable.field363) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(arg1, field1210);
        method395(arg2, 39405);
        method396(arg0, (byte) 22);
        method393(arg3, -385);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method393(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        field1224 = new char[var2][];
        field1225 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1225[var3] = arg0.method229();
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            field1224[var3] = var4;
        }
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Llb;I)V")
    private static final void method394(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        if (arg1 != 35138) {
            field1210 = -477;
        }
        field1221 = new char[var2][];
        field1222 = new byte[var2][][];
        method397(field1221, field1222, (byte) 80, arg0);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(Llb;I)V")
    private static final void method395(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        if (field1211 == arg1) {
            field1223 = new char[var2][];
            method398(arg0, field1212, field1223);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B)V")
    private static final void method396(Packet arg0, byte arg1) {
        if (arg1 != 22) {
            field1219 = !field1219;
        }
        field1220 = new int[arg0.method234()];
        for (int var2 = 0; var2 < field1220.length; var2++) {
            field1220[var2] = arg0.method231();
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[C[[[BBLlb;)V")
    private static final void method397(char[][] arg0, byte[][][] arg1, byte arg2, Packet arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg3.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method229();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg3.method229()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method229();
                var7[var8][1] = (byte) arg3.method229();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg2 != 80) {
            field1212 = 459;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I[[C)V")
    private static final void method398(Packet arg0, int arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            arg2[var3] = var4;
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method399(int arg0, char[] arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method400(false, arg1[var4])) {
                arg1[var3] = arg1[var4];
            } else {
                arg1[var3] = ' ';
            }
            if (var3 == 0 || arg1[var3] != ' ' || arg1[var3 - 1] != ' ') {
                var3++;
            }
        }
        for (int var5 = var3; var5 < arg1.length; var5++) {
            arg1[var5] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method400(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method401(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method399(0, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method409(var6, 6);
        method404(-20584, var6);
        method405(var6, (byte) -26);
        if (arg0 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        method418(var6, (byte) 53);
        for (int var9 = 0; var9 < field1226.length; var9++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field1226[var9], var12 + 1)) != -1) {
                char[] var13 = field1226[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method402(var6, var5.toCharArray(), -542);
        method403(var6, (byte) -47);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CI)V")
    private static final void method402(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method426(arg1[var3], true)) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method403(char[] arg0, byte arg1) {
        boolean var2 = true;
        if (arg1 != -47) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method423(-893, var4)) {
                var2 = true;
            } else if (var2) {
                if (method425(var4, -932)) {
                    var2 = false;
                }
            } else if (method426(var4, true)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)V")
    private static final void method404(int arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1221.length - 1; var3 >= 0; var3--) {
                method413(field1221[var3], arg1, field1222[var3], -959);
            }
        }
        if (field1213 != arg0) {
            field1212 = -111;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CB)V")
    private static final void method405(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != -26) {
            field1212 = -396;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(var3, var2, null, -959);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method413(var5, var4, null, -959);
        for (int var6 = field1223.length - 1; var6 >= 0; var6--) {
            method406(field1223[var6], var2, arg0, var4, -983);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method406(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        if (arg4 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method415(var13, arg0[var9], -18503, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method415(var13, arg0[var9 - 1], -18503, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method421(field1216, var12)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method407(0, arg2, var7, arg1);
                int var18 = method408(arg2, false, var8 - 1, arg3);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg2[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method407(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method421(field1216, arg1[var4]); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg0 != 0) {
            field1209 = !field1209;
        }
        for (int var6 = arg2 - 1; var6 >= 0 && method421(field1216, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method421(field1216, arg1[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZI[C)I")
    private static final int method408(char[] arg0, boolean arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method421(field1216, arg0[var4])) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1) {
                return 0;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg0.length && method421(field1216, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(field1216, arg0[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method409(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 6) {
            return;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method413(var3, var2, null, -959);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(var5, var4, null, -959);
        for (int var6 = 0; var6 < field1224.length; var6++) {
            method410(false, field1224[var6], var4, var2, arg0, field1225[var6]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C[C[C[CI)V")
    private static final void method410(boolean arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg1.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        if (arg0) {
            return;
        }
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
                    if (var9 < arg1.length && (var14 = method415(var13, arg1[var9], -18503, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method415(var13, arg1[var9 - 1], -18503, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method421(field1216, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method411(488, arg3, arg4, var7);
                int var18 = method412(field1214, var8 - 1, arg2, arg4);
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
                                if (method421(field1216, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421(field1216, arg4[var24])) {
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
                                    if (arg2[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg2[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method421(field1216, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421(field1216, arg4[var28])) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method411(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 <= 0) {
            return 3;
        } else if (arg3 == 0) {
            return 2;
        } else {
            int var4 = arg3 - 1;
            while (true) {
                if (var4 >= 0 && method421(field1216, arg2[var4])) {
                    if (arg2[var4] != ',' && arg2[var4] != '.') {
                        var4--;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg3 - 1; var6 >= 0 && method421(field1216, arg1[var6]); var6--) {
                    if (arg1[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method421(field1216, arg2[arg3 - 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C[C)I")
    private static final int method412(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method421(field1216, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != 0) {
                field1219 = !field1219;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method421(field1216, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method421(field1216, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[[BI)V")
    public static final void method413(char[] arg0, char[] arg1, byte[][] arg2, int arg3) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        if (arg3 >= 0) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg0.length && (var16 = method416(var15, arg0[var7], 987, var14)) > 0) {
                        if (var16 == 1 && method424(false, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(false, var14) || method424(false, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method416(var15, arg0[var7 - 1], 987, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method422(true, var14)) {
                                break label167;
                            }
                            if (method421(field1216, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(false, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label167;
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
                    if (var5 - 1 < 0 || method421(field1216, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method421(field1216, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421(field1216, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method421(field1216, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421(field1216, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427(9, var27)) {
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
                    byte var21 = method417(var19, 0);
                    byte var22 = method417(var20, 0);
                    if (arg2 != null && method414(var21, arg2, var22, -492)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(false, arg1[var33])) {
                            var30++;
                        } else if (method423(-893, arg1[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg1[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[[BBI)Z")
    private static final boolean method414(byte arg0, byte[][] arg1, byte arg2, int arg3) {
        int var4 = 0;
        while (arg3 >= 0) {
            field1213 = 209;
        }
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg0 && arg1[var6][1] == arg2) {
                return true;
            }
            if (arg0 < arg1[var6][0] || arg1[var6][0] == arg0 && arg2 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCIC)I")
    private static final int method415(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != -18503) {
            return field1211;
        } else if (arg1 == arg3) {
            return 1;
        } else if (arg1 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg3 == '(' && arg0 == ')') {
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CCIC)I")
    private static final int method416(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 <= 0) {
            return 1;
        } else if (arg1 == arg3) {
            return 1;
        } else {
            if (arg1 >= 'a' && arg1 <= 'm') {
                if (arg1 == 'a') {
                    if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                        if (arg3 == '/' && arg0 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'b') {
                    if (arg3 != '6' && arg3 != '8') {
                        if ((arg3 != '1' || arg0 != '3') && (arg3 != 'i' || arg0 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg1 == 'c') {
                    if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'd') {
                    if ((arg3 != '[' || arg0 != ')') && (arg3 != 'i' || arg0 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'e') {
                    if (arg3 != '3' && arg3 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'f') {
                    if (arg3 == 'p' && arg0 == 'h') {
                        return 2;
                    }
                    if (arg3 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'g') {
                    if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'h') {
                    if (arg3 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'i') {
                    if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
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
                    if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
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
                    if (arg3 != '0' && arg3 != '*') {
                        if ((arg3 != '(' || arg0 != ')') && (arg3 != '[' || arg0 != ']') && (arg3 != '{' || arg0 != '}') && (arg3 != '<' || arg0 != '>')) {
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
                    if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 't') {
                    if (arg3 != '7' && arg3 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'u') {
                    if (arg3 == 'v') {
                        return 1;
                    }
                    if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'v') {
                    if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'w') {
                    if (arg3 == 'v' && arg0 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'x') {
                    if ((arg3 != ')' || arg0 != '(') && (arg3 != '}' || arg0 != '{') && (arg3 != ']' || arg0 != '[') && (arg3 != '>' || arg0 != '<')) {
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
                    if (arg3 == 'o' || arg3 == 'O') {
                        return 1;
                    } else if ((arg3 != '(' || arg0 != ')') && (arg3 != '{' || arg0 != '}') && (arg3 != '[' || arg0 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg1 == '1') {
                    return arg3 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg1 == ',') {
                return arg3 == '.' ? 1 : 0;
            } else if (arg1 == '.') {
                return arg3 == ',' ? 1 : 0;
            } else if (arg1 == '!') {
                return arg3 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)B")
    private static final byte method417(char arg0, int arg1) {
        if (arg1 != 0) {
            field1219 = !field1219;
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

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CB)V")
    private static final void method418(char[] arg0, byte arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 != 53) {
            field1214 = -341;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method419((byte) 9, arg0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method421(field1216, arg0[var8]) && !method422(true, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method420(var6, arg0, 0);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[CI)I")
    private static final int method419(byte arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        if (field1215 == arg0) {
            boolean var4 = false;
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI)I")
    private static final int method420(int arg0, char[] arg1, int arg2) {
        if (arg2 < 0 || arg2 > 0) {
            field1209 = !field1209;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method421(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return !method423(-893, arg1) && !method424(false, arg1);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ZC)Z")
    private static final boolean method422(boolean arg0, char arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        while (arg0 >= 0) {
            field1214 = 116;
        }
        if ((arg1 < 'a' || arg1 > 'z') && (arg1 < 'A' || arg1 > 'Z')) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(ZC)Z")
    private static final boolean method424(boolean arg0, char arg1) {
        if (arg0) {
            field1219 = !field1219;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method425(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method426(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(I[C)Z")
    private static final boolean method427(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method424(false, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(arg1, field1218);
        int var5 = 0;
        int var6 = field1220.length - 1;
        if (arg0 < field1217 || arg0 > field1217) {
            throw new NullPointerException();
        } else if (field1220[var5] == var4 || field1220[var6] == var4) {
            return true;
        } else {
            do {
                int var7 = (var5 + var6) / 2;
                if (field1220[var7] == var4) {
                    return true;
                }
                if (var4 < field1220[var7]) {
                    var6 = var7;
                } else {
                    var5 = var7;
                }
            } while (var5 != var6 && var5 + 1 != var6);
            return false;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)I")
    public static final int method428(char[] arg0, int arg1) {
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
        if (arg1 <= 0) {
            field1218 = -415;
        }
        return var2;
    }
}
