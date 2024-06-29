import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class389 {

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[B")
    private byte[] field5412;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[[B")
    private byte[][] field5408;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public int field5419;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field5416 = 0;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field5422 = -1;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lhc;")
    public static class368 field5417 = new class368("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Leq;")
    public static class141 field5404;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lea;")
    public static class58 field5413;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[[Leq;")
    public static class141[][] field5423;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2419(String arg0, byte arg1) {
        if (arg1 >= -88) {
            return 127;
        } else {
            field5414++;
            return this.method2420((class77[]) null, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Lwn;ILjava/lang/String;)I")
    public final int method2420(class77[] arg0, int arg1, String arg2) {
        field5418++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = arg1;
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class388.method2418(arg1 + 97, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg0[var11].method632();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5412[class311.method1888((byte) 70, var9) & 0xFF] & 0xFF;
                    if (this.field5408 != null && var5 != -1) {
                        var6 += this.field5408[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;[Lwn;BI)I")
    public final int method2421(String arg0, class77[] arg1, byte arg2, int arg3) {
        field5405++;
        int var5 = this.method2423(arg1, class397.field5502, (byte) 120, arg0, new int[] { arg3 });
        int var6 = 0;
        int var7 = -95 / ((58 - arg2) / 55);
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2420(arg1, -1, class397.field5502[var8]);
            if (var9 > var6) {
                var6 = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[Lwn;Ljava/lang/String;I)I")
    public final int method2422(int arg0, class77[] arg1, String arg2, int arg3) {
        if (arg3 == 173) {
            field5411++;
            return this.method2423(arg1, class397.field5502, (byte) 120, arg2, new int[] { arg0 });
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Lwn;[Ljava/lang/String;BLjava/lang/String;[I)I")
    public final int method2423(class77[] arg0, String[] arg1, byte arg2, String arg3, int[] arg4) {
        field5420++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg2 != 120) {
            method2426((byte) 97);
        }
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class311.method1888((byte) 70, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2428(var16, (byte) 84);
                    if (this.field5408 != null && var12 != -1) {
                        var17 += this.field5408[var12][var16];
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
                        arg1[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var12 = -1;
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2428(60, (byte) 81);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2428(62, (byte) 48);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2428(160, (byte) 74);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2428(173, (byte) 65);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2428(215, (byte) 91);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2428(8364, (byte) 94);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2428(169, (byte) 115);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2428(174, (byte) 77);
                        if (this.field5408 != null && var12 != -1) {
                            var17 += this.field5408[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class388.method2418(107, var19.substring(4));
                            var12 = -1;
                            var17 += arg0[var20].method632();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (arg4[arg4.length > var13 ? var13 : arg4.length - 1] < var6) {
                            if (var8 < 0) {
                                arg1[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                            } else {
                                arg1[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            }
                        }
                        if (var16 == 45) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (var7 < arg3.length()) {
            arg1[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[Lwn;Ljava/lang/String;IB)I")
    public final int method2424(int arg0, class77[] arg1, String arg2, int arg3, byte arg4) {
        field5424++;
        if (arg4 >= -89) {
            return 119;
        }
        if (arg0 == 0) {
            arg0 = this.field5407;
        }
        int var6 = this.method2423(arg1, class397.field5502, (byte) 120, arg2, new int[] { arg3 });
        int var7 = (var6 - 1) * arg0;
        return this.field5406 + this.field5419 + var7;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(CI)Z")
    public static final boolean method2425(char arg0, int arg1) {
        if (arg1 == 0) {
            field5409++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method2426(byte arg0) {
        if (arg0 <= 2) {
            field5423 = null;
        }
        field5404 = null;
        field5423 = null;
        field5413 = null;
        field5417 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
    public class389(byte[] arg0) {
        class366 var2 = new class366(arg0);
        int var3 = var2.method2306((byte) 115);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2306((byte) 51) == 1;
        this.field5412 = new byte[256];
        var2.method2249(0, (byte) -126, 256, this.field5412);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2306((byte) 85);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2306((byte) 111);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2289((byte) -77);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2289((byte) -77);
                    var11[var12][var16] = var15;
                }
            }
            this.field5408 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5408[var13][var14] = (byte) class196.method1361(var9, var13, this.field5412, var14, var6, var11, 2, var5);
                        }
                    }
                }
            }
            this.field5407 = var6[32] + var5[32];
        } else {
            this.field5407 = var2.method2306((byte) 62);
        }
        var2.method2306((byte) 32);
        var2.method2306((byte) 112);
        this.field5406 = var2.method2306((byte) 24);
        this.field5419 = var2.method2306((byte) 125);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ICI)I")
    public final int method2427(int arg0, char arg1, int arg2) {
        field5421++;
        if (arg0 == 0) {
            return this.field5408 == null ? 0 : this.field5408[arg2][arg1];
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)I")
    public final int method2428(int arg0, byte arg1) {
        field5415++;
        return arg1 < 31 ? 19 : this.field5412[arg0] & 0xFF;
    }

    static {
        new class368("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }
}
