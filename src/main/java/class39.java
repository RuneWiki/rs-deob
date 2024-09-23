import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NBTRSNNF")
public class class39 {

    @OriginalMember(owner = "NBTRSNNF", name = "c", descriptor = "Z")
    private static boolean field1148 = true;

    @OriginalMember(owner = "NBTRSNNF", name = "g", descriptor = "B")
    private static byte field1152 = 2;

    @OriginalMember(owner = "NBTRSNNF", name = "h", descriptor = "I")
    private static int field1153 = 851;

    @OriginalMember(owner = "NBTRSNNF", name = "p", descriptor = "[Ljava/lang/String;")
    private static final String[] field1161 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "NBTRSNNF", name = "f", descriptor = "B")
    private static byte field1151;

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "I")
    private static int field1146;

    @OriginalMember(owner = "NBTRSNNF", name = "e", descriptor = "I")
    private static int field1150;

    @OriginalMember(owner = "NBTRSNNF", name = "i", descriptor = "I")
    private static int field1154;

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "Z")
    private static boolean field1147;

    @OriginalMember(owner = "NBTRSNNF", name = "d", descriptor = "Z")
    private static boolean field1149;

    @OriginalMember(owner = "NBTRSNNF", name = "q", descriptor = "Z")
    public static boolean field1162;

    @OriginalMember(owner = "NBTRSNNF", name = "j", descriptor = "[I")
    private static int[] field1155;

    @OriginalMember(owner = "NBTRSNNF", name = "o", descriptor = "[I")
    private static int[] field1160;

    @OriginalMember(owner = "NBTRSNNF", name = "k", descriptor = "[[C")
    private static char[][] field1156;

    @OriginalMember(owner = "NBTRSNNF", name = "m", descriptor = "[[C")
    private static char[][] field1158;

    @OriginalMember(owner = "NBTRSNNF", name = "n", descriptor = "[[C")
    private static char[][] field1159;

    @OriginalMember(owner = "NBTRSNNF", name = "l", descriptor = "[[[B")
    private static byte[][][] field1157;

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(LSPZBTZXL;)V")
    public static final void method460(class51 arg0) {
        class34 var1 = new class34(arg0.method515("fragmentsenc.txt", null), field1146);
        class34 var2 = new class34(arg0.method515("badenc.txt", null), field1146);
        class34 var3 = new class34(arg0.method515("domainenc.txt", null), field1146);
        class34 var4 = new class34(arg0.method515("tldlist.txt", null), field1146);
        method461(var1, var2, var3, var4);
        if (class6.field545) {
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(LLDILQFVA;LLDILQFVA;LLDILQFVA;LLDILQFVA;)V")
    private static final void method461(class34 arg0, class34 arg1, class34 arg2, class34 arg3) {
        method463(arg1, false);
        method464((byte) 6, arg2);
        method465(arg0, (byte) 0);
        method462((byte) 7, arg3);
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(BLLDILQFVA;)V")
    private static final void method462(byte arg0, class34 arg1) {
        if (arg0 != 7) {
            return;
        }
        boolean var2 = false;
        int var3 = arg1.method407();
        field1159 = new char[var3][];
        field1160 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            field1160[var4] = arg1.method402();
            char[] var5 = new char[arg1.method402()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method402();
            }
            field1159[var4] = var5;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(LLDILQFVA;Z)V")
    private static final void method463(class34 arg0, boolean arg1) {
        int var2 = arg0.method407();
        if (!arg1) {
            field1156 = new char[var2][];
            field1157 = new byte[var2][][];
            method466(-137, arg0, field1157, field1156);
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "(BLLDILQFVA;)V")
    private static final void method464(byte arg0, class34 arg1) {
        int var2 = arg1.method407();
        if (arg0 == 6) {
            boolean var3 = false;
            field1158 = new char[var2][];
            method467(arg1, 0, field1158);
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(LLDILQFVA;B)V")
    private static final void method465(class34 arg0, byte arg1) {
        field1155 = new int[arg0.method407()];
        if (arg1 != 0) {
            field1149 = !field1149;
        }
        for (int var2 = 0; var2 < field1155.length; var2++) {
            field1155[var2] = arg0.method404();
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(ILLDILQFVA;[[[B[[C)V")
    private static final void method466(int arg0, class34 arg1, byte[][][] arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method402()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method402();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method402()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method402();
                var7[var8][1] = (byte) arg1.method402();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
        if (arg0 >= 0) {
            field1149 = !field1149;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(LLDILQFVA;I[[C)V")
    private static final void method467(class34 arg0, int arg1, char[][] arg2) {
        if (arg1 != 0) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method402()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method402();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(I[C)V")
    private static final void method468(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method469(arg1[var3], true)) {
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
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(CZ)Z")
    private static final boolean method469(char arg0, boolean arg1) {
        if (!arg1) {
            field1154 = 398;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method470(String arg0, byte arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method468(-269, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method478(var6, (byte) 0);
        method473(false, var6);
        method474((byte) 6, var6);
        if (arg1 != 73) {
            throw new NullPointerException();
        }
        method487(1, var6);
        for (int var8 = 0; var8 < field1161.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1161[var8], var11 + 1)) != -1) {
                char[] var12 = field1161[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method471(var6, false, var5.toCharArray());
        method472(var6, -529);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "([CZ[C)V")
    private static final void method471(char[] arg0, boolean arg1, char[] arg2) {
        if (arg1) {
            field1149 = !field1149;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method495(arg2[var3], -19889)) {
                arg0[var3] = arg2[var3];
            }
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "([CI)V")
    private static final void method472(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 >= 0) {
            field1146 = -415;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method492(-613, var4)) {
                var2 = true;
            } else if (var2) {
                if (method494(field1153, var4)) {
                    var2 = false;
                }
            } else if (method495(var4, -19889)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(Z[C)V")
    private static final void method473(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1156.length - 1; var4 >= 0; var4--) {
                method482(arg1, field1156[var4], (byte) 2, field1157[var4]);
            }
        }
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(B[C)V")
    private static final void method474(byte arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method482(var2, var3, (byte) 2, null);
        char[] var4 = (char[]) arg1.clone();
        if (arg0 != 6) {
            return;
        }
        boolean var5 = false;
        char[] var6 = new char[] { 'd', 'o', 't' };
        method482(var4, var6, (byte) 2, null);
        for (int var7 = field1158.length - 1; var7 >= 0; var7--) {
            method475(true, arg1, var2, var4, field1158[var7]);
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(Z[C[C[C[C)V")
    private static final void method475(boolean arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg4.length > arg1.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg1.length - arg4.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label70: while (true) {
                while (true) {
                    if (var8 >= arg1.length) {
                        break label70;
                    }
                    boolean var11 = false;
                    char var12 = arg1[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg1.length) {
                        var13 = arg1[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg4.length && (var14 = method484(false, var13, var12, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label70;
                        }
                        int var15;
                        if ((var15 = method484(false, var13, var12, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method490(-18914, var12)) {
                                break label70;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method476(arg1, (byte) 6, arg2, var6);
                int var18 = method477(arg1, arg3, var8 - 1, (byte) 8);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg1[var19] = '*';
                    }
                }
            }
        }
        if (!arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "([CB[CI)I")
    private static final int method476(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg1 != 6) {
            field1148 = !field1148;
        }
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method490(-18914, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method490(-18914, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method490(-18914, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "([C[CIB)I")
    private static final int method477(char[] arg0, char[] arg1, int arg2, byte arg3) {
        if (arg3 == 8) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var6 = arg2 + 1;
        while (true) {
            if (var6 < arg0.length && method490(-18914, arg0[var6])) {
                if (arg0[var6] != '.' && arg0[var6] != ',') {
                    var6++;
                    continue;
                }
                return 3;
            }
            int var7 = 0;
            for (int var8 = arg2 + 1; var8 < arg0.length && method490(-18914, arg1[var8]); var8++) {
                if (arg1[var8] == '*') {
                    var7++;
                }
            }
            if (var7 >= 3) {
                return 4;
            }
            if (method490(-18914, arg0[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "([CB)V")
    private static final void method478(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method482(var2, var3, (byte) 2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method482(var4, var5, (byte) 2, null);
        for (int var6 = 0; var6 < field1159.length; var6++) {
            method479(field1160[var6], field1159[var6], 994, var4, var2, arg0);
        }
        if (arg1 == 0) {
            boolean var7 = false;
        } else {
            field1149 = !field1149;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(I[CI[C[C[C)V")
    private static final void method479(int arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg1.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg1.length; var7 += var10) {
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
                    if (var9 < arg1.length && (var14 = method484(false, var13, var12, arg1[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method484(false, var13, var12, arg1[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method490(-18914, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method480((byte) 0, arg4, var7, arg5);
                int var18 = method481(var8 - 1, true, arg3, arg5);
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
                                    if (arg4[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg4[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method490(-18914, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method490(-18914, arg5[var24])) {
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
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method490(-18914, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method490(-18914, arg5[var28])) {
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
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(B[CI[C)I")
    private static final int method480(byte arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method490(-18914, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (field1151 != arg0) {
                return 2;
            }
            for (int var6 = arg2 - 1; var6 >= 0 && method490(-18914, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method490(-18914, arg3[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(IZ[C[C)I")
    private static final int method481(int arg0, boolean arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method490(-18914, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg3.length && method490(-18914, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (!arg1) {
                return 1;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method490(-18914, arg3[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "([C[CB[[B)V")
    public static final void method482(char[] arg0, char[] arg1, byte arg2, byte[][] arg3) {
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        if (arg2 != 2) {
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
            label167: while (true) {
                while (true) {
                    if (var6 >= arg0.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg0[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg0.length) {
                        var15 = arg0[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method485(5, var15, var14, arg1[var7])) > 0) {
                        if (var16 == 1 && method493(var14, 2)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method493(var14, 2) || method493(var15, 2))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method485(5, var15, var14, arg1[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method491(var14, (byte) 3)) {
                                break label167;
                            }
                            if (method490(-18914, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method493(var14, 2)) {
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
                    if (var5 - 1 < 0 || method490(-18914, arg0[var5 - 1]) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method490(-18914, arg0[var6]) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method490(-18914, arg0[var26]) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method490(-18914, arg0[var26 + var28]) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method490(-18914, arg0[var26 - 1]) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method496(var27, 751)) {
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
                    byte var21 = method486(var19, 15994);
                    byte var22 = method486(var20, 15994);
                    if (arg3 != null && method483(var21, arg3, 447, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method493(arg0[var33], 2)) {
                            var30++;
                        } else if (method492(-613, arg0[var33])) {
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

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(B[[BIB)Z")
    private static final boolean method483(byte arg0, byte[][] arg1, int arg2, byte arg3) {
        int var4 = 0;
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg3) {
            return true;
        }
        int var5 = arg1.length - 1;
        int var6 = 86 / arg2;
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg3) {
            return true;
        }
        do {
            int var7 = (var4 + var5) / 2;
            if (arg1[var7][0] == arg0 && arg1[var7][1] == arg3) {
                return true;
            }
            if (arg0 < arg1[var7][0] || arg1[var7][0] == arg0 && arg3 < arg1[var7][1]) {
                var5 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(ZCCC)I")
    private static final int method484(boolean arg0, char arg1, char arg2, char arg3) {
        if (arg0) {
            field1150 = 481;
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

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(ICCC)I")
    private static final int method485(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 < 5 || arg0 > 5) {
            return field1154;
        } else if (arg2 == arg3) {
            return 1;
        } else {
            if (arg3 >= 'a' && arg3 <= 'm') {
                if (arg3 == 'a') {
                    if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                        if (arg2 == '/' && arg1 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'b') {
                    if (arg2 != '6' && arg2 != '8') {
                        if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg3 == 'c') {
                    if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'd') {
                    if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'e') {
                    if (arg2 != '3' && arg2 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'f') {
                    if (arg2 == 'p' && arg1 == 'h') {
                        return 2;
                    }
                    if (arg2 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg3 == 'g') {
                    if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'h') {
                    if (arg2 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg3 == 'i') {
                    if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                    if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                    if (arg2 != '0' && arg2 != '*') {
                        if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
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
                    if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 't') {
                    if (arg2 != '7' && arg2 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg3 == 'u') {
                    if (arg2 == 'v') {
                        return 1;
                    }
                    if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'v') {
                    if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg3 == 'w') {
                    if (arg2 == 'v' && arg1 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg3 == 'x') {
                    if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
                    if (arg2 == 'o' || arg2 == 'O') {
                        return 1;
                    } else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg3 == '1') {
                    return arg2 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg3 == ',') {
                return arg2 == '.' ? 1 : 0;
            } else if (arg3 == '.') {
                return arg2 == ',' ? 1 : 0;
            } else if (arg3 == '!') {
                return arg2 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(CI)B")
    private static final byte method486(char arg0, int arg1) {
        if (arg1 != 15994) {
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

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "(I[C)V")
    private static final void method487(int arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 != 1) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method488((byte) 2, var3, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method490(-18914, arg1[var8]) && !method491(arg1[var8], (byte) 3)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method489((byte) -100, var6, arg1);
                int var9 = 0;
                for (int var10 = var6; var10 < var3; var10++) {
                    var9 = var9 * 10 + arg1[var10] - 48;
                }
                if (var9 <= 255 && var3 - var6 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var11 = var5; var11 < var3; var11++) {
                arg1[var11] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(BI[C)I")
    private static final int method488(byte arg0, int arg1, char[] arg2) {
        if (field1152 != arg0) {
            field1148 = !field1148;
        }
        for (int var3 = arg1; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "(BI[C)I")
    private static final int method489(byte arg0, int arg1, char[] arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != -100) {
                field1146 = 415;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(IC)Z")
    private static final boolean method490(int arg0, char arg1) {
        if (arg0 != -18914) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method492(-613, arg1) && !method493(arg1, 2);
    }

    @OriginalMember(owner = "NBTRSNNF", name = "a", descriptor = "(CB)Z")
    private static final boolean method491(char arg0, byte arg1) {
        if (arg1 == 3) {
            boolean var2 = false;
        } else {
            field1154 = -418;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "(IC)Z")
    private static final boolean method492(int arg0, char arg1) {
        while (arg0 >= 0) {
        }
        if ((arg1 < 'a' || arg1 > 'z') && (arg1 < 'A' || arg1 > 'Z')) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "(CI)Z")
    private static final boolean method493(char arg0, int arg1) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "NBTRSNNF", name = "c", descriptor = "(IC)Z")
    private static final boolean method494(int arg0, char arg1) {
        if (arg0 <= 0) {
            field1153 = -25;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "NBTRSNNF", name = "c", descriptor = "(CI)Z")
    private static final boolean method495(char arg0, int arg1) {
        if (arg1 != -19889) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "([CI)Z")
    private static final boolean method496(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method493(arg0[var3], 2) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method497(arg0, (byte) 6);
        int var5 = 0;
        int var6 = field1155.length - 1;
        if (field1155[var5] == var4 || field1155[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1155[var7] == var4) {
                return true;
            }
            if (var4 < field1155[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "NBTRSNNF", name = "b", descriptor = "([CB)I")
    public static final int method497(char[] arg0, byte arg1) {
        if (arg1 != 6) {
            field1154 = 62;
        }
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
        return var2;
    }
}
