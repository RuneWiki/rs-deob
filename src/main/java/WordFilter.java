import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RKAYAFDQ")
public class WordFilter {

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "I")
    private static int _flowObfuscator1 = 9;

    @OriginalMember(owner = "RKAYAFDQ", name = "c", descriptor = "I")
    private static int _flowObfuscator3 = 748;

    @OriginalMember(owner = "RKAYAFDQ", name = "d", descriptor = "I")
    private static int _flowObfuscator4 = 201;

    @OriginalMember(owner = "RKAYAFDQ", name = "e", descriptor = "Z")
    private static boolean _flowObfuscator5 = true;

    @OriginalMember(owner = "RKAYAFDQ", name = "g", descriptor = "B")
    private static byte _flowObfuscator7 = -117;

    @OriginalMember(owner = "RKAYAFDQ", name = "h", descriptor = "I")
    private static int _flowObfuscator8 = -575;

    @OriginalMember(owner = "RKAYAFDQ", name = "i", descriptor = "Z")
    private static boolean _flowObfuscator9 = true;

    @OriginalMember(owner = "RKAYAFDQ", name = "j", descriptor = "I")
    private static int _flowObfuscator10 = -720;

    @OriginalMember(owner = "RKAYAFDQ", name = "k", descriptor = "I")
    private static int _flowObfuscator11 = -511;

    @OriginalMember(owner = "RKAYAFDQ", name = "l", descriptor = "B")
    private static byte _flowObfuscator12 = 4;

    @OriginalMember(owner = "RKAYAFDQ", name = "m", descriptor = "I")
    private static int _flowObfuscator13 = 8801;

    @OriginalMember(owner = "RKAYAFDQ", name = "n", descriptor = "Z")
    private static boolean _flowObfuscator14 = true;

    @OriginalMember(owner = "RKAYAFDQ", name = "u", descriptor = "[Ljava/lang/String;")
    private static final String[] WHITELIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "RKAYAFDQ", name = "f", descriptor = "I")
    private static int _flowObfuscator6;

    @OriginalMember(owner = "RKAYAFDQ", name = "v", descriptor = "Z")
    public static boolean _flowObfuscator15;

    @OriginalMember(owner = "RKAYAFDQ", name = "b", descriptor = "Z")
    private static boolean _flowObfuscator2;

    @OriginalMember(owner = "RKAYAFDQ", name = "o", descriptor = "[I")
    private static int[] fragments;

    @OriginalMember(owner = "RKAYAFDQ", name = "t", descriptor = "[I")
    private static int[] tldType;

    @OriginalMember(owner = "RKAYAFDQ", name = "p", descriptor = "[[C")
    private static char[][] badWords;

    @OriginalMember(owner = "RKAYAFDQ", name = "r", descriptor = "[[C")
    private static char[][] domains;

    @OriginalMember(owner = "RKAYAFDQ", name = "s", descriptor = "[[C")
    private static char[][] tlds;

    @OriginalMember(owner = "RKAYAFDQ", name = "q", descriptor = "[[[B")
    private static byte[][][] badCombinations;

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(LXTGLDHGX;)V")
    public static final void unpack(Jagfile arg0) {
        Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null), 891);
        Packet var2 = new Packet(arg0.read("badenc.txt", null), 891);
        Packet var3 = new Packet(arg0.read("domainenc.txt", null), 891);
        Packet var4 = new Packet(arg0.read("tldlist.txt", null), 891);
        read(var1, var2, var3, var4);
        if (Linkable._flowObfuscator2) {
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(LMBMGIXGO;LMBMGIXGO;LMBMGIXGO;LMBMGIXGO;)V")
    private static final void read(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        readBadWords(9121, arg1);
        readDomains(arg2, (byte) -28);
        readFragments(arg0, true);
        readTld((byte) 2, arg3);
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(BLMBMGIXGO;)V")
    private static final void readTld(byte arg0, Packet arg1) {
        int var2 = arg1.g4();
        tlds = new char[var2][];
        tldType = new int[var2];
        if (arg0 != 2) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            tldType[var3] = arg1.g1();
            char[] var4 = new char[arg1.g1()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.g1();
            }
            tlds[var3] = var4;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(ILMBMGIXGO;)V")
    private static final void readBadWords(int arg0, Packet arg1) {
        if (arg0 != 9121) {
            _flowObfuscator14 = !_flowObfuscator14;
        }
        int var2 = arg1.g4();
        badWords = new char[var2][];
        badCombinations = new byte[var2][][];
        readBadCombinations(arg1, badWords, true, badCombinations);
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(LMBMGIXGO;B)V")
    private static final void readDomains(Packet arg0, byte arg1) {
        int var2 = arg0.g4();
        domains = new char[var2][];
        if (arg1 == -28) {
            readDomain(domains, arg0, -490);
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(LMBMGIXGO;Z)V")
    private static final void readFragments(Packet arg0, boolean arg1) {
        fragments = new int[arg0.g4()];
        for (int var2 = 0; var2 < fragments.length; var2++) {
            fragments[var2] = arg0.g2();
        }
        if (!arg1) {
            _flowObfuscator4 = 167;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(LMBMGIXGO;[[CZ[[[B)V")
    private static final void readBadCombinations(Packet arg0, char[][] arg1, boolean arg2, byte[][][] arg3) {
        if (!arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            char[] var6 = new char[arg0.g1()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg0.g1();
            }
            arg1[var5] = var6;
            byte[][] var8 = new byte[arg0.g1()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg0.g1();
                var8[var9][1] = (byte) arg0.g1();
            }
            if (var8.length > 0) {
                arg3[var5] = var8;
            }
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([[CLMBMGIXGO;I)V")
    private static final void readDomain(char[][] arg0, Packet arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.g1()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.g1();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(Z[C)V")
    private static final void filterCharacters(boolean arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (allowCharacters(arg1[var3], _flowObfuscator6)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (!arg0) {
            for (int var4 = var2; var4 < arg1.length; var4++) {
                arg1[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(CI)Z")
    private static final boolean allowCharacters(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String filter(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        filterCharacters(false, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        filterTld(false, var6);
        filterBad(var6, true);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        filterDomains((byte) 0, var6);
        filterFragments(var6, -511);
        for (int var8 = 0; var8 < WHITELIST.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(WHITELIST[var8], var11 + 1)) != -1) {
                char[] var12 = WHITELIST[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        replaceUpperCases(var5.toCharArray(), 2, var6);
        formatUpperCases(0, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([CI[C)V")
    private static final void replaceUpperCases(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && isUpperCase(true, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
        if (arg1 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(I[C)V")
    private static final void formatUpperCases(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!isAlpha(var4, -46837)) {
                var2 = true;
            } else if (var2) {
                if (isLowerCase(var4, 1)) {
                    var2 = false;
                }
            } else if (isUpperCase(true, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([CZ)V")
    private static final void filterBad(char[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = badWords.length - 1; var3 >= 0; var3--) {
                filter(badCombinations[var3], arg0, _flowObfuscator8, badWords[var3]);
            }
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(B[C)V")
    private static final void filterDomains(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        filter(null, var2, _flowObfuscator8, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        filter(null, var4, _flowObfuscator8, var5);
        for (int var6 = domains.length - 1; var6 >= 0; var6--) {
            filterDomain(29200, arg1, domains[var6], var4, var2);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void filterDomain(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0 != 29200 || arg2.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var9) {
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
                    if (var8 < arg2.length && (var13 = getEmulatedDomainCharSize(43, var11, arg2[var8], var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = getEmulatedDomainCharSize(43, var11, arg2[var8 - 1], var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !isSymbol(-12789, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = getDomainAtFilterStatus(arg1, 4, arg4, var6);
                int var17 = getDomainDotFilterStatus(_flowObfuscator7, arg3, var7 - 1, arg1);
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

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([CI[CI)I")
    private static final int getDomainAtFilterStatus(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 < 4 || arg1 > 4) {
            return 2;
        } else if (arg3 == 0) {
            return 2;
        } else {
            for (int var4 = arg3 - 1; var4 >= 0 && isSymbol(-12789, arg0[var4]); var4--) {
                if (arg0[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && isSymbol(-12789, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (isSymbol(-12789, arg0[arg3 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(B[CI[C)I")
    private static final int getDomainDotFilterStatus(byte arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && isSymbol(-12789, arg3[var4])) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != -117) {
                return _flowObfuscator8;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && isSymbol(-12789, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (isSymbol(-12789, arg3[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "b", descriptor = "(Z[C)V")
    private static final void filterTld(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg0) {
            return;
        }
        filter(null, var2, _flowObfuscator8, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        filter(null, var4, _flowObfuscator8, var5);
        for (int var6 = 0; var6 < tlds.length; var6++) {
            filterTld(var4, tlds[var6], tldType[var6], (byte) 51, var2, arg1);
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([C[CIB[C[C)V")
    private static final void filterTld(char[] arg0, char[] arg1, int arg2, byte arg3, char[] arg4, char[] arg5) {
        if (arg1.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg1.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = getEmulatedDomainCharSize(43, var12, arg1[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = getEmulatedDomainCharSize(43, var12, arg1[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !isSymbol(-12789, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = getTldDotFilterStatus(36209, arg5, var7, arg4);
                int var18 = getTldSlashFilterStatus(false, arg5, arg0, var8 - 1);
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
                                if (isSymbol(-12789, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!isSymbol(-12789, arg5[var24])) {
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
                                    if (arg0[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg0[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (isSymbol(-12789, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!isSymbol(-12789, arg5[var28])) {
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
        if (arg3 != 51) {
            _flowObfuscator14 = !_flowObfuscator14;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(I[CI[C)I")
    private static final int getTldDotFilterStatus(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && isSymbol(-12789, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && isSymbol(-12789, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 != 36209) {
                _flowObfuscator14 = !_flowObfuscator14;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (isSymbol(-12789, arg1[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(Z[C[CI)I")
    private static final int getTldSlashFilterStatus(boolean arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0) {
            _flowObfuscator3 = 391;
        }
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && isSymbol(-12789, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && isSymbol(-12789, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (isSymbol(-12789, arg1[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([[B[CI[C)V")
    public static final void filter(byte[][] arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 >= 0 || arg3.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg3.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg1.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg1[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg1.length) {
                        var15 = arg1[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg3.length && (var16 = getEmulatedSize(var15, var14, _flowObfuscator9, arg3[var7])) > 0) {
                        if (var16 == 1 && isNumber(var14, -976)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (isNumber(var14, -976) || isNumber(var15, -976))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = getEmulatedSize(var15, var14, _flowObfuscator9, arg3[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !isLowerCaseAlpha(false, var14)) {
                                break label167;
                            }
                            if (isSymbol(-12789, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (isNumber(var14, -976)) {
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
                    if (var5 - 1 < 0 || isSymbol(-12789, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || isSymbol(-12789, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!isSymbol(-12789, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!isSymbol(-12789, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!isSymbol(-12789, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !isBadFragment(var27, (byte) 4)) {
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
                    byte var21 = getIndex(var19, _flowObfuscator10);
                    byte var22 = getIndex(var20, _flowObfuscator10);
                    if (arg0 != null && comboMatches(var21, (byte) 8, arg0, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (isNumber(arg1[var33], -976)) {
                            var30++;
                        } else if (isAlpha(arg1[var33], -46837)) {
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
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean comboMatches(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg1 != 8) {
            _flowObfuscator8 = 308;
        }
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg0 && arg2[var6][1] == arg3) {
                return true;
            }
            if (arg0 < arg2[var6][0] || arg2[var6][0] == arg0 && arg3 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(ICCC)I")
    private static final int getEmulatedDomainCharSize(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 <= 0) {
            return _flowObfuscator3;
        } else if (arg1 == arg2) {
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

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(CCZC)I")
    private static final int getEmulatedSize(char arg0, char arg1, boolean arg2, char arg3) {
        if (!arg2) {
            _flowObfuscator8 = -260;
        }
        if (arg1 == arg3) {
            return 1;
        }
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

    @OriginalMember(owner = "RKAYAFDQ", name = "b", descriptor = "(CI)B")
    private static final byte getIndex(char arg0, int arg1) {
        while (arg1 >= 0) {
            _flowObfuscator1 = -93;
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

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([CI)V")
    private static final void filterFragments(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 >= 0) {
            _flowObfuscator2 = !_flowObfuscator2;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = indexOfNumber(arg0, var3, 319)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!isSymbol(-12789, arg0[var8]) && !isLowerCaseAlpha(false, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = indexOfNonNumber(arg0, 0, var6);
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

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([CII)I")
    private static final int indexOfNumber(char[] arg0, int arg1, int arg2) {
        int var3 = 23 / arg2;
        for (int var4 = arg1; var4 < arg0.length && var4 >= 0; var4++) {
            if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "b", descriptor = "([CII)I")
    private static final int indexOfNonNumber(char[] arg0, int arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg1 != 0) {
                return 3;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(IC)Z")
    private static final boolean isSymbol(int arg0, char arg1) {
        if (arg0 != -12789) {
            throw new NullPointerException();
        }
        return !isAlpha(arg1, -46837) && !isNumber(arg1, -976);
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "(ZC)Z")
    private static final boolean isLowerCaseAlpha(boolean arg0, char arg1) {
        if (arg0) {
            _flowObfuscator10 = -233;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "c", descriptor = "(CI)Z")
    private static final boolean isAlpha(char arg0, int arg1) {
        if (arg1 != -46837) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "d", descriptor = "(CI)Z")
    private static final boolean isNumber(char arg0, int arg1) {
        if (arg1 >= 0) {
            _flowObfuscator10 = 254;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "e", descriptor = "(CI)Z")
    private static final boolean isLowerCase(char arg0, int arg1) {
        if (arg1 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "b", descriptor = "(ZC)Z")
    private static final boolean isUpperCase(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "a", descriptor = "([CB)Z")
    private static final boolean isBadFragment(char[] arg0, byte arg1) {
        if (_flowObfuscator12 != arg1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (!isNumber(arg0[var4], -976) && arg0[var4] != '\u0000') {
                var3 = false;
            }
        }
        if (var3) {
            return true;
        }
        int var5 = firstFragmentId(arg0, 8801);
        int var6 = 0;
        int var7 = fragments.length - 1;
        if (fragments[var6] == var5 || fragments[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (fragments[var8] == var5) {
                return true;
            }
            if (var5 < fragments[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "RKAYAFDQ", name = "b", descriptor = "([CI)I")
    public static final int firstFragmentId(char[] arg0, int arg1) {
        if (_flowObfuscator13 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0.length > 6) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[arg0.length - var4 - 1];
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
