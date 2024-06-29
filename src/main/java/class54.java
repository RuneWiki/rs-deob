import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TONKJGVS")
public class class54 {

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "I")
    private static int field1558 = 7;

    @OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "I")
    private static int field1559 = 941;

    @OriginalMember(owner = "client!TONKJGVS", name = "d", descriptor = "B")
    private static byte field1560 = 9;

    @OriginalMember(owner = "client!TONKJGVS", name = "e", descriptor = "I")
    private static int field1561 = 6;

    @OriginalMember(owner = "client!TONKJGVS", name = "f", descriptor = "I")
    private static int field1562 = 863;

    @OriginalMember(owner = "client!TONKJGVS", name = "g", descriptor = "I")
    private static int field1563 = 9;

    @OriginalMember(owner = "client!TONKJGVS", name = "h", descriptor = "I")
    private static int field1564 = 9;

    @OriginalMember(owner = "client!TONKJGVS", name = "i", descriptor = "Z")
    private static boolean field1565 = true;

    @OriginalMember(owner = "client!TONKJGVS", name = "j", descriptor = "Z")
    private static boolean field1566 = true;

    @OriginalMember(owner = "client!TONKJGVS", name = "l", descriptor = "I")
    private static int field1568 = 23345;

    @OriginalMember(owner = "client!TONKJGVS", name = "m", descriptor = "B")
    private static byte field1569 = -58;

    @OriginalMember(owner = "client!TONKJGVS", name = "n", descriptor = "I")
    private static int field1570 = 7;

    @OriginalMember(owner = "client!TONKJGVS", name = "u", descriptor = "[Ljava/lang/String;")
    private static final String[] field1577 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "I")
    private static int field1557;

    @OriginalMember(owner = "client!TONKJGVS", name = "k", descriptor = "Z")
    private static boolean field1567;

    @OriginalMember(owner = "client!TONKJGVS", name = "v", descriptor = "Z")
    public static boolean field1578;

    @OriginalMember(owner = "client!TONKJGVS", name = "o", descriptor = "[I")
    private static int[] field1571;

    @OriginalMember(owner = "client!TONKJGVS", name = "t", descriptor = "[I")
    private static int[] field1576;

    @OriginalMember(owner = "client!TONKJGVS", name = "p", descriptor = "[[C")
    private static char[][] field1572;

    @OriginalMember(owner = "client!TONKJGVS", name = "r", descriptor = "[[C")
    private static char[][] field1574;

    @OriginalMember(owner = "client!TONKJGVS", name = "s", descriptor = "[[C")
    private static char[][] field1575;

    @OriginalMember(owner = "client!TONKJGVS", name = "q", descriptor = "[[[B")
    private static byte[][][] field1573;

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(LLKPVZAQN;)V")
    public static final void method457(class33 arg0) {
        class58 var1 = new class58((byte) -115, arg0.method323("fragmentsenc.txt", null));
        class58 var2 = new class58((byte) -115, arg0.method323("badenc.txt", null));
        class58 var3 = new class58((byte) -115, arg0.method323("domainenc.txt", null));
        class58 var4 = new class58((byte) -115, arg0.method323("tldlist.txt", null));
        method458(var1, var2, var3, var4);
        if (class7.field142) {
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(LWBEWPIXO;LWBEWPIXO;LWBEWPIXO;LWBEWPIXO;)V")
    private static final void method458(class58 arg0, class58 arg1, class58 arg2, class58 arg3) {
        method460(941, arg1);
        method461(arg2, 5);
        method462(arg0, 13217);
        method459(arg3, 8476);
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(LWBEWPIXO;I)V")
    private static final void method459(class58 arg0, int arg1) {
        int var2 = arg0.method520();
        if (arg1 != 8476) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1575 = new char[var2][];
        field1576 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1576[var4] = arg0.method515();
            char[] var5 = new char[arg0.method515()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method515();
            }
            field1575[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ILWBEWPIXO;)V")
    private static final void method460(int arg0, class58 arg1) {
        int var2 = arg1.method520();
        field1572 = new char[var2][];
        field1573 = new byte[var2][][];
        method463(arg1, field1572, field1573, false);
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(LWBEWPIXO;I)V")
    private static final void method461(class58 arg0, int arg1) {
        int var2 = arg0.method520();
        field1574 = new char[var2][];
        method464(arg0, field1574, -24155);
        if (arg1 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "(LWBEWPIXO;I)V")
    private static final void method462(class58 arg0, int arg1) {
        field1571 = new int[arg0.method520()];
        for (int var2 = 0; var2 < field1571.length; var2++) {
            field1571[var2] = arg0.method517();
        }
        if (arg1 != 13217) {
            field1557 = -269;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(LWBEWPIXO;[[C[[[BZ)V")
    private static final void method463(class58 arg0, char[][] arg1, byte[][][] arg2, boolean arg3) {
        if (arg3) {
            return;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg0.method515()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method515();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg0.method515()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method515();
                var7[var8][1] = (byte) arg0.method515();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(LWBEWPIXO;[[CI)V")
    private static final void method464(class58 arg0, char[][] arg1, int arg2) {
        if (arg2 != -24155) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method515()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method515();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[C)V")
    private static final void method465(byte arg0, char[] arg1) {
        int var2 = 0;
        if (field1560 != arg0) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method466(true, arg1[var4])) {
                arg1[var2] = arg1[var4];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var5 = var2; var5 < arg1.length; var5++) {
            arg1[var5] = ' ';
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ZC)Z")
    private static final boolean method466(boolean arg0, char arg1) {
        if (!arg0) {
            field1559 = -12;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method467(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method465((byte) 9, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method475(field1563, var6);
        method470(field1562, var6);
        method471(var6, 0);
        method484((byte) 6, var6);
        for (int var8 = 0; var8 < field1577.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1577[var8], var11 + 1)) != -1) {
                char[] var12 = field1577[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        if (field1558 != arg1) {
            throw new NullPointerException();
        }
        method468(var6, 8, var5.toCharArray());
        method469(var6, field1561);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CI[C)V")
    private static final void method468(char[] arg0, int arg1, char[] arg2) {
        if (arg1 != 8) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method492(arg2[var3], field1569)) {
                arg0[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CI)V")
    private static final void method469(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var5 = arg0[var3];
            if (!method489(23345, var5)) {
                var2 = true;
            } else if (var2) {
                if (method491(var5, true)) {
                    var2 = false;
                }
            } else if (method492(var5, field1569)) {
                arg0[var3] = (char) (var5 + 'a' - 65);
            }
        }
        if (arg1 < 6 || arg1 > 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(I[C)V")
    private static final void method470(int arg0, char[] arg1) {
        int var2 = 0 / arg0;
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1572.length - 1; var4 >= 0; var4--) {
                method479((byte) 7, field1573[var4], arg1, field1572[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "([CI)V")
    private static final void method471(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method479((byte) 7, null, var2, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method479((byte) 7, null, var4, var5);
        for (int var7 = field1574.length - 1; var7 >= 0; var7--) {
            method472((byte) -67, var2, arg0, var4, field1574[var7]);
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[C[C[C[C)V")
    private static final void method472(byte arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        if (arg0 != -67) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method481(0, var12, var13, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method481(0, var12, var13, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method487(0, var12)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method473(arg2, arg1, 244, var7);
                int var18 = method474(arg2, (byte) 5, arg3, var8 - 1);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg2[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([C[CII)I")
    private static final int method473(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method487(0, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        int var6 = 62 / arg2;
        for (int var7 = arg3 - 1; var7 >= 0 && method487(0, arg1[var7]); var7--) {
            if (arg1[var7] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method487(0, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CB[CI)I")
    private static final int method474(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method487(0, arg0[var4])) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 5) {
                return 1;
            }
            for (int var6 = arg3 + 1; var6 < arg0.length && method487(0, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method487(0, arg0[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(I[C)V")
    private static final void method475(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method479((byte) 7, null, var2, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method479((byte) 7, null, var4, var5);
        for (int var6 = 0; var6 < field1575.length; var6++) {
            method476(var2, -585, field1576[var6], field1575[var6], var4, arg1);
        }
        if (field1564 != arg0) {
            field1563 = -289;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CII[C[C[C)V")
    private static final void method476(char[] arg0, int arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg3.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        if (arg1 >= 0) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method481(0, var12, var13, arg3[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method481(0, var12, var13, arg3[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method487(0, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method477(arg5, 6, arg0, var7);
                int var18 = method478(var8 - 1, field1565, arg5, arg4);
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
                                if (method487(0, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method487(0, arg5[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg5.length; var26++) {
                                if (var25) {
                                    if (arg4[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg4[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method487(0, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method487(0, arg5[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg5[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "([CI[CI)I")
    private static final int method477(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method487(0, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 6) {
                return field1559;
            }
            for (int var6 = arg3 - 1; var6 >= 0 && method487(0, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method487(0, arg0[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(IZ[C[C)I")
    private static final int method478(int arg0, boolean arg1, char[] arg2, char[] arg3) {
        if (!arg1) {
            field1566 = !field1566;
        }
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method487(0, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method487(0, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method487(0, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[[B[C[C)V")
    public static final void method479(byte arg0, byte[][] arg1, char[] arg2, char[] arg3) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        if (arg0 != 7) {
            field1558 = -157;
        }
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg3.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg3.length && (var16 = method482(field1567, var14, arg3[var7], var15)) > 0) {
                        if (var16 == 1 && method490(var14, 415)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method490(var14, 415) || method490(var15, 415))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method482(field1567, var14, arg3[var7 - 1], var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method488(var14, 0)) {
                                break label167;
                            }
                            if (method487(0, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method490(var14, 415)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label167;
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
                    if (var5 - 1 < 0 || method487(0, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method487(0, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method487(0, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method487(0, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method487(0, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method493(var27, 7)) {
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
                    byte var21 = method483(var19, false);
                    byte var22 = method483(var20, false);
                    if (arg1 != null && method480(var22, arg1, (byte) 5, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method490(arg2[var33], 415)) {
                            var30++;
                        } else if (method489(23345, arg2[var33])) {
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
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(B[[BBB)Z")
    private static final boolean method480(byte arg0, byte[][] arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg2 != 5) {
            throw new NullPointerException();
        } else if (arg1[var4][0] == arg3 && arg1[var4][1] == arg0) {
            return true;
        } else {
            int var5 = arg1.length - 1;
            if (arg1[var5][0] == arg3 && arg1[var5][1] == arg0) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg1[var6][0] == arg3 && arg1[var6][1] == arg0) {
                    return true;
                }
                if (arg3 < arg1[var6][0] || arg1[var6][0] == arg3 && arg0 < arg1[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ICCC)I")
    private static final int method481(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            return 0;
        } else if (arg1 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg1 == '(' && arg2 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg3 == 's' && arg1 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(ZCCC)I")
    private static final int method482(boolean arg0, char arg1, char arg2, char arg3) {
        if (arg0) {
            field1567 = !field1567;
        }
        if (arg1 == arg2) {
            return 1;
        }
        if (arg2 >= 'a' && arg2 <= 'm') {
            if (arg2 == 'a') {
                if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                    if (arg1 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'b') {
                if (arg1 != '6' && arg1 != '8') {
                    if ((arg1 != '1' || arg3 != '3') && (arg1 != 'i' || arg3 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg2 == 'c') {
                if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'd') {
                if ((arg1 != '[' || arg3 != ')') && (arg1 != 'i' || arg3 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'e') {
                if (arg1 != '3' && arg1 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'f') {
                if (arg1 == 'p' && arg3 == 'h') {
                    return 2;
                }
                if (arg1 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'g') {
                if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'h') {
                if (arg1 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'i') {
                if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                if (arg1 != '0' && arg1 != '*') {
                    if (arg1 == '(' && arg3 == ')' || arg1 == '[' && arg3 == ']' || arg1 == '{' && arg3 == '}' || arg1 == '<' && arg3 == '>') {
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
                if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 't') {
                if (arg1 != '7' && arg1 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'u') {
                if (arg1 == 'v') {
                    return 1;
                }
                if (arg1 == '\\' && arg3 == '/' || arg1 == '\\' && arg3 == '|' || arg1 == '|' && arg3 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'v') {
                if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'w') {
                if (arg1 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'x') {
                if ((arg1 != ')' || arg3 != '(') && (arg1 != '}' || arg3 != '{') && (arg1 != ']' || arg3 != '[') && (arg1 != '>' || arg3 != '<')) {
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
                if (arg1 == 'o' || arg1 == 'O') {
                    return 1;
                } else if ((arg1 != '(' || arg3 != ')') && (arg1 != '{' || arg3 != '}') && (arg1 != '[' || arg3 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg2 == '1') {
                return arg1 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg2 == ',') {
            return arg1 == '.' ? 1 : 0;
        } else if (arg2 == '.') {
            return arg1 == ',' ? 1 : 0;
        } else if (arg2 == '!') {
            return arg1 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(CZ)B")
    private static final byte method483(char arg0, boolean arg1) {
        if (arg1) {
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

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(B[C)V")
    private static final void method484(byte arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 6) {
            return;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method485(var3, -16602, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method487(0, arg1[var8]) && !method488(arg1[var8], 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method486(0, arg1, var6);
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

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(II[C)I")
    private static final int method485(int arg0, int arg1, char[] arg2) {
        if (arg1 != -16602) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg0; var4 < arg2.length && var4 >= 0; var4++) {
            if (arg2[var4] >= '0' && arg2[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(I[CI)I")
    private static final int method486(int arg0, char[] arg1, int arg2) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = arg2;
        while (true) {
            if (var4 < arg1.length && var4 >= 0) {
                if (arg1[var4] >= '0' && arg1[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(IC)Z")
    private static final boolean method487(int arg0, char arg1) {
        if (arg0 != 0) {
            field1558 = 144;
        }
        return !method489(23345, arg1) && !method490(arg1, 415);
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(CI)Z")
    private static final boolean method488(char arg0, int arg1) {
        if (arg1 != 0) {
            field1565 = !field1565;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(IC)Z")
    private static final boolean method489(int arg0, char arg1) {
        if (field1568 != arg0) {
            field1562 = 64;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(CI)Z")
    private static final boolean method490(char arg0, int arg1) {
        if (arg1 <= 0) {
            field1559 = 250;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "b", descriptor = "(CZ)Z")
    private static final boolean method491(char arg0, boolean arg1) {
        if (!arg1) {
            field1566 = !field1566;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "a", descriptor = "(CB)Z")
    private static final boolean method492(char arg0, byte arg1) {
        if (arg1 != -58) {
            field1565 = !field1565;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "([CI)Z")
    private static final boolean method493(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method490(arg0[var3], 415) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (field1570 != arg1) {
            throw new NullPointerException();
        } else if (var2) {
            return true;
        } else {
            int var4 = method494((byte) 1, arg0);
            int var5 = 0;
            int var6 = field1571.length - 1;
            if (field1571[var5] == var4 || field1571[var6] == var4) {
                return true;
            }
            do {
                int var7 = (var5 + var6) / 2;
                if (field1571[var7] == var4) {
                    return true;
                }
                if (var4 < field1571[var7]) {
                    var6 = var7;
                } else {
                    var5 = var7;
                }
            } while (var5 != var6 && var5 + 1 != var6);
            return false;
        }
    }

    @OriginalMember(owner = "client!TONKJGVS", name = "c", descriptor = "(B[C)I")
    public static final int method494(byte arg0, char[] arg1) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1.length > 6) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[arg1.length - var4 - 1];
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
