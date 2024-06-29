import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JVGHFIOO")
public class class26 {

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "I")
    private static int field972 = 61;

    @OriginalMember(owner = "client!JVGHFIOO", name = "d", descriptor = "I")
    private static int field974 = 148;

    @OriginalMember(owner = "client!JVGHFIOO", name = "e", descriptor = "I")
    private static int field975 = -312;

    @OriginalMember(owner = "client!JVGHFIOO", name = "f", descriptor = "I")
    private static int field976 = 13881;

    @OriginalMember(owner = "client!JVGHFIOO", name = "g", descriptor = "I")
    private static int field977 = -949;

    @OriginalMember(owner = "client!JVGHFIOO", name = "h", descriptor = "I")
    private static int field978 = 3;

    @OriginalMember(owner = "client!JVGHFIOO", name = "i", descriptor = "I")
    private static int field979 = 662;

    @OriginalMember(owner = "client!JVGHFIOO", name = "j", descriptor = "I")
    private static int field980 = 9;

    @OriginalMember(owner = "client!JVGHFIOO", name = "l", descriptor = "I")
    private static int field982 = 105;

    @OriginalMember(owner = "client!JVGHFIOO", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field989 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!JVGHFIOO", name = "c", descriptor = "I")
    private static int field973;

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "Z")
    private static boolean field971;

    @OriginalMember(owner = "client!JVGHFIOO", name = "k", descriptor = "Z")
    private static boolean field981;

    @OriginalMember(owner = "client!JVGHFIOO", name = "t", descriptor = "Z")
    public static boolean field990;

    @OriginalMember(owner = "client!JVGHFIOO", name = "m", descriptor = "[I")
    private static int[] field983;

    @OriginalMember(owner = "client!JVGHFIOO", name = "r", descriptor = "[I")
    private static int[] field988;

    @OriginalMember(owner = "client!JVGHFIOO", name = "n", descriptor = "[[C")
    private static char[][] field984;

    @OriginalMember(owner = "client!JVGHFIOO", name = "p", descriptor = "[[C")
    private static char[][] field986;

    @OriginalMember(owner = "client!JVGHFIOO", name = "q", descriptor = "[[C")
    private static char[][] field987;

    @OriginalMember(owner = "client!JVGHFIOO", name = "o", descriptor = "[[[B")
    private static byte[][][] field985;

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(LFUZJMGZB;)V")
    public static final void method301(class19 arg0) {
        class32 var1 = new class32((byte) 114, arg0.method277("fragmentsenc.txt", null));
        class32 var2 = new class32((byte) 114, arg0.method277("badenc.txt", null));
        class32 var3 = new class32((byte) 114, arg0.method277("domainenc.txt", null));
        class32 var4 = new class32((byte) 114, arg0.method277("tldlist.txt", null));
        method302(var1, var2, var3, var4);
        if (class45.field1317) {
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(LLBBVYYXO;LLBBVYYXO;LLBBVYYXO;LLBBVYYXO;)V")
    private static final void method302(class32 arg0, class32 arg1, class32 arg2, class32 arg3) {
        method304(arg1, -17);
        method305(arg2, true);
        method306(94, arg0);
        method303(-927, arg3);
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(ILLBBVYYXO;)V")
    private static final void method303(int arg0, class32 arg1) {
        if (arg0 >= 0) {
            return;
        }
        int var2 = arg1.method374();
        field987 = new char[var2][];
        field988 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field988[var3] = arg1.method369();
            char[] var4 = new char[arg1.method369()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method369();
            }
            field987[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(LLBBVYYXO;I)V")
    private static final void method304(class32 arg0, int arg1) {
        int var2 = arg0.method374();
        field984 = new char[var2][];
        field985 = new byte[var2][][];
        method307(field985, 136, field984, arg0);
        if (arg1 >= 0) {
            field981 = !field981;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(LLBBVYYXO;Z)V")
    private static final void method305(class32 arg0, boolean arg1) {
        int var2 = arg0.method374();
        if (!arg1) {
            field981 = !field981;
        }
        field986 = new char[var2][];
        method308(arg0, -115, field986);
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(ILLBBVYYXO;)V")
    private static final void method306(int arg0, class32 arg1) {
        field983 = new int[arg1.method374()];
        for (int var2 = 0; var2 < field983.length; var2++) {
            field983[var2] = arg1.method371();
        }
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([[[BI[[CLLBBVYYXO;)V")
    private static final void method307(byte[][][] arg0, int arg1, char[][] arg2, class32 arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var6 = new char[arg3.method369()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg3.method369();
            }
            arg2[var4] = var6;
            byte[][] var8 = new byte[arg3.method369()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg3.method369();
                var8[var9][1] = (byte) arg3.method369();
            }
            if (var8.length > 0) {
                arg0[var4] = var8;
            }
        }
        int var5 = 31 / arg1;
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(LLBBVYYXO;I[[C)V")
    private static final void method308(class32 arg0, int arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method369()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method369();
            }
            arg2[var3] = var4;
        }
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CI)V")
    private static final void method309(char[] arg0, int arg1) {
        int var2 = 0;
        int var3 = 35 / arg1;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (method310(3, arg0[var4])) {
                arg0[var2] = arg0[var4];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var5 = var2; var5 < arg0.length; var5++) {
            arg0[var5] = ' ';
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(IC)Z")
    private static final boolean method310(int arg0, char arg1) {
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method311(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method309(var4, 824);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method319(false, var6);
        method314(0, var6);
        method315(0, var6);
        method328(var6, (byte) 5);
        for (int var8 = 0; var8 < field989.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field989[var8], var11 + 1)) != -1) {
                char[] var12 = field989[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        if (arg1 != 0) {
            field973 = 431;
        }
        method312(var6, var5.toCharArray(), -15);
        method313(-28516, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([C[CI)V")
    private static final void method312(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method336(arg1[var3], true)) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[C)V")
    private static final void method313(int arg0, char[] arg1) {
        if (arg0 != -28516) {
            field981 = !field981;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method333(0, var4)) {
                var2 = true;
            } else if (var2) {
                if (method335(var4, 0)) {
                    var2 = false;
                }
            } else if (method336(var4, true)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(I[C)V")
    private static final void method314(int arg0, char[] arg1) {
        if (arg0 != 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field984.length - 1; var3 >= 0; var3--) {
                method323(field985[var3], arg1, field984[var3], 0);
            }
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "c", descriptor = "(I[C)V")
    private static final void method315(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method323(null, var2, var3, 0);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method323(null, var4, var5, 0);
        if (arg0 != 0) {
            field981 = !field981;
        }
        for (int var6 = field986.length - 1; var6 >= 0; var6--) {
            method316(var2, 81, arg1, var4, field986[var6]);
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CI[C[C[C)V")
    private static final void method316(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        if (arg1 <= 0) {
            return;
        }
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
                    if (var8 < arg4.length && (var13 = method325(var11, arg4[var8], field975, var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method325(var11, arg4[var8 - 1], field975, var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method331(694, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method317(0, arg0, arg2, var6);
                int var17 = method318(var7 - 1, arg2, false, arg3);
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

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[C[CI)I")
    private static final int method317(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 != 0) {
            return field975;
        } else if (arg3 == 0) {
            return 2;
        } else {
            for (int var4 = arg3 - 1; var4 >= 0 && method331(694, arg2[var4]); var4--) {
                if (arg2[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method331(694, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method331(694, arg2[arg3 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[CZ[C)I")
    private static final int method318(int arg0, char[] arg1, boolean arg2, char[] arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method331(694, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method331(694, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg2) {
                field982 = -341;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method331(694, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(Z[C)V")
    private static final void method319(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method323(null, var2, var3, 0);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method323(null, var4, var5, 0);
        for (int var6 = 0; var6 < field987.length; var6++) {
            method320(field988[var6], var2, arg1, var4, true, field987[var6]);
        }
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[C[C[CZ[C)V")
    private static final void method320(int arg0, char[] arg1, char[] arg2, char[] arg3, boolean arg4, char[] arg5) {
        if (!arg4) {
            field981 = !field981;
        }
        if (arg5.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method325(var12, arg5[var9], field975, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method325(var12, arg5[var9 - 1], field975, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method331(694, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method321(0, arg2, var7, arg1);
                int var18 = method322(arg2, var8 - 1, true, arg3);
                if (arg0 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg0 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg0 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg0 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg1[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg1[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method331(694, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method331(694, arg2[var24])) {
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
                                if (method331(694, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method331(694, arg2[var28])) {
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
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[CI[C)I")
    private static final int method321(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method331(694, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg0 != 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg2 - 1; var7 >= 0 && method331(694, arg3[var7]); var7--) {
                if (arg3[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method331(694, arg1[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CIZ[C)I")
    private static final int method322(char[] arg0, int arg1, boolean arg2, char[] arg3) {
        if (!arg2) {
            return 0;
        } else if (arg1 + 1 == arg0.length) {
            return 2;
        } else {
            int var4 = arg1 + 1;
            while (true) {
                if (var4 < arg0.length && method331(694, arg0[var4])) {
                    if (arg0[var4] != '\\' && arg0[var4] != '/') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg1 + 1; var6 < arg0.length && method331(694, arg3[var6]); var6++) {
                    if (arg3[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 5) {
                    return 4;
                }
                if (method331(694, arg0[arg1 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method323(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        if (arg3 != 0) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var9) {
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
                    if (var7 < arg2.length && (var16 = method326(var15, var14, field976, arg2[var7])) > 0) {
                        if (var16 == 1 && method334(662, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method334(662, var14) || method334(662, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method326(var15, var14, field976, arg2[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method332(var14, 3)) {
                                break label167;
                            }
                            if (method331(694, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method334(662, var14)) {
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
            if (var7 >= arg2.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method331(694, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method331(694, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method331(694, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method331(694, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method331(694, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method337(7, var27)) {
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
                    byte var21 = method327(-949, var19);
                    byte var22 = method327(-949, var20);
                    if (arg0 != null && method324(0, var22, arg0, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method334(662, arg1[var33])) {
                            var30++;
                        } else if (method333(0, arg1[var33])) {
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

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(IB[[BB)Z")
    private static final boolean method324(int arg0, byte arg1, byte[][] arg2, byte arg3) {
        if (arg0 != 0) {
            field975 = -286;
        }
        int var4 = 0;
        if (arg2[var4][0] == arg3 && arg2[var4][1] == arg1) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg3 && arg2[var6][1] == arg1) {
                return true;
            }
            if (arg3 < arg2[var6][0] || arg2[var6][0] == arg3 && arg1 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(CCIC)I")
    private static final int method325(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 >= 0) {
            field974 = -192;
        }
        if (arg0 == arg1) {
            return 1;
        } else if (arg1 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg0 == '(' && arg3 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg1 == 's' && arg0 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(CCIC)I")
    private static final int method326(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 13881) {
            return field972;
        } else if (arg1 == arg3) {
            return 1;
        } else {
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
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(IC)B")
    private static final byte method327(int arg0, char arg1) {
        if (arg0 >= 0) {
            field981 = !field981;
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

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CB)V")
    private static final void method328(char[] arg0, byte arg1) {
        if (arg1 != 5) {
            field982 = 7;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method329(arg0, var3, -29646)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method331(694, arg0[var8]) && !method332(arg0[var8], 3)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method330(9, arg0, var6);
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

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "([CII)I")
    private static final int method329(char[] arg0, int arg1, int arg2) {
        if (arg2 != -29646) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg1; var4 < arg0.length && var4 >= 0; var4++) {
            if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(I[CI)I")
    private static final int method330(int arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != 9) {
                field971 = !field971;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "c", descriptor = "(IC)Z")
    private static final boolean method331(int arg0, char arg1) {
        int var2 = 84 / arg0;
        return !method333(0, arg1) && !method334(662, arg1);
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(CI)Z")
    private static final boolean method332(char arg0, int arg1) {
        if (arg1 < field978 || arg1 > field978) {
            field972 = 396;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "d", descriptor = "(IC)Z")
    private static final boolean method333(int arg0, char arg1) {
        if (arg0 != 0) {
            field971 = !field971;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "e", descriptor = "(IC)Z")
    private static final boolean method334(int arg0, char arg1) {
        if (arg0 <= 0) {
            field971 = !field971;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "(CI)Z")
    private static final boolean method335(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "a", descriptor = "(CZ)Z")
    private static final boolean method336(char arg0, boolean arg1) {
        if (!arg1) {
            field981 = !field981;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "d", descriptor = "(I[C)Z")
    private static final boolean method337(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method334(662, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method338(arg1, 9);
        int var5 = 0;
        if (arg0 != 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = field983.length - 1;
        if (field983[var5] == var4 || field983[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var7) / 2;
            if (field983[var8] == var4) {
                return true;
            }
            if (var4 < field983[var8]) {
                var7 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var7 && var5 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "client!JVGHFIOO", name = "b", descriptor = "([CI)I")
    public static final int method338(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[arg0.length - var3 - 1];
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
        if (field980 != arg1) {
            field972 = 392;
        }
        return var2;
    }
}
