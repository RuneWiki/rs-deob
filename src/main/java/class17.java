import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HGSXEUXP")
public class class17 {

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "I")
    private static int field887 = 810;

    @OriginalMember(owner = "HGSXEUXP", name = "b", descriptor = "Z")
    private static boolean field888 = true;

    @OriginalMember(owner = "HGSXEUXP", name = "c", descriptor = "I")
    private static int field889 = 9;

    @OriginalMember(owner = "HGSXEUXP", name = "d", descriptor = "I")
    private static int field890 = 8;

    @OriginalMember(owner = "HGSXEUXP", name = "e", descriptor = "I")
    private static int field891 = 1;

    @OriginalMember(owner = "HGSXEUXP", name = "f", descriptor = "B")
    private static byte field892 = 93;

    @OriginalMember(owner = "HGSXEUXP", name = "g", descriptor = "B")
    private static byte field893 = 1;

    @OriginalMember(owner = "HGSXEUXP", name = "h", descriptor = "Z")
    private static boolean field894 = true;

    @OriginalMember(owner = "HGSXEUXP", name = "i", descriptor = "I")
    private static int field895 = 1;

    @OriginalMember(owner = "HGSXEUXP", name = "j", descriptor = "Z")
    private static boolean field896 = true;

    @OriginalMember(owner = "HGSXEUXP", name = "k", descriptor = "Z")
    private static boolean field897 = true;

    @OriginalMember(owner = "HGSXEUXP", name = "s", descriptor = "[Ljava/lang/String;")
    private static final String[] field905 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "HGSXEUXP", name = "l", descriptor = "Z")
    private static boolean field898;

    @OriginalMember(owner = "HGSXEUXP", name = "t", descriptor = "Z")
    public static boolean field906;

    @OriginalMember(owner = "HGSXEUXP", name = "m", descriptor = "[I")
    private static int[] field899;

    @OriginalMember(owner = "HGSXEUXP", name = "r", descriptor = "[I")
    private static int[] field904;

    @OriginalMember(owner = "HGSXEUXP", name = "n", descriptor = "[[C")
    private static char[][] field900;

    @OriginalMember(owner = "HGSXEUXP", name = "p", descriptor = "[[C")
    private static char[][] field902;

    @OriginalMember(owner = "HGSXEUXP", name = "q", descriptor = "[[C")
    private static char[][] field903;

    @OriginalMember(owner = "HGSXEUXP", name = "o", descriptor = "[[[B")
    private static byte[][][] field901;

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(LDTIATKJO;)V")
    public static final void method245(class8 arg0) {
        class14 var1 = new class14(-527, arg0.method168("fragmentsenc.txt", null));
        class14 var2 = new class14(-527, arg0.method168("badenc.txt", null));
        class14 var3 = new class14(-527, arg0.method168("domainenc.txt", null));
        class14 var4 = new class14(-527, arg0.method168("tldlist.txt", null));
        method246(var1, var2, var3, var4);
        if (class4.field57) {
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(LGHHPHSRU;LGHHPHSRU;LGHHPHSRU;LGHHPHSRU;)V")
    private static final void method246(class14 arg0, class14 arg1, class14 arg2, class14 arg3) {
        method248(arg1, (byte) 9);
        method249(field890, arg2);
        method250((byte) -12, arg0);
        method247(false, arg3);
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(ZLGHHPHSRU;)V")
    private static final void method247(boolean arg0, class14 arg1) {
        int var2 = arg1.method207();
        field903 = new char[var2][];
        field904 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field904[var3] = arg1.method202();
            char[] var4 = new char[arg1.method202()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method202();
            }
            field903[var3] = var4;
        }
        if (arg0) {
            field890 = -482;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(LGHHPHSRU;B)V")
    private static final void method248(class14 arg0, byte arg1) {
        int var2 = arg0.method207();
        field900 = new char[var2][];
        if (arg1 == 9) {
            boolean var3 = false;
            field901 = new byte[var2][][];
            method251(arg0, field900, 0, field901);
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(ILGHHPHSRU;)V")
    private static final void method249(int arg0, class14 arg1) {
        if (arg0 == 8) {
            int var2 = arg1.method207();
            field902 = new char[var2][];
            method252(0, arg1, field902);
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(BLGHHPHSRU;)V")
    private static final void method250(byte arg0, class14 arg1) {
        field899 = new int[arg1.method207()];
        for (int var2 = 0; var2 < field899.length; var2++) {
            field899[var2] = arg1.method204();
        }
        if (arg0 == -12) {
            ;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(LGHHPHSRU;[[CI[[[B)V")
    private static final void method251(class14 arg0, char[][] arg1, int arg2, byte[][][] arg3) {
        if (arg2 != 0) {
            field890 = -492;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg0.method202()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg0.method202();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg0.method202()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg0.method202();
                var7[var8][1] = (byte) arg0.method202();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(ILGHHPHSRU;[[C)V")
    private static final void method252(int arg0, class14 arg1, char[][] arg2) {
        if (arg0 != 0) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method202()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method202();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(I[C)V")
    private static final void method253(int arg0, char[] arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method254(arg1[var3], (byte) -33)) {
                arg1[var2] = arg1[var3];
            } else {
                arg1[var2] = ' ';
            }
            if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
                var2++;
            }
        }
        if (arg0 != 7) {
            field889 = 97;
        }
        for (int var4 = var2; var4 < arg1.length; var4++) {
            arg1[var4] = ' ';
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(CB)Z")
    private static final boolean method254(char arg0, byte arg1) {
        if (arg1 != -33) {
            throw new NullPointerException();
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method255(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method253(7, var4);
        String var5 = (new String(var4)).trim();
        int var6 = 66 / arg0;
        char[] var7 = var5.toLowerCase().toCharArray();
        String var8 = var5.toLowerCase();
        method263(var7, 974);
        method258(var7, false);
        method259(field891, var7);
        method272(var7, 0);
        for (int var9 = 0; var9 < field905.length; var9++) {
            int var12 = -1;
            while ((var12 = var8.indexOf(field905[var9], var12 + 1)) != -1) {
                char[] var13 = field905[var9].toCharArray();
                for (int var14 = 0; var14 < var13.length; var14++) {
                    var7[var12 + var14] = var13[var14];
                }
            }
        }
        method256(var5.toCharArray(), true, var7);
        method257(var7, (byte) -115);
        long var10 = System.currentTimeMillis();
        return (new String(var7)).trim();
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([CZ[C)V")
    private static final void method256(char[] arg0, boolean arg1, char[] arg2) {
        if (!arg1) {
            field898 = !field898;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method280((byte) 74, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([CB)V")
    private static final void method257(char[] arg0, byte arg1) {
        if (arg1 != -115) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method277(0, var4)) {
                var2 = true;
            } else if (var2) {
                if (method279((byte) 34, var4)) {
                    var2 = false;
                }
            } else if (method280((byte) 74, var4)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([CZ)V")
    private static final void method258(char[] arg0, boolean arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = field900.length - 1; var3 >= 0; var3--) {
                method267(false, field900[var3], arg0, field901[var3]);
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "b", descriptor = "(I[C)V")
    private static final void method259(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method267(false, var3, var2, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method267(false, var5, var4, null);
        for (int var6 = field902.length - 1; var6 >= 0; var6--) {
            method260(var2, var4, field902[var6], (byte) 93, arg1);
        }
        if (arg0 < 1 || arg0 > 1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([C[C[CB[C)V")
    private static final void method260(char[] arg0, char[] arg1, char[] arg2, byte arg3, char[] arg4) {
        if (arg2.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        if (field892 != arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg2.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label61: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label61;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg2.length && (var14 = method269(var13, 120, arg2[var9], var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label61;
                        }
                        int var15;
                        if ((var15 = method269(var13, 120, arg2[var9 - 1], var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg2.length || !method275(var12, -84)) {
                                break label61;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg2.length) {
                boolean var16 = false;
                int var17 = method261(arg0, arg4, var7, 930);
                int var18 = method262(arg1, (byte) 1, arg4, var8 - 1);
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

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([C[CII)I")
    private static final int method261(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 == 0) {
            return 2;
        }
        for (int var5 = arg2 - 1; var5 >= 0 && method275(arg1[var5], -84); var5--) {
            if (arg1[var5] == '@') {
                return 3;
            }
        }
        int var6 = 0;
        for (int var7 = arg2 - 1; var7 >= 0 && method275(arg0[var7], -84); var7--) {
            if (arg0[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method275(arg1[arg2 - 1], -84)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([CB[CI)I")
    private static final int method262(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method275(arg2[var4], -84)) {
                if (arg2[var4] != '.' && arg2[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (field893 != arg1) {
                return 3;
            }
            for (int var6 = arg3 + 1; var6 < arg2.length && method275(arg0[var6], -84); var6++) {
                if (arg0[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method275(arg2[arg3 + 1], -84)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([CI)V")
    private static final void method263(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method267(false, var3, var2, null);
        if (arg1 <= 0) {
            return;
        }
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method267(false, var5, var4, null);
        for (int var6 = 0; var6 < field903.length; var6++) {
            method264(var2, arg0, field904[var6], field903[var6], var4, (byte) 12);
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([C[CI[C[CB)V")
    private static final void method264(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4, byte arg5) {
        if (arg5 != 12) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg3.length > arg1.length) {
            return;
        }
        boolean var7 = true;
        int var11;
        for (int var8 = 0; var8 <= arg1.length - arg3.length; var8 += var11) {
            int var9 = var8;
            int var10 = 0;
            var11 = 1;
            label129: while (true) {
                while (true) {
                    if (var9 >= arg1.length) {
                        break label129;
                    }
                    boolean var12 = false;
                    char var13 = arg1[var9];
                    char var14 = 0;
                    if (var9 + 1 < arg1.length) {
                        var14 = arg1[var9 + 1];
                    }
                    int var15;
                    if (var10 < arg3.length && (var15 = method269(var14, 120, arg3[var10], var13)) > 0) {
                        var9 += var15;
                        var10++;
                    } else {
                        if (var10 == 0) {
                            break label129;
                        }
                        int var16;
                        if ((var16 = method269(var14, 120, arg3[var10 - 1], var13)) > 0) {
                            var9 += var16;
                            if (var10 == 1) {
                                var11++;
                            }
                        } else {
                            if (var10 >= arg3.length || !method275(var13, -84)) {
                                break label129;
                            }
                            var9++;
                        }
                    }
                }
            }
            if (var10 >= arg3.length) {
                boolean var17 = false;
                int var18 = method265(arg1, arg0, var8, field894);
                int var19 = method266(arg1, arg4, 600, var9 - 1);
                if (arg2 == 1 && var18 > 0 && var19 > 0) {
                    var17 = true;
                }
                if (arg2 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
                    var17 = true;
                }
                if (arg2 == 3 && var18 > 0 && var19 > 2) {
                    var17 = true;
                }
                boolean var10000;
                if (arg2 == 3 && var18 > 2 && var19 > 0) {
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
                                if (method275(arg1[var25], -84)) {
                                    break;
                                }
                                var20 = var25;
                            } else if (!method275(arg1[var25], -84)) {
                                var24 = true;
                                var20 = var25;
                            }
                        }
                    }
                    if (var19 > 2) {
                        if (var19 == 4) {
                            boolean var26 = false;
                            for (int var27 = var21 + 1; var27 < arg1.length; var27++) {
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
                        for (int var29 = var21 + 1; var29 < arg1.length; var29++) {
                            if (var28) {
                                if (method275(arg1[var29], -84)) {
                                    break;
                                }
                                var21 = var29;
                            } else if (!method275(arg1[var29], -84)) {
                                var28 = true;
                                var21 = var29;
                            }
                        }
                    }
                    for (int var30 = var20; var30 <= var21; var30++) {
                        arg1[var30] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "([C[CIZ)I")
    private static final int method265(char[] arg0, char[] arg1, int arg2, boolean arg3) {
        if (arg2 == 0) {
            return 2;
        }
        int var4 = arg2 - 1;
        while (true) {
            if (var4 >= 0 && method275(arg0[var4], -84)) {
                if (arg0[var4] != ',' && arg0[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (!arg3) {
                return 0;
            }
            for (int var6 = arg2 - 1; var6 >= 0 && method275(arg1[var6], -84); var6--) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method275(arg0[arg2 - 1], -84)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "b", descriptor = "([C[CII)I")
    private static final int method266(char[] arg0, char[] arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            field891 = 358;
        }
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method275(arg0[var4], -84)) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg0.length && method275(arg1[var6], -84); var6++) {
                if (arg1[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method275(arg0[arg3 + 1], -84)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(Z[C[C[[B)V")
    public static final void method267(boolean arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        if (arg0) {
            field888 = true;
        }
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
                    if (var7 < arg1.length && (var16 = method270(13684, var14, arg1[var7], var15)) > 0) {
                        if (var16 == 1 && method278(var14, (byte) 0)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method278(var14, (byte) 0) || method278(var15, (byte) 0))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label170;
                        }
                        int var17;
                        if ((var17 = method270(13684, var14, arg1[var7 - 1], var15)) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method276(field896, var14)) {
                                break label170;
                            }
                            if (method275(var14, -84) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method278(var14, (byte) 0)) {
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
                    if (var5 - 1 < 0 || method275(arg2[var5 - 1], -84) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method275(arg2[var6], -84) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method275(arg2[var26], -84) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method275(arg2[var26 + var28], -84) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method275(arg2[var26 - 1], -84) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method281(0, var27)) {
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
                    byte var21 = method271(var19, false);
                    byte var22 = method271(var20, false);
                    if (arg3 != null && method268(var21, (byte) 19, arg3, var22)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method278(arg2[var33], (byte) 0)) {
                            var30++;
                        } else if (method277(0, arg2[var33])) {
                            var31++;
                            var32 = var33;
                        }
                    }
                    if (var32 > -1) {
                        var30 -= var6 - var32 - 1;
                    }
                    if (var30 <= var31) {
                        for (int var34 = var5; var34 < var6; var34++) {
                            arg2[var34] = '*';
                        }
                    } else {
                        var9 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean method268(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        int var4 = 0;
        if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
            return true;
        }
        int var5 = arg2.length - 1;
        if (arg1 != 19) {
            throw new NullPointerException();
        } else if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
            return true;
        } else {
            do {
                int var6 = (var4 + var5) / 2;
                if (arg2[var6][0] == arg0 && arg2[var6][1] == arg3) {
                    return true;
                }
                if (arg0 < arg2[var6][0] || arg2[var6][0] == arg0 && arg3 < arg2[var6][1]) {
                    var5 = var6;
                } else {
                    var4 = var6;
                }
            } while (var4 != var5 && var4 + 1 != var5);
            return false;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(CICC)I")
    private static final int method269(char arg0, int arg1, char arg2, char arg3) {
        if (arg1 <= 0) {
            field898 = !field898;
        }
        if (arg2 == arg3) {
            return 1;
        } else if (arg2 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg2 == 'o' && arg3 == '(' && arg0 == ')') {
            return 2;
        } else if (arg2 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg2 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg2 == 's' && arg3 == '$') {
            return 1;
        } else if (arg2 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(ICCC)I")
    private static final int method270(int arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 13684) {
            return 0;
        } else if (arg1 == arg2) {
            return 1;
        } else {
            if (arg2 >= 'a' && arg2 <= 'm') {
                if (arg2 == 'a') {
                    if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                        if (arg1 == '/' && arg3 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'b') {
                    if (arg1 != '6' && arg1 != '8') {
                        if ((arg1 != '1' || arg3 != '3') && (arg1 != 'i' || arg3 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg2 == 'c') {
                    if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'd') {
                    if ((arg1 != '[' || arg3 != ')') && (arg1 != 'i' || arg3 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'e') {
                    if (arg1 != '3' && arg1 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'f') {
                    if (arg1 == 'p' && arg3 == 'h') {
                        return 2;
                    }
                    if (arg1 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'g') {
                    if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'h') {
                    if (arg1 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg2 == 'i') {
                    if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                    if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                    if (arg1 != '0' && arg1 != '*') {
                        if ((arg1 != '(' || arg3 != ')') && (arg1 != '[' || arg3 != ']') && (arg1 != '{' || arg3 != '}') && (arg1 != '<' || arg3 != '>')) {
                            return 0;
                        }
                        return 2;
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
                    if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 't') {
                    if (arg1 != '7' && arg1 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg2 == 'u') {
                    if (arg1 == 'v') {
                        return 1;
                    }
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'v') {
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg2 == 'w') {
                    if (arg1 == 'v' && arg3 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg2 == 'x') {
                    if ((arg1 != ')' || arg3 != '(') && (arg1 != '}' || arg3 != '{') && (arg1 != ']' || arg3 != '[') && (arg1 != '>' || arg3 != '<')) {
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
                    if (arg1 == 'o' || arg1 == 'O') {
                        return 1;
                    } else if ((arg1 != '(' || arg3 != ')') && (arg1 != '{' || arg3 != '}') && (arg1 != '[' || arg3 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg2 == '1') {
                    return arg1 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg2 == ',') {
                return arg1 == '.' ? 1 : 0;
            } else if (arg2 == '.') {
                return arg1 == ',' ? 1 : 0;
            } else if (arg2 == '!') {
                return arg1 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(CZ)B")
    private static final byte method271(char arg0, boolean arg1) {
        if (arg1) {
            field887 = -323;
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

    @OriginalMember(owner = "HGSXEUXP", name = "b", descriptor = "([CI)V")
    private static final void method272(char[] arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method273(var4, field895, arg0)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method275(arg0[var9], -84) && !method276(field896, arg0[var9])) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method274(var7, arg0, 0);
                int var10 = 0;
                for (int var11 = var7; var11 < var4; var11++) {
                    var10 = var10 * 10 + arg0[var11] - 48;
                }
                if (var10 <= 255 && var4 - var7 <= 8) {
                    var5++;
                } else {
                    var5 = 0;
                }
            } while (var5 != 4);
            for (int var12 = var6; var12 < var4; var12++) {
                arg0[var12] = '*';
            }
            var5 = 0;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(II[C)I")
    private static final int method273(int arg0, int arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (field895 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(I[CI)I")
    private static final int method274(int arg0, char[] arg1, int arg2) {
        if (arg2 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
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

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(CI)Z")
    private static final boolean method275(char arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return !method277(0, arg0) && !method278(arg0, (byte) 0);
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(ZC)Z")
    private static final boolean method276(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (arg1 >= 'a' && arg1 <= 'z') {
            return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(IC)Z")
    private static final boolean method277(int arg0, char arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "HGSXEUXP", name = "b", descriptor = "(CB)Z")
    private static final boolean method278(char arg0, byte arg1) {
        if (arg1 == 0) {
            boolean var2 = false;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "HGSXEUXP", name = "a", descriptor = "(BC)Z")
    private static final boolean method279(byte arg0, char arg1) {
        if (arg0 != 34) {
            field889 = -361;
        }
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "HGSXEUXP", name = "b", descriptor = "(BC)Z")
    private static final boolean method280(byte arg0, char arg1) {
        if (arg0 != 74) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "HGSXEUXP", name = "c", descriptor = "(I[C)Z")
    private static final boolean method281(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method278(arg1[var3], (byte) 0) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method282(551, arg1);
        int var5 = 0;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var6 = field899.length - 1;
        if (field899[var5] == var4 || field899[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field899[var7] == var4) {
                return true;
            }
            if (var4 < field899[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "HGSXEUXP", name = "d", descriptor = "(I[C)I")
    public static final int method282(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        int var3 = 2 / arg0;
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
