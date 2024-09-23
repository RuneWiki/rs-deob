import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "d", descriptor = "Z")
    private static boolean field1217 = true;

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1218 = 2;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1219 = 2;

    @OriginalMember(owner = "sc", name = "h", descriptor = "B")
    private static byte field1221 = 7;

    @OriginalMember(owner = "sc", name = "i", descriptor = "B")
    private static byte field1222 = 121;

    @OriginalMember(owner = "sc", name = "j", descriptor = "B")
    private static byte field1223 = 16;

    @OriginalMember(owner = "sc", name = "k", descriptor = "Z")
    private static boolean field1224 = true;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1231 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1214;

    @OriginalMember(owner = "sc", name = "b", descriptor = "I")
    private static int field1215;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1220;

    @OriginalMember(owner = "sc", name = "s", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1216;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[I")
    private static int[] field1225;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[I")
    private static int[] field1230;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[C")
    private static char[][] field1226;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1228;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[C")
    private static char[][] field1229;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[[B")
    private static byte[][][] field1227;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method387(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method297("fragmentsenc.txt", null), 15787);
        Packet var2 = new Packet(arg0.method297("badenc.txt", null), 15787);
        Packet var3 = new Packet(arg0.method297("domainenc.txt", null), 15787);
        Packet var4 = new Packet(arg0.method297("tldlist.txt", null), 15787);
        method388(var1, var2, var3, var4);
        if (Linkable.field361) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method388(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method390(arg1, 5);
        method391(true, arg2);
        method392(arg0, (byte) -47);
        method389(field1218, arg3);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method389(int arg0, Packet arg1) {
        if (arg0 < field1219 || arg0 > field1219) {
            field1217 = !field1217;
        }
        int var2 = arg1.method232();
        field1229 = new char[var2][];
        field1230 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1230[var3] = arg1.method227();
            char[] var4 = new char[arg1.method227()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method227();
            }
            field1229[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method390(Packet arg0, int arg1) {
        int var2 = arg0.method232();
        field1226 = new char[var2][];
        field1227 = new byte[var2][][];
        method393(field1226, field1227, arg0, 4);
        if (arg1 < 5 || arg1 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZLlb;)V")
    private static final void method391(boolean arg0, Packet arg1) {
        int var2 = arg1.method232();
        field1228 = new char[var2][];
        method394(arg1, 961, field1228);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B)V")
    private static final void method392(Packet arg0, byte arg1) {
        field1225 = new int[arg0.method232()];
        for (int var2 = 0; var2 < field1225.length; var2++) {
            field1225[var2] = arg0.method229();
        }
        if (arg1 != -47) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[C[[[BLlb;I)V")
    private static final void method393(char[][] arg0, byte[][][] arg1, Packet arg2, int arg3) {
        if (arg3 < 4 || arg3 > 4) {
            field1217 = !field1217;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method227()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method227();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method227()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method227();
                var7[var8][1] = (byte) arg2.method227();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I[[C)V")
    private static final void method394(Packet arg0, int arg1, char[][] arg2) {
        int var3 = 75 / arg1;
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method227()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method227();
            }
            arg2[var4] = var5;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method395(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method396(arg0[var3], 898)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        int var4 = 19 / arg1;
        for (int var5 = var2; var5 < arg0.length; var5++) {
            arg0[var5] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method396(char arg0, int arg1) {
        int var2 = 56 / arg1;
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method397(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method395(var4, 448);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method405(var6, 5);
        method400((byte) 1, var6);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        method401(field1220, var6);
        method414(var6, -17411);
        for (int var8 = 0; var8 < field1231.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1231[var8], var11 + 1)) != -1) {
                char[] var12 = field1231[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method398(var5.toCharArray(), var6, true);
        method399(var6, (byte) -47);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CZ)V")
    private static final void method398(char[] arg0, char[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method422(false, arg0[var3])) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method399(char[] arg0, byte arg1) {
        if (arg1 != -47) {
            field1214 = 240;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method419(var4, 8)) {
                var2 = true;
            } else if (var2) {
                if (method421(var4, false)) {
                    var2 = false;
                }
            } else if (method422(false, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method400(byte arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1226.length - 1; var3 >= 0; var3--) {
                method409(arg1, field1226[var3], field1227[var3], 4);
            }
        }
        if (arg0 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method401(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0 != 0) {
            return;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method409(var2, var3, null, 4);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method409(var4, var5, null, 4);
        for (int var6 = field1228.length - 1; var6 >= 0; var6--) {
            method402(var2, arg1, var4, (byte) 3, field1228[var6]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CB[C)V")
    private static final void method402(char[] arg0, char[] arg1, char[] arg2, byte arg3, char[] arg4) {
        if (arg4.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        if (arg3 != 3) {
            return;
        }
        boolean var6 = false;
        int var10;
        for (int var7 = 0; var7 <= arg1.length - arg4.length; var7 += var10) {
            int var8 = var7;
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
                    if (var9 < arg4.length && (var14 = method411(var13, var12, (byte) -31, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method411(var13, var12, (byte) -31, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method417(var12, 0)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method403(4, arg0, var7, arg1);
                int var18 = method404(arg1, arg2, 0, var8 - 1);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg1[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method403(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method417(arg3[var4], 0); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg0 < 4 || arg0 > 4) {
            return 4;
        }
        for (int var6 = arg2 - 1; var6 >= 0 && method417(arg1[var6], 0); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method417(arg3[arg2 - 1], 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CII)I")
    private static final int method404(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return field1215;
        } else if (arg3 + 1 == arg0.length) {
            return 2;
        } else {
            int var4 = arg3 + 1;
            while (true) {
                if (var4 < arg0.length && method417(arg0[var4], 0)) {
                    if (arg0[var4] != '.' && arg0[var4] != ',') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg3 + 1; var6 < arg0.length && method417(arg1[var6], 0); var6++) {
                    if (arg1[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method417(arg0[arg3 + 1], 0)) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method405(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 < 5 || arg1 > 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        char[] var4 = new char[] { 'd', 'o', 't' };
        method409(var2, var4, null, 4);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method409(var5, var6, null, 4);
        for (int var7 = 0; var7 < field1229.length; var7++) {
            method406(field1230[var7], 947, arg0, field1229[var7], var5, var2);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C[C[C[C)V")
    private static final void method406(int arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg2.length - arg3.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label124: while (true) {
                while (true) {
                    if (var9 >= arg2.length) {
                        break label124;
                    }
                    boolean var12 = false;
                    char var13 = arg2[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg2.length) {
                        var14 = arg2[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg3.length && (var15 = method411(var14, var13, (byte) -31, arg3[var10])) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label124;
                        }
                        int var16;
                        if ((var16 = method411(var14, var13, (byte) -31, arg3[var10 - 1])) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg3.length || !method417(var13, 0)) {
                                break label124;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg3.length) {
                boolean var17 = false;
                int var18 = method407(var7, arg2, true, arg5);
                int var19 = method408(arg4, arg2, (byte) -34, var9 - 1);
                if (arg0 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg0 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg0 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg0 == 3 && var18 > 2 && var19 > 0) {
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
                                if (method417(arg2[var25], 0)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method417(arg2[var25], 0)) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg2.length; var27++) {
                                if (var26) {
                                    if (arg4[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg4[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg2.length; var29++) {
                            if (var28) {
                                if (method417(arg2[var29], 0)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method417(arg2[var29], 0)) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg2[var30] = '*';
                    }
                }
            }
        }
        int var8 = 64 / arg1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CZ[C)I")
    private static final int method407(int arg0, char[] arg1, boolean arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method417(arg1[var4], 0)) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method417(arg3[var6], 0); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (!arg2) {
                return field1215;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method417(arg1[arg0 - 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CBI)I")
    private static final int method408(char[] arg0, char[] arg1, byte arg2, int arg3) {
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method417(arg1[var4], 0)) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && method417(arg0[var6], 0); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (arg2 != -34) {
                return field1219;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method417(arg1[arg3 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[[BI)V")
    public static final void method409(char[] arg0, char[] arg1, byte[][] arg2, int arg3) {
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label176: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label176;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method412((byte) 9, var14, var15, arg1[var7])) > 0) {
                        if (var16 == 1 && method420(0, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method420(0, var14) || method420(0, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label176;
                        }
                        int var17;
                        if ((var17 = method412((byte) 9, var14, var15, arg1[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method418(var14, 40411)) {
                                break label176;
                            }
                            if (method417(var14, 0) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method420(0, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label176;
                            }
                        }
                    }
                }
            }
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method417(arg0[var5 - 1], 0) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method417(arg0[var6], 0) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method417(arg0[var26], 0) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method417(arg0[var26 + var28], 0) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method417(arg0[var26 - 1], 0) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method423(var27, 0)) {
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
                        var19 = arg0[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg0.length) {
                        var20 = arg0[var6];
                    }
                    byte var21 = method413(-379, var19);
                    byte var22 = method413(-379, var20);
                    if (arg2 != null && method410(var22, field1221, var21, arg2)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method420(0, arg0[var33])) {
                            var30++;
                        } else if (method419(arg0[var33], 8)) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg0[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
        if (arg3 < 4 || arg3 > 4) {
            field1216 = !field1216;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BBB[[B)Z")
    private static final boolean method410(byte arg0, byte arg1, byte arg2, byte[][] arg3) {
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg3[var4][0] == arg2 && arg3[var4][1] == arg0) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg3[var5][0] == arg2 && arg3[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg3[var6][0] == arg2 && arg3[var6][1] == arg0) {
                return true;
            }
            if (arg2 < arg3[var6][0] || arg3[var6][0] == arg2 && arg0 < arg3[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCBC)I")
    private static final int method411(char arg0, char arg1, byte arg2, char arg3) {
        if (arg2 != -31) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BCCC)I")
    private static final int method412(byte arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 9) {
            return 2;
        }
        boolean var4 = false;
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
    private static final byte method413(int arg0, char arg1) {
        if (arg0 >= 0) {
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

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)V")
    private static final void method414(char[] arg0, int arg1) {
        boolean var2 = false;
        if (arg1 != -17411) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method415(-365, var3, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method417(arg0[var8], 0) && !method418(arg0[var8], 40411)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method416(arg0, var6, false);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C)I")
    private static final int method415(int arg0, int arg1, char[] arg2) {
        if (arg0 >= 0) {
            field1217 = !field1217;
        }
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CIZ)I")
    private static final int method416(char[] arg0, int arg1, boolean arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2) {
                return field1219;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method417(char arg0, int arg1) {
        if (arg1 != 0) {
            field1214 = 186;
        }
        return !method419(arg0, 8) && !method420(0, arg0);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CI)Z")
    private static final boolean method418(char arg0, int arg1) {
        if (arg1 != 40411) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(CI)Z")
    private static final boolean method419(char arg0, int arg1) {
        if (arg1 != 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method420(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method421(char arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method422(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "([CI)Z")
    private static final boolean method423(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method420(0, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2) {
            return true;
        }
        int var5 = method424(arg0, (byte) 122);
        int var6 = 0;
        int var7 = field1225.length - 1;
        if (field1225[var6] == var5 || field1225[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1225[var8] == var5) {
                return true;
            }
            if (var5 < field1225[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CB)I")
    public static final int method424(char[] arg0, byte arg1) {
        if (arg1 != 122) {
            field1217 = !field1217;
        }
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
        return var2;
    }
}
