import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XLNSJQUZ")
public class class60 {

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "I")
    private static int field1548 = -302;

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "Z")
    private static boolean field1549 = true;

    @OriginalMember(owner = "XLNSJQUZ", name = "c", descriptor = "B")
    private static byte field1550 = 65;

    @OriginalMember(owner = "XLNSJQUZ", name = "d", descriptor = "B")
    private static byte field1551 = 65;

    @OriginalMember(owner = "XLNSJQUZ", name = "e", descriptor = "I")
    private static int field1552 = 7;

    @OriginalMember(owner = "XLNSJQUZ", name = "f", descriptor = "I")
    private static int field1553 = 35938;

    @OriginalMember(owner = "XLNSJQUZ", name = "g", descriptor = "I")
    private static int field1554 = 9;

    @OriginalMember(owner = "XLNSJQUZ", name = "h", descriptor = "Z")
    private static boolean field1555 = true;

    @OriginalMember(owner = "XLNSJQUZ", name = "i", descriptor = "I")
    private static int field1556 = 8377;

    @OriginalMember(owner = "XLNSJQUZ", name = "j", descriptor = "I")
    private static int field1557 = 7;

    @OriginalMember(owner = "XLNSJQUZ", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1564 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "XLNSJQUZ", name = "r", descriptor = "Z")
    public static boolean field1565;

    @OriginalMember(owner = "XLNSJQUZ", name = "k", descriptor = "[I")
    private static int[] field1558;

    @OriginalMember(owner = "XLNSJQUZ", name = "p", descriptor = "[I")
    private static int[] field1563;

    @OriginalMember(owner = "XLNSJQUZ", name = "l", descriptor = "[[C")
    private static char[][] field1559;

    @OriginalMember(owner = "XLNSJQUZ", name = "n", descriptor = "[[C")
    private static char[][] field1561;

    @OriginalMember(owner = "XLNSJQUZ", name = "o", descriptor = "[[C")
    private static char[][] field1562;

    @OriginalMember(owner = "XLNSJQUZ", name = "m", descriptor = "[[[B")
    private static byte[][][] field1560;

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(LLYZBHNJP;)V")
    public static final void method458(class31 arg0) {
        class69 var1 = new class69(arg0.method290("fragmentsenc.txt", null), field1548);
        class69 var2 = new class69(arg0.method290("badenc.txt", null), field1548);
        class69 var3 = new class69(arg0.method290("domainenc.txt", null), field1548);
        class69 var4 = new class69(arg0.method290("tldlist.txt", null), field1548);
        method459(var1, var2, var3, var4);
        if (class72.field1737) {
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(LZOMNSJJM;LZOMNSJJM;LZOMNSJJM;LZOMNSJJM;)V")
    private static final void method459(class69 arg0, class69 arg1, class69 arg2, class69 arg3) {
        method461(arg1, 0);
        method462(arg2, 6);
        method463(arg0, 0);
        method460(0, arg3);
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(ILZOMNSJJM;)V")
    private static final void method460(int arg0, class69 arg1) {
        int var2 = arg1.method552();
        field1562 = new char[var2][];
        field1563 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1563[var3] = arg1.method547();
            char[] var5 = new char[arg1.method547()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method547();
            }
            field1562[var3] = var5;
        }
        if (arg0 < 0 || arg0 > 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(LZOMNSJJM;I)V")
    private static final void method461(class69 arg0, int arg1) {
        if (arg1 != 0) {
            field1549 = !field1549;
        }
        int var2 = arg0.method552();
        field1559 = new char[var2][];
        field1560 = new byte[var2][][];
        method464(arg0, field1560, 0, field1559);
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "(LZOMNSJJM;I)V")
    private static final void method462(class69 arg0, int arg1) {
        int var2 = arg0.method552();
        field1561 = new char[var2][];
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        method465(arg0, field1561, field1550);
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "c", descriptor = "(LZOMNSJJM;I)V")
    private static final void method463(class69 arg0, int arg1) {
        field1558 = new int[arg0.method552()];
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < field1558.length; var3++) {
            field1558[var3] = arg0.method549();
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(LZOMNSJJM;[[[BI[[C)V")
    private static final void method464(class69 arg0, byte[][][] arg1, int arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var6 = new char[arg0.method547()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg0.method547();
            }
            arg3[var4] = var6;
            byte[][] var8 = new byte[arg0.method547()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg0.method547();
                var8[var9][1] = (byte) arg0.method547();
            }
            if (var8.length > 0) {
                arg1[var4] = var8;
            }
        }
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(LZOMNSJJM;[[CB)V")
    private static final void method465(class69 arg0, char[][] arg1, byte arg2) {
        if (field1551 != arg2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg0.method547()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method547();
            }
            arg1[var4] = var5;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([CI)V")
    private static final void method466(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method467(arg0[var3], (byte) 6)) {
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
        if (field1552 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(CB)Z")
    private static final boolean method467(char arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var2 = false;
        } else {
            field1548 = 201;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method468(String arg0, byte arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method466(var4, 7);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method476(var6, 9);
        if (arg1 != -88) {
            throw new NullPointerException();
        }
        method471(var6, false);
        method472(var6, false);
        method485((byte) 96, var6);
        for (int var8 = 0; var8 < field1564.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1564[var8], var11 + 1)) != -1) {
                char[] var12 = field1564[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method469(var6, var5.toCharArray(), -330);
        method470((byte) -76, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([C[CI)V")
    private static final void method469(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method493(arg1[var3], (byte) -32)) {
                arg0[var3] = arg1[var3];
            }
        }
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(B[C)V")
    private static final void method470(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 != -76) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method490(var5, 0)) {
                var2 = true;
            } else if (var2) {
                if (method492(false, var5)) {
                    var2 = false;
                }
            } else if (method493(var5, (byte) -32)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([CZ)V")
    private static final void method471(char[] arg0, boolean arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1559.length - 1; var3 >= 0; var3--) {
                method480(field1559[var3], field1560[var3], arg0, (byte) -14);
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "([CZ)V")
    private static final void method472(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method480(var3, null, var2, (byte) -14);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (!arg1) {
            method480(var5, null, var4, (byte) -14);
            for (int var6 = field1561.length - 1; var6 >= 0; var6--) {
                method473(arg0, var2, field1561[var6], false, var4);
            }
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([C[C[CZ[C)V")
    private static final void method473(char[] arg0, char[] arg1, char[] arg2, boolean arg3, char[] arg4) {
        if (arg2.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        if (arg3) {
            return;
        }
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
                    if (var8 < arg2.length && (var13 = method482(var12, arg2[var8], -457, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method482(var12, arg2[var8 - 1], -457, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method488(field1556, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method474(var6, (byte) 62, arg1, arg0);
                int var17 = method475(arg0, arg4, 169, var7 - 1);
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

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(IB[C[C)I")
    private static final int method474(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method488(field1556, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg1 != 62) {
            field1549 = !field1549;
        }
        for (int var6 = arg0 - 1; var6 >= 0 && method488(field1556, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method488(field1556, arg3[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([C[CII)I")
    private static final int method475(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method488(field1556, arg0[var4])) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg0.length && method488(field1556, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            int var7 = 18 / arg2;
            if (var5 >= 3) {
                return 4;
            }
            if (method488(field1556, arg0[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "([CI)V")
    private static final void method476(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method480(var3, null, var2, (byte) -14);
        char[] var4 = (char[]) arg0.clone();
        if (field1554 != arg1) {
            return;
        }
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method480(var5, null, var4, (byte) -14);
        for (int var6 = 0; var6 < field1562.length; var6++) {
            method477(var2, (byte) 104, arg0, var4, field1563[var6], field1562[var6]);
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([CB[C[CI[C)V")
    private static final void method477(char[] arg0, byte arg1, char[] arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg5.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method482(var13, arg5[var9], -457, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method482(var13, arg5[var9 - 1], -457, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method488(field1556, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method478(var7, arg0, field1555, arg2);
                int var18 = method479(false, arg2, var8 - 1, arg3);
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
                                if (method488(field1556, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method488(field1556, arg2[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg2.length; var26++) {
                                if (var25) {
                                    if (arg3[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg3[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg2.length; var28++) {
                            if (var27) {
                                if (method488(field1556, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method488(field1556, arg2[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg2[var29] = '*';
                    }
                }
            }
        }
        if (arg1 == 104) {
            ;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(I[CZ[C)I")
    private static final int method478(int arg0, char[] arg1, boolean arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method488(field1556, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method488(field1556, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (!arg2) {
                return field1548;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method488(field1556, arg3[arg0 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(Z[CI[C)I")
    private static final int method479(boolean arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method488(field1556, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method488(field1556, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg0) {
                return 4;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method488(field1556, arg1[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([C[[B[CB)V")
    public static final void method480(char[] arg0, byte[][] arg1, char[] arg2, byte arg3) {
        if (arg3 != -14 || arg0.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg0.length; var5 += var9) {
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
                    if (var7 < arg0.length && (var16 = method483(var14, 491, arg0[var7], var15)) > 0) {
                        if (var16 == 1 && method491(true, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method491(true, var14) || method491(true, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method483(var14, 491, arg0[var7 - 1], var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method489(field1557, var14)) {
                                break label167;
                            }
                            if (method488(field1556, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method491(true, var14)) {
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
            if (var7 >= arg0.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method488(field1556, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method488(field1556, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method488(field1556, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method488(field1556, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method488(field1556, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method494(0, var27)) {
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
                    byte var21 = method484(var19, (byte) -52);
                    byte var22 = method484(var20, (byte) -52);
                    if (arg1 != null && method481(var22, var21, (byte) -46, arg1)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method491(true, arg2[var33])) {
                            var30++;
                        } else if (method490(arg2[var33], 0)) {
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

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(BBB[[B)Z")
    private static final boolean method481(byte arg0, byte arg1, byte arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg2 != -46) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3[var4][0] == arg1 && arg3[var4][1] == arg0) {
            return true;
        }
        int var6 = arg3.length - 1;
        if (arg3[var6][0] == arg1 && arg3[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg3[var7][0] == arg1 && arg3[var7][1] == arg0) {
                return true;
            }
            if (arg1 < arg3[var7][0] || arg3[var7][0] == arg1 && arg0 < arg3[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(CCIC)I")
    private static final int method482(char arg0, char arg1, int arg2, char arg3) {
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg3) {
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

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(CICC)I")
    private static final int method483(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 <= 0) {
            field1556 = 391;
        }
        if (arg0 == arg2) {
            return 1;
        }
        if (arg2 >= 'a' && arg2 <= 'm') {
            if (arg2 == 'a') {
                if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                    if (arg0 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'b') {
                if (arg0 != '6' && arg0 != '8') {
                    if ((arg0 != '1' || arg3 != '3') && (arg0 != 'i' || arg3 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg2 == 'c') {
                if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'd') {
                if ((arg0 != '[' || arg3 != ')') && (arg0 != 'i' || arg3 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'e') {
                if (arg0 != '3' && arg0 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'f') {
                if (arg0 == 'p' && arg3 == 'h') {
                    return 2;
                }
                if (arg0 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'g') {
                if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'h') {
                if (arg0 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'i') {
                if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                if (arg0 != '0' && arg0 != '*') {
                    if ((arg0 != '(' || arg3 != ')') && (arg0 != '[' || arg3 != ']') && (arg0 != '{' || arg3 != '}') && (arg0 != '<' || arg3 != '>')) {
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
                if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 't') {
                if (arg0 != '7' && arg0 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'u') {
                if (arg0 == 'v') {
                    return 1;
                }
                if ((arg0 != '\\' || arg3 != '/') && (arg0 != '\\' || arg3 != '|') && (arg0 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'v') {
                if ((arg0 != '\\' || arg3 != '/') && (arg0 != '\\' || arg3 != '|') && (arg0 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'w') {
                if (arg0 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'x') {
                if ((arg0 != ')' || arg3 != '(') && (arg0 != '}' || arg3 != '{') && (arg0 != ']' || arg3 != '[') && (arg0 != '>' || arg3 != '<')) {
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
                if (arg0 == 'o' || arg0 == 'O') {
                    return 1;
                } else if ((arg0 != '(' || arg3 != ')') && (arg0 != '{' || arg3 != '}') && (arg0 != '[' || arg3 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg2 == '1') {
                return arg0 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg2 == ',') {
            return arg0 == '.' ? 1 : 0;
        } else if (arg2 == '.') {
            return arg0 == ',' ? 1 : 0;
        } else if (arg2 == '!') {
            return arg0 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "(CB)B")
    private static final byte method484(char arg0, byte arg1) {
        if (arg1 != -52) {
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

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "(B[C)V")
    private static final void method485(byte arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 != 96) {
            field1555 = !field1555;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method486(arg1, 0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method488(field1556, arg1[var8]) && !method489(field1557, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method487(var6, (byte) -104, arg1);
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

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([CII)I")
    private static final int method486(char[] arg0, int arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 != 0) {
            field1553 = 401;
        }
        return -1;
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(IB[C)I")
    private static final int method487(int arg0, byte arg1, char[] arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg1 != -104) {
                field1555 = !field1555;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(IC)Z")
    private static final boolean method488(int arg0, char arg1) {
        if (arg0 != 8377) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method490(arg1, 0) && !method491(true, arg1);
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "(IC)Z")
    private static final boolean method489(int arg0, char arg1) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(CI)Z")
    private static final boolean method490(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(ZC)Z")
    private static final boolean method491(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "b", descriptor = "(ZC)Z")
    private static final boolean method492(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "c", descriptor = "(CB)Z")
    private static final boolean method493(char arg0, byte arg1) {
        if (arg1 != -32) {
            field1548 = 457;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "(I[C)Z")
    private static final boolean method494(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method491(true, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method495(arg1, (byte) 124);
        int var5 = 0;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var6 = field1558.length - 1;
        if (field1558[var5] == var4 || field1558[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1558[var7] == var4) {
                return true;
            }
            if (var4 < field1558[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "XLNSJQUZ", name = "a", descriptor = "([CB)I")
    public static final int method495(char[] arg0, byte arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var5 = arg0[arg0.length - var3 - 1];
            if (var5 >= 'a' && var5 <= 'z') {
                var2 = var2 * 38 + var5 + 1 - 'a';
            } else if (var5 == '\'') {
                var2 = var2 * 38 + 27;
            } else if (var5 >= '0' && var5 <= '9') {
                var2 = var2 * 38 + var5 + 28 - '0';
            } else if (var5 != '\u0000') {
                return 0;
            }
        }
        if (arg1 != 124) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }
}
