import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GSWNKABU")
public class class17 {

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "I")
    private static int field682 = 53;

    @OriginalMember(owner = "client!GSWNKABU", name = "d", descriptor = "B")
    private static byte field685 = 7;

    @OriginalMember(owner = "client!GSWNKABU", name = "e", descriptor = "B")
    private static byte field686 = -38;

    @OriginalMember(owner = "client!GSWNKABU", name = "h", descriptor = "I")
    private static int field689 = -4614;

    @OriginalMember(owner = "client!GSWNKABU", name = "o", descriptor = "[Ljava/lang/String;")
    private static final String[] field696 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!GSWNKABU", name = "f", descriptor = "I")
    private static int field687;

    @OriginalMember(owner = "client!GSWNKABU", name = "g", descriptor = "I")
    private static int field688;

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "Z")
    private static boolean field683;

    @OriginalMember(owner = "client!GSWNKABU", name = "c", descriptor = "Z")
    private static boolean field684;

    @OriginalMember(owner = "client!GSWNKABU", name = "p", descriptor = "Z")
    public static boolean field697;

    @OriginalMember(owner = "client!GSWNKABU", name = "i", descriptor = "[I")
    private static int[] field690;

    @OriginalMember(owner = "client!GSWNKABU", name = "n", descriptor = "[I")
    private static int[] field695;

    @OriginalMember(owner = "client!GSWNKABU", name = "j", descriptor = "[[C")
    private static char[][] field691;

    @OriginalMember(owner = "client!GSWNKABU", name = "l", descriptor = "[[C")
    private static char[][] field693;

    @OriginalMember(owner = "client!GSWNKABU", name = "m", descriptor = "[[C")
    private static char[][] field694;

    @OriginalMember(owner = "client!GSWNKABU", name = "k", descriptor = "[[[B")
    private static byte[][][] field692;

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(LAKPFVPPG;)V")
    public static final void method254(class2 arg0) {
        class13 var1 = new class13(arg0.method7("fragmentsenc.txt", null), (byte) 3);
        class13 var2 = new class13(arg0.method7("badenc.txt", null), (byte) 3);
        class13 var3 = new class13(arg0.method7("domainenc.txt", null), (byte) 3);
        class13 var4 = new class13(arg0.method7("tldlist.txt", null), (byte) 3);
        method255(var1, var2, var3, var4);
        if (class41.field1195) {
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(LFTMSICIZ;LFTMSICIZ;LFTMSICIZ;LFTMSICIZ;)V")
    private static final void method255(class13 arg0, class13 arg1, class13 arg2, class13 arg3) {
        method257(arg1, 71);
        method258(arg2, (byte) 6);
        method259(0, arg0);
        method256(arg3, 48543);
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(LFTMSICIZ;I)V")
    private static final void method256(class13 arg0, int arg1) {
        if (arg1 != 48543) {
            field682 = -487;
        }
        int var2 = arg0.method218();
        field694 = new char[var2][];
        field695 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field695[var3] = arg0.method213();
            char[] var4 = new char[arg0.method213()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method213();
            }
            field694[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(LFTMSICIZ;I)V")
    private static final void method257(class13 arg0, int arg1) {
        int var2 = arg0.method218();
        field691 = new char[var2][];
        if (arg1 <= 0) {
            field684 = !field684;
        }
        field692 = new byte[var2][][];
        method260(field691, arg0, field685, field692);
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(LFTMSICIZ;B)V")
    private static final void method258(class13 arg0, byte arg1) {
        int var2 = arg0.method218();
        field693 = new char[var2][];
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        method261((byte) -38, arg0, field693);
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ILFTMSICIZ;)V")
    private static final void method259(int arg0, class13 arg1) {
        field690 = new int[arg1.method218()];
        for (int var2 = 0; var2 < field690.length; var2++) {
            field690[var2] = arg1.method215();
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([[CLFTMSICIZ;B[[[B)V")
    private static final void method260(char[][] arg0, class13 arg1, byte arg2, byte[][][] arg3) {
        if (arg2 != 7) {
            field682 = -242;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg1.method213()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method213();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg1.method213()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method213();
                var7[var8][1] = (byte) arg1.method213();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(BLFTMSICIZ;[[C)V")
    private static final void method261(byte arg0, class13 arg1, char[][] arg2) {
        if (field686 != arg0) {
            field684 = !field684;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method213()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method213();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(I[C)V")
    private static final void method262(int arg0, char[] arg1) {
        if (arg0 != 0) {
            field682 = 414;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method263(arg1[var3], 0)) {
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

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CI)Z")
    private static final boolean method263(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method264(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method262(field687, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        String var8 = var5.toLowerCase();
        method272(0, var6);
        method267(false, var6);
        method268(false, var6);
        method281(20408, var6);
        for (int var9 = 0; var9 < field696.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field696[var9], var12 + 1)) != -1) {
                char[] var13 = field696[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method265(var5.toCharArray(), var6, 611);
        method266(var6, (byte) -97);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([C[CI)V")
    private static final void method265(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method289(arg0[var3], (byte) 9)) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CB)V")
    private static final void method266(char[] arg0, byte arg1) {
        if (arg1 != -97) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method286(var5, true)) {
                var3 = true;
            } else if (var3) {
                if (method288(var5, 8717)) {
                    var3 = false;
                }
            } else if (method289(var5, (byte) 9)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Z[C)V")
    private static final void method267(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field691.length - 1; var4 >= 0; var4--) {
                method276(arg1, field691[var4], 0, field692[var4]);
            }
        }
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(Z[C)V")
    private static final void method268(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method276(var2, var3, 0, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg0) {
            field684 = !field684;
        }
        method276(var4, var5, 0, null);
        for (int var6 = field693.length - 1; var6 >= 0; var6--) {
            method269(var4, (byte) -17, field693[var6], var2, arg1);
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CB[C[C[C)V")
    private static final void method269(char[] arg0, byte arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1 != -17 || arg2.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg2.length; var6 += var9) {
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
                    if (var8 < arg2.length && (var13 = method278(344, arg2[var8], var11, var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method278(344, arg2[var8 - 1], var11, var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method284(var11, -428)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method270(var6, arg4, -4614, arg3);
                int var17 = method271((byte) -119, arg0, var7 - 1, arg4);
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

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(I[CI[C)I")
    private static final int method270(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method284(arg1[var4], -428); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method284(arg3[var6], -428); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (field689 != arg2) {
            field683 = !field683;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method284(arg1[arg0 - 1], -428)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(B[CI[C)I")
    private static final int method271(byte arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 != -119) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var5 = arg2 + 1;
        while (true) {
            if (var5 < arg3.length && method284(arg3[var5], -428)) {
                if (arg3[var5] != '.' && arg3[var5] != ',') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg3.length && method284(arg1[var7], -428); var7++) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method284(arg3[arg2 + 1], -428)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(I[C)V")
    private static final void method272(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method276(var2, var3, 0, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg0 < 0 || arg0 > 0) {
            field684 = !field684;
        }
        method276(var4, var5, 0, null);
        for (int var6 = 0; var6 < field694.length; var6++) {
            method273(arg1, var2, var4, field694[var6], (byte) 2, field695[var6]);
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([C[C[C[CBI)V")
    private static final void method273(char[] arg0, char[] arg1, char[] arg2, char[] arg3, byte arg4, int arg5) {
        if (arg4 != 2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg0.length - arg3.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label129: while (true) {
                while (true) {
                    if (var9 >= arg0.length) {
                        break label129;
                    }
                    boolean var12 = false;
                    char var13 = arg0[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg0.length) {
                        var14 = arg0[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg3.length && (var15 = method278(344, arg3[var10], var13, var14)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label129;
                        }
                        int var16;
                        if ((var16 = method278(344, arg3[var10 - 1], var13, var14)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg3.length || !method284(var13, -428)) {
                                break label129;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg3.length) {
                boolean var17 = false;
                int var18 = method274(arg0, var8, -654, arg1);
                int var19 = method275(arg2, var9 - 1, arg0, true);
                if (arg5 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg5 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg5 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg5 == 3 && var18 > 2 && var19 > 0) {
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
                                if (method284(arg0[var25], -428)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method284(arg0[var25], -428)) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg0.length; var27++) {
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
                        for (int var29 = var21 + 1; var29 < arg0.length; var29++) {
                            if (var28) {
                                if (method284(arg0[var29], -428)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method284(arg0[var29], -428)) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg0[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CII[C)I")
    private static final int method274(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method284(arg0[var4], -428)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 >= 0) {
                field687 = 343;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method284(arg3[var6], -428); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method284(arg0[arg1 - 1], -428)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CI[CZ)I")
    private static final int method275(char[] arg0, int arg1, char[] arg2, boolean arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method284(arg2[var4], -428)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (!arg3) {
                field684 = !field684;
            }
            for (int var6 = arg1 + 1; var6 < arg2.length && method284(arg0[var6], -428); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method284(arg2[arg1 + 1], -428)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([C[CI[[B)V")
    public static final void method276(char[] arg0, char[] arg1, int arg2, byte[][] arg3) {
        if (arg2 != 0) {
            field683 = !field683;
        }
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
            label172: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label172;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method279(var15, var14, 132, arg1[var7])) > 0) {
                        if (var16 == 1 && method287(0, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method287(0, var14) || method287(0, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method279(var15, var14, 132, arg1[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method285(6018, var14)) {
                                break label172;
                            }
                            if (method284(var14, -428) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method287(0, var14)) {
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
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method284(arg0[var5 - 1], -428) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method284(arg0[var6], -428) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method284(arg0[var26], -428) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method284(arg0[var26 + var28], -428) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method284(arg0[var26 - 1], -428) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method290(var27, false)) {
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
                    byte var21 = method280(true, var19);
                    byte var22 = method280(true, var20);
                    if (arg3 != null && method277(-14002, var22, arg3, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method287(0, arg0[var33])) {
                            var30++;
                        } else if (method286(arg0[var33], true)) {
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
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(IB[[BB)Z")
    private static final boolean method277(int arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg3 && arg2[var4][1] == arg1) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg0 != -14002) {
            field684 = !field684;
        }
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg3 && arg2[var6][1] == arg1) {
                return true;
            }
            if (arg3 < arg2[var6][0] || arg2[var6][0] == arg3 && arg1 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ICCC)I")
    private static final int method278(int arg0, char arg1, char arg2, char arg3) {
        int var4 = 11 / arg0;
        if (arg1 == arg2) {
            return 1;
        } else if (arg1 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg2 == '(' && arg3 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg1 == 's' && arg2 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CCIC)I")
    private static final int method279(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 <= 0) {
            return field687;
        } else if (arg1 == arg3) {
            return 1;
        } else {
            if (arg3 >= 'a' && arg3 <= 'm') {
                if (arg3 == 'a') {
                    if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                        if (arg1 == '/' && arg0 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'b') {
                    if (arg1 != '6' && arg1 != '8') {
                        if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
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
                    if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
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
                    if (arg1 == 'p' && arg0 == 'h') {
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
                        if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
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
                    if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'v') {
                    if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'w') {
                    if (arg1 == 'v' && arg0 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg3 == 'x') {
                    if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
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
                    } else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
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
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ZC)B")
    private static final byte method280(boolean arg0, char arg1) {
        if (!arg0) {
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

    @OriginalMember(owner = "client!GSWNKABU", name = "c", descriptor = "(I[C)V")
    private static final void method281(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 != 20408) {
            field682 = -242;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method282(false, var3, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method284(arg1[var8], -428) && !method285(6018, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method283(true, arg1, var6);
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

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(ZI[C)I")
    private static final int method282(boolean arg0, int arg1, char[] arg2) {
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(Z[CI)I")
    private static final int method283(boolean arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (!arg0) {
                field682 = -333;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(CI)Z")
    private static final boolean method284(char arg0, int arg1) {
        if (arg1 >= 0) {
            field682 = 416;
        }
        return !method286(arg0, true) && !method287(0, arg0);
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(IC)Z")
    private static final boolean method285(int arg0, char arg1) {
        if (arg0 != 6018) {
            field688 = -478;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CZ)Z")
    private static final boolean method286(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "(IC)Z")
    private static final boolean method287(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "c", descriptor = "(CI)Z")
    private static final boolean method288(char arg0, int arg1) {
        if (arg1 != 8717) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "(CB)Z")
    private static final boolean method289(char arg0, byte arg1) {
        if (arg1 != 9) {
            field683 = !field683;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "a", descriptor = "([CZ)Z")
    private static final boolean method290(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method287(0, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method291(arg0, (byte) 10);
        int var5 = 0;
        int var6 = field690.length - 1;
        if (arg1) {
            throw new NullPointerException();
        } else if (field690[var5] == var4 || field690[var6] == var4) {
            return true;
        } else {
            do {
                int var7 = (var5 + var6) / 2;
                if (field690[var7] == var4) {
                    return true;
                }
                if (var4 < field690[var7]) {
                    var6 = var7;
                } else {
                    var5 = var7;
                }
            } while (var5 != var6 && var5 + 1 != var6);
            return false;
        }
    }

    @OriginalMember(owner = "client!GSWNKABU", name = "b", descriptor = "([CB)I")
    public static final int method291(char[] arg0, byte arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != 10) {
            return field682;
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
