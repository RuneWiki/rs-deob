import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KUCFVEDX")
public class class35 {

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "I")
    private static int field1062 = 835;

    @OriginalMember(owner = "KUCFVEDX", name = "c", descriptor = "I")
    private static int field1064 = 2;

    @OriginalMember(owner = "KUCFVEDX", name = "e", descriptor = "B")
    private static byte field1066 = 85;

    @OriginalMember(owner = "KUCFVEDX", name = "f", descriptor = "I")
    private static int field1067 = 798;

    @OriginalMember(owner = "KUCFVEDX", name = "g", descriptor = "B")
    private static byte field1068 = 53;

    @OriginalMember(owner = "KUCFVEDX", name = "h", descriptor = "I")
    private static int field1069 = -979;

    @OriginalMember(owner = "KUCFVEDX", name = "i", descriptor = "B")
    private static byte field1070 = -37;

    @OriginalMember(owner = "KUCFVEDX", name = "j", descriptor = "Z")
    private static boolean field1071 = true;

    @OriginalMember(owner = "KUCFVEDX", name = "k", descriptor = "B")
    private static byte field1072 = 7;

    @OriginalMember(owner = "KUCFVEDX", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1080 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "Z")
    private static boolean field1063;

    @OriginalMember(owner = "KUCFVEDX", name = "d", descriptor = "Z")
    private static boolean field1065;

    @OriginalMember(owner = "KUCFVEDX", name = "l", descriptor = "Z")
    private static boolean field1073;

    @OriginalMember(owner = "KUCFVEDX", name = "t", descriptor = "Z")
    public static boolean field1081;

    @OriginalMember(owner = "KUCFVEDX", name = "m", descriptor = "[I")
    private static int[] field1074;

    @OriginalMember(owner = "KUCFVEDX", name = "r", descriptor = "[I")
    private static int[] field1079;

    @OriginalMember(owner = "KUCFVEDX", name = "n", descriptor = "[[C")
    private static char[][] field1075;

    @OriginalMember(owner = "KUCFVEDX", name = "p", descriptor = "[[C")
    private static char[][] field1077;

    @OriginalMember(owner = "KUCFVEDX", name = "q", descriptor = "[[C")
    private static char[][] field1078;

    @OriginalMember(owner = "KUCFVEDX", name = "o", descriptor = "[[[B")
    private static byte[][][] field1076;

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(LXMRRKSSB;)V")
    public static final void method301(class60 arg0) {
        class62 var1 = new class62(arg0.method465("fragmentsenc.txt", null), 49938);
        class62 var2 = new class62(arg0.method465("badenc.txt", null), 49938);
        class62 var3 = new class62(arg0.method465("domainenc.txt", null), 49938);
        class62 var4 = new class62(arg0.method465("tldlist.txt", null), 49938);
        method302(var1, var2, var3, var4);
        if (class15.field717) {
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(LXQPFGONL;LXQPFGONL;LXQPFGONL;LXQPFGONL;)V")
    private static final void method302(class62 arg0, class62 arg1, class62 arg2, class62 arg3) {
        method304(arg1, 0);
        method305(arg2, true);
        method306(885, arg0);
        method303(arg3, (byte) 5);
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(LXQPFGONL;B)V")
    private static final void method303(class62 arg0, byte arg1) {
        int var2 = arg0.method483();
        field1078 = new char[var2][];
        field1079 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1079[var3] = arg0.method478();
            char[] var4 = new char[arg0.method478()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method478();
            }
            field1078[var3] = var4;
        }
        if (arg1 != 5) {
            field1073 = true;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(LXQPFGONL;I)V")
    private static final void method304(class62 arg0, int arg1) {
        int var2 = arg0.method483();
        field1075 = new char[var2][];
        field1076 = new byte[var2][][];
        method307(-36522, field1075, arg0, field1076);
        if (arg1 < 0 || arg1 > 0) {
            field1062 = 386;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(LXQPFGONL;Z)V")
    private static final void method305(class62 arg0, boolean arg1) {
        int var2 = arg0.method483();
        field1077 = new char[var2][];
        method308(-776, field1077, arg0);
        if (!arg1) {
            field1062 = 289;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(ILXQPFGONL;)V")
    private static final void method306(int arg0, class62 arg1) {
        field1074 = new int[arg1.method483()];
        for (int var2 = 0; var2 < field1074.length; var2++) {
            field1074[var2] = arg1.method480();
        }
        int var3 = 43 / arg0;
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(I[[CLXQPFGONL;[[[B)V")
    private static final void method307(int arg0, char[][] arg1, class62 arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg2.method478()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method478();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg2.method478()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method478();
                var7[var8][1] = (byte) arg2.method478();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg0 == -36522) {
            ;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(I[[CLXQPFGONL;)V")
    private static final void method308(int arg0, char[][] arg1, class62 arg2) {
        if (arg0 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method478()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method478();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CI)V")
    private static final void method309(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method310(arg0[var3], field1064)) {
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
        if (arg1 != -39833) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(CI)Z")
    private static final boolean method310(char arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method311(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method309(var4, -39833);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method319(var6, 4);
        method314(var6, false);
        method315(var6, -754);
        method328(var6, true);
        for (int var8 = 0; var8 < field1080.length; var8++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field1080[var8], var12 + 1)) != -1) {
                char[] var13 = field1080[var8].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        if (arg1 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        method312(var5.toCharArray(), -634, var6);
        method313(var6, (byte) 1);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CI[C)V")
    private static final void method312(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method336(arg0[var3], 833)) {
                arg2[var3] = arg0[var3];
            }
        }
        while (arg1 >= 0) {
            field1064 = -265;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CB)V")
    private static final void method313(char[] arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var2 = false;
        } else {
            field1073 = true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method333(false, var5)) {
                var3 = true;
            } else if (var3) {
                if (method335(field1072, var5)) {
                    var3 = false;
                }
            } else if (method336(var5, 833)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CZ)V")
    private static final void method314(char[] arg0, boolean arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1075.length - 1; var4 >= 0; var4--) {
                method323(field1075[var4], arg0, field1067, field1076[var4]);
            }
        }
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "([CI)V")
    private static final void method315(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method323(var3, var2, field1067, null);
        char[] var4 = (char[]) arg0.clone();
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        char[] var6 = new char[] { 'd', 'o', 't' };
        method323(var6, var4, field1067, null);
        for (int var7 = field1077.length - 1; var7 >= 0; var7--) {
            method316(var2, var4, arg0, field1077[var7], true);
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([C[C[C[CZ)V")
    private static final void method316(char[] arg0, char[] arg1, char[] arg2, char[] arg3, boolean arg4) {
        if (!arg4 || arg3.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg3.length; var6 += var9) {
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
                    if (var8 < arg3.length && (var13 = method325(var12, 0, var11, arg3[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method325(var12, 0, var11, arg3[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method331(var11, 0)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method317(arg2, 0, arg0, var6);
                int var17 = method318(arg1, 119, var7 - 1, arg2);
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

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CI[CI)I")
    private static final int method317(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method331(arg0[var4], 0); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg1 != 0) {
            field1063 = !field1063;
        }
        for (int var6 = arg3 - 1; var6 >= 0 && method331(arg2[var6], 0); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method331(arg0[arg3 - 1], 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CII[C)I")
    private static final int method318(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method331(arg3[var4], 0)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 <= 0) {
                field1065 = !field1065;
            }
            for (int var6 = arg2 + 1; var6 < arg3.length && method331(arg0[var6], 0); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method331(arg3[arg2 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "c", descriptor = "([CI)V")
    private static final void method319(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method323(var3, var2, field1067, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg1 != 4) {
            field1062 = 177;
        }
        method323(var5, var4, field1067, null);
        for (int var6 = 0; var6 < field1078.length; var6++) {
            method320(field1078[var6], 2, var4, field1079[var6], arg0, var2);
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CI[CI[C[C)V")
    private static final void method320(char[] arg0, int arg1, char[] arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg0.length; var7 += var10) {
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
                    if (var9 < arg0.length && (var14 = method325(var13, 0, var12, arg0[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method325(var13, 0, var12, arg0[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method331(var12, 0)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method321(arg5, (byte) 8, var7, arg4);
                int var18 = method322(arg4, field1066, arg2, var8 - 1);
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
                                if (method331(arg4[var24], 0)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method331(arg4[var24], 0)) {
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
                                    if (arg2[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg2[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method331(arg4[var28], 0)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method331(arg4[var28], 0)) {
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
        if (arg1 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CBI[C)I")
    private static final int method321(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method331(arg3[var4], 0)) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 8) {
                return field1067;
            }
            for (int var6 = arg2 - 1; var6 >= 0 && method331(arg0[var6], 0); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method331(arg3[arg2 - 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CB[CI)I")
    private static final int method322(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method331(arg0[var4], 0)) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != 85) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg3 + 1; var7 < arg0.length && method331(arg2[var7], 0); var7++) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method331(arg0[arg3 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([C[CI[[B)V")
    public static final void method323(char[] arg0, char[] arg1, int arg2, byte[][] arg3) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var5 = 92 / arg2;
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg0.length; var6 += var10) {
            int var7 = var6;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label163: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label163;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg0.length && (var17 = method326(var15, -979, var16, arg0[var8])) > 0) {
                        if (var17 == 1 && method334((byte) -17, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method334((byte) -17, var15) || method334((byte) -17, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label163;
                        }
                        int var18;
                        if ((var18 = method326(var15, -979, var16, arg0[var8 - 1])) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method332((byte) 3, var15)) {
                                break label163;
                            }
                            if (method331(var15, 0) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method334((byte) -17, var15)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var6) > 90) {
                                break label163;
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
                    if (var6 - 1 < 0 || method331(arg1[var6 - 1], 0) && arg1[var6 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method331(arg1[var7], 0) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var6 - 2;
                        if (var24) {
                            var27 = var6;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method331(arg1[var27], 0) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method331(arg1[var27 + var29], 0) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method331(arg1[var27 - 1], 0) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method337(0, var28)) {
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
                        var20 = arg1[var6 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg1.length) {
                        var21 = arg1[var7];
                    }
                    byte var22 = method327((byte) -37, var20);
                    byte var23 = method327((byte) -37, var21);
                    if (arg3 != null && method324((byte) 53, var23, var22, arg3)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var6; var34 < var7; var34++) {
                        if (method334((byte) -17, arg1[var34])) {
                            var31++;
                        } else if (method333(false, arg1[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var6; var35 < var7; var35++) {
                            arg1[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(BBB[[B)Z")
    private static final boolean method324(byte arg0, byte arg1, byte arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg3[var4][0] == arg2 && arg3[var4][1] == arg1) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (field1068 != arg0) {
            throw new NullPointerException();
        } else if (arg3[var5][0] == arg2 && arg3[var5][1] == arg1) {
            return true;
        } else {
            do {
                int var6 = (var4 + var5) / 2;
                if (arg3[var6][0] == arg2 && arg3[var6][1] == arg1) {
                    return true;
                }
                if (arg2 < arg3[var6][0] || arg3[var6][0] == arg2 && arg1 < arg3[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(CICC)I")
    private static final int method325(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 0) {
            field1067 = -84;
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg2 == '(' && arg0 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg3 == 's' && arg2 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "(CICC)I")
    private static final int method326(char arg0, int arg1, char arg2, char arg3) {
        while (arg1 >= 0) {
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
                if (arg0 != '6' && arg0 != '8') {
                    if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg3 == 'c') {
                if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
                    return 0;
                }
                return 2;
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
                if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
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
                if (arg0 != '7' && arg0 != '+') {
                    return 0;
                }
                return 1;
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
            } else if (arg3 != '1') {
                return 0;
            } else if (arg0 == 'l') {
                return 1;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            if (arg0 == '.') {
                return 1;
            } else {
                return 0;
            }
        } else if (arg3 == '.') {
            if (arg0 == ',') {
                return 1;
            } else {
                return 0;
            }
        } else if (arg3 != '!') {
            return 0;
        } else if (arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(BC)B")
    private static final byte method327(byte arg0, char arg1) {
        if (field1070 != arg0) {
            field1069 = -42;
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

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "([CZ)V")
    private static final void method328(char[] arg0, boolean arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method329(var3, field1071, arg0)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method331(arg0[var9], 0) && !method332((byte) 3, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var6 = var7;
                }
                var3 = method330(arg0, var7, (byte) -33);
                int var10 = 0;
                for (int var11 = var7; var11 < var3; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var3 - var7 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var12 = var6; var12 < var3; var12++) {
                arg0[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(IZ[C)I")
    private static final int method329(int arg0, boolean arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (!arg1) {
            field1065 = !field1065;
        }
        return -1;
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "([CIB)I")
    private static final int method330(char[] arg0, int arg1, byte arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 != -33) {
                return field1062;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "(CI)Z")
    private static final boolean method331(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return !method333(false, arg0) && !method334((byte) -17, arg0);
    }

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "(BC)Z")
    private static final boolean method332(byte arg0, char arg1) {
        if (arg0 != 3) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(ZC)Z")
    private static final boolean method333(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "KUCFVEDX", name = "c", descriptor = "(BC)Z")
    private static final boolean method334(byte arg0, char arg1) {
        if (arg0 != -17) {
            field1062 = -162;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "KUCFVEDX", name = "d", descriptor = "(BC)Z")
    private static final boolean method335(byte arg0, char arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "KUCFVEDX", name = "c", descriptor = "(CI)Z")
    private static final boolean method336(char arg0, int arg1) {
        int var2 = 65 / arg1;
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "KUCFVEDX", name = "a", descriptor = "(I[C)Z")
    private static final boolean method337(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method334((byte) -17, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2) {
            return true;
        }
        int var5 = method338(430, arg1);
        int var6 = 0;
        int var7 = field1074.length - 1;
        if (field1074[var6] == var5 || field1074[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1074[var8] == var5) {
                return true;
            }
            if (var5 < field1074[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "KUCFVEDX", name = "b", descriptor = "(I[C)I")
    public static final int method338(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var5 = arg1[arg1.length - var3 - 1];
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
        int var4 = 42 / arg0;
        return var2;
    }
}
