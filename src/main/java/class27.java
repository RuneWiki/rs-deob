import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KUSEVGYR")
public class class27 {

    @OriginalMember(owner = "KUSEVGYR", name = "d", descriptor = "I")
    private static int field1022 = -35644;

    @OriginalMember(owner = "KUSEVGYR", name = "e", descriptor = "Z")
    private static boolean field1023 = true;

    @OriginalMember(owner = "KUSEVGYR", name = "f", descriptor = "I")
    private static int field1024 = 8;

    @OriginalMember(owner = "KUSEVGYR", name = "g", descriptor = "I")
    private static int field1025 = 732;

    @OriginalMember(owner = "KUSEVGYR", name = "n", descriptor = "[Ljava/lang/String;")
    private static final String[] field1032 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "KUSEVGYR", name = "b", descriptor = "I")
    private static int field1020;

    @OriginalMember(owner = "KUSEVGYR", name = "c", descriptor = "I")
    private static int field1021;

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "Z")
    private static boolean field1019;

    @OriginalMember(owner = "KUSEVGYR", name = "o", descriptor = "Z")
    public static boolean field1033;

    @OriginalMember(owner = "KUSEVGYR", name = "h", descriptor = "[I")
    private static int[] field1026;

    @OriginalMember(owner = "KUSEVGYR", name = "m", descriptor = "[I")
    private static int[] field1031;

    @OriginalMember(owner = "KUSEVGYR", name = "i", descriptor = "[[C")
    private static char[][] field1027;

    @OriginalMember(owner = "KUSEVGYR", name = "k", descriptor = "[[C")
    private static char[][] field1029;

    @OriginalMember(owner = "KUSEVGYR", name = "l", descriptor = "[[C")
    private static char[][] field1030;

    @OriginalMember(owner = "KUSEVGYR", name = "j", descriptor = "[[[B")
    private static byte[][][] field1028;

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(LINOFEYKQ;)V")
    public static final void method292(class21 arg0) {
        class35 var1 = new class35((byte) -103, arg0.method277("fragmentsenc.txt", null));
        class35 var2 = new class35((byte) -103, arg0.method277("badenc.txt", null));
        class35 var3 = new class35((byte) -103, arg0.method277("domainenc.txt", null));
        class35 var4 = new class35((byte) -103, arg0.method277("tldlist.txt", null));
        method293(var1, var2, var3, var4);
        if (class34.field1089) {
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(LNHEPCMLW;LNHEPCMLW;LNHEPCMLW;LNHEPCMLW;)V")
    private static final void method293(class35 arg0, class35 arg1, class35 arg2, class35 arg3) {
        method295(false, arg1);
        method296(arg2, (byte) -105);
        method297(arg0, -762);
        method294(874, arg3);
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(ILNHEPCMLW;)V")
    private static final void method294(int arg0, class35 arg1) {
        int var2 = 96 / arg0;
        int var3 = arg1.method354();
        field1030 = new char[var3][];
        field1031 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            field1031[var4] = arg1.method349();
            char[] var5 = new char[arg1.method349()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method349();
            }
            field1030[var4] = var5;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    private static final void method295(boolean arg0, class35 arg1) {
        int var2 = arg1.method354();
        field1027 = new char[var2][];
        if (arg0) {
            field1021 = -268;
        }
        field1028 = new byte[var2][][];
        method298(2, arg1, field1028, field1027);
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(LNHEPCMLW;B)V")
    private static final void method296(class35 arg0, byte arg1) {
        int var2 = arg0.method354();
        if (arg1 == -105) {
            field1029 = new char[var2][];
            method299(arg0, field1029, 0);
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(LNHEPCMLW;I)V")
    private static final void method297(class35 arg0, int arg1) {
        if (arg1 >= 0) {
            field1019 = true;
        }
        field1026 = new int[arg0.method354()];
        for (int var2 = 0; var2 < field1026.length; var2++) {
            field1026[var2] = arg0.method351();
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(ILNHEPCMLW;[[[B[[C)V")
    private static final void method298(int arg0, class35 arg1, byte[][][] arg2, char[][] arg3) {
        if (arg0 < 2 || arg0 > 2) {
            return;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method349()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method349();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method349()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method349();
                var7[var8][1] = (byte) arg1.method349();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(LNHEPCMLW;[[CI)V")
    private static final void method299(class35 arg0, char[][] arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method349()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method349();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(I[C)V")
    private static final void method300(int arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 != -27255) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method301(327, arg1[var4])) {
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

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(IC)Z")
    private static final boolean method301(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method302(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        method300(-27255, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method310(field1022, var6);
        method305(var6, 276);
        method306(var6, 0);
        method319(-128, var6);
        for (int var8 = 0; var8 < field1032.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1032[var8], var11 + 1)) != -1) {
                char[] var12 = field1032[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method303(var6, var5.toCharArray(), -369);
        method304(var6, (byte) 79);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "([C[CI)V")
    private static final void method303(char[] arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            field1020 = -71;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method327(field1025, arg1[var3])) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "([CB)V")
    private static final void method304(char[] arg0, byte arg1) {
        boolean var2 = true;
        if (arg1 != 79) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[var4];
            if (!method324(true, var5)) {
                var2 = true;
            } else if (var2) {
                if (method326(field1024, var5)) {
                    var2 = false;
                }
            } else if (method327(field1025, var5)) {
                arg0[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "([CI)V")
    private static final void method305(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1027.length - 1; var4 >= 0; var4--) {
                method314(field1023, arg0, field1028[var4], field1027[var4]);
            }
        }
        int var3 = 53 / arg1;
    }

    @OriginalMember(owner = "KUSEVGYR", name = "b", descriptor = "([CI)V")
    private static final void method306(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg1 < 0 || arg1 > 0) {
            field1022 = -391;
        }
        method314(field1023, var2, null, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method314(field1023, var4, null, var5);
        for (int var6 = field1029.length - 1; var6 >= 0; var6--) {
            method307(arg0, var4, field1029[var6], 0, var2);
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "([C[C[CI[C)V")
    private static final void method307(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
        if (arg2.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg0.length - arg2.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg0.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg0[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg0.length) {
                        var12 = arg0[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg2.length && (var13 = method316(var11, var12, arg2[var8], (byte) 8)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method316(var11, var12, arg2[var8 - 1], (byte) 8)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method322(49389, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method308(var6, (byte) 4, arg0, arg4);
                int var17 = method309(0, arg0, arg1, var7 - 1);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg0[var18] = '*';
                    }
                }
            }
        }
        if (arg3 != 0) {
            field1022 = 461;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(IB[C[C)I")
    private static final int method308(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method322(49389, arg2[var4]); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method322(49389, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (arg1 == 4) {
            boolean var7 = false;
        } else {
            field1024 = -48;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method322(49389, arg2[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(I[C[CI)I")
    private static final int method309(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method322(49389, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != 0) {
                field1019 = true;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && method322(49389, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method322(49389, arg1[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "b", descriptor = "(I[C)V")
    private static final void method310(int arg0, char[] arg1) {
        if (arg0 != -35644) {
            return;
        }
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method314(field1023, var2, null, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method314(field1023, var4, null, var5);
        for (int var6 = 0; var6 < field1030.length; var6++) {
            method311(var4, var2, field1030[var6], arg1, 0, field1031[var6]);
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "([C[C[C[CII)V")
    private static final void method311(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4, int arg5) {
        if (arg2.length > arg3.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg3.length - arg2.length; var7 += var10) {
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
                    if (var9 < arg2.length && (var14 = method316(var12, var13, arg2[var9], (byte) 8)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method316(var12, var13, arg2[var9 - 1], (byte) 8)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg2.length || !method322(49389, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg2.length) {
                boolean var16 = false;
                int var17 = method312((byte) 0, arg1, arg3, var7);
                int var18 = method313(var8 - 1, arg3, arg0, (byte) 5);
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
                                if (method322(49389, arg3[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method322(49389, arg3[var24])) {
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
                                if (method322(49389, arg3[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method322(49389, arg3[var28])) {
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
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(B[C[CI)I")
    private static final int method312(byte arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method322(49389, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg0 != 0) {
                return field1025;
            }
            boolean var5 = false;
            int var6 = 0;
            for (int var7 = arg3 - 1; var7 >= 0 && method322(49389, arg1[var7]); var7--) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method322(49389, arg2[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(I[C[CB)I")
    private static final int method313(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method322(49389, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 == 5) {
                boolean var6 = false;
            } else {
                field1023 = true;
            }
            for (int var7 = arg0 + 1; var7 < arg1.length && method322(49389, arg2[var7]); var7++) {
                if (arg2[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method322(49389, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(Z[C[[B[C)V")
    public static final void method314(boolean arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (!arg0 || arg3.length > arg1.length) {
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
                    if (var7 < arg3.length && (var16 = method317(arg3[var7], 0, var14, var15)) > 0) {
                        if (var16 == 1 && method325(-646, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method325(-646, var14) || method325(-646, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method317(arg3[var7 - 1], 0, var14, var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method323(var14, 0)) {
                                break label167;
                            }
                            if (method322(49389, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method325(-646, var14)) {
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
                    if (var5 - 1 < 0 || method322(49389, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method322(49389, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method322(49389, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method322(49389, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method322(49389, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method328(var27, (byte) 32)) {
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
                    byte var21 = method318(var19, -581);
                    byte var22 = method318(var20, -581);
                    if (arg2 != null && method315(var21, arg2, var22, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method325(-646, arg1[var33])) {
                            var30++;
                        } else if (method324(true, arg1[var33])) {
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

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(B[[BBI)Z")
    private static final boolean method315(byte arg0, byte[][] arg1, byte arg2, int arg3) {
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg0 && arg1[var6][1] == arg2) {
                return true;
            }
            if (arg0 < arg1[var6][0] || arg1[var6][0] == arg0 && arg2 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(CCCB)I")
    private static final int method316(char arg0, char arg1, char arg2, byte arg3) {
        if (arg3 == 8) {
            boolean var4 = false;
        }
        if (arg0 == arg2) {
            return 1;
        } else if (arg2 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg0 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(CICC)I")
    private static final int method317(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg2) {
            return 1;
        }
        if (arg0 >= 'a' && arg0 <= 'm') {
            if (arg0 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg3 != '3') && (arg2 != 'i' || arg3 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg0 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'd') {
                if ((arg2 != '[' || arg3 != ')') && (arg2 != 'i' || arg3 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'f') {
                if (arg2 == 'p' && arg3 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'g') {
                if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg0 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                if (arg2 != '0' && arg2 != '*') {
                    if (arg2 == '(' && arg3 == ')' || arg2 == '[' && arg3 == ']' || arg2 == '{' && arg3 == '}' || arg2 == '<' && arg3 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg0 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if (arg2 == '\\' && arg3 == '/' || arg2 == '\\' && arg3 == '|' || arg2 == '|' && arg3 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'v') {
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg0 == 'w') {
                if (arg2 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg0 == 'x') {
                if ((arg2 != ')' || arg3 != '(') && (arg2 != '}' || arg3 != '{') && (arg2 != ']' || arg3 != '[') && (arg2 != '>' || arg3 != '<')) {
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
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg3 != ')') && (arg2 != '{' || arg3 != '}') && (arg2 != '[' || arg3 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg0 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg0 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg0 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg0 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(CI)B")
    private static final byte method318(char arg0, int arg1) {
        if (arg1 >= 0) {
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

    @OriginalMember(owner = "KUSEVGYR", name = "c", descriptor = "(I[C)V")
    private static final void method319(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        while (arg0 >= 0) {
            field1024 = -439;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method320((byte) 8, var3, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method322(49389, arg1[var8]) && !method323(arg1[var8], 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method321(var6, arg1, (byte) 8);
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

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(BI[C)I")
    private static final int method320(byte arg0, int arg1, char[] arg2) {
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg0 == 8) {
            boolean var4 = false;
            return -1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(I[CB)I")
    private static final int method321(int arg0, char[] arg1, byte arg2) {
        if (arg2 == 8) {
            boolean var3 = false;
        } else {
            field1024 = 346;
        }
        int var4 = arg0;
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

    @OriginalMember(owner = "KUSEVGYR", name = "b", descriptor = "(IC)Z")
    private static final boolean method322(int arg0, char arg1) {
        if (arg0 != 49389) {
            throw new NullPointerException();
        }
        return !method324(true, arg1) && !method325(-646, arg1);
    }

    @OriginalMember(owner = "KUSEVGYR", name = "b", descriptor = "(CI)Z")
    private static final boolean method323(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "a", descriptor = "(ZC)Z")
    private static final boolean method324(boolean arg0, char arg1) {
        if (!arg0) {
            field1023 = true;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "KUSEVGYR", name = "c", descriptor = "(IC)Z")
    private static final boolean method325(int arg0, char arg1) {
        while (arg0 >= 0) {
        }
        if (arg1 >= '0' && arg1 <= '9') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "KUSEVGYR", name = "d", descriptor = "(IC)Z")
    private static final boolean method326(int arg0, char arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "KUSEVGYR", name = "e", descriptor = "(IC)Z")
    private static final boolean method327(int arg0, char arg1) {
        int var2 = 31 / arg0;
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "KUSEVGYR", name = "b", descriptor = "([CB)Z")
    private static final boolean method328(char[] arg0, byte arg1) {
        if (arg1 != 32) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method325(-646, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method329(arg0, 0);
        int var5 = 0;
        int var6 = field1026.length - 1;
        if (field1026[var5] == var4 || field1026[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1026[var7] == var4) {
                return true;
            }
            if (var4 < field1026[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "KUSEVGYR", name = "c", descriptor = "([CI)I")
    public static final int method329(char[] arg0, int arg1) {
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
        if (arg1 != 0) {
            field1024 = -243;
        }
        return var2;
    }
}
