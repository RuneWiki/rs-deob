import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1206 = -867;

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1208 = true;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1209 = 26254;

    @OriginalMember(owner = "sc", name = "e", descriptor = "B")
    private static byte field1210 = 5;

    @OriginalMember(owner = "sc", name = "f", descriptor = "B")
    private static byte field1211 = 3;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1213 = 533;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1221 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1212;

    @OriginalMember(owner = "sc", name = "q", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1207;

    @OriginalMember(owner = "sc", name = "i", descriptor = "Z")
    private static boolean field1214;

    @OriginalMember(owner = "sc", name = "j", descriptor = "[I")
    private static int[] field1215;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[I")
    private static int[] field1220;

    @OriginalMember(owner = "sc", name = "k", descriptor = "[[C")
    private static char[][] field1216;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[C")
    private static char[][] field1218;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[C")
    private static char[][] field1219;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[[[B")
    private static byte[][][] field1217;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(-49365, arg0.method299("fragmentsenc.txt", null));
        Packet var2 = new Packet(-49365, arg0.method299("badenc.txt", null));
        Packet var3 = new Packet(-49365, arg0.method299("domainenc.txt", null));
        Packet var4 = new Packet(-49365, arg0.method299("tldlist.txt", null));
        method392(var1, var2, var3, var4);
        if (Linkable.field367) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(-751, arg1);
        method395(26254, arg2);
        method396(arg0, 7);
        method393(arg3, -370);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method393(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        field1219 = new char[var2][];
        field1220 = new int[var2];
        while (arg1 >= 0) {
            field1212 = 212;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field1220[var3] = arg0.method229();
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            field1219[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method394(int arg0, Packet arg1) {
        int var2 = arg1.method234();
        field1216 = new char[var2][];
        if (arg0 < 0) {
            field1217 = new byte[var2][][];
            method397(field1217, field1216, (byte) 5, arg1);
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILlb;)V")
    private static final void method395(int arg0, Packet arg1) {
        int var2 = arg1.method234();
        field1218 = new char[var2][];
        method398(arg1, 3, field1218);
        if (field1209 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Llb;I)V")
    private static final void method396(Packet arg0, int arg1) {
        if (arg1 == 7) {
            field1215 = new int[arg0.method234()];
            for (int var2 = 0; var2 < field1215.length; var2++) {
                field1215[var2] = arg0.method231();
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[[B[[CBLlb;)V")
    private static final void method397(byte[][][] arg0, char[][] arg1, byte arg2, Packet arg3) {
        if (field1210 == arg2) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            char[] var7 = new char[arg3.method229()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = (char) arg3.method229();
            }
            arg1[var6] = var7;
            byte[][] var9 = new byte[arg3.method229()][2];
            for (int var10 = 0; var10 < var9.length; var10++) {
                var9[var10][0] = (byte) arg3.method229();
                var9[var10][1] = (byte) arg3.method229();
            }
            if (var9.length > 0) {
                arg0[var6] = var9;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I[[C)V")
    private static final void method398(Packet arg0, int arg1, char[][] arg2) {
        if (arg1 < 3 || arg1 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method229();
            }
            arg2[var4] = var5;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method399(int arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method400(arg1[var3], -391)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var4 = var2; var4 < arg1.length; var4++) {
            arg1[var4] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method400(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method401(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method399(-176, var4);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method409(var6, -824);
        method404(true, var6);
        method405(var6, true);
        method418(192, var6);
        for (int var8 = 0; var8 < field1221.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1221[var8], var11 + 1)) != -1) {
                char[] var12 = field1221[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method402((byte) 111, var5.toCharArray(), var6);
        method403((byte) 110, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C[C)V")
    private static final void method402(byte arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg2[var3] != '*' && method426((byte) -22, arg1[var3])) {
                arg2[var3] = arg1[var3];
            }
        }
        if (arg0 != 111) {
            field1209 = -143;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method403(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 != 110) {
            field1214 = !field1214;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method423(field1213, var4)) {
                var2 = true;
            } else if (var2) {
                if (method425((byte) 3, var4)) {
                    var2 = false;
                }
            } else if (method426((byte) -22, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C)V")
    private static final void method404(boolean arg0, char[] arg1) {
        if (!arg0) {
            field1206 = -187;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1216.length - 1; var3 >= 0; var3--) {
                method413(arg1, 0, field1216[var3], field1217[var3]);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method405(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(var2, 0, var3, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method413(var4, 0, var5, null);
        if (!arg1) {
            field1209 = 184;
        }
        for (int var6 = field1218.length - 1; var6 >= 0; var6--) {
            method406(field1218[var6], arg0, var4, var2, -820);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method406(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        label88: while (true) {
            if (arg4 >= 0) {
                int var19 = 1;
                while (true) {
                    if (var19 <= 0) {
                        continue label88;
                    }
                    var19++;
                }
            }
            if (arg0.length > arg1.length) {
                return;
            }
            boolean var5 = true;
            int var9;
            for (int var6 = 0; var6 <= arg1.length - arg0.length; var6 += var9) {
                int var7 = var6;
                int var8 = 0;
                var9 = 1;
                label68: while (true) {
                    while (true) {
                        if (var7 >= arg1.length) {
                            break label68;
                        }
                        boolean var10 = false;
                        char var11 = arg1[var7];
                        char var12 = 0;
                        if (var7 + 1 < arg1.length) {
                            var12 = arg1[var7 + 1];
                        }
                        int var13;
                        if (var8 < arg0.length && (var13 = method415(var11, var12, (byte) 3, arg0[var8])) > 0) {
                            var7 += var13;
                            var8++;
                        } else {
                            if (var8 == 0) {
                                break label68;
                            }
                            int var14;
                            if ((var14 = method415(var11, var12, (byte) 3, arg0[var8 - 1])) > 0) {
                                var7 += var14;
                                if (var8 == 1) {
                                    var9++;
                                }
                            } else {
                                if (var8 >= arg0.length || !method421(var11, field1212)) {
                                    break label68;
                                }
                                var7++;
                            }
                        }
                    }
                }
                if (var8 >= arg0.length) {
                    boolean var15 = false;
                    int var16 = method407(arg3, var6, false, arg1);
                    int var17 = method408(var7 - 1, (byte) -37, arg2, arg1);
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
            return;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CIZ[C)I")
    private static final int method407(char[] arg0, int arg1, boolean arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method421(arg3[var4], field1212); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method421(arg0[var7], field1212); var7--) {
            if (arg0[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method421(arg3[arg1 - 1], field1212)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IB[C[C)I")
    private static final int method408(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method421(arg3[var4], field1212)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != -37) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg0 + 1; var7 < arg3.length && method421(arg2[var7], field1212); var7++) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method421(arg3[arg0 + 1], field1212)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method409(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        while (arg1 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method413(var2, 0, var3, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(var4, 0, var5, null);
        for (int var6 = 0; var6 < field1219.length; var6++) {
            method410(var2, var4, field1219[var6], field1220[var6], 9, arg0);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CII[C)V")
    private static final void method410(char[] arg0, char[] arg1, char[] arg2, int arg3, int arg4, char[] arg5) {
        if (arg2.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        if (arg4 < 9 || arg4 > 9) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg2.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label127: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label127;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg2.length && (var14 = method415(var12, var13, (byte) 3, arg2[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label127;
                        }
                        int var15;
                        if ((var15 = method415(var12, var13, (byte) 3, arg2[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg2.length || !method421(var12, field1212)) {
                                break label127;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg2.length) {
                boolean var16 = false;
                int var17 = method411(arg5, 143, arg0, var7);
                int var18 = method412(arg1, arg5, var8 - 1, (byte) 2);
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
                                    if (arg0[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg0[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method421(arg5[var24], field1212)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421(arg5[var24], field1212)) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg5.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method421(arg5[var28], field1212)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421(arg5[var28], field1212)) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg5[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[CI)I")
    private static final int method411(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method421(arg0[var4], field1212)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            int var6 = 40 / arg1;
            for (int var7 = arg3 - 1; var7 >= 0 && method421(arg2[var7], field1212); var7--) {
                if (arg2[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(arg0[arg3 - 1], field1212)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CIB)I")
    private static final int method412(char[] arg0, char[] arg1, int arg2, byte arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method421(arg1[var4], field1212)) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 == 2) {
                boolean var6 = false;
            } else {
                field1214 = !field1214;
            }
            for (int var7 = arg2 + 1; var7 < arg1.length && method421(arg0[var7], field1212); var7++) {
                if (arg0[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method421(arg1[arg2 + 1], field1212)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C[[B)V")
    public static final void method413(char[] arg0, int arg1, char[] arg2, byte[][] arg3) {
        if (arg2.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg2.length; var5 += var9) {
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
                    if (var7 < arg2.length && (var16 = method416(var15, 9, arg2[var7], var14)) > 0) {
                        if (var16 == 1 && method424(var14, (byte) 90)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(var14, (byte) 90) || method424(var15, (byte) 90))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label176;
                        }
                        int var17;
                        if ((var17 = method416(var15, 9, arg2[var7 - 1], var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method422(var14, 0)) {
                                break label176;
                            }
                            if (method421(var14, field1212) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(var14, (byte) 90)) {
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
            if (var7 >= arg2.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method421(arg0[var5 - 1], field1212) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method421(arg0[var6], field1212) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421(arg0[var26], field1212) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method421(arg0[var26 + var28], field1212) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421(arg0[var26 - 1], field1212) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427(var27, true)) {
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
                    byte var21 = method417(var19, -6728);
                    byte var22 = method417(var20, -6728);
                    if (arg3 != null && method414(var21, false, arg3, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(arg0[var33], (byte) 90)) {
                            var30++;
                        } else if (method423(field1213, arg0[var33])) {
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
        if (arg1 < 0 || arg1 > 0) {
            field1208 = !field1208;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BZ[[BB)Z")
    private static final boolean method414(byte arg0, boolean arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg0 && arg2[var6][1] == arg3) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg2[var7][0] == arg0 && arg2[var7][1] == arg3) {
                return true;
            }
            if (arg0 < arg2[var7][0] || arg2[var7][0] == arg0 && arg3 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCBC)I")
    private static final int method415(char arg0, char arg1, byte arg2, char arg3) {
        if (field1211 != arg2) {
            field1212 = 198;
        }
        if (arg0 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg0 == '(' && arg1 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg3 == 's' && arg0 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CICC)I")
    private static final int method416(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 9) {
            field1208 = !field1208;
        }
        if (arg2 == arg3) {
            return 1;
        }
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
                    if (arg3 == '(' && arg0 == ')' || arg3 == '[' && arg0 == ']' || arg3 == '{' && arg0 == '}' || arg3 == '<' && arg0 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg3 == '\\' && arg0 == '/' || arg3 == '\\' && arg0 == '|' || arg3 == '|' && arg0 == '/') {
                    return 2;
                }
                return 0;
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)B")
    private static final byte method417(char arg0, int arg1) {
        if (arg1 != -6728) {
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)V")
    private static final void method418(int arg0, char[] arg1) {
        int var2 = 0 / arg0;
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method419(0, arg1, var4)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method421(arg1[var9], field1212) && !method422(arg1[var9], 0)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method420(42584, var7, arg1);
                int var10 = 0;
                for (int var11 = var7; var11 < var4; var11++) {
                    var10 = var10 * 10 + arg1[var11] - 48;
                }
                if (var10 <= 255 && var4 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var4; var12++) {
                arg1[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI)I")
    private static final int method419(int arg0, char[] arg1, int arg2) {
        if (arg0 != 0) {
            return 3;
        }
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C)I")
    private static final int method420(int arg0, int arg1, char[] arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != 42584) {
                return 3;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CI)Z")
    private static final boolean method421(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return !method423(field1213, arg0) && !method424(arg0, (byte) 90);
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(CI)Z")
    private static final boolean method422(char arg0, int arg1) {
        if (arg1 != 0) {
            field1208 = !field1208;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1206 = -85;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)Z")
    private static final boolean method424(char arg0, byte arg1) {
        if (arg1 != 90) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method425(byte arg0, char arg1) {
        if (arg0 == 3) {
            boolean var2 = false;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(BC)Z")
    private static final boolean method426(byte arg0, char arg1) {
        if (arg0 != -22) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CZ)Z")
    private static final boolean method427(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method424(arg0[var3], (byte) 90) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(false, arg0);
        if (!arg1) {
            throw new NullPointerException();
        }
        int var5 = 0;
        int var6 = field1215.length - 1;
        if (field1215[var5] == var4 || field1215[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1215[var7] == var4) {
                return true;
            }
            if (var4 < field1215[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Z[C)I")
    public static final int method428(boolean arg0, char[] arg1) {
        if (arg0) {
            return 4;
        } else if (arg1.length > 6) {
            return 0;
        } else {
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
            return var2;
        }
    }
}
