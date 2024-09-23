import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AZWWSWYH")
public class class1 {

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "I")
    private static int field1 = -961;

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "Z")
    private static boolean field2 = true;

    @OriginalMember(owner = "AZWWSWYH", name = "c", descriptor = "I")
    private static int field3 = 4;

    @OriginalMember(owner = "AZWWSWYH", name = "d", descriptor = "I")
    private static int field4 = 3;

    @OriginalMember(owner = "AZWWSWYH", name = "e", descriptor = "Z")
    private static boolean field5 = true;

    @OriginalMember(owner = "AZWWSWYH", name = "f", descriptor = "I")
    private static int field6 = 639;

    @OriginalMember(owner = "AZWWSWYH", name = "g", descriptor = "I")
    private static int field7 = 76;

    @OriginalMember(owner = "AZWWSWYH", name = "h", descriptor = "I")
    private static int field8 = -408;

    @OriginalMember(owner = "AZWWSWYH", name = "i", descriptor = "Z")
    private static boolean field9 = true;

    @OriginalMember(owner = "AZWWSWYH", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field16 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "AZWWSWYH", name = "q", descriptor = "Z")
    public static boolean field17;

    @OriginalMember(owner = "AZWWSWYH", name = "j", descriptor = "[I")
    private static int[] field10;

    @OriginalMember(owner = "AZWWSWYH", name = "o", descriptor = "[I")
    private static int[] field15;

    @OriginalMember(owner = "AZWWSWYH", name = "k", descriptor = "[[C")
    private static char[][] field11;

    @OriginalMember(owner = "AZWWSWYH", name = "m", descriptor = "[[C")
    private static char[][] field13;

    @OriginalMember(owner = "AZWWSWYH", name = "n", descriptor = "[[C")
    private static char[][] field14;

    @OriginalMember(owner = "AZWWSWYH", name = "l", descriptor = "[[[B")
    private static byte[][][] field12;

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(LQDHHNYHL;)V")
    public static final void method1(class44 arg0) {
        class42 var1 = new class42(5, arg0.method488("fragmentsenc.txt", null));
        class42 var2 = new class42(5, arg0.method488("badenc.txt", null));
        class42 var3 = new class42(5, arg0.method488("domainenc.txt", null));
        class42 var4 = new class42(5, arg0.method488("tldlist.txt", null));
        method2(var1, var2, var3, var4);
        if (class8.field617) {
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(LPGNBHFUF;LPGNBHFUF;LPGNBHFUF;LPGNBHFUF;)V")
    private static final void method2(class42 arg0, class42 arg1, class42 arg2, class42 arg3) {
        method4(605, arg1);
        method5(arg2, -808);
        method6(-20467, arg0);
        method3(arg3, field3);
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(LPGNBHFUF;I)V")
    private static final void method3(class42 arg0, int arg1) {
        int var2 = arg0.method425();
        field14 = new char[var2][];
        field15 = new int[var2];
        if (arg1 < 4 || arg1 > 4) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field15[var3] = arg0.method420();
            char[] var4 = new char[arg0.method420()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method420();
            }
            field14[var3] = var4;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(ILPGNBHFUF;)V")
    private static final void method4(int arg0, class42 arg1) {
        int var2 = 95 / arg0;
        int var3 = arg1.method425();
        field11 = new char[var3][];
        field12 = new byte[var3][][];
        method7(field11, 6, arg1, field12);
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(LPGNBHFUF;I)V")
    private static final void method5(class42 arg0, int arg1) {
        int var2 = arg0.method425();
        field13 = new char[var2][];
        method8(arg0, (byte) 46, field13);
        if (arg1 >= 0) {
            field1 = -206;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(ILPGNBHFUF;)V")
    private static final void method6(int arg0, class42 arg1) {
        if (arg0 != -20467) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field10 = new int[arg1.method425()];
        for (int var3 = 0; var3 < field10.length; var3++) {
            field10[var3] = arg1.method422();
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "([[CILPGNBHFUF;[[[B)V")
    private static final void method7(char[][] arg0, int arg1, class42 arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method420()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method420();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method420()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method420();
                var7[var8][1] = (byte) arg2.method420();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg1 == 6) {
            ;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(LPGNBHFUF;B[[C)V")
    private static final void method8(class42 arg0, byte arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var5 = new char[arg0.method420()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method420();
            }
            arg2[var3] = var5;
        }
        if (arg1 != 46) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(I[C)V")
    private static final void method9(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method10(arg1[var3], -16373)) {
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
        while (arg0 >= 0) {
            field2 = !field2;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(CI)Z")
    private static final boolean method10(char arg0, int arg1) {
        if (arg1 != -16373) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method11(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method9(-368, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        int var7 = 32 / arg1;
        String var8 = var5.toLowerCase();
        method19((byte) 4, var6);
        method14(var6, 16);
        method15(true, var6);
        method28(720, var6);
        for (int var9 = 0; var9 < field16.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field16[var9], var12 + 1)) != -1) {
                char[] var13 = field16[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method12(var5.toCharArray(), false, var6);
        method13(field4, var6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "([CZ[C)V")
    private static final void method12(char[] arg0, boolean arg1, char[] arg2) {
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method36(field8, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(I[C)V")
    private static final void method13(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method33(0, var4)) {
                var2 = true;
            } else if (var2) {
                if (method35(0, var4)) {
                    var2 = false;
                }
            } else if (method36(field8, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (field4 != arg0) {
            field4 = -279;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "([CI)V")
    private static final void method14(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field11.length - 1; var3 >= 0; var3--) {
                method23(14701, arg0, field12[var3], field11[var3]);
            }
        }
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(Z[C)V")
    private static final void method15(boolean arg0, char[] arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        char[] var3 = (char[]) arg1.clone();
        char[] var4 = new char[] { '(', 'a', ')' };
        method23(14701, var3, null, var4);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method23(14701, var5, null, var6);
        for (int var7 = field13.length - 1; var7 >= 0; var7--) {
            method16(field6, field13[var7], var5, var3, arg1);
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method16(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        if (arg0 <= 0) {
            return;
        }
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg1.length; var6 += var9) {
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
                    if (var8 < arg1.length && (var13 = method25(arg1[var8], var11, var12, field7)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method25(arg1[var8 - 1], var11, var12, field7)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method31(false, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method17(true, var6, arg3, arg4);
                int var17 = method18(var7 - 1, arg2, 180, arg4);
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

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(ZI[C[C)I")
    private static final int method17(boolean arg0, int arg1, char[] arg2, char[] arg3) {
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == 0) {
            return 2;
        }
        for (int var5 = arg1 - 1; var5 >= 0 && method31(false, arg3[var5]); var5--) {
            if (arg3[var5] == '@') {
                return 3;
            }
        }
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method31(false, arg2[var7]); var7--) {
            if (arg2[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method31(false, arg3[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(I[CI[C)I")
    private static final int method18(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method31(false, arg3[var4])) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 <= 0) {
                field8 = -89;
            }
            for (int var6 = arg0 + 1; var6 < arg3.length && method31(false, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method31(false, arg3[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(B[C)V")
    private static final void method19(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method23(14701, var2, null, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg0 != 4) {
            field6 = -271;
        }
        method23(14701, var4, null, var5);
        for (int var6 = 0; var6 < field14.length; var6++) {
            method20(field15[var6], var2, var4, 873, arg1, field14[var6]);
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(I[C[CI[C[C)V")
    private static final void method20(int arg0, char[] arg1, char[] arg2, int arg3, char[] arg4, char[] arg5) {
        int var6 = 84 / arg3;
        if (arg5.length > arg4.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg4.length - arg5.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label124: while (true) {
                while (true) {
                    if (var9 >= arg4.length) {
                        break label124;
                    }
                    boolean var12 = false;
                    char var13 = arg4[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg4.length) {
                        var14 = arg4[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg5.length && (var15 = method25(arg5[var10], var13, var14, field7)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label124;
                        }
                        int var16;
                        if ((var16 = method25(arg5[var10 - 1], var13, var14, field7)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg5.length || !method31(false, var13)) {
                                break label124;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg5.length) {
                boolean var17 = false;
                int var18 = method21(var8, arg1, 0, arg4);
                int var19 = method22((byte) 27, arg2, arg4, var9 - 1);
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
                    int var20 = var8;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var8 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg1[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg1[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method31(false, arg4[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method31(false, arg4[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg4.length; var27++) {
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
                        for (int var29 = var21 + 1; var29 < arg4.length; var29++) {
                            if (var28) {
                                if (method31(false, arg4[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method31(false, arg4[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg4[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(I[CI[C)I")
    private static final int method21(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method31(false, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method31(false, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (arg2 < 0 || arg2 > 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method31(false, arg3[arg0 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(B[C[CI)I")
    private static final int method22(byte arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 != 27) {
            field7 = -128;
        }
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method31(false, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg2.length && method31(false, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method31(false, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(I[C[[B[C)V")
    public static final void method23(int arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg3.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        if (arg0 != 14701) {
            field5 = !field5;
        }
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg3.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label172: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label172;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg3.length && (var16 = method26(-3474, var15, var14, arg3[var7])) > 0) {
                        if (var16 == 1 && method34(true, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method34(true, var14) || method34(true, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method26(-3474, var15, var14, arg3[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method32(var14, true)) {
                                break label172;
                            }
                            if (method31(false, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method34(true, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label172;
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
                    if (var5 - 1 < 0 || method31(false, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method31(false, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method31(false, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method31(false, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method31(false, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method37((byte) 0, var27)) {
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
                    byte var21 = method27(var19, 926);
                    byte var22 = method27(var20, 926);
                    if (arg2 != null && method24(249, var21, var22, arg2)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method34(true, arg1[var33])) {
                            var30++;
                        } else if (method33(0, arg1[var33])) {
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

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(IBB[[B)Z")
    private static final boolean method24(int arg0, byte arg1, byte arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg3[var4][0] == arg1 && arg3[var4][1] == arg2) {
            return true;
        } else {
            int var5 = arg3.length - 1;
            if (arg3[var5][0] == arg1 && arg3[var5][1] == arg2) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg3[var6][0] == arg1 && arg3[var6][1] == arg2) {
                    return true;
                }
                if (arg1 < arg3[var6][0] || arg3[var6][0] == arg1 && arg2 < arg3[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(CCCI)I")
    private static final int method25(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 <= 0) {
            return 1;
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

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(ICCC)I")
    private static final int method26(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != -3474) {
            field4 = 99;
        }
        if (arg2 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg3 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg2 == 'p' && arg1 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                if (arg2 != '0' && arg2 != '*') {
                    if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
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
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg2 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg3 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg3 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg3 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(CI)B")
    private static final byte method27(char arg0, int arg1) {
        if (arg1 <= 0) {
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

    @OriginalMember(owner = "AZWWSWYH", name = "c", descriptor = "(I[C)V")
    private static final void method28(int arg0, char[] arg1) {
        int var2 = 98 / arg0;
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method29(0, var4, arg1)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method31(false, arg1[var9]) && !method32(arg1[var9], true)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method30(var7, 0, arg1);
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

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(II[C)I")
    private static final int method29(int arg0, int arg1, char[] arg2) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg1; var4 < arg2.length && var4 >= 0; var4++) {
            if (arg2[var4] >= '0' && arg2[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(II[C)I")
    private static final int method30(int arg0, int arg1, char[] arg2) {
        if (arg1 != 0) {
            field2 = !field2;
        }
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(ZC)Z")
    private static final boolean method31(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return !method33(0, arg1) && !method34(true, arg1);
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(CZ)Z")
    private static final boolean method32(char arg0, boolean arg1) {
        if (!arg1) {
            field4 = -308;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "AZWWSWYH", name = "a", descriptor = "(IC)Z")
    private static final boolean method33(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(ZC)Z")
    private static final boolean method34(boolean arg0, char arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(IC)Z")
    private static final boolean method35(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "AZWWSWYH", name = "c", descriptor = "(IC)Z")
    private static final boolean method36(int arg0, char arg1) {
        if (arg0 >= 0) {
            field2 = !field2;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(B[C)Z")
    private static final boolean method37(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method34(true, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method38(true, arg1);
        int var5 = 0;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        int var7 = field10.length - 1;
        if (field10[var5] == var4 || field10[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var7) / 2;
            if (field10[var8] == var4) {
                return true;
            }
            if (var4 < field10[var8]) {
                var7 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var7 && var5 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "AZWWSWYH", name = "b", descriptor = "(Z[C)I")
    public static final int method38(boolean arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (!arg0) {
            return 1;
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
