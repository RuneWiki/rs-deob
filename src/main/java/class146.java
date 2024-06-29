import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class146 {

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "[B")
    private byte[] field2131;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "[[B")
    private byte[][] field2130;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "Ldg;")
    public static class376 field2127 = new class376(70, 18);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lf;Ljava/lang/String;IBI)I", line = 5)
    public final int method1036(class702[] arg0, String arg1, int arg2, byte arg3, int arg4) {
        field2134++;
        if (arg4 == 0) {
            arg4 = this.field2136;
        }
        int var6 = this.method1042(false, new int[] { arg2 }, arg0, arg1, class213.field2969);
        int var7 = (var6 - 1) * arg4;
        if (arg3 != 12) {
            this.method1039(63, null);
        }
        return this.field2126 + var7 + this.field2132;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;[Lf;IZ)I", line = 27)
    public final int method1037(String arg0, class702[] arg1, int arg2, boolean arg3) {
        field2137++;
        int var5 = this.method1042(!arg3, new int[] { arg2 }, arg1, arg0, class213.field2969);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1043(48, arg1, class213.field2969[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        if (!arg3) {
            this.field2126 = -107;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIC)I", line = 56)
    public final int method1038(int arg0, int arg1, char arg2) {
        field2128++;
        if (arg1 > -1) {
            this.field2131 = null;
        }
        return this.field2130 == null ? 0 : this.field2130[arg0][arg2];
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;)I", line = 71)
    public final int method1039(int arg0, String arg1) {
        if (arg0 != 0) {
            this.method1038(16, -2, 'U');
        }
        field2138++;
        return this.method1043(arg0 + 29, null, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILi;)V", line = 82)
    public static final void method1040(int arg0, class37 arg1) {
        class296.field4340[arg0] = arg1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 85)
    public static void method1041(int arg0) {
        field2127 = null;
        if (arg0 >= -106) {
            field2127 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z[I[Lf;Ljava/lang/String;[Ljava/lang/String;)I", line = 102)
    public final int method1042(boolean arg0, int[] arg1, class702[] arg2, String arg3, String[] arg4) {
        field2139++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        if (arg0) {
            this.method1039(65, null);
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class520.method2966(arg3.charAt(var15), 20965) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1045(255, var16);
                    if (this.field2130 != null && var12 != -1) {
                        var17 += this.field2130[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg3.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg4[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg4.length) {
                            return 0;
                        }
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1045(255, 60);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1045(255, 62);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1045(255, 160);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1045(255, 173);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1045(255, 215);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1045(255, 8364);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1045(255, 169);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1045(255, 174);
                        if (this.field2130 != null && var12 != -1) {
                            var17 += this.field2130[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class440.method2607(7330, var19.substring(4));
                            var12 = -1;
                            var17 += arg2[var20].method931();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var8 = var15;
                            var9 = var6;
                        }
                        if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg4[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg4[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
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
        if (arg3.length() > var7) {
            arg4[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lf;Ljava/lang/String;)I", line = 356)
    public final int method1043(int arg0, class702[] arg1, String arg2) {
        field2133++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg0 < 6) {
            this.field2132 = 53;
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
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
                                    int var11 = class440.method2607(7330, var10.substring(4));
                                    var6 += arg1[var11].method931();
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
                    var6 += this.field2131[class520.method2966(var9, 20965) & 0xFF] & 0xFF;
                    if (this.field2130 != null && var5 != -1) {
                        var6 += this.field2130[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lf;Ljava/lang/String;I)Ljava/lang/String;", line = 461)
    public final String method1044(int arg0, class702[] arg1, String arg2, int arg3) {
        field2125++;
        if (arg3 >= this.method1043(53, arg1, arg2)) {
            return arg2;
        }
        int var5 = arg3 - this.method1043(26, null, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        if (arg0 < 14) {
            return null;
        }
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
                                    int var14 = class440.method2607(7330, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg1[var14].method931();
                                    if (var8 > var5) {
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
                    var8 += this.field2131[class520.method2966(var12, 20965) & 0xFF] & 0xFF;
                    if (this.field2130 != null && var7 != -1) {
                        var8 += this.field2130[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2130 != null) {
                        var15 = this.field2130[var12][46] + var8;
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

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I", line = 583)
    public final int method1045(int arg0, int arg1) {
        if (arg0 != 255) {
            field2127 = null;
        }
        field2135++;
        return this.field2131[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "([B)V", line = 594)
    public class146(byte[] arg0) {
        class695 var2 = new class695(arg0);
        int var3 = var2.method3826(false);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3826(false) == 1;
        this.field2131 = new byte[256];
        var2.method3876((byte) 127, this.field2131, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method3826(false);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method3826(false);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3827((byte) -118);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3827((byte) 102);
                    var11[var12][var16] = var15;
                }
            }
            this.field2130 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2130[var13][var14] = (byte) class486.method2824((byte) 5, var5, var11, this.field2131, var9, var7, var13, var14);
                        }
                    }
                }
            }
            this.field2136 = var7[32] + var5[32];
        } else {
            this.field2136 = var2.method3826(false);
        }
        var2.method3826(false);
        var2.method3826(false);
        this.field2126 = var2.method3826(false);
        this.field2132 = var2.method3826(false);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[Lf;Ljava/lang/String;)I", line = 717)
    public final int method1046(int arg0, int arg1, class702[] arg2, String arg3) {
        if (arg1 != -257) {
            this.field2132 = -28;
        }
        field2129++;
        return this.method1042(false, new int[] { arg0 }, arg2, arg3, class213.field2969);
    }
}
