import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "I")
    private static int field1188 = 628;

    @OriginalMember(owner = "sc", name = "e", descriptor = "B")
    private static byte field1192 = 1;

    @OriginalMember(owner = "sc", name = "f", descriptor = "B")
    private static byte field1193 = -50;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1194 = 7;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1195 = 7;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1196 = 5;

    @OriginalMember(owner = "sc", name = "j", descriptor = "I")
    private static int field1197 = 968;

    @OriginalMember(owner = "sc", name = "k", descriptor = "I")
    private static int field1198 = -165;

    @OriginalMember(owner = "sc", name = "l", descriptor = "I")
    private static int field1199 = 1;

    @OriginalMember(owner = "sc", name = "m", descriptor = "Z")
    private static boolean field1200 = true;

    @OriginalMember(owner = "sc", name = "n", descriptor = "Z")
    private static boolean field1201 = true;

    @OriginalMember(owner = "sc", name = "o", descriptor = "I")
    private static int field1202 = -9884;

    @OriginalMember(owner = "sc", name = "v", descriptor = "[Ljava/lang/String;")
    private static final String[] field1209 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1191;

    @OriginalMember(owner = "sc", name = "w", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1189;

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1190;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[I")
    private static int[] field1203;

    @OriginalMember(owner = "sc", name = "u", descriptor = "[I")
    private static int[] field1208;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[[C")
    private static char[][] field1204;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[[C")
    private static char[][] field1206;

    @OriginalMember(owner = "sc", name = "t", descriptor = "[[C")
    private static char[][] field1207;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[[[B")
    private static byte[][][] field1205;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lxb;)V")
    public static final void method384(Jagfile arg0) {
        Packet var1 = new Packet((byte) 3, arg0.method294("fragmentsenc.txt", null));
        Packet var2 = new Packet((byte) 3, arg0.method294("badenc.txt", null));
        Packet var3 = new Packet((byte) 3, arg0.method294("domainenc.txt", null));
        Packet var4 = new Packet((byte) 3, arg0.method294("tldlist.txt", null));
        method385(var1, var2, var3, var4);
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;Llb;Llb;Llb;)V")
    private static final void method385(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method387(arg1, field1192);
        method388(arg2, (byte) -120);
        method389(arg0, 4952);
        method386(arg3, 0);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;I)V")
    private static final void method386(Packet arg0, int arg1) {
        int var2 = arg0.method229();
        field1207 = new char[var2][];
        field1208 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1208[var3] = arg0.method224();
            char[] var4 = new char[arg0.method224()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method224();
            }
            field1207[var3] = var4;
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Llb;B)V")
    private static final void method387(Packet arg0, byte arg1) {
        if (arg1 == 1) {
            int var2 = arg0.method229();
            field1204 = new char[var2][];
            field1205 = new byte[var2][][];
            method390(field1205, (byte) 60, arg0, field1204);
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Llb;B)V")
    private static final void method388(Packet arg0, byte arg1) {
        int var2 = arg0.method229();
        field1206 = new char[var2][];
        method391(-308, arg0, field1206);
        if (arg1 != -120) {
            field1201 = !field1201;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(Llb;I)V")
    private static final void method389(Packet arg0, int arg1) {
        if (arg1 != 4952) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1203 = new int[arg0.method229()];
        for (int var3 = 0; var3 < field1203.length; var3++) {
            field1203[var3] = arg0.method226();
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[[BBLlb;[[C)V")
    private static final void method390(byte[][][] arg0, byte arg1, Packet arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg2.method224()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method224();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg2.method224()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method224();
                var7[var8][1] = (byte) arg2.method224();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
        if (arg1 == 60) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILlb;[[C)V")
    private static final void method391(int arg0, Packet arg1, char[][] arg2) {
        while (arg0 >= 0) {
            field1189 = !field1189;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method224()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method224();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method392(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method393(arg0[var3], 730)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        for (int var4 = var2; var4 < arg0.length; var4++) {
            arg0[var4] = ' ';
        }
        if (arg1 != 6) {
            field1188 = 200;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CI)Z")
    private static final boolean method393(char arg0, int arg1) {
        int var2 = 89 / arg1;
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method394(String arg0, byte arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method392(var4, 6);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method402(23566, var6);
        method397(var6, (byte) -23);
        method398(0, var6);
        method411(var6, -29292);
        for (int var8 = 0; var8 < field1209.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1209[var8], var11 + 1)) != -1) {
                char[] var12 = field1209[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        if (arg1 != -50) {
            field1190 = !field1190;
        }
        method395(var5.toCharArray(), false, var6);
        method396(field1194, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ[C)V")
    private static final void method395(char[] arg0, boolean arg1, char[] arg2) {
        if (arg1) {
            field1189 = !field1189;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method419(arg0[var3], field1201)) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method396(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method416(var4, 5)) {
                var2 = true;
            } else if (var2) {
                if (method418(true, var4)) {
                    var2 = false;
                }
            } else if (method419(var4, field1201)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg0 < field1195 || arg0 > field1195) {
            field1195 = 95;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method397(char[] arg0, byte arg1) {
        if (arg1 != -23) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1204.length - 1; var3 >= 0; var3--) {
                method406(-165, field1205[var3], field1204[var3], arg0);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)V")
    private static final void method398(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method406(-165, null, var3, var2);
        char[] var5 = (char[]) arg1.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method406(-165, null, var6, var5);
        for (int var7 = field1206.length - 1; var7 >= 0; var7--) {
            method399(var2, var5, 5, field1206[var7], arg1);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CI[C[C)V")
    private static final void method399(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg4.length - arg3.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label72: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label72;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method408(var12, 7, var13, arg3[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label72;
                        }
                        int var15;
                        if ((var15 = method408(var12, 7, var13, arg3[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method414(var12, true)) {
                                break label72;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method400(var6, arg0, arg4, 46218);
                int var18 = method401(arg4, var8 - 1, field1197, arg1);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg4[var19] = '*';
                    }
                }
            }
        }
        if (arg2 < field1196 || arg2 > field1196) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method400(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 != 46218) {
            return 3;
        } else if (arg0 == 0) {
            return 2;
        } else {
            for (int var4 = arg0 - 1; var4 >= 0 && method414(arg2[var4], true); var4--) {
                if (arg2[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method414(arg1[var6], true); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method414(arg2[arg0 - 1], true)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII[C)I")
    private static final int method401(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg0.length && method414(arg0[var4], true)) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 <= 0) {
                return 0;
            }
            for (int var6 = arg1 + 1; var6 < arg0.length && method414(arg3[var6], true); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method414(arg0[arg1 + 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(I[C)V")
    private static final void method402(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0 != 23566) {
            field1191 = 229;
        }
        char[] var3 = new char[] { 'd', 'o', 't' };
        method406(-165, null, var3, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method406(-165, null, var5, var4);
        for (int var6 = 0; var6 < field1207.length; var6++) {
            method403(field1207[var6], var4, var2, field1208[var6], (byte) 63, arg1);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[C[CIB[C)V")
    private static final void method403(char[] arg0, char[] arg1, char[] arg2, int arg3, byte arg4, char[] arg5) {
        if (arg0.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg0.length; var7 += var10) {
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
                    if (var9 < arg0.length && (var14 = method408(var12, 7, var13, arg0[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method408(var12, 7, var13, arg0[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method414(var12, true)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method404(arg5, 0, var7, arg2);
                int var18 = method405(var8 - 1, arg1, arg5, (byte) -16);
                if (arg3 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg3 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg3 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg2[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg2[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method414(arg5[var24], true)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method414(arg5[var24], true)) {
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
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method414(arg5[var28], true)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method414(arg5[var28], true)) {
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
        if (arg4 == 63) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CII[C)I")
    private static final int method404(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method414(arg0[var4], true)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg1 != 0) {
                field1197 = -263;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method414(arg3[var6], true); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method414(arg0[arg2 - 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CB)I")
    private static final int method405(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method414(arg2[var4], true)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg3 != -16) {
                field1191 = 219;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg2.length && method414(arg1[var6], true); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method414(arg2[arg0 + 1], true)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[[B[C[C)V")
    public static final void method406(int arg0, byte[][] arg1, char[] arg2, char[] arg3) {
        if (arg0 >= 0 || arg2.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg2.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg2.length && (var16 = method409(var15, arg2[var7], var14, -27578)) > 0) {
                        if (var16 == 1 && method417(-22882, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method417(-22882, var14) || method417(-22882, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method409(var15, arg2[var7 - 1], var14, -27578)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg2.length || !method415(var14, -49764)) {
                                break label167;
                            }
                            if (method414(var14, true) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method417(-22882, var14)) {
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
                    if (var5 - 1 < 0 || method414(arg3[var5 - 1], true) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method414(arg3[var6], true) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method414(arg3[var26], true) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method414(arg3[var26 + var28], true) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method414(arg3[var26 - 1], true) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method420(var27, field1202)) {
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
                        var19 = arg3[var5 - 1];
                    }
                    char var20 = ' ';
                    if (var6 < arg3.length) {
                        var20 = arg3[var6];
                    }
                    byte var21 = method410(var19, -47);
                    byte var22 = method410(var20, -47);
                    if (arg1 != null && method407(33123, arg1, var21, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method417(-22882, arg3[var33])) {
                            var30++;
                        } else if (method416(arg3[var33], 5)) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg3[var34] = '*';
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
        if (arg0 != 33123) {
            throw new NullPointerException();
        }
        int var4 = 0;
        if (arg1[var4][0] == arg2 && arg1[var4][1] == arg3) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg2 && arg1[var5][1] == arg3) {
            return true;
        }
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CICC)I")
    private static final int method408(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 7) {
            return field1191;
        } else if (arg0 == arg3) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCI)I")
    private static final int method409(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 != -27578) {
            return 1;
        } else if (arg1 == arg2) {
            return 1;
        } else {
            if (arg1 >= 'a' && arg1 <= 'm') {
                if (arg1 == 'a') {
                    if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                        if (arg2 == '/' && arg0 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'b') {
                    if (arg2 != '6' && arg2 != '8') {
                        if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
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
                    if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
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
                    if (arg2 == 'p' && arg0 == 'h') {
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
                        if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
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
                    if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'v') {
                    if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'w') {
                    if (arg2 == 'v' && arg0 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'x') {
                    if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
                    } else if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
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
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CI)B")
    private static final byte method410(char arg0, int arg1) {
        while (arg1 >= 0) {
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method411(char[] arg0, int arg1) {
        boolean var2 = false;
        if (arg1 != -29292) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method412(arg0, false, var4)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method414(arg0[var9], true) && !method415(arg0[var9], -49764)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method413(arg0, var7, 1);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZI)I")
    private static final int method412(char[] arg0, boolean arg1, int arg2) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = arg2; var4 < arg0.length && var4 >= 0; var4++) {
            if (arg0[var4] >= '0' && arg0[var4] <= '9') {
                return var4;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII)I")
    private static final int method413(char[] arg0, int arg1, int arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 < field1199 || arg2 > field1199) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method414(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return !method416(arg0, 5) && !method417(-22882, arg0);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CI)Z")
    private static final boolean method415(char arg0, int arg1) {
        if (arg1 != -49764) {
            field1195 = 354;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(CI)Z")
    private static final boolean method416(char arg0, int arg1) {
        if (arg1 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method417(int arg0, char arg1) {
        if (arg0 != -22882) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method418(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CZ)Z")
    private static final boolean method419(char arg0, boolean arg1) {
        if (!arg1) {
            field1190 = !field1190;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)Z")
    private static final boolean method420(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method417(-22882, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method421(935, arg0);
        if (field1202 != arg1) {
            throw new NullPointerException();
        }
        int var5 = 0;
        int var6 = field1203.length - 1;
        if (field1203[var5] == var4 || field1203[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1203[var7] == var4) {
                return true;
            }
            if (var4 < field1203[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "sc", name = "d", descriptor = "(I[C)I")
    public static final int method421(int arg0, char[] arg1) {
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
            field1188 = -143;
        }
        return var2;
    }
}
