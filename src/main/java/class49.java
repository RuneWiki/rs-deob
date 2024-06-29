import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class49 {

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "[B")
    private byte[] field579;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "[[B")
    private byte[][] field585;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field589 = new String[] { method510(method509("\u00146d$")), method510(method509("\u0001m&f\t")), method510(method509("\u0011\"if6R")), method510(method509("\u0011\"if5R")), method510(method509("\u00167")), method510(method509("\t+q")), method510(method509("\u0014!{8")), method510(method509("\u001d7")), method510(method509("\u0013.ou")), method510(method509("\u000e*e-\u0007")), method510(method509("\u0019,x1")), method510(method509("\b&o")), method510(method509("\u00181")), method510(method509("\u001f6z'")), method510(method509("\u0011\"if3R")), method510(method509("\u0011\"if0R")), method510(method509("\u0011\"if=R")), method510(method509("\u0011\"ifH\u0013-a<JR")), method510(method509("\u0011\"if7R")), method510(method509("\u0011\"if>R")), method510(method509("Tm&")), method510(method509("\u0011\"if2R")), method510(method509("\u0011\"if<R")), method510(method509("\u0011\"if1R")), method510(method509("\u0011\"if?R")) };

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field580 = new String[100];

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 3)
    public final int method498(String arg0, int arg1) {
        try {
            if (arg1 != -1) {
                this.field581 = -67;
            }
            field576++;
            return this.method500(0, null, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field589[22] + (arg0 == null ? field589[0] : field589[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ[Lhk;Ljava/lang/String;)Ljava/lang/String;", line = 16)
    public final String method499(int arg0, boolean arg1, class107[] arg2, String arg3) {
        try {
            field575++;
            if (arg0 >= this.method500(0, arg2, arg3)) {
                return arg3;
            }
            int var18 = arg0 - this.method500(0, null, field589[20]);
            int var5 = -1;
            int var6 = -1;
            int var7 = 0;
            if (!arg1) {
                method502(-14);
            }
            int var8 = arg3.length();
            String var9 = "";
            for (int var10 = 0; var10 < var8; var10++) {
                char var11 = arg3.charAt(var10);
                if (var11 == '<') {
                    var5 = var10;
                } else {
                    if (var11 == '>' && var5 != -1) {
                        String var12 = arg3.substring(var5 + 1, var10);
                        var5 = -1;
                        if (var12.equals(field589[4])) {
                            var11 = '<';
                        } else if (var12.equals(field589[7])) {
                            var11 = '>';
                        } else if (var12.equals(field589[6])) {
                            var11 = ' ';
                        } else if (var12.equals(field589[5])) {
                            var11 = '\u00AD';
                        } else if (var12.equals(field589[9])) {
                            var11 = '×';
                        } else if (var12.equals(field589[13])) {
                            var11 = '€';
                        } else if (var12.equals(field589[10])) {
                            var11 = '©';
                        } else {
                            if (!var12.equals(field589[11])) {
                                if (var12.startsWith(field589[8]) && arg2 != null) {
                                    try {
                                        int var13 = class441.method3457(true, var12.substring(4));
                                        var6 = -1;
                                        var7 += arg2[var13].method26();
                                        if (var7 > var18) {
                                            return var9 + field589[20];
                                        }
                                        var9 = arg3.substring(0, var10 + 1);
                                    } catch (Exception var16) {
                                    }
                                }
                                continue;
                            }
                            var11 = '®';
                        }
                    }
                    if (var5 == -1) {
                        var7 += this.field579[class666.method4832((byte) -79, var11) & 0xFF] & 0xFF;
                        if (this.field585 != null && var6 != -1) {
                            var7 += this.field585[var6][var11];
                        }
                        var6 = var11;
                        int var14 = var7;
                        if (this.field585 != null) {
                            var14 = this.field585[var11][46] + var7;
                        }
                        if (var14 > var18) {
                            return var9 + field589[20];
                        }
                        var9 = arg3.substring(0, var10 + 1);
                    }
                }
            }
            return arg3;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field589[21] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field589[0] : field589[1]) + ',' + (arg3 == null ? field589[0] : field589[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[Lhk;Ljava/lang/String;)I", line = 139)
    public final int method500(int arg0, class107[] arg1, String arg2) {
        try {
            field573++;
            if (arg2 == null) {
                return 0;
            }
            int var4 = -1;
            int var5 = -1;
            int var6 = arg0;
            int var7 = arg2.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg2.charAt(var8);
                if (var9 == '<') {
                    var4 = var8;
                } else {
                    if (var9 == '>' && var4 != -1) {
                        String var10 = arg2.substring(var4 + 1, var8);
                        var4 = -1;
                        if (var10.equals(field589[4])) {
                            var9 = '<';
                        } else if (var10.equals(field589[7])) {
                            var9 = '>';
                        } else if (var10.equals(field589[6])) {
                            var9 = ' ';
                        } else if (var10.equals(field589[5])) {
                            var9 = '\u00AD';
                        } else if (var10.equals(field589[9])) {
                            var9 = '×';
                        } else if (var10.equals(field589[13])) {
                            var9 = '€';
                        } else if (var10.equals(field589[10])) {
                            var9 = '©';
                        } else {
                            if (!var10.equals(field589[11])) {
                                if (var10.startsWith(field589[8]) && arg1 != null) {
                                    try {
                                        int var11 = class441.method3457(true, var10.substring(4));
                                        var5 = -1;
                                        var6 += arg1[var11].method26();
                                    } catch (Exception var13) {
                                    }
                                }
                                continue;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field579[class666.method4832((byte) -63, var9) & 0xFF] & 0xFF;
                        if (this.field585 != null && var5 != -1) {
                            var6 += this.field585[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field589[16] + arg0 + ',' + (arg1 == null ? field589[0] : field589[1]) + ',' + (arg2 == null ? field589[0] : field589[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)I", line = 241)
    public final int method501(int arg0, byte arg1) {
        try {
            field586++;
            return arg1 == -90 ? this.field579[arg0] & 0xFF : -119;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field589[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V", line = 254)
    public static void method502(int arg0) {
        try {
            field580 = null;
            if (arg0 != 160) {
                field580 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field589[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(CII)I", line = 264)
    public final int method503(char arg0, int arg1, int arg2) {
        try {
            if (arg2 > -11) {
                field580 = null;
            }
            field578++;
            return this.field585 == null ? 0 : this.field585[arg1][arg0];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field589[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;II[Lhk;)I", line = 292)
    public final int method504(String arg0, int arg1, int arg2, class107[] arg3) {
        try {
            field588++;
            int var5 = this.method507(class117.field1710, arg0, arg3, arg2 + 7933, new int[] { arg1 });
            int var6 = 0;
            for (int var7 = 0; var7 < var5; var7++) {
                int var8 = this.method500(0, arg3, class117.field1710[var7]);
                if (var8 > var6) {
                    var6 = var8;
                }
            }
            if (arg2 != -8055) {
                field574 = 95;
            }
            return var6;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field589[19] + (arg0 == null ? field589[0] : field589[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field589[0] : field589[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I[Lhk;II)I", line = 323)
    public final int method505(String arg0, int arg1, class107[] arg2, int arg3, int arg4) {
        try {
            field572++;
            if (arg4 == 0) {
                arg4 = this.field584;
            }
            int var6 = this.method507(class117.field1710, arg0, arg2, arg1 ^ 0x74, new int[] { arg3 });
            int var7 = (arg1 + var6) * arg4;
            return this.field583 + var7 + this.field581;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field589[2] + (arg0 == null ? field589[0] : field589[1]) + ',' + arg1 + ',' + (arg2 == null ? field589[0] : field589[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)[Lpe;", line = 346)
    public static final class636[] method506(int arg0) {
        try {
            if (arg0 == 256) {
                field577++;
                return new class636[] { class366.field5965, class662.field9435, class339.field5522, class103.field1513, class738.field10828, class261.field4005, class40.field460, class628.field9044, class459.field7079, class358.field5778, class599.field8681, class184.field2932, class396.field6283, class721.field10574 };
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field589[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[Lhk;I[I)I", line = 361)
    public final int method507(String[] arg0, String arg1, class107[] arg2, int arg3, int[] arg4) {
        try {
            field587++;
            if (arg1 == null) {
                return 0;
            }
            int var6 = 0;
            int var7 = 0;
            if (arg3 >= -111) {
                this.method500(39, null, null);
            }
            int var8 = -1;
            int var9 = 0;
            byte var10 = 0;
            int var11 = -1;
            int var12 = -1;
            int var13 = 0;
            int var14 = arg1.length();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = class666.method4832((byte) 119, arg1.charAt(var15)) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var17 += this.method501(var16, (byte) -90);
                        var18 = var15;
                        if (this.field585 != null && var12 != -1) {
                            var17 += this.field585[var12][var16];
                        }
                        var12 = var16;
                    } else {
                        if (var16 != 62) {
                            continue;
                        }
                        var18 = var11;
                        String var19 = arg1.substring(var11 + 1, var15);
                        var11 = -1;
                        if (var19.equals(field589[12])) {
                            arg0[var13] = arg1.substring(var7, var15 + 1);
                            var13++;
                            if (arg0.length <= var13) {
                                return 0;
                            }
                            var6 = 0;
                            var8 = -1;
                            var7 = var15 + 1;
                            var12 = -1;
                            continue;
                        }
                        if (var19.equals(field589[4])) {
                            var17 += this.method501(60, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals(field589[7])) {
                            var17 += this.method501(62, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals(field589[6])) {
                            var17 += this.method501(160, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals(field589[5])) {
                            var17 += this.method501(173, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals(field589[9])) {
                            var17 += this.method501(215, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals(field589[13])) {
                            var17 += this.method501(8364, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals(field589[10])) {
                            var17 += this.method501(169, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals(field589[11])) {
                            var17 += this.method501(174, (byte) -90);
                            if (this.field585 != null && var12 != -1) {
                                var17 += this.field585[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith(field589[8]) && arg2 != null) {
                            try {
                                int var20 = class441.method3457(true, var19.substring(4));
                                var17 += arg2[var20].method26();
                                var12 = -1;
                            } catch (Exception var22) {
                            }
                        }
                        var16 = -1;
                    }
                    if (var17 > 0) {
                        var6 += var17;
                        if (arg4 != null) {
                            if (var16 == 32) {
                                var10 = 1;
                                var9 = var6;
                                var8 = var15;
                            }
                            if (var6 > arg4[var13 < arg4.length ? var13 : arg4.length - 1]) {
                                if (var8 < 0) {
                                    arg0[var13] = arg1.substring(var7, var18);
                                    var13++;
                                    if (arg0.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var18;
                                    var8 = -1;
                                    var12 = -1;
                                    var6 = var17;
                                } else {
                                    arg0[var13] = arg1.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (arg0.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var6 -= var9;
                                    var8 = -1;
                                    var12 = -1;
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
            if (var7 < arg1.length()) {
                arg0[var13] = arg1.substring(var7, arg1.length());
                var13++;
            }
            return var13;
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field589[3] + (arg0 == null ? field589[0] : field589[1]) + ',' + (arg1 == null ? field589[0] : field589[1]) + ',' + (arg2 == null ? field589[0] : field589[1]) + ',' + arg3 + ',' + (arg4 == null ? field589[0] : field589[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[Lhk;ILjava/lang/String;)I", line = 611)
    public final int method508(int arg0, class107[] arg1, int arg2, String arg3) {
        try {
            field582++;
            if (arg2 != -6901) {
                method502(-40);
            }
            return this.method507(class117.field1710, arg3, arg1, arg2 ^ 0x1A82, new int[] { arg0 });
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field589[15] + arg0 + ',' + (arg1 == null ? field589[0] : field589[1]) + ',' + arg2 + ',' + (arg3 == null ? field589[0] : field589[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "([B)V", line = 621)
    public class49(byte[] arg0) {
        try {
            class176 var2 = new class176(arg0);
            int var3 = var2.method1645((byte) -96);
            if (var3 != 0) {
                throw new RuntimeException("");
            }
            boolean var4 = var2.method1645((byte) -74) == 1;
            this.field579 = new byte[256];
            var2.method1651(this.field579, 128, 0, 256);
            if (var4) {
                int[] var5 = new int[256];
                int[] var6 = new int[256];
                for (int var7 = 0; var7 < 256; var7++) {
                    var5[var7] = var2.method1645((byte) -80);
                }
                for (int var8 = 0; var8 < 256; var8++) {
                    var6[var8] = var2.method1645((byte) -91);
                }
                byte[][] var9 = new byte[256][];
                for (int var10 = 0; var10 < 256; var10++) {
                    var9[var10] = new byte[var5[var10]];
                    byte var11 = 0;
                    for (int var12 = 0; var12 < var9[var10].length; var12++) {
                        var11 += var2.method1672(-106);
                        var9[var10][var12] = var11;
                    }
                }
                byte[][] var13 = new byte[256][];
                for (int var14 = 0; var14 < 256; var14++) {
                    var13[var14] = new byte[var5[var14]];
                    byte var15 = 0;
                    for (int var16 = 0; var16 < var13[var14].length; var16++) {
                        var15 += var2.method1672(119);
                        var13[var14][var16] = var15;
                    }
                }
                this.field585 = new byte[256][256];
                for (int var17 = 0; var17 < 256; var17++) {
                    if (var17 != 32 && var17 != 160) {
                        for (int var18 = 0; var18 < 256; var18++) {
                            if (var18 != 32 && var18 != 160) {
                                this.field585[var17][var18] = (byte) class165.method1554(false, var5, var9, this.field579, var18, var6, var17, var13);
                            }
                        }
                    }
                }
                this.field584 = var5[32] + var6[32];
            } else {
                this.field584 = var2.method1645((byte) -81);
            }
            var2.method1645((byte) -117);
            var2.method1645((byte) -113);
            this.field581 = var2.method1645((byte) -102);
            this.field583 = var2.method1645((byte) -114);
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field589[17] + (arg0 == null ? field589[0] : field589[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method509(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method510(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
