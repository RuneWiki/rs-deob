import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class WordFilter {

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private static int field971 = 3073;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private static int field972 = 95;

    @OriginalMember(owner = "jc", name = "d", descriptor = "Z")
    private static boolean field974 = true;

    @OriginalMember(owner = "jc", name = "e", descriptor = "B")
    private static byte field975 = 75;

    @OriginalMember(owner = "jc", name = "f", descriptor = "B")
    private static byte field976 = 75;

    @OriginalMember(owner = "jc", name = "g", descriptor = "B")
    private static byte field977 = 6;

    @OriginalMember(owner = "jc", name = "h", descriptor = "B")
    private static byte field978 = 6;

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    private static int field979 = 947;

    @OriginalMember(owner = "jc", name = "j", descriptor = "Z")
    private static boolean field980 = true;

    @OriginalMember(owner = "jc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field988 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    private static int field981;

    @OriginalMember(owner = "jc", name = "s", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "jc", name = "c", descriptor = "Z")
    private static boolean field973;

    @OriginalMember(owner = "jc", name = "l", descriptor = "[I")
    private static int[] field982;

    @OriginalMember(owner = "jc", name = "q", descriptor = "[I")
    private static int[] field987;

    @OriginalMember(owner = "jc", name = "m", descriptor = "[[C")
    private static char[][] field983;

    @OriginalMember(owner = "jc", name = "o", descriptor = "[[C")
    private static char[][] field985;

    @OriginalMember(owner = "jc", name = "p", descriptor = "[[C")
    private static char[][] field986;

    @OriginalMember(owner = "jc", name = "n", descriptor = "[[[B")
    private static byte[][][] field984;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lub;)V")
    public static final void method302(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method242((byte) 6, null, "fragmentsenc.txt"), 4);
        Packet var2 = new Packet(arg0.method242((byte) 6, null, "badenc.txt"), 4);
        Packet var3 = new Packet(arg0.method242((byte) 6, null, "domainenc.txt"), 4);
        Packet var4 = new Packet(arg0.method242((byte) 6, null, "tldlist.txt"), 4);
        method303(var1, var2, var3, var4);
        if (Linkable.field289) {
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;Lkb;Lkb;Lkb;)V")
    private static final void method303(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method305(302, arg1);
        method306(0, arg2);
        method307(arg0, true);
        method304(arg3, 158);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;I)V")
    private static final void method304(Packet arg0, int arg1) {
        int var2 = arg0.method206();
        field986 = new char[var2][];
        field987 = new int[var2];
        int var3 = 16 / arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            field987[var4] = arg0.method201();
            char[] var5 = new char[arg0.method201()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method201();
            }
            field986[var4] = var5;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILkb;)V")
    private static final void method305(int arg0, Packet arg1) {
        int var2 = 36 / arg0;
        int var3 = arg1.method206();
        field983 = new char[var3][];
        field984 = new byte[var3][][];
        method308(-467, arg1, field984, field983);
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(ILkb;)V")
    private static final void method306(int arg0, Packet arg1) {
        int var2 = arg1.method206();
        field985 = new char[var2][];
        if (arg0 >= 0 && arg0 <= 0) {
            method309(arg1, field975, field985);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;Z)V")
    private static final void method307(Packet arg0, boolean arg1) {
        field982 = new int[arg0.method206()];
        if (arg1) {
            for (int var2 = 0; var2 < field982.length; var2++) {
                field982[var2] = arg0.method203();
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILkb;[[[B[[C)V")
    private static final void method308(int arg0, Packet arg1, byte[][][] arg2, char[][] arg3) {
        if (arg0 >= 0) {
            field973 = !field973;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method201()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method201();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method201()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method201();
                var7[var8][1] = (byte) arg1.method201();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;B[[C)V")
    private static final void method309(Packet arg0, byte arg1, char[][] arg2) {
        if (field976 != arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method201()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method201();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I[C)V")
    private static final void method310(int arg0, char[] arg1) {
        if (arg0 != 7) {
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (!method311(arg1[var2], 0)) {
                arg1[var2] = ' ';
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(CI)Z")
    private static final boolean method311(char arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method312(byte arg0, String arg1) {
        if (arg0 != -82) {
            throw new NullPointerException();
        }
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toLowerCase().toCharArray();
        method310(7, var4);
        method320(var4, 947);
        method315((byte) 0, var4);
        method316(804, var4);
        method329(288, var4);
        for (int var5 = 0; var5 < field988.length; var5++) {
            int var8 = -1;
            while ((var8 = arg1.indexOf(field988[var5], var8 + 1)) != -1) {
                char[] var9 = field988[var5].toCharArray();
                for (int var10 = 0; var10 < var9.length; var10++) {
                    var4[var8 + var10] = var9[var10];
                }
            }
        }
        method313((byte) 6, var4, arg1.toCharArray());
        method314(field978, var4);
        long var6 = System.currentTimeMillis();
        return (new String(var4)).trim();
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(B[C[C)V")
    private static final void method313(byte arg0, char[] arg1, char[] arg2) {
        if (field977 != arg0) {
            field973 = !field973;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg1[var3] != '*' && method337(arg2[var3], 8)) {
                arg1[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(B[C)V")
    private static final void method314(byte arg0, char[] arg1) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method334(-682, var5)) {
                var3 = true;
            } else if (var3) {
                if (method336((byte) 4, var5)) {
                    var3 = false;
                }
            } else if (method337(var5, 8)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(B[C)V")
    private static final void method315(byte arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field983.length - 1; var3 >= 0; var3--) {
                method324(field984[var3], arg1, field983[var3], 149);
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(I[C)V")
    private static final void method316(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg0 <= 0) {
            field974 = !field974;
        }
        method324(null, var2, var3, 149);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method324(null, var4, var5, 149);
        for (int var6 = field985.length - 1; var6 >= 0; var6--) {
            method317(field985[var6], var4, (byte) 8, var2, arg1);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([C[CB[C[C)V")
    private static final void method317(char[] arg0, char[] arg1, byte arg2, char[] arg3, char[] arg4) {
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        if (arg2 == 8) {
            boolean var6 = false;
        } else {
            field974 = !field974;
        }
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label67: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label67;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method326(arg0[var9], var13, var12, (byte) 17)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label67;
                        }
                        int var15;
                        if ((var15 = method326(arg0[var9 - 1], var13, var12, (byte) 17)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method332(9, var12)) {
                                break label67;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method318(21835, arg4, var7, arg3);
                int var18 = method319(var8 - 1, arg4, arg1, (byte) -2);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg4[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method318(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 != 21835) {
            return field971;
        } else if (arg2 == 0) {
            return 2;
        } else {
            for (int var4 = arg2 - 1; var4 >= 0 && method332(9, arg1[var4]); var4--) {
                if (arg1[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method332(9, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method332(9, arg1[arg2 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method319(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg3 != -2) {
            field971 = -127;
        }
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method332(9, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method332(9, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method332(9, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([CI)V")
    private static final void method320(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method324(null, var2, var3, 149);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg1 <= 0) {
            field973 = !field973;
        }
        method324(null, var4, var5, 149);
        for (int var6 = 0; var6 < field986.length; var6++) {
            method321(var2, field986[var6], field987[var6], 1, arg0, var4);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([C[CII[C[C)V")
    private static final void method321(char[] arg0, char[] arg1, int arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg3 < 1 || arg3 > 1 || arg1.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg1.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method326(arg1[var9], var13, var12, (byte) 17)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method326(arg1[var9 - 1], var13, var12, (byte) 17)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method332(9, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method322(arg4, (byte) -80, var7, arg0);
                int var18 = method323(arg5, var8 - 1, (byte) -3, arg4);
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
                                if (method332(9, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method332(9, arg4[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg4.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method332(9, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method332(9, arg4[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg4[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([CBI[C)I")
    private static final int method322(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method332(9, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != -80) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg2 - 1; var7 >= 0 && method332(9, arg3[var7]); var7--) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method332(9, arg0[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([CIB[C)I")
    private static final int method323(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method332(9, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg2 != -3) {
                return field972;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method332(9, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method332(9, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([[B[C[CI)V")
    private static final void method324(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var5 = 61 / arg3;
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            label126: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label126;
                    }
                    boolean var12 = false;
                    char var13 = arg1[var7];
                    char var14 = 0;
                    if (var7 + 1 < arg1.length) {
                        var14 = arg1[var7 + 1];
                    }
                    int var15;
                    if (var8 < arg2.length && (var15 = method327(var13, true, var14, arg2[var8])) > 0) {
                        var7 += var15;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label126;
                        }
                        int var16;
                        if ((var16 = method327(var13, true, var14, arg2[var8 - 1])) > 0) {
                            var7 += var16;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method333((byte) 73, var13)) {
                                break label126;
                            }
                            if (method332(9, var13) && var13 != '\'') {
                                var11 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label126;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var17 = true;
                if (var11) {
                    boolean var22 = false;
                    boolean var23 = false;
                    if (var6 - 1 < 0 || method332(9, arg1[var6 - 1]) && arg1[var6 - 1] != '\'') {
                        var22 = true;
                    }
                    if (var7 >= arg1.length || method332(9, arg1[var7]) && arg1[var7] != '\'') {
                        var23 = true;
                    }
                    if (!var22 || !var23) {
                        boolean var24 = false;
                        int var25 = var6 - 2;
                        if (var22) {
                            var25 = var6;
                        }
                        while (!var24 && var25 < var7) {
                            if (var25 >= 0 && (!method332(9, arg1[var25]) || arg1[var25] == '\'')) {
                                char[] var26 = new char[3];
                                int var27;
                                for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!method332(9, arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
                                    var26[var27] = arg1[var25 + var27];
                                }
                                boolean var28 = true;
                                if (var27 == 0) {
                                    var28 = false;
                                }
                                if (var27 < 3 && var25 - 1 >= 0 && (!method332(9, arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
                                    var28 = false;
                                }
                                if (var28 && !method338(false, var26)) {
                                    var24 = true;
                                }
                            }
                            var25++;
                        }
                        if (!var24) {
                            var17 = false;
                        }
                    }
                } else {
                    char var18 = ' ';
                    if (var6 - 1 >= 0) {
                        var18 = arg1[var6 - 1];
                    }
                    char var19 = ' ';
                    if (var7 < arg1.length) {
                        var19 = arg1[var7];
                    }
                    byte var20 = method328(false, var18);
                    byte var21 = method328(false, var19);
                    if (arg0 != null && method325(var20, var21, 10068, arg0)) {
                        var17 = false;
                    }
                }
                if (var17) {
                    int var29 = 0;
                    for (int var30 = var6; var30 < var7; var30++) {
                        if (method335(arg1[var30], (byte) -70)) {
                            var29++;
                        }
                    }
                    if (var29 * 100 / (var7 - var6) <= 50) {
                        for (int var31 = var6; var31 < var7; var31++) {
                            arg1[var31] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BBI[[B)Z")
    private static final boolean method325(byte arg0, byte arg1, int arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg3[var4][0] == arg0 && arg3[var4][1] == arg1) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg2 != 10068) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3[var5][0] == arg0 && arg3[var5][1] == arg1) {
            return true;
        }
        do {
            int var7 = (var4 + var5) / 2;
            if (arg3[var7][0] == arg0 && arg3[var7][1] == arg1) {
                return true;
            }
            if (arg0 < arg3[var7][0] || arg3[var7][0] == arg0 && arg1 < arg3[var7][1]) {
                var5 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(CCCB)I")
    private static final int method326(char arg0, char arg1, char arg2, byte arg3) {
        if (arg3 != 17) {
            return field979;
        } else if (arg0 == arg2) {
            return 1;
        } else if (arg0 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg0 == 's' && arg2 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(CZCC)I")
    private static final int method327(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                    if (arg0 == '/' && arg2 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg0 == '1' && arg2 == '3') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'c') {
                if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                return 0;
            }
            if (arg3 == 'e') {
                if (arg0 != '3' && arg0 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg0 == 'p' && arg2 == 'h') {
                    return 2;
                }
                if (arg0 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg0 != '9' && arg0 != '6') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'h') {
                if (arg0 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'i') {
                if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                if (arg0 != '0' && arg0 != '*') {
                    if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
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
                if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 't') {
                if (arg0 == '7') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'u') {
                if (arg0 == 'v') {
                    return 1;
                }
                if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'v') {
                if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg0 == 'v' && arg2 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
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
                if (arg0 == 'o' || arg0 == 'O') {
                    return 1;
                } else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg3 == '1') {
                return arg0 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            return arg0 == '.' ? 1 : 0;
        } else if (arg3 == '.') {
            return arg0 == ',' ? 1 : 0;
        } else if (arg3 == '!') {
            return arg0 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZC)B")
    private static final byte method328(boolean arg0, char arg1) {
        if (arg0) {
            field980 = !field980;
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

    @OriginalMember(owner = "jc", name = "c", descriptor = "(I[C)V")
    private static final void method329(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 46 / arg0;
        while (true) {
            do {
                int var7;
                if ((var7 = method330(arg1, field981, var3)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method332(9, arg1[var9]) && !method333((byte) 73, arg1[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var7;
                }
                var3 = method331(arg1, var7, -401);
                int var10 = 0;
                for (int var11 = var7; var11 < var3; var11++) {
                    var10 = var10 * 10 + arg1[var11] - 48;
                }
                if (var10 <= 255 && var3 - var7 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var12 = var5; var12 < var3; var12++) {
                arg1[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "([CII)I")
    private static final int method330(char[] arg0, int arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return arg1 == 0 ? -1 : field971;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "([CII)I")
    private static final int method331(char[] arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            field980 = !field980;
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

    @OriginalMember(owner = "jc", name = "a", descriptor = "(IC)Z")
    private static final boolean method332(int arg0, char arg1) {
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        return !method334(-682, arg1) && !method335(arg1, (byte) -70);
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BC)Z")
    private static final boolean method333(byte arg0, char arg1) {
        if (arg0 != 73) {
            field980 = !field980;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(IC)Z")
    private static final boolean method334(int arg0, char arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(CB)Z")
    private static final boolean method335(char arg0, byte arg1) {
        if (arg1 != -70) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(BC)Z")
    private static final boolean method336(byte arg0, char arg1) {
        if (arg0 != 4) {
            field979 = -472;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "(CI)Z")
    private static final boolean method337(char arg0, int arg1) {
        if (arg1 != 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Z[C)Z")
    private static final boolean method338(boolean arg0, char[] arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (!method335(arg1[var4], (byte) -70) && arg1[var4] != '\u0000') {
                var3 = false;
            }
        }
        if (var3) {
            return true;
        }
        int var5 = method339(arg1, 9);
        int var6 = 0;
        int var7 = field982.length - 1;
        if (field982[var6] == var5 || field982[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field982[var8] == var5) {
                return true;
            }
            if (var5 < field982[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "jc", name = "b", descriptor = "([CI)I")
    private static final int method339(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != 9) {
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
