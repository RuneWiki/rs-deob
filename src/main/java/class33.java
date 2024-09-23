import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IVFROAJT")
public class class33 {

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "B")
    private static byte field974 = 4;

    @OriginalMember(owner = "IVFROAJT", name = "c", descriptor = "Z")
    private static boolean field975 = true;

    @OriginalMember(owner = "IVFROAJT", name = "d", descriptor = "I")
    private static int field976 = -268;

    @OriginalMember(owner = "IVFROAJT", name = "e", descriptor = "I")
    private static int field977 = 30885;

    @OriginalMember(owner = "IVFROAJT", name = "f", descriptor = "I")
    private static int field978 = 5;

    @OriginalMember(owner = "IVFROAJT", name = "g", descriptor = "Z")
    private static boolean field979 = true;

    @OriginalMember(owner = "IVFROAJT", name = "h", descriptor = "B")
    private static byte field980 = 4;

    @OriginalMember(owner = "IVFROAJT", name = "i", descriptor = "I")
    private static int field981 = 3461;

    @OriginalMember(owner = "IVFROAJT", name = "k", descriptor = "I")
    private static int field983 = 20236;

    @OriginalMember(owner = "IVFROAJT", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field990 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "IVFROAJT", name = "j", descriptor = "I")
    private static int field982;

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "Z")
    private static boolean field973;

    @OriginalMember(owner = "IVFROAJT", name = "s", descriptor = "Z")
    public static boolean field991;

    @OriginalMember(owner = "IVFROAJT", name = "l", descriptor = "[I")
    private static int[] field984;

    @OriginalMember(owner = "IVFROAJT", name = "q", descriptor = "[I")
    private static int[] field989;

    @OriginalMember(owner = "IVFROAJT", name = "m", descriptor = "[[C")
    private static char[][] field985;

    @OriginalMember(owner = "IVFROAJT", name = "o", descriptor = "[[C")
    private static char[][] field987;

    @OriginalMember(owner = "IVFROAJT", name = "p", descriptor = "[[C")
    private static char[][] field988;

    @OriginalMember(owner = "IVFROAJT", name = "n", descriptor = "[[[B")
    private static byte[][][] field986;

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(LCVNWKEAW;)V")
    public static final void method337(class7 arg0) {
        class62 var1 = new class62(-417, arg0.method180("fragmentsenc.txt", null));
        class62 var2 = new class62(-417, arg0.method180("badenc.txt", null));
        class62 var3 = new class62(-417, arg0.method180("domainenc.txt", null));
        class62 var4 = new class62(-417, arg0.method180("tldlist.txt", null));
        method338(var1, var2, var3, var4);
        if (class54.field1472) {
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(LXOUQUKZW;LXOUQUKZW;LXOUQUKZW;LXOUQUKZW;)V")
    private static final void method338(class62 arg0, class62 arg1, class62 arg2, class62 arg3) {
        method340(0, arg1);
        method341(arg2, (byte) 4);
        method342(14430, arg0);
        method339(arg3, 627);
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(LXOUQUKZW;I)V")
    private static final void method339(class62 arg0, int arg1) {
        int var2 = arg0.method526();
        field988 = new char[var2][];
        field989 = new int[var2];
        int var3 = 25 / arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            field989[var4] = arg0.method521();
            char[] var5 = new char[arg0.method521()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method521();
            }
            field988[var4] = var5;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(ILXOUQUKZW;)V")
    private static final void method340(int arg0, class62 arg1) {
        int var2 = arg1.method526();
        field985 = new char[var2][];
        field986 = new byte[var2][][];
        if (arg0 != 0) {
            field979 = !field979;
        }
        method343(field986, field985, -9098, arg1);
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(LXOUQUKZW;B)V")
    private static final void method341(class62 arg0, byte arg1) {
        int var2 = arg0.method526();
        field987 = new char[var2][];
        if (field974 != arg1) {
            field982 = -434;
        }
        method344((byte) -60, field987, arg0);
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(ILXOUQUKZW;)V")
    private static final void method342(int arg0, class62 arg1) {
        field984 = new int[arg1.method526()];
        for (int var2 = 0; var2 < field984.length; var2++) {
            field984[var2] = arg1.method523();
        }
        if (arg0 == 14430) {
            ;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "([[[B[[CILXOUQUKZW;)V")
    private static final void method343(byte[][][] arg0, char[][] arg1, int arg2, class62 arg3) {
        if (arg2 != -9098) {
            return;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg3.method521()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method521();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg3.method521()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method521();
                var7[var8][1] = (byte) arg3.method521();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(B[[CLXOUQUKZW;)V")
    private static final void method344(byte arg0, char[][] arg1, class62 arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method521()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method521();
            }
            arg1[var3] = var4;
        }
        if (arg0 == -60) {
            ;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(Z[C)V")
    private static final void method345(boolean arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method346(30764, arg1[var3])) {
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
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(IC)Z")
    private static final boolean method346(int arg0, char arg1) {
        if (arg0 != 30764) {
            field975 = !field975;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method347(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method345(true, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method355(var6, (byte) 8);
        method350(var6, -2146);
        if (!arg0) {
            throw new NullPointerException();
        }
        method351(field976, var6);
        method364(var6, field978);
        for (int var8 = 0; var8 < field990.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field990[var8], var11 + 1)) != -1) {
                char[] var12 = field990[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method348(false, var6, var5.toCharArray());
        method349(true, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(Z[C[C)V")
    private static final void method348(boolean arg0, char[] arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method372((byte) -82, arg2[var3])) {
                arg1[var3] = arg2[var3];
            }
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(Z[C)V")
    private static final void method349(boolean arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method369(field979, var4)) {
                var2 = true;
            } else if (var2) {
                if (method371(field981, var4)) {
                    var2 = false;
                }
            } else if (method372((byte) -82, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "([CI)V")
    private static final void method350(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field985.length - 1; var3 >= 0; var3--) {
                method359(field985[var3], 31014, arg0, field986[var3]);
            }
        }
        if (arg1 != -2146) {
            field973 = !field973;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(I[C)V")
    private static final void method351(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            return;
        }
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method359(var3, 31014, var2, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method359(var5, 31014, var4, null);
        for (int var6 = field987.length - 1; var6 >= 0; var6--) {
            method352(field987[var6], arg1, var4, var2, 0);
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method352(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        if (arg4 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg1.length - arg0.length; var7 += var10) {
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
                    if (var9 < arg0.length && (var14 = method361(var12, -940, arg0[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method361(var12, -940, arg0[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method367(var12, -77)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method353(893, var7, arg1, arg3);
                int var18 = method354(arg1, 95, var8 - 1, arg2);
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

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(II[C[C)I")
    private static final int method353(int arg0, int arg1, char[] arg2, char[] arg3) {
        int var4 = 33 / arg0;
        if (arg1 == 0) {
            return 2;
        }
        for (int var5 = arg1 - 1; var5 >= 0 && method367(arg2[var5], -77); var5--) {
            if (arg2[var5] == '@') {
                return 3;
            }
        }
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method367(arg3[var7], -77); var7--) {
            if (arg3[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method367(arg2[arg1 - 1], -77)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "([CII[C)I")
    private static final int method354(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method367(arg0[var4], -77)) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            int var6 = 58 / arg1;
            for (int var7 = arg2 + 1; var7 < arg0.length && method367(arg3[var7], -77); var7++) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method367(arg0[arg2 + 1], -77)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "([CB)V")
    private static final void method355(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 8) {
            field979 = !field979;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method359(var3, 31014, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method359(var5, 31014, var4, null);
        for (int var6 = 0; var6 < field988.length; var6++) {
            method356(0, var4, arg0, var2, field988[var6], field989[var6]);
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(I[C[C[C[CI)V")
    private static final void method356(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg4.length; var7 += var10) {
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
                    if (var9 < arg4.length && (var14 = method361(var12, -940, arg4[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method361(var12, -940, arg4[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method367(var12, -77)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method357(var7, arg3, 0, arg2);
                int var18 = method358(field977, arg1, var8 - 1, arg2);
                if (arg5 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg5 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg5 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg5 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg3[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg3[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method367(arg2[var24], -77)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method367(arg2[var24], -77)) {
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
                        for (int var28 = var20 + 1; var28 < arg2.length; var28++) {
                            if (var27) {
                                if (method367(arg2[var28], -77)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method367(arg2[var28], -77)) {
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
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(I[CI[C)I")
    private static final int method357(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method367(arg3[var4], -77)) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 != 0) {
                field973 = !field973;
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method367(arg1[var6], -77); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method367(arg3[arg0 - 1], -77)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(I[CI[C)I")
    private static final int method358(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method367(arg3[var4], -77)) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != 30885) {
                return field976;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && method367(arg1[var6], -77); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method367(arg3[arg2 + 1], -77)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "([CI[C[[B)V")
    public static final void method359(char[] arg0, int arg1, char[] arg2, byte[][] arg3) {
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg2.length - arg0.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label176: while (true) {
                while (true) {
                    if (var7 >= arg2.length || var12 && var13) {
                        break label176;
                    }
                    boolean var14 = false;
                    char var15 = arg2[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg2.length) {
                        var16 = arg2[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg0.length && (var17 = method362(0, arg0[var8], var16, var15)) > 0) {
                        if (var17 == 1 && method370(field980, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method370(field980, var15) || method370(field980, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label176;
                        }
                        int var18;
                        if ((var18 = method362(0, arg0[var8 - 1], var16, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method368(var15, true)) {
                                break label176;
                            }
                            if (method367(var15, -77) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method370(field980, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label176;
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
                    if (var5 - 1 < 0 || method367(arg2[var5 - 1], -77) && arg2[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg2.length || method367(arg2[var7], -77) && arg2[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method367(arg2[var27], -77) || arg2[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg2.length && (!method367(arg2[var27 + var29], -77) || arg2[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg2[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method367(arg2[var27 - 1], -77) || arg2[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method373(556, var28)) {
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
                        var20 = arg2[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg2.length) {
                        var21 = arg2[var7];
                    }
                    byte var22 = method363(var20, 0);
                    byte var23 = method363(var21, 0);
                    if (arg3 != null && method360(var23, var22, 0, arg3)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method370(field980, arg2[var34])) {
                            var31++;
                        } else if (method369(field979, arg2[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg2[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
        if (arg1 != 31014) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(BBI[[B)Z")
    private static final boolean method360(byte arg0, byte arg1, int arg2, byte[][] arg3) {
        if (arg2 != 0) {
            field979 = !field979;
        }
        int var4 = 0;
        if (arg3[var4][0] == arg1 && arg3[var4][1] == arg0) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg3[var5][0] == arg1 && arg3[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg3[var6][0] == arg1 && arg3[var6][1] == arg0) {
                return true;
            }
            if (arg1 < arg3[var6][0] || arg3[var6][0] == arg1 && arg0 < arg3[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(CICC)I")
    private static final int method361(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 >= 0) {
            return 0;
        } else if (arg0 == arg2) {
            return 1;
        } else if (arg2 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg0 == '(' && arg3 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg2 == 's' && arg0 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(ICCC)I")
    private static final int method362(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            field979 = !field979;
        }
        if (arg1 == arg3) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                    if (arg3 == '/' && arg2 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg3 != '6' && arg3 != '8') {
                    if ((arg3 != '1' || arg2 != '3') && (arg3 != 'i' || arg2 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg1 == 'c') {
                if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'd') {
                if ((arg3 != '[' || arg2 != ')') && (arg3 != 'i' || arg2 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'e') {
                if (arg3 != '3' && arg3 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'f') {
                if (arg3 == 'p' && arg2 == 'h') {
                    return 2;
                }
                if (arg3 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'g') {
                if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'h') {
                if (arg3 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'i') {
                if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
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
                if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
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
                if (arg3 != '0' && arg3 != '*') {
                    if (arg3 == '(' && arg2 == ')' || arg3 == '[' && arg2 == ']' || arg3 == '{' && arg2 == '}' || arg3 == '<' && arg2 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 't') {
                if (arg3 != '7' && arg3 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'u') {
                if (arg3 == 'v') {
                    return 1;
                }
                if (arg3 == '\\' && arg2 == '/' || arg3 == '\\' && arg2 == '|' || arg3 == '|' && arg2 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'v') {
                if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg3 == 'v' && arg2 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg3 != ')' || arg2 != '(') && (arg3 != '}' || arg2 != '{') && (arg3 != ']' || arg2 != '[') && (arg3 != '>' || arg2 != '<')) {
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
                if (arg3 == 'o' || arg3 == 'O') {
                    return 1;
                } else if ((arg3 != '(' || arg2 != ')') && (arg3 != '{' || arg2 != '}') && (arg3 != '[' || arg2 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg1 == '1') {
                return arg3 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg1 == ',') {
            return arg3 == '.' ? 1 : 0;
        } else if (arg1 == '.') {
            return arg3 == ',' ? 1 : 0;
        } else if (arg1 == '!') {
            return arg3 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(CI)B")
    private static final byte method363(char arg0, int arg1) {
        if (arg1 != 0) {
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

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "([CI)V")
    private static final void method364(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg1 < 5 || arg1 > 5) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method365((byte) 4, var3, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method367(arg0[var8], -77) && !method368(arg0[var8], true)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method366(var6, true, arg0);
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

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(BI[C)I")
    private static final int method365(byte arg0, int arg1, char[] arg2) {
        if (arg0 != 4) {
            field975 = !field975;
        }
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(IZ[C)I")
    private static final int method366(int arg0, boolean arg1, char[] arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (!arg1) {
                field978 = 399;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(CI)Z")
    private static final boolean method367(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return !method369(field979, arg0) && !method370(field980, arg0);
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(CZ)Z")
    private static final boolean method368(char arg0, boolean arg1) {
        if (!arg1) {
            field975 = !field975;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(ZC)Z")
    private static final boolean method369(boolean arg0, char arg1) {
        if (!arg0) {
            field979 = !field979;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(BC)Z")
    private static final boolean method370(byte arg0, char arg1) {
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(IC)Z")
    private static final boolean method371(int arg0, char arg1) {
        if (arg0 != 3461) {
            field979 = !field979;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(BC)Z")
    private static final boolean method372(byte arg0, char arg1) {
        if (arg0 != -82) {
            field973 = !field973;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "IVFROAJT", name = "b", descriptor = "(I[C)Z")
    private static final boolean method373(int arg0, char[] arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method370(field980, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method374((byte) 3, arg1);
        int var5 = 0;
        int var6 = field984.length - 1;
        if (field984[var5] == var4 || field984[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field984[var7] == var4) {
                return true;
            }
            if (var4 < field984[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "IVFROAJT", name = "a", descriptor = "(B[C)I")
    public static final int method374(byte arg0, char[] arg1) {
        if (arg0 != 3) {
            field979 = !field979;
        }
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
        return var2;
    }
}
