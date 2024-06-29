import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UCQYJOHJ")
public class class62 {

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "Z")
    private static boolean field1620 = true;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "c", descriptor = "I")
    private static int field1621 = 130;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "f", descriptor = "I")
    private static int field1624 = 9;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "g", descriptor = "B")
    private static byte field1625 = 4;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "h", descriptor = "B")
    private static byte field1626 = 3;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "i", descriptor = "B")
    private static byte field1627 = 4;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "j", descriptor = "I")
    private static int field1628 = -593;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "k", descriptor = "I")
    private static int field1629 = -60;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "l", descriptor = "Z")
    private static boolean field1630 = true;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "m", descriptor = "I")
    private static int field1631 = 8;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "t", descriptor = "[Ljava/lang/String;")
    private static final String[] field1638 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "Z")
    private static boolean field1619;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "d", descriptor = "Z")
    private static boolean field1622;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "e", descriptor = "Z")
    private static boolean field1623;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "u", descriptor = "Z")
    public static boolean field1639;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "n", descriptor = "[I")
    private static int[] field1632;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "s", descriptor = "[I")
    private static int[] field1637;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "o", descriptor = "[[C")
    private static char[][] field1633;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "q", descriptor = "[[C")
    private static char[][] field1635;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "r", descriptor = "[[C")
    private static char[][] field1636;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "p", descriptor = "[[[B")
    private static byte[][][] field1634;

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(LESUFCMYV;)V")
    public static final void method514(class11 arg0) {
        class53 var1 = new class53(arg0.method205("fragmentsenc.txt", null), (byte) -17);
        class53 var2 = new class53(arg0.method205("badenc.txt", null), (byte) -17);
        class53 var3 = new class53(arg0.method205("domainenc.txt", null), (byte) -17);
        class53 var4 = new class53(arg0.method205("tldlist.txt", null), (byte) -17);
        method515(var1, var2, var3, var4);
        if (class57.field1577) {
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(LRGCGKKUR;LRGCGKKUR;LRGCGKKUR;LRGCGKKUR;)V")
    private static final void method515(class53 arg0, class53 arg1, class53 arg2, class53 arg3) {
        method517(field1622, arg1);
        method518(arg2, false);
        method519(true, arg0);
        method516(arg3, 2);
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(LRGCGKKUR;I)V")
    private static final void method516(class53 arg0, int arg1) {
        if (arg1 != 2) {
            return;
        }
        int var2 = arg0.method460();
        field1636 = new char[var2][];
        field1637 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1637[var3] = arg0.method455();
            char[] var4 = new char[arg0.method455()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method455();
            }
            field1636[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ZLRGCGKKUR;)V")
    private static final void method517(boolean arg0, class53 arg1) {
        int var2 = arg1.method460();
        field1633 = new char[var2][];
        field1634 = new byte[var2][][];
        method520(true, arg1, field1634, field1633);
        if (arg0) {
            field1621 = -293;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(LRGCGKKUR;Z)V")
    private static final void method518(class53 arg0, boolean arg1) {
        int var2 = arg0.method460();
        field1635 = new char[var2][];
        method521(9, arg0, field1635);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(ZLRGCGKKUR;)V")
    private static final void method519(boolean arg0, class53 arg1) {
        field1632 = new int[arg1.method460()];
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < field1632.length; var3++) {
            field1632[var3] = arg1.method457();
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ZLRGCGKKUR;[[[B[[C)V")
    private static final void method520(boolean arg0, class53 arg1, byte[][][] arg2, char[][] arg3) {
        if (!arg0) {
            field1631 = -194;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method455()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method455();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method455()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method455();
                var7[var8][1] = (byte) arg1.method455();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ILRGCGKKUR;[[C)V")
    private static final void method521(int arg0, class53 arg1, char[][] arg2) {
        if (arg0 < field1624 || arg0 > field1624) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method455()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method455();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(I[C)V")
    private static final void method522(int arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 != 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method523(false, arg1[var4])) {
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

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(ZC)Z")
    private static final boolean method523(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method524(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method522(8, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method532(var6, false);
        method527(var6, (byte) 40);
        method528((byte) 56, var6);
        if (!arg1) {
            throw new NullPointerException();
        }
        method541(var6, 3);
        for (int var8 = 0; var8 < field1638.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1638[var8], var11 + 1)) != -1) {
                char[] var12 = field1638[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method525(false, var6, var5.toCharArray());
        method526(field1625, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(Z[C[C)V")
    private static final void method525(boolean arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method549(true, arg2[var3])) {
                arg1[var3] = arg2[var3];
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(B[C)V")
    private static final void method526(byte arg0, char[] arg1) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            field1623 = !field1623;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method546(0, var5)) {
                var3 = true;
            } else if (var3) {
                if (method548(0, var5)) {
                    var3 = false;
                }
            } else if (method549(true, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CB)V")
    private static final void method527(char[] arg0, byte arg1) {
        if (arg1 != 40) {
            field1624 = 475;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1633.length - 1; var3 >= 0; var3--) {
                method536(field1629, field1633[var3], field1634[var3], arg0);
            }
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(B[C)V")
    private static final void method528(byte arg0, char[] arg1) {
        if (arg0 != 56) {
            return;
        }
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method536(field1629, var3, null, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method536(field1629, var5, null, var4);
        for (int var6 = field1635.length - 1; var6 >= 0; var6--) {
            method529(field1635[var6], (byte) -58, arg1, var2, var4);
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CB[C[C[C)V")
    private static final void method529(char[] arg0, byte arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1 != -58) {
            field1624 = 239;
        }
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg0.length; var6 += var9) {
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
                    if (var8 < arg0.length && (var13 = method538(arg0[var8], var11, (byte) 9, var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method538(arg0[var8 - 1], var11, (byte) 9, var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method544(0, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method530(arg2, var6, arg3, -17994);
                int var17 = method531(var7 - 1, arg4, arg2, (byte) 3);
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
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CI[CI)I")
    private static final int method530(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 != -17994) {
            field1621 = 165;
        }
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method544(0, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method544(0, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method544(0, arg0[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(I[C[CB)I")
    private static final int method531(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method544(0, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (field1626 == arg3) {
                boolean var5 = false;
            } else {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            int var7 = 0;
            for (int var8 = arg0 + 1; var8 < arg2.length && method544(0, arg1[var8]); var8++) {
                if (arg1[var8] == '*') {
                    var7++;
                }
            }
            if (var7 >= 3) {
                return 4;
            }
            if (method544(0, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CZ)V")
    private static final void method532(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method536(field1629, var3, null, var2);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method536(field1629, var6, null, var5);
        for (int var7 = 0; var7 < field1636.length; var7++) {
            method533(field1627, var5, var2, arg0, field1637[var7], field1636[var7]);
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(B[C[C[CI[C)V")
    private static final void method533(byte arg0, char[] arg1, char[] arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg5.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        if (arg0 != 4) {
            field1631 = 46;
        }
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
                    if (var9 < arg5.length && (var14 = method538(arg5[var9], var12, (byte) 9, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method538(arg5[var9 - 1], var12, (byte) 9, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method544(0, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method534(arg3, arg2, field1628, var7);
                int var18 = method535(arg1, (byte) 49, arg3, var8 - 1);
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
                                if (method544(0, arg3[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method544(0, arg3[var24])) {
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
                                if (method544(0, arg3[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method544(0, arg3[var28])) {
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

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([C[CII)I")
    private static final int method534(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method544(0, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method544(0, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (arg2 >= 0) {
                return field1621;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method544(0, arg0[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CB[CI)I")
    private static final int method535(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method544(0, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 49) {
                field1624 = 481;
            }
            for (int var6 = arg3 + 1; var6 < arg2.length && method544(0, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method544(0, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(I[C[[B[C)V")
    public static final void method536(int arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        while (arg0 >= 0) {
            for (int var35 = 1; var35 > 0; var35++) {
            }
        }
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label169: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label169;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method539(var14, arg1[var7], var15, -170)) > 0) {
                        if (var16 == 1 && method547(var14, true)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method547(var14, true) || method547(var15, true))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label169;
                        }
                        int var17;
                        if ((var17 = method539(var14, arg1[var7 - 1], var15, -170)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method545(var14, 0)) {
                                break label169;
                            }
                            if (method544(0, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method547(var14, true)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label169;
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
                    if (var5 - 1 < 0 || method544(0, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method544(0, arg3[var6]) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method544(0, arg3[var26]) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method544(0, arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method544(0, arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method550(var27, (byte) -31)) {
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
                    byte var21 = method540(7, var19);
                    byte var22 = method540(7, var20);
                    if (arg2 != null && method537(var21, var22, arg2, true)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method547(arg3[var33], true)) {
                            var30++;
                        } else if (method546(0, arg3[var33])) {
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

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(BB[[BZ)Z")
    private static final boolean method537(byte arg0, byte arg1, byte[][] arg2, boolean arg3) {
        int var4 = 0;
        if (!arg3) {
            field1619 = !field1619;
        }
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg1) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg0 && arg2[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg0 && arg2[var6][1] == arg1) {
                return true;
            }
            if (arg0 < arg2[var6][0] || arg2[var6][0] == arg0 && arg1 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CCBC)I")
    private static final int method538(char arg0, char arg1, byte arg2, char arg3) {
        if (arg2 != 9) {
            return 3;
        }
        boolean var4 = false;
        if (arg0 == arg1) {
            return 1;
        } else if (arg0 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg1 == '(' && arg3 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg0 == 's' && arg1 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CCCI)I")
    private static final int method539(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 >= 0) {
            return 3;
        } else if (arg0 == arg1) {
            return 1;
        } else {
            if (arg1 >= 'a' && arg1 <= 'm') {
                if (arg1 == 'a') {
                    if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                        if (arg0 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'b') {
                    if (arg0 != '6' && arg0 != '8') {
                        if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg1 == 'c') {
                    if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'd') {
                    if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'e') {
                    if (arg0 != '3' && arg0 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'f') {
                    if (arg0 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg0 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'g') {
                    if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'h') {
                    if (arg0 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'i') {
                    if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                    if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                    if (arg0 != '0' && arg0 != '*') {
                        if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
                    if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 't') {
                    if (arg0 != '7' && arg0 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'u') {
                    if (arg0 == 'v') {
                        return 1;
                    }
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'v') {
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'w') {
                    if (arg0 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'x') {
                    if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
                    if (arg0 == 'o' || arg0 == 'O') {
                        return 1;
                    } else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg1 == '1') {
                    return arg0 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg1 == ',') {
                return arg0 == '.' ? 1 : 0;
            } else if (arg1 == '.') {
                return arg0 == ',' ? 1 : 0;
            } else if (arg1 == '!') {
                return arg0 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(IC)B")
    private static final byte method540(int arg0, char arg1) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return (byte) (arg1 + 1 - 'a');
        } else if (arg1 == '\'') {
            return 28;
        } else if (arg1 >= '0' && arg1 <= '9') {
            return (byte) (arg1 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CI)V")
    private static final void method541(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 < 3 || arg1 > 3) {
            return;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method542(arg0, var3, false)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method544(0, arg0[var8]) && !method545(arg0[var8], 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method543((byte) 7, var6, arg0);
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

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "([CIZ)I")
    private static final int method542(char[] arg0, int arg1, boolean arg2) {
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        if (arg2) {
            field1621 = 215;
        }
        return -1;
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(BI[C)I")
    private static final int method543(byte arg0, int arg1, char[] arg2) {
        if (arg0 != 7) {
            return field1629;
        }
        boolean var3 = false;
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

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(IC)Z")
    private static final boolean method544(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return !method546(0, arg1) && !method547(arg1, true);
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CI)Z")
    private static final boolean method545(char arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "c", descriptor = "(IC)Z")
    private static final boolean method546(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "a", descriptor = "(CZ)Z")
    private static final boolean method547(char arg0, boolean arg1) {
        if (!arg1) {
            field1620 = !field1620;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "d", descriptor = "(IC)Z")
    private static final boolean method548(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "(ZC)Z")
    private static final boolean method549(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "([CB)Z")
    private static final boolean method550(char[] arg0, byte arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method547(arg0[var3], true) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method551(arg0, 6329);
        if (arg1 != -31) {
            throw new NullPointerException();
        }
        int var5 = 0;
        int var6 = field1632.length - 1;
        if (field1632[var5] == var4 || field1632[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1632[var7] == var4) {
                return true;
            }
            if (var4 < field1632[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!UCQYJOHJ", name = "b", descriptor = "([CI)I")
    public static final int method551(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != 6329) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[arg0.length - var4 - 1];
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
        return var2;
    }
}
