import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "b", descriptor = "I")
    private static int field1193 = -226;

    @OriginalMember(owner = "sc", name = "d", descriptor = "Z")
    private static boolean field1195 = true;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1197 = -484;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1199 = 9;

    @OriginalMember(owner = "sc", name = "j", descriptor = "B")
    private static byte field1201 = -17;

    @OriginalMember(owner = "sc", name = "k", descriptor = "I")
    private static int field1202 = 5;

    @OriginalMember(owner = "sc", name = "m", descriptor = "I")
    private static int field1204 = 443;

    @OriginalMember(owner = "sc", name = "t", descriptor = "[Ljava/lang/String;")
    private static final String[] field1211 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1194;

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1196;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1200;

    @OriginalMember(owner = "sc", name = "u", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "sc", name = "a", descriptor = "Z")
    private static boolean field1192;

    @OriginalMember(owner = "sc", name = "g", descriptor = "Z")
    private static boolean field1198;

    @OriginalMember(owner = "sc", name = "l", descriptor = "Z")
    private static boolean field1203;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[I")
    private static int[] field1205;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[I")
    private static int[] field1210;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[C")
    private static char[][] field1206;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[[C")
    private static char[][] field1208;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[[C")
    private static char[][] field1209;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[[B")
    private static byte[][][] field1207;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method384(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method294("fragmentsenc.txt", null), (byte) 1);
        Packet var2 = new Packet(arg0.method294("badenc.txt", null), (byte) 1);
        Packet var3 = new Packet(arg0.method294("domainenc.txt", null), (byte) 1);
        Packet var4 = new Packet(arg0.method294("tldlist.txt", null), (byte) 1);
        method385(var1, var2, var3, var4);
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method385(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method387(804, arg1);
        method388(arg2, false);
        method389(-534, arg0);
        method386(arg3, (byte) 14);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B)V")
    private static final void method386(Packet arg0, byte arg1) {
        int var2 = arg0.method229();
        if (arg1 != 14) {
            field1204 = 297;
        }
        field1209 = new char[var2][];
        field1210 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1210[var3] = arg0.method224();
            char[] var4 = new char[arg0.method224()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method224();
            }
            field1209[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;)V")
    private static final void method387(int arg0, Packet arg1) {
        int var2 = arg1.method229();
        field1206 = new char[var2][];
        field1207 = new byte[var2][][];
        int var3 = 88 / arg0;
        method390(arg1, field1207, field1206, false);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Z)V")
    private static final void method388(Packet arg0, boolean arg1) {
        if (arg1) {
            field1203 = !field1203;
        }
        int var2 = arg0.method229();
        field1208 = new char[var2][];
        method391(false, field1208, arg0);
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILlb;)V")
    private static final void method389(int arg0, Packet arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1205 = new int[arg1.method229()];
        for (int var3 = 0; var3 < field1205.length; var3++) {
            field1205[var3] = arg1.method226();
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;[[[B[[CZ)V")
    private static final void method390(Packet arg0, byte[][][] arg1, char[][] arg2, boolean arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method224()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method224();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method224()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method224();
                var7[var8][1] = (byte) arg0.method224();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (!arg3) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[[CLlb;)V")
    private static final void method391(boolean arg0, char[][] arg1, Packet arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method224()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method224();
            }
            arg1[var3] = var4;
        }
        if (arg0) {
            field1204 = 35;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method392(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method393(arg0[var3], 0)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        while (arg1 >= 0) {
            field1195 = !field1195;
        }
        for (int var4 = var2; var4 < arg0.length; var4++) {
            arg0[var4] = ' ';
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method393(char arg0, int arg1) {
        if (arg1 != 0) {
            field1195 = !field1195;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method394(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method392(var4, -59);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method402(true, var6);
        method397(var6, (byte) 6);
        if (arg0 != 3) {
            field1196 = -446;
        }
        method398(var6, (byte) 5);
        method411(var6, 9);
        for (int var8 = 0; var8 < field1211.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1211[var8], var11 + 1)) != -1) {
                char[] var12 = field1211[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method395(var6, var5.toCharArray(), -51);
        method396((byte) 7, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CI)V")
    private static final void method395(char[] arg0, char[] arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method419(field1202, arg1[var3])) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method396(byte arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            char var6 = arg1[var5];
            if (!method416(field1201, var6)) {
                var2 = true;
            } else if (var2) {
                if (method418(0, var6)) {
                    var2 = false;
                }
            } else if (method419(field1202, var6)) {
                arg1[var5] = (char) (var6 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method397(char[] arg0, byte arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var5 = field1206.length - 1; var5 >= 0; var5--) {
                method406(arg0, field1206[var5], 3, field1207[var5]);
            }
        }
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CB)V")
    private static final void method398(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 5) {
            field1193 = 219;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method406(var2, var3, 3, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method406(var4, var5, 3, null);
        for (int var6 = field1208.length - 1; var6 >= 0; var6--) {
            method399(var2, (byte) 117, field1208[var6], arg0, var4);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB[C[C[C)V")
    private static final void method399(char[] arg0, byte arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg2.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg3.length - arg2.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg3.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg3[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg3.length) {
                        var12 = arg3[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg2.length && (var13 = method408(arg2[var8], false, var12, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method408(arg2[var8 - 1], false, var12, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method414(0, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg2.length) {
                boolean var15 = false;
                int var16 = method400(arg3, (byte) -8, var6, arg0);
                int var17 = method401(var7 - 1, (byte) 7, arg3, arg4);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg3[var18] = '*';
                    }
                }
            }
        }
        if (arg1 != 117) {
            field1202 = 9;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CBI[C)I")
    private static final int method400(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg1 != -8) {
            return 4;
        } else if (arg2 == 0) {
            return 2;
        } else {
            for (int var4 = arg2 - 1; var4 >= 0 && method414(0, arg0[var4]); var4--) {
                if (arg0[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method414(0, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method414(0, arg0[arg2 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IB[C[C)I")
    private static final int method401(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method414(0, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != 7) {
                field1204 = 226;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method414(0, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method414(0, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[C)V")
    private static final void method402(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method406(var2, var3, 3, null);
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method406(var5, var6, 3, null);
        for (int var7 = 0; var7 < field1209.length; var7++) {
            method403(var2, field1210[var7], arg1, var5, field1209[var7], -35561);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C[C[CI)V")
    private static final void method403(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg5 != -35561) {
            field1195 = !field1195;
        }
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg4.length; var7 += var10) {
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
                    if (var9 < arg4.length && (var14 = method408(arg4[var9], false, var13, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method408(arg4[var9 - 1], false, var13, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method414(0, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method404(arg0, true, arg2, var7);
                int var18 = method405(arg3, var8 - 1, 28750, arg2);
                if (arg1 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg1 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg1 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg1 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg0[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg0[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method414(0, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method414(0, arg2[var24])) {
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
                                if (method414(0, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method414(0, arg2[var28])) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ[CI)I")
    private static final int method404(char[] arg0, boolean arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        int var4 = arg3 - 1;
        while (true) {
            if (var4 >= 0 && method414(0, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 - 1; var6 >= 0 && method414(0, arg0[var6]); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (!arg1) {
                field1202 = 368;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method414(0, arg2[arg3 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII[C)I")
    private static final int method405(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method414(0, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg3.length && method414(0, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (arg2 != 28750) {
                return field1204;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method414(0, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CI[[B)V")
    public static final void method406(char[] arg0, char[] arg1, int arg2, byte[][] arg3) {
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        if (arg2 < 3 || arg2 > 3) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label166: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label166;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method409(var14, var15, arg1[var7], -726)) > 0) {
                        if (var16 == 1 && method417(636, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method417(636, var14) || method417(636, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label166;
                        }
                        int var17;
                        if ((var17 = method409(var14, var15, arg1[var7 - 1], -726)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method415(var14, -972)) {
                                break label166;
                            }
                            if (method414(0, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method417(636, var14)) {
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
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method414(0, arg0[var5 - 1]) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method414(0, arg0[var6]) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method414(0, arg0[var26]) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method414(0, arg0[var26 + var28]) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method414(0, arg0[var26 - 1]) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method420(var27, 6)) {
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
                    byte var21 = method410(var19, 9);
                    byte var22 = method410(var20, 9);
                    if (arg3 != null && method407(-484, arg3, var21, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method417(636, arg0[var33])) {
                            var30++;
                        } else if (method416(field1201, arg0[var33])) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[[BBB)Z")
    private static final boolean method407(int arg0, byte[][] arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg1[var4][0] == arg2 && arg1[var4][1] == arg3) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (arg1[var5][0] == arg2 && arg1[var5][1] == arg3) {
            return true;
        } else {
            do {
                int var6 = (var4 + var5) / 2;
                if (arg1[var6][0] == arg2 && arg1[var6][1] == arg3) {
                    return true;
                }
                if (arg2 < arg1[var6][0] || arg1[var6][0] == arg2 && arg3 < arg1[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZCC)I")
    private static final int method408(char arg0, boolean arg1, char arg2, char arg3) {
        if (arg1) {
            return field1197;
        } else if (arg0 == arg3) {
            return 1;
        } else if (arg0 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg3 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCI)I")
    private static final int method409(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
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
                    if (arg0 == '(' && arg1 == ')' || arg0 == '[' && arg1 == ']' || arg0 == '{' && arg1 == '}' || arg0 == '<' && arg1 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg0 == '\\' && arg1 == '/' || arg0 == '\\' && arg1 == '|' || arg0 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)B")
    private static final byte method410(char arg0, int arg1) {
        if (arg1 < field1199 || arg1 > field1199) {
            field1194 = -479;
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method411(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg1 < 9 || arg1 > 9) {
            field1192 = !field1192;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method412(arg0, field1200, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method414(0, arg0[var8]) && !method415(arg0[var8], -972)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method413(9, arg0, var6);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII)I")
    private static final int method412(char[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1204 = 256;
        }
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI)I")
    private static final int method413(int arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 >= 9 && arg0 <= 9) {
                return arg1.length;
            }
            return field1197;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method414(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return !method416(field1201, arg1) && !method417(636, arg1);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CI)Z")
    private static final boolean method415(char arg0, int arg1) {
        if (arg1 >= 0) {
            field1195 = !field1195;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method416(byte arg0, char arg1) {
        if (arg0 != -17) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method417(int arg0, char arg1) {
        int var2 = 8 / arg0;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method418(int arg0, char arg1) {
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(IC)Z")
    private static final boolean method419(int arg0, char arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)Z")
    private static final boolean method420(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method417(636, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg1 < 6 || arg1 > 6) {
            field1203 = !field1203;
        }
        if (var2) {
            return true;
        }
        int var4 = method421((byte) -119, arg0);
        int var5 = 0;
        int var6 = field1205.length - 1;
        if (field1205[var5] == var4 || field1205[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1205[var7] == var4) {
                return true;
            }
            if (var4 < field1205[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(B[C)I")
    public static final int method421(byte arg0, char[] arg1) {
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
        if (arg0 != -119) {
            field1198 = !field1198;
        }
        return var2;
    }
}
