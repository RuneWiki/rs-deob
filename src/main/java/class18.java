import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HBDSGKGH")
public class class18 {

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "Z")
    private static boolean field809 = true;

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "Z")
    private static boolean field810 = true;

    @OriginalMember(owner = "client!HBDSGKGH", name = "c", descriptor = "B")
    private static byte field811 = -90;

    @OriginalMember(owner = "client!HBDSGKGH", name = "d", descriptor = "Z")
    private static boolean field812 = true;

    @OriginalMember(owner = "client!HBDSGKGH", name = "e", descriptor = "I")
    private static int field813 = 19080;

    @OriginalMember(owner = "client!HBDSGKGH", name = "g", descriptor = "B")
    private static byte field815 = 52;

    @OriginalMember(owner = "client!HBDSGKGH", name = "h", descriptor = "I")
    private static int field816 = -438;

    @OriginalMember(owner = "client!HBDSGKGH", name = "q", descriptor = "[Ljava/lang/String;")
    private static final String[] field825 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

    @OriginalMember(owner = "client!HBDSGKGH", name = "f", descriptor = "I")
    private static int field814;

    @OriginalMember(owner = "client!HBDSGKGH", name = "j", descriptor = "I")
    private static int field818;

    @OriginalMember(owner = "client!HBDSGKGH", name = "i", descriptor = "Z")
    private static boolean field817;

    @OriginalMember(owner = "client!HBDSGKGH", name = "r", descriptor = "Z")
    public static boolean field826;

    @OriginalMember(owner = "client!HBDSGKGH", name = "k", descriptor = "[I")
    private static int[] field819;

    @OriginalMember(owner = "client!HBDSGKGH", name = "p", descriptor = "[I")
    private static int[] field824;

    @OriginalMember(owner = "client!HBDSGKGH", name = "l", descriptor = "[[C")
    private static char[][] field820;

    @OriginalMember(owner = "client!HBDSGKGH", name = "n", descriptor = "[[C")
    private static char[][] field822;

    @OriginalMember(owner = "client!HBDSGKGH", name = "o", descriptor = "[[C")
    private static char[][] field823;

    @OriginalMember(owner = "client!HBDSGKGH", name = "m", descriptor = "[[[B")
    private static byte[][][] field821;

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(LRPFMUSNN;)V")
    public static final void method248(class49 arg0) {
        class63 var1 = new class63((byte) -58, arg0.method414("fragmentsenc.txt", null));
        class63 var2 = new class63((byte) -58, arg0.method414("badenc.txt", null));
        class63 var3 = new class63((byte) -58, arg0.method414("domainenc.txt", null));
        class63 var4 = new class63((byte) -58, arg0.method414("tldlist.txt", null));
        method249(var1, var2, var3, var4);
        if (class33.field960) {
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(LWNCFPLWV;LWNCFPLWV;LWNCFPLWV;LWNCFPLWV;)V")
    private static final void method249(class63 arg0, class63 arg1, class63 arg2, class63 arg3) {
        method251(field811, arg1);
        method252(arg2, 612);
        method253(arg0, 28938);
        method250((byte) 7, arg3);
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(BLWNCFPLWV;)V")
    private static final void method250(byte arg0, class63 arg1) {
        int var2 = arg1.method507();
        field823 = new char[var2][];
        if (arg0 != 7) {
            field817 = !field817;
        }
        field824 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field824[var3] = arg1.method502();
            char[] var4 = new char[arg1.method502()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg1.method502();
            }
            field823[var3] = var4;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(BLWNCFPLWV;)V")
    private static final void method251(byte arg0, class63 arg1) {
        if (arg0 != -90) {
            field817 = !field817;
        }
        int var2 = arg1.method507();
        field820 = new char[var2][];
        field821 = new byte[var2][][];
        method254(0, field820, field821, arg1);
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(LWNCFPLWV;I)V")
    private static final void method252(class63 arg0, int arg1) {
        int var2 = arg0.method507();
        if (arg1 <= 0) {
            field809 = !field809;
        }
        field822 = new char[var2][];
        method255(true, field822, arg0);
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(LWNCFPLWV;I)V")
    private static final void method253(class63 arg0, int arg1) {
        field819 = new int[arg0.method507()];
        if (arg1 != 28938) {
            field816 = 443;
        }
        for (int var2 = 0; var2 < field819.length; var2++) {
            field819[var2] = arg0.method504();
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[[C[[[BLWNCFPLWV;)V")
    private static final void method254(int arg0, char[][] arg1, byte[][][] arg2, class63 arg3) {
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            char[] var5 = new char[arg3.method502()];
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (char) arg3.method502();
            }
            arg1[var4] = var5;
            byte[][] var7 = new byte[arg3.method502()][2];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8][0] = (byte) arg3.method502();
                var7[var8][1] = (byte) arg3.method502();
            }
            if (var7.length > 0) {
                arg2[var4] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Z[[CLWNCFPLWV;)V")
    private static final void method255(boolean arg0, char[][] arg1, class63 arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char[] var4 = new char[arg2.method502()];
            for (int var5 = 0; var5 < var4.length; var5++) {
                var4[var5] = (char) arg2.method502();
            }
            arg1[var3] = var4;
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(B[C)V")
    private static final void method256(byte arg0, char[] arg1) {
        int var2 = 0;
        if (arg0 != -80) {
            field816 = 218;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (method257(field812, arg1[var3])) {
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

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(ZC)Z")
    private static final boolean method257(boolean arg0, char arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return arg1 >= ' ' && arg1 <= '\u007F' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method258(String arg0, boolean arg1) {
        long var2 = System.currentTimeMillis();
        char[] var4 = arg0.toCharArray();
        method256((byte) -80, var4);
        String var5 = (new String(var4)).trim();
        char[] var6 = var5.toLowerCase().toCharArray();
        String var7 = var5.toLowerCase();
        if (!arg1) {
            field809 = !field809;
        }
        method266(var6, 1);
        method261((byte) 6, var6);
        method262(0, var6);
        method275(var6, field815);
        for (int var8 = 0; var8 < field825.length; var8++) {
            int var11 = -1;
            while ((var11 = var7.indexOf(field825[var8], var11 + 1)) != -1) {
                char[] var12 = field825[var8].toCharArray();
                for (int var13 = 0; var13 < var12.length; var13++) {
                    var6[var11 + var13] = var12[var13];
                }
            }
        }
        method259(var5.toCharArray(), 19080, var6);
        method260(-525, var6);
        long var9 = System.currentTimeMillis();
        return (new String(var6)).trim();
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CI[C)V")
    private static final void method259(char[] arg0, int arg1, char[] arg2) {
        if (field813 != arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg2[var3] != '*' && method283(-23995, arg0[var3])) {
                arg2[var3] = arg0[var3];
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[C)V")
    private static final void method260(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            char var4 = arg1[var3];
            if (!method280((byte) 5, var4)) {
                var2 = true;
            } else if (var2) {
                if (method282(var4, -223)) {
                    var2 = false;
                }
            } else if (method283(-23995, var4)) {
                arg1[var3] = (char) (var4 + 'a' - 65);
            }
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(B[C)V")
    private static final void method261(byte arg0, char[] arg1) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            field818 = -143;
        }
        for (int var3 = 0; var3 < 2; var3++) {
            for (int var4 = field820.length - 1; var4 >= 0; var4--) {
                method270(field820[var4], field821[var4], arg1, -42);
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(I[C)V")
    private static final void method262(int arg0, char[] arg1) {
        char[] var2 = (char[]) arg1.clone();
        char[] var3 = new char[] { '(', 'a', ')' };
        method270(var3, null, var2, -42);
        char[] var4 = (char[]) arg1.clone();
        char[] var5 = new char[] { 'd', 'o', 't' };
        method270(var5, null, var4, -42);
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = field822.length - 1; var7 >= 0; var7--) {
            method263(var4, arg1, (byte) 0, field822[var7], var2);
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([C[CB[C[C)V")
    private static final void method263(char[] arg0, char[] arg1, byte arg2, char[] arg3, char[] arg4) {
        if (arg2 == 0) {
            boolean var5 = false;
        } else {
            field818 = -369;
        }
        if (arg3.length > arg1.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg1.length - arg3.length; var7 += var10) {
            int var8 = var7;
            int var9 = 0;
            var10 = 1;
            label62: while (true) {
                while (true) {
                    if (var8 >= arg1.length) {
                        break label62;
                    }
                    boolean var11 = false;
                    char var12 = arg1[var8];
                    char var13 = 0;
                    if (var8 + 1 < arg1.length) {
                        var13 = arg1[var8 + 1];
                    }
                    int var14;
                    if (var9 < arg3.length && (var14 = method272(arg3[var9], var13, field814, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label62;
                        }
                        int var15;
                        if ((var15 = method272(arg3[var9 - 1], var13, field814, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg3.length || !method278(false, var12)) {
                                break label62;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg3.length) {
                boolean var16 = false;
                int var17 = method264(arg4, (byte) 9, var7, arg1);
                int var18 = method265(var8 - 1, arg1, arg0, 947);
                if (var17 > 2 || var18 > 2) {
                    var16 = true;
                }
                if (var16) {
                    for (int var19 = var7; var19 < var8; var19++) {
                        arg1[var19] = '*';
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CBI[C)I")
    private static final int method264(char[] arg0, byte arg1, int arg2, char[] arg3) {
        if (arg2 == 0) {
            return 2;
        }
        for (int var4 = arg2 - 1; var4 >= 0 && method278(false, arg3[var4]); var4--) {
            if (arg3[var4] == '@') {
                return 3;
            }
        }
        int var5 = 0;
        for (int var6 = arg2 - 1; var6 >= 0 && method278(false, arg0[var6]); var6--) {
            if (arg0[var6] == '*') {
                var5++;
            }
        }
        if (arg1 != 9) {
            field818 = 111;
        }
        if (var5 >= 3) {
            return 4;
        } else if (method278(false, arg3[arg2 - 1])) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[C[CI)I")
    private static final int method265(int arg0, char[] arg1, char[] arg2, int arg3) {
        if (arg0 + 1 == arg1.length) {
            return 2;
        }
        int var4 = arg0 + 1;
        while (true) {
            if (var4 < arg1.length && method278(false, arg1[var4])) {
                if (arg1[var4] != '.' && arg1[var4] != ',') {
                    var4++;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 + 1; var6 < arg1.length && method278(false, arg2[var6]); var6++) {
                if (arg2[var6] == '*') {
                    var5++;
                }
            }
            if (arg3 <= 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method278(false, arg1[arg0 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CI)V")
    private static final void method266(char[] arg0, int arg1) {
        char[] var2 = (char[]) arg0.clone();
        char[] var3 = new char[] { 'd', 'o', 't' };
        method270(var3, null, var2, -42);
        char[] var4 = (char[]) arg0.clone();
        char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
        method270(var5, null, var4, -42);
        if (arg1 >= 1 && arg1 <= 1) {
            for (int var6 = 0; var6 < field823.length; var6++) {
                method267(field823[var6], var4, (byte) 64, field824[var6], arg0, var2);
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([C[CBI[C[C)V")
    private static final void method267(char[] arg0, char[] arg1, byte arg2, int arg3, char[] arg4, char[] arg5) {
        if (arg0.length > arg4.length) {
            return;
        }
        boolean var6 = true;
        int var10;
        for (int var7 = 0; var7 <= arg4.length - arg0.length; var7 += var10) {
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
                    if (var9 < arg0.length && (var14 = method272(arg0[var9], var13, field814, var12)) > 0) {
                        var8 += var14;
                        var9++;
                    } else {
                        if (var9 == 0) {
                            break label128;
                        }
                        int var15;
                        if ((var15 = method272(arg0[var9 - 1], var13, field814, var12)) > 0) {
                            var8 += var15;
                            if (var9 == 1) {
                                var10++;
                            }
                        } else {
                            if (var9 >= arg0.length || !method278(false, var12)) {
                                break label128;
                            }
                            var8++;
                        }
                    }
                }
            }
            if (var9 >= arg0.length) {
                boolean var16 = false;
                int var17 = method268(var7, (byte) -75, arg4, arg5);
                int var18 = method269(arg1, (byte) 83, arg4, var8 - 1);
                if (arg3 == 1 && var17 > 0 && var18 > 0) {
                    var16 = true;
                }
                if (arg3 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
                    var16 = true;
                }
                if (arg3 == 3 && var17 > 0 && var18 > 2) {
                    var16 = true;
                }
                boolean var10000;
                if (arg3 == 3 && var17 > 2 && var18 > 0) {
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
                                if (method278(false, arg4[var24])) {
                                    break;
                                }
                                var19 = var24;
                            } else if (!method278(false, arg4[var24])) {
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
                                    if (arg1[var26] != '*') {
                                        break;
                                    }
                                    var20 = var26;
                                } else if (arg1[var26] == '*') {
                                    var20 = var26;
                                    var25 = true;
                                }
                            }
                        }
                        boolean var27 = false;
                        for (int var28 = var20 + 1; var28 < arg4.length; var28++) {
                            if (var27) {
                                if (method278(false, arg4[var28])) {
                                    break;
                                }
                                var20 = var28;
                            } else if (!method278(false, arg4[var28])) {
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
        if (arg2 == 64) {
            ;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(IB[C[C)I")
    private static final int method268(int arg0, byte arg1, char[] arg2, char[] arg3) {
        if (arg0 == 0) {
            return 2;
        }
        int var4 = arg0 - 1;
        while (true) {
            if (var4 >= 0 && method278(false, arg2[var4])) {
                if (arg2[var4] != ',' && arg2[var4] != '.') {
                    var4--;
                    continue;
                }
                return 3;
            }
            int var5 = 0;
            for (int var6 = arg0 - 1; var6 >= 0 && method278(false, arg3[var6]); var6--) {
                if (arg3[var6] == '*') {
                    var5++;
                }
            }
            if (arg1 != -75) {
                return field818;
            }
            if (var5 >= 3) {
                return 4;
            }
            if (method278(false, arg2[arg0 - 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CB[CI)I")
    private static final int method269(char[] arg0, byte arg1, char[] arg2, int arg3) {
        if (arg3 + 1 == arg2.length) {
            return 2;
        }
        int var4 = arg3 + 1;
        while (true) {
            if (var4 < arg2.length && method278(false, arg2[var4])) {
                if (arg2[var4] != '\\' && arg2[var4] != '/') {
                    var4++;
                    continue;
                }
                return 3;
            }
            if (arg1 != 83) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            int var6 = 0;
            for (int var7 = arg3 + 1; var7 < arg2.length && method278(false, arg0[var7]); var7++) {
                if (arg0[var7] == '*') {
                    var6++;
                }
            }
            if (var6 >= 5) {
                return 4;
            }
            if (method278(false, arg2[arg3 + 1])) {
                return 1;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([C[[B[CI)V")
    public static final void method270(char[] arg0, byte[][] arg1, char[] arg2, int arg3) {
        if (arg0.length > arg2.length) {
            return;
        }
        boolean var4 = true;
        int var10;
        for (int var5 = 0; var5 <= arg2.length - arg0.length; var5 += var10) {
            int var7 = var5;
            int var8 = 0;
            int var9 = 0;
            var10 = 1;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            label176: while (true) {
                while (true) {
                    if (var7 >= arg2.length || var12 && var13) {
                        break label176;
                    }
                    boolean var14 = false;
                    char var15 = arg2[var7];
                    char var16 = 0;
                    if (var7 + 1 < arg2.length) {
                        var16 = arg2[var7 + 1];
                    }
                    int var17;
                    if (var8 < arg0.length && (var17 = method273(arg0[var8], var15, 0, var16)) > 0) {
                        if (var17 == 1 && method281(var15, true)) {
                            var12 = true;
                        }
                        if (var17 == 2 && (method281(var15, true) || method281(var16, true))) {
                            var12 = true;
                        }
                        var7 += var17;
                        var8++;
                    } else {
                        if (var8 == 0) {
                            break label176;
                        }
                        int var18;
                        if ((var18 = method273(arg0[var8 - 1], var15, 0, var16)) > 0) {
                            var7 += var18;
                            if (var8 == 1) {
                                var10++;
                            }
                        } else {
                            if (var8 >= arg0.length || !method279(var15, false)) {
                                break label176;
                            }
                            if (method278(false, var15) && var15 != '\'') {
                                var11 = true;
                            }
                            if (method281(var15, true)) {
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
                    if (var5 - 1 < 0 || method278(false, arg2[var5 - 1]) && arg2[var5 - 1] != '\'') {
                        var24 = true;
                    }
                    if (var7 >= arg2.length || method278(false, arg2[var7]) && arg2[var7] != '\'') {
                        var25 = true;
                    }
                    if (!var24 || !var25) {
                        boolean var26 = false;
                        int var27 = var5 - 2;
                        if (var24) {
                            var27 = var5;
                        }
                        while (!var26 && var27 < var7) {
                            if (var27 >= 0 && (!method278(false, arg2[var27]) || arg2[var27] == '\'')) {
                                char[] var28 = new char[3];
                                int var29;
                                for (var29 = 0; var29 < 3 && var27 + var29 < arg2.length && (!method278(false, arg2[var27 + var29]) || arg2[var27 + var29] == '\''); var29++) {
                                    var28[var29] = arg2[var27 + var29];
                                }
                                boolean var30 = true;
                                if (var29 == 0) {
                                    var30 = false;
                                }
                                if (var29 < 3 && var27 - 1 >= 0 && (!method278(false, arg2[var27 - 1]) || arg2[var27 - 1] == '\'')) {
                                    var30 = false;
                                }
                                if (var30 && !method284(-514, var28)) {
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
                        var20 = arg2[var5 - 1];
                    }
                    char var21 = ' ';
                    if (var7 < arg2.length) {
                        var21 = arg2[var7];
                    }
                    byte var22 = method274(false, var20);
                    byte var23 = method274(false, var21);
                    if (arg1 != null && method271(var23, (byte) 7, arg1, var22)) {
                        var19 = false;
                    }
                }
                if (var19) {
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = -1;
                    for (int var34 = var5; var34 < var7; var34++) {
                        if (method281(arg2[var34], true)) {
                            var31++;
                        } else if (method280((byte) 5, arg2[var34])) {
                            var32++;
                            var33 = var34;
                        }
                    }
                    if (var33 > -1) {
                        var31 -= var7 - var33 - 1;
                    }
                    if (var31 <= var32) {
                        for (int var35 = var5; var35 < var7; var35++) {
                            arg2[var35] = '*';
                        }
                    } else {
                        var10 = 1;
                    }
                }
            }
        }
        if (arg3 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(BB[[BB)Z")
    private static final boolean method271(byte arg0, byte arg1, byte[][] arg2, byte arg3) {
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        int var5 = 0;
        if (arg2[var5][0] == arg3 && arg2[var5][1] == arg0) {
            return true;
        }
        int var6 = arg2.length - 1;
        if (arg2[var6][0] == arg3 && arg2[var6][1] == arg0) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (arg2[var7][0] == arg3 && arg2[var7][1] == arg0) {
                return true;
            }
            if (arg3 < arg2[var7][0] || arg2[var7][0] == arg3 && arg0 < arg2[var7][1]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(CCIC)I")
    private static final int method272(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 0) {
            return field816;
        } else if (arg0 == arg3) {
            return 1;
        } else if (arg0 == 'o' && arg3 == '0') {
            return 1;
        } else if (arg0 == 'o' && arg3 == '(' && arg1 == ')') {
            return 2;
        } else if (arg0 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
            return 1;
        } else if (arg0 == 'e' && arg3 == '€') {
            return 1;
        } else if (arg0 == 's' && arg3 == '$') {
            return 1;
        } else if (arg0 == 'l' && arg3 == 'i') {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(CCIC)I")
    private static final int method273(char arg0, char arg1, int arg2, char arg3) {
        if (arg2 != 0) {
            return 1;
        } else if (arg0 == arg1) {
            return 1;
        } else {
            if (arg0 >= 'a' && arg0 <= 'm') {
                if (arg0 == 'a') {
                    if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
                        if (arg1 == '/' && arg3 == '\\') {
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'b') {
                    if (arg1 != '6' && arg1 != '8') {
                        if ((arg1 != '1' || arg3 != '3') && (arg1 != 'i' || arg3 != '3')) {
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                if (arg0 == 'c') {
                    if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'd') {
                    if ((arg1 != '[' || arg3 != ')') && (arg1 != 'i' || arg3 != ')')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'e') {
                    if (arg1 != '3' && arg1 != '€') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'f') {
                    if (arg1 == 'p' && arg3 == 'h') {
                        return 2;
                    }
                    if (arg1 == '£') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'g') {
                    if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'h') {
                    if (arg1 == '#') {
                        return 1;
                    }
                    return 0;
                }
                if (arg0 == 'i') {
                    if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
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
                    if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
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
                    if (arg1 != '0' && arg1 != '*') {
                        if ((arg1 != '(' || arg3 != ')') && (arg1 != '[' || arg3 != ']') && (arg1 != '{' || arg3 != '}') && (arg1 != '<' || arg3 != '>')) {
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
                    if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 't') {
                    if (arg1 != '7' && arg1 != '+') {
                        return 0;
                    }
                    return 1;
                }
                if (arg0 == 'u') {
                    if (arg1 == 'v') {
                        return 1;
                    }
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'v') {
                    if ((arg1 != '\\' || arg3 != '/') && (arg1 != '\\' || arg3 != '|') && (arg1 != '|' || arg3 != '/')) {
                        return 0;
                    }
                    return 2;
                }
                if (arg0 == 'w') {
                    if (arg1 == 'v' && arg3 == 'v') {
                        return 2;
                    }
                    return 0;
                }
                if (arg0 == 'x') {
                    if ((arg1 != ')' || arg3 != '(') && (arg1 != '}' || arg3 != '{') && (arg1 != ']' || arg3 != '[') && (arg1 != '>' || arg3 != '<')) {
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
                    if (arg1 == 'o' || arg1 == 'O') {
                        return 1;
                    } else if ((arg1 != '(' || arg3 != ')') && (arg1 != '{' || arg3 != '}') && (arg1 != '[' || arg3 != ']')) {
                        return 0;
                    } else {
                        return 2;
                    }
                } else if (arg0 == '1') {
                    return arg1 == 'l' ? 1 : 0;
                } else {
                    return 0;
                }
            } else if (arg0 == ',') {
                return arg1 == '.' ? 1 : 0;
            } else if (arg0 == '.') {
                return arg1 == ',' ? 1 : 0;
            } else if (arg0 == '!') {
                return arg1 == 'i' ? 1 : 0;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(ZC)B")
    private static final byte method274(boolean arg0, char arg1) {
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

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CB)V")
    private static final void method275(char[] arg0, byte arg1) {
        if (arg1 != 52) {
            field818 = 115;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        while (true) {
            do {
                int var6;
                if ((var6 = method276(0, arg0, var3)) == -1) {
                    return;
                }
                boolean var7 = false;
                for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
                    if (!method278(false, arg0[var8]) && !method279(arg0[var8], false)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    var4 = 0;
                }
                if (var4 == 0) {
                    var5 = var6;
                }
                var3 = method277(arg0, var6, (byte) 0);
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

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(I[CI)I")
    private static final int method276(int arg0, char[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
            if (arg1[var3] >= '0' && arg1[var3] <= '9') {
                return var3;
            }
        }
        return arg0 == 0 ? -1 : field814;
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "([CIB)I")
    private static final int method277(char[] arg0, int arg1, byte arg2) {
        if (arg2 != 0) {
            field810 = !field810;
        }
        int var3 = arg1;
        while (true) {
            if (var3 < arg0.length && var3 >= 0) {
                if (arg0[var3] >= '0' && arg0[var3] <= '9') {
                    var3++;
                    continue;
                }
                return var3;
            }
            return arg0.length;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "c", descriptor = "(ZC)Z")
    private static final boolean method278(boolean arg0, char arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return !method280((byte) 5, arg1) && !method281(arg1, true);
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(CZ)Z")
    private static final boolean method279(char arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        } else if (arg0 >= 'a' && arg0 <= 'z') {
            return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(BC)Z")
    private static final boolean method280(byte arg0, char arg1) {
        if (arg0 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "(CZ)Z")
    private static final boolean method281(char arg0, boolean arg1) {
        if (!arg1) {
            field818 = 33;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(CI)Z")
    private static final boolean method282(char arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "a", descriptor = "(IC)Z")
    private static final boolean method283(int arg0, char arg1) {
        if (arg0 != -23995) {
            throw new NullPointerException();
        }
        return arg1 >= 'A' && arg1 <= 'Z';
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "c", descriptor = "(I[C)Z")
    private static final boolean method284(int arg0, char[] arg1) {
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (!method281(arg1[var3], true) && arg1[var3] != '\u0000') {
                var2 = false;
            }
        }
        if (var2) {
            return true;
        }
        int var4 = method285(arg1, 11984);
        int var5 = 0;
        int var6 = field819.length - 1;
        if (arg0 >= 0) {
            field813 = 335;
        }
        if (field819[var5] == var4 || field819[var6] == var4) {
            return true;
        }
        do {
            int var7 = (var5 + var6) / 2;
            if (field819[var7] == var4) {
                return true;
            }
            if (var4 < field819[var7]) {
                var6 = var7;
            } else {
                var5 = var7;
            }
        } while (var5 != var6 && var5 + 1 != var6);
        return false;
    }

    @OriginalMember(owner = "client!HBDSGKGH", name = "b", descriptor = "([CI)I")
    public static final int method285(char[] arg0, int arg1) {
        if (arg0.length > 6) {
            return 0;
        }
        int var2 = 0;
        if (arg1 != 11984) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            char var5 = arg0[arg0.length - var4 - 1];
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
