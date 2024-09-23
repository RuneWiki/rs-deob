import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DDVOVWJV")
public class class11 {

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "I")
    private static int field638 = -467;

    @OriginalMember(owner = "DDVOVWJV", name = "c", descriptor = "I")
    private static int field640 = -732;

    @OriginalMember(owner = "DDVOVWJV", name = "d", descriptor = "I")
    private static int field641 = 9;

    @OriginalMember(owner = "DDVOVWJV", name = "e", descriptor = "B")
    private static byte field642 = 63;

    @OriginalMember(owner = "DDVOVWJV", name = "h", descriptor = "I")
    private static int field645 = 799;

    @OriginalMember(owner = "DDVOVWJV", name = "i", descriptor = "B")
    private static byte field646 = 111;

    @OriginalMember(owner = "DDVOVWJV", name = "j", descriptor = "B")
    private static byte field647 = 16;

    @OriginalMember(owner = "DDVOVWJV", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field654 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "Z")
    private static boolean field639;

    @OriginalMember(owner = "DDVOVWJV", name = "f", descriptor = "Z")
    private static boolean field643;

    @OriginalMember(owner = "DDVOVWJV", name = "g", descriptor = "Z")
    private static boolean field644;

    @OriginalMember(owner = "DDVOVWJV", name = "r", descriptor = "Z")
    public static boolean field655;

    @OriginalMember(owner = "DDVOVWJV", name = "k", descriptor = "[I")
    private static int[] field648;

    @OriginalMember(owner = "DDVOVWJV", name = "p", descriptor = "[I")
    private static int[] field653;

    @OriginalMember(owner = "DDVOVWJV", name = "l", descriptor = "[[C")
    private static char[][] field649;

    @OriginalMember(owner = "DDVOVWJV", name = "n", descriptor = "[[C")
    private static char[][] field651;

    @OriginalMember(owner = "DDVOVWJV", name = "o", descriptor = "[[C")
    private static char[][] field652;

    @OriginalMember(owner = "DDVOVWJV", name = "m", descriptor = "[[[B")
    private static byte[][][] field650;

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(LCXFTMSCH;)V")
    public static final void method183(class8 arg0) {
        class33 var1 = new class33(true, arg0.method176("fragmentsenc.txt", null));
        class33 var2 = new class33(true, arg0.method176("badenc.txt", null));
        class33 var3 = new class33(true, arg0.method176("domainenc.txt", null));
        class33 var4 = new class33(true, arg0.method176("tldlist.txt", null));
        method184(var1, var2, var3, var4);
        if (class53.field1329) {
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(LMQZHAILV;LMQZHAILV;LMQZHAILV;LMQZHAILV;)V")
    private static final void method184(class33 arg0, class33 arg1, class33 arg2, class33 arg3) {
        method186(-18, arg1);
        method187(8, arg2);
        method188(arg0, (byte) -62);
        method185(0, arg3);
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(ILMQZHAILV;)V")
    private static final void method185(int arg0, class33 arg1) {
        int var2 = arg1.method330();
        field652 = new char[var2][];
        if (arg0 != 0) {
            return;
        }
        field653 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field653[var3] = arg1.method325();
            char[] var4 = new char[arg1.method325()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method325();
            }
            field652[var3] = var4;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "(ILMQZHAILV;)V")
    private static final void method186(int arg0, class33 arg1) {
        int var2 = arg1.method330();
        field649 = new char[var2][];
        if (arg0 < 0) {
            field650 = new byte[var2][][];
            method189(field649, arg1, field650, true);
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "c", descriptor = "(ILMQZHAILV;)V")
    private static final void method187(int arg0, class33 arg1) {
        if (arg0 == 8) {
            int var2 = arg1.method330();
            field651 = new char[var2][];
            method190(field651, field642, arg1);
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(LMQZHAILV;B)V")
    private static final void method188(class33 arg0, byte arg1) {
        field648 = new int[arg0.method330()];
        for (int var2 = 0; var2 < field648.length; var2++) {
            field648[var2] = arg0.method327();
        }
        if (arg1 != -62) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([[CLMQZHAILV;[[[BZ)V")
    private static final void method189(char[][] arg0, class33 arg1, byte[][][] arg2, boolean arg3) {
        if (!arg3) {
            field638 = 335;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg1.method325()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method325();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg1.method325()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method325();
                var7[var8][1] = (byte) arg1.method325();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([[CBLMQZHAILV;)V")
    private static final void method190(char[][] arg0, byte arg1, class33 arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method325()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method325();
            }
            arg0[var3] = var4;
        }
        if (arg1 == 63) {
            ;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(I[C)V")
    private static final void method191(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method192((byte) 78, arg1[var3])) {
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
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(BC)Z")
    private static final boolean method192(byte arg0, char arg1) {
        if (arg0 != 78) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method193(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method191(0, var4);
        String var5 = (new String(var4)).trim();
        while (arg1 >= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method201(var6, 0);
        method196(true, var6);
        method197(true, var6);
        method210((byte) -104, var6);
        for (int var8 = 0; var8 < field654.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field654[var8], var11 + 1)) != -1) {
                char[] var12 = field654[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method194(field644, var5.toCharArray(), var6);
        method195(var6, field645);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(Z[C[C)V")
    private static final void method194(boolean arg0, char[] arg1, char[] arg2) {
        if (arg0) {
            field638 = 50;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg2[var3] != '*' && method218(arg1[var3], false)) {
                arg2[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([CI)V")
    private static final void method195(char[] arg0, int arg1) {
        if (arg1 <= 0) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method215(0, var4)) {
                var2 = true;
            } else if (var2) {
                if (method217(var4, -4883)) {
                    var2 = false;
                }
            } else if (method218(var4, false)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(Z[C)V")
    private static final void method196(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field649.length - 1; var3 >= 0; var3--) {
                method205(field649[var3], arg1, field650[var3], -933);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "(Z[C)V")
    private static final void method197(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method205(var3, var2, null, -933);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method205(var5, var4, null, -933);
        for (int var7 = field651.length - 1; var7 >= 0; var7--) {
            method198(-863, var2, arg1, field651[var7], var4);
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method198(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        while (arg0 >= 0) {
            field639 = !field639;
        }
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg3.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label65: while (true) {
                while (true) {
                    if (var7 >= arg2.length) {
                        break label65;
                    }
                    boolean var10 = false;
                    char var11 = arg2[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg2.length) {
                        var12 = arg2[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg3.length && (var13 = method207(var12, var11, 24364, arg3[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label65;
                        }
                        int var14;
                        if ((var14 = method207(var12, var11, 24364, arg3[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method213(251, var11)) {
                                break label65;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method199(var6, arg2, arg1, -462);
                int var17 = method200(arg4, arg2, var7 - 1, 0);
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

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(I[C[CI)I")
    private static final int method199(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method213(251, arg1[var4]); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method213(251, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (arg3 >= 0) {
            return field645;
        } else if (var5 >= 3) {
            return 4;
        } else if (method213(251, arg1[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([C[CII)I")
    private static final int method200(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method213(251, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg3 != 0) {
                return 1;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method213(251, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method213(251, arg1[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "([CI)V")
    private static final void method201(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method205(var3, var2, null, -933);
        if (arg1 < 0 || arg1 > 0) {
            return;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method205(var5, var4, null, -933);
        for (int var6 = 0; var6 < field652.length; var6++) {
            method202(field652[var6], arg0, true, var2, field653[var6], var4);
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([C[CZ[CI[C)V")
    private static final void method202(char[] arg0, char[] arg1, boolean arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        if (!arg2) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg1.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg1.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg1[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg1.length) {
                        var13 = arg1[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method207(var13, var12, 24364, arg0[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method207(var13, var12, 24364, arg0[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method213(251, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method203(arg1, false, arg3, var7);
                int var18 = method204(arg5, (byte) 111, var8 - 1, arg1);
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
                                if (method213(251, arg1[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method213(251, arg1[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg1.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg1.length; var28++) {
                            if (var27) {
                                if (method213(251, arg1[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method213(251, arg1[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg1[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([CZ[CI)I")
    private static final int method203(char[] arg0, boolean arg1, char[] arg2, int arg3) {
        if (arg1) {
            field643 = !field643;
        }
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method213(251, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method213(251, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method213(251, arg0[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([CBI[C)I")
    private static final int method204(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method213(251, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (field646 != arg1) {
                field644 = !field644;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && method213(251, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method213(251, arg3[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([C[C[[BI)V")
    public static final void method205(char[] arg0, char[] arg1, byte[][] arg2, int arg3) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var9) {
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
                    if (var7 < arg0.length && (var16 = method208(arg0[var7], 526, var15, var14)) > 0) {
                        if (var16 == 1 && method216((byte) 3, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method216((byte) 3, var14) || method216((byte) 3, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method208(arg0[var7 - 1], 526, var15, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method214((byte) 16, var14)) {
                                break label167;
                            }
                            if (method213(251, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method216((byte) 3, var14)) {
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
                    if (var5 - 1 < 0 || method213(251, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method213(251, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method213(251, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method213(251, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method213(251, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method219(var27, 0)) {
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
                    byte var21 = method209(3, var19);
                    byte var22 = method209(3, var20);
                    if (arg2 != null && method206(arg2, true, var22, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method216((byte) 3, arg1[var33])) {
                            var30++;
                        } else if (method215(0, arg1[var33])) {
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
        if (arg3 >= 0) {
            field640 = -273;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "([[BZBB)Z")
    private static final boolean method206(byte[][] arg0, boolean arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (!arg1) {
            throw new NullPointerException();
        } else if (arg0[var4][0] == arg3 && arg0[var4][1] == arg2) {
            return true;
        } else {
            int var5 = arg0.length - 1;
            if (arg0[var5][0] == arg3 && arg0[var5][1] == arg2) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg0[var6][0] == arg3 && arg0[var6][1] == arg2) {
                    return true;
                }
                if (arg3 < arg0[var6][0] || arg0[var6][0] == arg3 && arg2 < arg0[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(CCIC)I")
    private static final int method207(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 24364) {
            return 3;
        } else if (arg1 == arg3) {
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

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(CICC)I")
    private static final int method208(char arg0, int arg1, char arg2, char arg3) {
        int var4 = 53 / arg1;
        if (arg0 == arg3) {
            return 1;
        }
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

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(IC)B")
    private static final byte method209(int arg0, char arg1) {
        if (arg0 < 3 || arg0 > 3) {
            field643 = !field643;
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

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(B[C)V")
    private static final void method210(byte arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg0 != -104) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method211(var3, 5, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method213(251, arg1[var8]) && !method214((byte) 16, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method212(true, arg1, var6);
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

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(II[C)I")
    private static final int method211(int arg0, int arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 != 5) {
            field640 = -70;
        }
        return -1;
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(Z[CI)I")
    private static final int method212(boolean arg0, char[] arg1, int arg2) {
        if (!arg0) {
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

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "(IC)Z")
    private static final boolean method213(int arg0, char arg1) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method215(0, arg1) && !method216((byte) 3, arg1);
    }

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "(BC)Z")
    private static final boolean method214(byte arg0, char arg1) {
        if (field647 != arg0) {
            field638 = 262;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "DDVOVWJV", name = "c", descriptor = "(IC)Z")
    private static final boolean method215(int arg0, char arg1) {
        if (arg0 != 0) {
            field644 = !field644;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "DDVOVWJV", name = "c", descriptor = "(BC)Z")
    private static final boolean method216(byte arg0, char arg1) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(CI)Z")
    private static final boolean method217(char arg0, int arg1) {
        if (arg1 != -4883) {
            field645 = -188;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "DDVOVWJV", name = "a", descriptor = "(CZ)Z")
    private static final boolean method218(char arg0, boolean arg1) {
        if (arg1) {
            field641 = -67;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "DDVOVWJV", name = "c", descriptor = "([CI)Z")
    private static final boolean method219(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 != 0) {
            field641 = 117;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method216((byte) 3, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method220(0, arg0);
        int var5 = 0;
        int var6 = field648.length - 1;
        if (field648[var5] == var4 || field648[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field648[var7] == var4) {
                return true;
            }
            if (var4 < field648[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "DDVOVWJV", name = "b", descriptor = "(I[C)I")
    public static final int method220(int arg0, char[] arg1) {
        if (arg0 != 0) {
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
