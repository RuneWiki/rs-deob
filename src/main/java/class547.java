import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class547 {

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "[B")
    private byte[] field7098;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "[[B")
    private byte[][] field7093;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "I")
    public int field7102;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "Lra;")
    public static class361 field7092 = new class361(108, 3);

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "Lfs;")
    public static class546 field7104 = new class546("WTWIP", 3);

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "Le;")
    public static class702 field7106;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "[I")
    public static int[] field7096;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lxa;IILjava/lang/String;)I", line = 3)
    public final int method2898(class511[] arg0, int arg1, int arg2, String arg3) {
        field7101++;
        int var5 = this.method2906((byte) 125, new int[] { arg1 }, arg0, class64.field865, arg3);
        int var6 = 0;
        if (arg2 != -5633) {
            field7096 = null;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2907(class64.field865[var7], arg0, -1);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lxa;ILjava/lang/String;Z)I", line = 36)
    public final int method2899(class511[] arg0, int arg1, String arg2, boolean arg3) {
        field7089++;
        if (!arg3) {
            field7092 = null;
        }
        return this.method2906((byte) 125, new int[] { arg1 }, arg0, class64.field865, arg2);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 51)
    public final int method2900(boolean arg0, String arg1) {
        if (!arg0) {
            this.method2906((byte) 78, null, null, null, null);
        }
        field7090++;
        return this.method2907(arg1, null, -1);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(CII)I", line = 62)
    public final int method2901(char arg0, int arg1, int arg2) {
        if (arg1 == 12873) {
            field7091++;
            return this.field7093 == null ? 0 : this.field7093[arg2][arg0];
        } else {
            return 39;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V", line = 78)
    public static void method2902(int arg0) {
        field7096 = null;
        if (arg0 != -1) {
            field7096 = null;
        }
        field7104 = null;
        field7106 = null;
        field7092 = null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)I", line = 91)
    public final int method2903(boolean arg0, int arg1) {
        field7099++;
        return arg0 ? 76 : this.field7098[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IILjava/lang/String;I[Lxa;)I", line = 105)
    public final int method2904(int arg0, int arg1, String arg2, int arg3, class511[] arg4) {
        field7095++;
        if (arg0 == 0) {
            arg0 = this.field7100;
        }
        int var6 = this.method2906((byte) 125, new int[] { arg1 }, arg4, class64.field865, arg2);
        int var7 = (arg3 + var6) * arg0;
        return this.field7103 + var7 + this.field7102;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;[Lxa;II)Ljava/lang/String;", line = 124)
    public final String method2905(String arg0, class511[] arg1, int arg2, int arg3) {
        field7097++;
        if (arg3 != 4) {
            return null;
        } else if (arg2 >= this.method2907(arg0, arg1, arg3 ^ 0xFFFFFFFB)) {
            return arg0;
        } else {
            int var5 = arg2 - this.method2907("...", null, -1);
            int var6 = -1;
            int var7 = -1;
            int var8 = 0;
            int var9 = arg0.length();
            String var10 = "";
            for (int var11 = 0; var11 < var9; var11++) {
                char var12 = arg0.charAt(var11);
                if (var12 == '<') {
                    var6 = var11;
                } else {
                    if (var12 == '>' && var6 != -1) {
                        String var13 = arg0.substring(var6 + 1, var11);
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
                                        int var14 = class703.method3845((byte) -94, var13.substring(4));
                                        var7 = -1;
                                        var8 += arg1[var14].method602();
                                        if (var8 > var5) {
                                            return var10 + "...";
                                        }
                                        var10 = arg0.substring(0, var11 + 1);
                                    } catch (Exception var16) {
                                    }
                                }
                                continue;
                            }
                            var12 = '®';
                        }
                    }
                    if (var6 == -1) {
                        var8 += this.field7098[class576.method3152(var12, 117) & 0xFF] & 0xFF;
                        if (this.field7093 != null && var7 != -1) {
                            var8 += this.field7093[var7][var12];
                        }
                        var7 = var12;
                        int var15 = var8;
                        if (this.field7093 != null) {
                            var15 = this.field7093[var12][46] + var8;
                        }
                        if (var5 < var15) {
                            return var10 + "...";
                        }
                        var10 = arg0.substring(0, var11 + 1);
                    }
                }
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B[I[Lxa;[Ljava/lang/String;Ljava/lang/String;)I", line = 245)
    public final int method2906(byte arg0, int[] arg1, class511[] arg2, String[] arg3, String arg4) {
        field7105++;
        if (arg4 == null) {
            return 0;
        }
        if (arg0 != 125) {
            this.field7100 = -101;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class576.method3152(arg4.charAt(var15), 119) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2903(false, var16);
                    if (this.field7093 != null && var12 != -1) {
                        var17 += this.field7093[var12][var16];
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
                        if (arg3.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2903(false, 60);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2903(false, 62);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2903(false, 160);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2903(false, 173);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2903(false, 215);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2903(false, 8364);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2903(false, 169);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2903(false, 174);
                        if (this.field7093 != null && var12 != -1) {
                            var17 += this.field7093[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class703.method3845((byte) -94, var19.substring(4));
                            var12 = -1;
                            var17 += arg2[var20].method602();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg3[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var7 = var18;
                                var6 = var17;
                                var12 = -1;
                            } else {
                                arg3[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
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
        if (arg4.length() > var7) {
            arg3[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;[Lxa;I)I", line = 495)
    public final int method2907(String arg0, class511[] arg1, int arg2) {
        field7094++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = arg2;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg0.substring(var4 + 1, var8);
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
                                    int var11 = class703.method3845((byte) -94, var10.substring(4));
                                    var6 += arg1[var11].method602();
                                    var5 = -1;
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field7098[class576.method3152(var9, 124) & 0xFF] & 0xFF;
                    if (this.field7093 != null && var5 != -1) {
                        var6 += this.field7093[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "([B)V", line = 604)
    public class547(byte[] arg0) {
        class418 var2 = new class418(arg0);
        int var3 = var2.method2396(-115);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2396(-107) == 1;
        this.field7098 = new byte[256];
        var2.method2398(this.field7098, 0, -119, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2396(21);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2396(36);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2387((byte) -90);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2387((byte) -14);
                    var11[var12][var16] = var15;
                }
            }
            this.field7093 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field7093[var13][var14] = (byte) class572.method3052(var5, 91, this.field7098, var14, var9, var6, var13, var11);
                        }
                    }
                }
            }
            this.field7100 = var5[32] + var6[32];
        } else {
            this.field7100 = var2.method2396(-125);
        }
        var2.method2396(-122);
        var2.method2396(-126);
        this.field7103 = var2.method2396(-126);
        this.field7102 = var2.method2396(-121);
    }
}
