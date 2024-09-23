import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1197 = 1000;

    @OriginalMember(owner = "sc", name = "d", descriptor = "B")
    private static byte field1200 = 127;

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1201 = -851;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1202 = -144;

    @OriginalMember(owner = "sc", name = "g", descriptor = "B")
    private static byte field1203 = 23;

    @OriginalMember(owner = "sc", name = "h", descriptor = "B")
    private static byte field1204 = 6;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1205 = -173;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1213 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "r", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1198;

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1199;

    @OriginalMember(owner = "sc", name = "j", descriptor = "Z")
    private static boolean field1206;

    @OriginalMember(owner = "sc", name = "k", descriptor = "[I")
    private static int[] field1207;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[I")
    private static int[] field1212;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[[C")
    private static char[][] field1208;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[C")
    private static char[][] field1210;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1211;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[[B")
    private static byte[][][] field1209;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(field1197, arg0.method299("fragmentsenc.txt", null));
        Packet var2 = new Packet(field1197, arg0.method299("badenc.txt", null));
        Packet var3 = new Packet(field1197, arg0.method299("domainenc.txt", null));
        Packet var4 = new Packet(field1197, arg0.method299("tldlist.txt", null));
        method392(var1, var2, var3, var4);
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(arg1, field1200);
        method395(field1201, arg2);
        method396(arg0, 0);
        method393(arg3, false);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z)V")
    private static final void method393(Packet arg0, boolean arg1) {
        int var2 = arg0.method234();
        field1211 = new char[var2][];
        field1212 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1212[var3] = arg0.method229();
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            field1211[var3] = var4;
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B)V")
    private static final void method394(Packet arg0, byte arg1) {
        int var2 = arg0.method234();
        field1208 = new char[var2][];
        field1209 = new byte[var2][][];
        method397(field1208, field1209, field1202, arg0);
        if (field1200 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method395(int arg0, Packet arg1) {
        while (arg0 >= 0) {
        }
        int var2 = arg1.method234();
        field1210 = new char[var2][];
        method398(arg1, -11348, field1210);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method396(Packet arg0, int arg1) {
        field1207 = new int[arg0.method234()];
        if (arg1 == 0) {
            for (int var2 = 0; var2 < field1207.length; var2++) {
                field1207[var2] = arg0.method231();
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[C[[[BILlb;)V")
    private static final void method397(char[][] arg0, byte[][][] arg1, int arg2, Packet arg3) {
        while (arg2 >= 0) {
            field1202 = -163;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg3.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method229();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg3.method229()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method229();
                var7[var8][1] = (byte) arg3.method229();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I[[C)V")
    private static final void method398(Packet arg0, int arg1, char[][] arg2) {
        if (arg1 != -11348) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C)V")
    private static final void method399(boolean arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method400(0, arg1[var3])) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (!arg0) {
            field1197 = 467;
        }
        for (int var4 = var2; var4 < arg1.length; var4++) {
            arg1[var4] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method400(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method401(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        method399(true, var4);
        String var6 = (new String(var4)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method409(false, var7);
        method404(var7, (byte) 105);
        method405((byte) 4, var7);
        method418(field1204, var7);
        for (int var9 = 0; var9 < field1213.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1213[var9], var12 + 1)) != -1) {
                char[] var13 = field1213[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method402(var6.toCharArray(), var7, (byte) -12);
        method403(false, var7);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CB)V")
    private static final void method402(char[] arg0, char[] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method426(983, arg0[var3])) {
                arg1[var3] = arg0[var3];
            }
        }
        if (arg2 == -12) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Z[C)V")
    private static final void method403(boolean arg0, char[] arg1) {
        if (arg0) {
            field1198 = !field1198;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method423(-612, var4)) {
                var2 = true;
            } else if (var2) {
                if (method425((byte) 97, var4)) {
                    var2 = false;
                }
            } else if (method426(983, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method404(char[] arg0, byte arg1) {
        if (arg1 != 105) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1208.length - 1; var3 >= 0; var3--) {
                method413(-466, arg0, field1208[var3], field1209[var3]);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method405(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(-466, var2, var3, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg0 == 4) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        method413(-466, var4, var5, null);
        for (int var8 = field1210.length - 1; var8 >= 0; var8--) {
            method406(arg1, var2, 3, var4, field1210[var8]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method406(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg2 < 3 || arg2 > 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg4.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label62: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label62;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method415(var13, -916, arg4[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method415(var13, -916, arg4[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method421(var12, false)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method407(146, var7, arg0, arg1);
                int var18 = method408(arg3, arg0, (byte) 64, var8 - 1);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C[C)I")
    private static final int method407(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method421(arg2[var4], false); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method421(arg3[var6], false); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (arg0 <= 0) {
            return field1197;
        } else if (var5 >= 3) {
            return 4;
        } else if (method421(arg2[arg1 - 1], false)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CBI)I")
    private static final int method408(char[] arg0, char[] arg1, byte arg2, int arg3) {
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method421(arg1[var4], false)) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg2 != 64) {
                field1202 = 69;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && method421(arg0[var6], false); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(arg1[arg3 + 1], false)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(Z[C)V")
    private static final void method409(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg0) {
            return;
        }
        method413(-466, var2, var3, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(-466, var4, var5, null);
        for (int var6 = 0; var6 < field1211.length; var6++) {
            method410(field1212[var6], var4, 7, field1211[var6], arg1, var2);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C[C[C)V")
    private static final void method410(int arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        if (arg2 < 7 || arg2 > 7) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label127: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label127;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method415(var13, -916, arg3[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label127;
                        }
                        int var15;
                        if ((var15 = method415(var13, -916, arg3[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method421(var12, false)) {
                                break label127;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method411(arg4, var7, (byte) 7, arg5);
                int var18 = method412(arg1, var8 - 1, arg4, (byte) -19);
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
                                if (method421(arg4[var24], false)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421(arg4[var24], false)) {
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
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method421(arg4[var28], false)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421(arg4[var28], false)) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CIB[C)I")
    private static final int method411(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method421(arg0[var4], false)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 == 7) {
                boolean var6 = false;
            } else {
                field1201 = 431;
            }
            for (int var7 = arg1 - 1; var7 >= 0 && method421(arg3[var7], false); var7--) {
                if (arg3[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421(arg0[arg1 - 1], false)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[CB)I")
    private static final int method412(char[] arg0, int arg1, char[] arg2, byte arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method421(arg2[var4], false)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg3 != -19) {
                return field1202;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg2.length && method421(arg0[var6], false); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method421(arg2[arg1 + 1], false)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[C[[B)V")
    public static final void method413(int arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg2.length > arg1.length) {
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
                    if (var7 < arg2.length && (var16 = method416((byte) -23, arg2[var7], var15, var14)) > 0) {
                        if (var16 == 1 && method424(var14, false)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(var14, false) || method424(var15, false))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method416((byte) -23, arg2[var7 - 1], var15, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method422(var14, 9)) {
                                break label167;
                            }
                            if (method421(var14, false) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(var14, false)) {
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
                    if (var5 - 1 < 0 || method421(arg1[var5 - 1], false) && arg1[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg1.length || method421(arg1[var6], false) && arg1[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421(arg1[var26], false) || arg1[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method421(arg1[var26 + var28], false) || arg1[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg1[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421(arg1[var26 - 1], false) || arg1[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427(true, var27)) {
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
                    byte var21 = method417(var19, (byte) 7);
                    byte var22 = method417(var20, (byte) 7);
                    if (arg3 != null && method414(var21, arg3, (byte) 23, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(arg1[var33], false)) {
                            var30++;
                        } else if (method423(-612, arg1[var33])) {
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
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[[BBB)Z")
    private static final boolean method414(byte arg0, byte[][] arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg3) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (field1203 != arg2) {
            field1197 = -14;
        }
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg0 && arg1[var6][1] == arg3) {
                return true;
            }
            if (arg0 < arg1[var6][0] || arg1[var6][0] == arg0 && arg3 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CICC)I")
    private static final int method415(char arg0, int arg1, char arg2, char arg3) {
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg2 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg3 == '(' && arg0 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg2 == 's' && arg3 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BCCC)I")
    private static final int method416(byte arg0, char arg1, char arg2, char arg3) {
        if (arg0 != -23) {
            field1199 = !field1199;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)B")
    private static final byte method417(char arg0, byte arg1) {
        if (arg1 != 7) {
            field1198 = !field1198;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return (byte) (arg0 + 1 - 'a');
        } else if (arg0 == '\'') {
            return 28;
        } else if (arg0 >= '0' && arg0 <= '9') {
            return (byte) (arg0 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(B[C)V")
    private static final void method418(byte arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 != 6) {
            return;
        }
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method419(arg1, var4, -19)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method421(arg1[var9], false) && !method422(arg1[var9], 9)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method420(var7, arg1, field1205);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII)I")
    private static final int method419(char[] arg0, int arg1, int arg2) {
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        while (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI)I")
    private static final int method420(int arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            return field1201;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method421(char arg0, boolean arg1) {
        if (arg1) {
            field1202 = 447;
        }
        return !method423(-612, arg0) && !method424(arg0, false);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method422(char arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            field1202 = 476;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CZ)Z")
    private static final boolean method424(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method425(byte arg0, char arg1) {
        if (arg0 != 97) {
            field1205 = -361;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method426(int arg0, char arg1) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(Z[C)Z")
    private static final boolean method427(boolean arg0, char[] arg1) {
        boolean var2 = true;
        if (!arg0) {
            field1199 = !field1199;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method424(arg1[var3], false) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(255, arg1);
        int var5 = 0;
        int var6 = field1207.length - 1;
        if (field1207[var5] == var4 || field1207[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1207[var7] == var4) {
                return true;
            }
            if (var4 < field1207[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)I")
    public static final int method428(int arg0, char[] arg1) {
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
        if (arg0 <= 0) {
            return field1205;
        } else {
            return var2;
        }
    }
}
