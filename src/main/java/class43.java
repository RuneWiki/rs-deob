import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MVRIVVEE")
public class class43 {

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "Z")
    private static boolean field1265 = true;

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "I")
    private static int field1266 = 644;

    @OriginalMember(owner = "MVRIVVEE", name = "c", descriptor = "I")
    private static int field1267 = 1;

    @OriginalMember(owner = "MVRIVVEE", name = "d", descriptor = "I")
    private static int field1268 = -717;

    @OriginalMember(owner = "MVRIVVEE", name = "e", descriptor = "B")
    private static byte field1269 = 3;

    @OriginalMember(owner = "MVRIVVEE", name = "f", descriptor = "B")
    private static byte field1270 = 27;

    @OriginalMember(owner = "MVRIVVEE", name = "g", descriptor = "I")
    private static int field1271 = 149;

    @OriginalMember(owner = "MVRIVVEE", name = "h", descriptor = "I")
    private static int field1272 = 4460;

    @OriginalMember(owner = "MVRIVVEE", name = "j", descriptor = "I")
    private static int field1274 = 146;

    @OriginalMember(owner = "MVRIVVEE", name = "k", descriptor = "B")
    private static byte field1275 = -118;

    @OriginalMember(owner = "MVRIVVEE", name = "l", descriptor = "I")
    private static int field1276 = -86;

    @OriginalMember(owner = "MVRIVVEE", name = "m", descriptor = "Z")
    private static boolean field1277 = true;

    @OriginalMember(owner = "MVRIVVEE", name = "t", descriptor = "[Ljava/lang/String;")
    private static final String[] field1284 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "MVRIVVEE", name = "i", descriptor = "Z")
    private static boolean field1273;

    @OriginalMember(owner = "MVRIVVEE", name = "u", descriptor = "Z")
    public static boolean field1285;

    @OriginalMember(owner = "MVRIVVEE", name = "n", descriptor = "[I")
    private static int[] field1278;

    @OriginalMember(owner = "MVRIVVEE", name = "s", descriptor = "[I")
    private static int[] field1283;

    @OriginalMember(owner = "MVRIVVEE", name = "o", descriptor = "[[C")
    private static char[][] field1279;

    @OriginalMember(owner = "MVRIVVEE", name = "q", descriptor = "[[C")
    private static char[][] field1281;

    @OriginalMember(owner = "MVRIVVEE", name = "r", descriptor = "[[C")
    private static char[][] field1282;

    @OriginalMember(owner = "MVRIVVEE", name = "p", descriptor = "[[[B")
    private static byte[][][] field1280;

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(LDYBMLHQM;)V")
    public static final void method380(class16 arg0) {
        class29 var1 = new class29((byte) -28, arg0.method248("fragmentsenc.txt", null));
        class29 var2 = new class29((byte) -28, arg0.method248("badenc.txt", null));
        class29 var3 = new class29((byte) -28, arg0.method248("domainenc.txt", null));
        class29 var4 = new class29((byte) -28, arg0.method248("tldlist.txt", null));
        method381(var1, var2, var3, var4);
        if (class13.field723) {
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(LINLHDAGO;LINLHDAGO;LINLHDAGO;LINLHDAGO;)V")
    private static final void method381(class29 arg0, class29 arg1, class29 arg2, class29 arg3) {
        method383(arg1, 0);
        method384(0, arg2);
        method385(-761, arg0);
        method382(arg3, -34274);
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(LINLHDAGO;I)V")
    private static final void method382(class29 arg0, int arg1) {
        if (arg1 != -34274) {
            field1267 = 207;
        }
        int var2 = arg0.method313();
        field1282 = new char[var2][];
        field1283 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1283[var3] = arg0.method308();
            char[] var4 = new char[arg0.method308()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method308();
            }
            field1282[var3] = var4;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "(LINLHDAGO;I)V")
    private static final void method383(class29 arg0, int arg1) {
        int var2 = arg0.method313();
        field1279 = new char[var2][];
        field1280 = new byte[var2][][];
        if (arg1 == 0) {
            method386(-717, field1280, field1279, arg0);
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(ILINLHDAGO;)V")
    private static final void method384(int arg0, class29 arg1) {
        int var2 = arg1.method313();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1281 = new char[var2][];
        method387(field1281, arg1, (byte) 3);
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "(ILINLHDAGO;)V")
    private static final void method385(int arg0, class29 arg1) {
        if (arg0 >= 0) {
            field1267 = -432;
        }
        field1278 = new int[arg1.method313()];
        for (int var2 = 0; var2 < field1278.length; var2++) {
            field1278[var2] = arg1.method310();
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(I[[[B[[CLINLHDAGO;)V")
    private static final void method386(int arg0, byte[][][] arg1, char[][] arg2, class29 arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg3.method308()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method308();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg3.method308()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method308();
                var7[var8][1] = (byte) arg3.method308();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([[CLINLHDAGO;B)V")
    private static final void method387(char[][] arg0, class29 arg1, byte arg2) {
        if (field1269 != arg2) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method308()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method308();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([CB)V")
    private static final void method388(char[] arg0, byte arg1) {
        int var2 = 0;
        if (arg1 != -46) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (method389((byte) 27, arg0[var4])) {
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

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(BC)Z")
    private static final boolean method389(byte arg0, char arg1) {
        if (field1270 != arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method390(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method388(var4, (byte) -46);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method398(var6, 5);
        method393(-342, var6);
        method394(var6, -279);
        method407(103, var6);
        for (int var8 = 0; var8 < field1284.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1284[var8], var11 + 1)) != -1) {
                char[] var12 = field1284[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method391(var5.toCharArray(), var6, (byte) -93);
        method392(var6, true);
        long var9 = System.currentTimeMillis();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([C[CB)V")
    private static final void method391(char[] arg0, char[] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method415(arg0[var3], (byte) -31)) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2 == -93) {
            ;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([CZ)V")
    private static final void method392(char[] arg0, boolean arg1) {
        if (!arg1) {
            field1266 = -115;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method412(field1273, var4)) {
                var2 = true;
            } else if (var2) {
                if (method414(var4, -30909)) {
                    var2 = false;
                }
            } else if (method415(var4, (byte) -31)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(I[C)V")
    private static final void method393(int arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1279.length - 1; var4 >= 0; var4--) {
                method402(true, arg1, field1280[var4], field1279[var4]);
            }
        }
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([CI)V")
    private static final void method394(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method402(true, var2, null, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 >= 0) {
            field1267 = 413;
        }
        method402(true, var4, null, var5);
        for (int var6 = field1281.length - 1; var6 >= 0; var6--) {
            method395(var4, var2, arg0, true, field1281[var6]);
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([C[C[CZ[C)V")
    private static final void method395(char[] arg0, char[] arg1, char[] arg2, boolean arg3, char[] arg4) {
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
                    if (var8 < arg4.length && (var13 = method404(arg4[var8], var12, 29438, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method404(arg4[var8 - 1], var12, 29438, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method410(4460, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method396(arg2, arg1, (byte) 7, var6);
                int var17 = method397(var7 - 1, arg0, arg2, true);
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
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([C[CBI)I")
    private static final int method396(char[] arg0, char[] arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method410(4460, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg2 == 7) {
            boolean var6 = false;
        } else {
            field1266 = -189;
        }
        for (int var7 = arg3 - 1; var7 >= 0 && method410(4460, arg1[var7]); var7--) {
            if (arg1[var7] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method410(4460, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(I[C[CZ)I")
    private static final int method397(int arg0, char[] arg1, char[] arg2, boolean arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method410(4460, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method410(4460, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (!arg3) {
                return 4;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method410(4460, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "([CI)V")
    private static final void method398(char[] arg0, int arg1) {
        if (arg1 < 5 || arg1 > 5) {
            return;
        }
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method402(true, var2, null, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method402(true, var4, null, var5);
        for (int var6 = 0; var6 < field1282.length; var6++) {
            method399((byte) 4, field1282[var6], field1283[var6], var4, arg0, var2);
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(B[CI[C[C[C)V")
    private static final void method399(byte arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg1.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg4.length - arg1.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label128: while (true) {
                while (true) {
                    if (var9 >= arg4.length) {
                        break label128;
                    }
                    boolean var12 = false;
                    char var13 = arg4[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg4.length) {
                        var14 = arg4[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg1.length && (var15 = method404(arg1[var10], var14, 29438, var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label128;
                        }
                        int var16;
                        if ((var16 = method404(arg1[var10 - 1], var14, 29438, var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg1.length || !method410(4460, var13)) {
                                break label128;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg1.length) {
                boolean var17 = false;
                int var18 = method400(arg5, var7, arg4, 30044);
                int var19 = method401(var9 - 1, 4, arg4, arg3);
                if (arg2 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg2 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg2 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg2 == 3 && var18 > 2 && var19 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var17) {
                    int var20 = var7;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var7 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg5[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg5[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method410(4460, arg4[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method410(4460, arg4[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg4.length; var27++) {
                                if (var26) {
                                    if (arg3[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg3[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg4.length; var29++) {
                            if (var28) {
                                if (method410(4460, arg4[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method410(4460, arg4[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg4[var30] = '*';
                    }
                }
            }
        }
        if (arg0 == 4) {
            boolean var8 = false;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([CI[CI)I")
    private static final int method400(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method410(4460, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method410(4460, arg0[var6]); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 != 30044) {
                field1273 = !field1273;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method410(4460, arg2[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(II[C[C)I")
    private static final int method401(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method410(4460, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != 4) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg0 + 1; var7 < arg2.length && method410(4460, arg3[var7]); var7++) {
                if (arg3[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method410(4460, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(Z[C[[B[C)V")
    public static final void method402(boolean arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg3.length > arg1.length) {
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
                    if (var7 < arg3.length && (var16 = method405(var15, var14, 44656, arg3[var7])) > 0) {
                        if (var16 == 1 && method413((byte) 0, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method413((byte) 0, var14) || method413((byte) 0, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method405(var15, var14, 44656, arg3[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method411(var14, 0)) {
                                break label167;
                            }
                            if (method410(4460, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method413((byte) 0, var14)) {
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
                    if (var5 - 1 < 0 || method410(4460, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method410(4460, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method410(4460, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method410(4460, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method410(4460, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method416(var27, 146)) {
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
                    byte var21 = method406(var19, true);
                    byte var22 = method406(var20, true);
                    if (arg2 != null && method403(var22, 0, arg2, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method413((byte) 0, arg1[var33])) {
                            var30++;
                        } else if (method412(field1273, arg1[var33])) {
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
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(BI[[BB)Z")
    private static final boolean method403(byte arg0, int arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (arg2[var4][0] == arg3 && arg2[var4][1] == arg0) {
            return true;
        } else {
            int var5 = arg2.length - 1;
            if (arg2[var5][0] == arg3 && arg2[var5][1] == arg0) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg2[var6][0] == arg3 && arg2[var6][1] == arg0) {
                    return true;
                }
                if (arg3 < arg2[var6][0] || arg2[var6][0] == arg3 && arg0 < arg2[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(CCIC)I")
    private static final int method404(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 29438) {
            field1266 = 33;
        }
        if (arg0 == arg3) {
            return 1;
        } else if (arg0 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg3 == '(' && arg1 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg0 == 's' && arg3 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "(CCIC)I")
    private static final int method405(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 44656) {
            field1266 = -21;
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

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(CZ)B")
    private static final byte method406(char arg0, boolean arg1) {
        if (!arg1) {
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

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "(I[C)V")
    private static final void method407(int arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 <= 0) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method408(arg1, var3, 4)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method410(4460, arg1[var8]) && !method411(arg1[var8], 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method409(var6, 149, arg1);
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

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "([CII)I")
    private static final int method408(char[] arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            return field1266;
        }
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(II[C)I")
    private static final int method409(int arg0, int arg1, char[] arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg1 <= 0) {
                return field1267;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(IC)Z")
    private static final boolean method410(int arg0, char arg1) {
        if (field1272 != arg0) {
            throw new NullPointerException();
        }
        return !method412(field1273, arg1) && !method413((byte) 0, arg1);
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(CI)Z")
    private static final boolean method411(char arg0, int arg1) {
        if (arg1 != 0) {
            field1265 = !field1265;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(ZC)Z")
    private static final boolean method412(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "(BC)Z")
    private static final boolean method413(byte arg0, char arg1) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "(CI)Z")
    private static final boolean method414(char arg0, int arg1) {
        if (arg1 != -30909) {
            field1276 = 208;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "MVRIVVEE", name = "a", descriptor = "(CB)Z")
    private static final boolean method415(char arg0, byte arg1) {
        if (arg1 != -31) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "MVRIVVEE", name = "c", descriptor = "([CI)Z")
    private static final boolean method416(char[] arg0, int arg1) {
        int var2 = 76 / arg1;
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (!method413((byte) 0, arg0[var4]) && arg0[var4] != '\u0000') {
                var3 = false;
            }
        }
        if (var3) {
            return true;
        }
        int var5 = method417(arg0, (byte) 9);
        int var6 = 0;
        int var7 = field1278.length - 1;
        if (field1278[var6] == var5 || field1278[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1278[var8] == var5) {
                return true;
            }
            if (var5 < field1278[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "MVRIVVEE", name = "b", descriptor = "([CB)I")
    public static final int method417(char[] arg0, byte arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 == 9) {
            boolean var3 = false;
        } else {
            field1277 = !field1277;
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
