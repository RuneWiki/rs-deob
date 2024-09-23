import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sc")
public class WordFilter {

    @OriginalMember(owner = "sc", name = "a", descriptor = "Z")
    private static boolean field1203 = true;

    @OriginalMember(owner = "sc", name = "c", descriptor = "I")
    private static int field1205 = 46;

    @OriginalMember(owner = "sc", name = "d", descriptor = "B")
    private static byte field1206 = -14;

    @OriginalMember(owner = "sc", name = "f", descriptor = "I")
    private static int field1208 = 2;

    @OriginalMember(owner = "sc", name = "g", descriptor = "B")
    private static byte field1209 = 7;

    @OriginalMember(owner = "sc", name = "h", descriptor = "I")
    private static int field1210 = -399;

    @OriginalMember(owner = "sc", name = "i", descriptor = "I")
    private static int field1211 = 6;

    @OriginalMember(owner = "sc", name = "j", descriptor = "B")
    private static byte field1212 = 3;

    @OriginalMember(owner = "sc", name = "k", descriptor = "Z")
    private static boolean field1213 = true;

    @OriginalMember(owner = "sc", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field1221 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

    @OriginalMember(owner = "sc", name = "e", descriptor = "I")
    private static int field1207;

    @OriginalMember(owner = "sc", name = "t", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "sc", name = "b", descriptor = "Z")
    private static boolean field1204;

    @OriginalMember(owner = "sc", name = "l", descriptor = "Z")
    private static boolean field1214;

    @OriginalMember(owner = "sc", name = "m", descriptor = "[I")
    private static int[] field1215;

    @OriginalMember(owner = "sc", name = "r", descriptor = "[I")
    private static int[] field1220;

    @OriginalMember(owner = "sc", name = "n", descriptor = "[[C")
    private static char[][] field1216;

    @OriginalMember(owner = "sc", name = "p", descriptor = "[[C")
    private static char[][] field1218;

    @OriginalMember(owner = "sc", name = "q", descriptor = "[[C")
    private static char[][] field1219;

    @OriginalMember(owner = "sc", name = "o", descriptor = "[[[B")
    private static byte[][][] field1217;

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lyb;)V")
    public static final void method393(Jagfile arg0) {
        Packet var1 = new Packet(45427, arg0.method309("fragmentsenc.txt", null));
        Packet var2 = new Packet(45427, arg0.method309("badenc.txt", null));
        Packet var3 = new Packet(45427, arg0.method309("domainenc.txt", null));
        Packet var4 = new Packet(45427, arg0.method309("tldlist.txt", null));
        method394(var1, var2, var3, var4);
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;Lmb;Lmb;Lmb;)V")
    private static final void method394(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method396(arg1, (byte) -14);
        method397(0, arg2);
        method398(field1207, arg0);
        method395((byte) 107, arg3);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(BLmb;)V")
    private static final void method395(byte arg0, Packet arg1) {
        int var2 = arg1.method244();
        field1219 = new char[var2][];
        field1220 = new int[var2];
        if (arg0 != 107) {
            field1205 = 123;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field1220[var3] = arg1.method239();
            char[] var4 = new char[arg1.method239()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method239();
            }
            field1219[var3] = var4;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;B)V")
    private static final void method396(Packet arg0, byte arg1) {
        if (field1206 != arg1) {
            field1214 = !field1214;
        }
        int var2 = arg0.method244();
        field1216 = new char[var2][];
        field1217 = new byte[var2][][];
        method399(field1217, arg0, field1216, (byte) 84);
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILmb;)V")
    private static final void method397(int arg0, Packet arg1) {
        int var2 = arg1.method244();
        if (arg0 == 0) {
            field1218 = new char[var2][];
            method400(arg1, field1218, -41095);
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(ILmb;)V")
    private static final void method398(int arg0, Packet arg1) {
        field1215 = new int[arg1.method244()];
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < field1215.length; var3++) {
            field1215[var3] = arg1.method241();
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[[BLmb;[[CB)V")
    private static final void method399(byte[][][] arg0, Packet arg1, char[][] arg2, byte arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg1.method239()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method239();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg1.method239()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method239();
                var7[var8][1] = (byte) arg1.method239();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
        if (arg3 == 84) {
            ;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(Lmb;[[CI)V")
    private static final void method400(Packet arg0, char[][] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg0.method239()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method239();
            }
            arg1[var3] = var4;
        }
        if (arg2 != -41095) {
            field1214 = !field1214;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CZ)V")
    private static final void method401(char[] arg0, boolean arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method402(658, arg0[var3])) {
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
        if (!arg1) {
            field1214 = !field1214;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(IC)Z")
    private static final boolean method402(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method403(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method401(var4, true);
        if (arg0 != -39648) {
            field1213 = !field1213;
        }
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method411(var6, 9);
        method406(var6, (byte) 1);
        method407(var6, 388);
        method420(var6, (byte) 125);
        for (int var8 = 0; var8 < field1221.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1221[var8], var11 + 1)) != -1) {
                char[] var12 = field1221[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method404(var6, field1208, var5.toCharArray());
        method405(var6, 22829);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[C)V")
    private static final void method404(char[] arg0, int arg1, char[] arg2) {
        if (arg1 < field1208 || arg1 > field1208) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            if (arg0[var4] != '*' && method428(0, arg2[var4])) {
                arg0[var4] = arg2[var4];
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI)V")
    private static final void method405(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method425(false, var4)) {
                var2 = true;
            } else if (var2) {
                if (method427(var4, (byte) 75)) {
                    var2 = false;
                }
            } else if (method428(0, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1 != 22829) {
            field1214 = !field1214;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB)V")
    private static final void method406(char[] arg0, byte arg1) {
        if (arg1 != 1) {
            return;
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1216.length - 1; var4 >= 0; var4--) {
                method415(field1217[var4], field1216[var4], arg0, 6);
            }
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CI)V")
    private static final void method407(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != 388) {
            field1203 = !field1203;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method415(null, var3, var2, 6);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method415(null, var5, var4, 6);
        for (int var6 = field1218.length - 1; var6 >= 0; var6--) {
            method408(var2, (byte) 7, arg0, var4, field1218[var6]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CB[C[C[C)V")
    private static final void method408(char[] arg0, byte arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        if (field1209 == arg1) {
            boolean var6 = false;
        } else {
            field1204 = !field1204;
        }
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg4.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label67: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label67;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method417(var13, arg4[var9], var12, -535)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label67;
                        }
                        int var15;
                        if ((var15 = method417(var13, arg4[var9 - 1], var12, -535)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method423(-797, var12)) {
                                break label67;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method409(arg2, var7, 10090, arg0);
                int var18 = method410(arg3, -399, arg2, var8 - 1);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg2[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CII[C)I")
    private static final int method409(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method423(-797, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method423(-797, arg3[var6]); var6--) {
            if (arg3[var6] == '*') {
                var5++;
            }
        }
        if (arg2 != 10090) {
            field1214 = !field1214;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method423(-797, arg0[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([CI[CI)I")
    private static final int method410(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 >= 0) {
            field1203 = !field1203;
        }
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method423(-797, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg2.length && method423(-797, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method423(-797, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "([CI)V")
    private static final void method411(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method415(null, var3, var2, 6);
        char[] var4 = (char[]) arg0.clone();
        if (arg1 < 9 || arg1 > 9) {
            return;
        }
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method415(null, var5, var4, 6);
        for (int var6 = 0; var6 < field1219.length; var6++) {
            method412(var2, arg0, 0, field1220[var6], var4, field1219[var6]);
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([C[CII[C[C)V")
    private static final void method412(char[] arg0, char[] arg1, int arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg5.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        if (arg2 != 0) {
            return;
        }
        int var10;
        for (int var7 = 0; var7 <= arg1.length - arg5.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg1.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg1[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg1.length) {
                        var13 = arg1[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg5.length && (var14 = method417(var13, arg5[var9], var12, -535)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method417(var13, arg5[var9 - 1], var12, -535)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg5.length || !method423(-797, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg5.length) {
                boolean var16 = false;
                int var17 = method413(34700, arg1, var7, arg0);
                int var18 = method414(arg4, var8 - 1, 619, arg1);
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
                                if (method423(-797, arg1[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method423(-797, arg1[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg1.length; var26++) {
                                if (var25) {
                                    if (arg4[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg4[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg1.length; var28++) {
                            if (var27) {
                                if (method423(-797, arg1[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method423(-797, arg1[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg1[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI[C)I")
    private static final int method413(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method423(-797, arg1[var4])) {
                if (arg1[var4] != ',' && arg1[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 - 1; var6 >= 0 && method423(-797, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 != 34700) {
                field1205 = -117;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method423(-797, arg1[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CII[C)I")
    private static final int method414(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg3.length && method423(-797, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 41 / arg2;
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg3.length && method423(-797, arg0[var7]); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method423(-797, arg3[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[B[C[CI)V")
    public static final void method415(byte[][] arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg1.length > arg2.length) {
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
            label170: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label170;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method418(var14, false, var15, arg1[var7])) > 0) {
                        if (var16 == 1 && method426(34895, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method426(34895, var14) || method426(34895, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label170;
                        }
                        int var17;
                        if ((var17 = method418(var14, false, var15, arg1[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method424(5, var14)) {
                                break label170;
                            }
                            if (method423(-797, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method426(34895, var14)) {
                                var12 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label170;
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
                    if (var5 - 1 < 0 || method423(-797, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method423(-797, arg2[var6]) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method423(-797, arg2[var26]) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method423(-797, arg2[var26 + var28]) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method423(-797, arg2[var26 - 1]) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method429((byte) 6, var27)) {
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
                    byte var21 = method419(var19, field1212);
                    byte var22 = method419(var20, field1212);
                    if (arg0 != null && method416(arg0, var22, var21, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method426(34895, arg2[var33])) {
                            var30++;
                        } else if (method425(false, arg2[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 + 1 - var32;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg2[var34] = '*';
                        }
                    }
                }
            }
        }
        if (arg3 < field1211 || arg3 > field1211) {
            field1208 = 101;
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "([[BBBI)Z")
    private static final boolean method416(byte[][] arg0, byte arg1, byte arg2, int arg3) {
        int var4 = 0;
        if (arg3 != 0) {
            field1203 = !field1203;
        }
        if (arg0[var4][0] == arg2 && arg0[var4][1] == arg1) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg0[var5][0] == arg2 && arg0[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg0[var6][0] == arg2 && arg0[var6][1] == arg1) {
                return true;
            }
            if (arg2 < arg0[var6][0] || arg0[var6][0] == arg2 && arg1 < arg0[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CCCI)I")
    private static final int method417(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 >= 0) {
            return 0;
        } else if (arg1 == arg2) {
            return 1;
        } else if (arg1 == 'o' && arg2 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg2 == '(' && arg0 == ')') {
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CZCC)I")
    private static final int method418(char arg0, boolean arg1, char arg2, char arg3) {
        if (arg1) {
            return 2;
        } else if (arg0 == arg3) {
            return 1;
        } else {
            if (arg3 >= 'a' && arg3 <= 'm') {
                if (arg3 == 'a') {
                    if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                        if (arg0 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'b') {
                    if (arg0 != '6' && arg0 != '8') {
                        if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg3 == 'c') {
                    if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'd') {
                    if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'e') {
                    if (arg0 != '3' && arg0 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'f') {
                    if (arg0 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg0 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg3 == 'g') {
                    if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'h') {
                    if (arg0 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg3 == 'i') {
                    if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'j') {
                    return 0;
                }
                if (arg3 == 'k') {
                    return 0;
                }
                if (arg3 == 'l') {
                    if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'm') {
                    return 0;
                }
            }
            if (arg3 >= 'n' && arg3 <= 'z') {
                if (arg3 == 'n') {
                    return 0;
                }
                if (arg3 == 'o') {
                    if (arg0 != '0' && arg0 != '*') {
                        if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg3 == 'p') {
                    return 0;
                }
                if (arg3 == 'q') {
                    return 0;
                }
                if (arg3 == 'r') {
                    return 0;
                }
                if (arg3 == 's') {
                    if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 't') {
                    if (arg0 != '7' && arg0 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'u') {
                    if (arg0 == 'v') {
                        return 1;
                    }
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'v') {
                    if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'w') {
                    if (arg0 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg3 == 'x') {
                    if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'y') {
                    return 0;
                }
                if (arg3 == 'z') {
                    return 0;
                }
            }
            if (arg3 >= '0' && arg3 <= '9') {
                if (arg3 == '0') {
                    if (arg0 == 'o' || arg0 == 'O') {
                        return 1;
                    } else if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg3 == '1') {
                    return arg0 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg3 == ',') {
                return arg0 == '.' ? 1 : 0;
            } else if (arg3 == '.') {
                return arg0 == ',' ? 1 : 0;
            } else if (arg3 == '!') {
                return arg0 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(CB)B")
    private static final byte method419(char arg0, byte arg1) {
        if (field1212 != arg1) {
            field1208 = -80;
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

    @OriginalMember(owner = "sc", name = "b", descriptor = "([CB)V")
    private static final void method420(char[] arg0, byte arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 != 125) {
            field1208 = 202;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method421(var3, arg0, (byte) 104)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method423(-797, arg0[var8]) && !method424(5, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method422(var6, arg0, -34211);
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

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CB)I")
    private static final int method421(int arg0, char[] arg1, byte arg2) {
        if (arg2 != 104) {
            return 0;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[CI)I")
    private static final int method422(int arg0, char[] arg1, int arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 != -34211) {
                field1204 = !field1204;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(IC)Z")
    private static final boolean method423(int arg0, char arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method425(false, arg1) && !method426(34895, arg1);
    }

    @OriginalMember(owner = "sc", name = "c", descriptor = "(IC)Z")
    private static final boolean method424(int arg0, char arg1) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
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

    @OriginalMember(owner = "sc", name = "d", descriptor = "(IC)Z")
    private static final boolean method426(int arg0, char arg1) {
        if (arg0 != 34895) {
            field1204 = !field1204;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "sc", name = "b", descriptor = "(CB)Z")
    private static final boolean method427(char arg0, byte arg1) {
        if (arg1 != 75) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "sc", name = "e", descriptor = "(IC)Z")
    private static final boolean method428(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(B[C)Z")
    private static final boolean method429(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method426(34895, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        if (var2) {
            return true;
        }
        int var5 = method430(-287, arg1);
        int var6 = 0;
        int var7 = field1215.length - 1;
        if (field1215[var6] == var5 || field1215[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1215[var8] == var5) {
                return true;
            }
            if (var5 < field1215[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "sc", name = "a", descriptor = "(I[C)I")
    public static final int method430(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0 >= 0) {
            return field1205;
        }
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
        return var2;
    }
}
