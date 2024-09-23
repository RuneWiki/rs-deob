import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1216 = true;

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1217 = 24133;

    @OriginalMember(owner = "sc", name = "e", descriptor = "B")
    private static byte field1219 = 117;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1220 = 9;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1221 = -854;

    @OriginalMember(owner = "sc", name = "h", descriptor = "B")
    private static byte field1222 = 9;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1223 = 8;

    @OriginalMember(owner = "sc", name = "j", descriptor = "B")
    private static byte field1224 = 7;

    @OriginalMember(owner = "sc", name = "k", descriptor = "I")
    private static int field1225 = 310;

    @OriginalMember(owner = "sc", name = "l", descriptor = "I")
    private static int field1226 = 315;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1233 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1215;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1218;

    @OriginalMember(owner = "sc", name = "t", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[I")
    private static int[] field1227;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[I")
    private static int[] field1232;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[C")
    private static char[][] field1228;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[C")
    private static char[][] field1230;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[[C")
    private static char[][] field1231;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[[B")
    private static byte[][][] field1229;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(false, arg0.method299("fragmentsenc.txt", null));
        Packet var2 = new Packet(false, arg0.method299("badenc.txt", null));
        Packet var3 = new Packet(false, arg0.method299("domainenc.txt", null));
        Packet var4 = new Packet(false, arg0.method299("tldlist.txt", null));
        method392(var1, var2, var3, var4);
        if (Linkable.field368) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(field1218, arg1);
        method395(arg2, 2);
        method396(362, arg0);
        method393(arg3, true);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z)V")
    private static final void method393(Packet arg0, boolean arg1) {
        int var2 = arg0.method234();
        field1231 = new char[var2][];
        field1232 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1232[var3] = arg0.method229();
            char[] var5 = new char[arg0.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method229();
            }
            field1231[var3] = var5;
        }
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method394(int arg0, Packet arg1) {
        int var2 = arg1.method234();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1228 = new char[var2][];
        field1229 = new byte[var2][][];
        method397(arg1, false, field1229, field1228);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method395(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        field1230 = new char[var2][];
        method398(arg0, field1230, -915);
        if (arg1 < 2 || arg1 > 2) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILlb;)V")
    private static final void method396(int arg0, Packet arg1) {
        field1227 = new int[arg1.method234()];
        for (int var2 = 0; var2 < field1227.length; var2++) {
            field1227[var2] = arg1.method231();
        }
        int var3 = 42 / arg0;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z[[[B[[C)V")
    private static final void method397(Packet arg0, boolean arg1, byte[][][] arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg0.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method229();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg0.method229()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method229();
                var7[var8][1] = (byte) arg0.method229();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;[[CI)V")
    private static final void method398(Packet arg0, char[][] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var5 = new char[arg0.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method229();
            }
            arg1[var3] = var5;
        }
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method399(int arg0, char[] arg1) {
        if (arg0 != 3) {
            field1216 = true;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method400(arg1[var3], 253)) {
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
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method400(char arg0, int arg1) {
        int var2 = 39 / arg1;
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method401(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method399(3, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method409(var6, -8161);
        method404(var6, -41759);
        method405(var6, -45157);
        method418(var6, false);
        if (arg0 != 2) {
            field1215 = -499;
        }
        for (int var8 = 0; var8 < field1233.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1233[var8], var11 + 1)) != -1) {
                char[] var12 = field1233[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method402(var6, var5.toCharArray(), field1219);
        method403(var6, field1220);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CB)V")
    private static final void method402(char[] arg0, char[] arg1, byte arg2) {
        if (arg2 != 117) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (arg0[var4] != '*' && method426(true, arg1[var4])) {
                arg0[var4] = arg1[var4];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method403(char[] arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method423((byte) 8, var4)) {
                var2 = true;
            } else if (var2) {
                if (method425((byte) 7, var4)) {
                    var2 = false;
                }
            } else if (method426(true, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method404(char[] arg0, int arg1) {
        if (arg1 != -41759) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1228.length - 1; var3 >= 0; var3--) {
                method413(field1229[var3], arg0, field1228[var3], 0);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)V")
    private static final void method405(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(null, var2, var3, 0);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 == -45157) {
            method413(null, var4, var5, 0);
            for (int var6 = field1230.length - 1; var6 >= 0; var6--) {
                method406(field1230[var6], var4, arg0, var2, -854);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method406(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        if (arg4 >= 0 || arg0.length > arg2.length) {
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
                    if (var8 < arg0.length && (var13 = method415(true, arg0[var8], var11, var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method415(true, arg0[var8 - 1], var11, var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method421(-418, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method407(arg3, arg2, true, var6);
                int var17 = method408(var7 - 1, (byte) 6, arg2, arg1);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CZI)I")
    private static final int method407(char[] arg0, char[] arg1, boolean arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method421(-418, arg1[var4]); var4--) {
            if (arg1[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method421(-418, arg0[var6]); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (!arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method421(-418, arg1[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IB[C[C)I")
    private static final int method408(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method421(-418, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method421(-418, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg1 == 6) {
                boolean var7 = false;
            } else {
                for (int var8 = 1; var8 > 0; var8++) {
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(-418, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "([CI)V")
    private static final void method409(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method413(null, var2, var3, 0);
        if (arg1 != -8161) {
            return;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(null, var4, var5, 0);
        for (int var6 = 0; var6 < field1231.length; var6++) {
            method410(132, var2, field1232[var6], field1231[var6], arg0, var4);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C[C[C)V")
    private static final void method410(int arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        if (arg0 <= 0) {
            field1226 = -335;
        }
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg3.length; var7 += var10) {
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
                    if (var9 < arg3.length && (var14 = method415(true, arg3[var9], var12, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method415(true, arg3[var9 - 1], var12, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method421(-418, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method411(38965, var7, arg1, arg4);
                int var18 = method412(arg5, 2, var8 - 1, arg4);
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
                                if (method421(-418, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421(-418, arg4[var24])) {
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
                                if (method421(-418, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421(-418, arg4[var28])) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C[C)I")
    private static final int method411(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method421(-418, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method421(-418, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 != 38965) {
                field1216 = true;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(-418, arg3[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII[C)I")
    private static final int method412(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 < 2 || arg1 > 2) {
            field1218 = 242;
        }
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method421(-418, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg3.length && method421(-418, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method421(-418, arg3[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method413(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 != 0 || arg2.length > arg1.length) {
            return;
        }
        boolean var4 = true;
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
                    if (var7 < arg2.length && (var16 = method416(6, arg2[var7], var14, var15)) > 0) {
                        if (var16 == 1 && method424(field1223, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(field1223, var14) || method424(field1223, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method416(6, arg2[var7 - 1], var14, var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method422((byte) -32, var14)) {
                                break label167;
                            }
                            if (method421(-418, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(field1223, var14)) {
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
                    if (var5 - 1 < 0 || method421(-418, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method421(-418, arg1[var6]) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421(-418, arg1[var26]) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method421(-418, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421(-418, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427(65, var27)) {
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
                    byte var21 = method417(var19, 3);
                    byte var22 = method417(var20, 3);
                    if (arg0 != null && method414(var21, 8, arg0, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(field1223, arg1[var33])) {
                            var30++;
                        } else if (method423((byte) 8, arg1[var33])) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BI[[BB)Z")
    private static final boolean method414(byte arg0, int arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg1 != 8) {
            field1220 = -217;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZCCC)I")
    private static final int method415(boolean arg0, char arg1, char arg2, char arg3) {
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg2) {
            return 1;
        } else if (arg1 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg2 == '(' && arg3 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg1 == 's' && arg2 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ICCC)I")
    private static final int method416(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 6) {
            field1218 = -477;
        }
        if (arg1 == arg2) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                    if (arg2 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg2 != '6' && arg2 != '8') {
                    if ((arg2 != '1' || arg3 != '3') && (arg2 != 'i' || arg3 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg1 == 'c') {
                if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'd') {
                if ((arg2 != '[' || arg3 != ')') && (arg2 != 'i' || arg3 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'e') {
                if (arg2 != '3' && arg2 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'f') {
                if (arg2 == 'p' && arg3 == 'h') {
                    return 2;
                }
                if (arg2 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'g') {
                if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'h') {
                if (arg2 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'i') {
                if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                if (arg2 != '0' && arg2 != '*') {
                    if ((arg2 != '(' || arg3 != ')') && (arg2 != '[' || arg3 != ']') && (arg2 != '{' || arg3 != '}') && (arg2 != '<' || arg3 != '>')) {
                        return 0;
                    }
                    return 2;
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
                if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 't') {
                if (arg2 != '7' && arg2 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'u') {
                if (arg2 == 'v') {
                    return 1;
                }
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'v') {
                if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg2 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg2 != ')' || arg3 != '(') && (arg2 != '}' || arg3 != '{') && (arg2 != ']' || arg3 != '[') && (arg2 != '>' || arg3 != '<')) {
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
                if (arg2 == 'o' || arg2 == 'O') {
                    return 1;
                } else if ((arg2 != '(' || arg3 != ')') && (arg2 != '{' || arg3 != '}') && (arg2 != '[' || arg3 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg1 == '1') {
                return arg2 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg1 == ',') {
            return arg2 == '.' ? 1 : 0;
        } else if (arg1 == '.') {
            return arg2 == ',' ? 1 : 0;
        } else if (arg1 == '!') {
            return arg2 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)B")
    private static final byte method417(char arg0, int arg1) {
        if (arg1 != 3) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method418(char[] arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method419(var4, arg0, 463)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method421(-418, arg0[var9]) && !method422((byte) -32, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method420(arg0, var7, (byte) 8);
                int var10 = 0;
                for (int var11 = var7; var11 < var4; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var4 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var4; var12++) {
                arg0[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI)I")
    private static final int method419(int arg0, char[] arg1, int arg2) {
        int var3 = 66 / arg2;
        for (int var4 = arg0; var4 < arg1.length && var4 >= 0; var4++) {
            if (arg1[var4] >= '0' && arg1[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CIB)I")
    private static final int method420(char[] arg0, int arg1, byte arg2) {
        if (arg2 != 8) {
            return 0;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method421(int arg0, char arg1) {
        while (arg0 >= 0) {
        }
        if (method423((byte) 8, arg1) || method424(field1223, arg1)) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method422(byte arg0, char arg1) {
        if (arg0 != -32) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(BC)Z")
    private static final boolean method423(byte arg0, char arg1) {
        if (arg0 != 8) {
            field1216 = true;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method424(int arg0, char arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(BC)Z")
    private static final boolean method425(byte arg0, char arg1) {
        if (field1224 == arg0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method426(boolean arg0, char arg1) {
        if (!arg0) {
            field1220 = 162;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)Z")
    private static final boolean method427(int arg0, char[] arg1) {
        if (arg0 <= 0) {
            field1226 = 98;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method424(field1223, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(arg1, 2);
        int var5 = 0;
        int var6 = field1227.length - 1;
        if (field1227[var5] == var4 || field1227[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1227[var7] == var4) {
                return true;
            }
            if (var4 < field1227[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "e", descriptor = "([CI)I")
    public static final int method428(char[] arg0, int arg1) {
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
        if (arg1 < 2 || arg1 > 2) {
            field1226 = 122;
        }
        return var2;
    }
}
