import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class WordFilter {

    @OriginalMember(owner = "ic", name = "c", descriptor = "I")
    private static int field964 = -497;

    @OriginalMember(owner = "ic", name = "d", descriptor = "Z")
    private static boolean field965 = true;

    @OriginalMember(owner = "ic", name = "e", descriptor = "I")
    private static int field966 = -12807;

    @OriginalMember(owner = "ic", name = "f", descriptor = "I")
    private static int field967 = 6;

    @OriginalMember(owner = "ic", name = "g", descriptor = "B")
    private static byte field968 = 8;

    @OriginalMember(owner = "ic", name = "o", descriptor = "[Ljava/lang/String;")
    private static final String[] field976 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

    @OriginalMember(owner = "ic", name = "a", descriptor = "I")
    private static int field962;

    @OriginalMember(owner = "ic", name = "h", descriptor = "I")
    private static int field969;

    @OriginalMember(owner = "ic", name = "b", descriptor = "Z")
    private static boolean field963;

    @OriginalMember(owner = "ic", name = "p", descriptor = "Z")
    public static boolean field977;

    @OriginalMember(owner = "ic", name = "i", descriptor = "[I")
    private static int[] field970;

    @OriginalMember(owner = "ic", name = "n", descriptor = "[I")
    private static int[] field975;

    @OriginalMember(owner = "ic", name = "j", descriptor = "[[C")
    private static char[][] field971;

    @OriginalMember(owner = "ic", name = "l", descriptor = "[[C")
    private static char[][] field973;

    @OriginalMember(owner = "ic", name = "m", descriptor = "[[C")
    private static char[][] field974;

    @OriginalMember(owner = "ic", name = "k", descriptor = "[[[B")
    private static byte[][][] field972;

    @OriginalMember(owner = "ic", name = "a", descriptor = "(Ltb;)V")
    public static final void method286(Jagfile arg0) {
        Packet var1 = new Packet(arg0.method225(0, null, "fragmentsenc.txt"), (byte) 63);
        Packet var2 = new Packet(arg0.method225(0, null, "badenc.txt"), (byte) 63);
        Packet var3 = new Packet(arg0.method225(0, null, "domainenc.txt"), (byte) 63);
        Packet var4 = new Packet(arg0.method225(0, null, "tldlist.txt"), (byte) 63);
        method287(var1, var2, var3, var4);
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(Ljb;Ljb;Ljb;Ljb;)V")
    private static final void method287(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
        method289((byte) 4, arg1);
        method290(102, arg2);
        method291(115, arg0);
        method288(field965, arg3);
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZLjb;)V")
    private static final void method288(boolean arg0, Packet arg1) {
        if (!arg0) {
            field964 = -270;
        }
        int var2 = arg1.method190();
        field974 = new char[var2][];
        field975 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field975[var3] = arg1.method185();
            char[] var4 = new char[arg1.method185()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method185();
            }
            field974[var3] = var4;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(BLjb;)V")
    private static final void method289(byte arg0, Packet arg1) {
        int var2 = arg1.method190();
        field971 = new char[var2][];
        field972 = new byte[var2][][];
        method292(0, arg1, field972, field971);
        if (arg0 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ILjb;)V")
    private static final void method290(int arg0, Packet arg1) {
        int var2 = arg1.method190();
        field973 = new char[var2][];
        method293(arg1, -687, field973);
        int var3 = 82 / arg0;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(ILjb;)V")
    private static final void method291(int arg0, Packet arg1) {
        field970 = new int[arg1.method190()];
        int var2 = 76 / arg0;
        for (int var3 = 0; var3 < field970.length; var3++) {
            field970[var3] = arg1.method187();
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ILjb;[[[B[[C)V")
    private static final void method292(int arg0, Packet arg1, byte[][][] arg2, char[][] arg3) {
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg1.method185()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method185();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg1.method185()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method185();
                var7[var8][1] = (byte) arg1.method185();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(Ljb;I[[C)V")
    private static final void method293(Packet arg0, int arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg0.method185()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method185();
            }
            arg2[var3] = var4;
        }
        while (arg1 >= 0) {
            field964 = -364;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(B[C)V")
    private static final void method294(byte arg0, char[] arg1) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            if (!method295(arg1[var4], 966)) {
                arg1[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(CI)Z")
    private static final boolean method295(char arg0, int arg1) {
        int var2 = 11 / arg1;
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method296(int arg0, String arg1) {
        if (arg0 != -12807) {
            throw new NullPointerException();
        }
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toLowerCase().toCharArray();
        method294((byte) 3, var4);
        method304(4, var4);
        method299(var4, 552);
        method300(var4, 901);
        method313(var4, 10513);
        for (int var5 = 0; var5 < field976.length; var5++) {
            int var8 = -1;
            while ((var8 = arg1.indexOf(field976[var5], var8 + 1)) != -1) {
                char[] var9 = field976[var5].toCharArray();
                for (int var10 = 0; var10 < var9.length; var10++) {
                    var4[var8 + var10] = var9[var10];
                }
            }
        }
        method297(arg1.toCharArray(), (byte) 7, var4);
        method298(false, var4);
        long var6 = System.currentTimeMillis();
        return (new String(var4)).trim();
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([CB[C)V")
    private static final void method297(char[] arg0, byte arg1, char[] arg2) {
        if (arg1 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            if (arg2[var4] != '*' && method321(arg0[var4], (byte) 85)) {
                arg2[var4] = arg0[var4];
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(Z[C)V")
    private static final void method298(boolean arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method318(var4, 0)) {
                var2 = true;
            } else if (var2) {
                if (method320((byte) 7, var4)) {
                    var2 = false;
                }
            } else if (method321(var4, (byte) 85)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([CI)V")
    private static final void method299(char[] arg0, int arg1) {
        int var2 = 23 / arg1;
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field971.length - 1; var4 >= 0; var4--) {
                method308(arg0, field971[var4], 0, field972[var4]);
            }
        }
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "([CI)V")
    private static final void method300(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method308(var2, var3, 0, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method308(var4, var5, 0, null);
        int var6 = 63 / arg1;
        for (int var7 = field973.length - 1; var7 >= 0; var7--) {
            method301(var4, true, var2, arg0, field973[var7]);
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([CZ[C[C[C)V")
    private static final void method301(char[] arg0, boolean arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (!arg1) {
            field962 = -204;
        }
        if (arg4.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg3.length - arg4.length; var6 += var9) {
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
                    if (var8 < arg4.length && (var13 = method310(true, arg4[var8], var12, var11)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method310(true, arg4[var8 - 1], var12, var11)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg4.length || !method316(false, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg4.length) {
                boolean var15 = false;
                int var16 = method302(var6, field967, arg2, arg3);
                int var17 = method303(arg3, var7 - 1, true, arg0);
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

    @OriginalMember(owner = "ic", name = "a", descriptor = "(II[C[C)I")
    private static final int method302(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method316(false, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        if (arg1 != 6) {
            return 3;
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method316(false, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method316(false, arg3[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([CIZ[C)I")
    private static final int method303(char[] arg0, int arg1, boolean arg2, char[] arg3) {
        if (arg1 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg0.length && method316(false, arg0[var4])) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg0.length && method316(false, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (!arg2) {
                return 3;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method316(false, arg0[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(I[C)V")
    private static final void method304(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method308(var2, var3, 0, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method308(var4, var5, 0, null);
        if (arg0 == 4) {
            for (int var6 = 0; var6 < field974.length; var6++) {
                method305(var4, var2, field974[var6], 175, field975[var6], arg1);
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([C[C[CII[C)V")
    private static final void method305(char[] arg0, char[] arg1, char[] arg2, int arg3, int arg4, char[] arg5) {
        if (arg2.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var7 = 20 / arg3;
        int var11;
        for (int var8 = 0; var8 <= arg5.length - arg2.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label124: while (true) {
                while (true) {
                    if (var9 >= arg5.length) {
                        break label124;
                    }
                    boolean var12 = false;
                    char var13 = arg5[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg5.length) {
                        var14 = arg5[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg2.length && (var15 = method310(true, arg2[var10], var14, var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label124;
                        }
                        int var16;
                        if ((var16 = method310(true, arg2[var10 - 1], var14, var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg2.length || !method316(false, var13)) {
                                break label124;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg2.length) {
                boolean var17 = false;
                int var18 = method306(field968, var8, arg5, arg1);
                int var19 = method307(arg5, var9 - 1, 261, arg0);
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
                    int var20 = var8;
                    int var21 = var9 - 1;
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var22 = false;
                            for (int var23 = var8 - 1; var23 >= 0; var23--) {
                                if (var22) {
                                    if (arg1[var23] != '*') {
                                        break;
                                    }
                                    var20 = var23;
                                } else if (arg1[var23] == '*') {
                                    var20 = var23;
                                    var22 = true;
                                }
                            }
                        }
                        boolean var24 = false;
                        for (int var25 = var20 - 1; var25 >= 0; var25--) {
                            if (var24) {
                                if (method316(false, arg5[var25])) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method316(false, arg5[var25])) {
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
                                    if (arg0[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg0[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg5.length; var29++) {
                            if (var28) {
                                if (method316(false, arg5[var29])) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method316(false, arg5[var29])) {
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

    @OriginalMember(owner = "ic", name = "a", descriptor = "(BI[C[C)I")
    private static final int method306(byte arg0, int arg1, char[] arg2, char[] arg3) {
        if (field968 != arg0) {
            field967 = 122;
        }
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method316(false, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method316(false, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method316(false, arg2[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([CII[C)I")
    private static final int method307(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 <= 0) {
            field964 = -274;
        }
        if (arg1 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg0.length && method316(false, arg0[var4])) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 + 1; var6 < arg0.length && method316(false, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method316(false, arg0[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([C[CI[[B)V")
    private static final void method308(char[] arg0, char[] arg1, int arg2, byte[][] arg3) {
        if (arg2 != 0 || arg1.length > arg0.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg0.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            label130: while (true) {
                while (true) {
                    if (var6 >= arg0.length) {
                        break label130;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var6];
                    char var13 = 0;
                    if (var6 + 1 < arg0.length) {
                        var13 = arg0[var6 + 1];
                    }
                    int var14;
                    if (var7 < arg1.length && (var14 = method311(var12, arg1[var7], 0, var13)) > 0) {
                        var6 += var14;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label130;
                        }
                        int var15;
                        if ((var15 = method311(var12, arg1[var7 - 1], 0, var13)) > 0) {
                            var6 += var15;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method317(field969, var12)) {
                                break label130;
                            }
                            if (method316(false, var12) && var12 != '\'') {
                                var10 = true;
                            }
                            var6++;
                            var8++;
                            if (var8 * 100 / (var6 - var5) > 90) {
                                break label130;
                            }
                        }
                    }
                }
            }
            if (var7 >= arg1.length) {
                boolean var16 = true;
                if (var10) {
                    boolean var21 = false;
                    boolean var22 = false;
                    if (var5 - 1 < 0 || method316(false, arg0[var5 - 1]) && arg0[var5 - 1] != '\'') {
                        var21 = true;
                    }
                    if (var6 >= arg0.length || method316(false, arg0[var6]) && arg0[var6] != '\'') {
                        var22 = true;
                    }
                    if (!var21 || !var22) {
                        boolean var23 = false;
                        int var24 = var5 - 2;
                        if (var21) {
                            var24 = var5;
                        }
                        while (!var23 && var24 < var6) {
                            if (var24 >= 0 && (!method316(false, arg0[var24]) || arg0[var24] == '\'')) {
                                char[] var25 = new char[3];
                                int var26;
                                for (var26 = 0; var26 < 3 && var24 + var26 < arg0.length && (!method316(false, arg0[var24 + var26]) || arg0[var24 + var26] == '\''); var26++) {
                                    var25[var26] = arg0[var24 + var26];
                                }
                                boolean var27 = true;
                                if (var26 == 0) {
                                    var27 = false;
                                }
                                if (var26 < 3 && var24 - 1 >= 0 && (!method316(false, arg0[var24 - 1]) || arg0[var24 - 1] == '\'')) {
                                    var27 = false;
                                }
                                if (var27 && !method322(var25, -136)) {
                                    var23 = true;
                                }
                            }
                            var24++;
                        }
                        if (!var23) {
                            var16 = false;
                        }
                    }
                } else {
                    char var17 = ' ';
                    if (var5 - 1 >= 0) {
                        var17 = arg0[var5 - 1];
                    }
                    char var18 = ' ';
                    if (var6 < arg0.length) {
                        var18 = arg0[var6];
                    }
                    byte var19 = method312((byte) 9, var17);
                    byte var20 = method312((byte) 9, var18);
                    if (arg3 != null && method309(arg3, (byte) -114, var20, var19)) {
                        var16 = false;
                    }
                }
                if (var16) {
                    int var28 = 0;
                    for (int var29 = var5; var29 < var6; var29++) {
                        if (method319(arg0[var29], 0)) {
                            var28++;
                        }
                    }
                    if (var28 * 100 / (var6 - var5) <= 50) {
                        for (int var30 = var5; var30 < var6; var30++) {
                            arg0[var30] = '*';
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "([[BBBB)Z")
    private static final boolean method309(byte[][] arg0, byte arg1, byte arg2, byte arg3) {
        int var4 = 0;
        if (arg1 != -114) {
            throw new NullPointerException();
        } else if (arg0[var4][0] == arg3 && arg0[var4][1] == arg2) {
            return true;
        } else {
            int var5 = arg0.length - 1;
            if (arg0[var5][0] == arg3 && arg0[var5][1] == arg2) {
                return true;
            }
            do {
                int var6 = (var4 + var5) / 2;
                if (arg0[var6][0] == arg3 && arg0[var6][1] == arg2) {
                    return true;
                }
                if (arg3 < arg0[var6][0] || arg0[var6][0] == arg3 && arg2 < arg0[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZCCC)I")
    private static final int method310(boolean arg0, char arg1, char arg2, char arg3) {
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg3) {
            return 1;
        } else if (arg1 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg3 == '(' && arg2 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg1 == 's' && arg3 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(CCIC)I")
    private static final int method311(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 < 0 || arg2 > 0) {
            return 2;
        } else if (arg0 == arg1) {
            return 1;
        } else {
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
                    if (arg0 == '1' && arg3 == '3') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'c') {
                    if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'd') {
                    return 0;
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
                    if (arg0 != '9' && arg0 != '6') {
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
                        if ((arg0 != '(' || arg3 != ')') && (arg0 != '[' || arg3 != ']') && (arg0 != '{' || arg3 != '}') && (arg0 != '<' || arg3 != '>')) {
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
                    if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 't') {
                    if (arg0 == '7') {
                        return 1;
                    }
                    return 0;
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
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(BC)B")
    private static final byte method312(byte arg0, char arg1) {
        if (arg0 != 9) {
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

    @OriginalMember(owner = "ic", name = "c", descriptor = "([CI)V")
    private static final void method313(char[] arg0, int arg1) {
        boolean var2 = false;
        if (arg1 != 10513) {
            field967 = 58;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method314(arg0, var3, 0)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method316(false, arg0[var8]) && !method317(field969, arg0[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method315(-34716, arg0, var6);
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

    @OriginalMember(owner = "ic", name = "a", descriptor = "([CII)I")
    private static final int method314(char[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return field969;
        }
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(I[CI)I")
    private static final int method315(int arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != -34716) {
                return field969;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZC)Z")
    private static final boolean method316(boolean arg0, char arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method318(arg1, 0) && !method319(arg1, 0);
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(IC)Z")
    private static final boolean method317(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(CI)Z")
    private static final boolean method318(char arg0, int arg1) {
        if (arg1 != 0) {
            field967 = 10;
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "ic", name = "c", descriptor = "(CI)Z")
    private static final boolean method319(char arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(BC)Z")
    private static final boolean method320(byte arg0, char arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(CB)Z")
    private static final boolean method321(char arg0, byte arg1) {
        if (arg1 != 85) {
            field969 = -437;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "ic", name = "d", descriptor = "([CI)Z")
    private static final boolean method322(char[] arg0, int arg1) {
        boolean var2 = true;
        if (arg1 >= 0) {
            field963 = !field963;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method319(arg0[var3], 0) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method323((byte) 123, arg0);
        int var5 = 0;
        int var6 = field970.length - 1;
        if (field970[var5] == var4 || field970[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field970[var7] == var4) {
                return true;
            }
            if (var4 < field970[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "ic", name = "b", descriptor = "(B[C)I")
    private static final int method323(byte arg0, char[] arg1) {
        if (arg0 != 123) {
            return field967;
        } else if (arg1.length > 6) {
            return 0;
        } else {
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
            return var2;
        }
    }
}
