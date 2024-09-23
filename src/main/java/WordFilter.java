import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1209 = true;

    @OriginalMember(owner = "sc", name = "e", descriptor = "B")
    private static byte field1211 = 9;

    @OriginalMember(owner = "sc", name = "f", descriptor = "B")
    private static byte field1212 = 6;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1213 = -38390;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1215 = -1;

    @OriginalMember(owner = "sc", name = "j", descriptor = "I")
    private static int field1216 = 3;

    @OriginalMember(owner = "sc", name = "k", descriptor = "B")
    private static byte field1217 = 5;

    @OriginalMember(owner = "sc", name = "m", descriptor = "I")
    private static int field1219 = -76;

    @OriginalMember(owner = "sc", name = "n", descriptor = "I")
    private static int field1220 = 8;

    @OriginalMember(owner = "sc", name = "o", descriptor = "B")
    private static byte field1221 = -47;

    @OriginalMember(owner = "sc", name = "p", descriptor = "I")
    private static int field1222 = 38;

    @OriginalMember(owner = "sc", name = "w", descriptor = "[Ljava/lang/String;")
    private static final String[] field1229 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "b", descriptor = "I")
    private static int field1208;

    @OriginalMember(owner = "sc", name = "x", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "sc", name = "a", descriptor = "Z")
    private static boolean field1207;

    @OriginalMember(owner = "sc", name = "d", descriptor = "Z")
    private static boolean field1210;

    @OriginalMember(owner = "sc", name = "h", descriptor = "Z")
    private static boolean field1214;

    @OriginalMember(owner = "sc", name = "l", descriptor = "Z")
    private static boolean field1218;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[I")
    private static int[] field1223;

    @OriginalMember(owner = "sc", name = "v", descriptor = "[I")
    private static int[] field1228;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[[C")
    private static char[][] field1224;

    @OriginalMember(owner = "sc", name = "t", descriptor = "[[C")
    private static char[][] field1226;

    @OriginalMember(owner = "sc", name = "u", descriptor = "[[C")
    private static char[][] field1227;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[[[B")
    private static byte[][][] field1225;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method299("fragmentsenc.txt", null), field1207);
        Packet var2 = new Packet(arg0.method299("badenc.txt", null), field1207);
        Packet var3 = new Packet(arg0.method299("domainenc.txt", null), field1207);
        Packet var4 = new Packet(arg0.method299("tldlist.txt", null), field1207);
        method392(var1, var2, var3, var4);
        if (Linkable.field368) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(0, arg1);
        method395((byte) 6, arg2);
        method396(arg0, 390);
        method393((byte) 9, arg3);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLlb;)V")
    private static final void method393(byte arg0, Packet arg1) {
        int var2 = arg1.method234();
        if (field1211 != arg0) {
            return;
        }
        boolean var3 = false;
        field1227 = new char[var2][];
        field1228 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1228[var4] = arg1.method229();
            char[] var5 = new char[arg1.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method229();
            }
            field1227[var4] = var5;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method394(int arg0, Packet arg1) {
        int var2 = arg1.method234();
        field1224 = new char[var2][];
        field1225 = new byte[var2][][];
        if (arg0 != 0) {
            field1207 = !field1207;
        }
        method397(field1224, field1213, arg1, field1225);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(BLlb;)V")
    private static final void method395(byte arg0, Packet arg1) {
        int var2 = arg1.method234();
        if (field1212 == arg0) {
            field1226 = new char[var2][];
            method398(arg1, true, field1226);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method396(Packet arg0, int arg1) {
        field1223 = new int[arg0.method234()];
        for (int var2 = 0; var2 < field1223.length; var2++) {
            field1223[var2] = arg0.method231();
        }
        int var3 = 48 / arg1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[CILlb;[[[B)V")
    private static final void method397(char[][] arg0, int arg1, Packet arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method229();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method229()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method229();
                var7[var8][1] = (byte) arg2.method229();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg1 == -38390) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z[[C)V")
    private static final void method398(Packet arg0, boolean arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            arg2[var3] = var4;
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method399(int arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method400(arg1[var4], -817)) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method400(char arg0, int arg1) {
        if (arg1 >= 0) {
            field1210 = !field1210;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method401(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method399(433, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        method409(var6, 526);
        method404(var6, 24465);
        method405((byte) 3, var6);
        method418(false, var6);
        for (int var8 = 0; var8 < field1229.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1229[var8], var11 + 1)) != -1) {
                char[] var12 = field1229[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method402(false, var6, var5.toCharArray());
        method403(field1215, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C[C)V")
    private static final void method402(boolean arg0, char[] arg1, char[] arg2) {
        if (arg0) {
            field1213 = -248;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method426(true, arg2[var3])) {
                arg1[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)V")
    private static final void method403(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method423(true, var4)) {
                var2 = true;
            } else if (var2) {
                if (method425(var4, false)) {
                    var2 = false;
                }
            } else if (method426(true, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method404(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1224.length - 1; var3 >= 0; var3--) {
                method413(field1224[var3], field1225[var3], true, arg0);
            }
        }
        if (arg1 == 24465) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method405(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0 != 3) {
            field1207 = !field1207;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(var3, null, true, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method413(var5, null, true, var4);
        for (int var6 = field1226.length - 1; var6 >= 0; var6--) {
            method406(6, field1226[var6], arg1, var2, var4);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method406(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0 < 6 || arg0 > 6 || arg1.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg1.length; var6 += var9) {
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
                    if (var8 < arg1.length && (var13 = method415(var11, 761, arg1[var8], var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method415(var11, 761, arg1[var8 - 1], var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method421(var11, 8)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method407(var6, 0, arg2, arg3);
                int var17 = method408(var7 - 1, arg4, arg2, (byte) -60);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C[C)I")
    private static final int method407(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method421(arg2[var4], 8); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg1 != 0) {
            field1214 = !field1214;
        }
        for (int var6 = arg0 - 1; var6 >= 0 && method421(arg3[var6], 8); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method421(arg2[arg0 - 1], 8)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method408(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method421(arg2[var4], 8)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != -60) {
                field1214 = !field1214;
            }
            for (int var6 = arg0 + 1; var6 < arg2.length && method421(arg1[var6], 8); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(arg2[arg0 + 1], 8)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method409(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method413(var3, null, true, var2);
        int var4 = 41 / arg1;
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(var6, null, true, var5);
        for (int var7 = 0; var7 < field1227.length; var7++) {
            method410(var5, var2, field1228[var7], arg0, -6330, field1227[var7]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CI[CI[C)V")
    private static final void method410(char[] arg0, char[] arg1, int arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg3.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg3[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg3.length) {
                        var13 = arg3[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method415(var12, 761, arg5[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method415(var12, 761, arg5[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method421(var12, 8)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method411(arg3, arg1, field1216, var7);
                int var18 = method412(field1217, var8 - 1, arg3, arg0);
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
                                    if (arg1[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg1[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method421(arg3[var24], 8)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421(arg3[var24], 8)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg3.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg3.length; var28++) {
                            if (var27) {
                                if (method421(arg3[var28], 8)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421(arg3[var28], 8)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg3[var29] = '*';
                    }
                }
            }
        }
        if (arg4 != -6330) {
            field1214 = !field1214;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CII)I")
    private static final int method411(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method421(arg0[var4], 8)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 < 3 || arg2 > 3) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg3 - 1; var7 >= 0 && method421(arg1[var7], 8); var7--) {
                if (arg1[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(arg0[arg3 - 1], 8)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BI[C[C)I")
    private static final int method412(byte arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method421(arg2[var4], 8)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg0 != 5) {
                field1208 = 286;
            }
            for (int var6 = arg1 + 1; var6 < arg2.length && method421(arg3[var6], 8); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method421(arg2[arg1 + 1], 8)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[[BZ[C)V")
    public static final void method413(char[] arg0, byte[][] arg1, boolean arg2, char[] arg3) {
        if (arg0.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        if (!arg2) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg0.length && (var16 = method416(var14, arg0[var7], var15, (byte) 30)) > 0) {
                        if (var16 == 1 && method424(var14, (byte) -47)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(var14, (byte) -47) || method424(var15, (byte) -47))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method416(var14, arg0[var7 - 1], var15, (byte) 30)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method422((byte) -42, var14)) {
                                break label167;
                            }
                            if (method421(var14, 8) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(var14, (byte) -47)) {
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
                    if (var5 - 1 < 0 || method421(arg3[var5 - 1], 8) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method421(arg3[var6], 8) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421(arg3[var26], 8) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method421(arg3[var26 + var28], 8) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421(arg3[var26 - 1], 8) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427(field1222, var27)) {
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
                    byte var21 = method417(6, var19);
                    byte var22 = method417(6, var20);
                    if (arg1 != null && method414(714, var21, arg1, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(arg3[var33], (byte) -47)) {
                            var30++;
                        } else if (method423(true, arg3[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg3[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IB[[BB)Z")
    private static final boolean method414(int arg0, byte arg1, byte[][] arg2, byte arg3) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg2[var4][0] == arg1 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg1 && arg2[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg1 && arg2[var6][1] == arg3) {
                return true;
            }
            if (arg1 < arg2[var6][0] || arg2[var6][0] == arg1 && arg3 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CICC)I")
    private static final int method415(char arg0, int arg1, char arg2, char arg3) {
        int var4 = 62 / arg1;
        if (arg0 == arg2) {
            return 1;
        } else if (arg2 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg0 == '(' && arg3 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg2 == 's' && arg0 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCB)I")
    private static final int method416(char arg0, char arg1, char arg2, byte arg3) {
        if (arg3 != 30) {
            return field1213;
        } else if (arg0 == arg1) {
            return 1;
        } else {
            if (arg1 >= 'a' && arg1 <= 'm') {
                if (arg1 == 'a') {
                    if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                        if (arg0 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'b') {
                    if (arg0 != '6' && arg0 != '8') {
                        if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg1 == 'c') {
                    if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'd') {
                    if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'e') {
                    if (arg0 != '3' && arg0 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'f') {
                    if (arg0 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg0 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'g') {
                    if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'h') {
                    if (arg0 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'i') {
                    if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                    if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                    if (arg0 != '0' && arg0 != '*') {
                        if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
                    if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 't') {
                    if (arg0 != '7' && arg0 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'u') {
                    if (arg0 == 'v') {
                        return 1;
                    }
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'v') {
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'w') {
                    if (arg0 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'x') {
                    if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
                    if (arg0 == 'o' || arg0 == 'O') {
                        return 1;
                    } else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg1 == '1') {
                    return arg0 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg1 == ',') {
                return arg0 == '.' ? 1 : 0;
            } else if (arg1 == '.') {
                return arg0 == ',' ? 1 : 0;
            } else if (arg1 == '!') {
                return arg0 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)B")
    private static final byte method417(int arg0, char arg1) {
        if (arg0 != 6) {
            field1216 = 0;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return (byte) (arg1 + 1 - 'a');
        } else if (arg1 == '\'') {
            return 28;
        } else if (arg1 >= '0' && arg1 <= '9') {
            return (byte) (arg1 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C)V")
    private static final void method418(boolean arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0) {
            return;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method419(arg1, (byte) 38, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method421(arg1[var8], 8) && !method422((byte) -42, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method420(arg1, -76, var6);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CBI)I")
    private static final int method419(char[] arg0, byte arg1, int arg2) {
        if (arg1 != 38) {
            field1213 = 442;
        }
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII)I")
    private static final int method420(char[] arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = arg2;
        while (true) {
            if (var4 < arg0.length && var4 >= 0) {
                if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method421(char arg0, int arg1) {
        if (field1220 != arg1) {
            throw new NullPointerException();
        }
        return !method423(true, arg0) && !method424(arg0, (byte) -47);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method422(byte arg0, char arg1) {
        if (arg0 != -42) {
            field1210 = !field1210;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method423(boolean arg0, char arg1) {
        if (!arg0) {
            field1218 = !field1218;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)Z")
    private static final boolean method424(char arg0, byte arg1) {
        if (field1221 != arg1) {
            field1209 = !field1209;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method425(char arg0, boolean arg1) {
        if (arg1) {
            field1207 = !field1207;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ZC)Z")
    private static final boolean method426(boolean arg0, char arg1) {
        if (!arg0) {
            field1215 = -215;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(I[C)Z")
    private static final boolean method427(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method424(arg1[var3], (byte) -47) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(arg1, (byte) 2);
        int var5 = 0;
        int var6 = field1223.length - 1;
        int var7 = 26 / arg0;
        if (field1223[var5] == var4 || field1223[var6] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var6) / 2;
            if (field1223[var8] == var4) {
                return true;
            }
            if (var4 < field1223[var8]) {
                var6 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)I")
    public static final int method428(char[] arg0, byte arg1) {
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
        if (arg1 != 2) {
            field1210 = !field1210;
        }
        return var2;
    }
}
