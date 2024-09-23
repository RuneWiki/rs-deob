import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IHYZEVYW")
public class class28 {

    @OriginalMember(owner = "IHYZEVYW", name = "d", descriptor = "I")
    private static int field863 = 3;

    @OriginalMember(owner = "IHYZEVYW", name = "e", descriptor = "I")
    private static int field864 = -82;

    @OriginalMember(owner = "IHYZEVYW", name = "f", descriptor = "Z")
    private static boolean field865 = true;

    @OriginalMember(owner = "IHYZEVYW", name = "g", descriptor = "I")
    private static int field866 = -6300;

    @OriginalMember(owner = "IHYZEVYW", name = "i", descriptor = "I")
    private static int field868 = -418;

    @OriginalMember(owner = "IHYZEVYW", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field876 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "Z")
    private static boolean field860;

    @OriginalMember(owner = "IHYZEVYW", name = "b", descriptor = "Z")
    private static boolean field861;

    @OriginalMember(owner = "IHYZEVYW", name = "c", descriptor = "Z")
    private static boolean field862;

    @OriginalMember(owner = "IHYZEVYW", name = "h", descriptor = "Z")
    private static boolean field867;

    @OriginalMember(owner = "IHYZEVYW", name = "j", descriptor = "Z")
    private static boolean field869;

    @OriginalMember(owner = "IHYZEVYW", name = "r", descriptor = "Z")
    public static boolean field877;

    @OriginalMember(owner = "IHYZEVYW", name = "k", descriptor = "[I")
    private static int[] field870;

    @OriginalMember(owner = "IHYZEVYW", name = "p", descriptor = "[I")
    private static int[] field875;

    @OriginalMember(owner = "IHYZEVYW", name = "l", descriptor = "[[C")
    private static char[][] field871;

    @OriginalMember(owner = "IHYZEVYW", name = "n", descriptor = "[[C")
    private static char[][] field873;

    @OriginalMember(owner = "IHYZEVYW", name = "o", descriptor = "[[C")
    private static char[][] field874;

