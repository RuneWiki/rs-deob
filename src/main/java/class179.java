import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class179 {

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "[B")
    private byte[] field2468;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[[B")
    private byte[][] field2457;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lkr;")
    public static class602 field2456 = new class602(58, 0);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lkr;")
    public static class602 field2460 = new class602(5, -2);

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Lef;")
    public static class263 field2467 = new class263();

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Llg;")
    public static class140 field2470;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 5)
    public static final void method1128(boolean arg0, String arg1, byte arg2) {
        if (arg2 == 94) {
            class66.method532(-1, -1, arg1, (byte) -121, arg0);
            field2455++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/String;[Lfd;[I)I", line = 16)
    public final int method1129(byte arg0, String arg1, String[] arg2, class298[] arg3, int[] arg4) {
        field2472++;
        if (arg1 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        if (arg0 < 74) {
            this.field2457 = null;
        }
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class27.method156(true, arg1.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1135(var16, 0);
                    var18 = var15;
                    if (this.field2457 != null && var12 != -1) {
                        var17 += this.field2457[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg1.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg2[var13] = arg1.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1135(60, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1135(62, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1135(160, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1135(173, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1135(215, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1135(8364, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1135(169, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1135(174, 0);
                        if (this.field2457 != null && var12 != -1) {
                            var17 += this.field2457[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class341.method2169(var19.substring(4), -83);
                            var17 += arg3[var20].method1963();
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
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg4[var13 < arg4.length ? var13 : arg4.length - 1]) {
                            if (var8 >= 0) {
                                arg2[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg2[var13] = arg1.substring(var7, var18);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var9 = var6;
                            var8 = var15;
                        }
                    }
                }
            }
        }
        if (arg1.length() > var7) {
            arg2[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(CII)I", line = 269)
    public final int method1130(char arg0, int arg1, int arg2) {
        field2465++;
        if (arg2 >= -111) {
            field2456 = null;
        }
        return this.field2457 == null ? 0 : this.field2457[arg1][arg0];
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 291)
    public static void method1131(int arg0) {
        if (arg0 == 0) {
            field2470 = null;
            field2460 = null;
            field2467 = null;
            field2456 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/String;I[Lfd;)I", line = 304)
    public final int method1132(int arg0, int arg1, String arg2, int arg3, class298[] arg4) {
        if (arg1 == 0) {
            arg1 = this.field2458;
        }
        field2461++;
        int var6 = this.method1129((byte) 81, arg2, class584.field7971, arg4, new int[] { arg0 });
        if (arg3 != 6379) {
            this.field2457 = null;
        }
        int var7 = (var6 - 1) * arg1;
        return this.field2462 + var7 + this.field2464;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)I", line = 327)
    public final int method1133(int arg0, String arg1) {
        field2454++;
        if (arg0 <= 81) {
            this.field2462 = 22;
        }
        return this.method1137(256, null, arg1);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([Lfd;Ljava/lang/String;II)I", line = 339)
    public final int method1134(class298[] arg0, String arg1, int arg2, int arg3) {
        field2471++;
        if (arg2 != 1839) {
            this.method1133(27, null);
        }
        int var5 = this.method1129((byte) 80, arg1, class584.field7971, arg0, new int[] { arg3 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1137(arg2 - 1583, arg0, class584.field7971[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I", line = 368)
    public final int method1135(int arg0, int arg1) {
        field2469++;
        if (arg1 != 0) {
            this.method1135(-20, -102);
        }
        return this.field2468[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;I[Lfd;)I", line = 383)
    public final int method1136(int arg0, String arg1, int arg2, class298[] arg3) {
        if (arg0 == -257) {
            field2466++;
            return this.method1129((byte) 116, arg1, class584.field7971, arg3, new int[] { arg2 });
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[Lfd;Ljava/lang/String;)I", line = 396)
    public final int method1137(int arg0, class298[] arg1, String arg2) {
        field2463++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg0 != 256) {
            this.field2468 = null;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg2.substring(var4 + 1, var8);
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class341.method2169(var10.substring(4), -114);
                                    var5 = -1;
                                    var6 += arg1[var11].method1963();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field2468[class27.method156(true, var9) & 0xFF] & 0xFF;
                    if (this.field2457 != null && var5 != -1) {
                        var6 += this.field2457[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z[Lfd;Ljava/lang/String;I)Ljava/lang/String;", line = 503)
    public final String method1138(boolean arg0, class298[] arg1, String arg2, int arg3) {
        field2459++;
        if (this.method1137(256, arg1, arg2) <= arg3) {
            return arg2;
        }
        if (arg0) {
            field2460 = null;
        }
        int var5 = arg3 - this.method1137(256, null, "...");
        int var6 = -1;
        int var7 = -1;
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class341.method2169(var13.substring(4), 52);
                                    var8 += arg1[var14].method1963();
                                    var7 = -1;
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
                    var8 += this.field2468[class27.method156(true, var12) & 0xFF] & 0xFF;
                    if (this.field2457 != null && var7 != -1) {
                        var8 += this.field2457[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2457 != null) {
                        var15 = this.field2457[var12][46] + var8;
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

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B)V", line = 632)
    public class179(byte[] arg0) {
        class63 var2 = new class63(arg0);
        int var3 = var2.method505((byte) -119);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method505((byte) -119) == 1;
        this.field2468 = new byte[256];
        var2.method449(0, 256, this.field2468, (byte) -113);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method505((byte) -119);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method505((byte) -119);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method491(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method491(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field2457 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2457[var13][var14] = (byte) class588.method3394(var11, var5, this.field2468, var6, (byte) -71, var14, var13, var9);
                        }
                    }
                }
            }
            this.field2458 = var6[32] + var5[32];
        } else {
            this.field2458 = var2.method505((byte) -119);
        }
        var2.method505((byte) -119);
        var2.method505((byte) -119);
        this.field2462 = var2.method505((byte) -119);
        this.field2464 = var2.method505((byte) -119);
    }
}
