import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class66 {

    @OriginalMember(owner = "client!hia", name = "s", descriptor = "[B")
    private byte[] field953;

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "[[B")
    private byte[][] field942;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
    public static int field943 = 100;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "Ltaa;")
    public static class409 field941;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZI[Lpga;Ljava/lang/String;)Ljava/lang/String;", line = 3)
    public final String method581(boolean arg0, int arg1, class536[] arg2, String arg3) {
        field952++;
        if (arg1 >= this.method589(arg3, 169, arg2)) {
            return arg3;
        }
        int var5 = arg1 - this.method589("...", 169, null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg3.length();
        String var10 = "";
        if (!arg0) {
            this.method587(-65, null);
        }
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg3.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg3.substring(var6 + 1, var11);
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
                            if (var13.startsWith("img=") && arg2 != null) {
                                try {
                                    int var14 = class763.method4236((byte) 37, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg2[var14].method1504();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg3.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field953[class631.method3639(var12, (byte) -31) & 0xFF] & 0xFF;
                    if (this.field942 != null && var7 != -1) {
                        var8 += this.field942[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field942 != null) {
                        var15 = this.field942[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg3.substring(0, var11 + 1);
                }
            }
        }
        return arg3;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V", line = 125)
    public static void method582(int arg0) {
        if (arg0 <= 63) {
            method582(-88);
        }
        field941 = null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Lpga;ILjava/lang/String;)I", line = 136)
    public final int method583(int arg0, class536[] arg1, int arg2, String arg3) {
        field949++;
        int var5 = this.method584(class189.field2866, new int[] { arg0 }, arg3, (byte) 99, arg1);
        int var6 = 0;
        for (int var7 = arg2; var7 < var5; var7++) {
            int var8 = this.method589(class189.field2866[var7], 169, arg1);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "([Ljava/lang/String;[ILjava/lang/String;B[Lpga;)I", line = 163)
    public final int method584(String[] arg0, int[] arg1, String arg2, byte arg3, class536[] arg4) {
        field935++;
        if (arg2 == null) {
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
        int var14 = arg2.length();
        if (arg3 < 55) {
            return -17;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class631.method3639(arg2.charAt(var15), (byte) -31) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method588(var16, 255);
                    var18 = var15;
                    if (this.field942 != null && var12 != -1) {
                        var17 += this.field942[var12][var16];
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
                        arg0[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (arg0.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method588(60, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method588(62, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method588(160, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method588(173, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method588(215, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method588(8364, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method588(169, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method588(174, 255);
                        if (this.field942 != null && var12 != -1) {
                            var17 += this.field942[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class763.method4236((byte) 37, var19.substring(4));
                            var12 = -1;
                            var17 += arg4[var20].method1504();
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
                        if (arg1[var13 >= arg1.length ? arg1.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg0[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg0[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
                            }
                        }
                        if (var16 == 45) {
                            var8 = var15;
                            var10 = 0;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (var7 < arg2.length()) {
            arg0[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IB)Z", line = 415)
    public static final boolean method585(int arg0, byte arg1) {
        int var2 = 46 % ((arg1 - 68) / 54);
        field948++;
        return arg0 == 44 || arg0 == 16 || arg0 == 1003 || arg0 == 47 || arg0 == 15;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BIC)I", line = 430)
    public final int method586(byte arg0, int arg1, char arg2) {
        field947++;
        if (arg0 != 36) {
            this.field953 = null;
        }
        return this.field942 == null ? 0 : this.field942[arg1][arg2];
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILjava/lang/String;)I", line = 454)
    public final int method587(int arg0, String arg1) {
        int var3 = 39 % ((29 - arg0) / 54);
        field944++;
        return this.method589(arg1, 169, null);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)I", line = 467)
    public final int method588(int arg0, int arg1) {
        field946++;
        if (arg1 != 255) {
            this.method590(-41, null, null, -99, -120);
        }
        return this.field953[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;I[Lpga;)I", line = 479)
    public final int method589(String arg0, int arg1, class536[] arg2) {
        field939++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class763.method4236((byte) 37, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg2[var11].method1504();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field953[class631.method3639(var9, (byte) -31) & 0xFF] & 0xFF;
                    if (this.field942 != null && var5 != -1) {
                        var6 += this.field942[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg1 != 169) {
            this.field945 = -9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Lpga;Ljava/lang/String;II)I", line = 583)
    public final int method590(int arg0, class536[] arg1, String arg2, int arg3, int arg4) {
        if (arg0 <= 26) {
            return -33;
        }
        if (arg4 == 0) {
            arg4 = this.field945;
        }
        field950++;
        int var6 = this.method584(class189.field2866, new int[] { arg3 }, arg2, (byte) 127, arg1);
        int var7 = (var6 - 1) * arg4;
        return this.field940 + var7 + this.field938;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILrg;)Lhba;", line = 602)
    public static final class10 method591(int arg0, class645 arg1) {
        if (arg0 == 0) {
            field951++;
            int var2 = arg1.method3712((byte) -127);
            return new class10(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IB[Lpga;Ljava/lang/String;)I", line = 620)
    public final int method592(int arg0, byte arg1, class536[] arg2, String arg3) {
        field936++;
        int var5 = 70 / ((arg1 - 74) / 42);
        return this.method584(class189.field2866, new int[] { arg0 }, arg3, (byte) 74, arg2);
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "([B)V", line = 633)
    public class66(byte[] arg0) {
        class645 var2 = new class645(arg0);
        int var3 = var2.method3745(-6314);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3745(-6314) == 1;
        this.field953 = new byte[256];
        var2.method3736(-125, this.field953, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method3745(-6314);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method3745(-6314);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3743(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3743(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field942 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field942[var13][var14] = (byte) class60.method465(var13, (byte) -121, var5, var9, this.field953, var14, var11, var6);
                        }
                    }
                }
            }
            this.field945 = var5[32] + var6[32];
        } else {
            this.field945 = var2.method3745(-6314);
        }
        var2.method3745(-6314);
        var2.method3745(-6314);
        this.field940 = var2.method3745(-6314);
        this.field938 = var2.method3745(-6314);
    }
}
