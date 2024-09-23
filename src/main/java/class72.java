import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZCOZUVWP")
public class class72 {

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "I")
    private static int field1720 = 76;

    @OriginalMember(owner = "ZCOZUVWP", name = "d", descriptor = "Z")
    private static boolean field1723 = true;

    @OriginalMember(owner = "ZCOZUVWP", name = "e", descriptor = "I")
    private static int field1724 = 18;

    @OriginalMember(owner = "ZCOZUVWP", name = "m", descriptor = "[Ljava/lang/String;")
    private static final String[] field1732 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "ZCOZUVWP", name = "b", descriptor = "I")
    private static int field1721;

    @OriginalMember(owner = "ZCOZUVWP", name = "c", descriptor = "I")
    private static int field1722;

    @OriginalMember(owner = "ZCOZUVWP", name = "f", descriptor = "Z")
    private static boolean field1725;

    @OriginalMember(owner = "ZCOZUVWP", name = "n", descriptor = "Z")
    public static boolean field1733;

    @OriginalMember(owner = "ZCOZUVWP", name = "g", descriptor = "[I")
    private static int[] field1726;

    @OriginalMember(owner = "ZCOZUVWP", name = "l", descriptor = "[I")
    private static int[] field1731;

    @OriginalMember(owner = "ZCOZUVWP", name = "h", descriptor = "[[C")
    private static char[][] field1727;

    @OriginalMember(owner = "ZCOZUVWP", name = "j", descriptor = "[[C")
    private static char[][] field1729;

    @OriginalMember(owner = "ZCOZUVWP", name = "k", descriptor = "[[C")
    private static char[][] field1730;

    @OriginalMember(owner = "ZCOZUVWP", name = "i", descriptor = "[[[B")
    private static byte[][][] field1728;

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(LRVLWVPJQ;)V")
    public static final void method557(class50 arg0) {
        class55 var1 = new class55(741, arg0.method424("fragmentsenc.txt", null));
        class55 var2 = new class55(741, arg0.method424("badenc.txt", null));
        class55 var3 = new class55(741, arg0.method424("domainenc.txt", null));
        class55 var4 = new class55(741, arg0.method424("tldlist.txt", null));
        method558(var1, var2, var3, var4);
        if (class40.field1193) {
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(LUAWAYCTK;LUAWAYCTK;LUAWAYCTK;LUAWAYCTK;)V")
    private static final void method558(class55 arg0, class55 arg1, class55 arg2, class55 arg3) {
        method560((byte) 0, arg1);
        method561(-822, arg2);
        method562(0, arg0);
        method559(arg3, 936);
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(LUAWAYCTK;I)V")
    private static final void method559(class55 arg0, int arg1) {
        int var2 = arg0.method460();
        int var3 = 10 / arg1;
        field1730 = new char[var2][];
        field1731 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1731[var4] = arg0.method455();
            char[] var5 = new char[arg0.method455()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method455();
            }
            field1730[var4] = var5;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(BLUAWAYCTK;)V")
    private static final void method560(byte arg0, class55 arg1) {
        int var2 = arg1.method460();
        if (arg0 == 0) {
            boolean var3 = false;
            field1727 = new char[var2][];
            field1728 = new byte[var2][][];
            method563(arg1, field1727, 0, field1728);
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(ILUAWAYCTK;)V")
    private static final void method561(int arg0, class55 arg1) {
        int var2 = arg1.method460();
        field1729 = new char[var2][];
        method564(arg1, true, field1729);
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "b", descriptor = "(ILUAWAYCTK;)V")
    private static final void method562(int arg0, class55 arg1) {
        field1726 = new int[arg1.method460()];
        for (int var2 = 0; var2 < field1726.length; var2++) {
            field1726[var2] = arg1.method457();
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(LUAWAYCTK;[[CI[[[B)V")
    private static final void method563(class55 arg0, char[][] arg1, int arg2, byte[][][] arg3) {
        if (arg2 != 0) {
            return;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg0.method455()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method455();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg0.method455()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method455();
                var7[var8][1] = (byte) arg0.method455();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(LUAWAYCTK;Z[[C)V")
    private static final void method564(class55 arg0, boolean arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var5 = new char[arg0.method455()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method455();
            }
            arg2[var3] = var5;
        }
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([CI)V")
    private static final void method565(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method566(arg0[var3], field1723)) {
                arg0[var2] = arg0[var3];
            } else {
                arg0[var2] = ' ';
            }
            if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg1 < 0) {
            for (int var4 = var2; var4 < arg0.length; var4++) {
                arg0[var4] = ' ';
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(CZ)Z")
    private static final boolean method566(char arg0, boolean arg1) {
        if (!arg1) {
            field1721 = -50;
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method567(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        int var4 = 76 / arg0;
        char[] var5 = arg1.toCharArray();
        method565(var5, -437);
        String var6 = (new String(var5)).trim();
        char[] var7 = var6.toLowerCase().toCharArray();
        String var8 = var6.toLowerCase();
        method575(0, var7);
        method570((byte) 70, var7);
        method571(var7, 0);
        method584(var7, 609);
        for (int var9 = 0; var9 < field1732.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field1732[var9], var12 + 1)) != -1) {
                char[] var13 = field1732[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method568(var6.toCharArray(), 0, var7);
        method569((byte) -107, var7);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([CI[C)V")
    private static final void method568(char[] arg0, int arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method592(field1724, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
        if (arg1 != 0) {
            field1723 = !field1723;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(B[C)V")
    private static final void method569(byte arg0, char[] arg1) {
        if (arg0 != -107) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char var5 = arg1[var4];
            if (!method589(203, var5)) {
                var3 = true;
            } else if (var3) {
                if (method591(5, var5)) {
                    var3 = false;
                }
            } else if (method592(field1724, var5)) {
                arg1[var4] = (char) (var5 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "b", descriptor = "(B[C)V")
    private static final void method570(byte arg0, char[] arg1) {
        if (arg0 != 70) {
            field1721 = -385;
        }
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field1727.length - 1; var3 >= 0; var3--) {
                method579(field1727[var3], arg1, field1728[var3], false);
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "b", descriptor = "([CI)V")
    private static final void method571(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method579(var3, var2, null, false);
        if (arg1 != 0) {
            return;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method579(var5, var4, null, false);
        for (int var6 = field1729.length - 1; var6 >= 0; var6--) {
            method572(field1729[var6], true, arg0, var2, var4);
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([CZ[C[C[C)V")
    private static final void method572(char[] arg0, boolean arg1, char[] arg2, char[] arg3, char[] arg4) {
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var5 = true;
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg0.length; var7 += var10) {
            int var8 = var7;
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
                    if (var9 < arg0.length && (var14 = method581(arg0[var9], var12, false, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method581(arg0[var9 - 1], var12, false, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method587((byte) -126, var12)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method573((byte) 3, var7, arg3, arg2);
                int var18 = method574(arg2, var8 - 1, arg4, 2);
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

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(BI[C[C)I")
    private static final int method573(byte arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method587((byte) -126, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg1 - 1; var6 >= 0 && method587((byte) -126, arg2[var6]); var6--) {
            if (arg2[var6] == '*') {
                var5++;
            }
        }
        if (arg0 != 3) {
            return field1720;
        }
        boolean var7 = false;
        if (var5 >= 3) {
            return 4;
        } else if (method587((byte) -126, arg3[arg1 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([CI[CI)I")
    private static final int method574(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 < 2 || arg3 > 2) {
            return field1722;
        } else if (arg1 + 1 == arg0.length) {
            return 2;
        } else {
            int var4 = arg1 + 1;
            while (true) {
                if (var4 < arg0.length && method587((byte) -126, arg0[var4])) {
                    if (arg0[var4] != '.' && arg0[var4] != ',') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg1 + 1; var6 < arg0.length && method587((byte) -126, arg2[var6]); var6++) {
                    if (arg2[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method587((byte) -126, arg0[arg1 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(I[C)V")
    private static final void method575(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method579(var3, var2, null, false);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method579(var5, var4, null, false);
        for (int var6 = 0; var6 < field1730.length; var6++) {
            method576(var4, 42831, var2, field1730[var6], arg1, field1731[var6]);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([CI[C[C[CI)V")
    private static final void method576(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, int arg5) {
        if (arg3.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label128: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label128;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method581(arg3[var9], var12, false, var13)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method581(arg3[var9 - 1], var12, false, var13)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method587((byte) -126, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method577(var7, arg2, -546, arg4);
                int var18 = method578(var8 - 1, -35291, arg0, arg4);
                if (arg5 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg5 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg5 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg5 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method587((byte) -126, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method587((byte) -126, arg4[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg4.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method587((byte) -126, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method587((byte) -126, arg4[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg4[var29] = '*';
                    }
                }
            }
        }
        if (arg1 != 42831) {
            field1720 = -85;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(I[CI[C)I")
    private static final int method577(int arg0, char[] arg1, int arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method587((byte) -126, arg3[var4])) {
                if (arg3[var4] != ',' && arg3[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            while (arg2 >= 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method587((byte) -126, arg1[var6]); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method587((byte) -126, arg3[arg0 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(II[C[C)I")
    private static final int method578(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg0 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg3.length && method587((byte) -126, arg3[var4])) {
                if (arg3[var4] != '\\' && arg3[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != -35291) {
                return field1720;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg3.length && method587((byte) -126, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method587((byte) -126, arg3[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([C[C[[BZ)V")
    public static final void method579(char[] arg0, char[] arg1, byte[][] arg2, boolean arg3) {
        if (arg0.length > arg1.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label176: while (true) {
                while (true) {
                    if (var7 >= arg1.length || var12 && var13) {
                        break label176;
                    }
                    boolean var14 = false;
                    char var15 = arg1[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg1.length) {
                        var16 = arg1[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg0.length && (var17 = method582(9, arg0[var8], var15, var16)) > 0) {
                        if (var17 == 1 && method590(var15, false)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method590(var15, false) || method590(var16, false))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label176;
                        }
                        int var18;
                        if ((var18 = method582(9, arg0[var8 - 1], var15, var16)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method588(var15, false)) {
                                break label176;
                            }
                            if (method587((byte) -126, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method590(var15, false)) {
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
            if (var8 >= arg0.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var5 - 1 < 0 || method587((byte) -126, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg1.length || method587((byte) -126, arg1[var7]) && arg1[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method587((byte) -126, arg1[var27]) || arg1[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg1.length && (!method587((byte) -126, arg1[var27 + var29]) || arg1[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg1[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method587((byte) -126, arg1[var27 - 1]) || arg1[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method593((byte) 9, var28)) {
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
                        var20 = arg1[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg1.length) {
                        var21 = arg1[var7];
                    }
                    byte var22 = method583(8, var20);
                    byte var23 = method583(8, var21);
                    if (arg2 != null && method580(var22, (byte) 8, arg2, var23)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method590(arg1[var34], false)) {
                            var31++;
                        } else if (method589(203, arg1[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg1[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
        if (arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean method580(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg0 && arg2[var6][1] == arg3) {
            return true;
        }
        do {
            int var7 = (var4 + var6) / 2;
            if (arg2[var7][0] == arg0 && arg2[var7][1] == arg3) {
                return true;
            }
            if (arg0 < arg2[var7][0] || arg2[var7][0] == arg0 && arg3 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var4 = var7;
            }
        } while (var4 != var6 && var4 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(CCZC)I")
    private static final int method581(char arg0, char arg1, boolean arg2, char arg3) {
        if (arg2) {
            return 2;
        } else if (arg0 == arg1) {
            return 1;
        } else if (arg0 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg1 == '(' && arg3 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg1 == '€') {
            return 1;
        } else if (arg0 == 's' && arg1 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg1 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(ICCC)I")
    private static final int method582(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 < 9 || arg0 > 9) {
            return field1720;
        } else if (arg1 == arg2) {
            return 1;
        } else {
            if (arg1 >= 'a' && arg1 <= 'm') {
                if (arg1 == 'a') {
                    if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
                        if (arg2 == '/' && arg3 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'b') {
                    if (arg2 != '6' && arg2 != '8') {
                        if ((arg2 != '1' || arg3 != '3') && (arg2 != 'i' || arg3 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg1 == 'c') {
                    if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'd') {
                    if ((arg2 != '[' || arg3 != ')') && (arg2 != 'i' || arg3 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'e') {
                    if (arg2 != '3' && arg2 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'f') {
                    if (arg2 == 'p' && arg3 == 'h') {
                        return 2;
                    }
                    if (arg2 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'g') {
                    if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'h') {
                    if (arg2 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg1 == 'i') {
                    if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
                    if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
                    if (arg2 != '0' && arg2 != '*') {
                        if ((arg2 != '(' || arg3 != ')') && (arg2 != '[' || arg3 != ']') && (arg2 != '{' || arg3 != '}') && (arg2 != '<' || arg3 != '>')) {
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
                    if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 't') {
                    if (arg2 != '7' && arg2 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg1 == 'u') {
                    if (arg2 == 'v') {
                        return 1;
                    }
                    if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'v') {
                    if ((arg2 != '\\' || arg3 != '/') && (arg2 != '\\' || arg3 != '|') && (arg2 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg1 == 'w') {
                    if (arg2 == 'v' && arg3 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg1 == 'x') {
                    if ((arg2 != ')' || arg3 != '(') && (arg2 != '}' || arg3 != '{') && (arg2 != ']' || arg3 != '[') && (arg2 != '>' || arg3 != '<')) {
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
                    if (arg2 == 'o' || arg2 == 'O') {
                        return 1;
                    } else if ((arg2 != '(' || arg3 != ')') && (arg2 != '{' || arg3 != '}') && (arg2 != '[' || arg3 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg1 == '1') {
                    return arg2 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg1 == ',') {
                return arg2 == '.' ? 1 : 0;
            } else if (arg1 == '.') {
                return arg2 == ',' ? 1 : 0;
            } else if (arg1 == '!') {
                return arg2 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(IC)B")
    private static final byte method583(int arg0, char arg1) {
        if (arg0 < 8 || arg0 > 8) {
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

    @OriginalMember(owner = "ZCOZUVWP", name = "c", descriptor = "([CI)V")
    private static final void method584(char[] arg0, int arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 26 / arg1;
        while (true) {
            do {
                int var7;
                if ((var7 = method585((byte) 7, arg0, var3)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method587((byte) -126, arg0[var9]) && !method588(arg0[var9], false)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var7;
                }
                var3 = method586(var7, arg0, 8);
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
            for (int var12 = var5; var12 < var3; var12++) {
                arg0[var12] = '*';
            }
            var4 = 0;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(B[CI)I")
    private static final int method585(byte arg0, char[] arg1, int arg2) {
        if (arg0 != 7) {
            return 0;
        }
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(I[CI)I")
    private static final int method586(int arg0, char[] arg1, int arg2) {
        if (arg2 < 8 || arg2 > 8) {
            field1720 = 467;
        }
        int var3 = arg0;
        while (true) {
            if (var3 < arg1.length && var3 >= 0) {
                if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg1.length;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "(BC)Z")
    private static final boolean method587(byte arg0, char arg1) {
        if (arg0 != -126) {
            throw new NullPointerException();
        }
        return !method589(203, arg1) && !method590(arg1, false);
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "b", descriptor = "(CZ)Z")
    private static final boolean method588(char arg0, boolean arg1) {
        if (arg1) {
            field1725 = !field1725;
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "b", descriptor = "(IC)Z")
    private static final boolean method589(int arg0, char arg1) {
        int var2 = 4 / arg0;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "c", descriptor = "(CZ)Z")
    private static final boolean method590(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "c", descriptor = "(IC)Z")
    private static final boolean method591(int arg0, char arg1) {
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "d", descriptor = "(IC)Z")
    private static final boolean method592(int arg0, char arg1) {
        if (arg0 != 18) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "c", descriptor = "(B[C)Z")
    private static final boolean method593(byte arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method590(arg1[var3], false) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        if (var2) {
            return true;
        }
        int var5 = method594(arg1, true);
        int var6 = 0;
        int var7 = field1726.length - 1;
        if (field1726[var6] == var5 || field1726[var7] == var5) {
            return true;
        }
        do {
            int var8 = (var6 + var7) / 2;
            if (field1726[var8] == var5) {
                return true;
            }
            if (var5 < field1726[var8]) {
                var7 = var8;
            } else {
                var6 = var8;
            }
        } while (var6 != var7 && var6 + 1 != var7);
        return false;
    }

    @OriginalMember(owner = "ZCOZUVWP", name = "a", descriptor = "([CZ)I")
    public static final int method594(char[] arg0, boolean arg1) {
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
        if (!arg1) {
            field1722 = 474;
        }
        return var2;
    }
}
