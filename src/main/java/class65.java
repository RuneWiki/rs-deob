import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WOWCAPIK")
public class class65 {

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "I")
    private static int field1471 = -23379;

    @OriginalMember(owner = "WOWCAPIK", name = "d", descriptor = "Z")
    private static boolean field1474 = true;

    @OriginalMember(owner = "WOWCAPIK", name = "e", descriptor = "I")
    private static int field1475 = -34969;

    @OriginalMember(owner = "WOWCAPIK", name = "f", descriptor = "B")
    private static byte field1476 = 6;

    @OriginalMember(owner = "WOWCAPIK", name = "g", descriptor = "I")
    private static int field1477 = -33391;

    @OriginalMember(owner = "WOWCAPIK", name = "h", descriptor = "Z")
    private static boolean field1478 = true;

    @OriginalMember(owner = "WOWCAPIK", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1486 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "I")
    private static int field1472;

    @OriginalMember(owner = "WOWCAPIK", name = "i", descriptor = "I")
    private static int field1479;

    @OriginalMember(owner = "WOWCAPIK", name = "c", descriptor = "Z")
    private static boolean field1473;

    @OriginalMember(owner = "WOWCAPIK", name = "q", descriptor = "Z")
    public static boolean field1487;

    @OriginalMember(owner = "WOWCAPIK", name = "j", descriptor = "[I")
    private static int[] field1480;

    @OriginalMember(owner = "WOWCAPIK", name = "o", descriptor = "[I")
    private static int[] field1485;

    @OriginalMember(owner = "WOWCAPIK", name = "k", descriptor = "[[C")
    private static char[][] field1481;

    @OriginalMember(owner = "WOWCAPIK", name = "m", descriptor = "[[C")
    private static char[][] field1483;

    @OriginalMember(owner = "WOWCAPIK", name = "n", descriptor = "[[C")
    private static char[][] field1484;

    @OriginalMember(owner = "WOWCAPIK", name = "l", descriptor = "[[[B")
    private static byte[][][] field1482;

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(LBBMKAXRK;)V")
    public static final void method476(class6 arg0) {
        class17 var1 = new class17(arg0.method30("fragmentsenc.txt", null), -26583);
        class17 var2 = new class17(arg0.method30("badenc.txt", null), -26583);
        class17 var3 = new class17(arg0.method30("domainenc.txt", null), -26583);
        class17 var4 = new class17(arg0.method30("tldlist.txt", null), -26583);
        method477(var1, var2, var3, var4);
        if (class30.field987) {
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(LEILHLJCE;LEILHLJCE;LEILHLJCE;LEILHLJCE;)V")
    private static final void method477(class17 arg0, class17 arg1, class17 arg2, class17 arg3) {
        method479((byte) -61, arg1);
        method480(0, arg2);
        method481((byte) 50, arg0);
        method478(48575, arg3);
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(ILEILHLJCE;)V")
    private static final void method478(int arg0, class17 arg1) {
        if (arg0 != 48575) {
            field1479 = 254;
        }
        int var2 = arg1.method229();
        field1484 = new char[var2][];
        field1485 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1485[var3] = arg1.method224();
            char[] var4 = new char[arg1.method224()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method224();
            }
            field1484[var3] = var4;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(BLEILHLJCE;)V")
    private static final void method479(byte arg0, class17 arg1) {
        int var2 = arg1.method229();
        field1481 = new char[var2][];
        field1482 = new byte[var2][][];
        method482(field1481, (byte) -36, arg1, field1482);
        if (arg0 != -61) {
            field1478 = !field1478;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "(ILEILHLJCE;)V")
    private static final void method480(int arg0, class17 arg1) {
        int var2 = arg1.method229();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1483 = new char[var2][];
        method483(arg1, field1483, field1473);
    }

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "(BLEILHLJCE;)V")
    private static final void method481(byte arg0, class17 arg1) {
        if (arg0 != 50) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1480 = new int[arg1.method229()];
        for (int var3 = 0; var3 < field1480.length; var3++) {
            field1480[var3] = arg1.method226();
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "([[CBLEILHLJCE;[[[B)V")
    private static final void method482(char[][] arg0, byte arg1, class17 arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method224()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method224();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method224()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method224();
                var7[var8][1] = (byte) arg2.method224();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg1 == -36) {
            ;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(LEILHLJCE;[[CZ)V")
    private static final void method483(class17 arg0, char[][] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method224()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method224();
            }
            arg1[var3] = var4;
        }
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(Z[C)V")
    private static final void method484(boolean arg0, char[] arg1) {
        if (arg0) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method485(arg1[var3], (byte) -46)) {
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

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(CB)Z")
    private static final boolean method485(char arg0, byte arg1) {
        if (arg1 != -46) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method486(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method484(false, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method494(221, var6);
        if (arg0 != -23379) {
            throw new NullPointerException();
        }
        method489(true, var6);
        method490((byte) 4, var6);
        method503(var6, 0);
        for (int var8 = 0; var8 < field1486.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1486[var8], var11 + 1)) != -1) {
                char[] var12 = field1486[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method487(69, var6, var5.toCharArray());
        method488(99, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(I[C[C)V")
    private static final void method487(int arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method511((byte) 1, arg2[var3])) {
                arg1[var3] = arg2[var3];
            }
        }
        int var4 = 63 / arg0;
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(I[C)V")
    private static final void method488(int arg0, char[] arg1) {
        int var2 = 10 / arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method508((byte) 1, var5)) {
                var3 = true;
            } else if (var3) {
                if (method510(var5, -40151)) {
                    var3 = false;
                }
            } else if (method511((byte) 1, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "(Z[C)V")
    private static final void method489(boolean arg0, char[] arg1) {
        if (!arg0) {
            field1472 = 216;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1481.length - 1; var3 >= 0; var3--) {
                method498(359, field1481[var3], field1482[var3], arg1);
            }
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(B[C)V")
    private static final void method490(byte arg0, char[] arg1) {
        if (arg0 != 4) {
            return;
        }
        boolean var2 = false;
        char[] var3 = (char[]) arg1.clone();
        char[] var4 = new char[] { '(', 'a', ')' };
        method498(359, var4, null, var3);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method498(359, var6, null, var5);
        for (int var7 = field1483.length - 1; var7 >= 0; var7--) {
            method491(var3, var5, arg1, 731, field1483[var7]);
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "([C[C[CI[C)V")
    private static final void method491(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg4.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg2.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg2[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg2.length) {
                        var12 = arg2[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg4.length && (var13 = method500(var12, var11, 0, arg4[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method500(var12, var11, 0, arg4[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method506(false, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method492(arg2, (byte) 6, var6, arg0);
                int var17 = method493(arg1, arg2, -34969, var7 - 1);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg2[var18] = '*';
                    }
                }
            }
        }
        if (arg3 == 731) {
            ;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "([CBI[C)I")
    private static final int method492(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method506(false, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg1 != 6) {
            field1473 = !field1473;
        }
        for (int var6 = arg2 - 1; var6 >= 0 && method506(false, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method506(false, arg0[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "([C[CII)I")
    private static final int method493(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method506(false, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && method506(false, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (field1475 != arg2) {
                field1472 = 237;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method506(false, arg1[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "(I[C)V")
    private static final void method494(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method498(359, var3, null, var2);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method498(359, var6, null, var5);
        for (int var7 = 0; var7 < field1484.length; var7++) {
            method495(false, field1484[var7], arg1, field1485[var7], var2, var5);
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(Z[C[CI[C[C)V")
    private static final void method495(boolean arg0, char[] arg1, char[] arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg1.length; var7 += var10) {
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
                    if (var9 < arg1.length && (var14 = method500(var13, var12, 0, arg1[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method500(var13, var12, 0, arg1[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method506(false, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method496((byte) 9, var7, arg2, arg4);
                int var18 = method497(2, arg2, var8 - 1, arg5);
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
                                if (method506(false, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method506(false, arg2[var24])) {
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
                                    if (arg5[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg5[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg2.length; var28++) {
                            if (var27) {
                                if (method506(false, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method506(false, arg2[var28])) {
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
        if (arg0) {
            field1472 = 485;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(BI[C[C)I")
    private static final int method496(byte arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method506(false, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg0 != 9) {
                return 4;
            }
            for (int var6 = arg1 - 1; var6 >= 0 && method506(false, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method506(false, arg2[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(I[CI[C)I")
    private static final int method497(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method506(false, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method506(false, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 >= 2 && arg0 <= 2) {
                if (var5 >= 5) {
                    return 4;
                }
                if (method506(false, arg1[arg2 + 1])) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(I[C[[B[C)V")
    public static final void method498(int arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg0 <= 0 || arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method501(arg1[var7], (byte) 102, var15, var14)) > 0) {
                        if (var16 == 1 && method509(field1476, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method509(field1476, var14) || method509(field1476, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method501(arg1[var7 - 1], (byte) 102, var15, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method507(557, var14)) {
                                break label167;
                            }
                            if (method506(false, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method509(field1476, var14)) {
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
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method506(false, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method506(false, arg3[var6]) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method506(false, arg3[var26]) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method506(false, arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method506(false, arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method512(var27, field1477)) {
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
                        var19 = arg3[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg3.length) {
                        var20 = arg3[var6];
                    }
                    byte var21 = method502(var19, true);
                    byte var22 = method502(var20, true);
                    if (arg2 != null && method499(var21, arg2, -12775, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method509(field1476, arg3[var33])) {
                            var30++;
                        } else if (method508((byte) 1, arg3[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg3[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(B[[BIB)Z")
    private static final boolean method499(byte arg0, byte[][] arg1, int arg2, byte arg3) {
        if (arg2 != -12775) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg3) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg0 && arg1[var6][1] == arg3) {
                return true;
            }
            if (arg0 < arg1[var6][0] || arg1[var6][0] == arg0 && arg3 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(CCIC)I")
    private static final int method500(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 0) {
            field1475 = -136;
        }
        if (arg1 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg1 == '(' && arg0 == ')') {
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

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(CBCC)I")
    private static final int method501(char arg0, byte arg1, char arg2, char arg3) {
        if (arg1 != 102) {
            return 4;
        } else if (arg0 == arg3) {
            return 1;
        } else {
            if (arg0 >= 'a' && arg0 <= 'm') {
                if (arg0 == 'a') {
                    if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                        if (arg3 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'b') {
                    if (arg3 != '6' && arg3 != '8') {
                        if ((arg3 != '1' || arg2 != '3') && (arg3 != 'i' || arg2 != '3')) {
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
                    if ((arg3 != '[' || arg2 != ')') && (arg3 != 'i' || arg2 != ')')) {
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
                    if (arg3 == 'p' && arg2 == 'h') {
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
                        if ((arg3 != '(' || arg2 != ')') && (arg3 != '[' || arg2 != ']') && (arg3 != '{' || arg2 != '}') && (arg3 != '<' || arg2 != '>')) {
                            return 0;
                        }
                        return 2;
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
                    if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'v') {
                    if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'w') {
                    if (arg3 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg0 == 'x') {
                    if ((arg3 != ')' || arg2 != '(') && (arg3 != '}' || arg2 != '{') && (arg3 != ']' || arg2 != '[') && (arg3 != '>' || arg2 != '<')) {
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
                    } else if ((arg3 != '(' || arg2 != ')') && (arg3 != '{' || arg2 != '}') && (arg3 != '[' || arg2 != ']')) {
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
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(CZ)B")
    private static final byte method502(char arg0, boolean arg1) {
        if (!arg1) {
            field1471 = -177;
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

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "([CI)V")
    private static final void method503(char[] arg0, int arg1) {
        boolean var2 = false;
        if (arg1 != 0) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method504(true, arg0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method506(false, arg0[var8]) && !method507(557, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method505(arg0, var6, 3);
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

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(Z[CI)I")
    private static final int method504(boolean arg0, char[] arg1, int arg2) {
        if (!arg0) {
            field1474 = !field1474;
        }
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "([CII)I")
    private static final int method505(char[] arg0, int arg1, int arg2) {
        if (arg2 < 3 || arg2 > 3) {
            field1472 = 420;
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

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(ZC)Z")
    private static final boolean method506(boolean arg0, char arg1) {
        if (arg0) {
            field1475 = 474;
        }
        return !method508((byte) 1, arg1) && !method509(field1476, arg1);
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(IC)Z")
    private static final boolean method507(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1474 = !field1474;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(BC)Z")
    private static final boolean method508(byte arg0, char arg1) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "(BC)Z")
    private static final boolean method509(byte arg0, char arg1) {
        if (field1476 == arg0) {
            boolean var2 = false;
        } else {
            field1479 = -4;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "WOWCAPIK", name = "a", descriptor = "(CI)Z")
    private static final boolean method510(char arg0, int arg1) {
        if (arg1 != -40151) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "WOWCAPIK", name = "c", descriptor = "(BC)Z")
    private static final boolean method511(byte arg0, char arg1) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "WOWCAPIK", name = "b", descriptor = "([CI)Z")
    private static final boolean method512(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method509(field1476, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method513(716, arg0);
        int var5 = 0;
        int var6 = field1480.length - 1;
        if (arg1 != -33391) {
            throw new NullPointerException();
        } else if (field1480[var5] == var4 || field1480[var6] == var4) {
            return true;
        } else {
            do {
                int var7 = (var5 + var6) / 2;
                if (field1480[var7] == var4) {
                    return true;
                }
                if (var4 < field1480[var7]) {
                    var6 = var7;
                } else {
                    var5 = var7;
                }
            } while (var5 != var6 && var5 + 1 != var6);
            return false;
        }
    }

    @OriginalMember(owner = "WOWCAPIK", name = "c", descriptor = "(I[C)I")
    public static final int method513(int arg0, char[] arg1) {
        int var2 = 20 / arg0;
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
