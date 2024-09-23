import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GQUAQVLD")
public class class22 {

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "I")
    private static int field732 = 788;

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "Z")
    private static boolean field733 = true;

    @OriginalMember(owner = "GQUAQVLD", name = "c", descriptor = "I")
    private static int field734 = -10102;

    @OriginalMember(owner = "GQUAQVLD", name = "d", descriptor = "I")
    private static int field735 = -771;

    @OriginalMember(owner = "GQUAQVLD", name = "f", descriptor = "I")
    private static int field737 = -508;

    @OriginalMember(owner = "GQUAQVLD", name = "h", descriptor = "I")
    private static int field739 = -983;

    @OriginalMember(owner = "GQUAQVLD", name = "i", descriptor = "B")
    private static byte field740 = 6;

    @OriginalMember(owner = "GQUAQVLD", name = "j", descriptor = "Z")
    private static boolean field741 = true;

    @OriginalMember(owner = "GQUAQVLD", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field748 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "GQUAQVLD", name = "g", descriptor = "I")
    private static int field738;

    @OriginalMember(owner = "GQUAQVLD", name = "e", descriptor = "Z")
    private static boolean field736;

    @OriginalMember(owner = "GQUAQVLD", name = "r", descriptor = "Z")
    public static boolean field749;

    @OriginalMember(owner = "GQUAQVLD", name = "k", descriptor = "[I")
    private static int[] field742;

    @OriginalMember(owner = "GQUAQVLD", name = "p", descriptor = "[I")
    private static int[] field747;

    @OriginalMember(owner = "GQUAQVLD", name = "l", descriptor = "[[C")
    private static char[][] field743;

    @OriginalMember(owner = "GQUAQVLD", name = "n", descriptor = "[[C")
    private static char[][] field745;

    @OriginalMember(owner = "GQUAQVLD", name = "o", descriptor = "[[C")
    private static char[][] field746;

    @OriginalMember(owner = "GQUAQVLD", name = "m", descriptor = "[[[B")
    private static byte[][][] field744;

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(LHRXSNEYZ;)V")
    public static final void method247(class26 arg0) {
        class31 var1 = new class31(arg0.method289("fragmentsenc.txt", null), 8);
        class31 var2 = new class31(arg0.method289("badenc.txt", null), 8);
        class31 var3 = new class31(arg0.method289("domainenc.txt", null), 8);
        class31 var4 = new class31(arg0.method289("tldlist.txt", null), 8);
        method248(var1, var2, var3, var4);
        if (class29.field878) {
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(LJHKSAGUC;LJHKSAGUC;LJHKSAGUC;LJHKSAGUC;)V")
    private static final void method248(class31 arg0, class31 arg1, class31 arg2, class31 arg3) {
        method250(arg1, 0);
        method251(arg2, 0);
        method252(false, arg0);
        method249(42043, arg3);
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(ILJHKSAGUC;)V")
    private static final void method249(int arg0, class31 arg1) {
        int var2 = arg1.method311();
        if (arg0 != 42043) {
            return;
        }
        field746 = new char[var2][];
        field747 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field747[var3] = arg1.method306();
            char[] var4 = new char[arg1.method306()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method306();
            }
            field746[var3] = var4;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(LJHKSAGUC;I)V")
    private static final void method250(class31 arg0, int arg1) {
        if (arg1 != 0) {
            field733 = !field733;
        }
        int var2 = arg0.method311();
        field743 = new char[var2][];
        field744 = new byte[var2][][];
        method253(field744, field734, arg0, field743);
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(LJHKSAGUC;I)V")
    private static final void method251(class31 arg0, int arg1) {
        int var2 = arg0.method311();
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field745 = new char[var2][];
        method254(arg0, (byte) 3, field745);
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(ZLJHKSAGUC;)V")
    private static final void method252(boolean arg0, class31 arg1) {
        field742 = new int[arg1.method311()];
        if (arg0) {
            field733 = !field733;
        }
        for (int var2 = 0; var2 < field742.length; var2++) {
            field742[var2] = arg1.method308();
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([[[BILJHKSAGUC;[[C)V")
    private static final void method253(byte[][][] arg0, int arg1, class31 arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg2.method306()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method306();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg2.method306()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method306();
                var7[var8][1] = (byte) arg2.method306();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
        if (field734 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(LJHKSAGUC;B[[C)V")
    private static final void method254(class31 arg0, byte arg1, char[][] arg2) {
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            field732 = 424;
        }
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method306()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method306();
            }
            arg2[var4] = var5;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(I[C)V")
    private static final void method255(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method256(true, arg1[var3])) {
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
        int var5 = 21 / arg0;
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(ZC)Z")
    private static final boolean method256(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method257(int arg0, String arg1) {
        int var2 = 64 / arg0;
        long var3 = System.currentTimeMillis();
        char[] var5 = arg1.toCharArray();
        method255(460, var5);
        String var6 = (new String(var5)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method265(0, var7);
        method260(var7, -988);
        method261(false, var7);
        method274(var7, 0);
        for (int var9 = 0; var9 < field748.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field748[var9], var12 + 1)) != -1) {
                char[] var13 = field748[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method258(var7, var6.toCharArray(), -771);
        method259(false, var7);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([C[CI)V")
    private static final void method258(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method282(arg1[var3], -212)) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(Z[C)V")
    private static final void method259(boolean arg0, char[] arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method279(0, var5)) {
                var3 = true;
            } else if (var3) {
                if (method281(true, var5)) {
                    var3 = false;
                }
            } else if (method282(var5, -212)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([CI)V")
    private static final void method260(char[] arg0, int arg1) {
        label32: while (true) {
            if (arg1 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label32;
                    }
                    var4++;
                }
            }
            for (int var2 = 0; var2 < 2; var2++) {
                for (int var3 = field743.length - 1; var3 >= 0; var3--) {
                    method269(arg0, field744[var3], false, field743[var3]);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(Z[C)V")
    private static final void method261(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        if (arg0) {
            field741 = !field741;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method269(var2, null, false, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method269(var4, null, false, var5);
        for (int var6 = field745.length - 1; var6 >= 0; var6--) {
            method262(var4, field745[var6], arg1, var2, (byte) 3);
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([C[C[C[CB)V")
    private static final void method262(char[] arg0, char[] arg1, char[] arg2, char[] arg3, byte arg4) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg2.length - arg1.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method271(arg1[var9], (byte) 2, var13, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method271(arg1[var9 - 1], (byte) 2, var13, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method277(118, var12)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method263(field736, var6, arg3, arg2);
                int var18 = method264(arg0, var8 - 1, arg2, -33928);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg2[var19] = '*';
                    }
                }
            }
        }
        if (arg4 == 3) {
            boolean var7 = false;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(ZI[C[C)I")
    private static final int method263(boolean arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method277(118, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        if (arg0) {
            return field734;
        }
        for (int var6 = arg1 - 1; var6 >= 0 && method277(118, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method277(118, arg3[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([CI[CI)I")
    private static final int method264(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method277(118, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg3 != -33928) {
                field734 = -224;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg2.length && method277(118, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method277(118, arg2[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(I[C)V")
    private static final void method265(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method269(var2, null, false, var3);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg0 == 0) {
            method269(var4, null, false, var5);
            for (int var6 = 0; var6 < field746.length; var6++) {
                method266(arg1, var4, var2, field746[var6], field747[var6], (byte) 4);
            }
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([C[C[C[CIB)V")
    private static final void method266(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4, byte arg5) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        int var11;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var11) {
            int var9 = var7;
            int var10 = 0;
            var11 = 1;
            label128: while (true) {
                while (true) {
                    if (var9 >= arg0.length) {
                        break label128;
                    }
                    boolean var12 = false;
                    char var13 = arg0[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg0.length) {
                        var14 = arg0[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg3.length && (var15 = method271(arg3[var10], (byte) 2, var14, var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label128;
                        }
                        int var16;
                        if ((var16 = method271(arg3[var10 - 1], (byte) 2, var14, var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg3.length || !method277(118, var13)) {
                                break label128;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg3.length) {
                boolean var17 = false;
                int var18 = method267(arg2, true, var7, arg0);
                int var19 = method268(arg0, var9 - 1, arg1, true);
                if (arg4 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg4 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg4 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg4 == 3 && var18 > 2 && var19 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var17) {
                    int var20 = var7;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var7 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg2[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg2[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method277(118, arg0[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method277(118, arg0[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg0.length; var27++) {
                                if (var26) {
                                    if (arg1[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg1[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg0.length; var29++) {
                            if (var28) {
                                if (method277(118, arg0[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method277(118, arg0[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg0[var30] = '*';
                    }
                }
            }
        }
        if (arg5 == 4) {
            boolean var8 = false;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([CZI[C)I")
    private static final int method267(char[] arg0, boolean arg1, int arg2, char[] arg3) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 == 0) {
            return 2;
        }
        int var5 = arg2 - 1;
        while (true) {
            if (var5 >= 0 && method277(118, arg3[var5])) {
                if (arg3[var5] != ',' && arg3[var5] != '.') {
                    var5--;
                    continue;
                }
                return 3;
            }
            int var6 = 0;
            for (int var7 = arg2 - 1; var7 >= 0 && method277(118, arg0[var7]); var7--) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method277(118, arg3[arg2 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([CI[CZ)I")
    private static final int method268(char[] arg0, int arg1, char[] arg2, boolean arg3) {
        if (arg1 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg0.length && method277(118, arg0[var4])) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (!arg3) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg1 + 1; var7 < arg0.length && method277(118, arg2[var7]); var7++) {
                if (arg2[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method277(118, arg0[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([C[[BZ[C)V")
    public static final void method269(char[] arg0, byte[][] arg1, boolean arg2, char[] arg3) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        if (arg2) {
            field733 = !field733;
        }
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg3.length; var5 += var9) {
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
                    if (var7 < arg3.length && (var16 = method272(var14, -508, arg3[var7], var15)) > 0) {
                        if (var16 == 1 && method280(313, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method280(313, var14) || method280(313, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method272(var14, -508, arg3[var7 - 1], var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method278((byte) 6, var14)) {
                                break label172;
                            }
                            if (method277(118, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method280(313, var14)) {
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
            if (var7 >= arg3.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method277(118, arg0[var5 - 1]) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method277(118, arg0[var6]) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method277(118, arg0[var26]) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method277(118, arg0[var26 + var28]) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method277(118, arg0[var26 - 1]) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method283((byte) 69, var27)) {
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
                    byte var21 = method273(var19, -41);
                    byte var22 = method273(var20, -41);
                    if (arg1 != null && method270(var21, var22, arg1, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method280(313, arg0[var33])) {
                            var30++;
                        } else if (method279(0, arg0[var33])) {
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

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(BB[[BI)Z")
    private static final boolean method270(byte arg0, byte arg1, byte[][] arg2, int arg3) {
        int var4 = 0;
        if (arg3 != 0) {
            field732 = -360;
        }
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg1) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg2[var5][0] == arg0 && arg2[var5][1] == arg1) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg2[var6][0] == arg0 && arg2[var6][1] == arg1) {
                return true;
            }
            if (arg0 < arg2[var6][0] || arg2[var6][0] == arg0 && arg1 < arg2[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(CBCC)I")
    private static final int method271(char arg0, byte arg1, char arg2, char arg3) {
        if (arg1 != 2) {
            return 3;
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

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(CICC)I")
    private static final int method272(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 >= 0) {
            field741 = !field741;
        }
        if (arg0 == arg2) {
            return 1;
        }
        if (arg2 >= 'a' && arg2 <= 'm') {
            if (arg2 == 'a') {
                if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                    if (arg0 == '/' && arg3 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg2 == 'b') {
                if (arg0 != '6' && arg0 != '8') {
                    if ((arg0 != '1' || arg3 != '3') && (arg0 != 'i' || arg3 != '3')) {
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
                if ((arg0 != '[' || arg3 != ')') && (arg0 != 'i' || arg3 != ')')) {
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
                if (arg0 == 'p' && arg3 == 'h') {
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
                    if (arg0 == '(' && arg3 == ')' || arg0 == '[' && arg3 == ']' || arg0 == '{' && arg3 == '}' || arg0 == '<' && arg3 == '>') {
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
                if (arg0 == '\\' && arg3 == '/' || arg0 == '\\' && arg3 == '|' || arg0 == '|' && arg3 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'v') {
                if ((arg0 != '\\' || arg3 != '/') && (arg0 != '\\' || arg3 != '|') && (arg0 != '|' || arg3 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg2 == 'w') {
                if (arg0 == 'v' && arg3 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg2 == 'x') {
                if ((arg0 != ')' || arg3 != '(') && (arg0 != '}' || arg3 != '{') && (arg0 != ']' || arg3 != '[') && (arg0 != '>' || arg3 != '<')) {
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
                } else if ((arg0 != '(' || arg3 != ')') && (arg0 != '{' || arg3 != '}') && (arg0 != '[' || arg3 != ']')) {
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

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(CI)B")
    private static final byte method273(char arg0, int arg1) {
        if (arg1 >= 0) {
            field734 = 430;
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

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "([CI)V")
    private static final void method274(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg1 < field738 || arg1 > field738) {
            field738 = 141;
        }
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method275(var3, -983, arg0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method277(118, arg0[var8]) && !method278((byte) 6, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method276(arg0, var6, -40997);
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

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(II[C)I")
    private static final int method275(int arg0, int arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 >= 0) {
            field733 = !field733;
        }
        return -1;
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "([CII)I")
    private static final int method276(char[] arg0, int arg1, int arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 != -40997) {
                return 3;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(IC)Z")
    private static final boolean method277(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return !method279(0, arg1) && !method280(313, arg1);
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(BC)Z")
    private static final boolean method278(byte arg0, char arg1) {
        if (field740 != arg0) {
            field739 = 137;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(IC)Z")
    private static final boolean method279(int arg0, char arg1) {
        if (arg0 != 0) {
            field733 = !field733;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "GQUAQVLD", name = "c", descriptor = "(IC)Z")
    private static final boolean method280(int arg0, char arg1) {
        if (arg0 <= 0) {
            field735 = 64;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(ZC)Z")
    private static final boolean method281(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(CI)Z")
    private static final boolean method282(char arg0, int arg1) {
        while (arg1 >= 0) {
            field737 = 428;
        }
        if (arg0 >= 'A' && arg0 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "GQUAQVLD", name = "a", descriptor = "(B[C)Z")
    private static final boolean method283(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method280(313, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method284((byte) -120, arg1);
        int var5 = 0;
        int var6 = field742.length - 1;
        if (arg0 != 69) {
            field734 = 350;
        }
        if (field742[var5] == var4 || field742[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field742[var7] == var4) {
                return true;
            }
            if (var4 < field742[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "GQUAQVLD", name = "b", descriptor = "(B[C)I")
    public static final int method284(byte arg0, char[] arg1) {
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
        if (arg0 == -120) {
            return var2;
        } else {
            return 4;
        }
    }
}
