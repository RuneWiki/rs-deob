import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PAYTRPNV")
public class class41 {

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "Z")
    private static boolean field1217 = true;

    @OriginalMember(owner = "PAYTRPNV", name = "b", descriptor = "Z")
    private static boolean field1218 = true;

    @OriginalMember(owner = "PAYTRPNV", name = "c", descriptor = "I")
    private static int field1219 = 564;

    @OriginalMember(owner = "PAYTRPNV", name = "e", descriptor = "I")
    private static int field1221 = 45903;

    @OriginalMember(owner = "PAYTRPNV", name = "f", descriptor = "I")
    private static int field1222 = 996;

    @OriginalMember(owner = "PAYTRPNV", name = "g", descriptor = "I")
    private static int field1223 = 7;

    @OriginalMember(owner = "PAYTRPNV", name = "o", descriptor = "[Ljava/lang/String;")
    private static final String[] field1231 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "PAYTRPNV", name = "d", descriptor = "I")
    private static int field1220;

    @OriginalMember(owner = "PAYTRPNV", name = "h", descriptor = "Z")
    private static boolean field1224;

    @OriginalMember(owner = "PAYTRPNV", name = "p", descriptor = "Z")
    public static boolean field1232;

    @OriginalMember(owner = "PAYTRPNV", name = "i", descriptor = "[I")
    private static int[] field1225;

    @OriginalMember(owner = "PAYTRPNV", name = "n", descriptor = "[I")
    private static int[] field1230;

    @OriginalMember(owner = "PAYTRPNV", name = "j", descriptor = "[[C")
    private static char[][] field1226;

    @OriginalMember(owner = "PAYTRPNV", name = "l", descriptor = "[[C")
    private static char[][] field1228;

    @OriginalMember(owner = "PAYTRPNV", name = "m", descriptor = "[[C")
    private static char[][] field1229;

    @OriginalMember(owner = "PAYTRPNV", name = "k", descriptor = "[[[B")
    private static byte[][][] field1227;

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(LSYUGXMZF;)V")
    public static final void method427(class55 arg0) {
        class30 var1 = new class30(arg0.method551("fragmentsenc.txt", null), -982);
        class30 var2 = new class30(arg0.method551("badenc.txt", null), -982);
        class30 var3 = new class30(arg0.method551("domainenc.txt", null), -982);
        class30 var4 = new class30(arg0.method551("tldlist.txt", null), -982);
        method428(var1, var2, var3, var4);
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(LKHOMSBHW;LKHOMSBHW;LKHOMSBHW;LKHOMSBHW;)V")
    private static final void method428(class30 arg0, class30 arg1, class30 arg2, class30 arg3) {
        method430(152, arg1);
        method431((byte) -26, arg2);
        method432(0, arg0);
        method429(arg3, 41461);
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(LKHOMSBHW;I)V")
    private static final void method429(class30 arg0, int arg1) {
        if (arg1 != 41461) {
            return;
        }
        int var2 = arg0.method354();
        field1229 = new char[var2][];
        field1230 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1230[var3] = arg0.method349();
            char[] var4 = new char[arg0.method349()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method349();
            }
            field1229[var3] = var4;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(ILKHOMSBHW;)V")
    private static final void method430(int arg0, class30 arg1) {
        int var2 = 44 / arg0;
        int var3 = arg1.method354();
        field1226 = new char[var3][];
        field1227 = new byte[var3][][];
        method433(false, field1227, field1226, arg1);
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(BLKHOMSBHW;)V")
    private static final void method431(byte arg0, class30 arg1) {
        int var2 = arg1.method354();
        field1228 = new char[var2][];
        method434(field1228, arg1, -618);
        if (arg0 != -26) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "b", descriptor = "(ILKHOMSBHW;)V")
    private static final void method432(int arg0, class30 arg1) {
        if (arg0 == 0) {
            field1225 = new int[arg1.method354()];
            for (int var2 = 0; var2 < field1225.length; var2++) {
                field1225[var2] = arg1.method351();
            }
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(Z[[[B[[CLKHOMSBHW;)V")
    private static final void method433(boolean arg0, byte[][][] arg1, char[][] arg2, class30 arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg3.method349()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method349();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg3.method349()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method349();
                var7[var8][1] = (byte) arg3.method349();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg0) {
            field1219 = -348;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([[CLKHOMSBHW;I)V")
    private static final void method434(char[][] arg0, class30 arg1, int arg2) {
        while (arg2 >= 0) {
            field1224 = !field1224;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method349()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method349();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(Z[C)V")
    private static final void method435(boolean arg0, char[] arg1) {
        int var2 = 0;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (method436(arg1[var4], field1220)) {
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

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(CI)Z")
    private static final boolean method436(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method437(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        method435(true, var4);
        String var6 = (new String(var4)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method445(var7, (byte) 33);
        method440(var7, true);
        method441(var7, false);
        method454(var7, 7);
        for (int var9 = 0; var9 < field1231.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1231[var9], var12 + 1)) != -1) {
                char[] var13 = field1231[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method438(var7, -416, var6.toCharArray());
        method439(-358, var7);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CI[C)V")
    private static final void method438(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method462(arg2[var3], 0)) {
                arg0[var3] = arg2[var3];
            }
        }
        while (arg1 >= 0) {
            field1224 = !field1224;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(I[C)V")
    private static final void method439(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method459(var4, -891)) {
                var2 = true;
            } else if (var2) {
                if (method461(var4, true)) {
                    var2 = false;
                }
            } else if (method462(var4, 0)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CZ)V")
    private static final void method440(char[] arg0, boolean arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1226.length - 1; var3 >= 0; var3--) {
                method449(field1226[var3], -673, arg0, field1227[var3]);
            }
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "b", descriptor = "([CZ)V")
    private static final void method441(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method449(var3, -673, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method449(var5, -673, var4, null);
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = field1228.length - 1; var7 >= 0; var7--) {
            method442(arg0, var2, var4, field1228[var7], field1221);
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method442(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        if (field1221 != arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method451(var12, false, var13, arg3[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method451(var12, false, var13, arg3[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method457(-369, var12)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method443(arg0, -20919, arg1, var7);
                int var18 = method444(752, arg2, arg0, var8 - 1);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg0[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CI[CI)I")
    private static final int method443(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method457(-369, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg1 != -20919) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg3 - 1; var7 >= 0 && method457(-369, arg2[var7]); var7--) {
            if (arg2[var7] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method457(-369, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(I[C[CI)I")
    private static final int method444(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method457(-369, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 38 / arg0;
            int var6 = 0;
            for (int var7 = arg3 + 1; var7 < arg2.length && method457(-369, arg1[var7]); var7++) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method457(-369, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CB)V")
    private static final void method445(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method449(var3, -673, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method449(var5, -673, var4, null);
        if (arg1 != 33) {
            field1219 = 52;
        }
        for (int var6 = 0; var6 < field1229.length; var6++) {
            method446(var4, var2, field1230[var6], field1229[var6], true, arg0);
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([C[CI[CZ[C)V")
    private static final void method446(char[] arg0, char[] arg1, int arg2, char[] arg3, boolean arg4, char[] arg5) {
        if (!arg4 || arg3.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method451(var12, false, var13, arg3[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method451(var12, false, var13, arg3[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method457(-369, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method447((byte) -90, arg5, var7, arg1);
                int var18 = method448(arg0, arg5, var8 - 1, 996);
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
                                if (method457(-369, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method457(-369, arg5[var24])) {
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
                                if (method457(-369, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method457(-369, arg5[var28])) {
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
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(B[CI[C)I")
    private static final int method447(byte arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method457(-369, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg0 != -90) {
                return 0;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method457(-369, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method457(-369, arg1[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([C[CII)I")
    private static final int method448(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method457(-369, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method457(-369, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 <= 0) {
                field1220 = -434;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method457(-369, arg1[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CI[C[[B)V")
    public static final void method449(char[] arg0, int arg1, char[] arg2, byte[][] arg3) {
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        while (arg1 >= 0) {
            field1220 = 391;
        }
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg0.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label166: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label166;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg0.length && (var16 = method452(arg0[var7], 1, var15, var14)) > 0) {
                        if (var16 == 1 && method460(var14, 0)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method460(var14, 0) || method460(var15, 0))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label166;
                        }
                        int var17;
                        if ((var17 = method452(arg0[var7 - 1], 1, var15, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method458(var14, 9)) {
                                break label166;
                            }
                            if (method457(-369, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method460(var14, 0)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label166;
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
                    if (var5 - 1 < 0 || method457(-369, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method457(-369, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method457(-369, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method457(-369, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method457(-369, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method463(var27, false)) {
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
                        var19 = arg2[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg2.length) {
                        var20 = arg2[var6];
                    }
                    byte var21 = method453(var19, 48005);
                    byte var22 = method453(var20, 48005);
                    if (arg3 != null && method450(arg3, var22, 0, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method460(arg2[var33], 0)) {
                            var30++;
                        } else if (method459(arg2[var33], -891)) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg2[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([[BBIB)Z")
    private static final boolean method450(byte[][] arg0, byte arg1, int arg2, byte arg3) {
        int var4 = 0;
        if (arg0[var4][0] == arg3 && arg0[var4][1] == arg1) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg2 != 0) {
            throw new NullPointerException();
        } else if (arg0[var5][0] == arg3 && arg0[var5][1] == arg1) {
            return true;
        } else {
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
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(CZCC)I")
    private static final int method451(char arg0, boolean arg1, char arg2, char arg3) {
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg0 == '(' && arg2 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg3 == 's' && arg0 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(CICC)I")
    private static final int method452(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 < 1 || arg1 > 1) {
            return 3;
        } else if (arg0 == arg3) {
            return 1;
        } else {
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
    }

    @OriginalMember(owner = "PAYTRPNV", name = "b", descriptor = "(CI)B")
    private static final byte method453(char arg0, int arg1) {
        if (arg1 != 48005) {
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

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CI)V")
    private static final void method454(char[] arg0, int arg1) {
        boolean var2 = false;
        if (field1223 != arg1) {
            field1224 = !field1224;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method455(var3, (byte) 5, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method457(-369, arg0[var8]) && !method458(arg0[var8], 9)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method456(arg0, (byte) 6, var6);
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

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(IB[C)I")
    private static final int method455(int arg0, byte arg1, char[] arg2) {
        if (arg1 != 5) {
            field1218 = !field1218;
        }
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "([CBI)I")
    private static final int method456(char[] arg0, byte arg1, int arg2) {
        if (arg1 != 6) {
            return 0;
        }
        boolean var3 = false;
        int var4 = arg2;
        while (true) {
            if (var4 < arg0.length && var4 >= 0) {
                if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(IC)Z")
    private static final boolean method457(int arg0, char arg1) {
        while (arg0 >= 0) {
            field1220 = 222;
        }
        if (method459(arg1, -891) || method460(arg1, 0)) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "c", descriptor = "(CI)Z")
    private static final boolean method458(char arg0, int arg1) {
        if (arg1 != 9) {
            field1223 = 271;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "d", descriptor = "(CI)Z")
    private static final boolean method459(char arg0, int arg1) {
        while (arg1 >= 0) {
            field1222 = -321;
        }
        if ((arg0 < 'a' || arg0 > 'z') && (arg0 < 'A' || arg0 > 'Z')) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "PAYTRPNV", name = "e", descriptor = "(CI)Z")
    private static final boolean method460(char arg0, int arg1) {
        if (arg1 != 0) {
            field1218 = !field1218;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "PAYTRPNV", name = "a", descriptor = "(CZ)Z")
    private static final boolean method461(char arg0, boolean arg1) {
        if (!arg1) {
            field1222 = -35;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "PAYTRPNV", name = "f", descriptor = "(CI)Z")
    private static final boolean method462(char arg0, int arg1) {
        if (arg1 != 0) {
            field1221 = -192;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "PAYTRPNV", name = "c", descriptor = "([CZ)Z")
    private static final boolean method463(char[] arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method460(arg0[var3], 0) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method464(arg0, 27);
        int var5 = 0;
        int var6 = field1225.length - 1;
        if (field1225[var5] == var4 || field1225[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1225[var7] == var4) {
                return true;
            }
            if (var4 < field1225[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "PAYTRPNV", name = "b", descriptor = "([CI)I")
    public static final int method464(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 <= 0) {
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
