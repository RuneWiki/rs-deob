import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PBBEXDRS")
public class class39 {

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "Z")
    private static boolean field1222 = true;

    @OriginalMember(owner = "PBBEXDRS", name = "b", descriptor = "I")
    private static int field1223 = 778;

    @OriginalMember(owner = "PBBEXDRS", name = "e", descriptor = "I")
    private static int field1226 = -686;

    @OriginalMember(owner = "PBBEXDRS", name = "g", descriptor = "I")
    private static int field1228 = -29;

    @OriginalMember(owner = "PBBEXDRS", name = "h", descriptor = "I")
    private static int field1229 = 36177;

    @OriginalMember(owner = "PBBEXDRS", name = "i", descriptor = "I")
    private static int field1230 = 536;

    @OriginalMember(owner = "PBBEXDRS", name = "j", descriptor = "I")
    private static int field1231 = -5190;

    @OriginalMember(owner = "PBBEXDRS", name = "k", descriptor = "I")
    private static int field1232 = -725;

    @OriginalMember(owner = "PBBEXDRS", name = "l", descriptor = "I")
    private static int field1233 = 47691;

    @OriginalMember(owner = "PBBEXDRS", name = "m", descriptor = "Z")
    private static boolean field1234 = true;

    @OriginalMember(owner = "PBBEXDRS", name = "u", descriptor = "[Ljava/lang/String;")
    private static final String[] field1242 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "PBBEXDRS", name = "c", descriptor = "I")
    private static int field1224;

    @OriginalMember(owner = "PBBEXDRS", name = "n", descriptor = "I")
    private static int field1235;

    @OriginalMember(owner = "PBBEXDRS", name = "d", descriptor = "Z")
    private static boolean field1225;

    @OriginalMember(owner = "PBBEXDRS", name = "f", descriptor = "Z")
    private static boolean field1227;

    @OriginalMember(owner = "PBBEXDRS", name = "v", descriptor = "Z")
    public static boolean field1243;

    @OriginalMember(owner = "PBBEXDRS", name = "o", descriptor = "[I")
    private static int[] field1236;

    @OriginalMember(owner = "PBBEXDRS", name = "t", descriptor = "[I")
    private static int[] field1241;

    @OriginalMember(owner = "PBBEXDRS", name = "p", descriptor = "[[C")
    private static char[][] field1237;

    @OriginalMember(owner = "PBBEXDRS", name = "r", descriptor = "[[C")
    private static char[][] field1239;

    @OriginalMember(owner = "PBBEXDRS", name = "s", descriptor = "[[C")
    private static char[][] field1240;

    @OriginalMember(owner = "PBBEXDRS", name = "q", descriptor = "[[[B")
    private static byte[][][] field1238;

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(LGWOEELWB;)V")
    public static final void method368(class18 arg0) {
        class30 var1 = new class30(true, arg0.method249("fragmentsenc.txt", null));
        class30 var2 = new class30(true, arg0.method249("badenc.txt", null));
        class30 var3 = new class30(true, arg0.method249("domainenc.txt", null));
        class30 var4 = new class30(true, arg0.method249("tldlist.txt", null));
        method369(var1, var2, var3, var4);
        if (class38.field1221) {
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(LMLYYHULT;LMLYYHULT;LMLYYHULT;LMLYYHULT;)V")
    private static final void method369(class30 arg0, class30 arg1, class30 arg2, class30 arg3) {
        method371(778, arg1);
        method372(arg2, -135);
        method373(arg0, field1224);
        method370(arg3, 0);
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(LMLYYHULT;I)V")
    private static final void method370(class30 arg0, int arg1) {
        int var2 = arg0.method301();
        field1240 = new char[var2][];
        if (arg1 != 0) {
            field1235 = 278;
        }
        field1241 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1241[var3] = arg0.method296();
            char[] var4 = new char[arg0.method296()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method296();
            }
            field1240[var3] = var4;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(ILMLYYHULT;)V")
    private static final void method371(int arg0, class30 arg1) {
        int var2 = arg1.method301();
        field1237 = new char[var2][];
        field1238 = new byte[var2][][];
        method374((byte) -35, field1237, field1238, arg1);
        int var3 = 58 / arg0;
    }

    @OriginalMember(owner = "PBBEXDRS", name = "b", descriptor = "(LMLYYHULT;I)V")
    private static final void method372(class30 arg0, int arg1) {
        int var2 = arg0.method301();
        if (arg1 != -135) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1239 = new char[var2][];
        method375(field1239, 980, arg0);
    }

    @OriginalMember(owner = "PBBEXDRS", name = "c", descriptor = "(LMLYYHULT;I)V")
    private static final void method373(class30 arg0, int arg1) {
        field1236 = new int[arg0.method301()];
        if (arg1 != 0) {
            field1222 = !field1222;
        }
        for (int var2 = 0; var2 < field1236.length; var2++) {
            field1236[var2] = arg0.method298();
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(B[[C[[[BLMLYYHULT;)V")
    private static final void method374(byte arg0, char[][] arg1, byte[][][] arg2, class30 arg3) {
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg3.method296()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method296();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg3.method296()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method296();
                var7[var8][1] = (byte) arg3.method296();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (arg0 == -35) {
            ;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([[CILMLYYHULT;)V")
    private static final void method375(char[][] arg0, int arg1, class30 arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method296()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method296();
            }
            arg0[var3] = var4;
        }
        if (arg1 <= 0) {
            field1223 = 25;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([CI)V")
    private static final void method376(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method377(arg0[var3], (byte) 8)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1 <= 0) {
            field1233 = -175;
        }
        for (int var4 = var2; var4 < arg0.length; var4++) {
            arg0[var4] = ' ';
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(CB)Z")
    private static final boolean method377(char arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var2 = false;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method378(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method376(var4, 146);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        method386((byte) 4, var6);
        method381(var6, -686);
        method382(var6, -40436);
        method395(var6, field1229);
        for (int var8 = 0; var8 < field1242.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1242[var8], var11 + 1)) != -1) {
                char[] var12 = field1242[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method379(var5.toCharArray(), var6, 6);
        method380(false, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([C[CI)V")
    private static final void method379(char[] arg0, char[] arg1, int arg2) {
        if (arg2 < 6 || arg2 > 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (arg1[var4] != '*' && method403(arg0[var4], 722)) {
                arg1[var4] = arg0[var4];
            }
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(Z[C)V")
    private static final void method380(boolean arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method400(var4, 0)) {
                var2 = true;
            } else if (var2) {
                if (method402(var4, field1232)) {
                    var2 = false;
                }
            } else if (method403(var4, 722)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "b", descriptor = "([CI)V")
    private static final void method381(char[] arg0, int arg1) {
        while (arg1 >= 0) {
            field1234 = true;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1237.length - 1; var3 >= 0; var3--) {
                method390(arg0, field1238[var3], 0, field1237[var3]);
            }
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "c", descriptor = "([CI)V")
    private static final void method382(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method390(var2, null, 0, var3);
        if (arg1 != -40436) {
            field1222 = !field1222;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method390(var4, null, 0, var5);
        for (int var6 = field1239.length - 1; var6 >= 0; var6--) {
            method383(arg0, var2, field1239[var6], var4, (byte) 116);
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([C[C[C[CB)V")
    private static final void method383(char[] arg0, char[] arg1, char[] arg2, char[] arg3, byte arg4) {
        if (arg2.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg0.length - arg2.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg0.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg0[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg0.length) {
                        var12 = arg0[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg2.length && (var13 = method392(var12, -25025, arg2[var8], var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method392(var12, -25025, arg2[var8 - 1], var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method398(9, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method384(arg1, var6, (byte) 4, arg0);
                int var17 = method385(arg3, arg0, false, var7 - 1);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg0[var18] = '*';
                    }
                }
            }
        }
        if (arg4 == 116) {
            ;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([CIB[C)I")
    private static final int method384(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method398(9, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        if (arg2 != 4) {
            return 2;
        }
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method398(9, arg0[var7]); var7--) {
            if (arg0[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method398(9, arg3[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([C[CZI)I")
    private static final int method385(char[] arg0, char[] arg1, boolean arg2, int arg3) {
        if (arg2) {
            field1225 = !field1225;
        }
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method398(9, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && method398(9, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method398(9, arg1[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(B[C)V")
    private static final void method386(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method390(var2, null, 0, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method390(var4, null, 0, var5);
        if (arg0 == 4) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < field1240.length; var8++) {
            method387(field1240[var8], var4, var2, field1241[var8], arg1, 0);
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([C[C[CI[CI)V")
    private static final void method387(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4, int arg5) {
        if (arg5 != 0 || arg0.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg0.length; var7 += var10) {
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
                    if (var9 < arg0.length && (var14 = method392(var13, -25025, arg0[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method392(var13, -25025, arg0[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method398(9, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method388(arg4, (byte) 96, arg2, var7);
                int var18 = method389(var8 - 1, 36572, arg4, arg1);
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
                                if (method398(9, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method398(9, arg4[var24])) {
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
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method398(9, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method398(9, arg4[var28])) {
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

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([CB[CI)I")
    private static final int method388(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg1 != 96) {
            field1227 = !field1227;
        }
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method398(9, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method398(9, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method398(9, arg0[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(II[C[C)I")
    private static final int method389(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 != 36572) {
            return 3;
        } else if (arg0 + 1 == arg2.length) {
            return 2;
        } else {
            int var4 = arg0 + 1;
            while (true) {
                if (var4 < arg2.length && method398(9, arg2[var4])) {
                    if (arg2[var4] != '\\' && arg2[var4] != '/') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg0 + 1; var6 < arg2.length && method398(9, arg3[var6]); var6++) {
                    if (arg3[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 5) {
                    return 4;
                }
                if (method398(9, arg2[arg0 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([C[[BI[C)V")
    public static final void method390(char[] arg0, byte[][] arg1, int arg2, char[] arg3) {
        if (arg2 != 0) {
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
            label168: while (true) {
                while (true) {
                    if (var7 >= arg0.length || var12 && var13) {
                        break label168;
                    }
                    boolean var14 = false;
                    char var15 = arg0[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg0.length) {
                        var16 = arg0[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg3.length && (var17 = method393(var16, true, var15, arg3[var8])) > 0) {
                        if (var17 == 1 && method401((byte) 67, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method401((byte) 67, var15) || method401((byte) 67, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label168;
                        }
                        int var18;
                        if ((var18 = method393(var16, true, var15, arg3[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method399(-5190, var15)) {
                                break label168;
                            }
                            if (method398(9, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method401((byte) 67, var15)) {
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
            if (var8 >= arg3.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var6 - 1 < 0 || method398(9, arg0[var6 - 1]) && arg0[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg0.length || method398(9, arg0[var7]) && arg0[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method398(9, arg0[var27]) || arg0[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg0.length && (!method398(9, arg0[var27 + var29]) || arg0[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg0[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method398(9, arg0[var27 - 1]) || arg0[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method404(var28, true)) {
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
                    byte var22 = method394(var20, true);
                    byte var23 = method394(var21, true);
                    if (arg1 != null && method391(arg1, var23, 0, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method401((byte) 67, arg0[var34])) {
                            var31++;
                        } else if (method400(arg0[var34], 0)) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg0[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([[BBIB)Z")
    private static final boolean method391(byte[][] arg0, byte arg1, int arg2, byte arg3) {
        int var4 = 0;
        if (arg2 != 0) {
            throw new NullPointerException();
        } else if (arg0[var4][0] == arg3 && arg0[var4][1] == arg1) {
            return true;
        } else {
            int var5 = arg0.length - 1;
            if (arg0[var5][0] == arg3 && arg0[var5][1] == arg1) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg0[var6][0] == arg3 && arg0[var6][1] == arg1) {
                    return true;
                }
                if (arg3 < arg0[var6][0] || arg0[var6][0] == arg3 && arg1 < arg0[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(CICC)I")
    private static final int method392(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != -25025) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg2 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg3 == '(' && arg0 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg2 == 's' && arg3 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(CZCC)I")
    private static final int method393(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            field1222 = !field1222;
        }
        if (arg2 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
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
                if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
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
                if (arg2 == 'p' && arg0 == 'h') {
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
                    if (arg2 == '(' && arg0 == ')' || arg2 == '[' && arg0 == ']' || arg2 == '{' && arg0 == '}' || arg2 == '<' && arg0 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg2 == '\\' && arg0 == '/' || arg2 == '\\' && arg0 == '|' || arg2 == '|' && arg0 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'v') {
                if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg2 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
                } else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
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

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(CZ)B")
    private static final byte method394(char arg0, boolean arg1) {
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

    @OriginalMember(owner = "PBBEXDRS", name = "d", descriptor = "([CI)V")
    private static final void method395(char[] arg0, int arg1) {
        boolean var2 = false;
        if (arg1 != 36177) {
            field1228 = 438;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method396(12466, arg0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method398(9, arg0[var8]) && !method399(-5190, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method397(field1230, var6, arg0);
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

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(I[CI)I")
    private static final int method396(int arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return arg0 == 12466 ? -1 : field1226;
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(II[C)I")
    private static final int method397(int arg0, int arg1, char[] arg2) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
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

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(IC)Z")
    private static final boolean method398(int arg0, char arg1) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        return !method400(arg1, 0) && !method401((byte) 67, arg1);
    }

    @OriginalMember(owner = "PBBEXDRS", name = "b", descriptor = "(IC)Z")
    private static final boolean method399(int arg0, char arg1) {
        if (field1231 != arg0) {
            field1234 = true;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(CI)Z")
    private static final boolean method400(char arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "(BC)Z")
    private static final boolean method401(byte arg0, char arg1) {
        if (arg0 != 67) {
            field1232 = -4;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "PBBEXDRS", name = "b", descriptor = "(CI)Z")
    private static final boolean method402(char arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "PBBEXDRS", name = "c", descriptor = "(CI)Z")
    private static final boolean method403(char arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([CZ)Z")
    private static final boolean method404(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method401((byte) 67, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method405(arg0, (byte) -15);
        int var5 = 0;
        int var6 = field1236.length - 1;
        if (!arg1) {
            field1233 = 276;
        }
        if (field1236[var5] == var4 || field1236[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1236[var7] == var4) {
                return true;
            }
            if (var4 < field1236[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "PBBEXDRS", name = "a", descriptor = "([CB)I")
    public static final int method405(char[] arg0, byte arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != -15) {
            field1232 = -373;
        }
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
