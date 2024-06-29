import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XWTMFQHB")
public class class66 {

    @OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "I")
    private static int field1646 = -296;

    @OriginalMember(owner = "client!XWTMFQHB", name = "d", descriptor = "I")
    private static int field1648 = 293;

    @OriginalMember(owner = "client!XWTMFQHB", name = "l", descriptor = "[Ljava/lang/String;")
    private static final String[] field1656 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!XWTMFQHB", name = "c", descriptor = "I")
    private static int field1647;

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "Z")
    private static boolean field1645;

    @OriginalMember(owner = "client!XWTMFQHB", name = "e", descriptor = "Z")
    private static boolean field1649;

    @OriginalMember(owner = "client!XWTMFQHB", name = "m", descriptor = "Z")
    public static boolean field1657;

    @OriginalMember(owner = "client!XWTMFQHB", name = "f", descriptor = "[I")
    private static int[] field1650;

    @OriginalMember(owner = "client!XWTMFQHB", name = "k", descriptor = "[I")
    private static int[] field1655;

    @OriginalMember(owner = "client!XWTMFQHB", name = "g", descriptor = "[[C")
    private static char[][] field1651;

    @OriginalMember(owner = "client!XWTMFQHB", name = "i", descriptor = "[[C")
    private static char[][] field1653;

    @OriginalMember(owner = "client!XWTMFQHB", name = "j", descriptor = "[[C")
    private static char[][] field1654;

    @OriginalMember(owner = "client!XWTMFQHB", name = "h", descriptor = "[[[B")
    private static byte[][][] field1652;

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(LAWEEREDT;)V")
    public static final void method534(class2 arg0) {
        class25 var1 = new class25(arg0.method14("fragmentsenc.txt", null), 713);
        class25 var2 = new class25(arg0.method14("badenc.txt", null), 713);
        class25 var3 = new class25(arg0.method14("domainenc.txt", null), 713);
        class25 var4 = new class25(arg0.method14("tldlist.txt", null), 713);
        method535(var1, var2, var3, var4);
        if (class71.field1729) {
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(LIUVBENCV;LIUVBENCV;LIUVBENCV;LIUVBENCV;)V")
    private static final void method535(class25 arg0, class25 arg1, class25 arg2, class25 arg3) {
        method537(-6334, arg1);
        method538(arg2, false);
        method539(arg0, field1647);
        method536((byte) 5, arg3);
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(BLIUVBENCV;)V")
    private static final void method536(byte arg0, class25 arg1) {
        int var2 = arg1.method250();
        field1654 = new char[var2][];
        if (arg0 != 5) {
            return;
        }
        boolean var3 = false;
        field1655 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            field1655[var4] = arg1.method245();
            char[] var5 = new char[arg1.method245()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg1.method245();
            }
            field1654[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ILIUVBENCV;)V")
    private static final void method537(int arg0, class25 arg1) {
        if (arg0 == -6334) {
            int var2 = arg1.method250();
            field1651 = new char[var2][];
            field1652 = new byte[var2][][];
            method540(field1651, (byte) -75, arg1, field1652);
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(LIUVBENCV;Z)V")
    private static final void method538(class25 arg0, boolean arg1) {
        int var2 = arg0.method250();
        field1653 = new char[var2][];
        if (arg1) {
            field1646 = 79;
        }
        method541((byte) 8, arg0, field1653);
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(LIUVBENCV;I)V")
    private static final void method539(class25 arg0, int arg1) {
        field1650 = new int[arg0.method250()];
        for (int var2 = 0; var2 < field1650.length; var2++) {
            field1650[var2] = arg0.method247();
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([[CBLIUVBENCV;[[[B)V")
    private static final void method540(char[][] arg0, byte arg1, class25 arg2, byte[][][] arg3) {
        if (arg1 != -75) {
            field1647 = -178;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char[] var5 = new char[arg2.method245()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method245();
            }
            arg0[var4] = var5;
            byte[][] var7 = new byte[arg2.method245()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method245();
                var7[var8][1] = (byte) arg2.method245();
            }
            if (var7.length > 0) {
                arg3[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(BLIUVBENCV;[[C)V")
    private static final void method541(byte arg0, class25 arg1, char[][] arg2) {
        if (arg0 != 8) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method245()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method245();
            }
            arg2[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CI)V")
    private static final void method542(char[] arg0, int arg1) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method543((byte) 1, arg0[var3])) {
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
        int var5 = 2 / arg1;
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(BC)Z")
    private static final boolean method543(byte arg0, char arg1) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method544(int arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        if (arg0 != 9) {
            field1645 = true;
        }
        method542(var4, field1648);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method552(var6, -20);
        method547(true, var6);
        method548(field1649, var6);
        method561((byte) 72, var6);
        for (int var8 = 0; var8 < field1656.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1656[var8], var11 + 1)) != -1) {
                char[] var12 = field1656[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method545(var5.toCharArray(), false, var6);
        method546(var6, 4);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CZ[C)V")
    private static final void method545(char[] arg0, boolean arg1, char[] arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method569(arg0[var3], -741)) {
                arg2[var3] = arg0[var3];
            }
        }
        if (arg1) {
            field1646 = 251;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "([CI)V")
    private static final void method546(char[] arg0, int arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            char var4 = arg0[var3];
            if (!method566(var4, -616)) {
                var2 = true;
            } else if (var2) {
                if (method568(679, var4)) {
                    var2 = false;
                }
            } else if (method569(var4, -741)) {
                arg0[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg1 < 4 || arg1 > 4) {
            ;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(Z[C)V")
    private static final void method547(boolean arg0, char[] arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field1651.length - 1; var4 >= 0; var4--) {
                method556((byte) -45, field1651[var4], arg1, field1652[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "(Z[C)V")
    private static final void method548(boolean arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method556((byte) -45, var3, var2, null);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method556((byte) -45, var5, var4, null);
        for (int var6 = field1653.length - 1; var6 >= 0; var6--) {
            method549(var4, field1653[var6], true, var2, arg1);
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([C[CZ[C[C)V")
    private static final void method549(char[] arg0, char[] arg1, boolean arg2, char[] arg3, char[] arg4) {
        if (arg1.length > arg4.length) {
            return;
        }
        boolean var5 = true;
        int var10;
        for (int var6 = 0; var6 <= arg4.length - arg1.length; var6 += var10) {
            int var8 = var6;
            int var9 = 0;
            var10 = 1;
            label70: while (true) {
                while (true) {
                    if (var8 >= arg4.length) {
                        break label70;
                    }
                    boolean var11 = false;
                    char var12 = arg4[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg4.length) {
                        var13 = arg4[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg1.length && (var14 = method558(var12, true, var13, arg1[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label70;
                        }
                        int var15;
                        if ((var15 = method558(var12, true, var13, arg1[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg1.length || !method564(var12, 1)) {
                                break label70;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg1.length) {
                boolean var16 = false;
                int var17 = method550(true, var6, arg4, arg3);
                int var18 = method551(arg0, (byte) 8, var8 - 1, arg4);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var6; var19 < var8; var19++) {
                        arg4[var19] = '*';
                    }
                }
            }
        }
        if (!arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ZI[C[C)I")
    private static final int method550(boolean arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        for (int var4 = arg1 - 1; var4 >= 0 && method564(arg2[var4], 1); var4--) {
            if (arg2[var4] == '@') {
                return 3;
            }
        }
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        for (int var7 = arg1 - 1; var7 >= 0 && method564(arg3[var7], 1); var7--) {
            if (arg3[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method564(arg2[arg1 - 1], 1)) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CBI[C)I")
    private static final int method551(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg3.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg3.length && method564(arg3[var4], 1)) {
                if (arg3[var4] != '.' && arg3[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != 8) {
                return field1648;
            }
            boolean var5 = false;
            int var6 = 0;
            for (int var7 = arg2 + 1; var7 < arg3.length && method564(arg0[var7], 1); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method564(arg3[arg2 + 1], 1)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "c", descriptor = "([CI)V")
    private static final void method552(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        if (arg1 >= 0) {
            field1646 = 224;
        }
        method556((byte) -45, var3, var2, null);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method556((byte) -45, var5, var4, null);
        for (int var6 = 0; var6 < field1654.length; var6++) {
            method553(var2, field1655[var6], var4, field1654[var6], false, arg0);
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CI[C[CZ[C)V")
    private static final void method553(char[] arg0, int arg1, char[] arg2, char[] arg3, boolean arg4, char[] arg5) {
        if (arg3.length > arg5.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg5.length - arg3.length; var7 += var10) {
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
                    if (var9 < arg3.length && (var14 = method558(var12, true, var13, arg3[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method558(var12, true, var13, arg3[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method564(var12, 1)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method554(arg5, var7, (byte) 0, arg0);
                int var18 = method555(arg5, (byte) 20, arg2, var8 - 1);
                if (arg1 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg1 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg1 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg1 == 3 && var17 > 2 && var18 > 0) {
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
                                    if (arg0[var22] != '*') {
                                        break;
                                    }
                                    var19 = var22;
                                } else if (arg0[var22] == '*') {
                                    var19 = var22;
                                    var21 = true;
                                }
                            }
                        }
                        boolean var23 = false;
                        for (int var24 = var19 - 1; var24 >= 0; var24--) {
                            if (var23) {
                                if (method564(arg5[var24], 1)) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method564(arg5[var24], 1)) {
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
                                    if (arg2[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg2[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
                            if (var27) {
                                if (method564(arg5[var28], 1)) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method564(arg5[var28], 1)) {
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
        if (!arg4) {
            ;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CIB[C)I")
    private static final int method554(char[] arg0, int arg1, byte arg2, char[] arg3) {
        if (arg2 == 0) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == 0) {
            return 2;
        }
        int var6 = arg1 - 1;
        while (true) {
            if (var6 >= 0 && method564(arg0[var6], 1)) {
                if (arg0[var6] != ',' && arg0[var6] != '.') {
                    var6--;
                    continue;
                }
                return 3;
            }
            int var7 = 0;
            for (int var8 = arg1 - 1; var8 >= 0 && method564(arg3[var8], 1); var8--) {
                if (arg3[var8] == '*') {
                    var7++;
                }
            }
            if (var7 >= 3) {
                return 4;
            }
            if (method564(arg0[arg1 - 1], 1)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CB[CI)I")
    private static final int method555(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg0.length && method564(arg0[var4], 1)) {
                if (arg0[var4] != '\\' && arg0[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg3 + 1; var6 < arg0.length && method564(arg2[var6], 1); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg1 != 20) {
                field1646 = -447;
            }
            if (var5 >= 5) {
                return 4;
            }
            if (method564(arg0[arg3 + 1], 1)) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(B[C[C[[B)V")
    public static final void method556(byte arg0, char[] arg1, char[] arg2, byte[][] arg3) {
        if (arg1.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg2.length - arg1.length; var5 += var9) {
            int var6 = var5;
            int var7 = 0;
            int var8 = 0;
            var9 = 1;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            label167: while (true) {
                while (true) {
                    if (var6 >= arg2.length || var11 && var12) {
                        break label167;
                    }
                    boolean var13 = false;
                    char var14 = arg2[var6];
                    char var15 = 0;
                    if (var6 + 1 < arg2.length) {
                        var15 = arg2[var6 + 1];
                    }
                    int var16;
                    if (var7 < arg1.length && (var16 = method559(var14, var15, -32194, arg1[var7])) > 0) {
                        if (var16 == 1 && method567(var14, -918)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method567(var14, -918) || method567(var15, -918))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method559(var14, var15, -32194, arg1[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method565(var14, (byte) -14)) {
                                break label167;
                            }
                            if (method564(var14, 1) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method567(var14, -918)) {
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
                    if (var5 - 1 < 0 || method564(arg2[var5 - 1], 1) && arg2[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg2.length || method564(arg2[var6], 1) && arg2[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method564(arg2[var26], 1) || arg2[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg2.length && (!method564(arg2[var26 + var28], 1) || arg2[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg2[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method564(arg2[var26 - 1], 1) || arg2[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method570(var27, false)) {
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
                    byte var21 = method560(false, var19);
                    byte var22 = method560(false, var20);
                    if (arg3 != null && method557(arg3, (byte) 6, var22, var21)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method567(arg2[var33], -918)) {
                            var30++;
                        } else if (method566(arg2[var33], -616)) {
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
        if (arg0 == -45) {
            ;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([[BBBB)Z")
    private static final boolean method557(byte[][] arg0, byte arg1, byte arg2, byte arg3) {
        if (arg1 == 6) {
            boolean var4 = false;
        } else {
            field1645 = true;
        }
        int var5 = 0;
        if (arg0[var5][0] == arg3 && arg0[var5][1] == arg2) {
            return true;
        }
        int var6 = arg0.length - 1;
        if (arg0[var6][0] == arg3 && arg0[var6][1] == arg2) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg0[var7][0] == arg3 && arg0[var7][1] == arg2) {
                return true;
            }
            if (arg3 < arg0[var7][0] || arg0[var7][0] == arg3 && arg2 < arg0[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CZCC)I")
    private static final int method558(char arg0, boolean arg1, char arg2, char arg3) {
        if (!arg1) {
            return 0;
        } else if (arg0 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg0 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg0 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CCIC)I")
    private static final int method559(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != -32194) {
            return 3;
        } else if (arg0 == arg3) {
            return 1;
        } else {
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
                        if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
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
                    if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
                        return 0;
                    }
                    return 2;
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
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(ZC)B")
    private static final byte method560(boolean arg0, char arg1) {
        if (arg0) {
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

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(B[C)V")
    private static final void method561(byte arg0, char[] arg1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 != 72) {
            return;
        }
        while (true) {
            do {
                int var6;
                if ((var6 = method562(var3, false, arg1)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method564(arg1[var8], 1) && !method565(arg1[var8], (byte) -14)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method563(var6, -890, arg1);
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

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(IZ[C)I")
    private static final int method562(int arg0, boolean arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg1) {
            field1647 = 494;
        }
        return -1;
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(II[C)I")
    private static final int method563(int arg0, int arg1, char[] arg2) {
        int var3 = arg0;
        while (true) {
            if (var3 < arg2.length && var3 >= 0) {
                if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            if (arg1 != -890) {
                return field1648;
            }
            return arg2.length;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CI)Z")
    private static final boolean method564(char arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            field1645 = true;
        }
        return !method566(arg0, -616) && !method567(arg0, -918);
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(CB)Z")
    private static final boolean method565(char arg0, byte arg1) {
        if (arg1 != -14) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "b", descriptor = "(CI)Z")
    private static final boolean method566(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if ((arg0 < 'a' || arg0 > 'z') && (arg0 < 'A' || arg0 > 'Z')) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "c", descriptor = "(CI)Z")
    private static final boolean method567(char arg0, int arg1) {
        while (arg1 >= 0) {
        }
        if (arg0 >= '0' && arg0 <= '9') {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(IC)Z")
    private static final boolean method568(int arg0, char arg1) {
        int var2 = 16 / arg0;
        return arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "d", descriptor = "(CI)Z")
    private static final boolean method569(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "([CZ)Z")
    private static final boolean method570(char[] arg0, boolean arg1) {
        boolean var2 = true;
        if (arg1) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method567(arg0[var3], -918) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method571(-13705, arg0);
        int var5 = 0;
        int var6 = field1650.length - 1;
        if (field1650[var5] == var4 || field1650[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1650[var7] == var4) {
                return true;
            }
            if (var4 < field1650[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!XWTMFQHB", name = "a", descriptor = "(I[C)I")
    public static final int method571(int arg0, char[] arg1) {
        if (arg1.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != -13705) {
            field1645 = true;
        }
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
