import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EZWZJZNN")
public class class16 {

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "I")
    private static int field682 = 1;

    @OriginalMember(owner = "EZWZJZNN", name = "d", descriptor = "Z")
    private static boolean field685 = true;

    @OriginalMember(owner = "EZWZJZNN", name = "f", descriptor = "Z")
    private static boolean field687 = true;

    @OriginalMember(owner = "EZWZJZNN", name = "n", descriptor = "[Ljava/lang/String;")
    private static final String[] field695 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "I")
    private static int field683;

    @OriginalMember(owner = "EZWZJZNN", name = "e", descriptor = "I")
    private static int field686;

    @OriginalMember(owner = "EZWZJZNN", name = "c", descriptor = "Z")
    private static boolean field684;

    @OriginalMember(owner = "EZWZJZNN", name = "g", descriptor = "Z")
    private static boolean field688;

    @OriginalMember(owner = "EZWZJZNN", name = "o", descriptor = "Z")
    public static boolean field696;

    @OriginalMember(owner = "EZWZJZNN", name = "h", descriptor = "[I")
    private static int[] field689;

    @OriginalMember(owner = "EZWZJZNN", name = "m", descriptor = "[I")
    private static int[] field694;

    @OriginalMember(owner = "EZWZJZNN", name = "i", descriptor = "[[C")
    private static char[][] field690;

    @OriginalMember(owner = "EZWZJZNN", name = "k", descriptor = "[[C")
    private static char[][] field692;

    @OriginalMember(owner = "EZWZJZNN", name = "l", descriptor = "[[C")
    private static char[][] field693;

    @OriginalMember(owner = "EZWZJZNN", name = "j", descriptor = "[[[B")
    private static byte[][][] field691;

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(LQKFGLETG;)V")
    public static final void method206(class50 arg0) {
        class68 var1 = new class68((byte) 9, arg0.method402("fragmentsenc.txt", null));
        class68 var2 = new class68((byte) 9, arg0.method402("badenc.txt", null));
        class68 var3 = new class68((byte) 9, arg0.method402("domainenc.txt", null));
        class68 var4 = new class68((byte) 9, arg0.method402("tldlist.txt", null));
        method207(var1, var2, var3, var4);
        if (class47.field1218) {
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(LXJCNBMKS;LXJCNBMKS;LXJCNBMKS;LXJCNBMKS;)V")
    private static final void method207(class68 arg0, class68 arg1, class68 arg2, class68 arg3) {
        method209(false, arg1);
        method210(26969, arg2);
        method211(true, arg0);
        method208(3, arg3);
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(ILXJCNBMKS;)V")
    private static final void method208(int arg0, class68 arg1) {
        int var2 = arg1.method539();
        field693 = new char[var2][];
        if (arg0 != 3) {
            return;
        }
        field694 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field694[var3] = arg1.method534();
            char[] var4 = new char[arg1.method534()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method534();
            }
            field693[var3] = var4;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(ZLXJCNBMKS;)V")
    private static final void method209(boolean arg0, class68 arg1) {
        int var2 = arg1.method539();
        field690 = new char[var2][];
        field691 = new byte[var2][][];
        if (!arg0) {
            method212(field690, arg1, field691, (byte) 33);
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "(ILXJCNBMKS;)V")
    private static final void method210(int arg0, class68 arg1) {
        int var2 = arg1.method539();
        field692 = new char[var2][];
        method213(field692, arg1, 453);
        if (arg0 != 26969) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "(ZLXJCNBMKS;)V")
    private static final void method211(boolean arg0, class68 arg1) {
        field689 = new int[arg1.method539()];
        for (int var2 = 0; var2 < field689.length; var2++) {
            field689[var2] = arg1.method536();
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([[CLXJCNBMKS;[[[BB)V")
    private static final void method212(char[][] arg0, class68 arg1, byte[][][] arg2, byte arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var6 = new char[arg1.method534()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg1.method534();
            }
            arg0[var4] = var6;
            byte[][] var8 = new byte[arg1.method534()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg1.method534();
                var8[var9][1] = (byte) arg1.method534();
            }
            if (var8.length > 0) {
                arg2[var4] = var8;
            }
        }
        if (arg3 != 33) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([[CLXJCNBMKS;I)V")
    private static final void method213(char[][] arg0, class68 arg1, int arg2) {
        int var3 = 28 / arg2;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg1.method534()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method534();
            }
            arg0[var4] = var5;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CZ)V")
    private static final void method214(char[] arg0, boolean arg1) {
        int var2 = 0;
        if (arg1) {
            field688 = !field688;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method215(896, arg0[var3])) {
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

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(IC)Z")
    private static final boolean method215(int arg0, char arg1) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method216(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        if (arg1 != 0) {
            field688 = !field688;
        }
        char[] var4 = arg0.toCharArray();
        method214(var4, false);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method224(0, var6);
        method219(var6, 204);
        method220(-957, var6);
        method233(var6, (byte) 4);
        for (int var8 = 0; var8 < field695.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field695[var8], var11 + 1)) != -1) {
                char[] var12 = field695[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method217(var6, field686, var5.toCharArray());
        method218(var6, 0);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CI[C)V")
    private static final void method217(char[] arg0, int arg1, char[] arg2) {
        if (arg1 != 0) {
            field683 = -42;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method241(-596, arg2[var3])) {
                arg0[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CI)V")
    private static final void method218(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 != 0) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method238(953, var4)) {
                var2 = true;
            } else if (var2) {
                if (method240(937, var4)) {
                    var2 = false;
                }
            } else if (method241(-596, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "([CI)V")
    private static final void method219(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field690.length - 1; var3 >= 0; var3--) {
                method228(field691[var3], arg0, field690[var3], (byte) -1);
            }
        }
        if (arg1 <= 0) {
            field687 = true;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(I[C)V")
    private static final void method220(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method228(null, var2, var3, (byte) -1);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method228(null, var4, var5, (byte) -1);
        if (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = field692.length - 1; var7 >= 0; var7--) {
            method221(var2, arg1, true, var4, field692[var7]);
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([C[CZ[C[C)V")
    private static final void method221(char[] arg0, char[] arg1, boolean arg2, char[] arg3, char[] arg4) {
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg4.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg1.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label62: while (true) {
                while (true) {
                    if (var8 >= arg1.length) {
                        break label62;
                    }
                    boolean var11 = false;
                    char var12 = arg1[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg1.length) {
                        var13 = arg1[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method230(var12, var13, -941, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method230(var12, var13, -941, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method236(var12, 0)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method222(var7, arg0, 0, arg1);
                int var18 = method223(arg3, var8 - 1, 167, arg1);
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

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(I[CI[C)I")
    private static final int method222(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method236(arg3[var4], 0); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method236(arg1[var6], 0); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (arg2 != 0) {
            field684 = !field684;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method236(arg3[arg0 - 1], 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CII[C)I")
    private static final int method223(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method236(arg3[var4], 0)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg2 <= 0) {
                field684 = !field684;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method236(arg0[var6], 0); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method236(arg3[arg1 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "(I[C)V")
    private static final void method224(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method228(null, var2, var3, (byte) -1);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg0 == 0) {
            method228(null, var4, var5, (byte) -1);
            for (int var6 = 0; var6 < field693.length; var6++) {
                method225(2, field694[var6], arg1, var2, field693[var6], var4);
            }
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(II[C[C[C[C)V")
    private static final void method225(int arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg2.length - arg4.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label129: while (true) {
                while (true) {
                    if (var9 >= arg2.length) {
                        break label129;
                    }
                    boolean var12 = false;
                    char var13 = arg2[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg2.length) {
                        var14 = arg2[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg4.length && (var15 = method230(var13, var14, -941, arg4[var10])) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label129;
                        }
                        int var16;
                        if ((var16 = method230(var13, var14, -941, arg4[var10 - 1])) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg4.length || !method236(var13, 0)) {
                                break label129;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg4.length) {
                boolean var17 = false;
                int var18 = method226(arg2, var8, 0, arg3);
                int var19 = method227(var9 - 1, 32410, arg5, arg2);
                if (arg1 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg1 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg1 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg1 == 3 && var18 > 2 && var19 > 0) {
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
                                    if (arg3[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg3[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method236(arg2[var25], 0)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method236(arg2[var25], 0)) {
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
                                    if (arg5[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg5[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg2.length; var29++) {
                            if (var28) {
                                if (method236(arg2[var29], 0)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method236(arg2[var29], 0)) {
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
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "([CII[C)I")
    private static final int method226(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method236(arg0[var4], 0)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 != 0) {
                field687 = true;
            }
            for (int var6 = arg1 - 1; var6 >= 0 && method236(arg3[var6], 0); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method236(arg0[arg1 - 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(II[C[C)I")
    private static final int method227(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 != 32410) {
            return field682;
        } else if (arg0 + 1 == arg3.length) {
            return 2;
        } else {
            int var4 = arg0 + 1;
            while (true) {
                if (var4 < arg3.length && method236(arg3[var4], 0)) {
                    if (arg3[var4] != '\\' && arg3[var4] != '/') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg0 + 1; var6 < arg3.length && method236(arg2[var6], 0); var6++) {
                    if (arg2[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 5) {
                    return 4;
                }
                if (method236(arg3[arg0 + 1], 0)) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([[B[C[CB)V")
    public static final void method228(byte[][] arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var9) {
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
                    if (var7 < arg2.length && (var16 = method231(0, var15, arg2[var7], var14)) > 0) {
                        if (var16 == 1 && method239(var14, 707)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method239(var14, 707) || method239(var15, 707))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method231(0, var15, arg2[var7 - 1], var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method237(true, var14)) {
                                break label172;
                            }
                            if (method236(var14, 0) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method239(var14, 707)) {
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
            if (var7 >= arg2.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method236(arg1[var5 - 1], 0) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method236(arg1[var6], 0) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method236(arg1[var26], 0) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method236(arg1[var26 + var28], 0) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method236(arg1[var26 - 1], 0) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method242(718, var27)) {
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
                    byte var21 = method232(-361, var19);
                    byte var22 = method232(-361, var20);
                    if (arg0 != null && method229(var21, (byte) -124, var22, arg0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method239(arg1[var33], 707)) {
                            var30++;
                        } else if (method238(953, arg1[var33])) {
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
        if (arg3 != -1) {
            field688 = !field688;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(BBB[[B)Z")
    private static final boolean method229(byte arg0, byte arg1, byte arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg3[var4][0] == arg0 && arg3[var4][1] == arg2) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg1 != -124) {
            field685 = !field685;
        }
        if (arg3[var5][0] == arg0 && arg3[var5][1] == arg2) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg3[var6][0] == arg0 && arg3[var6][1] == arg2) {
                return true;
            }
            if (arg0 < arg3[var6][0] || arg3[var6][0] == arg0 && arg2 < arg3[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(CCIC)I")
    private static final int method230(char arg0, char arg1, int arg2, char arg3) {
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
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

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(ICCC)I")
    private static final int method231(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            return 3;
        } else if (arg2 == arg3) {
            return 1;
        } else {
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
                        if ((arg3 != '(' || arg1 != ')') && (arg3 != '[' || arg1 != ']') && (arg3 != '{' || arg1 != '}') && (arg3 != '<' || arg1 != '>')) {
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
                    if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
                        return 0;
                    }
                    return 2;
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
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "(IC)B")
    private static final byte method232(int arg0, char arg1) {
        while (arg0 >= 0) {
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

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CB)V")
    private static final void method233(char[] arg0, byte arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 != 4) {
            field685 = !field685;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method234(arg0, var3, 0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method236(arg0[var8], 0) && !method237(true, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method235(arg0, var6, true);
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

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CII)I")
    private static final int method234(char[] arg0, int arg1, int arg2) {
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        if (arg2 != 0) {
            field688 = !field688;
        }
        return -1;
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "([CIZ)I")
    private static final int method235(char[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return 3;
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

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(CI)Z")
    private static final boolean method236(char arg0, int arg1) {
        if (arg1 != 0) {
            field683 = 398;
        }
        return !method238(953, arg0) && !method239(arg0, 707);
    }

    @OriginalMember(owner = "EZWZJZNN", name = "a", descriptor = "(ZC)Z")
    private static final boolean method237(boolean arg0, char arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "EZWZJZNN", name = "c", descriptor = "(IC)Z")
    private static final boolean method238(int arg0, char arg1) {
        int var2 = 47 / arg0;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "(CI)Z")
    private static final boolean method239(char arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "EZWZJZNN", name = "d", descriptor = "(IC)Z")
    private static final boolean method240(int arg0, char arg1) {
        int var2 = 8 / arg0;
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "EZWZJZNN", name = "e", descriptor = "(IC)Z")
    private static final boolean method241(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "EZWZJZNN", name = "c", descriptor = "(I[C)Z")
    private static final boolean method242(int arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 <= 0) {
            field684 = !field684;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method239(arg1[var3], 707) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method243(arg1, false);
        int var5 = 0;
        int var6 = field689.length - 1;
        if (field689[var5] == var4 || field689[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field689[var7] == var4) {
                return true;
            }
            if (var4 < field689[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "EZWZJZNN", name = "b", descriptor = "([CZ)I")
    public static final int method243(char[] arg0, boolean arg1) {
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
        if (arg1) {
            return 0;
        } else {
            return var2;
        }
    }
}
