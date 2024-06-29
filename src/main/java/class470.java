import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class470 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[B")
    private byte[] field6965;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "[[B")
    private byte[][] field6971;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field6977;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lje;")
    public static class278 field6968 = new class278(13, 0, 1, 0);

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lmn;")
    public static class249 field6975 = new class249(8);

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Ls;")
    public static class186 field6982 = new class186(38, 3);

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Z")
    public static boolean field6984 = true;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "Lla;")
    public static class317 field6980;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "Lrv;")
    public static class73 field6983;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/lang/String;IB[Lo;)I")
    public final int method2805(int arg0, String arg1, int arg2, byte arg3, class24[] arg4) {
        if (arg2 == 0) {
            arg2 = this.field6977;
        }
        if (arg3 != -87) {
            this.method2805(-63, null, 99, (byte) 48, null);
        }
        field6966++;
        int var6 = this.method2817((byte) 83, class154.field2510, arg1, arg4, new int[] { arg0 });
        int var7 = (var6 - 1) * arg2;
        return this.field6972 + var7 + this.field6963;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZCI)I")
    public final int method2806(boolean arg0, char arg1, int arg2) {
        field6969++;
        if (!arg0) {
            this.field6977 = -18;
        }
        return this.field6971 == null ? 0 : this.field6971[arg2][arg1];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public final int method2807(int arg0, int arg1) {
        if (arg0 == 255) {
            field6973++;
            return this.field6965[arg1] & 0xFF;
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2808(String arg0, int arg1) {
        if (arg1 >= -59) {
            return 65;
        } else {
            field6964++;
            return this.method2811(null, arg0, true);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZIII)I")
    public static final int method2809(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        field6970++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        if (!arg3) {
            method2812(64);
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return 1 + 7 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Z")
    public static final boolean method2810(int arg0, int arg1) {
        field6976++;
        if (arg1 == 51 || arg1 == 9 || arg1 == 6 || arg1 == 22 || arg1 == 20) {
            return true;
        } else if (arg1 == 11 || arg1 == 1012) {
            return true;
        } else {
            if (arg0 >= -87) {
                field6968 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lo;Ljava/lang/String;Z)I")
    public final int method2811(class24[] arg0, String arg1, boolean arg2) {
        field6961++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg1.substring(var4 + 1, var8);
                    var4 = -1;
                    if (var10.equals("lt")) {
                        var9 = '<';
                    } else if (var10.equals("gt")) {
                        var9 = '>';
                    } else if (var10.equals("nbsp")) {
                        var9 = ' ';
                    } else if (var10.equals("shy")) {
                        var9 = '\u00AD';
                    } else if (var10.equals("times")) {
                        var9 = '×';
                    } else if (var10.equals("euro")) {
                        var9 = '€';
                    } else if (var10.equals("copy")) {
                        var9 = '©';
                    } else {
                        if (!var10.equals("reg")) {
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class19.method129(-58, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg0[var11].method147();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field6965[class260.method1671(7763, var9) & 0xFF] & 0xFF;
                    if (this.field6971 != null && var5 != -1) {
                        var6 += this.field6971[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg2) {
            return var6;
        } else {
            return -57;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)[Llf;")
    public static final class160[] method2812(int arg0) {
        field6974++;
        return arg0 == 0 ? new class160[] { class506.field7386, class5.field92, class155.field2525 } : null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lo;IZLjava/lang/String;)I")
    public final int method2813(class24[] arg0, int arg1, boolean arg2, String arg3) {
        field6962++;
        if (!arg2) {
            this.method2811(null, null, false);
        }
        int var5 = this.method2817((byte) 89, class154.field2510, arg3, arg0, new int[] { arg1 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2811(arg0, class154.field2510[var7], true);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static void method2814(int arg0) {
        field6983 = null;
        field6975 = null;
        int var1 = 64 % ((arg0 - 3) / 40);
        field6982 = null;
        field6968 = null;
        field6980 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V")
    public class470(byte[] arg0) {
        class289 var2 = new class289(arg0);
        int var3 = var2.method1858(-3256);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1858(-3256) == 1;
        this.field6965 = new byte[256];
        var2.method1849(256, -1, this.field6965, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1858(-3256);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1858(-3256);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1816(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1816(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field6971 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6971[var13][var14] = (byte) class395.method2456(var6, var9, var11, var13, -106, var5, var14, this.field6965);
                        }
                    }
                }
            }
            this.field6977 = var6[32] + var5[32];
        } else {
            this.field6977 = var2.method1858(-3256);
        }
        var2.method1858(-3256);
        var2.method1858(-3256);
        this.field6972 = var2.method1858(-3256);
        this.field6963 = var2.method1858(-3256);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I[Lo;I)I")
    public final int method2815(String arg0, int arg1, class24[] arg2, int arg3) {
        field6978++;
        int var5 = -1 % ((-arg1 - 74) / 37);
        return this.method2817((byte) 107, class154.field2510, arg0, arg2, new int[] { arg3 });
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lo;ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2816(class24[] arg0, int arg1, String arg2, int arg3) {
        field6967++;
        if (this.method2811(arg0, arg2, true) <= arg1) {
            return arg2;
        }
        int var5 = arg1 - this.method2811(null, "...", true);
        int var6 = -1;
        int var7 = arg3;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg2.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg2.substring(var6 + 1, var11);
                    var6 = -1;
                    if (var13.equals("lt")) {
                        var12 = '<';
                    } else if (var13.equals("gt")) {
                        var12 = '>';
                    } else if (var13.equals("nbsp")) {
                        var12 = ' ';
                    } else if (var13.equals("shy")) {
                        var12 = '\u00AD';
                    } else if (var13.equals("times")) {
                        var12 = '×';
                    } else if (var13.equals("euro")) {
                        var12 = '€';
                    } else if (var13.equals("copy")) {
                        var12 = '©';
                    } else {
                        if (!var13.equals("reg")) {
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class19.method129(-81, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg0[var14].method147();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg2.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field6965[class260.method1671(7763, var12) & 0xFF] & 0xFF;
                    if (this.field6971 != null && var7 != -1) {
                        var8 += this.field6971[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field6971 != null) {
                        var15 = this.field6971[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[Ljava/lang/String;Ljava/lang/String;[Lo;[I)I")
    public final int method2817(byte arg0, String[] arg1, String arg2, class24[] arg3, int[] arg4) {
        field6960++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg0 <= 49) {
            this.field6963 = -38;
        }
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class260.method1671(7763, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2807(255, var16);
                    if (this.field6971 != null && var12 != -1) {
                        var17 += this.field6971[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg2.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg1[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2807(255, 60);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2807(255, 62);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2807(255, 160);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2807(255, 173);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2807(255, 215);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2807(255, 8364);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2807(255, 169);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2807(255, 174);
                        if (this.field6971 != null && var12 != -1) {
                            var17 += this.field6971[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class19.method129(-87, var19.substring(4));
                            var17 += arg3[var20].method147();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (var6 > arg4[var13 < arg4.length ? var13 : arg4.length - 1]) {
                            if (var8 >= 0) {
                                arg1[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg1[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
                            }
                        }
                        if (var16 == 45) {
                            var9 = var6;
                            var10 = 0;
                            var8 = var15;
                        }
                    }
                }
            }
        }
        if (var7 < arg2.length()) {
            arg1[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }
}
