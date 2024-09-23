import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("tc")
public class WordFilter {

    @OriginalMember(owner = "tc", name = "c", descriptor = "Z")
    private static boolean field1200 = true;

    @OriginalMember(owner = "tc", name = "d", descriptor = "Z")
    private static boolean field1201 = true;

    @OriginalMember(owner = "tc", name = "e", descriptor = "B")
    private static byte field1202 = 1;

    @OriginalMember(owner = "tc", name = "f", descriptor = "I")
    private static int field1203 = 47689;

    @OriginalMember(owner = "tc", name = "g", descriptor = "B")
    private static byte field1204 = 9;

    @OriginalMember(owner = "tc", name = "h", descriptor = "B")
    private static byte field1205 = 9;

    @OriginalMember(owner = "tc", name = "i", descriptor = "I")
    private static int field1206 = -32251;

    @OriginalMember(owner = "tc", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1213 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

    @OriginalMember(owner = "tc", name = "b", descriptor = "I")
    private static int field1199;

    @OriginalMember(owner = "tc", name = "a", descriptor = "Z")
    private static boolean field1198;

    @OriginalMember(owner = "tc", name = "q", descriptor = "Z")
    public static boolean field1214;

    @OriginalMember(owner = "tc", name = "j", descriptor = "[I")
    private static int[] field1207;

    @OriginalMember(owner = "tc", name = "o", descriptor = "[I")
    private static int[] field1212;

    @OriginalMember(owner = "tc", name = "k", descriptor = "[[C")
    private static char[][] field1208;

    @OriginalMember(owner = "tc", name = "m", descriptor = "[[C")
    private static char[][] field1210;

    @OriginalMember(owner = "tc", name = "n", descriptor = "[[C")
    private static char[][] field1211;

    @OriginalMember(owner = "tc", name = "l", descriptor = "[[[B")
    private static byte[][][] field1209;

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Lyb;)V")
    public static final void method388(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method298("fragmentsenc.txt", null), true);
        Packet var2 = new Packet(arg0.method298("badenc.txt", null), true);
        Packet var3 = new Packet(arg0.method298("domainenc.txt", null), true);
        Packet var4 = new Packet(arg0.method298("tldlist.txt", null), true);
        method389(var1, var2, var3, var4);
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method389(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method391(arg1, false);
        method392(field1202, arg2);
        method393(arg0, 0);
        method390((byte) 97, arg3);
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(BLmb;)V")
    private static final void method390(byte arg0, Packet arg1) {
        int var2 = arg1.method233();
        field1211 = new char[var2][];
        field1212 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1212[var3] = arg1.method228();
            char[] var4 = new char[arg1.method228()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method228();
            }
            field1211[var3] = var4;
        }
        if (arg0 == 97) {
            ;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Lmb;Z)V")
    private static final void method391(Packet arg0, boolean arg1) {
        int var2 = arg0.method233();
        field1208 = new char[var2][];
        if (!arg1) {
            field1209 = new byte[var2][][];
            method394(field1209, arg0, field1208, 47689);
        }
    }

    @OriginalMember(owner = "tc", name = "b", descriptor = "(BLmb;)V")
    private static final void method392(byte arg0, Packet arg1) {
        int var2 = arg1.method233();
        field1210 = new char[var2][];
        if (arg0 == 1) {
            method395(arg1, field1210, field1204);
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Lmb;I)V")
    private static final void method393(Packet arg0, int arg1) {
        if (arg1 == 0) {
            field1207 = new int[arg0.method233()];
            for (int var2 = 0; var2 < field1207.length; var2++) {
                field1207[var2] = arg0.method230();
            }
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([[[BLmb;[[CI)V")
    private static final void method394(byte[][][] arg0, Packet arg1, char[][] arg2, int arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var6 = new char[arg1.method228()];
            for (int var7 = 0; var7 < var6.length; var7++) {
                var6[var7] = (char) arg1.method228();
            }
            arg2[var4] = var6;
            byte[][] var8 = new byte[arg1.method228()][2];
            for (int var9 = 0; var9 < var8.length; var9++) {
                var8[var9][0] = (byte) arg1.method228();
                var8[var9][1] = (byte) arg1.method228();
            }
            if (var8.length > 0) {
                arg0[var4] = var8;
            }
        }
        if (field1203 != arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Lmb;[[CB)V")
    private static final void method395(Packet arg0, char[][] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method228()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method228();
            }
            arg1[var3] = var4;
        }
        if (arg2 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CB)V")
    private static final void method396(char[] arg0, byte arg1) {
        if (arg1 != 0) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method397(arg0[var3], 0)) {
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
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(CI)Z")
    private static final boolean method397(char arg0, int arg1) {
        if (arg1 != 0) {
            field1200 = !field1200;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method398(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method396(var4, (byte) 0);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        if (arg0 != -1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        String var8 = var5.toLowerCase();
        method406(20382, var6);
        method401((byte) -116, var6);
        method402(false, var6);
        method415(112, var6);
        for (int var9 = 0; var9 < field1213.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1213[var9], var12 + 1)) != -1) {
                char[] var13 = field1213[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method399(var6, 5, var5.toCharArray());
        method400(-351, var6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CI[C)V")
    private static final void method399(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method423(-46646, arg2[var3])) {
                arg0[var3] = arg2[var3];
            }
        }
        if (arg1 < 5 || arg1 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(I[C)V")
    private static final void method400(int arg0, char[] arg1) {
        boolean var2 = true;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method420(681, var4)) {
                var2 = true;
            } else if (var2) {
                if (method422((byte) -10, var4)) {
                    var2 = false;
                }
            } else if (method423(-46646, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(B[C)V")
    private static final void method401(byte arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1208.length - 1; var3 >= 0; var3--) {
                method410(field1209[var3], field1208[var3], 0, arg1);
            }
        }
        if (arg0 != -116) {
            field1201 = !field1201;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Z[C)V")
    private static final void method402(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method410(null, var3, 0, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg0) {
            field1203 = -422;
        }
        method410(null, var5, 0, var4);
        for (int var6 = field1210.length - 1; var6 >= 0; var6--) {
            method403(field1210[var6], arg1, var2, var4, true);
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([C[C[C[CZ)V")
    private static final void method403(char[] arg0, char[] arg1, char[] arg2, char[] arg3, boolean arg4) {
        if (!arg4) {
            field1198 = !field1198;
        }
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg1.length - arg0.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label66: while (true) {
                while (true) {
                    if (var7 >= arg1.length) {
                        break label66;
                    }
                    boolean var10 = false;
                    char var11 = arg1[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg1.length) {
                        var12 = arg1[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg0.length && (var13 = method412(var11, var12, arg0[var8], 216)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label66;
                        }
                        int var14;
                        if ((var14 = method412(var11, var12, arg0[var8 - 1], 216)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method418(-32251, var11)) {
                                break label66;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method404(arg2, true, var6, arg1);
                int var17 = method405(var7 - 1, arg1, arg3, true);
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

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CZI[C)I")
    private static final int method404(char[] arg0, boolean arg1, int arg2, char[] arg3) {
        if (!arg1) {
            field1203 = 306;
        }
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method418(-32251, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method418(-32251, arg0[var6]); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method418(-32251, arg3[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(I[C[CZ)I")
    private static final int method405(int arg0, char[] arg1, char[] arg2, boolean arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method418(-32251, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (!arg3) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg0 + 1; var7 < arg1.length && method418(-32251, arg2[var7]); var7++) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method418(-32251, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "tc", name = "b", descriptor = "(I[C)V")
    private static final void method406(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method410(null, var3, 0, var2);
        if (arg0 != 20382) {
            field1203 = 394;
        }
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method410(null, var5, 0, var4);
        for (int var6 = 0; var6 < field1211.length; var6++) {
            method407(var2, field1212[var6], arg1, field1205, field1211[var6], var4);
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CI[CB[C[C)V")
    private static final void method407(char[] arg0, int arg1, char[] arg2, byte arg3, char[] arg4, char[] arg5) {
        if (field1205 != arg3) {
            field1203 = 419;
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
                    if (var9 < arg4.length && (var14 = method412(var12, var13, arg4[var9], 216)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method412(var12, var13, arg4[var9 - 1], 216)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method418(-32251, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method408(arg0, var7, (byte) -39, arg2);
                int var18 = method409(true, arg5, arg2, var8 - 1);
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
                                if (method418(-32251, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method418(-32251, arg2[var24])) {
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
                        for (int var28 = var20 + 1; var28 < arg2.length; var28++) {
                            if (var27) {
                                if (method418(-32251, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method418(-32251, arg2[var28])) {
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

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CIB[C)I")
    private static final int method408(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method418(-32251, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg2 != -39) {
                field1203 = -179;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method418(-32251, arg0[var6]); var6--) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method418(-32251, arg3[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Z[C[CI)I")
    private static final int method409(boolean arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method418(-32251, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg2.length && method418(-32251, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (!arg0) {
                return field1199;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method418(-32251, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([[B[CI[C)V")
    public static final void method410(byte[][] arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label172: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label172;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method413(var15, var14, arg1[var7], (byte) 6)) > 0) {
                        if (var16 == 1 && method421(var14, (byte) 75)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method421(var14, (byte) 75) || method421(var15, (byte) 75))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method413(var15, var14, arg1[var7 - 1], (byte) 6)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method419(574, var14)) {
                                break label172;
                            }
                            if (method418(-32251, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method421(var14, (byte) 75)) {
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
            if (var7 >= arg1.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method418(-32251, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method418(-32251, arg3[var6]) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method418(-32251, arg3[var26]) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method418(-32251, arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method418(-32251, arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method424(var27, 23892)) {
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
                    byte var21 = method414(var19, -232);
                    byte var22 = method414(var20, -232);
                    if (arg0 != null && method411(var21, false, arg0, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method421(arg3[var33], (byte) 75)) {
                            var30++;
                        } else if (method420(681, arg3[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 + 1 - var32;
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
        if (arg2 != 0) {
            field1198 = !field1198;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(BZ[[BB)Z")
    private static final boolean method411(byte arg0, boolean arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg1) {
            throw new NullPointerException();
        } else if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
            return true;
        } else {
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
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(CCCI)I")
    private static final int method412(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 <= 0) {
            return field1199;
        } else if (arg0 == arg2) {
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

    @OriginalMember(owner = "tc", name = "a", descriptor = "(CCCB)I")
    private static final int method413(char arg0, char arg1, char arg2, byte arg3) {
        if (arg3 == 6) {
            boolean var4 = false;
        } else {
            field1203 = 431;
        }
        if (arg1 == arg2) {
            return 1;
        }
        if (arg2 >= 'a' && arg2 <= 'm') {
            if (arg2 == 'a') {
                if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                    if (arg1 == '/' && arg0 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'b') {
                if (arg1 != '6' && arg1 != '8') {
                    if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg2 == 'c') {
                if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'd') {
                if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'e') {
                if (arg1 != '3' && arg1 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'f') {
                if (arg1 == 'p' && arg0 == 'h') {
                    return 2;
                }
                if (arg1 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'g') {
                if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'h') {
                if (arg1 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg2 == 'i') {
                if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                if (arg1 != '0' && arg1 != '*') {
                    if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
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
                if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 't') {
                if (arg1 != '7' && arg1 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'u') {
                if (arg1 == 'v') {
                    return 1;
                }
                if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'v') {
                if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'w') {
                if (arg1 == 'v' && arg0 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'x') {
                if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
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
                if (arg1 == 'o' || arg1 == 'O') {
                    return 1;
                } else if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg2 == '1') {
                return arg1 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg2 == ',') {
            return arg1 == '.' ? 1 : 0;
        } else if (arg2 == '.') {
            return arg1 == ',' ? 1 : 0;
        } else if (arg2 == '!') {
            return arg1 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "tc", name = "b", descriptor = "(CI)B")
    private static final byte method414(char arg0, int arg1) {
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

    @OriginalMember(owner = "tc", name = "c", descriptor = "(I[C)V")
    private static final void method415(int arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 41 / arg0;
        while (true) {
            do {
                int var7;
                if ((var7 = method416(true, arg1, var3)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method418(-32251, arg1[var9]) && !method419(574, arg1[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var7;
                }
                var3 = method417(arg1, var7, false);
                int var10 = 0;
                for (int var11 = var7; var11 < var3; var11++) {
                    var10 = var10 * 10 + arg1[var11] - 48;
                }
                if (var10 <= 255 && var3 - var7 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var12 = var5; var12 < var3; var12++) {
                arg1[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(Z[CI)I")
    private static final int method416(boolean arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return arg0 ? -1 : 3;
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CIZ)I")
    private static final int method417(char[] arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 4;
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

    @OriginalMember(owner = "tc", name = "a", descriptor = "(IC)Z")
    private static final boolean method418(int arg0, char arg1) {
        if (field1206 != arg0) {
            throw new NullPointerException();
        }
        return !method420(681, arg1) && !method421(arg1, (byte) 75);
    }

    @OriginalMember(owner = "tc", name = "b", descriptor = "(IC)Z")
    private static final boolean method419(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "tc", name = "c", descriptor = "(IC)Z")
    private static final boolean method420(int arg0, char arg1) {
        int var2 = 80 / arg0;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(CB)Z")
    private static final boolean method421(char arg0, byte arg1) {
        if (arg1 != 75) {
            field1203 = -227;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(BC)Z")
    private static final boolean method422(byte arg0, char arg1) {
        if (arg0 != -10) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "tc", name = "d", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        if (arg0 != -46646) {
            field1198 = !field1198;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "([CI)Z")
    private static final boolean method424(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 != 23892) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method421(arg0[var3], (byte) 75) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method425(-21, arg0);
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

    @OriginalMember(owner = "tc", name = "d", descriptor = "(I[C)I")
    public static final int method425(int arg0, char[] arg1) {
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
        if (arg0 >= 0) {
            field1198 = !field1198;
        }
        return var2;
    }
}
