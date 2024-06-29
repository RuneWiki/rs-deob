import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class65 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[B")
    private byte[] field1013;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "[[B")
    private byte[][] field1023;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lwd;")
    public static class149 field1021 = class449.method2807((byte) 110);

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
    public static int[] field1026 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1030 = "level: ";

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lsr;")
    public static class136 field1027;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lqj;")
    public static class296 field1029;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Llf;Ljava/lang/String;I)I")
    public final int method439(class130[] arg0, String arg1, int arg2) {
        field1031++;
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
                                    int var11 = class160.method1062(false, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg0[var11].method874();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field1013[class81.method576(false, var9) & 0xFF] & 0xFF;
                    if (this.field1023 != null && var5 != -1) {
                        var6 += this.field1023[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg2 != 8364) {
            this.field1015 = -107;
        }
        return var6;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)I")
    public final int method440(boolean arg0, int arg1) {
        field1018++;
        if (!arg0) {
            field1021 = null;
        }
        return this.field1013[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Llf;ILjava/lang/String;B)I")
    public final int method441(class130[] arg0, int arg1, String arg2, byte arg3) {
        if (arg3 != -45) {
            this.field1022 = -15;
        }
        field1011++;
        int var5 = this.method446(-24976, new int[] { arg1 }, arg0, class206.field2793, arg2);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method439(arg0, class206.field2793[var7], 8364);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;[Llf;II)I")
    public final int method442(int arg0, String arg1, class130[] arg2, int arg3, int arg4) {
        field1017++;
        if (arg3 == arg4) {
            arg3 = this.field1022;
        }
        int var6 = this.method446(-24976, new int[] { arg0 }, arg2, class206.field2793, arg1);
        int var7 = (var6 - 1) * arg3;
        return this.field1025 + this.field1015 + var7;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Llf;ZILjava/lang/String;)I")
    public final int method443(class130[] arg0, boolean arg1, int arg2, String arg3) {
        if (arg1) {
            return -37;
        } else {
            field1019++;
            return this.method446(-24976, new int[] { arg2 }, arg0, class206.field2793, arg3);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static final void method444(byte arg0) {
        class414.field6006++;
        class442.field6400.method158((byte) 7, 186);
        if (arg0 < 103) {
            method444((byte) -8);
        }
        field1014++;
        class442.field6400.method2416(22064, class445.field6418);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method445(int arg0) {
        field1026 = null;
        field1029 = null;
        field1021 = null;
        field1030 = null;
        field1027 = null;
        if (arg0 != 0) {
            field1026 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[I[Llf;[Ljava/lang/String;Ljava/lang/String;)I")
    public final int method446(int arg0, int[] arg1, class130[] arg2, String[] arg3, String arg4) {
        field1012++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg0 != -24976) {
            method449((byte) 80, (String) null, (char) 65443);
        }
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class81.method576(false, arg4.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method440(true, var16);
                    if (this.field1023 != null && var12 != -1) {
                        var17 += this.field1023[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg4.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg3[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg3.length) {
                            return 0;
                        }
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method440(true, 60);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method440(true, 62);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method440(true, 160);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method440(true, 173);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method440(true, 215);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method440(true, 8364);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method440(true, 169);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method440(true, 174);
                        if (this.field1023 != null && var12 != -1) {
                            var17 += this.field1023[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class160.method1062(false, var19.substring(4));
                            var17 += arg2[var20].method874();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (var6 > arg1[var13 < arg1.length ? var13 : arg1.length - 1]) {
                            if (var8 >= 0) {
                                arg3[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var12 = -1;
                            } else {
                                arg3[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
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
        if (arg4.length() > var7) {
            arg3[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZCI)I")
    public final int method447(boolean arg0, char arg1, int arg2) {
        field1016++;
        if (arg0) {
            return this.field1023 == null ? 0 : this.field1023[arg2][arg1];
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method448(byte arg0, String arg1) {
        field1024++;
        if (arg0 > -52) {
            this.method447(false, '<', 18);
        }
        return this.method439((class130[]) null, arg1, 8364);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method449(byte arg0, String arg1, char arg2) {
        field1020++;
        if (arg0 >= -78) {
            method449((byte) -90, (String) null, (char) 65474);
        }
        int var3 = class215.method1380(arg1, (byte) 29, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "([B)V")
    public class65(byte[] arg0) {
        class371 var2 = new class371(arg0);
        int var3 = var2.method2429(0);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2429(0) == 1;
        this.field1013 = new byte[256];
        var2.method2427(this.field1013, 0, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2429(0);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2429(0);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2418(-21337);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2418(-21337);
                    var11[var12][var16] = var15;
                }
            }
            this.field1023 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field1023[var13][var14] = (byte) class261.method1610(var6, -98, var14, var9, var11, var5, this.field1013, var13);
                        }
                    }
                }
            }
            this.field1022 = var6[32] + var5[32];
        } else {
            this.field1022 = var2.method2429(0);
        }
        var2.method2429(0);
        var2.method2429(0);
        this.field1015 = var2.method2429(0);
        this.field1025 = var2.method2429(0);
    }
}
