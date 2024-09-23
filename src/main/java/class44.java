import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PSDABLUV")
public class class44 {

    @OriginalMember(owner = "PSDABLUV", name = "c", descriptor = "I")
    private static int field1120 = -29012;

    @OriginalMember(owner = "PSDABLUV", name = "d", descriptor = "I")
    private static int field1121 = 5;

    @OriginalMember(owner = "PSDABLUV", name = "e", descriptor = "I")
    private static int field1122 = 649;

    @OriginalMember(owner = "PSDABLUV", name = "g", descriptor = "I")
    private static int field1124 = 9;

    @OriginalMember(owner = "PSDABLUV", name = "h", descriptor = "I")
    private static int field1125 = 42987;

    @OriginalMember(owner = "PSDABLUV", name = "i", descriptor = "Z")
    private static boolean field1126 = true;

    @OriginalMember(owner = "PSDABLUV", name = "j", descriptor = "I")
    private static int field1127 = 9;

    @OriginalMember(owner = "PSDABLUV", name = "k", descriptor = "B")
    private static byte field1128 = -104;

    @OriginalMember(owner = "PSDABLUV", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1135 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "I")
    private static int field1118;

    @OriginalMember(owner = "PSDABLUV", name = "b", descriptor = "Z")
    private static boolean field1119;

    @OriginalMember(owner = "PSDABLUV", name = "f", descriptor = "Z")
    private static boolean field1123;

    @OriginalMember(owner = "PSDABLUV", name = "s", descriptor = "Z")
    public static boolean field1136;

    @OriginalMember(owner = "PSDABLUV", name = "l", descriptor = "[I")
    private static int[] field1129;

    @OriginalMember(owner = "PSDABLUV", name = "q", descriptor = "[I")
    private static int[] field1134;

    @OriginalMember(owner = "PSDABLUV", name = "m", descriptor = "[[C")
    private static char[][] field1130;

    @OriginalMember(owner = "PSDABLUV", name = "o", descriptor = "[[C")
    private static char[][] field1132;

    @OriginalMember(owner = "PSDABLUV", name = "p", descriptor = "[[C")
    private static char[][] field1133;

