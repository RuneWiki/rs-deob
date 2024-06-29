import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BTDNSPCH")
public class class8 {

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "I")
    private static int field104 = 850;

    @OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "I")
    private static int field105 = 9;

    @OriginalMember(owner = "client!BTDNSPCH", name = "d", descriptor = "Z")
    private static boolean field107 = true;

    @OriginalMember(owner = "client!BTDNSPCH", name = "e", descriptor = "B")
    private static byte field108 = 38;

    @OriginalMember(owner = "client!BTDNSPCH", name = "h", descriptor = "I")
    private static int field111 = -964;

    @OriginalMember(owner = "client!BTDNSPCH", name = "j", descriptor = "B")
    private static byte field113 = 9;

    @OriginalMember(owner = "client!BTDNSPCH", name = "k", descriptor = "I")
    private static int field114 = 39931;

    @OriginalMember(owner = "client!BTDNSPCH", name = "l", descriptor = "Z")
    private static boolean field115 = true;

    @OriginalMember(owner = "client!BTDNSPCH", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field122 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!BTDNSPCH", name = "c", descriptor = "I")
    private static int field106;

    @OriginalMember(owner = "client!BTDNSPCH", name = "g", descriptor = "I")
    private static int field110;

    @OriginalMember(owner = "client!BTDNSPCH", name = "f", descriptor = "Z")
    private static boolean field109;

    @OriginalMember(owner = "client!BTDNSPCH", name = "i", descriptor = "Z")
    private static boolean field112;

    @OriginalMember(owner = "client!BTDNSPCH", name = "t", descriptor = "Z")
    public static boolean field123;

    @OriginalMember(owner = "client!BTDNSPCH", name = "m", descriptor = "[I")
    private static int[] field116;

    @OriginalMember(owner = "client!BTDNSPCH", name = "r", descriptor = "[I")
    private static int[] field121;

    @OriginalMember(owner = "client!BTDNSPCH", name = "n", descriptor = "[[C")
    private static char[][] field117;

    @OriginalMember(owner = "client!BTDNSPCH", name = "p", descriptor = "[[C")
    private static char[][] field119;

    @OriginalMember(owner = "client!BTDNSPCH", name = "q", descriptor = "[[C")
    private static char[][] field120;

    @OriginalMember(owner = "client!BTDNSPCH", name = "o", descriptor = "[[[B")
    private static byte[][][] field118;

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(LSMIVAFST;)V")
    public static final void method86(class52 arg0) {
        class7 var1 = new class7(arg0.method512("fragmentsenc.txt", null), (byte) 3);
        class7 var2 = new class7(arg0.method512("badenc.txt", null), (byte) 3);
        class7 var3 = new class7(arg0.method512("domainenc.txt", null), (byte) 3);
        class7 var4 = new class7(arg0.method512("tldlist.txt", null), (byte) 3);
        method87(var1, var2, var3, var4);
        if (class56.field1535) {
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(LBSNPYLEV;LBSNPYLEV;LBSNPYLEV;LBSNPYLEV;)V")
    private static final void method87(class7 arg0, class7 arg1, class7 arg2, class7 arg3) {
        method89(26559, arg1);
        method90(arg2, 0);
        method91(field107, arg0);
        method88(arg3, true);
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(LBSNPYLEV;Z)V")
    private static final void method88(class7 arg0, boolean arg1) {
        int var2 = arg0.method52();
        field120 = new char[var2][];
        field121 = new int[var2];
        if (!arg1) {
            field104 = -293;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            field121[var3] = arg0.method47();
            char[] var4 = new char[arg0.method47()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method47();
            }
            field120[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ILBSNPYLEV;)V")
    private static final void method89(int arg0, class7 arg1) {
        int var2 = arg1.method52();
        field117 = new char[var2][];
        if (arg0 != 26559) {
            field107 = !field107;
        }
        field118 = new byte[var2][][];
        method92(field117, arg1, 0, field118);
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(LBSNPYLEV;I)V")
    private static final void method90(class7 arg0, int arg1) {
        int var2 = arg0.method52();
        field119 = new char[var2][];
        method93(field119, arg0, 7);
        if (arg1 != 0) {
            field107 = !field107;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ZLBSNPYLEV;)V")
    private static final void method91(boolean arg0, class7 arg1) {
        field116 = new int[arg1.method52()];
        for (int var2 = 0; var2 < field116.length; var2++) {
            field116[var2] = arg1.method49();
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([[CLBSNPYLEV;I[[[B)V")
    private static final void method92(char[][] arg0, class7 arg1, int arg2, byte[][][] arg3) {
        if (arg2 != 0) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg1.method47()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method47();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg1.method47()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg1.method47();
                var7[var8][1] = (byte) arg1.method47();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([[CLBSNPYLEV;I)V")
    private static final void method93(char[][] arg0, class7 arg1, int arg2) {
        if (arg2 != 7) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char[] var4 = new char[arg1.method47()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method47();
            }
            arg0[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(B[C)V")
    private static final void method94(byte arg0, char[] arg1) {
        if (arg0 != 38) {
            field115 = !field115;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method95(-685, arg1[var3])) {
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
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(IC)Z")
    private static final boolean method95(int arg0, char arg1) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method96(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method94(field108, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method104(var6, false);
        method99((byte) -64, var6);
        if (arg0 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        method100(var6, -8236);
        method113(var6, (byte) 0);
        for (int var9 = 0; var9 < field122.length; var9++) {
            int var12 = -1;
            while ((var12 = var7.indexOf(field122[var9], var12 + 1)) != -1) {
                char[] var13 = field122[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var6[var12 + var14] = var13[var14];
                }
            }
        }
        method97(var6, var5.toCharArray(), -681);
        method98(true, var6);
        long var10 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([C[CI)V")
    private static final void method97(char[] arg0, char[] arg1, int arg2) {
        while (arg2 >= 0) {
            field106 = -67;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method121(195, arg1[var3])) {
                arg0[var3] = arg1[var3];
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Z[C)V")
    private static final void method98(boolean arg0, char[] arg1) {
        if (!arg0) {
            field105 = 233;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method118((byte) 9, var4)) {
                var2 = true;
            } else if (var2) {
                if (method120(var4, 336)) {
                    var2 = false;
                }
            } else if (method121(195, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "(B[C)V")
    private static final void method99(byte arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field117.length - 1; var3 >= 0; var3--) {
                method108(true, field118[var3], field117[var3], arg1);
            }
        }
        if (arg0 == -64) {
            ;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CI)V")
    private static final void method100(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        if (arg1 != -8236) {
            return;
        }
        char[] var3 = new char[] { '(', 'a', ')' };
        method108(true, null, var3, var2);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method108(true, null, var5, var4);
        for (int var6 = field119.length - 1; var6 >= 0; var6--) {
            method101(arg0, field119[var6], var2, var4, -34);
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([C[C[C[CI)V")
    private static final void method101(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
        if (arg1.length > arg0.length) {
            return;
        }
        boolean var5 = true;
        if (arg4 >= 0) {
            return;
        }
        int var9;
        for (int var6 = 0; var6 <= arg0.length - arg1.length; var6 += var9) {
            int var7 = var6;
            int var8 = 0;
            var9 = 1;
            label61: while (true) {
                while (true) {
                    if (var7 >= arg0.length) {
                        break label61;
                    }
                    boolean var10 = false;
                    char var11 = arg0[var7];
                    char var12 = 0;
                    if (var7 + 1 < arg0.length) {
                        var12 = arg0[var7 + 1];
                    }
                    int var13;
                    if (var8 < arg1.length && (var13 = method110(var11, arg1[var8], var12, -964)) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method110(var11, arg1[var8 - 1], var12, -964)) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg1.length || !method116(true, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg1.length) {
                boolean var15 = false;
                int var16 = method102(arg0, arg2, 5, var6);
                int var17 = method103(var7 - 1, 8, arg3, arg0);
                if (var16 > 2 || var17 > 2) {
                    var15 = true;
                }
                if (var15) {
                    for (int var18 = var6; var18 < var7; var18++) {
                        arg0[var18] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([C[CII)I")
    private static final int method102(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            return 2;
        }
        for (int var4 = arg3 - 1; var4 >= 0 && method116(true, arg0[var4]); var4--) {
            if (arg0[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg3 - 1; var6 >= 0 && method116(true, arg1[var6]); var6--) {
            if (arg1[var6] == '*') {
                var5++;
            }
        }
        if (arg2 < 5 || arg2 > 5) {
            return field104;
        } else if (var5 >= 3) {
            return 4;
        } else if (method116(true, arg0[arg3 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(II[C[C)I")
    private static final int method103(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 < 8 || arg1 > 8) {
            return 0;
        } else if (arg0 + 1 == arg3.length) {
            return 2;
        } else {
            int var4 = arg0 + 1;
            while (true) {
                if (var4 < arg3.length && method116(true, arg3[var4])) {
                    if (arg3[var4] != '.' && arg3[var4] != ',') {
                        var4++;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg0 + 1; var6 < arg3.length && method116(true, arg2[var6]); var6++) {
                    if (arg2[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method116(true, arg3[arg0 + 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CZ)V")
    private static final void method104(char[] arg0, boolean arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method108(true, null, var3, var2);
        if (arg1) {
            field106 = 371;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method108(true, null, var5, var4);
        for (int var6 = 0; var6 < field120.length; var6++) {
            method105(field121[var6], -30314, arg0, field120[var6], var4, var2);
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(II[C[C[C[C)V")
    private static final void method105(int arg0, int arg1, char[] arg2, char[] arg3, char[] arg4, char[] arg5) {
        if (arg1 != -30314) {
            field109 = !field109;
        }
        if (arg3.length > arg2.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg2.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg2.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg2[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg2.length) {
                        var13 = arg2[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method110(var12, arg3[var9], var13, -964)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method110(var12, arg3[var9 - 1], var13, -964)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method116(true, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method106(arg2, var7, arg5, field110);
                int var18 = method107(arg4, var8 - 1, arg2, 871);
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
                                    if (arg5[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg5[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method116(true, arg2[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method116(true, arg2[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg2.length; var26++) {
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
                        for (int var28 = var20 + 1; var28 < arg2.length; var28++) {
                            if (var27) {
                                if (method116(true, arg2[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method116(true, arg2[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg2[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CI[CI)I")
    private static final int method106(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg3 != 0) {
            return 2;
        } else if (arg1 == 0) {
            return 2;
        } else {
            int var4 = arg1 - 1;
            while (true) {
                if (var4 >= 0 && method116(true, arg0[var4])) {
                    if (arg0[var4] != ',' && arg0[var4] != '.') {
                        var4--;
                        continue;
                    }
                    return 3;
                }
                int var5 = 0;
                for (int var6 = arg1 - 1; var6 >= 0 && method116(true, arg2[var6]); var6--) {
                    if (arg2[var6] == '*') {
                        var5++;
                    }
                }
                if (var5 >= 3) {
                    return 4;
                }
                if (method116(true, arg0[arg1 - 1])) {
                    return 1;
                }
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "([CI[CI)I")
    private static final int method107(char[] arg0, int arg1, char[] arg2, int arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method116(true, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg3 <= 0) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            for (int var7 = arg1 + 1; var7 < arg2.length && method116(true, arg0[var7]); var7++) {
                if (arg0[var7] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method116(true, arg2[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(Z[[B[C[C)V")
    public static final void method108(boolean arg0, byte[][] arg1, char[] arg2, char[] arg3) {
        if (arg2.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg3.length - arg2.length; var5 += var10) {
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
                    if (var8 < arg2.length && (var17 = method111(arg2[var8], 0, var16, var15)) > 0) {
                        if (var17 == 1 && method119(0, var15)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method119(0, var15) || method119(0, var16))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label176;
                        }
                        int var18;
                        if ((var18 = method111(arg2[var8 - 1], 0, var16, var15)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg2.length || !method117(field112, var15)) {
                                break label176;
                            }
                            if (method116(true, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method119(0, var15)) {
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
            if (var8 >= arg2.length && (!var12 || !var13)) {
                boolean var19 = true;
                if (var11) {
                    boolean var24 = false;
                    boolean var25 = false;
                    if (var5 - 1 < 0 || method116(true, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg3.length || method116(true, arg3[var7]) && arg3[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method116(true, arg3[var27]) || arg3[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg3.length && (!method116(true, arg3[var27 + var29]) || arg3[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg3[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method116(true, arg3[var27 - 1]) || arg3[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method122(field114, var28)) {
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
                    byte var22 = method112(288, var20);
                    byte var23 = method112(288, var21);
                    if (arg1 != null && method109(arg1, var23, false, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method119(0, arg3[var34])) {
                            var31++;
                        } else if (method118((byte) 9, arg3[var34])) {
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
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([[BBZB)Z")
    private static final boolean method109(byte[][] arg0, byte arg1, boolean arg2, byte arg3) {
        if (arg2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = 0;
        if (arg0[var5][0] == arg3 && arg0[var5][1] == arg1) {
            return true;
        }
        int var6 = arg0.length - 1;
        if (arg0[var6][0] == arg3 && arg0[var6][1] == arg1) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg0[var7][0] == arg3 && arg0[var7][1] == arg1) {
                return true;
            }
            if (arg3 < arg0[var7][0] || arg0[var7][0] == arg3 && arg1 < arg0[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(CCCI)I")
    private static final int method110(char arg0, char arg1, char arg2, int arg3) {
        if (arg3 >= 0) {
            return 3;
        } else if (arg0 == arg1) {
            return 1;
        } else if (arg1 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg1 == 'o' && arg0 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(CICC)I")
    private static final int method111(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 != 0) {
            return 1;
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

    @OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "(IC)B")
    private static final byte method112(int arg0, char arg1) {
        if (arg0 <= 0) {
            field114 = -338;
        }
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

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "([CB)V")
    private static final void method113(char[] arg0, byte arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg1 != 0) {
            return;
        }
        boolean var6 = false;
        while (true) {
            do {
                int var7;
                if ((var7 = method114(106, arg0, var3)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var3; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method116(true, arg0[var9]) && !method117(field112, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var7;
                }
                var3 = method115(var7, true, arg0);
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

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(I[CI)I")
    private static final int method114(int arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        int var4 = 85 / arg0;
        return -1;
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(IZ[C)I")
    private static final int method115(int arg0, boolean arg1, char[] arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (!arg1) {
                field107 = !field107;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(ZC)Z")
    private static final boolean method116(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return !method118((byte) 9, arg1) && !method119(0, arg1);
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "b", descriptor = "(ZC)Z")
    private static final boolean method117(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(BC)Z")
    private static final boolean method118(byte arg0, char arg1) {
        if (field113 != arg0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "c", descriptor = "(IC)Z")
    private static final boolean method119(int arg0, char arg1) {
        if (arg0 != 0) {
            field107 = !field107;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(CI)Z")
    private static final boolean method120(char arg0, int arg1) {
        int var2 = 15 / arg1;
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "d", descriptor = "(IC)Z")
    private static final boolean method121(int arg0, char arg1) {
        if (arg0 <= 0) {
            field106 = -145;
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "a", descriptor = "(I[C)Z")
    private static final boolean method122(int arg0, char[] arg1) {
        if (field114 != arg0) {
            field106 = -59;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method119(0, arg1[var3]) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method123((byte) 9, arg1);
        int var5 = 0;
        int var6 = field116.length - 1;
        if (field116[var5] == var4 || field116[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field116[var7] == var4) {
                return true;
            }
            if (var4 < field116[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!BTDNSPCH", name = "c", descriptor = "(B[C)I")
    public static final int method123(byte arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 9) {
            return field104;
        }
        boolean var3 = false;
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
