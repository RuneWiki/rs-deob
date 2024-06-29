import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OWMPGCSS")
public class class40 {

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "Z")
    private static boolean field1220 = true;

    @OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "Z")
    private static boolean field1221 = true;

    @OriginalMember(owner = "client!OWMPGCSS", name = "e", descriptor = "I")
    private static int field1223 = 15655;

    @OriginalMember(owner = "client!OWMPGCSS", name = "g", descriptor = "I")
    private static int field1225 = 203;

    @OriginalMember(owner = "client!OWMPGCSS", name = "h", descriptor = "Z")
    private static boolean field1226 = true;

    @OriginalMember(owner = "client!OWMPGCSS", name = "i", descriptor = "I")
    private static int field1227 = -792;

    @OriginalMember(owner = "client!OWMPGCSS", name = "j", descriptor = "I")
    private static int field1228 = 420;

    @OriginalMember(owner = "client!OWMPGCSS", name = "k", descriptor = "I")
    private static int field1229 = 4;

    @OriginalMember(owner = "client!OWMPGCSS", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1236 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!OWMPGCSS", name = "f", descriptor = "I")
    private static int field1224;

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "Z")
    private static boolean field1219;

    @OriginalMember(owner = "client!OWMPGCSS", name = "d", descriptor = "Z")
    private static boolean field1222;

    @OriginalMember(owner = "client!OWMPGCSS", name = "s", descriptor = "Z")
    public static boolean field1237;

    @OriginalMember(owner = "client!OWMPGCSS", name = "l", descriptor = "[I")
    private static int[] field1230;

    @OriginalMember(owner = "client!OWMPGCSS", name = "q", descriptor = "[I")
    private static int[] field1235;

    @OriginalMember(owner = "client!OWMPGCSS", name = "m", descriptor = "[[C")
    private static char[][] field1231;

    @OriginalMember(owner = "client!OWMPGCSS", name = "o", descriptor = "[[C")
    private static char[][] field1233;

    @OriginalMember(owner = "client!OWMPGCSS", name = "p", descriptor = "[[C")
    private static char[][] field1234;

    @OriginalMember(owner = "client!OWMPGCSS", name = "n", descriptor = "[[[B")
    private static byte[][][] field1232;

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(LSXKKBWPU;)V")
    public static final void method367(class50 arg0) {
        class53 var1 = new class53(arg0.method442("fragmentsenc.txt", null), -631);
        class53 var2 = new class53(arg0.method442("badenc.txt", null), -631);
        class53 var3 = new class53(arg0.method442("domainenc.txt", null), -631);
        class53 var4 = new class53(arg0.method442("tldlist.txt", null), -631);
        method368(var1, var2, var3, var4);
        if (class27.field954) {
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(LTQYMAXSO;LTQYMAXSO;LTQYMAXSO;LTQYMAXSO;)V")
    private static final void method368(class53 arg0, class53 arg1, class53 arg2, class53 arg3) {
        method370(arg1, false);
        method371(arg2, 3);
        method372(346, arg0);
        method369(arg3, 15655);
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(LTQYMAXSO;I)V")
    private static final void method369(class53 arg0, int arg1) {
        int var2 = arg0.method473();
        field1234 = new char[var2][];
        field1235 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1235[var3] = arg0.method468();
            char[] var4 = new char[arg0.method468()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method468();
            }
            field1234[var3] = var4;
        }
        if (field1223 != arg1) {
            field1222 = !field1222;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(LTQYMAXSO;Z)V")
    private static final void method370(class53 arg0, boolean arg1) {
        int var2 = arg0.method473();
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1231 = new char[var2][];
        field1232 = new byte[var2][][];
        method373(0, arg0, field1232, field1231);
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(LTQYMAXSO;I)V")
    private static final void method371(class53 arg0, int arg1) {
        if (arg1 >= 3 && arg1 <= 3) {
            int var2 = arg0.method473();
            field1233 = new char[var2][];
            method374(field1233, arg0, true);
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(ILTQYMAXSO;)V")
    private static final void method372(int arg0, class53 arg1) {
        field1230 = new int[arg1.method473()];
        for (int var2 = 0; var2 < field1230.length; var2++) {
            field1230[var2] = arg1.method470();
        }
        int var3 = 59 / arg0;
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(ILTQYMAXSO;[[[B[[C)V")
    private static final void method373(int arg0, class53 arg1, byte[][][] arg2, char[][] arg3) {
        if (arg0 != 0) {
            field1219 = !field1219;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method468()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method468();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method468()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method468();
                var7[var8][1] = (byte) arg1.method468();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([[CLTQYMAXSO;Z)V")
    private static final void method374(char[][] arg0, class53 arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method468()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method468();
            }
            arg0[var3] = var4;
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Z[C)V")
    private static final void method375(boolean arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method376(arg1[var3], 0)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg0) {
            field1229 = -421;
        }
        for (int var4 = var2; var4 < arg1.length; var4++) {
            arg1[var4] = ' ';
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(CI)Z")
    private static final boolean method376(char arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method377(String arg0, byte arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method375(false, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method385(var6, 5263);
        method380(var6, false);
        if (arg1 != 0) {
            field1223 = 396;
        }
        method381(var6, false);
        method394(0, var6);
        for (int var8 = 0; var8 < field1236.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1236[var8], var11 + 1)) != -1) {
                char[] var12 = field1236[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method378(true, var5.toCharArray(), var6);
        method379(var6, 0);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(Z[C[C)V")
    private static final void method378(boolean arg0, char[] arg1, char[] arg2) {
        if (!arg0) {
            field1229 = -283;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg2[var3] != '*' && method402(arg1[var3], field1227)) {
                arg2[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([CI)V")
    private static final void method379(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 != 0) {
            field1220 = !field1220;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method399(0, var4)) {
                var2 = true;
            } else if (var2) {
                if (method401(var4, -225)) {
                    var2 = false;
                }
            } else if (method402(var4, field1227)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([CZ)V")
    private static final void method380(char[] arg0, boolean arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1231.length - 1; var3 >= 0; var3--) {
                method389(field1232[var3], arg0, field1231[var3], 0);
            }
        }
        if (arg1) {
            field1221 = !field1221;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "([CZ)V")
    private static final void method381(char[] arg0, boolean arg1) {
        if (arg1) {
            field1229 = 475;
        }
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method389(null, var2, var3, 0);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method389(null, var4, var5, 0);
        for (int var6 = field1233.length - 1; var6 >= 0; var6--) {
            method382(var4, arg0, var2, field1233[var6], 315);
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method382(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        if (arg4 <= 0 || arg3.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg3.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg1[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg1.length) {
                        var12 = arg1[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg3.length && (var13 = method391(var11, var12, arg3[var8], 3)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method391(var11, var12, arg3[var8 - 1], 3)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method397(8, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method383(arg1, 37847, arg2, var6);
                int var17 = method384(var7 - 1, arg1, true, arg0);
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
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([CI[CI)I")
    private static final int method383(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method397(8, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method397(8, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (arg1 != 37847) {
            field1220 = !field1220;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method397(8, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[CZ[C)I")
    private static final int method384(int arg0, char[] arg1, boolean arg2, char[] arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method397(8, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (!arg2) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg0 + 1; var7 < arg1.length && method397(8, arg3[var7]); var7++) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method397(8, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "([CI)V")
    private static final void method385(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method389(null, var2, var3, 0);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method389(null, var4, var5, 0);
        for (int var6 = 0; var6 < field1234.length; var6++) {
            method386(var2, var4, field1235[var6], arg0, field1234[var6], -810);
        }
        if (arg1 == 5263) {
            ;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([C[CI[C[CI)V")
    private static final void method386(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg4.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        if (arg5 >= 0) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg3.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg3[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg3.length) {
                        var13 = arg3[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method391(var12, var13, arg4[var9], 3)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method391(var12, var13, arg4[var9 - 1], 3)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method397(8, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method387(arg3, arg0, (byte) 7, var7);
                int var18 = method388(var8 - 1, arg3, arg1, 0);
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
                                if (method397(8, arg3[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method397(8, arg3[var24])) {
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
                        for (int var28 = var20 + 1; var28 < arg3.length; var28++) {
                            if (var27) {
                                if (method397(8, arg3[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method397(8, arg3[var28])) {
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
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([C[CBI)I")
    private static final int method387(char[] arg0, char[] arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method397(8, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 != 7) {
                field1227 = -222;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method397(8, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method397(8, arg0[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[C[CI)I")
    private static final int method388(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method397(8, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != 0) {
                field1219 = !field1219;
            }
            for (int var6 = arg0 + 1; var6 < arg1.length && method397(8, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method397(8, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method389(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        if (arg3 < 0 || arg3 > 0) {
            field1220 = !field1220;
        }
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label170: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label170;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg2.length && (var16 = method392(var15, arg2[var7], var14, 0)) > 0) {
                        if (var16 == 1 && method400(410, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method400(410, var14) || method400(410, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label170;
                        }
                        int var17;
                        if ((var17 = method392(var15, arg2[var7 - 1], var14, 0)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method398(var14, false)) {
                                break label170;
                            }
                            if (method397(8, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method400(410, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label170;
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
                    if (var5 - 1 < 0 || method397(8, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method397(8, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method397(8, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method397(8, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method397(8, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method403(-546, var27)) {
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
                    byte var21 = method393(var19, true);
                    byte var22 = method393(var20, true);
                    if (arg0 != null && method390(field1225, var21, arg0, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method400(410, arg1[var33])) {
                            var30++;
                        } else if (method399(0, arg1[var33])) {
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

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(IB[[BB)Z")
    private static final boolean method390(int arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        int var5 = 8 / arg0;
        if (arg2[var4][0] == arg1 && arg2[var4][1] == arg3) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg1 && arg2[var6][1] == arg3) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg2[var7][0] == arg1 && arg2[var7][1] == arg3) {
                return true;
            }
            if (arg1 < arg2[var7][0] || arg2[var7][0] == arg1 && arg3 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(CCCI)I")
    private static final int method391(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != 3) {
            field1227 = 139;
        }
        if (arg0 == arg2) {
            return 1;
        } else if (arg2 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg0 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(CCCI)I")
    private static final int method392(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != 0) {
            field1221 = !field1221;
        }
        if (arg1 == arg2) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg1 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'd') {
                if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'f') {
                if (arg2 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'g') {
                if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                if (arg2 != '0' && arg2 != '*') {
                    if (arg2 == '(' && arg0 == ')' || arg2 == '[' && arg0 == ']' || arg2 == '{' && arg0 == '}' || arg2 == '<' && arg0 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if (arg2 == '\\' && arg0 == '/' || arg2 == '\\' && arg0 == '|' || arg2 == '|' && arg0 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'v') {
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg2 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg1 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg1 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg1 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg1 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(CZ)B")
    private static final byte method393(char arg0, boolean arg1) {
        if (!arg1) {
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

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[C)V")
    private static final void method394(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method395(var3, (byte) 8, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method397(8, arg1[var8]) && !method398(arg1[var8], false)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method396(37, arg1, var6);
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

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(IB[C)I")
    private static final int method395(int arg0, byte arg1, char[] arg2) {
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            field1224 = -255;
        }
        for (int var4 = arg0; var4 < arg2.length && var4 >= 0; var4++) {
            if (arg2[var4] >= '0' && arg2[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(I[CI)I")
    private static final int method396(int arg0, char[] arg1, int arg2) {
        if (arg0 <= 0) {
            return field1227;
        }
        int var3 = arg2;
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

    @OriginalMember(owner = "client!OWMPGCSS", name = "a", descriptor = "(IC)Z")
    private static final boolean method397(int arg0, char arg1) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method399(0, arg1) && !method400(410, arg1);
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(CZ)Z")
    private static final boolean method398(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(IC)Z")
    private static final boolean method399(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "(IC)Z")
    private static final boolean method400(int arg0, char arg1) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(CI)Z")
    private static final boolean method401(char arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "(CI)Z")
    private static final boolean method402(char arg0, int arg1) {
        if (arg1 >= 0) {
            field1219 = !field1219;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "b", descriptor = "(I[C)Z")
    private static final boolean method403(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method400(410, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method404(arg1, 420);
        int var5 = 0;
        int var6 = field1230.length - 1;
        if (arg0 >= 0) {
            field1220 = !field1220;
        }
        if (field1230[var5] == var4 || field1230[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1230[var7] == var4) {
                return true;
            }
            if (var4 < field1230[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!OWMPGCSS", name = "c", descriptor = "([CI)I")
    public static final int method404(char[] arg0, int arg1) {
        int var2 = 76 / arg1;
        if (arg0.length > 6) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[arg0.length - var4 - 1];
            if (var5 >= 'a' && var5 <= 'z') {
                var3 = var3 * 38 + var5 + 1 - 'a';
            } else if (var5 == '\'') {
                var3 = var3 * 38 + 27;
            } else if (var5 >= '0' && var5 <= '9') {
                var3 = var3 * 38 + var5 + 28 - '0';
            } else if (var5 != '\u0000') {
                return 0;
            }
        }
        return var3;
    }
}
