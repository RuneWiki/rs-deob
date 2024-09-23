import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class WordFilter {

    @OriginalMember(owner = "mc", name = "a", descriptor = "Z")
    private static boolean field1066 = true;

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1067 = -9908;

    @OriginalMember(owner = "mc", name = "d", descriptor = "Z")
    private static boolean field1069 = true;

    @OriginalMember(owner = "mc", name = "f", descriptor = "I")
    private static int field1071 = 366;

    @OriginalMember(owner = "mc", name = "g", descriptor = "I")
    private static int field1072 = 730;

    @OriginalMember(owner = "mc", name = "k", descriptor = "B")
    private static byte field1076 = -73;

    @OriginalMember(owner = "mc", name = "l", descriptor = "I")
    private static int field1077 = -711;

    @OriginalMember(owner = "mc", name = "m", descriptor = "B")
    private static byte field1078 = 1;

    @OriginalMember(owner = "mc", name = "t", descriptor = "[Ljava/lang/String;")
    private static final String[] field1085 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "mc", name = "j", descriptor = "B")
    private static byte field1075;

    @OriginalMember(owner = "mc", name = "e", descriptor = "I")
    private static int field1070;

    @OriginalMember(owner = "mc", name = "u", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "mc", name = "c", descriptor = "Z")
    private static boolean field1068;

    @OriginalMember(owner = "mc", name = "h", descriptor = "Z")
    private static boolean field1073;

    @OriginalMember(owner = "mc", name = "i", descriptor = "Z")
    private static boolean field1074;

    @OriginalMember(owner = "mc", name = "n", descriptor = "[I")
    private static int[] field1079;

    @OriginalMember(owner = "mc", name = "s", descriptor = "[I")
    private static int[] field1084;

    @OriginalMember(owner = "mc", name = "o", descriptor = "[[C")
    private static char[][] field1080;

    @OriginalMember(owner = "mc", name = "q", descriptor = "[[C")
    private static char[][] field1082;

    @OriginalMember(owner = "mc", name = "r", descriptor = "[[C")
    private static char[][] field1083;

    @OriginalMember(owner = "mc", name = "p", descriptor = "[[[B")
    private static byte[][][] field1081;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lub;)V")
    public static final void method325(Jagfile arg0) {
        Packet var1 = new Packet(0, arg0.method250("fragmentsenc.txt", null, 8));
        Packet var2 = new Packet(0, arg0.method250("badenc.txt", null, 8));
        Packet var3 = new Packet(0, arg0.method250("domainenc.txt", null, 8));
        Packet var4 = new Packet(0, arg0.method250("tldlist.txt", null, 8));
        method326(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method326(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method328(arg1, 48521);
        method329(4, arg2);
        method330(arg0, false);
        method327(2, arg3);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILkb;)V")
    private static final void method327(int arg0, Packet arg1) {
        int var2 = arg1.method214();
        field1083 = new char[var2][];
        if (arg0 < 2 || arg0 > 2) {
            field1067 = 150;
        }
        field1084 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1084[var3] = arg1.method209();
            char[] var4 = new char[arg1.method209()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method209();
            }
            field1083[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method328(Packet arg0, int arg1) {
        int var2 = arg0.method214();
        field1080 = new char[var2][];
        if (arg1 != 48521) {
            field1066 = !field1066;
        }
        field1081 = new byte[var2][][];
        method331(false, field1080, field1081, arg0);
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(ILkb;)V")
    private static final void method329(int arg0, Packet arg1) {
        int var2 = arg1.method214();
        if (arg0 != 4) {
            field1067 = -374;
        }
        field1082 = new char[var2][];
        method332(field1082, false, arg1);
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lkb;Z)V")
    private static final void method330(Packet arg0, boolean arg1) {
        field1079 = new int[arg0.method214()];
        for (int var2 = 0; var2 < field1079.length; var2++) {
            field1079[var2] = arg0.method211();
        }
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[[C[[[BLkb;)V")
    private static final void method331(boolean arg0, char[][] arg1, byte[][][] arg2, Packet arg3) {
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg3.method209()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method209();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg3.method209()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method209();
                var7[var8][1] = (byte) arg3.method209();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (arg0) {
            field1067 = 443;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[CZLkb;)V")
    private static final void method332(char[][] arg0, boolean arg1, Packet arg2) {
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method209()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method209();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CZ)V")
    private static final void method333(char[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method334(0, arg0[var3])) {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IC)Z")
    private static final boolean method334(int arg0, char arg1) {
        if (arg0 != 0) {
            field1068 = !field1068;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method335(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method333(var4, field1069);
        String var5 = (new String(var4)).trim();
        if (arg1 < 0 || arg1 > 0) {
            field1067 = -496;
        }
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method343(var6, true);
        method338(var6, field1070);
        method339(var6, (byte) 21);
        method352((byte) -81, var6);
        for (int var8 = 0; var8 < field1085.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1085[var8], var11 + 1)) != -1) {
                char[] var12 = field1085[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method336(-14298, var6, var5.toCharArray());
        method337((byte) -102, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C[C)V")
    private static final void method336(int arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method360(arg2[var3], field1078)) {
                arg1[var3] = arg2[var3];
            }
        }
        if (arg0 != -14298) {
            field1067 = 311;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B[C)V")
    private static final void method337(byte arg0, char[] arg1) {
        if (arg0 != -102) {
            field1067 = -244;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method357(var4, false)) {
                var2 = true;
            } else if (var2) {
                if (method359(var4, -17212)) {
                    var2 = false;
                }
            } else if (method360(var4, field1078)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI)V")
    private static final void method338(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1080.length - 1; var3 >= 0; var3--) {
                method347(arg0, field1081[var3], -419, field1080[var3]);
            }
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CB)V")
    private static final void method339(char[] arg0, byte arg1) {
        if (arg1 != 21) {
            field1069 = !field1069;
        }
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method347(var2, null, -419, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method347(var4, null, -419, var5);
        for (int var6 = field1082.length - 1; var6 >= 0; var6--) {
            method340(field1082[var6], var4, arg0, var2, 653);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method340(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
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
                    if (var8 < arg0.length && (var13 = method349(arg0[var8], var11, var12, false)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method349(arg0[var8 - 1], var11, var12, false)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method355(var11, -711)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method341(arg2, arg3, 366, var6);
                int var17 = method342(var7 - 1, arg1, arg2, 0);
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
        if (arg4 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[CII)I")
    private static final int method341(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method355(arg0[var4], -711); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 90 / arg2;
        int var6 = 0;
        for (int var7 = arg3 - 1; var7 >= 0 && method355(arg1[var7], -711); var7--) {
            if (arg1[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method355(arg0[arg3 - 1], -711)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method342(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method355(arg2[var4], -711)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method355(arg1[var6], -711); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 != 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method355(arg2[arg0 + 1], -711)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CZ)V")
    private static final void method343(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method347(var2, null, -419, var3);
        char[] var4 = (char[]) arg0.clone();
        if (!arg1) {
            return;
        }
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method347(var4, null, -419, var5);
        for (int var6 = 0; var6 < field1083.length; var6++) {
            method344(var4, 0, field1084[var6], arg0, field1083[var6], var2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CII[C[C[C)V")
    private static final void method344(char[] arg0, int arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg4.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        if (arg1 != 0) {
            field1070 = -428;
        }
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg4.length; var7 += var10) {
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
                    if (var9 < arg4.length && (var14 = method349(arg4[var9], var12, var13, false)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method349(arg4[var9 - 1], var12, var13, false)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method355(var12, -711)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method345(arg5, arg3, var7, 730);
                int var18 = method346(arg0, -49131, arg3, var8 - 1);
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
                                    if (arg5[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg5[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method355(arg3[var24], -711)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method355(arg3[var24], -711)) {
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
                        for (int var28 = var20 + 1; var28 < arg3.length; var28++) {
                            if (var27) {
                                if (method355(arg3[var28], -711)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method355(arg3[var28], -711)) {
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

    @OriginalMember(owner = "mc", name = "b", descriptor = "([C[CII)I")
    private static final int method345(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method355(arg1[var4], -711)) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            int var6 = 9 / arg3;
            for (int var7 = arg2 - 1; var7 >= 0 && method355(arg0[var7], -711); var7--) {
                if (arg0[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method355(arg1[arg2 - 1], -711)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([CI[CI)I")
    private static final int method346(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method355(arg2[var4], -711)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != -49131) {
                field1069 = !field1069;
            }
            for (int var6 = arg3 + 1; var6 < arg2.length && method355(arg0[var6], -711); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method355(arg2[arg3 + 1], -711)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([C[[BI[C)V")
    public static final void method347(char[] arg0, byte[][] arg1, int arg2, char[] arg3) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg0.length - arg3.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label172: while (true) {
                while (true) {
                    if (var7 >= arg0.length || var12 && var13) {
                        break label172;
                    }
                    boolean var14 = false;
                    char var15 = arg0[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg0.length) {
                        var16 = arg0[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg3.length && (var17 = method350(var16, var15, false, arg3[var8])) > 0) {
                        if (var17 == 1 && method358((byte) 0, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method358((byte) 0, var15) || method358((byte) 0, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label172;
                        }
                        int var18;
                        if ((var18 = method350(var16, var15, false, arg3[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method356(var15, 0)) {
                                break label172;
                            }
                            if (method355(var15, -711) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method358((byte) 0, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label172;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg3.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var5 - 1 < 0 || method355(arg0[var5 - 1], -711) && arg0[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg0.length || method355(arg0[var7], -711) && arg0[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method355(arg0[var27], -711) || arg0[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg0.length && (!method355(arg0[var27 + var29], -711) || arg0[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg0[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method355(arg0[var27 - 1], -711) || arg0[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method361(true, var28)) {
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
                    if (var5 - 1 >= 0) {
                        var20 = arg0[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg0.length) {
                        var21 = arg0[var7];
                    }
                    byte var22 = method351(field1075, var20);
                    byte var23 = method351(field1075, var21);
                    if (arg1 != null && method348(arg1, var23, field1073, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    for (int var33 = var5; var33 < var7; var33++) {
                        if (method358((byte) 0, arg0[var33])) {
                            var31++;
                        } else if (method357(arg0[var33], false)) {
                            var32++;
                        }
                    }
                    if (var31 <= var32) {
                        for (int var34 = var5; var34 < var7; var34++) {
                            arg0[var34] = '*';
                        }
                    }
                }
            }
        }
        if (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "([[BBZB)Z")
    private static final boolean method348(byte[][] arg0, byte arg1, boolean arg2, byte arg3) {
        if (arg2) {
            field1073 = !field1073;
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCCZ)I")
    private static final int method349(char arg0, char arg1, char arg2, boolean arg3) {
        if (arg3) {
            field1067 = 42;
        }
        if (arg0 == arg1) {
            return 1;
        } else if (arg0 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CCZC)I")
    private static final int method350(char arg0, char arg1, boolean arg2, char arg3) {
        if (arg2) {
            field1067 = -316;
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
                    if (arg1 == '1' && arg0 == '3') {
                        return 2;
                    }
                    return 0;
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
                if (arg1 == '[' && arg0 == ')') {
                    return 2;
                }
                return 0;
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
                if (arg1 != '9' && arg1 != '6') {
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BC)B")
    private static final byte method351(byte arg0, char arg1) {
        if (arg0 != 0) {
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

    @OriginalMember(owner = "mc", name = "b", descriptor = "(B[C)V")
    private static final void method352(byte arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 != -81) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method353(var4, field1076, arg1)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method355(arg1[var9], -711) && !method356(arg1[var9], 0)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method354(var7, arg1, false);
                int var10 = 0;
                for (int var11 = var7; var11 < var4; var11++) {
                    var10 = var10 * 10 + arg1[var11] - 48;
                }
                if (var10 <= 255 && var4 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var4; var12++) {
                arg1[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(IB[C)I")
    private static final int method353(int arg0, byte arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 != -73) {
            field1066 = !field1066;
        }
        return -1;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I[CZ)I")
    private static final int method354(int arg0, char[] arg1, boolean arg2) {
        if (arg2) {
            return 1;
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

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CI)Z")
    private static final boolean method355(char arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (method357(arg0, false) || method358((byte) 0, arg0)) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(CI)Z")
    private static final boolean method356(char arg0, int arg1) {
        if (arg1 != 0) {
            field1073 = !field1073;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method357(char arg0, boolean arg1) {
        if (arg1) {
            field1073 = !field1073;
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(BC)Z")
    private static final boolean method358(byte arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "mc", name = "c", descriptor = "(CI)Z")
    private static final boolean method359(char arg0, int arg1) {
        if (arg1 != -17212) {
            field1067 = -6;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(CB)Z")
    private static final boolean method360(char arg0, byte arg1) {
        if (arg1 != 1) {
            field1074 = !field1074;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z[C)Z")
    private static final boolean method361(boolean arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method358((byte) 0, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method362(arg1, (byte) 4);
        if (!arg0) {
            field1072 = 474;
        }
        int var5 = 0;
        int var6 = field1079.length - 1;
        if (field1079[var5] == var4 || field1079[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1079[var7] == var4) {
                return true;
            }
            if (var4 < field1079[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "([CB)I")
    public static final int method362(char[] arg0, byte arg1) {
        if (arg1 != 4) {
            return 1;
        }
        boolean var2 = false;
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
