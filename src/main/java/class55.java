import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UIPOGFJQ")
public class class55 {

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "I")
    private static int field1468 = 340;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "Z")
    private static boolean field1469 = true;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "d", descriptor = "I")
    private static int field1471 = 418;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "f", descriptor = "I")
    private static int field1473 = 3;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "g", descriptor = "I")
    private static int field1474 = 24;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "h", descriptor = "I")
    private static int field1475 = 78;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "o", descriptor = "[Ljava/lang/String;")
    private static final String[] field1482 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!UIPOGFJQ", name = "e", descriptor = "B")
    private static byte field1472;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "c", descriptor = "Z")
    private static boolean field1470;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "p", descriptor = "Z")
    public static boolean field1483;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "i", descriptor = "[I")
    private static int[] field1476;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "n", descriptor = "[I")
    private static int[] field1481;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "j", descriptor = "[[C")
    private static char[][] field1477;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "l", descriptor = "[[C")
    private static char[][] field1479;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "m", descriptor = "[[C")
    private static char[][] field1480;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "k", descriptor = "[[[B")
    private static byte[][][] field1478;

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(LWEMOPWVJ;)V")
    public static final void method502(class62 arg0) {
        class52 var1 = new class52(arg0.method559("fragmentsenc.txt", null), true);
        class52 var2 = new class52(arg0.method559("badenc.txt", null), true);
        class52 var3 = new class52(arg0.method559("domainenc.txt", null), true);
        class52 var4 = new class52(arg0.method559("tldlist.txt", null), true);
        method503(var1, var2, var3, var4);
        if (class31.field984) {
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(LSVWJKJVI;LSVWJKJVI;LSVWJKJVI;LSVWJKJVI;)V")
    private static final void method503(class52 arg0, class52 arg1, class52 arg2, class52 arg3) {
        method505(-44719, arg1);
        method506(arg2, -8470);
        method507(arg0, field1470);
        method504(227, arg3);
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(ILSVWJKJVI;)V")
    private static final void method504(int arg0, class52 arg1) {
        int var2 = arg1.method466();
        field1480 = new char[var2][];
        int var3 = 95 / arg0;
        field1481 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1481[var4] = arg1.method461();
            char[] var5 = new char[arg1.method461()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method461();
            }
            field1480[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(ILSVWJKJVI;)V")
    private static final void method505(int arg0, class52 arg1) {
        int var2 = arg1.method466();
        field1477 = new char[var2][];
        field1478 = new byte[var2][][];
        method508(arg1, field1477, 418, field1478);
        if (arg0 != -44719) {
            field1468 = 116;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(LSVWJKJVI;I)V")
    private static final void method506(class52 arg0, int arg1) {
        int var2 = arg0.method466();
        field1479 = new char[var2][];
        if (arg1 == -8470) {
            method509(arg0, true, field1479);
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(LSVWJKJVI;Z)V")
    private static final void method507(class52 arg0, boolean arg1) {
        field1476 = new int[arg0.method466()];
        for (int var2 = 0; var2 < field1476.length; var2++) {
            field1476[var2] = arg0.method463();
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(LSVWJKJVI;[[CI[[[B)V")
    private static final void method508(class52 arg0, char[][] arg1, int arg2, byte[][][] arg3) {
        int var4 = 73 / arg2;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            char[] var6 = new char[arg0.method461()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg0.method461();
            }
            arg1[var5] = var6;
            byte[][] var8 = new byte[arg0.method461()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg0.method461();
                var8[var9][1] = (byte) arg0.method461();
            }
            if (var8.length > 0) {
                arg3[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(LSVWJKJVI;Z[[C)V")
    private static final void method509(class52 arg0, boolean arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method461()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method461();
            }
            arg2[var3] = var4;
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(B[C)V")
    private static final void method510(byte arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method511(arg1[var3], 7)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = var2; var5 < arg1.length; var5++) {
            arg1[var5] = ' ';
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(CI)Z")
    private static final boolean method511(char arg0, int arg1) {
        if (arg1 != 7) {
            field1468 = -251;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method512(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        if (arg0) {
            field1468 = -302;
        }
        char[] var4 = arg1.toCharArray();
        method510(field1472, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method520(2, var6);
        method515(var6, 833);
        method516(var6, true);
        method529(var6, (byte) 6);
        for (int var8 = 0; var8 < field1482.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1482[var8], var11 + 1)) != -1) {
                char[] var12 = field1482[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method513(var5.toCharArray(), var6, 0);
        method514(var6, false);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[CI)V")
    private static final void method513(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method537(726, arg0[var3])) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2 != 0) {
            field1471 = -210;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CZ)V")
    private static final void method514(char[] arg0, boolean arg1) {
        if (arg1) {
            field1470 = !field1470;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method534(0, var4)) {
                var2 = true;
            } else if (var2) {
                if (method536(var4, 3616)) {
                    var2 = false;
                }
            } else if (method537(726, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CI)V")
    private static final void method515(char[] arg0, int arg1) {
        if (arg1 <= 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1477.length - 1; var3 >= 0; var3--) {
                method524(field1477[var3], field1478[var3], arg0, 8);
            }
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "([CZ)V")
    private static final void method516(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method524(var3, null, var2, 8);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (!arg1) {
            field1471 = 301;
        }
        method524(var5, null, var4, 8);
        for (int var6 = field1479.length - 1; var6 >= 0; var6--) {
            method517((byte) 4, arg0, var2, var4, field1479[var6]);
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(B[C[C[C[C)V")
    private static final void method517(byte arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0 != 4 || arg4.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg4.length; var6 += var9) {
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
                    if (var8 < arg4.length && (var13 = method526(false, var11, arg4[var8], var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method526(false, var11, arg4[var8 - 1], var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method532(field1475, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method518(arg1, arg2, 8, var6);
                int var17 = method519(var7 - 1, arg1, 47580, arg3);
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

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[CII)I")
    private static final int method518(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method532(field1475, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg2 != 8) {
            return 1;
        }
        for (int var6 = arg3 - 1; var6 >= 0 && method532(field1475, arg1[var6]); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method532(field1475, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(I[CI[C)I")
    private static final int method519(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method532(field1475, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method532(field1475, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg2 != 47580) {
                field1471 = -467;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method532(field1475, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(I[C)V")
    private static final void method520(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method524(var3, null, var2, 8);
        if (arg0 < 2 || arg0 > 2) {
            field1475 = 87;
        }
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method524(var5, null, var4, 8);
        for (int var6 = 0; var6 < field1480.length; var6++) {
            method521(field1480[var6], arg1, var4, field1481[var6], var2, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[C[CI[CB)V")
    private static final void method521(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4, byte arg5) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        int var12;
        for (int var7 = 0; var7 <= arg1.length - arg0.length; var7 += var12) {
            int var10 = var7;
            int var11 = 0;
            var12 = 1;
            label137: while (true) {
                while (true) {
                    if (var10 >= arg1.length) {
                        break label137;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var10];
                    char var15 = 0;
                    if (var10 + 1 < arg1.length) {
                        var15 = arg1[var10 + 1];
                    }
                    int var16;
                    if (var11 < arg0.length && (var16 = method526(false, var14, arg0[var11], var15)) > 0) {
                        var10 += var16;
                        var11++;
                    } else {
                        if (var11 == 0) {
                            break label137;
                        }
                        int var17;
                        if ((var17 = method526(false, var14, arg0[var11 - 1], var15)) > 0) {
                            var10 += var17;
                            if (var11 == 1) {
                                var12++;
                            }
                        } else {
                            if (var11 >= arg0.length || !method532(field1475, var14)) {
                                break label137;
                            }
                            var10++;
                        }
                    }
                }
            }
            if (var11 >= arg0.length) {
                boolean var18 = false;
                int var19 = method522(var7, arg1, arg4, 453);
                int var20 = method523(134, var10 - 1, arg2, arg1);
                if (arg3 == 1 && var19 > 0 && var20 > 0) {
                    var18 = true;
                }
                if (arg3 == 2 && (var19 > 2 && var20 > 0 || var19 > 0 && var20 > 2)) {
                    var18 = true;
                }
                if (arg3 == 3 && var19 > 0 && var20 > 2) {
                    var18 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var19 > 2 && var20 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var18) {
                    int var21 = var7;
                    int var22 = var10 - 1;
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var23 = false;
                            for (int var24 = var7 - 1; var24 >= 0; var24--) {
                                if (var23) {
                                    if (arg4[var24] != '*') {
                                        break;
                                    }
                                    var21 = var24;
                                } else if (arg4[var24] == '*') {
                                    var21 = var24;
                                    var23 = true;
                                }
                            }
                        }
                        boolean var25 = false;
                        for (int var26 = var21 - 1; var26 >= 0; var26--) {
                            if (var25) {
                                if (method532(field1475, arg1[var26])) {
                                    break;
                                }
                                var21 = var26;
                            } else if (!method532(field1475, arg1[var26])) {
                                var25 = true;
                                var21 = var26;
                            }
                        }
                    }
                    if (var20 > 2) {
                        if (var20 == 4) {
                            boolean var27 = false;
                            for (int var28 = var22 + 1; var28 < arg1.length; var28++) {
                                if (var27) {
                                    if (arg2[var28] != '*') {
                                        break;
                                    }
                                    var22 = var28;
                                } else if (arg2[var28] == '*') {
                                    var22 = var28;
                                    var27 = true;
                                }
                            }
                        }
                        boolean var29 = false;
                        for (int var30 = var22 + 1; var30 < arg1.length; var30++) {
                            if (var29) {
                                if (method532(field1475, arg1[var30])) {
                                    break;
                                }
                                var22 = var30;
                            } else if (!method532(field1475, arg1[var30])) {
                                var29 = true;
                                var22 = var30;
                            }
                        }
                    }
                    for (int var31 = var21; var31 <= var22; var31++) {
                        arg1[var31] = '*';
                    }
                }
            }
        }
        if (arg5 == 6) {
            boolean var8 = false;
        } else {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(I[C[CI)I")
    private static final int method522(int arg0, char[] arg1, char[] arg2, int arg3) {
        int var4 = 71 / arg3;
        if (arg0 == 0) {
            return 2;
        }
        int var5 = arg0 - 1;
        while (true) {
            if (var5 >= 0 && method532(field1475, arg1[var5])) {
                if (arg1[var5] != ',' && arg1[var5] != '.') {
                    var5--;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg0 - 1; var7 >= 0 && method532(field1475, arg2[var7]); var7--) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method532(field1475, arg1[arg0 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(II[C[C)I")
    private static final int method523(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method532(field1475, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 <= 0) {
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method532(field1475, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method532(field1475, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([C[[B[CI)V")
    public static final void method524(char[] arg0, byte[][] arg1, char[] arg2, int arg3) {
        if (arg3 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg2.length - arg0.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label168: while (true) {
                while (true) {
                    if (var7 >= arg2.length || var12 && var13) {
                        break label168;
                    }
                    boolean var14 = false;
                    char var15 = arg2[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg2.length) {
                        var16 = arg2[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg0.length && (var17 = method527(arg0[var8], var16, (byte) 5, var15)) > 0) {
                        if (var17 == 1 && method535((byte) -12, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method535((byte) -12, var15) || method535((byte) -12, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label168;
                        }
                        int var18;
                        if ((var18 = method527(arg0[var8 - 1], var16, (byte) 5, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method533(0, var15)) {
                                break label168;
                            }
                            if (method532(field1475, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method535((byte) -12, var15)) {
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
            if (var8 >= arg0.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var6 - 1 < 0 || method532(field1475, arg2[var6 - 1]) && arg2[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg2.length || method532(field1475, arg2[var7]) && arg2[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method532(field1475, arg2[var27]) || arg2[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg2.length && (!method532(field1475, arg2[var27 + var29]) || arg2[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg2[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method532(field1475, arg2[var27 - 1]) || arg2[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method538(var28, true)) {
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
                        var20 = arg2[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg2.length) {
                        var21 = arg2[var7];
                    }
                    byte var22 = method528((byte) 3, var20);
                    byte var23 = method528((byte) 3, var21);
                    if (arg1 != null && method525(var22, arg1, var23, field1473)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method535((byte) -12, arg2[var34])) {
                            var31++;
                        } else if (method534(0, arg2[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg2[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(B[[BBI)Z")
    private static final boolean method525(byte arg0, byte[][] arg1, byte arg2, int arg3) {
        if (arg3 != 3) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg0 && arg1[var6][1] == arg2) {
                return true;
            }
            if (arg0 < arg1[var6][0] || arg1[var6][0] == arg0 && arg2 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(ZCCC)I")
    private static final int method526(boolean arg0, char arg1, char arg2, char arg3) {
        if (arg0) {
            field1475 = -207;
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

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(CCBC)I")
    private static final int method527(char arg0, char arg1, byte arg2, char arg3) {
        if (arg2 != 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg3) {
            return 1;
        }
        if (arg0 >= 'a' && arg0 <= 'm') {
            if (arg0 == 'a') {
                if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                    if (arg3 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'b') {
                if (arg3 != '6' && arg3 != '8') {
                    if ((arg3 != '1' || arg1 != '3') && (arg3 != 'i' || arg1 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg0 == 'c') {
                if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'd') {
                if ((arg3 != '[' || arg1 != ')') && (arg3 != 'i' || arg1 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'e') {
                if (arg3 != '3' && arg3 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'f') {
                if (arg3 == 'p' && arg1 == 'h') {
                    return 2;
                }
                if (arg3 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'g') {
                if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'h') {
                if (arg3 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'i') {
                if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'j') {
                return 0;
            }
            if (arg0 == 'k') {
                return 0;
            }
            if (arg0 == 'l') {
                if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'm') {
                return 0;
            }
        }
        if (arg0 >= 'n' && arg0 <= 'z') {
            if (arg0 == 'n') {
                return 0;
            }
            if (arg0 == 'o') {
                if (arg3 != '0' && arg3 != '*') {
                    if (arg3 == '(' && arg1 == ')' || arg3 == '[' && arg1 == ']' || arg3 == '{' && arg1 == '}' || arg3 == '<' && arg1 == '>') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'p') {
                return 0;
            }
            if (arg0 == 'q') {
                return 0;
            }
            if (arg0 == 'r') {
                return 0;
            }
            if (arg0 == 's') {
                if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 't') {
                if (arg3 != '7' && arg3 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'u') {
                if (arg3 == 'v') {
                    return 1;
                }
                if (arg3 == '\\' && arg1 == '/' || arg3 == '\\' && arg1 == '|' || arg3 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'v') {
                if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'w') {
                if (arg3 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'x') {
                if ((arg3 != ')' || arg1 != '(') && (arg3 != '}' || arg1 != '{') && (arg3 != ']' || arg1 != '[') && (arg3 != '>' || arg1 != '<')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'y') {
                return 0;
            }
            if (arg0 == 'z') {
                return 0;
            }
        }
        if (arg0 >= '0' && arg0 <= '9') {
            if (arg0 == '0') {
                if (arg3 == 'o' || arg3 == 'O') {
                    return 1;
                } else if ((arg3 != '(' || arg1 != ')') && (arg3 != '{' || arg1 != '}') && (arg3 != '[' || arg1 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg0 == '1') {
                return arg3 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg0 == ',') {
            return arg3 == '.' ? 1 : 0;
        } else if (arg0 == '.') {
            return arg3 == ',' ? 1 : 0;
        } else if (arg0 == '!') {
            return arg3 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(BC)B")
    private static final byte method528(byte arg0, char arg1) {
        if (arg0 == 3) {
            boolean var2 = false;
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

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CB)V")
    private static final void method529(char[] arg0, byte arg1) {
        boolean var2 = false;
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method530(arg0, (byte) -91, var4)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method532(field1475, arg0[var9]) && !method533(0, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method531(2401, var7, arg0);
                int var10 = 0;
                for (int var11 = var7; var11 < var4; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var4 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var4; var12++) {
                arg0[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "([CBI)I")
    private static final int method530(char[] arg0, byte arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return arg1 == -91 ? -1 : 4;
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(II[C)I")
    private static final int method531(int arg0, int arg1, char[] arg2) {
        if (arg0 != 2401) {
            return field1474;
        }
        int var3 = arg1;
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

    @OriginalMember(owner = "client!UIPOGFJQ", name = "a", descriptor = "(IC)Z")
    private static final boolean method532(int arg0, char arg1) {
        int var2 = 32 / arg0;
        return !method534(0, arg1) && !method535((byte) -12, arg1);
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(IC)Z")
    private static final boolean method533(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "c", descriptor = "(IC)Z")
    private static final boolean method534(int arg0, char arg1) {
        if (arg0 != 0) {
            field1471 = -85;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(BC)Z")
    private static final boolean method535(byte arg0, char arg1) {
        if (arg0 != -12) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(CI)Z")
    private static final boolean method536(char arg0, int arg1) {
        if (arg1 != 3616) {
            field1468 = 466;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "d", descriptor = "(IC)Z")
    private static final boolean method537(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "c", descriptor = "([CZ)Z")
    private static final boolean method538(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method535((byte) -12, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (!arg1) {
            field1469 = true;
        }
        if (var2) {
            return true;
        }
        int var4 = method539(-346, arg0);
        int var5 = 0;
        int var6 = field1476.length - 1;
        if (field1476[var5] == var4 || field1476[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1476[var7] == var4) {
                return true;
            }
            if (var4 < field1476[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!UIPOGFJQ", name = "b", descriptor = "(I[C)I")
    public static final int method539(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
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
        if (arg0 >= 0) {
            return field1475;
        } else {
            return var2;
        }
    }
}
