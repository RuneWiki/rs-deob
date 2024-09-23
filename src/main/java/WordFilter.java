import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "Z")
    private static boolean field1204 = true;

    @OriginalMember(owner = "sc", name = "b", descriptor = "I")
    private static int field1205 = 9384;

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1206 = 8;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1207 = -11003;

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1208 = 20416;

    @OriginalMember(owner = "sc", name = "f", descriptor = "Z")
    private static boolean field1209 = true;

    @OriginalMember(owner = "sc", name = "g", descriptor = "B")
    private static byte field1210 = 47;

    @OriginalMember(owner = "sc", name = "h", descriptor = "B")
    private static byte field1211 = 24;

    @OriginalMember(owner = "sc", name = "i", descriptor = "B")
    private static byte field1212 = 9;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field1220 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "r", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "sc", name = "j", descriptor = "Z")
    private static boolean field1213;

    @OriginalMember(owner = "sc", name = "k", descriptor = "[I")
    private static int[] field1214;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[I")
    private static int[] field1219;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[[C")
    private static char[][] field1215;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[C")
    private static char[][] field1217;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1218;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[[B")
    private static byte[][][] field1216;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method391(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method299("fragmentsenc.txt", null), (byte) -93);
        Packet var2 = new Packet(arg0.method299("badenc.txt", null), (byte) -93);
        Packet var3 = new Packet(arg0.method299("domainenc.txt", null), (byte) -93);
        Packet var4 = new Packet(arg0.method299("tldlist.txt", null), (byte) -93);
        method392(var1, var2, var3, var4);
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method392(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method394(310, arg1);
        method395(arg2, (byte) 3);
        method396(arg0, true);
        method393(arg3, -661);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method393(Packet arg0, int arg1) {
        int var2 = arg0.method234();
        field1218 = new char[var2][];
        field1219 = new int[var2];
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < var2; var4++) {
            field1219[var4] = arg0.method229();
            char[] var5 = new char[arg0.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method229();
            }
            field1218[var4] = var5;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method394(int arg0, Packet arg1) {
        int var2 = arg1.method234();
        field1215 = new char[var2][];
        field1216 = new byte[var2][][];
        method397(arg1, field1216, field1215, -563);
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B)V")
    private static final void method395(Packet arg0, byte arg1) {
        int var2 = arg0.method234();
        field1217 = new char[var2][];
        if (arg1 == 3) {
            boolean var3 = false;
        }
        method398(field1217, arg0, (byte) -31);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z)V")
    private static final void method396(Packet arg0, boolean arg1) {
        field1214 = new int[arg0.method234()];
        if (arg1) {
            for (int var2 = 0; var2 < field1214.length; var2++) {
                field1214[var2] = arg0.method231();
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;[[[B[[CI)V")
    private static final void method397(Packet arg0, byte[][][] arg1, char[][] arg2, int arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method229()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method229();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method229()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method229();
                var7[var8][1] = (byte) arg0.method229();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (arg3 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[CLlb;B)V")
    private static final void method398(char[][] arg0, Packet arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method229()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method229();
            }
            arg0[var3] = var4;
        }
        if (arg2 == -31) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method399(int arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 <= 0) {
            field1206 = 111;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method400(arg1[var3], (byte) 117)) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)Z")
    private static final boolean method400(char arg0, byte arg1) {
        if (arg1 != 117) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method401(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        if (field1205 != arg0) {
            throw new NullPointerException();
        }
        char[] var4 = arg1.toCharArray();
        method399(152, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method409(var6, false);
        method404(var6, 20416);
        method405(var6, 0);
        method418((byte) 2, var6);
        for (int var8 = 0; var8 < field1220.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1220[var8], var11 + 1)) != -1) {
                char[] var12 = field1220[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method402(var5.toCharArray(), -11003, var6);
        method403(var6, (byte) 2);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C)V")
    private static final void method402(char[] arg0, int arg1, char[] arg2) {
        if (field1207 != arg1) {
            field1206 = 32;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method426(474, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method403(char[] arg0, byte arg1) {
        boolean var2 = true;
        if (arg1 != 2) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method423(var4, 0)) {
                var2 = true;
            } else if (var2) {
                if (method425(436, var4)) {
                    var2 = false;
                }
            } else if (method426(474, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method404(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1215.length - 1; var3 >= 0; var3--) {
                method413(-72, field1215[var3], arg0, field1216[var3]);
            }
        }
        if (field1208 != arg1) {
            field1204 = !field1204;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method405(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 0) {
            return;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method413(-72, var3, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method413(-72, var5, var4, null);
        for (int var6 = field1217.length - 1; var6 >= 0; var6--) {
            method406((byte) -114, var4, var2, field1217[var6], arg0);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C[C[C[C)V")
    private static final void method406(byte arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        if (arg0 != -114) {
            field1205 = 38;
        }
        int var9;
        for (int var6 = 0; var6 <= arg4.length - arg3.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg4.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg4[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg4.length) {
                        var12 = arg4[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg3.length && (var13 = method415((byte) 47, var12, var11, arg3[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method415((byte) 47, var12, var11, arg3[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg3.length || !method421((byte) 3, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg3.length) {
                boolean var15 = false;
                int var16 = method407(field1209, var6, arg4, arg2);
                int var17 = method408(arg4, arg1, var7 - 1, 921);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg4[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZI[C[C)I")
    private static final int method407(boolean arg0, int arg1, char[] arg2, char[] arg3) {
        if (!arg0) {
            return field1207;
        } else if (arg1 == 0) {
            return 2;
        } else {
            for (int var4 = arg1 - 1; var4 >= 0 && method421((byte) 3, arg2[var4]); var4--) {
                if (arg2[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method421((byte) 3, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method421((byte) 3, arg2[arg1 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CII)I")
    private static final int method408(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method421((byte) 3, arg0[var4])) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 77 / arg3;
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg0.length && method421((byte) 3, arg1[var7]); var7++) {
                if (arg1[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method421((byte) 3, arg0[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method409(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method413(-72, var3, var2, null);
        char[] var4 = (char[]) arg0.clone();
        if (arg1) {
            field1208 = -73;
        }
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method413(-72, var5, var4, null);
        for (int var6 = 0; var6 < field1218.length; var6++) {
            method410(arg0, var2, var4, 1, field1219[var6], field1218[var6]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CII[C)V")
    private static final void method410(char[] arg0, char[] arg1, char[] arg2, int arg3, int arg4, char[] arg5) {
        if (arg3 < 1 || arg3 > 1 || arg5.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method415((byte) 47, var13, var12, arg5[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method415((byte) 47, var13, var12, arg5[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method421((byte) 3, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method411(arg1, arg0, -115, var7);
                int var18 = method412(arg2, arg0, -36316, var8 - 1);
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
                                if (method421((byte) 3, arg0[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method421((byte) 3, arg0[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg0.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method421((byte) 3, arg0[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method421((byte) 3, arg0[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg0[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([C[CII)I")
    private static final int method411(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method421((byte) 3, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 >= 0) {
                return field1205;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method421((byte) 3, arg0[var6]); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method421((byte) 3, arg1[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([C[CII)I")
    private static final int method412(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method421((byte) 3, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 != -36316) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg3 + 1; var7 < arg1.length && method421((byte) 3, arg0[var7]); var7++) {
                if (arg0[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method421((byte) 3, arg1[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[C[[B)V")
    public static final void method413(int arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg0 >= 0 || arg1.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method416(var14, arg1[var7], 35650, var15)) > 0) {
                        if (var16 == 1 && method424(-38254, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method424(-38254, var14) || method424(-38254, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method416(var14, arg1[var7 - 1], 35650, var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method422(var14, 15)) {
                                break label167;
                            }
                            if (method421((byte) 3, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method424(-38254, var14)) {
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
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method421((byte) 3, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method421((byte) 3, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method421((byte) 3, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method421((byte) 3, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method421((byte) 3, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method427(-930, var27)) {
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
                    byte var21 = method417(var19, -49945);
                    byte var22 = method417(var20, -49945);
                    if (arg3 != null && method414(var21, var22, false, arg3)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method424(-38254, arg2[var33])) {
                            var30++;
                        } else if (method423(arg2[var33], 0)) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BBZ[[B)Z")
    private static final boolean method414(byte arg0, byte arg1, boolean arg2, byte[][] arg3) {
        int var4 = 0;
        if (arg2) {
            field1208 = -393;
        }
        if (arg3[var4][0] == arg0 && arg3[var4][1] == arg1) {
            return true;
        }
        int var5 = arg3.length - 1;
        if (arg3[var5][0] == arg0 && arg3[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg3[var6][0] == arg0 && arg3[var6][1] == arg1) {
                return true;
            }
            if (arg0 < arg3[var6][0] || arg3[var6][0] == arg0 && arg1 < arg3[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BCCC)I")
    private static final int method415(byte arg0, char arg1, char arg2, char arg3) {
        if (field1210 != arg0) {
            field1205 = -15;
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg2 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCIC)I")
    private static final int method416(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 35650) {
            field1213 = true;
        }
        if (arg0 == arg1) {
            return 1;
        }
        if (arg1 >= 'a' && arg1 <= 'm') {
            if (arg1 == 'a') {
                if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                    if (arg0 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'b') {
                if (arg0 != '6' && arg0 != '8') {
                    if ((arg0 != '1' || arg3 != '3') && (arg0 != 'i' || arg3 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg1 == 'c') {
                if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'd') {
                if ((arg0 != '[' || arg3 != ')') && (arg0 != 'i' || arg3 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'e') {
                if (arg0 != '3' && arg0 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'f') {
                if (arg0 == 'p' && arg3 == 'h') {
                    return 2;
                }
                if (arg0 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'g') {
                if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'h') {
                if (arg0 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg1 == 'i') {
                if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
                if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
                if (arg0 != '0' && arg0 != '*') {
                    if (arg0 == '(' && arg3 == ')' || arg0 == '[' && arg3 == ']' || arg0 == '{' && arg3 == '}' || arg0 == '<' && arg3 == '>') {
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
                if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 't') {
                if (arg0 != '7' && arg0 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg1 == 'u') {
                if (arg0 == 'v') {
                    return 1;
                }
                if (arg0 == '\\' && arg3 == '/' || arg0 == '\\' && arg3 == '|' || arg0 == '|' && arg3 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'v') {
                if ((arg0 != '\\' || arg3 != '/') && (arg0 != '\\' || arg3 != '|') && (arg0 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg1 == 'w') {
                if (arg0 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg1 == 'x') {
                if ((arg0 != ')' || arg3 != '(') && (arg0 != '}' || arg3 != '{') && (arg0 != ']' || arg3 != '[') && (arg0 != '>' || arg3 != '<')) {
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
                if (arg0 == 'o' || arg0 == 'O') {
                    return 1;
                } else if ((arg0 != '(' || arg3 != ')') && (arg0 != '{' || arg3 != '}') && (arg0 != '[' || arg3 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg1 == '1') {
                return arg0 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg1 == ',') {
            return arg0 == '.' ? 1 : 0;
        } else if (arg1 == '.') {
            return arg0 == ',' ? 1 : 0;
        } else if (arg1 == '!') {
            return arg0 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)B")
    private static final byte method417(char arg0, int arg1) {
        if (arg1 != -49945) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method418(byte arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 == 2) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        while (true) {
            do {
                int var8;
                if ((var8 = method419(arg1, field1211, var3)) == -1) {
                    return;
                }
                boolean var9 = false;
                for (int var10 = var3; var10 >= 0 && var10 < var8 && !var9; var10++) {
                    if (!method421((byte) 3, arg1[var10]) && !method422(arg1[var10], 15)) {
                        var9 = true;
                    }
                }
                if (var9) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var8;
                }
                var3 = method420(arg1, (byte) 25, var8);
                int var11 = 0;
                for (int var12 = var8; var12 < var3; var12++) {
                    var11 = var11 * 10 + arg1[var12] - 48;
                }
                if (var11 <= 255 && var3 - var8 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var13 = var5; var13 < var3; var13++) {
                arg1[var13] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CBI)I")
    private static final int method419(char[] arg0, byte arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 != 24) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CBI)I")
    private static final int method420(char[] arg0, byte arg1, int arg2) {
        if (arg1 != 25) {
            field1205 = 233;
        }
        int var3 = arg2;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method421(byte arg0, char arg1) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            field1207 = 191;
        }
        return !method423(arg1, 0) && !method424(-38254, arg1);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)Z")
    private static final boolean method422(char arg0, int arg1) {
        int var2 = 83 / arg1;
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CI)Z")
    private static final boolean method423(char arg0, int arg1) {
        if (arg1 != 0) {
            field1207 = 205;
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method424(int arg0, char arg1) {
        if (arg0 != -38254) {
            field1208 = 328;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method425(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1206 = -385;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method426(int arg0, char arg1) {
        int var2 = 28 / arg0;
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)Z")
    private static final boolean method427(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method424(-38254, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method428(field1212, arg1);
        int var5 = 0;
        int var6 = field1214.length - 1;
        if (field1214[var5] == var4 || field1214[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1214[var7] == var4) {
                return true;
            }
            if (var4 < field1214[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(B[C)I")
    public static final int method428(byte arg0, char[] arg1) {
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
        if (arg0 == 9) {
            return var2;
        } else {
            return field1207;
        }
    }
}
