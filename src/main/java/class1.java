import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AYSHFCKR")
public class class1 {

    @OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "I")
    private static int field3 = 2;

    @OriginalMember(owner = "client!AYSHFCKR", name = "d", descriptor = "Z")
    private static boolean field4 = true;

    @OriginalMember(owner = "client!AYSHFCKR", name = "e", descriptor = "Z")
    private static boolean field5 = true;

    @OriginalMember(owner = "client!AYSHFCKR", name = "f", descriptor = "I")
    private static int field6 = -620;

    @OriginalMember(owner = "client!AYSHFCKR", name = "g", descriptor = "Z")
    private static boolean field7 = true;

    @OriginalMember(owner = "client!AYSHFCKR", name = "i", descriptor = "B")
    private static byte field9 = 8;

    @OriginalMember(owner = "client!AYSHFCKR", name = "k", descriptor = "I")
    private static int field11 = -98;

    @OriginalMember(owner = "client!AYSHFCKR", name = "l", descriptor = "B")
    private static byte field12 = -40;

    @OriginalMember(owner = "client!AYSHFCKR", name = "n", descriptor = "I")
    private static int field14 = -163;

    @OriginalMember(owner = "client!AYSHFCKR", name = "u", descriptor = "[Ljava/lang/String;")
    private static final String[] field21 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "I")
    private static int field1;

    @OriginalMember(owner = "client!AYSHFCKR", name = "j", descriptor = "I")
    private static int field10;

    @OriginalMember(owner = "client!AYSHFCKR", name = "h", descriptor = "I")
    private static int field8;

    @OriginalMember(owner = "client!AYSHFCKR", name = "m", descriptor = "Z")
    private static boolean field13;

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "Z")
    private static boolean field2;

    @OriginalMember(owner = "client!AYSHFCKR", name = "v", descriptor = "Z")
    public static boolean field22;

    @OriginalMember(owner = "client!AYSHFCKR", name = "o", descriptor = "[I")
    private static int[] field15;

    @OriginalMember(owner = "client!AYSHFCKR", name = "t", descriptor = "[I")
    private static int[] field20;

    @OriginalMember(owner = "client!AYSHFCKR", name = "p", descriptor = "[[C")
    private static char[][] field16;

    @OriginalMember(owner = "client!AYSHFCKR", name = "r", descriptor = "[[C")
    private static char[][] field18;

    @OriginalMember(owner = "client!AYSHFCKR", name = "s", descriptor = "[[C")
    private static char[][] field19;

    @OriginalMember(owner = "client!AYSHFCKR", name = "q", descriptor = "[[[B")
    private static byte[][][] field17;

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(LVSQMPWOM;)V")
    public static final void method1(class59 arg0) {
        class3 var1 = new class3(arg0.method526("fragmentsenc.txt", null), -990);
        class3 var2 = new class3(arg0.method526("badenc.txt", null), -990);
        class3 var3 = new class3(arg0.method526("domainenc.txt", null), -990);
        class3 var4 = new class3(arg0.method526("tldlist.txt", null), -990);
        method2(var1, var2, var3, var4);
        if (class30.field1023) {
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(LBFQIDHPO;LBFQIDHPO;LBFQIDHPO;LBFQIDHPO;)V")
    private static final void method2(class3 arg0, class3 arg1, class3 arg2, class3 arg3) {
        method4(arg1, (byte) -115);
        method5(arg2, 0);
        method6(arg0, (byte) 91);
        method3(arg3, 36592);
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(LBFQIDHPO;I)V")
    private static final void method3(class3 arg0, int arg1) {
        int var2 = arg0.method59();
        field19 = new char[var2][];
        if (arg1 != 36592) {
            return;
        }
        field20 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field20[var3] = arg0.method54();
            char[] var4 = new char[arg0.method54()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method54();
            }
            field19[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(LBFQIDHPO;B)V")
    private static final void method4(class3 arg0, byte arg1) {
        int var2 = arg0.method59();
        if (arg1 != -115) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field16 = new char[var2][];
        field17 = new byte[var2][][];
        method7(arg0, -340, field17, field16);
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(LBFQIDHPO;I)V")
    private static final void method5(class3 arg0, int arg1) {
        int var2 = arg0.method59();
        if (arg1 != 0) {
            field1 = 374;
        }
        field18 = new char[var2][];
        method8(arg0, field18, 421);
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(LBFQIDHPO;B)V")
    private static final void method6(class3 arg0, byte arg1) {
        field15 = new int[arg0.method59()];
        for (int var2 = 0; var2 < field15.length; var2++) {
            field15[var2] = arg0.method56();
        }
        if (arg1 != 91) {
            field2 = !field2;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(LBFQIDHPO;I[[[B[[C)V")
    private static final void method7(class3 arg0, int arg1, byte[][][] arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg0.method54()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method54();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg0.method54()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method54();
                var7[var8][1] = (byte) arg0.method54();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (arg1 >= 0) {
            field2 = !field2;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(LBFQIDHPO;[[CI)V")
    private static final void method8(class3 arg0, char[][] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method54()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method54();
            }
            arg1[var3] = var4;
        }
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Z[C)V")
    private static final void method9(boolean arg0, char[] arg1) {
        int var2 = 0;
        if (!arg0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method10(0, arg1[var3])) {
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

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(IC)Z")
    private static final boolean method10(int arg0, char arg1) {
        if (arg0 != 0) {
            field1 = 29;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method11(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method9(field4, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method19(783, var6);
        method14(-244, var6);
        method15(var6, field6);
        method28(0, var6);
        for (int var8 = 0; var8 < field21.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field21[var8], var11 + 1)) != -1) {
                char[] var12 = field21[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        if (arg0 != -18263) {
            field6 = 163;
        }
        method12(field5, var6, var5.toCharArray());
        method13((byte) 5, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(Z[C[C)V")
    private static final void method12(boolean arg0, char[] arg1, char[] arg2) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            if (arg1[var4] != '*' && method36(arg2[var4], field13)) {
                arg1[var4] = arg2[var4];
            }
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(B[C)V")
    private static final void method13(byte arg0, char[] arg1) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            field2 = !field2;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method33(var5, -363)) {
                var3 = true;
            } else if (var3) {
                if (method35(field12, var5)) {
                    var3 = false;
                }
            } else if (method36(var5, field13)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(I[C)V")
    private static final void method14(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field16.length - 1; var3 >= 0; var3--) {
                method23(arg1, field16[var3], false, field17[var3]);
            }
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CI)V")
    private static final void method15(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method23(var2, var3, false, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method23(var4, var5, false, null);
        while (arg1 >= 0) {
            field3 = 267;
        }
        for (int var6 = field18.length - 1; var6 >= 0; var6--) {
            method16(arg0, field7, var2, field18[var6], var4);
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CZ[C[C[C)V")
    private static final void method16(char[] arg0, boolean arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label62: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label62;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method25(arg3[var9], var13, -226, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method25(arg3[var9 - 1], var13, -226, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method31(var12, -828)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method17(arg0, var7, arg2, true);
                int var18 = method18(arg0, 0, var8 - 1, arg4);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg0[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CI[CZ)I")
    private static final int method17(char[] arg0, int arg1, char[] arg2, boolean arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method31(arg0[var4], -828); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method31(arg2[var6], -828); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (!arg3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method31(arg0[arg1 - 1], -828)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CII[C)I")
    private static final int method18(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method31(arg0[var4], -828)) {
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
            for (int var7 = arg2 + 1; var7 < arg0.length && method31(arg3[var7], -828); var7++) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method31(arg0[arg2 + 1], -828)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(I[C)V")
    private static final void method19(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method23(var2, var3, false, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method23(var4, var5, false, null);
        int var6 = 88 / arg0;
        for (int var7 = 0; var7 < field19.length; var7++) {
            method20(arg1, field20[var7], var4, var2, field19[var7], 9);
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([CI[C[C[CI)V")
    private static final void method20(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg4.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label131: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label131;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method25(arg4[var9], var13, -226, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label131;
                        }
                        int var15;
                        if ((var15 = method25(arg4[var9 - 1], var13, -226, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method31(var12, -828)) {
                                break label131;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method21(arg0, 0, var7, arg3);
                int var18 = method22(0, var8 - 1, arg2, arg0);
                if (arg1 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg1 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg1 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg1 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method31(arg0[var24], -828)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method31(arg0[var24], -828)) {
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
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method31(arg0[var28], -828)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method31(arg0[var28], -828)) {
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
        if (arg5 != 9) {
            field7 = true;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "([CII[C)I")
    private static final int method21(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method31(arg0[var4], -828)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 0) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg2 - 1; var7 >= 0 && method31(arg3[var7], -828); var7--) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method31(arg0[arg2 - 1], -828)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(II[C[C)I")
    private static final int method22(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method31(arg3[var4], -828)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method31(arg2[var6], -828); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 != 0) {
                return 0;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method31(arg3[arg1 + 1], -828)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([C[CZ[[B)V")
    public static final void method23(char[] arg0, char[] arg1, boolean arg2, byte[][] arg3) {
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
            label170: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label170;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method26(-382, var15, arg1[var7], var14)) > 0) {
                        if (var16 == 1 && method34(var14, -98)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method34(var14, -98) || method34(var15, -98))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label170;
                        }
                        int var17;
                        if ((var17 = method26(-382, var15, arg1[var7 - 1], var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method32(var14, field10)) {
                                break label170;
                            }
                            if (method31(var14, -828) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method34(var14, -98)) {
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
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method31(arg0[var5 - 1], -828) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method31(arg0[var6], -828) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method31(arg0[var26], -828) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method31(arg0[var26 + var28], -828) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method31(arg0[var26 - 1], -828) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method37(var27, -41)) {
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
                    byte var21 = method27(var19, 0);
                    byte var22 = method27(var20, 0);
                    if (arg3 != null && method24(arg3, false, var21, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method34(arg0[var33], -98)) {
                            var30++;
                        } else if (method33(arg0[var33], -363)) {
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
        if (arg2) {
            field7 = true;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "([[BZBB)Z")
    private static final boolean method24(byte[][] arg0, boolean arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0[var4][0] == arg2 && arg0[var4][1] == arg3) {
            return true;
        }
        int var6 = arg0.length - 1;
        if (arg0[var6][0] == arg2 && arg0[var6][1] == arg3) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg0[var7][0] == arg2 && arg0[var7][1] == arg3) {
                return true;
            }
            if (arg2 < arg0[var7][0] || arg0[var7][0] == arg2 && arg3 < arg0[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(CCIC)I")
    private static final int method25(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 >= 0) {
            return 2;
        } else if (arg0 == arg3) {
            return 1;
        } else if (arg0 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg3 == '(' && arg1 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg0 == 's' && arg3 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(ICCC)I")
    private static final int method26(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 >= 0) {
            field13 = true;
        }
        if (arg2 == arg3) {
            return 1;
        }
        if (arg2 >= 'a' && arg2 <= 'm') {
            if (arg2 == 'a') {
                if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                    if (arg3 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'b') {
                if (arg3 != '6' && arg3 != '8') {
                    if ((arg3 != '1' || arg1 != '3') && (arg3 != 'i' || arg1 != '3')) {
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
                if ((arg3 != '[' || arg1 != ')') && (arg3 != 'i' || arg1 != ')')) {
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
                if (arg3 == 'p' && arg1 == 'h') {
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
                    if (arg3 == '(' && arg1 == ')' || arg3 == '[' && arg1 == ']' || arg3 == '{' && arg1 == '}' || arg3 == '<' && arg1 == '>') {
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
                if (arg3 == '\\' && arg1 == '/' || arg3 == '\\' && arg1 == '|' || arg3 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'v') {
                if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'w') {
                if (arg3 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'x') {
                if ((arg3 != ')' || arg1 != '(') && (arg3 != '}' || arg1 != '{') && (arg3 != ']' || arg1 != '[') && (arg3 != '>' || arg1 != '<')) {
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
                } else if ((arg3 != '(' || arg1 != ')') && (arg3 != '{' || arg1 != '}') && (arg3 != '[' || arg1 != ']')) {
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

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(CI)B")
    private static final byte method27(char arg0, int arg1) {
        if (arg1 != 0) {
            field1 = -498;
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

    @OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "(I[C)V")
    private static final void method28(int arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 != 0) {
            field2 = !field2;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method29(var3, arg1, (byte) 8)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method31(arg1[var8], -828) && !method32(arg1[var8], field10)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method30(43, var6, arg1);
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

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(I[CB)I")
    private static final int method29(int arg0, char[] arg1, byte arg2) {
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        if (field9 == arg2) {
            boolean var4 = false;
            return -1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(II[C)I")
    private static final int method30(int arg0, int arg1, char[] arg2) {
        int var3 = 42 / arg0;
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

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "(CI)Z")
    private static final boolean method31(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if (method33(arg0, -363) || method34(arg0, -98)) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "(CI)Z")
    private static final boolean method32(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "d", descriptor = "(CI)Z")
    private static final boolean method33(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "e", descriptor = "(CI)Z")
    private static final boolean method34(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if (arg0 >= '0' && arg0 <= '9') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(BC)Z")
    private static final boolean method35(byte arg0, char arg1) {
        if (arg0 != -40) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "a", descriptor = "(CZ)Z")
    private static final boolean method36(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "b", descriptor = "([CI)Z")
    private static final boolean method37(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method34(arg0[var3], -98) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method38(arg0, field14);
        int var5 = 0;
        if (arg1 >= 0) {
            field8 = 29;
        }
        int var6 = field15.length - 1;
        if (field15[var5] == var4 || field15[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field15[var7] == var4) {
                return true;
            }
            if (var4 < field15[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!AYSHFCKR", name = "c", descriptor = "([CI)I")
    public static final int method38(char[] arg0, int arg1) {
        while (arg1 >= 0) {
            field4 = !field4;
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
