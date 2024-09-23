import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DHIKSAEW")
public class class12 {

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "I")
    private static int field615 = 1;

    @OriginalMember(owner = "DHIKSAEW", name = "b", descriptor = "I")
    private static int field616 = 48698;

    @OriginalMember(owner = "DHIKSAEW", name = "c", descriptor = "Z")
    private static boolean field617 = true;

    @OriginalMember(owner = "DHIKSAEW", name = "d", descriptor = "I")
    private static int field618 = 133;

    @OriginalMember(owner = "DHIKSAEW", name = "e", descriptor = "I")
    private static int field619 = -934;

    @OriginalMember(owner = "DHIKSAEW", name = "f", descriptor = "Z")
    private static boolean field620 = true;

    @OriginalMember(owner = "DHIKSAEW", name = "g", descriptor = "I")
    private static int field621 = 6;

    @OriginalMember(owner = "DHIKSAEW", name = "h", descriptor = "I")
    private static int field622 = 829;

    @OriginalMember(owner = "DHIKSAEW", name = "i", descriptor = "I")
    private static int field623 = 890;

    @OriginalMember(owner = "DHIKSAEW", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field631 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "DHIKSAEW", name = "j", descriptor = "Z")
    private static boolean field624;

    @OriginalMember(owner = "DHIKSAEW", name = "r", descriptor = "Z")
    public static boolean field632;

    @OriginalMember(owner = "DHIKSAEW", name = "k", descriptor = "[I")
    private static int[] field625;

    @OriginalMember(owner = "DHIKSAEW", name = "p", descriptor = "[I")
    private static int[] field630;

    @OriginalMember(owner = "DHIKSAEW", name = "l", descriptor = "[[C")
    private static char[][] field626;

    @OriginalMember(owner = "DHIKSAEW", name = "n", descriptor = "[[C")
    private static char[][] field628;

    @OriginalMember(owner = "DHIKSAEW", name = "o", descriptor = "[[C")
    private static char[][] field629;

    @OriginalMember(owner = "DHIKSAEW", name = "m", descriptor = "[[[B")
    private static byte[][][] field627;

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(LTKEGJSFV;)V")
    public static final void method185(class58 arg0) {
        class15 var1 = new class15(arg0.method542("fragmentsenc.txt", null), false);
        class15 var2 = new class15(arg0.method542("badenc.txt", null), false);
        class15 var3 = new class15(arg0.method542("domainenc.txt", null), false);
        class15 var4 = new class15(arg0.method542("tldlist.txt", null), false);
        method186(var1, var2, var3, var4);
        if (class33.field1009) {
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(LEGCCHUZS;LEGCCHUZS;LEGCCHUZS;LEGCCHUZS;)V")
    private static final void method186(class15 arg0, class15 arg1, class15 arg2, class15 arg3) {
        method188((byte) 48, arg1);
        method189(arg2, -718);
        method190(arg0, 9);
        method187(3, arg3);
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(ILEGCCHUZS;)V")
    private static final void method187(int arg0, class15 arg1) {
        if (arg0 != 3) {
            return;
        }
        int var2 = arg1.method266();
        field629 = new char[var2][];
        field630 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field630[var3] = arg1.method261();
            char[] var4 = new char[arg1.method261()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method261();
            }
            field629[var3] = var4;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(BLEGCCHUZS;)V")
    private static final void method188(byte arg0, class15 arg1) {
        int var2 = arg1.method266();
        field626 = new char[var2][];
        if (arg0 == 48) {
            field627 = new byte[var2][][];
            method191(arg1, field627, 48698, field626);
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(LEGCCHUZS;I)V")
    private static final void method189(class15 arg0, int arg1) {
        if (arg1 < 0) {
            int var2 = arg0.method266();
            field628 = new char[var2][];
            method192(field628, false, arg0);
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "b", descriptor = "(LEGCCHUZS;I)V")
    private static final void method190(class15 arg0, int arg1) {
        field625 = new int[arg0.method266()];
        for (int var2 = 0; var2 < field625.length; var2++) {
            field625[var2] = arg0.method263();
        }
        int var3 = 96 / arg1;
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(LEGCCHUZS;[[[BI[[C)V")
    private static final void method191(class15 arg0, byte[][][] arg1, int arg2, char[][] arg3) {
        for (int var4 = 0; var4 < arg3.length; var4++) {
            char[] var5 = new char[arg0.method261()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method261();
            }
            arg3[var4] = var5;
            byte[][] var7 = new byte[arg0.method261()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method261();
                var7[var8][1] = (byte) arg0.method261();
            }
            if (var7.length > 0) {
                arg1[var4] = var7;
            }
        }
        if (field616 != arg2) {
            field624 = !field624;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([[CZLEGCCHUZS;)V")
    private static final void method192(char[][] arg0, boolean arg1, class15 arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg2.method261()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method261();
            }
            arg0[var3] = var4;
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CZ)V")
    private static final void method193(char[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method194(arg0[var3], (byte) 122)) {
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

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(CB)Z")
    private static final boolean method194(char arg0, byte arg1) {
        if (arg1 != 122) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method195(String arg0, int arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        method193(var4, true);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method203(var6, 0);
        method198(var6, 9742);
        method199(var6, field618);
        method212(var6, 890);
        for (int var8 = 0; var8 < field631.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field631[var8], var11 + 1)) != -1) {
                char[] var12 = field631[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method196(var5.toCharArray(), 0, var6);
        method197(var6, (byte) 9);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CI[C)V")
    private static final void method196(char[] arg0, int arg1, char[] arg2) {
        if (arg1 != 0) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method220(arg0[var3], -843)) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CB)V")
    private static final void method197(char[] arg0, byte arg1) {
        boolean var2 = true;
        if (arg1 == 9) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            char var6 = arg0[var5];
            if (!method217(var6, 3)) {
                var2 = true;
            } else if (var2) {
                if (method219((byte) 0, var6)) {
                    var2 = false;
                }
            } else if (method220(var6, -843)) {
                arg0[var5] = (char) (var6 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CI)V")
    private static final void method198(char[] arg0, int arg1) {
        if (arg1 != 9742) {
            field615 = -331;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field626.length - 1; var3 >= 0; var3--) {
                method207(0, field626[var3], field627[var3], arg0);
            }
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "b", descriptor = "([CI)V")
    private static final void method199(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method207(0, var3, null, var2);
        if (arg1 <= 0) {
            return;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method207(0, var5, null, var4);
        for (int var6 = field628.length - 1; var6 >= 0; var6--) {
            method200(field628[var6], 712, var2, var4, arg0);
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CI[C[C[C)V")
    private static final void method200(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var6 = 59 / arg1;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg0.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label57: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label57;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg0.length && (var14 = method209(var12, arg0[var9], field620, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label57;
                        }
                        int var15;
                        if ((var15 = method209(var12, arg0[var9 - 1], field620, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method215(var12, 0)) {
                                break label57;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method201(var7, 79, arg2, arg4);
                int var18 = method202(var8 - 1, field619, arg3, arg4);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg4[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(II[C[C)I")
    private static final int method201(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 <= 0) {
            field620 = !field620;
        }
        if (arg0 == 0) {
            return 2;
        }
        for (int var4 = arg0 - 1; var4 >= 0 && method215(arg3[var4], 0); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg0 - 1; var6 >= 0 && method215(arg2[var6], 0); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (var5 >= 3) {
            return 4;
        } else if (method215(arg3[arg0 - 1], 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "b", descriptor = "(II[C[C)I")
    private static final int method202(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method215(arg3[var4], 0)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 >= 0) {
                return 1;
            }
            for (int var6 = arg0 + 1; var6 < arg3.length && method215(arg2[var6], 0); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method215(arg3[arg0 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "c", descriptor = "([CI)V")
    private static final void method203(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method207(0, var3, null, var2);
        if (arg1 != 0) {
            field616 = -281;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method207(0, var5, null, var4);
        for (int var6 = 0; var6 < field629.length; var6++) {
            method204(field630[var6], field629[var6], var2, (byte) 9, var4, arg0);
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(I[C[CB[C[C)V")
    private static final void method204(int arg0, char[] arg1, char[] arg2, byte arg3, char[] arg4, char[] arg5) {
        if (arg3 != 9) {
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
                    if (var10 < arg1.length && (var15 = method209(var13, arg1[var10], field620, var14)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label128;
                        }
                        int var16;
                        if ((var16 = method209(var13, arg1[var10 - 1], field620, var14)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg1.length || !method215(var13, 0)) {
                                break label128;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg1.length) {
                boolean var17 = false;
                int var18 = method205(arg5, var8, arg2, -335);
                int var19 = method206(arg4, var9 - 1, arg5, (byte) 7);
                if (arg0 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg0 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg0 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg0 == 3 && var18 > 2 && var19 > 0) {
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
                                if (method215(arg5[var25], 0)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method215(arg5[var25], 0)) {
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
                                    if (arg4[var27] != '*') {
                                        break;
                                    }
                                    var21 = var27;
                                } else if (arg4[var27] == '*') {
                                    var21 = var27;
                                    var26 = true;
                                }
                            }
                        }
                        boolean var28 = false;
                        for (int var29 = var21 + 1; var29 < arg5.length; var29++) {
                            if (var28) {
                                if (method215(arg5[var29], 0)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method215(arg5[var29], 0)) {
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

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CI[CI)I")
    private static final int method205(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method215(arg0[var4], 0)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg1 - 1; var6 >= 0 && method215(arg2[var6], 0); var6--) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            while (arg3 >= 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method215(arg0[arg1 - 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CI[CB)I")
    private static final int method206(char[] arg0, int arg1, char[] arg2, byte arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method215(arg2[var4], 0)) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 != 7) {
                return 3;
            }
            for (int var6 = arg1 + 1; var6 < arg2.length && method215(arg0[var6], 0); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method215(arg2[arg1 + 1], 0)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(I[C[[B[C)V")
    public static final void method207(int arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        if (arg0 != 0) {
            field624 = !field624;
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
                    if (var7 < arg1.length && (var16 = method210(arg1[var7], false, var15, var14)) > 0) {
                        if (var16 == 1 && method218(3, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method218(3, var14) || method218(3, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label172;
                        }
                        int var17;
                        if ((var17 = method210(arg1[var7 - 1], false, var15, var14)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method216(0, var14)) {
                                break label172;
                            }
                            if (method215(var14, 0) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method218(3, var14)) {
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
                    if (var5 - 1 < 0 || method215(arg3[var5 - 1], 0) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method215(arg3[var6], 0) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method215(arg3[var26], 0) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method215(arg3[var26 + var28], 0) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method215(arg3[var26 - 1], 0) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method221(1, var27)) {
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
                    byte var21 = method211(829, var19);
                    byte var22 = method211(829, var20);
                    if (arg2 != null && method208(arg2, var21, 5905, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method218(3, arg3[var33])) {
                            var30++;
                        } else if (method217(arg3[var33], 3)) {
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

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([[BBIB)Z")
    private static final boolean method208(byte[][] arg0, byte arg1, int arg2, byte arg3) {
        int var4 = 0;
        if (arg0[var4][0] == arg1 && arg0[var4][1] == arg3) {
            return true;
        }
        int var5 = arg0.length - 1;
        if (arg2 != 5905) {
            throw new NullPointerException();
        } else if (arg0[var5][0] == arg1 && arg0[var5][1] == arg3) {
            return true;
        } else {
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
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(CCZC)I")
    private static final int method209(char arg0, char arg1, boolean arg2, char arg3) {
        if (!arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == arg1) {
            return 1;
        } else if (arg1 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg0 == '(' && arg3 == ')') {
            return 2;
        } else if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
            return 1;
        } else if (arg1 == 'e' && arg0 == '€') {
            return 1;
        } else if (arg1 == 's' && arg0 == '$') {
            return 1;
        } else if (arg1 == 'l' && arg0 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(CZCC)I")
    private static final int method210(char arg0, boolean arg1, char arg2, char arg3) {
        if (arg1) {
            return 0;
        } else if (arg0 == arg3) {
            return 1;
        } else {
            if (arg0 >= 'a' && arg0 <= 'm') {
                if (arg0 == 'a') {
                    if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                        if (arg3 == '/' && arg2 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'b') {
                    if (arg3 != '6' && arg3 != '8') {
                        if ((arg3 != '1' || arg2 != '3') && (arg3 != 'i' || arg2 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg0 == 'c') {
                    if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'd') {
                    if ((arg3 != '[' || arg2 != ')') && (arg3 != 'i' || arg2 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'e') {
                    if (arg3 != '3' && arg3 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'f') {
                    if (arg3 == 'p' && arg2 == 'h') {
                        return 2;
                    }
                    if (arg3 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'g') {
                    if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'h') {
                    if (arg3 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'i') {
                    if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'j') {
                    return 0;
                }
                if (arg0 == 'k') {
                    return 0;
                }
                if (arg0 == 'l') {
                    if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'm') {
                    return 0;
                }
            }
            if (arg0 >= 'n' && arg0 <= 'z') {
                if (arg0 == 'n') {
                    return 0;
                }
                if (arg0 == 'o') {
                    if (arg3 != '0' && arg3 != '*') {
                        if ((arg3 != '(' || arg2 != ')') && (arg3 != '[' || arg2 != ']') && (arg3 != '{' || arg2 != '}') && (arg3 != '<' || arg2 != '>')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg0 == 'p') {
                    return 0;
                }
                if (arg0 == 'q') {
                    return 0;
                }
                if (arg0 == 'r') {
                    return 0;
                }
                if (arg0 == 's') {
                    if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 't') {
                    if (arg3 != '7' && arg3 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'u') {
                    if (arg3 == 'v') {
                        return 1;
                    }
                    if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'v') {
                    if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'w') {
                    if (arg3 == 'v' && arg2 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg0 == 'x') {
                    if ((arg3 != ')' || arg2 != '(') && (arg3 != '}' || arg2 != '{') && (arg3 != ']' || arg2 != '[') && (arg3 != '>' || arg2 != '<')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'y') {
                    return 0;
                }
                if (arg0 == 'z') {
                    return 0;
                }
            }
            if (arg0 >= '0' && arg0 <= '9') {
                if (arg0 == '0') {
                    if (arg3 == 'o' || arg3 == 'O') {
                        return 1;
                    } else if ((arg3 != '(' || arg2 != ')') && (arg3 != '{' || arg2 != '}') && (arg3 != '[' || arg2 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg0 == '1') {
                    return arg3 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg0 == ',') {
                return arg3 == '.' ? 1 : 0;
            } else if (arg0 == '.') {
                return arg3 == ',' ? 1 : 0;
            } else if (arg0 == '!') {
                return arg3 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(IC)B")
    private static final byte method211(int arg0, char arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return (byte) (arg1 + 1 - 'a');
        } else if (arg1 == '\'') {
            return 28;
        } else if (arg1 >= '0' && arg1 <= '9') {
            return (byte) (arg1 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "d", descriptor = "([CI)V")
    private static final void method212(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 31 / arg1;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method213(var3, arg0, true)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method215(arg0[var9], 0) && !method216(0, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var6 = var7;
                }
                var3 = method214(arg0, var7, 2);
                int var10 = 0;
                for (int var11 = var7; var11 < var3; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var3 - var7 <= 8) {
                    var4++;
                } else {
                    var4 = 0;
                }
            } while (var4 != 4);
            for (int var12 = var6; var12 < var3; var12++) {
                arg0[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(I[CZ)I")
    private static final int method213(int arg0, char[] arg1, boolean arg2) {
        if (!arg2) {
            field621 = 62;
        }
        for (int var3 = arg0; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "([CII)I")
    private static final int method214(char[] arg0, int arg1, int arg2) {
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg2 < 2 || arg2 > 2) {
                field619 = 44;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(CI)Z")
    private static final boolean method215(char arg0, int arg1) {
        if (arg1 != 0) {
            field620 = !field620;
        }
        return !method217(arg0, 3) && !method218(3, arg0);
    }

    @OriginalMember(owner = "DHIKSAEW", name = "b", descriptor = "(IC)Z")
    private static final boolean method216(int arg0, char arg1) {
        if (arg0 != 0) {
            field618 = 226;
        }
        if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "b", descriptor = "(CI)Z")
    private static final boolean method217(char arg0, int arg1) {
        if (arg1 < 3 || arg1 > 3) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "DHIKSAEW", name = "c", descriptor = "(IC)Z")
    private static final boolean method218(int arg0, char arg1) {
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(BC)Z")
    private static final boolean method219(byte arg0, char arg1) {
        if (arg0 != 0) {
            field621 = 86;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "DHIKSAEW", name = "c", descriptor = "(CI)Z")
    private static final boolean method220(char arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'A' && arg0 <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(I[C)Z")
    private static final boolean method221(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method218(3, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method222((byte) 7, arg1);
        int var5 = 0;
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
        int var6 = field625.length - 1;
        if (field625[var5] == var4 || field625[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field625[var7] == var4) {
                return true;
            }
            if (var4 < field625[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "DHIKSAEW", name = "a", descriptor = "(B[C)I")
    public static final int method222(byte arg0, char[] arg1) {
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
        if (arg0 == 7) {
            return var2;
        } else {
            return 2;
        }
    }
}
