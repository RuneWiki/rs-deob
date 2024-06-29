import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IXPHWLUO")
public class class25 {

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "Z")
    private static boolean field877 = true;

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "I")
    private static int field878 = 9;

    @OriginalMember(owner = "client!IXPHWLUO", name = "f", descriptor = "I")
    private static int field882 = 382;

    @OriginalMember(owner = "client!IXPHWLUO", name = "o", descriptor = "[Ljava/lang/String;")
    private static final String[] field891 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!IXPHWLUO", name = "d", descriptor = "I")
    private static int field880;

    @OriginalMember(owner = "client!IXPHWLUO", name = "h", descriptor = "I")
    private static int field884;

    @OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "Z")
    private static boolean field879;

    @OriginalMember(owner = "client!IXPHWLUO", name = "e", descriptor = "Z")
    private static boolean field881;

    @OriginalMember(owner = "client!IXPHWLUO", name = "g", descriptor = "Z")
    private static boolean field883;

    @OriginalMember(owner = "client!IXPHWLUO", name = "p", descriptor = "Z")
    public static boolean field892;

    @OriginalMember(owner = "client!IXPHWLUO", name = "i", descriptor = "[I")
    private static int[] field885;

    @OriginalMember(owner = "client!IXPHWLUO", name = "n", descriptor = "[I")
    private static int[] field890;

    @OriginalMember(owner = "client!IXPHWLUO", name = "j", descriptor = "[[C")
    private static char[][] field886;

    @OriginalMember(owner = "client!IXPHWLUO", name = "l", descriptor = "[[C")
    private static char[][] field888;

    @OriginalMember(owner = "client!IXPHWLUO", name = "m", descriptor = "[[C")
    private static char[][] field889;

    @OriginalMember(owner = "client!IXPHWLUO", name = "k", descriptor = "[[[B")
    private static byte[][][] field887;

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(LFXNTEMPE;)V")
    public static final void method230(class18 arg0) {
        class50 var1 = new class50(arg0.method212("fragmentsenc.txt", null), -46859);
        class50 var2 = new class50(arg0.method212("badenc.txt", null), -46859);
        class50 var3 = new class50(arg0.method212("domainenc.txt", null), -46859);
        class50 var4 = new class50(arg0.method212("tldlist.txt", null), -46859);
        method231(var1, var2, var3, var4);
        if (class8.field113) {
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(LRSWRPCHR;LRSWRPCHR;LRSWRPCHR;LRSWRPCHR;)V")
    private static final void method231(class50 arg0, class50 arg1, class50 arg2, class50 arg3) {
        method233(-876, arg1);
        method234(arg2, 0);
        method235(arg0, 624);
        method232(-358, arg3);
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ILRSWRPCHR;)V")
    private static final void method232(int arg0, class50 arg1) {
        int var2 = arg1.method393();
        field889 = new char[var2][];
        if (arg0 >= 0) {
            return;
        }
        field890 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field890[var3] = arg1.method388();
            char[] var4 = new char[arg1.method388()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method388();
            }
            field889[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(ILRSWRPCHR;)V")
    private static final void method233(int arg0, class50 arg1) {
        int var2 = arg1.method393();
        field886 = new char[var2][];
        field887 = new byte[var2][][];
        method236(arg1, field887, field880, field886);
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(LRSWRPCHR;I)V")
    private static final void method234(class50 arg0, int arg1) {
        int var2 = arg0.method393();
        field888 = new char[var2][];
        method237(false, arg0, field888);
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(LRSWRPCHR;I)V")
    private static final void method235(class50 arg0, int arg1) {
        int var2 = 53 / arg1;
        field885 = new int[arg0.method393()];
        for (int var3 = 0; var3 < field885.length; var3++) {
            field885[var3] = arg0.method390();
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(LRSWRPCHR;[[[BI[[C)V")
    private static final void method236(class50 arg0, byte[][][] arg1, int arg2, char[][] arg3) {
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            char[] var6 = new char[arg0.method388()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg0.method388();
            }
            arg3[var5] = var6;
            byte[][] var8 = new byte[arg0.method388()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg0.method388();
                var8[var9][1] = (byte) arg0.method388();
            }
            if (var8.length > 0) {
                arg1[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ZLRSWRPCHR;[[C)V")
    private static final void method237(boolean arg0, class50 arg1, char[][] arg2) {
        if (arg0) {
            field880 = -39;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method388()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method388();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([CB)V")
    private static final void method238(char[] arg0, byte arg1) {
        if (arg1 != 9) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method239(false, arg0[var3])) {
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
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ZC)Z")
    private static final boolean method239(boolean arg0, char arg1) {
        if (arg0) {
            field880 = -16;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method240(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method238(var4, (byte) 9);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method248(true, var6);
        method243(false, var6);
        method244(0, var6);
        method257(false, var6);
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var8 = 0; var8 < field891.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field891[var8], var11 + 1)) != -1) {
                char[] var12 = field891[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method241(var5.toCharArray(), -931, var6);
        method242(-915, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([CI[C)V")
    private static final void method241(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method265(arg0[var3], false)) {
                arg2[var3] = arg0[var3];
            }
        }
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[C)V")
    private static final void method242(int arg0, char[] arg1) {
        boolean var2 = true;
        while (arg0 >= 0) {
            field877 = !field877;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method262(var4, 0)) {
                var2 = true;
            } else if (var2) {
                if (method264(var4, 867)) {
                    var2 = false;
                }
            } else if (method265(var4, false)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(Z[C)V")
    private static final void method243(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field886.length - 1; var3 >= 0; var3--) {
                method252(field887[var3], field886[var3], 51, arg1);
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(I[C)V")
    private static final void method244(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg0 != 0) {
            field883 = !field883;
        }
        method252(null, var3, 51, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method252(null, var5, 51, var4);
        for (int var6 = field888.length - 1; var6 >= 0; var6--) {
            method245(arg1, field888[var6], var2, var4, true);
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([C[C[C[CZ)V")
    private static final void method245(char[] arg0, char[] arg1, char[] arg2, char[] arg3, boolean arg4) {
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        if (!arg4) {
            field880 = -139;
        }
        int var9;
        for (int var6 = 0; var6 <= arg0.length - arg1.length; var6 += var9) {
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
                    if (var8 < arg1.length && (var13 = method254(var11, -794, arg1[var8], var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method254(var11, -794, arg1[var8 - 1], var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method260(var11, true)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method246(var6, arg2, arg0, false);
                int var17 = method247(arg3, arg0, var7 - 1, 156);
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

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[C[CZ)I")
    private static final int method246(int arg0, char[] arg1, char[] arg2, boolean arg3) {
        if (arg3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == 0) {
            return 2;
        }
        for (int var5 = arg0 - 1; var5 >= 0 && method260(arg2[var5], true); var5--) {
            if (arg2[var5] == '@') {
                return 3;
            }
        }
        int var6 = 0;
        for (int var7 = arg0 - 1; var7 >= 0 && method260(arg1[var7], true); var7--) {
            if (arg1[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method260(arg2[arg0 - 1], true)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([C[CII)I")
    private static final int method247(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            field883 = !field883;
        }
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method260(arg1[var4], true)) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method260(arg0[var6], true); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method260(arg1[arg2 + 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(Z[C)V")
    private static final void method248(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method252(null, var3, 51, var2);
        if (!arg0) {
            return;
        }
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method252(null, var5, 51, var4);
        for (int var6 = 0; var6 < field889.length; var6++) {
            method249(arg1, var4, 397, field889[var6], var2, field890[var6]);
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([C[CI[C[CI)V")
    private static final void method249(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method254(var12, -794, arg3[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method254(var12, -794, arg3[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method260(var12, true)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method250(arg0, var7, arg4, -246);
                int var18 = method251(var8 - 1, -14568, arg0, arg1);
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
                                    if (arg4[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg4[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method260(arg0[var24], true)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method260(arg0[var24], true)) {
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
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method260(arg0[var28], true)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method260(arg0[var28], true)) {
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
        if (arg2 <= 0) {
            field878 = 442;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([CI[CI)I")
    private static final int method250(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method260(arg0[var4], true)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg3 >= 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg1 - 1; var7 >= 0 && method260(arg2[var7], true); var7--) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method260(arg0[arg1 - 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(II[C[C)I")
    private static final int method251(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method260(arg2[var4], true)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != -14568) {
                field883 = !field883;
            }
            for (int var6 = arg0 + 1; var6 < arg2.length && method260(arg3[var6], true); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method260(arg2[arg0 + 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "([[B[CI[C)V")
    public static final void method252(byte[][] arg0, char[] arg1, int arg2, char[] arg3) {
        int var4 = 14 / arg2;
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg3.length - arg1.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label163: while (true) {
                while (true) {
                    if (var7 >= arg3.length || var12 && var13) {
                        break label163;
                    }
                    boolean var14 = false;
                    char var15 = arg3[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg3.length) {
                        var16 = arg3[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg1.length && (var17 = method255(var16, arg1[var8], 5, var15)) > 0) {
                        if (var17 == 1 && method263(var15, (byte) 115)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method263(var15, (byte) 115) || method263(var16, (byte) 115))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label163;
                        }
                        int var18;
                        if ((var18 = method255(var16, arg1[var8 - 1], 5, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method261(var15, 20391)) {
                                break label163;
                            }
                            if (method260(var15, true) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method263(var15, (byte) 115)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label163;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg1.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var6 - 1 < 0 || method260(arg3[var6 - 1], true) && arg3[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg3.length || method260(arg3[var7], true) && arg3[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method260(arg3[var27], true) || arg3[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg3.length && (!method260(arg3[var27 + var29], true) || arg3[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg3[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method260(arg3[var27 - 1], true) || arg3[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method266(-146, var28)) {
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
                        var20 = arg3[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg3.length) {
                        var21 = arg3[var7];
                    }
                    byte var22 = method256(var20, field882);
                    byte var23 = method256(var21, field882);
                    if (arg0 != null && method253(var23, 385, arg0, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method263(arg3[var34], (byte) 115)) {
                            var31++;
                        } else if (method262(arg3[var34], 0)) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg3[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(BI[[BB)Z")
    private static final boolean method253(byte arg0, int arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg3 && arg2[var4][1] == arg0) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var4 + var5) / 2;
            if (arg2[var7][0] == arg3 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg3 < arg2[var7][0] || arg2[var7][0] == arg3 && arg0 < arg2[var7][1]) {
                var5 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CICC)I")
    private static final int method254(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 >= 0) {
            return field882;
        } else if (arg0 == arg2) {
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

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CCIC)I")
    private static final int method255(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 5) {
            return 3;
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

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CI)B")
    private static final byte method256(char arg0, int arg1) {
        if (arg1 <= 0) {
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

    @OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "(Z[C)V")
    private static final void method257(boolean arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method258(var3, arg1, true)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method260(arg1[var8], true) && !method261(arg1[var8], 20391)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method259(var6, arg1, 445);
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

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[CZ)I")
    private static final int method258(int arg0, char[] arg1, boolean arg2) {
        if (!arg2) {
            return 0;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(I[CI)I")
    private static final int method259(int arg0, char[] arg1, int arg2) {
        if (arg2 <= 0) {
            field884 = -121;
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

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CZ)Z")
    private static final boolean method260(char arg0, boolean arg1) {
        if (!arg1) {
            field884 = 268;
        }
        return !method262(arg0, 0) && !method263(arg0, (byte) 115);
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(CI)Z")
    private static final boolean method261(char arg0, int arg1) {
        if (arg1 != 20391) {
            field880 = -355;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "(CI)Z")
    private static final boolean method262(char arg0, int arg1) {
        if (arg1 != 0) {
            field879 = !field879;
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "a", descriptor = "(CB)Z")
    private static final boolean method263(char arg0, byte arg1) {
        if (arg1 != 115) {
            field880 = -187;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "d", descriptor = "(CI)Z")
    private static final boolean method264(char arg0, int arg1) {
        int var2 = 87 / arg1;
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "b", descriptor = "(CZ)Z")
    private static final boolean method265(char arg0, boolean arg1) {
        if (arg1) {
            field883 = !field883;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "c", descriptor = "(I[C)Z")
    private static final boolean method266(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method263(arg1[var3], (byte) 115) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method267(false, arg1);
        while (arg0 >= 0) {
            field881 = !field881;
        }
        int var5 = 0;
        int var6 = field885.length - 1;
        if (field885[var5] == var4 || field885[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field885[var7] == var4) {
                return true;
            }
            if (var4 < field885[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!IXPHWLUO", name = "d", descriptor = "(Z[C)I")
    public static final int method267(boolean arg0, char[] arg1) {
        if (arg0) {
            return field884;
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
