import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZTOXLNJM")
public class class72 {

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "Z")
    private static boolean field1737 = true;

    @OriginalMember(owner = "ZTOXLNJM", name = "d", descriptor = "Z")
    private static boolean field1740 = true;

    @OriginalMember(owner = "ZTOXLNJM", name = "e", descriptor = "I")
    private static int field1741 = 3;

    @OriginalMember(owner = "ZTOXLNJM", name = "f", descriptor = "I")
    private static int field1742 = -29;

    @OriginalMember(owner = "ZTOXLNJM", name = "g", descriptor = "I")
    private static int field1743 = -37804;

    @OriginalMember(owner = "ZTOXLNJM", name = "h", descriptor = "I")
    private static int field1744 = 5;

    @OriginalMember(owner = "ZTOXLNJM", name = "i", descriptor = "I")
    private static int field1745 = -601;

    @OriginalMember(owner = "ZTOXLNJM", name = "j", descriptor = "I")
    private static int field1746 = 1;

    @OriginalMember(owner = "ZTOXLNJM", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1753 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "I")
    private static int field1738;

    @OriginalMember(owner = "ZTOXLNJM", name = "c", descriptor = "Z")
    private static boolean field1739;

    @OriginalMember(owner = "ZTOXLNJM", name = "r", descriptor = "Z")
    public static boolean field1754;

    @OriginalMember(owner = "ZTOXLNJM", name = "k", descriptor = "[I")
    private static int[] field1747;

    @OriginalMember(owner = "ZTOXLNJM", name = "p", descriptor = "[I")
    private static int[] field1752;

    @OriginalMember(owner = "ZTOXLNJM", name = "l", descriptor = "[[C")
    private static char[][] field1748;

    @OriginalMember(owner = "ZTOXLNJM", name = "n", descriptor = "[[C")
    private static char[][] field1750;

    @OriginalMember(owner = "ZTOXLNJM", name = "o", descriptor = "[[C")
    private static char[][] field1751;

    @OriginalMember(owner = "ZTOXLNJM", name = "m", descriptor = "[[[B")
    private static byte[][][] field1749;

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(LMJLXHQTQ;)V")
    public static final void method561(class44 arg0) {
        class69 var1 = new class69(arg0.method317("fragmentsenc.txt", null), -82);
        class69 var2 = new class69(arg0.method317("badenc.txt", null), -82);
        class69 var3 = new class69(arg0.method317("domainenc.txt", null), -82);
        class69 var4 = new class69(arg0.method317("tldlist.txt", null), -82);
        method562(var1, var2, var3, var4);
        if (class54.field1301) {
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(LXGRGMPUQ;LXGRGMPUQ;LXGRGMPUQ;LXGRGMPUQ;)V")
    private static final void method562(class69 arg0, class69 arg1, class69 arg2, class69 arg3) {
        method564(false, arg1);
        method565(-2263, arg2);
        method566(-375, arg0);
        method563(2, arg3);
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(ILXGRGMPUQ;)V")
    private static final void method563(int arg0, class69 arg1) {
        if (arg0 < 2 || arg0 > 2) {
            field1738 = 432;
        }
        int var2 = arg1.method470();
        field1751 = new char[var2][];
        field1752 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1752[var3] = arg1.method465();
            char[] var4 = new char[arg1.method465()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method465();
            }
            field1751[var3] = var4;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    private static final void method564(boolean arg0, class69 arg1) {
        int var2 = arg1.method470();
        field1748 = new char[var2][];
        field1749 = new byte[var2][][];
        method567(field1748, field1749, arg1, -996);
        if (arg0) {
            field1745 = -274;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "(ILXGRGMPUQ;)V")
    private static final void method565(int arg0, class69 arg1) {
        int var2 = arg1.method470();
        field1750 = new char[var2][];
        if (arg0 != -2263) {
            field1739 = true;
        }
        method568(arg1, 0, field1750);
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "c", descriptor = "(ILXGRGMPUQ;)V")
    private static final void method566(int arg0, class69 arg1) {
        field1747 = new int[arg1.method470()];
        while (arg0 >= 0) {
            field1743 = 381;
        }
        for (int var2 = 0; var2 < field1747.length; var2++) {
            field1747[var2] = arg1.method467();
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([[C[[[BLXGRGMPUQ;I)V")
    private static final void method567(char[][] arg0, byte[][][] arg1, class69 arg2, int arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method465()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method465();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method465()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method465();
                var7[var8][1] = (byte) arg2.method465();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg3 >= 0) {
            field1746 = 459;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(LXGRGMPUQ;I[[C)V")
    private static final void method568(class69 arg0, int arg1, char[][] arg2) {
        if (arg1 != 0) {
            field1738 = 104;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method465()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method465();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([CI)V")
    private static final void method569(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method570(arg0[var3], (byte) 3)) {
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
        if (arg1 <= 0) {
            field1745 = 332;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(CB)Z")
    private static final boolean method570(char arg0, byte arg1) {
        if (arg1 == 3) {
            boolean var2 = false;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method571(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        char[] var5 = arg1.toCharArray();
        method569(var5, 281);
        String var6 = (new String(var5)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method579(var7, 0);
        method574(var7, 317);
        method575(false, var7);
        method588(false, var7);
        for (int var9 = 0; var9 < field1753.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1753[var9], var12 + 1)) != -1) {
                char[] var13 = field1753[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method572(var6.toCharArray(), var7, 0);
        method573((byte) 38, var7);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([C[CI)V")
    private static final void method572(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method596(arg0[var3], (byte) -94)) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2 != 0) {
            field1745 = 290;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(B[C)V")
    private static final void method573(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 != 38) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method593(false, var4)) {
                var2 = true;
            } else if (var2) {
                if (method595(0, var4)) {
                    var2 = false;
                }
            } else if (method596(var4, (byte) -94)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "([CI)V")
    private static final void method574(char[] arg0, int arg1) {
        if (arg1 <= 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1748.length - 1; var3 >= 0; var3--) {
                method583(field1749[var3], 439, arg0, field1748[var3]);
            }
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(Z[C)V")
    private static final void method575(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method583(null, 439, var2, var3);
        char[] var4 = (char[]) arg1.clone();
        if (arg0) {
            field1739 = true;
        }
        char[] var5 = new char[] { 'd', 'o', 't' };
        method583(null, 439, var4, var5);
        for (int var6 = field1750.length - 1; var6 >= 0; var6--) {
            method576(var4, arg1, var2, 692, field1750[var6]);
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([C[C[CI[C)V")
    private static final void method576(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
        if (arg4.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        if (arg3 <= 0) {
            field1740 = !field1740;
        }
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg4.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label66: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label66;
                    }
                    boolean var10 = false;
                    char var11 = arg1[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg1.length) {
                        var12 = arg1[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg4.length && (var13 = method585(var12, arg4[var8], (byte) 83, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label66;
                        }
                        int var14;
                        if ((var14 = method585(var12, arg4[var8 - 1], (byte) 83, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method591(-37804, var11)) {
                                break label66;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method577(2, arg2, var6, arg1);
                int var17 = method578(0, var7 - 1, arg1, arg0);
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

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(I[CI[C)I")
    private static final int method577(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method591(-37804, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method591(-37804, arg1[var6]); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (arg0 < 2 || arg0 > 2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method591(-37804, arg3[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(II[C[C)I")
    private static final int method578(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 < 0 || arg0 > 0) {
            field1738 = -102;
        }
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method591(-37804, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg2.length && method591(-37804, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method591(-37804, arg2[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "c", descriptor = "([CI)V")
    private static final void method579(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 0) {
            return;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method583(null, 439, var2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method583(null, 439, var4, var5);
        for (int var6 = 0; var6 < field1751.length; var6++) {
            method580(field1751[var6], arg0, 3, var2, var4, field1752[var6]);
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([C[CI[C[CI)V")
    private static final void method580(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg1.length - arg0.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label139: while (true) {
                while (true) {
                    if (var9 >= arg1.length) {
                        break label139;
                    }
                    boolean var12 = false;
                    char var13 = arg1[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg1.length) {
                        var14 = arg1[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg0.length && (var15 = method585(var14, arg0[var10], (byte) 83, var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label139;
                        }
                        int var16;
                        if ((var16 = method585(var14, arg0[var10 - 1], (byte) 83, var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg0.length || !method591(-37804, var13)) {
                                break label139;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg0.length) {
                boolean var17 = false;
                int var18 = method581(arg1, arg3, 959, var7);
                int var19 = method582(arg1, field1742, arg4, var9 - 1);
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
                    int var20 = var7;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var7 - 1; var23 >= 0; var23--) {
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
                                if (method591(-37804, arg1[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method591(-37804, arg1[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg1.length; var27++) {
                                if (var26) {
                                    if (arg4[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg4[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg1.length; var29++) {
                            if (var28) {
                                if (method591(-37804, arg1[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method591(-37804, arg1[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg1[var30] = '*';
                    }
                }
            }
        }
        if (arg2 < field1741 || arg2 > field1741) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([C[CII)I")
    private static final int method581(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method591(-37804, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 <= 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg3 - 1; var7 >= 0 && method591(-37804, arg1[var7]); var7--) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method591(-37804, arg0[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([CI[CI)I")
    private static final int method582(char[] arg0, int arg1, char[] arg2, int arg3) {
        while (arg1 >= 0) {
            field1739 = true;
        }
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method591(-37804, arg0[var4])) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg0.length && method591(-37804, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method591(-37804, arg0[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([[BI[C[C)V")
    public static final void method583(byte[][] arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg3.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label172: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label172;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg3.length && (var16 = method586(5, arg3[var7], var14, var15)) > 0) {
                        if (var16 == 1 && method594(var14, true)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method594(var14, true) || method594(var15, true))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method586(5, arg3[var7 - 1], var14, var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method592(var14, 5)) {
                                break label172;
                            }
                            if (method591(-37804, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method594(var14, true)) {
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
                    if (var5 - 1 < 0 || method591(-37804, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method591(-37804, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method591(-37804, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method591(-37804, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method591(-37804, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method597((byte) 2, var27)) {
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
                        var19 = arg2[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg2.length) {
                        var20 = arg2[var6];
                    }
                    byte var21 = method587((byte) -22, var19);
                    byte var22 = method587((byte) -22, var20);
                    if (arg0 != null && method584(arg0, var22, false, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method594(arg2[var33], true)) {
                            var30++;
                        } else if (method593(false, arg2[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg2[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
        if (arg1 <= 0) {
            field1740 = !field1740;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([[BBZB)Z")
    private static final boolean method584(byte[][] arg0, byte arg1, boolean arg2, byte arg3) {
        if (arg2) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg0[var4][0] == arg3 && arg0[var4][1] == arg1) {
            return true;
        }
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

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(CCBC)I")
    private static final int method585(char arg0, char arg1, byte arg2, char arg3) {
        if (arg2 != 83) {
            return field1742;
        } else if (arg1 == arg3) {
            return 1;
        } else if (arg1 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg3 == '(' && arg0 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg1 == 's' && arg3 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(ICCC)I")
    private static final int method586(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 < 5 || arg0 > 5) {
            field1740 = !field1740;
        }
        if (arg1 == arg2) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg3 != '3') && (arg2 != 'i' || arg3 != '3')) {
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
                if ((arg2 != '[' || arg3 != ')') && (arg2 != 'i' || arg3 != ')')) {
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
                if (arg2 == 'p' && arg3 == 'h') {
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
                    if ((arg2 != '(' || arg3 != ')') && (arg2 != '[' || arg3 != ']') && (arg2 != '{' || arg3 != '}') && (arg2 != '<' || arg3 != '>')) {
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
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'v') {
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg2 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg2 != ')' || arg3 != '(') && (arg2 != '}' || arg3 != '{') && (arg2 != ']' || arg3 != '[') && (arg2 != '>' || arg3 != '<')) {
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
                } else if ((arg2 != '(' || arg3 != ')') && (arg2 != '{' || arg3 != '}') && (arg2 != '[' || arg3 != ']')) {
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

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(BC)B")
    private static final byte method587(byte arg0, char arg1) {
        if (arg0 != -22) {
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

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "(Z[C)V")
    private static final void method588(boolean arg0, char[] arg1) {
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
                if ((var6 = method589(arg1, false, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method591(-37804, arg1[var8]) && !method592(arg1[var8], 5)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method590(arg1, (byte) 33, var6);
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

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([CZI)I")
    private static final int method589(char[] arg0, boolean arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "([CBI)I")
    private static final int method590(char[] arg0, byte arg1, int arg2) {
        if (arg1 != 33) {
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

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(IC)Z")
    private static final boolean method591(int arg0, char arg1) {
        if (field1743 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method593(false, arg1) && !method594(arg1, true);
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(CI)Z")
    private static final boolean method592(char arg0, int arg1) {
        if (field1744 != arg1) {
            field1737 = !field1737;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(ZC)Z")
    private static final boolean method593(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "a", descriptor = "(CZ)Z")
    private static final boolean method594(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "(IC)Z")
    private static final boolean method595(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "(CB)Z")
    private static final boolean method596(char arg0, byte arg1) {
        if (arg1 != -94) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "b", descriptor = "(B[C)Z")
    private static final boolean method597(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method594(arg1[var3], true) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method598(arg1, -15611);
        int var5 = 0;
        if (arg0 != 2) {
            field1740 = !field1740;
        }
        int var6 = field1747.length - 1;
        if (field1747[var5] == var4 || field1747[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1747[var7] == var4) {
                return true;
            }
            if (var4 < field1747[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "ZTOXLNJM", name = "d", descriptor = "([CI)I")
    public static final int method598(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != -15611) {
            return 1;
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
