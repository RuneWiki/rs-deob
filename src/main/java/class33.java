import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NGLCBGTC")
public class class33 {

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "Z")
    private static boolean field982 = true;

    @OriginalMember(owner = "client!NGLCBGTC", name = "d", descriptor = "I")
    private static int field984 = -344;

    @OriginalMember(owner = "client!NGLCBGTC", name = "f", descriptor = "I")
    private static int field986 = 96;

    @OriginalMember(owner = "client!NGLCBGTC", name = "g", descriptor = "Z")
    private static boolean field987 = true;

    @OriginalMember(owner = "client!NGLCBGTC", name = "n", descriptor = "[Ljava/lang/String;")
    private static final String[] field994 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!NGLCBGTC", name = "c", descriptor = "I")
    private static int field983;

    @OriginalMember(owner = "client!NGLCBGTC", name = "e", descriptor = "I")
    private static int field985;

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "Z")
    private static boolean field981;

    @OriginalMember(owner = "client!NGLCBGTC", name = "o", descriptor = "Z")
    public static boolean field995;

    @OriginalMember(owner = "client!NGLCBGTC", name = "h", descriptor = "[I")
    private static int[] field988;

    @OriginalMember(owner = "client!NGLCBGTC", name = "m", descriptor = "[I")
    private static int[] field993;

    @OriginalMember(owner = "client!NGLCBGTC", name = "i", descriptor = "[[C")
    private static char[][] field989;

    @OriginalMember(owner = "client!NGLCBGTC", name = "k", descriptor = "[[C")
    private static char[][] field991;

    @OriginalMember(owner = "client!NGLCBGTC", name = "l", descriptor = "[[C")
    private static char[][] field992;

    @OriginalMember(owner = "client!NGLCBGTC", name = "j", descriptor = "[[[B")
    private static byte[][][] field990;

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(LRSPRYUFS;)V")
    public static final void method267(class49 arg0) {
        class36 var1 = new class36(-587, arg0.method427("fragmentsenc.txt", null));
        class36 var2 = new class36(-587, arg0.method427("badenc.txt", null));
        class36 var3 = new class36(-587, arg0.method427("domainenc.txt", null));
        class36 var4 = new class36(-587, arg0.method427("tldlist.txt", null));
        method268(var1, var2, var3, var4);
        if (class35.field1047) {
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(LNQUAUMDT;LNQUAUMDT;LNQUAUMDT;LNQUAUMDT;)V")
    private static final void method268(class36 arg0, class36 arg1, class36 arg2, class36 arg3) {
        method270(arg1, 542);
        method271(arg2, -190);
        method272(4, arg0);
        method269(-344, arg3);
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(ILNQUAUMDT;)V")
    private static final void method269(int arg0, class36 arg1) {
        int var2 = arg1.method344();
        field992 = new char[var2][];
        if (arg0 >= 0) {
            return;
        }
        field993 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field993[var3] = arg1.method339();
            char[] var4 = new char[arg1.method339()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method339();
            }
            field992[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(LNQUAUMDT;I)V")
    private static final void method270(class36 arg0, int arg1) {
        int var2 = arg0.method344();
        if (arg1 <= 0) {
            field984 = -152;
        }
        field989 = new char[var2][];
        field990 = new byte[var2][][];
        method273(-9548, arg0, field990, field989);
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(LNQUAUMDT;I)V")
    private static final void method271(class36 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = arg0.method344();
        field991 = new char[var3][];
        method274(arg0, 0, field991);
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(ILNQUAUMDT;)V")
    private static final void method272(int arg0, class36 arg1) {
        field988 = new int[arg1.method344()];
        for (int var2 = 0; var2 < field988.length; var2++) {
            field988[var2] = arg1.method341();
        }
        if (arg0 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(ILNQUAUMDT;[[[B[[C)V")
    private static final void method273(int arg0, class36 arg1, byte[][][] arg2, char[][] arg3) {
        if (arg0 != -9548) {
            return;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method339()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method339();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method339()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method339();
                var7[var8][1] = (byte) arg1.method339();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(LNQUAUMDT;I[[C)V")
    private static final void method274(class36 arg0, int arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method339()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method339();
            }
            arg2[var3] = var4;
        }
        if (arg1 != 0) {
            field982 = true;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CZ)V")
    private static final void method275(char[] arg0, boolean arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method276(arg0[var3], false)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1) {
            for (int var4 = var2; var4 < arg0.length; var4++) {
                arg0[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(CZ)Z")
    private static final boolean method276(char arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method277(byte arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        if (arg0 != 21) {
            field982 = true;
        }
        char[] var4 = arg1.toCharArray();
        method275(var4, true);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method285(var6, true);
        method280(-645, var6);
        method281(var6, (byte) -36);
        method294(-749, var6);
        for (int var8 = 0; var8 < field994.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field994[var8], var11 + 1)) != -1) {
                char[] var12 = field994[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method278(var5.toCharArray(), var6, false);
        method279(false, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([C[CZ)V")
    private static final void method278(char[] arg0, char[] arg1, boolean arg2) {
        if (arg2) {
            field982 = true;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg1[var3] != '*' && method302(true, arg0[var3])) {
                arg1[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(Z[C)V")
    private static final void method279(boolean arg0, char[] arg1) {
        if (arg0) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method299((byte) 8, var4)) {
                var2 = true;
            } else if (var2) {
                if (method301(0, var4)) {
                    var2 = false;
                }
            } else if (method302(true, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[C)V")
    private static final void method280(int arg0, char[] arg1) {
        if (arg0 >= 0) {
            return;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field989.length - 1; var3 >= 0; var3--) {
                method289(field989[var3], (byte) 9, field990[var3], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CB)V")
    private static final void method281(char[] arg0, byte arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != -36) {
            return;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method289(var3, (byte) 9, null, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method289(var5, (byte) 9, null, var4);
        for (int var6 = field991.length - 1; var6 >= 0; var6--) {
            method282(378, field991[var6], arg0, var4, var2);
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[C[C[C[C)V")
    private static final void method282(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        int var5 = 77 / arg0;
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg1.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label57: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label57;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method291(var12, var13, 81, arg1[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label57;
                        }
                        int var15;
                        if ((var15 = method291(var12, var13, 81, arg1[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method297(0, var12)) {
                                break label57;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method283((byte) 2, arg4, arg2, var7);
                int var18 = method284(var8 - 1, arg3, arg2, (byte) 7);
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(B[C[CI)I")
    private static final int method283(byte arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method297(0, arg2[var4]); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        if (arg0 != 2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        for (int var7 = arg3 - 1; var7 >= 0 && method297(0, arg1[var7]); var7--) {
            if (arg1[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method297(0, arg2[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[C[CB)I")
    private static final int method284(int arg0, char[] arg1, char[] arg2, byte arg3) {
        if (arg0 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg2.length && method297(0, arg2[var4])) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != 7) {
                return field983;
            }
            for (int var6 = arg0 + 1; var6 < arg2.length && method297(0, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method297(0, arg2[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "([CZ)V")
    private static final void method285(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (!arg1) {
            field981 = !field981;
        }
        method289(var3, (byte) 9, null, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method289(var5, (byte) 9, null, var4);
        for (int var6 = 0; var6 < field992.length; var6++) {
            method286(field993[var6], 0, var2, var4, field992[var6], arg0);
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(II[C[C[C[C)V")
    private static final void method286(int arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg1 != 0 || arg4.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg4.length; var7 += var10) {
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
                    if (var9 < arg4.length && (var14 = method291(var12, var13, 81, arg4[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method291(var12, var13, 81, arg4[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg4.length || !method297(0, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg4.length) {
                boolean var16 = false;
                int var17 = method287(arg5, var7, -870, arg2);
                int var18 = method288(arg5, arg3, -348, var8 - 1);
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
                                if (method297(0, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method297(0, arg5[var24])) {
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
                                if (method297(0, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method297(0, arg5[var28])) {
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CII[C)I")
    private static final int method287(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method297(0, arg0[var4])) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 >= 0) {
                return 2;
            }
            for (int var6 = arg1 - 1; var6 >= 0 && method297(0, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method297(0, arg0[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([C[CII)I")
    private static final int method288(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method297(0, arg0[var4])) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg2 >= 0) {
                return field985;
            }
            for (int var6 = arg3 + 1; var6 < arg0.length && method297(0, arg1[var6]); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method297(0, arg0[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CB[[B[C)V")
    public static final void method289(char[] arg0, byte arg1, byte[][] arg2, char[] arg3) {
        if (arg1 != 9 || arg0.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var9) {
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
                    if (var7 < arg0.length && (var16 = method292(var14, var15, 2, arg0[var7])) > 0) {
                        if (var16 == 1 && method300(var14, -813)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method300(var14, -813) || method300(var15, -813))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method292(var14, var15, 2, arg0[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg0.length || !method298(96, var14)) {
                                break label167;
                            }
                            if (method297(0, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method300(var14, -813)) {
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
            if (var7 >= arg0.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method297(0, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method297(0, arg3[var6]) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method297(0, arg3[var26]) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method297(0, arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method297(0, arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method303(var27, 0)) {
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
                    byte var21 = method293(var19, 95);
                    byte var22 = method293(var20, 95);
                    if (arg2 != null && method290(var22, arg2, var21, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method300(arg3[var33], -813)) {
                            var30++;
                        } else if (method299((byte) 8, arg3[var33])) {
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(B[[BBI)Z")
    private static final boolean method290(byte arg0, byte[][] arg1, byte arg2, int arg3) {
        int var4 = 0;
        if (arg3 != 0) {
            field984 = -339;
        }
        if (arg1[var4][0] == arg2 && arg1[var4][1] == arg0) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg1[var5][0] == arg2 && arg1[var5][1] == arg0) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg2 && arg1[var6][1] == arg0) {
                return true;
            }
            if (arg2 < arg1[var6][0] || arg1[var6][0] == arg2 && arg0 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(CCIC)I")
    private static final int method291(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 <= 0) {
            field984 = -106;
        }
        if (arg0 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg0 == '(' && arg1 == ')') {
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(CCIC)I")
    private static final int method292(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 2) {
            field981 = !field981;
        }
        if (arg0 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
                    if (arg0 == '/' && arg1 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg0 != '6' && arg0 != '8') {
                    if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
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
                if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
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
                if (arg0 == 'p' && arg1 == 'h') {
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
                    if (arg0 == '(' && arg1 == ')' || arg0 == '[' && arg1 == ']' || arg0 == '{' && arg1 == '}' || arg0 == '<' && arg1 == '>') {
                        return 2;
                    }
                    return 0;
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
                if (arg0 == '\\' && arg1 == '/' || arg0 == '\\' && arg1 == '|' || arg0 == '|' && arg1 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'v') {
                if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg0 == 'v' && arg1 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
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
                } else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(CI)B")
    private static final byte method293(char arg0, int arg1) {
        if (arg1 <= 0) {
            field982 = true;
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(I[C)V")
    private static final void method294(int arg0, char[] arg1) {
        boolean var2 = false;
        if (arg0 >= 0) {
            field982 = true;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method295(arg1, -38309, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method297(0, arg1[var8]) && !method298(96, arg1[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method296(var6, arg1, 569);
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

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CII)I")
    private static final int method295(char[] arg0, int arg1, int arg2) {
        if (arg1 != -38309) {
            return 2;
        }
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(I[CI)I")
    private static final int method296(int arg0, char[] arg1, int arg2) {
        int var3 = 48 / arg2;
        int var4 = arg0;
        while (true) {
            if (var4 < arg1.length && var4 >= 0) {
                if (arg1[var4] >= '0' && arg1[var4] <= '9') {
                    var4++;
                    continue;
                }
                return var4;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(IC)Z")
    private static final boolean method297(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return !method299((byte) 8, arg1) && !method300(arg1, -813);
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(IC)Z")
    private static final boolean method298(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(BC)Z")
    private static final boolean method299(byte arg0, char arg1) {
        if (arg0 == 8) {
            boolean var2 = false;
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "(CI)Z")
    private static final boolean method300(char arg0, int arg1) {
        if (arg1 >= 0) {
            field982 = true;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "c", descriptor = "(IC)Z")
    private static final boolean method301(int arg0, char arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "(ZC)Z")
    private static final boolean method302(boolean arg0, char arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "a", descriptor = "([CI)Z")
    private static final boolean method303(char[] arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method300(arg0[var3], -813) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method304(arg0, -187);
        int var5 = 0;
        int var6 = field988.length - 1;
        if (field988[var5] == var4 || field988[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field988[var7] == var4) {
                return true;
            }
            if (var4 < field988[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!NGLCBGTC", name = "b", descriptor = "([CI)I")
    public static final int method304(char[] arg0, int arg1) {
        if (arg1 >= 0) {
            field982 = true;
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
