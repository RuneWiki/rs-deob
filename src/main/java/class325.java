import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class325 {

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[B")
    private byte[] field5110;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[[B")
    private byte[][] field5109;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field5107;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5095 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[I")
    public static int[] field5100;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Lgl;Ljava/lang/String;BI)I", line = 4)
    public final int method2153(int arg0, class356[] arg1, String arg2, byte arg3, int arg4) {
        if (arg0 == 0) {
            arg0 = this.field5102;
        }
        field5103++;
        if (arg3 < 110) {
            this.method2156((class356[]) null, -128, (String) null);
        }
        int var6 = this.method2160(new int[] { arg4 }, class120.field1642, arg2, (byte) -18, arg1);
        int var7 = (var6 - 1) * arg0;
        return this.field5107 + var7 + this.field5108;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I", line = 27)
    public final int method2154(int arg0, int arg1) {
        field5104++;
        if (arg1 != 255) {
            field5095 = null;
        }
        return this.field5110[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B[Lgl;ILjava/lang/String;)I", line = 38)
    public final int method2155(byte arg0, class356[] arg1, int arg2, String arg3) {
        field5096++;
        int var5 = this.method2160(new int[] { arg2 }, class120.field1642, arg3, (byte) -18, arg1);
        int var6 = 64 / ((arg0 - 74) / 43);
        int var7 = 0;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2156(arg1, -63, class120.field1642[var8]);
            if (var9 > var7) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([Lgl;ILjava/lang/String;)I", line = 66)
    public final int method2156(class356[] arg0, int arg1, String arg2) {
        field5097++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg1 != -63) {
            this.field5109 = null;
        }
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
                                    int var11 = class162.method1128(var10.substring(4), 102);
                                    var5 = -1;
                                    var6 += arg0[var11].method2318();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5110[class220.method1571(var9, (byte) -100) & 0xFF] & 0xFF;
                    if (this.field5109 != null && var5 != -1) {
                        var6 += this.field5109[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Lbg;", line = 173)
    public static final class270 method2157(int arg0, int arg1) {
        field5101++;
        class270 var2 = (class270) class160.field2528.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4666.method2771(30, arg1, 3);
        class270 var4 = new class270();
        if (arg0 != 8530) {
            method2158(75);
        }
        if (var3 != null) {
            var4.method1831(new class186(var3), arg1, (byte) -116);
        }
        class160.field2528.method341(109, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 198)
    public static void method2158(int arg0) {
        if (arg0 < 122) {
            field5095 = null;
        }
        field5095 = null;
        field5100 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Lgl;ILjava/lang/String;)I", line = 214)
    public final int method2159(int arg0, class356[] arg1, int arg2, String arg3) {
        field5111++;
        if (arg2 != 3423) {
            this.field5109 = null;
        }
        return this.method2160(new int[] { arg0 }, class120.field1642, arg3, (byte) -18, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([I[Ljava/lang/String;Ljava/lang/String;B[Lgl;)I", line = 227)
    public final int method2160(int[] arg0, String[] arg1, String arg2, byte arg3, class356[] arg4) {
        field5098++;
        if (arg2 == null) {
            return 0;
        }
        if (arg3 != -18) {
            field5095 = null;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class220.method1571(arg2.charAt(var15), (byte) -100) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2154(var16, 255);
                    var18 = var15;
                    if (this.field5109 != null && var12 != -1) {
                        var17 += this.field5109[var12][var16];
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
                        if (var13 >= arg1.length) {
                            return 0;
                        }
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2154(60, 255);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2154(62, 255);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2154(160, 255);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2154(173, 255);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2154(215, 255);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2154(8364, arg3 + 273);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2154(169, arg3 ^ 0xFFFFFF11);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2154(174, 255);
                        if (this.field5109 != null && var12 != -1) {
                            var17 += this.field5109[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class162.method1128(var19.substring(4), 117);
                            var17 += arg4[var20].method2318();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (arg0[arg0.length > var13 ? var13 : arg0.length - 1] < var6) {
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
                                var6 = var17;
                                var7 = var18;
                                var8 = -1;
                                var12 = -1;
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
        if (arg2.length() > var7) {
            arg1[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ICI)I", line = 479)
    public final int method2161(int arg0, char arg1, int arg2) {
        if (arg2 != 0) {
            this.method2155((byte) -88, (class356[]) null, 40, (String) null);
        }
        field5099++;
        return this.field5109 == null ? 0 : this.field5109[arg0][arg1];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 507)
    public final int method2162(String arg0, int arg1) {
        field5105++;
        int var3 = 85 % ((arg1 - 11) / 60);
        return this.method2156((class356[]) null, -63, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([B)V", line = 518)
    public class325(byte[] arg0) {
        class186 var2 = new class186(arg0);
        int var3 = var2.method1322(false);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1322(false) == 1;
        this.field5110 = new byte[256];
        var2.method1292(0, this.field5110, 1847860680, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1322(false);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1322(false);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1327((byte) -99);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1327((byte) -115);
                    var11[var12][var16] = var15;
                }
            }
            this.field5109 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5109[var13][var14] = (byte) class89.method538(this.field5110, var13, (byte) -35, var14, var9, var7, var5, var11);
                        }
                    }
                }
            }
            this.field5102 = var5[32] + var7[32];
        } else {
            this.field5102 = var2.method1322(false);
        }
        var2.method1322(false);
        var2.method1322(false);
        this.field5107 = var2.method1322(false);
        this.field5108 = var2.method1322(false);
    }
}