    @OriginalMember(owner = "IHYZEVYW", name = "m", descriptor = "[[[B")
    private static byte[][][] field872;

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(LOTSGNSQM;)V")
    public static final void method234(class41 arg0) {
        class68 var1 = new class68(arg0.method376("fragmentsenc.txt", null), -103);
        class68 var2 = new class68(arg0.method376("badenc.txt", null), -103);
        class68 var3 = new class68(arg0.method376("domainenc.txt", null), -103);
        class68 var4 = new class68(arg0.method376("tldlist.txt", null), -103);
        method235(var1, var2, var3, var4);
        if (class72.field1713) {
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(LYOXDZEVD;LYOXDZEVD;LYOXDZEVD;LYOXDZEVD;)V")
    private static final void method235(class68 arg0, class68 arg1, class68 arg2, class68 arg3) {
        method237(arg1, 9926);
        method238(982, arg2);
        method239(arg0, (byte) -11);
        method236((byte) 5, arg3);
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(BLYOXDZEVD;)V")
    private static final void method236(byte arg0, class68 arg1) {
        int var2 = arg1.method554();
        field874 = new char[var2][];
        field875 = new int[var2];
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < var2; var4++) {
            field875[var4] = arg1.method549();
            char[] var5 = new char[arg1.method549()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method549();
            }
            field874[var4] = var5;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(LYOXDZEVD;I)V")
    private static final void method237(class68 arg0, int arg1) {
        if (arg1 != 9926) {
            field864 = 190;
        }
        int var2 = arg0.method554();
        field871 = new char[var2][];
        field872 = new byte[var2][][];
        method240(arg0, false, field871, field872);
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(ILYOXDZEVD;)V")
    private static final void method238(int arg0, class68 arg1) {
        int var2 = 80 / arg0;
        int var3 = arg1.method554();
        field873 = new char[var3][];
        method241(field873, (byte) 99, arg1);
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(LYOXDZEVD;B)V")
    private static final void method239(class68 arg0, byte arg1) {
        field870 = new int[arg0.method554()];
        for (int var2 = 0; var2 < field870.length; var2++) {
            field870[var2] = arg0.method551();
        }
        if (arg1 != -11) {
            field861 = !field861;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(LYOXDZEVD;Z[[C[[[B)V")
    private static final void method240(class68 arg0, boolean arg1, char[][] arg2, byte[][][] arg3) {
        for (int var4 = 0; var4 < arg2.length; var4++) {
            char[] var5 = new char[arg0.method549()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method549();
            }
            arg2[var4] = var5;
            byte[][] var7 = new byte[arg0.method549()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method549();
                var7[var8][1] = (byte) arg0.method549();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([[CBLYOXDZEVD;)V")
    private static final void method241(char[][] arg0, byte arg1, class68 arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var5 = new char[arg2.method549()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method549();
            }
            arg0[var3] = var5;
        }
        if (arg1 != 99) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([CZ)V")
    private static final void method242(char[] arg0, boolean arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method243(false, arg0[var3])) {
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
        if (arg1) {
            field860 = !field860;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(ZC)Z")
    private static final boolean method243(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method244(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method242(var4, false);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method252(var6, 406);
        while (arg0 >= 0) {
            field863 = 456;
        }
        method247(true, var6);
        method248(681, var6);
        method261(true, var6);
        for (int var8 = 0; var8 < field876.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field876[var8], var11 + 1)) != -1) {
                char[] var12 = field876[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method245(var6, 2, var5.toCharArray());
        method246(8, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([CI[C)V")
    private static final void method245(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg0[var3] != '*' && method269(0, arg2[var3])) {
                arg0[var3] = arg2[var3];
            }
        }
        if (arg1 != 2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(I[C)V")
    private static final void method246(int arg0, char[] arg1) {
        if (arg0 < 8 || arg0 > 8) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method266(var4, 1)) {
                var2 = true;
            } else if (var2) {
                if (method268(-418, var4)) {
                    var2 = false;
                }
            } else if (method269(0, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(Z[C)V")
    private static final void method247(boolean arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field871.length - 1; var3 >= 0; var3--) {
                method256(field872[var3], field871[var3], 0, arg1);
            }
        }
        if (!arg0) {
            field860 = !field860;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "b", descriptor = "(I[C)V")
    private static final void method248(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method256(null, var3, 0, var2);
        char[] var4 = (char[]) arg1.clone();
        if (arg0 <= 0) {
            field869 = !field869;
        }
        char[] var5 = new char[] { 'd', 'o', 't' };
        method256(null, var5, 0, var4);
        for (int var6 = field873.length - 1; var6 >= 0; var6--) {
            method249(var4, field873[var6], arg1, var2, true);
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([C[C[C[CZ)V")
    private static final void method249(char[] arg0, char[] arg1, char[] arg2, char[] arg3, boolean arg4) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        int var9;
        for (int var6 = 0; var6 <= arg2.length - arg1.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label66: while (true) {
                while (true) {
                    if (var7 >= arg2.length) {
                        break label66;
                    }
                    boolean var10 = false;
                    char var11 = arg2[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg2.length) {
                        var12 = arg2[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg1.length && (var13 = method258(false, var12, var11, arg1[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label66;
                        }
                        int var14;
                        if ((var14 = method258(false, var12, var11, arg1[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method264(0, var11)) {
                                break label66;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method250(arg3, -6300, var6, arg2);
                int var17 = method251(var7 - 1, arg2, arg0, -30569);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg2[var18] = '*';
                    }
                }
            }
        }
        if (!arg4) {
            field865 = !field865;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([CII[C)I")
    private static final int method250(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method264(0, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        if (field866 != arg1) {
            return field863;
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method264(0, arg0[var6]); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method264(0, arg3[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(I[C[CI)I")
    private static final int method251(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method264(0, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != -30569) {
                field863 = 144;
            }
            for (int var6 = arg0 + 1; var6 < arg1.length && method264(0, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method264(0, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([CI)V")
    private static final void method252(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        char[] var4 = new char[] { 'd', 'o', 't' };
        method256(null, var4, 0, var2);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
        method256(null, var6, 0, var5);
        for (int var7 = 0; var7 < field874.length; var7++) {
            method253(8, field874[var7], field875[var7], var2, var5, arg0);
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(I[CI[C[C[C)V")
    private static final void method253(int arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg0 < 8 || arg0 > 8) {
            field862 = !field862;
        }
        if (arg1.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg1.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label132: while (true) {
                while (true) {
                    if (var8 >= arg5.length) {
                        break label132;
                    }
                    boolean var11 = false;
                    char var12 = arg5[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg5.length) {
                        var13 = arg5[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method258(false, var13, var12, arg1[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label132;
                        }
                        int var15;
                        if ((var15 = method258(false, var13, var12, arg1[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method264(0, var12)) {
                                break label132;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method254((byte) 0, var7, arg3, arg5);
                int var18 = method255(false, arg5, arg4, var8 - 1);
                if (arg2 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg2 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg2 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg2 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method264(0, arg5[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method264(0, arg5[var24])) {
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
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method264(0, arg5[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method264(0, arg5[var28])) {
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

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(BI[C[C)I")
    private static final int method254(byte arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method264(0, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method264(0, arg2[var6]); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg0 == 0) {
                boolean var7 = false;
                if (var5 >= 3) {
                    return 4;
                }
                if (method264(0, arg3[arg1 - 1])) {
                    return 1;
                }
                return 0;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(Z[C[CI)I")
    private static final int method255(boolean arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg1.length && method264(0, arg1[var4])) {
                if (arg1[var4] != '\\' && arg1[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg1.length && method264(0, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg0) {
                return field866;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method264(0, arg1[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([[B[CI[C)V")
    public static final void method256(byte[][] arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label176: while (true) {
                while (true) {
                    if (var7 >= arg3.length || var12 && var13) {
                        break label176;
                    }
                    boolean var14 = false;
                    char var15 = arg3[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg3.length) {
                        var16 = arg3[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg1.length && (var17 = method259((byte) 0, arg1[var8], var16, var15)) > 0) {
                        if (var17 == 1 && method267(var15, 2201)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method267(var15, 2201) || method267(var16, 2201))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label176;
                        }
                        int var18;
                        if ((var18 = method259((byte) 0, arg1[var8 - 1], var16, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method265(var15, 691)) {
                                break label176;
                            }
                            if (method264(0, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method267(var15, 2201)) {
                                var13 = true;
                            }
                            var7++;
                            var9++;
                            if (var9 * 100 / (var7 - var5) > 90) {
                                break label176;
                            }
                        }
                    }
                }
            }
            if (var8 >= arg1.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var5 - 1 < 0 || method264(0, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg3.length || method264(0, arg3[var7]) && arg3[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method264(0, arg3[var27]) || arg3[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg3.length && (!method264(0, arg3[var27 + var29]) || arg3[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg3[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method264(0, arg3[var27 - 1]) || arg3[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method270(true, var28)) {
                                    var26 = true;
                                }
                            }
                            var27++;
                        }
                        if (!var26) {
                            var19 = false;
                        }
                    }
                } else {
                    char var20 = ' ';
                    if (var5 - 1 >= 0) {
                        var20 = arg3[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg3.length) {
                        var21 = arg3[var7];
                    }
                    byte var22 = method260(var20, false);
                    byte var23 = method260(var21, false);
                    if (arg0 != null && method257(var23, arg0, var22, false)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method267(arg3[var34], 2201)) {
                            var31++;
                        } else if (method266(arg3[var34], 1)) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg3[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(B[[BBZ)Z")
    private static final boolean method257(byte arg0, byte[][] arg1, byte arg2, boolean arg3) {
        int var4 = 0;
        if (arg1[var4][0] == arg2 && arg1[var4][1] == arg0) {
            return true;
        }
        int var5 = arg1.length - 1;
        if (arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1[var5][0] == arg2 && arg1[var5][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var4 + var5) / 2;
            if (arg1[var7][0] == arg2 && arg1[var7][1] == arg0) {
                return true;
            }
            if (arg2 < arg1[var7][0] || arg1[var7][0] == arg2 && arg0 < arg1[var7][1]) {
                var5 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var5 && var4 + 1 != var5);
        return false;
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(ZCCC)I")
    private static final int method258(boolean arg0, char arg1, char arg2, char arg3) {
        if (arg0) {
            field867 = !field867;
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

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(BCCC)I")
    private static final int method259(byte arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 0) {
            return 4;
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

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(CZ)B")
    private static final byte method260(char arg0, boolean arg1) {
        if (arg1) {
            field861 = !field861;
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

    @OriginalMember(owner = "IHYZEVYW", name = "b", descriptor = "(Z[C)V")
    private static final void method261(boolean arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        while (true) {
            do {
                int var7;
                if ((var7 = method262(arg1, var3, 84)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method264(0, arg1[var9]) && !method265(arg1[var9], 691)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var7;
                }
                var3 = method263((byte) 13, arg1, var7);
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

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([CII)I")
    private static final int method262(char[] arg0, int arg1, int arg2) {
        for (int var3 = arg1; var3 < arg0.length && var3 >= 0; var3++) {
            if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                return var3;
            }
        }
        return arg2 <= 0 ? 1 : -1;
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(B[CI)I")
    private static final int method263(byte arg0, char[] arg1, int arg2) {
        int var3 = arg2;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg0 != 13) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(IC)Z")
    private static final boolean method264(int arg0, char arg1) {
        if (arg0 != 0) {
            field862 = !field862;
        }
        return !method266(arg1, 1) && !method267(arg1, 2201);
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "(CI)Z")
    private static final boolean method265(char arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "b", descriptor = "(CI)Z")
    private static final boolean method266(char arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "IHYZEVYW", name = "c", descriptor = "(CI)Z")
    private static final boolean method267(char arg0, int arg1) {
        if (arg1 != 2201) {
            field864 = -307;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "IHYZEVYW", name = "b", descriptor = "(IC)Z")
    private static final boolean method268(int arg0, char arg1) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "IHYZEVYW", name = "c", descriptor = "(IC)Z")
    private static final boolean method269(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "IHYZEVYW", name = "c", descriptor = "(Z[C)Z")
    private static final boolean method270(boolean arg0, char[] arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method267(arg1[var3], 2201) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method271(arg1, (byte) -24);
        int var5 = 0;
        int var6 = field870.length - 1;
        if (field870[var5] == var4 || field870[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field870[var7] == var4) {
                return true;
            }
            if (var4 < field870[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "IHYZEVYW", name = "a", descriptor = "([CB)I")
    public static final int method271(char[] arg0, byte arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != -24) {
            return field864;
        }
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