    @OriginalMember(owner = "PSDABLUV", name = "n", descriptor = "[[[B")
    private static byte[][][] field1131;

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(LTXPLZUUI;)V")
    public static final void method368(class60 arg0) {
        class43 var1 = new class43(arg0.method506("fragmentsenc.txt", null), 0);
        class43 var2 = new class43(arg0.method506("badenc.txt", null), 0);
        class43 var3 = new class43(arg0.method506("domainenc.txt", null), 0);
        class43 var4 = new class43(arg0.method506("tldlist.txt", null), 0);
        method369(var1, var2, var3, var4);
        if (class27.field922) {
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(LPKHWFJLM;LPKHWFJLM;LPKHWFJLM;LPKHWFJLM;)V")
    private static final void method369(class43 arg0, class43 arg1, class43 arg2, class43 arg3) {
        method371(arg1, false);
        method372(-468, arg2);
        method373(arg0, (byte) 1);
        method370((byte) -56, arg3);
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(BLPKHWFJLM;)V")
    private static final void method370(byte arg0, class43 arg1) {
        int var2 = arg1.method335();
        field1133 = new char[var2][];
        field1134 = new int[var2];
        if (arg0 != -56) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < var2; var4++) {
            field1134[var4] = arg1.method330();
            char[] var5 = new char[arg1.method330()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method330();
            }
            field1133[var4] = var5;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    private static final void method371(class43 arg0, boolean arg1) {
        int var2 = arg0.method335();
        field1130 = new char[var2][];
        field1131 = new byte[var2][][];
        method374(field1130, field1131, (byte) 9, arg0);
        if (arg1) {
            field1120 = -317;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(ILPKHWFJLM;)V")
    private static final void method372(int arg0, class43 arg1) {
        int var2 = arg1.method335();
        if (arg0 >= 0) {
            field1120 = -213;
        }
        field1132 = new char[var2][];
        method375(field1132, true, arg1);
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(LPKHWFJLM;B)V")
    private static final void method373(class43 arg0, byte arg1) {
        if (arg1 == 1) {
            field1129 = new int[arg0.method335()];
            for (int var2 = 0; var2 < field1129.length; var2++) {
                field1129[var2] = arg0.method332();
            }
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([[C[[[BBLPKHWFJLM;)V")
    private static final void method374(char[][] arg0, byte[][][] arg1, byte arg2, class43 arg3) {
        if (arg2 != 9) {
            return;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            char[] var6 = new char[arg3.method330()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg3.method330();
            }
            arg0[var5] = var6;
            byte[][] var8 = new byte[arg3.method330()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg3.method330();
                var8[var9][1] = (byte) arg3.method330();
            }
            if (var8.length > 0) {
                arg1[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([[CZLPKHWFJLM;)V")
    private static final void method375(char[][] arg0, boolean arg1, class43 arg2) {
        if (!arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method330()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method330();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(I[C)V")
    private static final void method376(int arg0, char[] arg1) {
        if (field1121 != arg0) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method377(false, arg1[var3])) {
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

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(ZC)Z")
    private static final boolean method377(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method378(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method376(field1121, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method386(var6, field1123);
        if (arg0 != 24865) {
            field1120 = -494;
        }
        method381(true, var6);
        method382(false, var6);
        method395(true, var6);
        for (int var8 = 0; var8 < field1135.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1135[var8], var11 + 1)) != -1) {
                char[] var12 = field1135[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method379(var6, var5.toCharArray(), 8);
        method380(var6, 649);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([C[CI)V")
    private static final void method379(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method403((byte) -71, arg1[var3])) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2 < 8 || arg2 > 8) {
            ;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([CI)V")
    private static final void method380(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 <= 0) {
            field1123 = !field1123;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method400(false, var4)) {
                var2 = true;
            } else if (var2) {
                if (method402(0, var4)) {
                    var2 = false;
                }
            } else if (method403((byte) -71, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(Z[C)V")
    private static final void method381(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1130.length - 1; var3 >= 0; var3--) {
                method390(42987, arg1, field1130[var3], field1131[var3]);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "b", descriptor = "(Z[C)V")
    private static final void method382(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg0) {
            return;
        }
        method390(42987, var2, var3, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method390(42987, var4, var5, null);
        for (int var6 = field1132.length - 1; var6 >= 0; var6--) {
            method383(arg1, field1132[var6], var2, true, var4);
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([C[C[CZ[C)V")
    private static final void method383(char[] arg0, char[] arg1, char[] arg2, boolean arg3, char[] arg4) {
        if (!arg3) {
            field1119 = !field1119;
        }
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg0.length - arg1.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label66: while (true) {
                while (true) {
                    if (var7 >= arg0.length) {
                        break label66;
                    }
                    boolean var10 = false;
                    char var11 = arg0[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg0.length) {
                        var12 = arg0[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg1.length && (var13 = method392(false, var11, arg1[var8], var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label66;
                        }
                        int var14;
                        if ((var14 = method392(false, var11, arg1[var8 - 1], var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method398(var11, 922)) {
                                break label66;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method384(var6, arg0, arg2, 41336);
                int var17 = method385(var7 - 1, arg0, false, arg4);
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
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(I[C[CI)I")
    private static final int method384(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method398(arg1[var4], 922); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method398(arg2[var6], 922); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (arg3 != 41336) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method398(arg1[arg0 - 1], 922)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(I[CZ[C)I")
    private static final int method385(int arg0, char[] arg1, boolean arg2, char[] arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method398(arg1[var4], 922)) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2) {
                return field1122;
            }
            for (int var6 = arg0 + 1; var6 < arg1.length && method398(arg3[var6], 922); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method398(arg1[arg0 + 1], 922)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([CZ)V")
    private static final void method386(char[] arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        char[] var3 = (char[]) arg0.clone();
        char[] var4 = new char[] { 'd', 'o', 't' };
        method390(42987, var3, var4, null);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method390(42987, var5, var6, null);
        for (int var7 = 0; var7 < field1133.length; var7++) {
            method387(9, var5, var3, arg0, field1134[var7], field1133[var7]);
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(I[C[C[CI[C)V")
    private static final void method387(int arg0, char[] arg1, char[] arg2, char[] arg3, int arg4, char[] arg5) {
        if (field1124 != arg0) {
            field1122 = -174;
        }
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg5.length; var7 += var10) {
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
                    if (var9 < arg5.length && (var14 = method392(false, var12, arg5[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method392(false, var12, arg5[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method398(var12, 922)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method388(arg2, arg3, 0, var7);
                int var18 = method389(var8 - 1, arg1, true, arg3);
                if (arg4 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg4 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg4 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg4 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method398(arg3[var24], 922)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method398(arg3[var24], 922)) {
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
                                if (method398(arg3[var28], 922)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method398(arg3[var28], 922)) {
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

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([C[CII)I")
    private static final int method388(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method398(arg1[var4], 922)) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 != 0) {
                return 2;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method398(arg0[var6], 922); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method398(arg1[arg3 - 1], 922)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "b", descriptor = "(I[CZ[C)I")
    private static final int method389(int arg0, char[] arg1, boolean arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method398(arg3[var4], 922)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (!arg2) {
                return field1118;
            }
            for (int var6 = arg0 + 1; var6 < arg3.length && method398(arg1[var6], 922); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method398(arg3[arg0 + 1], 922)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(I[C[C[[B)V")
    public static final void method390(int arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        if (field1125 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label167: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label167;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg2.length && (var17 = method393(var16, true, arg2[var8], var15)) > 0) {
                        if (var17 == 1 && method401(var15, (byte) -104)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method401(var15, (byte) -104) || method401(var16, (byte) -104))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label167;
                        }
                        int var18;
                        if ((var18 = method393(var16, true, arg2[var8 - 1], var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method399(var15, field1127)) {
                                break label167;
                            }
                            if (method398(var15, 922) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method401(var15, (byte) -104)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label167;
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
                    if (var6 - 1 < 0 || method398(arg1[var6 - 1], 922) && arg1[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method398(arg1[var7], 922) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method398(arg1[var27], 922) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method398(arg1[var27 + var29], 922) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method398(arg1[var27 - 1], 922) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method404(false, var28)) {
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
                    byte var22 = method394(-365, var20);
                    byte var23 = method394(-365, var21);
                    if (arg3 != null && method391(var23, var22, arg3, -659)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method401(arg1[var34], (byte) -104)) {
                            var31++;
                        } else if (method400(false, arg1[var34])) {
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

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(BB[[BI)Z")
    private static final boolean method391(byte arg0, byte arg1, byte[][] arg2, int arg3) {
        if (arg3 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = 0;
        if (arg2[var5][0] == arg1 && arg2[var5][1] == arg0) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg1 && arg2[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg2[var7][0] == arg1 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg1 < arg2[var7][0] || arg2[var7][0] == arg1 && arg0 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(ZCCC)I")
    private static final int method392(boolean arg0, char arg1, char arg2, char arg3) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg2) {
            return 1;
        } else if (arg2 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg1 == '(' && arg3 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg2 == 's' && arg1 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(CZCC)I")
    private static final int method393(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            return 2;
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

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(IC)B")
    private static final byte method394(int arg0, char arg1) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
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

    @OriginalMember(owner = "PSDABLUV", name = "c", descriptor = "(Z[C)V")
    private static final void method395(boolean arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (!arg0) {
            field1119 = !field1119;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method396(arg1, var3, 1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method398(arg1[var8], 922) && !method399(arg1[var8], field1127)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method397(arg1, var6, field1126);
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

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([CII)I")
    private static final int method396(char[] arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return field1127;
        }
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([CIZ)I")
    private static final int method397(char[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return field1122;
        }
        int var3 = arg1;
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

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(CI)Z")
    private static final boolean method398(char arg0, int arg1) {
        int var2 = 16 / arg1;
        return !method400(false, arg0) && !method401(arg0, (byte) -104);
    }

    @OriginalMember(owner = "PSDABLUV", name = "b", descriptor = "(CI)Z")
    private static final boolean method399(char arg0, int arg1) {
        if (arg1 != 9) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "PSDABLUV", name = "b", descriptor = "(ZC)Z")
    private static final boolean method400(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(CB)Z")
    private static final boolean method401(char arg0, byte arg1) {
        if (field1128 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "PSDABLUV", name = "b", descriptor = "(IC)Z")
    private static final boolean method402(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "(BC)Z")
    private static final boolean method403(byte arg0, char arg1) {
        if (arg0 != -71) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "PSDABLUV", name = "d", descriptor = "(Z[C)Z")
    private static final boolean method404(boolean arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method401(arg1[var3], (byte) -104) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2) {
            return true;
        }
        int var5 = method405(arg1, (byte) 60);
        int var6 = 0;
        int var7 = field1129.length - 1;
        if (field1129[var6] == var5 || field1129[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1129[var8] == var5) {
                return true;
            }
            if (var5 < field1129[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "PSDABLUV", name = "a", descriptor = "([CB)I")
    public static final int method405(char[] arg0, byte arg1) {
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
        if (arg1 == 60) {
            return var2;
        } else {
            return field1122;
        }
    }
}
