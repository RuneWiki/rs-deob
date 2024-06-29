import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZWRCNFEU")
public class class70 {

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "I")
    private static int field1708 = 791;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "I")
    private static int field1710 = 26695;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "d", descriptor = "I")
    private static int field1711 = 557;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "f", descriptor = "Z")
    private static boolean field1713 = true;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "g", descriptor = "Z")
    private static boolean field1714 = true;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "n", descriptor = "[Ljava/lang/String;")
    private static final String[] field1721 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!ZWRCNFEU", name = "e", descriptor = "I")
    private static int field1712;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "Z")
    private static boolean field1709;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "o", descriptor = "Z")
    public static boolean field1722;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "h", descriptor = "[I")
    private static int[] field1715;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "m", descriptor = "[I")
    private static int[] field1720;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "i", descriptor = "[[C")
    private static char[][] field1716;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "k", descriptor = "[[C")
    private static char[][] field1718;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "l", descriptor = "[[C")
    private static char[][] field1719;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "j", descriptor = "[[[B")
    private static byte[][][] field1717;

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(LMAARFNGV;)V")
    public static final void method567(class29 arg0) {
        class14 var1 = new class14(arg0.method332("fragmentsenc.txt", null), true);
        class14 var2 = new class14(arg0.method332("badenc.txt", null), true);
        class14 var3 = new class14(arg0.method332("domainenc.txt", null), true);
        class14 var4 = new class14(arg0.method332("tldlist.txt", null), true);
        method568(var1, var2, var3, var4);
        if (class34.field1027) {
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(LEMWAMCXW;LEMWAMCXW;LEMWAMCXW;LEMWAMCXW;)V")
    private static final void method568(class14 arg0, class14 arg1, class14 arg2, class14 arg3) {
        method570(arg1, 227);
        method571(arg2, -36);
        method572(arg0, 26695);
        method569(arg3, 0);
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(LEMWAMCXW;I)V")
    private static final void method569(class14 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        int var2 = arg0.method222();
        field1719 = new char[var2][];
        field1720 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1720[var3] = arg0.method217();
            char[] var4 = new char[arg0.method217()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg0.method217();
            }
            field1719[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(LEMWAMCXW;I)V")
    private static final void method570(class14 arg0, int arg1) {
        int var2 = arg0.method222();
        int var3 = 91 / arg1;
        field1716 = new char[var2][];
        field1717 = new byte[var2][][];
        method573(field1717, field1716, arg0, 0);
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "(LEMWAMCXW;I)V")
    private static final void method571(class14 arg0, int arg1) {
        int var2 = arg0.method222();
        if (arg1 < 0) {
            field1718 = new char[var2][];
            method574(9, arg0, field1718);
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "d", descriptor = "(LEMWAMCXW;I)V")
    private static final void method572(class14 arg0, int arg1) {
        if (field1710 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1715 = new int[arg0.method222()];
        for (int var3 = 0; var3 < field1715.length; var3++) {
            field1715[var3] = arg0.method219();
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([[[B[[CLEMWAMCXW;I)V")
    private static final void method573(byte[][][] arg0, char[][] arg1, class14 arg2, int arg3) {
        if (arg3 != 0) {
            field1708 = -335;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg2.method217()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg2.method217();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg2.method217()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg2.method217();
                var7[var8][1] = (byte) arg2.method217();
            }
            if (var7.length > 0) {
                arg0[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ILEMWAMCXW;[[C)V")
    private static final void method574(int arg0, class14 arg1, char[][] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            char[] var4 = new char[arg1.method217()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method217();
            }
            arg2[var3] = var4;
        }
        if (arg0 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CB)V")
    private static final void method575(char[] arg0, byte arg1) {
        int var2 = 0;
        if (arg1 != -27) {
            field1708 = 44;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (method576(arg0[var3], false)) {
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

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(CZ)Z")
    private static final boolean method576(char arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method577(boolean arg0, String arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg1.toCharArray();
        method575(var4, (byte) -27);
        String var5 = (new String(var4)).trim();
        if (arg0) {
            field1714 = !field1714;
        }
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        method585(749, var6);
        method580(234, var6);
        method581(var6, -42275);
        method594(var6, field1712);
        for (int var8 = 0; var8 < field1721.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field1721[var8], var11 + 1)) != -1) {
                char[] var12 = field1721[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method578(var6, var5.toCharArray(), -814);
        method579(1, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([C[CI)V")
    private static final void method578(char[] arg0, char[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg0[var3] != '*' && method602(arg1[var3], 5066)) {
                arg0[var3] = arg1[var3];
            }
        }
        if (arg2 >= 0) {
            field1709 = !field1709;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(I[C)V")
    private static final void method579(int arg0, char[] arg1) {
        boolean var2 = true;
        if (arg0 < 1 || arg0 > 1) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method599(true, var4)) {
                var2 = true;
            } else if (var2) {
                if (method601(var4, (byte) 84)) {
                    var2 = false;
                }
            } else if (method602(var4, 5066)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(I[C)V")
    private static final void method580(int arg0, char[] arg1) {
        for (int var2 = 0; var2 < 2; var2++) {
            for (int var4 = field1716.length - 1; var4 >= 0; var4--) {
                method589((byte) 0, field1716[var4], field1717[var4], arg1);
            }
        }
        int var3 = 30 / arg0;
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CI)V")
    private static final void method581(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        if (arg1 != -42275) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        method589((byte) 0, var3, null, var2);
        char[] var5 = (char[]) arg0.clone();
        char[] var6 = new char[] { 'd', 'o', 't' };
        method589((byte) 0, var6, null, var5);
        for (int var7 = field1718.length - 1; var7 >= 0; var7--) {
            method582(field1718[var7], var2, true, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([C[CZ[C[C)V")
    private static final void method582(char[] arg0, char[] arg1, boolean arg2, char[] arg3, char[] arg4) {
        if (arg0.length > arg3.length) {
            return;
        }
        boolean var5 = true;
        if (!arg2) {
            field1708 = 217;
        }
        int var9;
        for (int var6 = 0; var6 <= arg3.length - arg0.length; var6 += var9) {
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
                    if (var8 < arg0.length && (var13 = method591((byte) 42, var11, var12, arg0[var8])) > 0) {
                        var7 += var13;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label61;
                        }
                        int var14;
                        if ((var14 = method591((byte) 42, var11, var12, arg0[var8 - 1])) > 0) {
                            var7 += var14;
                            if (var8 == 1) {
                                var9++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method597((byte) -90, var11)) {
                                break label61;
                            }
                            var7++;
                        }
                    }
                }
            }
            if (var8 >= arg0.length) {
                boolean var15 = false;
                int var16 = method583(var6, arg1, (byte) 112, arg3);
                int var17 = method584(arg3, 4, var7 - 1, arg4);
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

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(I[CB[C)I")
    private static final int method583(int arg0, char[] arg1, byte arg2, char[] arg3) {
        if (arg2 != 112) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg0 == 0) {
            return 2;
        }
        for (int var5 = arg0 - 1; var5 >= 0 && method597((byte) -90, arg3[var5]); var5--) {
            if (arg3[var5] == '@') {
                return 3;
            }
        }
        int var6 = 0;
        for (int var7 = arg0 - 1; var7 >= 0 && method597((byte) -90, arg1[var7]); var7--) {
            if (arg1[var7] == '*') {
                var6++;
            }
        }
        if (var6 >= 3) {
            return 4;
        } else if (method597((byte) -90, arg3[arg0 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CII[C)I")
    private static final int method584(char[] arg0, int arg1, int arg2, char[] arg3) {
        if (arg2 + 1 == arg0.length) {
            return 2;
        }
        int var4 = arg2 + 1;
        while (true) {
            if (var4 < arg0.length && method597((byte) -90, arg0[var4])) {
                if (arg0[var4] != '.' && arg0[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            if (arg1 != 4) {
                return field1712;
            }
            for (int var6 = arg2 + 1; var6 < arg0.length && method597((byte) -90, arg3[var6]); var6++) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method597((byte) -90, arg0[arg2 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "(I[C)V")
    private static final void method585(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method589((byte) 0, var3, null, var2);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        if (arg0 > 0) {
            method589((byte) 0, var5, null, var4);
            for (int var6 = 0; var6 < field1719.length; var6++) {
                method586(arg1, field1720[var6], var2, field1719[var6], false, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CI[C[CZ[C)V")
    private static final void method586(char[] arg0, int arg1, char[] arg2, char[] arg3, boolean arg4, char[] arg5) {
        if (arg3.length > arg0.length) {
            return;
        }
        boolean var6 = true;
        if (arg4) {
            field1714 = !field1714;
        }
        int var10;
        for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label133: while (true) {
                while (true) {
                    if (var8 >= arg0.length) {
                        break label133;
                    }
                    boolean var11 = false;
                    char var12 = arg0[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg0.length) {
                        var13 = arg0[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method591((byte) 42, var12, var13, arg3[var9])) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label133;
                        }
                        int var15;
                        if ((var15 = method591((byte) 42, var12, var13, arg3[var9 - 1])) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method597((byte) -90, var12)) {
                                break label133;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method587(-541, var7, arg0, arg2);
                int var18 = method588(0, var8 - 1, arg0, arg5);
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
                                if (method597((byte) -90, arg0[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method597((byte) -90, arg0[var24])) {
                                var23 = true;
                                var19 = var24;
                            }
                        }
                    }
                    if (var18 > 2) {
                        if (var18 == 4) {
                            boolean var25 = false;
                            for (int var26 = var20 + 1; var26 < arg0.length; var26++) {
                                if (var25) {
                                    if (arg5[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg5[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
                            if (var27) {
                                if (method597((byte) -90, arg0[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method597((byte) -90, arg0[var28])) {
                                var27 = true;
                                var20 = var28;
                            }
                        }
                    }
                    for (int var29 = var19; var29 <= var20; var29++) {
                        arg0[var29] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(II[C[C)I")
    private static final int method587(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 == 0) {
            return 2;
        }
        int var4 = arg1 - 1;
        while (true) {
            if (var4 >= 0 && method597((byte) -90, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            if (arg0 >= 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg1 - 1; var7 >= 0 && method597((byte) -90, arg3[var7]); var7--) {
                if (arg3[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 3) {
                return 4;
            }
            if (method597((byte) -90, arg2[arg1 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(II[C[C)I")
    private static final int method588(int arg0, int arg1, char[] arg2, char[] arg3) {
        if (arg1 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg1 + 1;
        while (true) {
            if (var4 < arg2.length && method597((byte) -90, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg0 != 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg1 + 1; var7 < arg2.length && method597((byte) -90, arg3[var7]); var7++) {
                if (arg3[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method597((byte) -90, arg2[arg1 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(B[C[[B[C)V")
    public static final void method589(byte arg0, char[] arg1, byte[][] arg2, char[] arg3) {
        if (arg1.length > arg3.length) {
            return;
        }
        boolean var4 = true;
        int var9;
        for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var9) {
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
                    if (var7 < arg1.length && (var16 = method592(false, var14, var15, arg1[var7])) > 0) {
                        if (var16 == 1 && method600(2232, var14)) {
                            var11 = true;
                        }
                        if (var16 == 2 && (method600(2232, var14) || method600(2232, var15))) {
                            var11 = true;
                        }
                        var6 += var16;
                        var7++;
                    } else {
                        if (var7 == 0) {
                            break label167;
                        }
                        int var17;
                        if ((var17 = method592(false, var14, var15, arg1[var7 - 1])) > 0) {
                            var6 += var17;
                            if (var7 == 1) {
                                var9++;
                            }
                        } else {
                            if (var7 >= arg1.length || !method598(var14, field1713)) {
                                break label167;
                            }
                            if (method597((byte) -90, var14) && var14 != '\'') {
                                var10 = true;
                            }
                            if (method600(2232, var14)) {
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
                    if (var5 - 1 < 0 || method597((byte) -90, arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
                        var23 = true;
                    }
                    if (var6 >= arg3.length || method597((byte) -90, arg3[var6]) && arg3[var6] != '\'') {
                        var24 = true;
                    }
                    if (!var23 || !var24) {
                        boolean var25 = false;
                        int var26 = var5 - 2;
                        if (var23) {
                            var26 = var5;
                        }
                        while (!var25 && var26 < var6) {
                            if (var26 >= 0 && (!method597((byte) -90, arg3[var26]) || arg3[var26] == '\'')) {
                                char[] var27 = new char[3];
                                int var28;
                                for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!method597((byte) -90, arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
                                    var27[var28] = arg3[var26 + var28];
                                }
                                boolean var29 = true;
                                if (var28 == 0) {
                                    var29 = false;
                                }
                                if (var28 < 3 && var26 - 1 >= 0 && (!method597((byte) -90, arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
                                    var29 = false;
                                }
                                if (var29 && !method603(var27, false)) {
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
                    byte var21 = method593(var19, 7);
                    byte var22 = method593(var20, 7);
                    if (arg2 != null && method590(var22, var21, arg2, 33183)) {
                        var18 = false;
                    }
                }
                if (var18) {
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = -1;
                    for (int var33 = var5; var33 < var6; var33++) {
                        if (method600(2232, arg3[var33])) {
                            var30++;
                        } else if (method599(true, arg3[var33])) {
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
        if (arg0 != 0) {
            field1711 = 108;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(BB[[BI)Z")
    private static final boolean method590(byte arg0, byte arg1, byte[][] arg2, int arg3) {
        if (arg3 != 33183) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = 0;
        if (arg2[var5][0] == arg1 && arg2[var5][1] == arg0) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg1 && arg2[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg2[var7][0] == arg1 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg1 < arg2[var7][0] || arg2[var7][0] == arg1 && arg0 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(BCCC)I")
    private static final int method591(byte arg0, char arg1, char arg2, char arg3) {
        if (arg0 != 42) {
            field1709 = !field1709;
        }
        if (arg1 == arg3) {
            return 1;
        } else if (arg3 == 'o' && arg1 == '0') {
            return 1;
        } else if (arg3 == 'o' && arg1 == '(' && arg2 == ')') {
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

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ZCCC)I")
    private static final int method592(boolean arg0, char arg1, char arg2, char arg3) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == arg3) {
            return 1;
        }
        if (arg3 >= 'a' && arg3 <= 'm') {
            if (arg3 == 'a') {
                if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                    if (arg1 == '/' && arg2 == '\\') {
                        return 2;
                    }
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'b') {
                if (arg1 != '6' && arg1 != '8') {
                    if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            if (arg3 == 'c') {
                if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'd') {
                if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'e') {
                if (arg1 != '3' && arg1 != '€') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'f') {
                if (arg1 == 'p' && arg2 == 'h') {
                    return 2;
                }
                if (arg1 == '£') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'g') {
                if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'h') {
                if (arg1 == '#') {
                    return 1;
                }
                return 0;
            }
            if (arg3 == 'i') {
                if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                if (arg1 != '0' && arg1 != '*') {
                    if (arg1 == '(' && arg2 == ')' || arg1 == '[' && arg2 == ']' || arg1 == '{' && arg2 == '}' || arg1 == '<' && arg2 == '>') {
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
                if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 't') {
                if (arg1 != '7' && arg1 != '+') {
                    return 0;
                }
                return 1;
            }
            if (arg3 == 'u') {
                if (arg1 == 'v') {
                    return 1;
                }
                if (arg1 == '\\' && arg2 == '/' || arg1 == '\\' && arg2 == '|' || arg1 == '|' && arg2 == '/') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'v') {
                if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
                    return 0;
                }
                return 2;
            }
            if (arg3 == 'w') {
                if (arg1 == 'v' && arg2 == 'v') {
                    return 2;
                }
                return 0;
            }
            if (arg3 == 'x') {
                if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
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
                if (arg1 == 'o' || arg1 == 'O') {
                    return 1;
                } else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
                    return 0;
                } else {
                    return 2;
                }
            } else if (arg3 == '1') {
                return arg1 == 'l' ? 1 : 0;
            } else {
                return 0;
            }
        } else if (arg3 == ',') {
            return arg1 == '.' ? 1 : 0;
        } else if (arg3 == '.') {
            return arg1 == ',' ? 1 : 0;
        } else if (arg3 == '!') {
            return arg1 == 'i' ? 1 : 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(CI)B")
    private static final byte method593(char arg0, int arg1) {
        if (arg1 != 7) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return (byte) (arg0 + 1 - 'a');
        } else if (arg0 == '\'') {
            return 28;
        } else if (arg0 >= '0' && arg0 <= '9') {
            return (byte) (arg0 + 29 - '0');
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "([CI)V")
    private static final void method594(char[] arg0, int arg1) {
        boolean var2 = false;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        while (true) {
            do {
                int var7;
                if ((var7 = method595(var4, 0, arg0)) == -1) {
                    return;
                }
                boolean var8 = false;
                for (int var9 = var4; var9 >= 0 && var9 < var7 && !var8; var9++) {
                    if (!method597((byte) -90, arg0[var9]) && !method598(arg0[var9], field1713)) {
                        var8 = true;
                    }
                }
                if (var8) {
                    var5 = 0;
                }
                if (var5 == 0) {
                    var6 = var7;
                }
                var4 = method596(false, arg0, var7);
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

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(II[C)I")
    private static final int method595(int arg0, int arg1, char[] arg2) {
        for (int var3 = arg0; var3 < arg2.length && var3 >= 0; var3++) {
            if (arg2[var3] >= '0' && arg2[var3] <= '9') {
                return var3;
            }
        }
        if (arg1 != 0) {
            field1712 = 27;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(Z[CI)I")
    private static final int method596(boolean arg0, char[] arg1, int arg2) {
        if (arg0) {
            return field1710;
        }
        int var3 = arg2;
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

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(BC)Z")
    private static final boolean method597(byte arg0, char arg1) {
        if (arg0 != -90) {
            field1709 = !field1709;
        }
        return !method599(true, arg1) && !method600(2232, arg1);
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(CZ)Z")
    private static final boolean method598(char arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(ZC)Z")
    private static final boolean method599(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(IC)Z")
    private static final boolean method600(int arg0, char arg1) {
        if (arg0 != 2232) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "(CB)Z")
    private static final boolean method601(char arg0, byte arg1) {
        if (arg1 != 84) {
            field1711 = -344;
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "b", descriptor = "(CI)Z")
    private static final boolean method602(char arg0, int arg1) {
        if (arg1 != 5066) {
            field1712 = -233;
        }
        return arg0 >= 'A' && arg0 <= 'Z';
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "a", descriptor = "([CZ)Z")
    private static final boolean method603(char[] arg0, boolean arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (!method600(2232, arg0[var3]) && arg0[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method604(arg0, 5);
        int var5 = 0;
        if (arg1) {
            throw new NullPointerException();
        }
        int var6 = field1715.length - 1;
        if (field1715[var5] == var4 || field1715[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field1715[var7] == var4) {
                return true;
            }
            if (var4 < field1715[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!ZWRCNFEU", name = "c", descriptor = "([CI)I")
    public static final int method604(char[] arg0, int arg1) {
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
        if (arg1 >= 5 && arg1 <= 5) {
            return var2;
        } else {
            return 0;
        }
    }
}
