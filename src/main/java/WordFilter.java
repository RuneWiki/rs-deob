import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "B")
    private static byte field1164 = -21;

    @OriginalMember(owner = "sc", name = "b", descriptor = "I")
    private static int field1165 = 640;

    @OriginalMember(owner = "sc", name = "c", descriptor = "Z")
    private static boolean field1166 = true;

    @OriginalMember(owner = "sc", name = "d", descriptor = "I")
    private static int field1167 = 5;

    @OriginalMember(owner = "sc", name = "e", descriptor = "B")
    private static byte field1168 = -61;

    @OriginalMember(owner = "sc", name = "g", descriptor = "I")
    private static int field1170 = 7;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1171 = 7;

    @OriginalMember(owner = "sc", name = "i", descriptor = "B")
    private static byte field1172 = -128;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1179 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

    @OriginalMember(owner = "sc", name = "q", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "sc", name = "f", descriptor = "Z")
    private static boolean field1169;

    @OriginalMember(owner = "sc", name = "j", descriptor = "[I")
    private static int[] field1173;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[I")
    private static int[] field1178;

    @OriginalMember(owner = "sc", name = "k", descriptor = "[[C")
    private static char[][] field1174;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[[C")
    private static char[][] field1176;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[C")
    private static char[][] field1177;

    @OriginalMember(owner = "sc", name = "l", descriptor = "[[[B")
    private static byte[][][] field1175;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lyb;)V")
    public static final void method393(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method309("fragmentsenc.txt", null), 337);
        Packet var2 = new Packet(arg0.method309("badenc.txt", null), 337);
        Packet var3 = new Packet(arg0.method309("domainenc.txt", null), 337);
        Packet var4 = new Packet(arg0.method309("tldlist.txt", null), 337);
        method394(var1, var2, var3, var4);
        if (Linkable.field375) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method394(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method396(arg1, 466);
        method397(arg2, (byte) 126);
        method398(182, arg0);
        method395(640, arg3);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILmb;)V")
    private static final void method395(int arg0, Packet arg1) {
        int var2 = arg1.method244();
        field1177 = new char[var2][];
        field1178 = new int[var2];
        int var3 = 57 / arg0;
        for (int var4 = 0; var4 < var2; var4++) {
            field1178[var4] = arg1.method239();
            char[] var5 = new char[arg1.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method239();
            }
            field1177[var4] = var5;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;I)V")
    private static final void method396(Packet arg0, int arg1) {
        int var2 = arg0.method244();
        field1174 = new char[var2][];
        field1175 = new byte[var2][][];
        if (arg1 > 0) {
            method399(arg0, field1175, field1174, 0);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;B)V")
    private static final void method397(Packet arg0, byte arg1) {
        int var2 = arg0.method244();
        if (arg1 == 126) {
            field1176 = new char[var2][];
            method400(true, field1176, arg0);
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILmb;)V")
    private static final void method398(int arg0, Packet arg1) {
        field1173 = new int[arg1.method244()];
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < field1173.length; var3++) {
            field1173[var3] = arg1.method241();
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;[[[B[[CI)V")
    private static final void method399(Packet arg0, byte[][][] arg1, char[][] arg2, int arg3) {
        if (arg3 != 0) {
            return;
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method239();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method239()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method239();
                var7[var8][1] = (byte) arg0.method239();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Z[[CLmb;)V")
    private static final void method400(boolean arg0, char[][] arg1, Packet arg2) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg2.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method239();
            }
            arg1[var4] = var5;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)V")
    private static final void method401(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method402(arg1[var3], true)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg0 == 7137) {
            for (int var4 = var2; var4 < arg1.length; var4++) {
                arg1[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZ)Z")
    private static final boolean method402(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method403(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method401(7137, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method411(field1168, var6);
        method406(-11848, var6);
        method407(var6, 236);
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        method420(var6, 0);
        for (int var8 = 0; var8 < field1179.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1179[var8], var11 + 1)) != -1) {
                char[] var12 = field1179[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method404(var5.toCharArray(), 350, var6);
        method405(-613, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C)V")
    private static final void method404(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method428((byte) 0, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
        int var4 = 65 / arg1;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(I[C)V")
    private static final void method405(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method425(false, var5)) {
                var3 = true;
            } else if (var3) {
                if (method427(599, var5)) {
                    var3 = false;
                }
            } else if (method428((byte) 0, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(I[C)V")
    private static final void method406(int arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1174.length - 1; var3 >= 0; var3--) {
                method415(0, field1174[var3], field1175[var3], arg1);
            }
        }
        if (arg0 != -11848) {
            field1166 = !field1166;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method407(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        int var4 = 16 / arg1;
        method415(0, var3, null, var2);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method415(0, var6, null, var5);
        for (int var7 = field1176.length - 1; var7 >= 0; var7--) {
            method408(arg0, (byte) 7, var2, var5, field1176[var7]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB[C[C[C)V")
    private static final void method408(char[] arg0, byte arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1 != 7) {
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
                    if (var9 < arg4.length && (var14 = method417(arg4[var9], true, var12, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method417(arg4[var9 - 1], true, var12, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method423(var12, (byte) 3)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method409(arg2, var7, arg0, 0);
                int var18 = method410(var8 - 1, arg0, arg3, 5);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[CI)I")
    private static final int method409(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == 0) {
            return 2;
        }
        for (int var5 = arg1 - 1; var5 >= 0 && method423(arg2[var5], (byte) 3); var5--) {
            if (arg2[var5] == '@') {
                return 3;
            }
        }
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method423(arg0[var7], (byte) 3); var7--) {
            if (arg0[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method423(arg2[arg1 - 1], (byte) 3)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[CI)I")
    private static final int method410(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method423(arg1[var4], (byte) 3)) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 >= field1167 && arg3 <= field1167) {
                for (int var6 = arg0 + 1; var6 < arg1.length && method423(arg2[var6], (byte) 3); var6++) {
                    if (arg2[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method423(arg1[arg0 + 1], (byte) 3)) {
                    return 1;
                }
                return 0;
            }
            return 4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)V")
    private static final void method411(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method415(0, var3, null, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method415(0, var5, null, var4);
        for (int var6 = 0; var6 < field1177.length; var6++) {
            method412(var4, true, field1177[var6], var2, field1178[var6], arg1);
        }
        if (arg0 == -61) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ[C[CI[C)V")
    private static final void method412(char[] arg0, boolean arg1, char[] arg2, char[] arg3, int arg4, char[] arg5) {
        if (arg2.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        if (!arg1) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg2.length; var7 += var10) {
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
                    if (var9 < arg2.length && (var14 = method417(arg2[var9], true, var12, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method417(arg2[var9 - 1], true, var12, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg2.length || !method423(var12, (byte) 3)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg2.length) {
                boolean var16 = false;
                int var17 = method413(arg3, arg5, var7, false);
                int var18 = method414(field1170, var8 - 1, arg0, arg5);
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
                                    if (arg3[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg3[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method423(arg5[var24], (byte) 3)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method423(arg5[var24], (byte) 3)) {
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
                                if (method423(arg5[var28], (byte) 3)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method423(arg5[var28], (byte) 3)) {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CIZ)I")
    private static final int method413(char[] arg0, char[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 == 0) {
            return 2;
        }
        int var5 = arg2 - 1;
        while (true) {
            if (var5 >= 0 && method423(arg1[var5], (byte) 3)) {
                if (arg1[var5] != ',' && arg1[var5] != '.') {
                    var5--;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg2 - 1; var7 >= 0 && method423(arg0[var7], (byte) 3); var7--) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method423(arg1[arg2 - 1], (byte) 3)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(II[C[C)I")
    private static final int method414(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 < field1171 || arg0 > field1171) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var5 = arg1 + 1;
        while (true) {
            if (var5 < arg3.length && method423(arg3[var5], (byte) 3)) {
                if (arg3[var5] != '\\' && arg3[var5] != '/') {
                    var5++;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg3.length && method423(arg2[var7], (byte) 3); var7++) {
                if (arg2[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method423(arg3[arg1 + 1], (byte) 3)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C[[B[C)V")
    public static final void method415(int arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        if (arg0 != 0) {
            return;
        }
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label166: while (true) {
                while (true) {
                    if (var6 >= arg3.length || var11 && var12) {
                        break label166;
                    }
                    boolean var13 = false;
                    char var14 = arg3[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg3.length) {
                        var15 = arg3[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method418(var15, var14, arg1[var7], false)) > 0) {
                        if (var16 == 1 && method426(-454, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method426(-454, var14) || method426(-454, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label166;
                        }
                        int var17;
                        if ((var17 = method418(var15, var14, arg1[var7 - 1], false)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method424(var14, (byte) 7)) {
                                break label166;
                            }
                            if (method423(var14, (byte) 3) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method426(-454, var14)) {
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
                    if (var5 - 1 < 0 || method423(arg3[var5 - 1], (byte) 3) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method423(arg3[var6], (byte) 3) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method423(arg3[var26], (byte) 3) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method423(arg3[var26 + var28], (byte) 3) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method423(arg3[var26 - 1], (byte) 3) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method429(var27, (byte) -128)) {
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
                    byte var21 = method419(var19, (byte) 75);
                    byte var22 = method419(var20, (byte) 75);
                    if (arg2 != null && method416(arg2, var21, false, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method426(-454, arg3[var33])) {
                            var30++;
                        } else if (method425(false, arg3[var33])) {
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
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[BBZB)Z")
    private static final boolean method416(byte[][] arg0, byte arg1, boolean arg2, byte arg3) {
        int var4 = 0;
        if (arg0[var4][0] == arg1 && arg0[var4][1] == arg3) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg2) {
            field1167 = -451;
        }
        if (arg0[var5][0] == arg1 && arg0[var5][1] == arg3) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg0[var6][0] == arg1 && arg0[var6][1] == arg3) {
                return true;
            }
            if (arg1 < arg0[var6][0] || arg0[var6][0] == arg1 && arg3 < arg0[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZCC)I")
    private static final int method417(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg2) {
            return 1;
        } else if (arg0 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg2 == '(' && arg3 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg2 == '€') {
            return 1;
        } else if (arg0 == 's' && arg2 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg2 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCZ)I")
    private static final int method418(char arg0, char arg1, char arg2, boolean arg3) {
        if (arg3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
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
                    if (arg1 == '(' && arg0 == ')' || arg1 == '[' && arg0 == ']' || arg1 == '{' && arg0 == '}' || arg1 == '<' && arg0 == '>') {
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
                if (arg1 == '\\' && arg0 == '/' || arg1 == '\\' && arg0 == '|' || arg1 == '|' && arg0 == '/') {
                    return 2;
                }
                return 0;
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)B")
    private static final byte method419(char arg0, byte arg1) {
        if (arg1 != 75) {
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
    private static final void method420(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        if (arg1 != 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method421(arg0, var3, 0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method423(arg0[var8], (byte) 3) && !method424(arg0[var8], (byte) 7)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method422(arg0, var6, 699);
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
    private static final int method421(char[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return field1167;
        }
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CII)I")
    private static final int method422(char[] arg0, int arg1, int arg2) {
        int var3 = 39 / arg2;
        int var4 = arg1;
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CB)Z")
    private static final boolean method423(char arg0, byte arg1) {
        if (arg1 != 3) {
            field1169 = !field1169;
        }
        return !method425(false, arg0) && !method426(-454, arg0);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(CB)Z")
    private static final boolean method424(char arg0, byte arg1) {
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ZC)Z")
    private static final boolean method425(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method426(int arg0, char arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method427(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1167 = -300;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BC)Z")
    private static final boolean method428(byte arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)Z")
    private static final boolean method429(char[] arg0, byte arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method426(-454, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method430((byte) 0, arg0);
        if (field1172 != arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        int var7 = field1173.length - 1;
        if (field1173[var6] == var4 || field1173[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1173[var8] == var4) {
                return true;
            }
            if (var4 < field1173[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(B[C)I")
    public static final int method430(byte arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[arg1.length - var4 - 1];
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
