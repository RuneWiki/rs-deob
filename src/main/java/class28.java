import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IHSJPYKH")
public class class28 {

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "Z")
    private static boolean field929 = true;

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "I")
    private static int field930 = 156;

    @OriginalMember(owner = "client!IHSJPYKH", name = "c", descriptor = "Z")
    private static boolean field931 = true;

    @OriginalMember(owner = "client!IHSJPYKH", name = "d", descriptor = "I")
    private static int field932 = 1008;

    @OriginalMember(owner = "client!IHSJPYKH", name = "e", descriptor = "I")
    private static int field933 = 3763;

    @OriginalMember(owner = "client!IHSJPYKH", name = "f", descriptor = "I")
    private static int field934 = 2;

    @OriginalMember(owner = "client!IHSJPYKH", name = "g", descriptor = "I")
    private static int field935 = -377;

    @OriginalMember(owner = "client!IHSJPYKH", name = "h", descriptor = "I")
    private static int field936 = 796;

    @OriginalMember(owner = "client!IHSJPYKH", name = "i", descriptor = "I")
    private static int field937 = 42302;

    @OriginalMember(owner = "client!IHSJPYKH", name = "j", descriptor = "B")
    private static byte field938 = -97;

    @OriginalMember(owner = "client!IHSJPYKH", name = "k", descriptor = "I")
    private static int field939 = 557;

    @OriginalMember(owner = "client!IHSJPYKH", name = "l", descriptor = "I")
    private static int field940 = 720;

    @OriginalMember(owner = "client!IHSJPYKH", name = "m", descriptor = "B")
    private static byte field941 = 43;

    @OriginalMember(owner = "client!IHSJPYKH", name = "u", descriptor = "[Ljava/lang/String;")
    private static final String[] field949 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!IHSJPYKH", name = "n", descriptor = "Z")
    private static boolean field942;

    @OriginalMember(owner = "client!IHSJPYKH", name = "v", descriptor = "Z")
    public static boolean field950;

    @OriginalMember(owner = "client!IHSJPYKH", name = "o", descriptor = "[I")
    private static int[] field943;

    @OriginalMember(owner = "client!IHSJPYKH", name = "t", descriptor = "[I")
    private static int[] field948;

    @OriginalMember(owner = "client!IHSJPYKH", name = "p", descriptor = "[[C")
    private static char[][] field944;

    @OriginalMember(owner = "client!IHSJPYKH", name = "r", descriptor = "[[C")
    private static char[][] field946;

    @OriginalMember(owner = "client!IHSJPYKH", name = "s", descriptor = "[[C")
    private static char[][] field947;

    @OriginalMember(owner = "client!IHSJPYKH", name = "q", descriptor = "[[[B")
    private static byte[][][] field945;

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(LJUPFHAZZ;)V")
    public static final void method271(class32 arg0) {
        class59 var1 = new class59(859, arg0.method372("fragmentsenc.txt", null));
        class59 var2 = new class59(859, arg0.method372("badenc.txt", null));
        class59 var3 = new class59(859, arg0.method372("domainenc.txt", null));
        class59 var4 = new class59(859, arg0.method372("tldlist.txt", null));
        method272(var1, var2, var3, var4);
        if (class67.field1688) {
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(LTKPFKOXP;LTKPFKOXP;LTKPFKOXP;LTKPFKOXP;)V")
    private static final void method272(class59 arg0, class59 arg1, class59 arg2, class59 arg3) {
        method274(true, arg1);
        method275(arg2, field932);
        method276(arg0, 0);
        method273(arg3, 20530);
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(LTKPFKOXP;I)V")
    private static final void method273(class59 arg0, int arg1) {
        int var2 = arg0.method534();
        field947 = new char[var2][];
        if (arg1 != 20530) {
            field932 = 248;
        }
        field948 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field948[var3] = arg0.method529();
            char[] var4 = new char[arg0.method529()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method529();
            }
            field947[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(ZLTKPFKOXP;)V")
    private static final void method274(boolean arg0, class59 arg1) {
        int var2 = arg1.method534();
        field944 = new char[var2][];
        field945 = new byte[var2][][];
        if (arg0) {
            method277(field944, false, arg1, field945);
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(LTKPFKOXP;I)V")
    private static final void method275(class59 arg0, int arg1) {
        int var2 = arg0.method534();
        if (arg1 == 1008) {
            field946 = new char[var2][];
            method278(3763, arg0, field946);
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "c", descriptor = "(LTKPFKOXP;I)V")
    private static final void method276(class59 arg0, int arg1) {
        field943 = new int[arg0.method534()];
        if (arg1 == 0) {
            for (int var2 = 0; var2 < field943.length; var2++) {
                field943[var2] = arg0.method531();
            }
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([[CZLTKPFKOXP;[[[B)V")
    private static final void method277(char[][] arg0, boolean arg1, class59 arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method529()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method529();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method529()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method529();
                var7[var8][1] = (byte) arg2.method529();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (arg1) {
            field930 = 207;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(ILTKPFKOXP;[[C)V")
    private static final void method278(int arg0, class59 arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method529()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method529();
            }
            arg2[var3] = var4;
        }
        if (field933 != arg0) {
            field932 = 427;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CZ)V")
    private static final void method279(char[] arg0, boolean arg1) {
        if (arg1) {
            field930 = -417;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method280(arg0[var3], (byte) -113)) {
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

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CB)Z")
    private static final boolean method280(char arg0, byte arg1) {
        if (arg1 != -113) {
            field932 = 460;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method281(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        if (arg1) {
            throw new NullPointerException();
        }
        method279(var4, false);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method289(var6, -4922);
        method284(var6, 934);
        method285(var6, field936);
        method298(true, var6);
        for (int var8 = 0; var8 < field949.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field949[var8], var11 + 1)) != -1) {
                char[] var12 = field949[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method282(var6, var5.toCharArray(), field935);
        method283(268, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([C[CI)V")
    private static final void method282(char[] arg0, char[] arg1, int arg2) {
        if (arg2 != -377) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (arg0[var4] != '*' && method306(arg1[var4], field942)) {
                arg0[var4] = arg1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(I[C)V")
    private static final void method283(int arg0, char[] arg1) {
        boolean var2 = true;
        int var3 = 57 / arg0;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method303(var5, 0)) {
                var2 = true;
            } else if (var2) {
                if (method305(var5, -705)) {
                    var2 = false;
                }
            } else if (method306(var5, field942)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CI)V")
    private static final void method284(char[] arg0, int arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field944.length - 1; var4 >= 0; var4--) {
                method293(arg0, (byte) 7, field945[var4], field944[var4]);
            }
        }
        int var3 = 40 / arg1;
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "([CI)V")
    private static final void method285(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method293(var2, (byte) 7, null, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        method293(var4, (byte) 7, null, var5);
        for (int var7 = field946.length - 1; var7 >= 0; var7--) {
            method286(true, field946[var7], var4, arg0, var2);
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Z[C[C[C[C)V")
    private static final void method286(boolean arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        if (!arg0) {
            return;
        }
        int var9;
        for (int var6 = 0; var6 <= arg3.length - arg1.length; var6 += var9) {
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
                    if (var8 < arg1.length && (var13 = method295(var12, var11, field939, arg1[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method295(var12, var11, field939, arg1[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method301(720, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method287(var6, false, arg3, arg4);
                int var17 = method288(arg2, arg3, var7 - 1, field937);
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
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(IZ[C[C)I")
    private static final int method287(int arg0, boolean arg1, char[] arg2, char[] arg3) {
        if (arg1) {
            return field939;
        } else if (arg0 == 0) {
            return 2;
        } else {
            for (int var4 = arg0 - 1; var4 >= 0 && method301(720, arg2[var4]); var4--) {
                if (arg2[var4] == '@') {
                    return 3;
                }
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method301(720, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            } else if (method301(720, arg2[arg0 - 1])) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([C[CII)I")
    private static final int method288(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 != 42302) {
            field942 = true;
        }
        if (arg2 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg1.length && method301(720, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg2 + 1; var6 < arg1.length && method301(720, arg0[var6]); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method301(720, arg1[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "c", descriptor = "([CI)V")
    private static final void method289(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg1 != -4922) {
            field939 = 178;
        }
        method293(var2, (byte) 7, null, var3);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method293(var4, (byte) 7, null, var5);
        for (int var6 = 0; var6 < field947.length; var6++) {
            method290(var2, field947[var6], var4, field948[var6], (byte) 4, arg0);
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([C[C[CIB[C)V")
    private static final void method290(char[] arg0, char[] arg1, char[] arg2, int arg3, byte arg4, char[] arg5) {
        if (arg4 != 4) {
            return;
        }
        boolean var6 = false;
        if (arg1.length > arg5.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg5.length - arg1.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label128: while (true) {
                while (true) {
                    if (var9 >= arg5.length) {
                        break label128;
                    }
                    boolean var12 = false;
                    char var13 = arg5[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg5.length) {
                        var14 = arg5[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg1.length && (var15 = method295(var14, var13, field939, arg1[var10])) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label128;
                        }
                        int var16;
                        if ((var16 = method295(var14, var13, field939, arg1[var10 - 1])) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg1.length || !method301(720, var13)) {
                                break label128;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg1.length) {
                boolean var17 = false;
                int var18 = method291(var8, (byte) -97, arg5, arg0);
                int var19 = method292(var9 - 1, arg5, 478, arg2);
                if (arg3 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg3 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg3 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var18 > 2 && var19 > 0) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (var17) {
                    int var20 = var8;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var8 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg0[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg0[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method301(720, arg5[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method301(720, arg5[var25])) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg5.length; var27++) {
                                if (var26) {
                                    if (arg2[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg2[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg5.length; var29++) {
                            if (var28) {
                                if (method301(720, arg5[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method301(720, arg5[var29])) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg5[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(IB[C[C)I")
    private static final int method291(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method301(720, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (field938 != arg1) {
                field942 = true;
            }
            for (int var6 = arg0 - 1; var6 >= 0 && method301(720, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method301(720, arg2[arg0 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(I[CI[C)I")
    private static final int method292(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method301(720, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 70 / arg2;
            int var6 = 0;
            for (int var7 = arg0 + 1; var7 < arg1.length && method301(720, arg3[var7]); var7++) {
                if (arg3[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method301(720, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CB[[B[C)V")
    public static final void method293(char[] arg0, byte arg1, byte[][] arg2, char[] arg3) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg3.length; var5 += var9) {
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
                    if (var7 < arg3.length && (var16 = method296(0, arg3[var7], var15, var14)) > 0) {
                        if (var16 == 1 && method304(6, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method304(6, var14) || method304(6, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method296(0, arg3[var7 - 1], var15, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg3.length || !method302(var14, field941)) {
                                break label167;
                            }
                            if (method301(720, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method304(6, var14)) {
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
            if (var7 >= arg3.length && (!var11 || !var12)) {
                boolean var18 = true;
                if (var10) {
                    boolean var23 = false;
                    boolean var24 = false;
                    if (var5 - 1 < 0 || method301(720, arg0[var5 - 1]) && arg0[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg0.length || method301(720, arg0[var6]) && arg0[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method301(720, arg0[var26]) || arg0[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg0.length && (!method301(720, arg0[var26 + var28]) || arg0[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg0[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method301(720, arg0[var26 - 1]) || arg0[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method307(var27, true)) {
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
                    byte var21 = method297((byte) 2, var19);
                    byte var22 = method297((byte) 2, var20);
                    if (arg2 != null && method294(var21, arg2, var22, 0)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method304(6, arg0[var33])) {
                            var30++;
                        } else if (method303(arg0[var33], 0)) {
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
        if (arg1 != 7) {
            field935 = 173;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(B[[BBI)Z")
    private static final boolean method294(byte arg0, byte[][] arg1, byte arg2, int arg3) {
        int var4 = 0;
        if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg3 != 0) {
            field929 = !field929;
        }
        if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
            return true;
        }
        do {
            int var6 = (var4 + var5) / 2;
            if (arg1[var6][0] == arg0 && arg1[var6][1] == arg2) {
                return true;
            }
            if (arg0 < arg1[var6][0] || arg1[var6][0] == arg0 && arg2 < arg1[var6][1]) {
                var5 = var6;
            } else {
                var4 = var6;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CCIC)I")
    private static final int method295(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg1 == '(' && arg0 == ')') {
            return 2;
        } else if (arg3 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg3 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg3 == 's' && arg1 == '$') {
            return 1;
        } else if (arg3 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(ICCC)I")
    private static final int method296(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            return 0;
        } else if (arg1 == arg3) {
            return 1;
        } else {
            if (arg1 >= 'a' && arg1 <= 'm') {
                if (arg1 == 'a') {
                    if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                        if (arg3 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'b') {
                    if (arg3 != '6' && arg3 != '8') {
                        if ((arg3 != '1' || arg2 != '3') && (arg3 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg1 == 'c') {
                    if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'd') {
                    if ((arg3 != '[' || arg2 != ')') && (arg3 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'e') {
                    if (arg3 != '3' && arg3 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'f') {
                    if (arg3 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg3 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'g') {
                    if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'h') {
                    if (arg3 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'i') {
                    if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
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
                    if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
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
                    if (arg3 != '0' && arg3 != '*') {
                        if ((arg3 != '(' || arg2 != ')') && (arg3 != '[' || arg2 != ']') && (arg3 != '{' || arg2 != '}') && (arg3 != '<' || arg2 != '>')) {
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
                    if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 't') {
                    if (arg3 != '7' && arg3 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'u') {
                    if (arg3 == 'v') {
                        return 1;
                    }
                    if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'v') {
                    if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'w') {
                    if (arg3 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'x') {
                    if ((arg3 != ')' || arg2 != '(') && (arg3 != '}' || arg2 != '{') && (arg3 != ']' || arg2 != '[') && (arg3 != '>' || arg2 != '<')) {
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
                    if (arg3 == 'o' || arg3 == 'O') {
                        return 1;
                    } else if ((arg3 != '(' || arg2 != ')') && (arg3 != '{' || arg2 != '}') && (arg3 != '[' || arg2 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg1 == '1') {
                    return arg3 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg1 == ',') {
                return arg3 == '.' ? 1 : 0;
            } else if (arg1 == '.') {
                return arg3 == ',' ? 1 : 0;
            } else if (arg1 == '!') {
                return arg3 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(BC)B")
    private static final byte method297(byte arg0, char arg1) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        if (arg1 >= 'a' && arg1 <= 'z') {
            return (byte) (arg1 + 1 - 'a');
        } else if (arg1 == '\'') {
            return 28;
        } else if (arg1 >= '0' && arg1 <= '9') {
            return (byte) (arg1 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(Z[C)V")
    private static final void method298(boolean arg0, char[] arg1) {
        boolean var2 = false;
        if (!arg0) {
            return;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method299(arg1, (byte) -65, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method301(720, arg1[var8]) && !method302(arg1[var8], field941)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method300(var6, 0, arg1);
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

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "([CBI)I")
    private static final int method299(char[] arg0, byte arg1, int arg2) {
        if (arg1 != -65) {
            return field936;
        }
        for (int var3 = arg2; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(II[C)I")
    private static final int method300(int arg0, int arg1, char[] arg2) {
        if (arg1 != 0) {
            field937 = 196;
        }
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(IC)Z")
    private static final boolean method301(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return !method303(arg1, 0) && !method304(6, arg1);
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(CB)Z")
    private static final boolean method302(char arg0, byte arg1) {
        if (arg1 != 43) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CI)Z")
    private static final boolean method303(char arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(IC)Z")
    private static final boolean method304(int arg0, char arg1) {
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "(CI)Z")
    private static final boolean method305(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "a", descriptor = "(CZ)Z")
    private static final boolean method306(char arg0, boolean arg1) {
        if (arg1) {
            field939 = -100;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "b", descriptor = "([CZ)Z")
    private static final boolean method307(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method304(6, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method308(arg0, -484);
        int var5 = 0;
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = field943.length - 1;
        if (field943[var5] == var4 || field943[var7] == var4) {
            return true;
        }
        do {
            int var8 = (var5 + var7) / 2;
            if (field943[var8] == var4) {
                return true;
            }
            if (var4 < field943[var8]) {
                var7 = var8;
            } else {
                var5 = var8;
            }
        } while (var5 != var7 && var5 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "client!IHSJPYKH", name = "d", descriptor = "([CI)I")
    public static final int method308(char[] arg0, int arg1) {
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
        if (arg1 >= 0) {
            field940 = 438;
        }
        return var2;
    }
}
