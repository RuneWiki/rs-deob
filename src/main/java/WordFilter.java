import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1195 = -517;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1196 = true;

    @OriginalMember(owner = "sc", name = "d", descriptor = "Z")
    private static boolean field1198 = true;

    @OriginalMember(owner = "sc", name = "e", descriptor = "Z")
    private static boolean field1199 = true;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1200 = 5;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1201 = -546;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1202 = -452;

    @OriginalMember(owner = "sc", name = "j", descriptor = "B")
    private static byte field1204 = 8;

    @OriginalMember(owner = "sc", name = "k", descriptor = "I")
    private static int field1205 = -341;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] field1212 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1197;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1203;

    @OriginalMember(owner = "sc", name = "s", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[I")
    private static int[] field1206;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[I")
    private static int[] field1211;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[C")
    private static char[][] field1207;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1209;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[C")
    private static char[][] field1210;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[[B")
    private static byte[][][] field1208;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method299("fragmentsenc.txt", null), 58);
        Packet var2 = new Packet(arg0.method299("badenc.txt", null), 58);
        Packet var3 = new Packet(arg0.method299("domainenc.txt", null), 58);
        Packet var4 = new Packet(arg0.method299("tldlist.txt", null), 58);
        method392(var1, var2, var3, var4);
        if (Linkable.field364) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(4, arg1);
        method395(field1197, arg2);
        method396(arg0, -20750);
        method393(arg3, -502);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method393(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        field1210 = new char[var2][];
        field1211 = new int[var2];
        if (arg1 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field1211[var3] = arg0.method229();
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            field1210[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method394(int arg0, Packet arg1) {
        if (arg0 > 0) {
            int var2 = arg1.method234();
            field1207 = new char[var2][];
            field1208 = new byte[var2][][];
            method397(field1208, true, arg1, field1207);
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILlb;)V")
    private static final void method395(int arg0, Packet arg1) {
        int var2 = arg1.method234();
        field1209 = new char[var2][];
        if (arg0 == 0) {
            method398(arg1, field1209, 6);
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Llb;I)V")
    private static final void method396(Packet arg0, int arg1) {
        field1206 = new int[arg0.method234()];
        if (arg1 == -20750) {
            for (int var2 = 0; var2 < field1206.length; var2++) {
                field1206[var2] = arg0.method231();
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[[BZLlb;[[C)V")
    private static final void method397(byte[][][] arg0, boolean arg1, Packet arg2, char[][] arg3) {
        if (!arg1) {
            field1195 = -300;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg2.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method229();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg2.method229()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method229();
                var7[var8][1] = (byte) arg2.method229();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;[[CI)V")
    private static final void method398(Packet arg0, char[][] arg1, int arg2) {
        if (arg2 != 6) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method229();
            }
            arg1[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method399(char[] arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (method400((byte) 3, arg0[var4])) {
                arg0[var3] = arg0[var4];
            } else {
                arg0[var3] = ' ';
            }
            if (var3 == 0 || arg0[var3] != ' ' || arg0[var3 - 1] != ' ') {
                var3++;
            }
        }
        for (int var5 = var3; var5 < arg0.length; var5++) {
            arg0[var5] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method400(byte arg0, char arg1) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            field1195 = -390;
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method401(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method399(var4, false);
        if (arg0 != 59) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        String var6 = (new String(var4)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method409(var7, 0);
        method404(field1201, var7);
        method405(var7, false);
        method418(var7, (byte) 5);
        for (int var9 = 0; var9 < field1212.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1212[var9], var12 + 1)) != -1) {
                char[] var13 = field1212[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method402(var7, var6.toCharArray(), field1199);
        method403(var7, 5);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CZ)V")
    private static final void method402(char[] arg0, char[] arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method426(arg1[var3], 0)) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method403(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method423(956, var4)) {
                var2 = true;
            } else if (var2) {
                if (method425(var4, true)) {
                    var2 = false;
                }
            } else if (method426(var4, 0)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1 < field1200 || arg1 > field1200) {
            field1199 = !field1199;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method404(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1207.length - 1; var4 >= 0; var4--) {
                method413(arg1, field1208[var4], field1207[var4], (byte) 8);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CZ)V")
    private static final void method405(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(var2, null, var3, (byte) 8);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method413(var4, null, var5, (byte) 8);
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = field1209.length - 1; var7 >= 0; var7--) {
            method406(-452, arg0, field1209[var7], var4, var2);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method406(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0 >= 0 || arg2.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg2.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg1[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg1.length) {
                        var12 = arg1[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg2.length && (var13 = method415(var11, field1205, arg2[var8], var12)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method415(var11, field1205, arg2[var8 - 1], var12)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method421(var11, (byte) 111)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method407(var6, arg4, arg1, (byte) 20);
                int var17 = method408(arg1, arg3, var7 - 1, (byte) 5);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg1[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method407(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method421(arg2[var4], (byte) 111); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg3 != 20) {
            field1197 = 365;
        }
        for (int var6 = arg0 - 1; var6 >= 0 && method421(arg1[var6], (byte) 111); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method421(arg2[arg0 - 1], (byte) 111)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CIB)I")
    private static final int method408(char[] arg0, char[] arg1, int arg2, byte arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method421(arg0[var4], (byte) 111)) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg0.length && method421(arg1[var6], (byte) 111); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 == 5) {
                boolean var7 = false;
                if (var5 >= 3) {
                    return 4;
                }
                if (method421(arg0[arg2 + 1], (byte) 111)) {
                    return 1;
                }
                return 0;
            }
            return field1202;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method409(char[] arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        char[] var3 = (char[]) arg0.clone();
        char[] var4 = new char[] { 'd', 'o', 't' };
        method413(var3, null, var4, (byte) 8);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(var5, null, var6, (byte) 8);
        for (int var7 = 0; var7 < field1210.length; var7++) {
            method410((byte) 1, var3, arg0, var5, field1210[var7], field1211[var7]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C[C[C[CI)V")
    private static final void method410(byte arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        if (arg0 != 1) {
            return;
        }
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
                    if (var9 < arg4.length && (var14 = method415(var12, field1205, arg4[var9], var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method415(var12, field1205, arg4[var9 - 1], var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method421(var12, (byte) 111)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method411(arg1, (byte) 61, arg2, var7);
                int var18 = method412(arg3, 0, arg2, var8 - 1);
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
                                if (method421(arg2[var24], (byte) 111)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421(arg2[var24], (byte) 111)) {
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
                                if (method421(arg2[var28], (byte) 111)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421(arg2[var28], (byte) 111)) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB[CI)I")
    private static final int method411(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method421(arg2[var4], (byte) 111)) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg1 != 61) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg3 - 1; var7 >= 0 && method421(arg0[var7], (byte) 111); var7--) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method421(arg2[arg3 - 1], (byte) 111)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[CI)I")
    private static final int method412(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var5 = arg3 + 1;
        while (true) {
            if (var5 < arg2.length && method421(arg2[var5], (byte) 111)) {
                if (arg2[var5] != '\\' && arg2[var5] != '/') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg3 + 1; var7 < arg2.length && method421(arg0[var7], (byte) 111); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method421(arg2[arg3 + 1], (byte) 111)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[[B[CB)V")
    public static final void method413(char[] arg0, byte[][] arg1, char[] arg2, byte arg3) {
        if (field1204 != arg3) {
            field1199 = !field1199;
        }
        if (arg2.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg2.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label172: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label172;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg2.length && (var16 = method416(var14, var15, arg2[var7], true)) > 0) {
                        if (var16 == 1 && method424(var14, (byte) -96)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(var14, (byte) -96) || method424(var15, (byte) -96))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method416(var14, var15, arg2[var7 - 1], true)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method422(var14, 33824)) {
                                break label172;
                            }
                            if (method421(var14, (byte) 111) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(var14, (byte) -96)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label172;
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
                    if (var5 - 1 < 0 || method421(arg0[var5 - 1], (byte) 111) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method421(arg0[var6], (byte) 111) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421(arg0[var26], (byte) 111) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method421(arg0[var26 + var28], (byte) 111) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421(arg0[var26 - 1], (byte) 111) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427((byte) 9, var27)) {
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
                        var19 = arg0[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg0.length) {
                        var20 = arg0[var6];
                    }
                    byte var21 = method417(var19, true);
                    byte var22 = method417(var20, true);
                    if (arg1 != null && method414(arg1, var21, var22, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(arg0[var33], (byte) -96)) {
                            var30++;
                        } else if (method423(956, arg0[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg0[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[BBBI)Z")
    private static final boolean method414(byte[][] arg0, byte arg1, byte arg2, int arg3) {
        int var4 = 0;
        if (arg3 < 0 || arg3 > 0) {
            field1199 = !field1199;
        }
        if (arg0[var4][0] == arg1 && arg0[var4][1] == arg2) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg0[var5][0] == arg1 && arg0[var5][1] == arg2) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg0[var6][0] == arg1 && arg0[var6][1] == arg2) {
                return true;
            }
            if (arg1 < arg0[var6][0] || arg0[var6][0] == arg1 && arg2 < arg0[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CICC)I")
    private static final int method415(char arg0, int arg1, char arg2, char arg3) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCZ)I")
    private static final int method416(char arg0, char arg1, char arg2, boolean arg3) {
        if (!arg3) {
            field1205 = 408;
        }
        if (arg0 == arg2) {
            return 1;
        }
        if (arg2 >= 'a' && arg2 <= 'm') {
            if (arg2 == 'a') {
                if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                    if (arg0 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'b') {
                if (arg0 != '6' && arg0 != '8') {
                    if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg2 == 'c') {
                if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'd') {
                if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'e') {
                if (arg0 != '3' && arg0 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'f') {
                if (arg0 == 'p' && arg1 == 'h') {
                    return 2;
                }
                if (arg0 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'g') {
                if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'h') {
                if (arg0 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'i') {
                if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'j') {
                return 0;
            }
            if (arg2 == 'k') {
                return 0;
            }
            if (arg2 == 'l') {
                if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'm') {
                return 0;
            }
        }
        if (arg2 >= 'n' && arg2 <= 'z') {
            if (arg2 == 'n') {
                return 0;
            }
            if (arg2 == 'o') {
                if (arg0 != '0' && arg0 != '*') {
                    if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg2 == 'p') {
                return 0;
            }
            if (arg2 == 'q') {
                return 0;
            }
            if (arg2 == 'r') {
                return 0;
            }
            if (arg2 == 's') {
                if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 't') {
                if (arg0 != '7' && arg0 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'u') {
                if (arg0 == 'v') {
                    return 1;
                }
                if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'v') {
                if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'w') {
                if (arg0 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'x') {
                if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'y') {
                return 0;
            }
            if (arg2 == 'z') {
                return 0;
            }
        }
        if (arg2 >= '0' && arg2 <= '9') {
            if (arg2 == '0') {
                if (arg0 == 'o' || arg0 == 'O') {
                    return 1;
                } else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg2 == '1') {
                return arg0 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg2 == ',') {
            return arg0 == '.' ? 1 : 0;
        } else if (arg2 == '.') {
            return arg0 == ',' ? 1 : 0;
        } else if (arg2 == '!') {
            return arg0 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)B")
    private static final byte method417(char arg0, boolean arg1) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method418(char[] arg0, byte arg1) {
        boolean var2 = false;
        if (arg1 == 5) {
            boolean var3 = false;
        } else {
            field1203 = 463;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method419(var4, arg0, 0)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method421(arg0[var9], (byte) 111) && !method422(arg0[var9], 33824)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method420(true, arg0, var7);
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
        if (arg2 < 0 || arg2 > 0) {
            return field1203;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[CI)I")
    private static final int method420(boolean arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (!arg0) {
                field1199 = !field1199;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)Z")
    private static final boolean method421(char arg0, byte arg1) {
        if (arg1 != 111) {
            throw new NullPointerException();
        }
        return !method423(956, arg0) && !method424(arg0, (byte) -96);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method422(char arg0, int arg1) {
        if (arg1 != 33824) {
            field1196 = !field1196;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1199 = !field1199;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CB)Z")
    private static final boolean method424(char arg0, byte arg1) {
        if (arg1 != -96) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CZ)Z")
    private static final boolean method425(char arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method426(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)Z")
    private static final boolean method427(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method424(arg1[var3], (byte) -96) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(arg1, (byte) -34);
        int var5 = 0;
        if (arg0 == 9) {
            boolean var6 = false;
        } else {
            field1201 = 288;
        }
        int var7 = field1206.length - 1;
        if (field1206[var5] == var4 || field1206[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var7) / 2;
            if (field1206[var8] == var4) {
                return true;
            }
            if (var4 < field1206[var8]) {
                var7 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var7 && var5 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CB)I")
    public static final int method428(char[] arg0, byte arg1) {
        if (arg1 != -34) {
            return field1195;
        } else if (arg0.length > 6) {
            return 0;
        } else {
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
            return var2;
        }
    }
}
