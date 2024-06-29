import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class183 {

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "[B")
    private byte[] field2382;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[[B")
    private byte[][] field2370;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Ltd;")
    public static class317 field2376 = new class317("RC", 1);

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2379 = -1;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2380 = -1;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2384 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;I[Lo;I)I", line = 3)
    public final int method1056(String arg0, int arg1, class24[] arg2, int arg3) {
        field2374++;
        if (arg1 != 169) {
            field2376 = null;
        }
        return this.method1064((byte) 57, arg2, new int[] { arg3 }, class397.field5787, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[Lo;ILjava/lang/String;)Ljava/lang/String;", line = 18)
    public final String method1057(int arg0, class24[] arg1, int arg2, String arg3) {
        field2372++;
        if (arg0 >= this.method1058(-1, arg3, arg1)) {
            return arg3;
        }
        int var5 = 102 / ((65 - arg2) / 55);
        int var6 = arg0 - this.method1058(-1, "...", null);
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        int var10 = arg3.length();
        String var11 = "";
        for (int var12 = 0; var12 < var10; var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 == '<') {
                var7 = var12;
            } else {
                if (var13 == '>' && var7 != -1) {
                    String var14 = arg3.substring(var7 + 1, var12);
                    var7 = -1;
                    if (var14.equals("lt")) {
                        var13 = '<';
                    } else if (var14.equals("gt")) {
                        var13 = '>';
                    } else if (var14.equals("nbsp")) {
                        var13 = ' ';
                    } else if (var14.equals("shy")) {
                        var13 = '\u00AD';
                    } else if (var14.equals("times")) {
                        var13 = '×';
                    } else if (var14.equals("euro")) {
                        var13 = '€';
                    } else if (var14.equals("copy")) {
                        var13 = '©';
                    } else {
                        if (!var14.equals("reg")) {
                            if (var14.startsWith("img=") && arg1 != null) {
                                try {
                                    int var15 = class304.method1819((byte) -98, var14.substring(4));
                                    var9 += arg1[var15].method155();
                                    var8 = -1;
                                    if (var9 > var6) {
                                        return var11 + "...";
                                    }
                                    var11 = arg3.substring(0, var12 + 1);
                                } catch (Exception var17) {
                                }
                            }
                            continue;
                        }
                        var13 = '®';
                    }
                }
                if (var7 == -1) {
                    var9 += this.field2382[class291.method1754(var13, 24391) & 0xFF] & 0xFF;
                    if (this.field2370 != null && var8 != -1) {
                        var9 += this.field2370[var8][var13];
                    }
                    var8 = var13;
                    int var16 = var9;
                    if (this.field2370 != null) {
                        var16 = this.field2370[var13][46] + var9;
                    }
                    if (var6 < var16) {
                        return var11 + "...";
                    }
                    var11 = arg3.substring(0, var12 + 1);
                }
            }
        }
        return arg3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;[Lo;)I", line = 137)
    public final int method1058(int arg0, String arg1, class24[] arg2) {
        field2383++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = arg0;
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class304.method1819((byte) -127, var10.substring(4));
                                    var6 += arg2[var11].method155();
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
                    var6 += this.field2382[class291.method1754(var9, arg0 + 24392) & 0xFF] & 0xFF;
                    if (this.field2370 != null && var5 != -1) {
                        var6 += this.field2370[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;[Lo;II)I", line = 238)
    public final int method1059(int arg0, String arg1, class24[] arg2, int arg3, int arg4) {
        field2378++;
        int var6 = 94 / ((-arg3 - 24) / 39);
        if (arg4 == 0) {
            arg4 = this.field2373;
        }
        int var7 = this.method1064((byte) -116, arg2, new int[] { arg0 }, class397.field5787, arg1);
        int var8 = (var7 - 1) * arg4;
        return this.field2369 + var8 + this.field2366;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 261)
    public static void method1060(byte arg0) {
        int var1 = 67 % ((-arg0 - 8) / 60);
        field2384 = null;
        field2376 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 272)
    public static final void method1061(int arg0) {
        if (arg0 != 21573) {
            field2376 = null;
        }
        if (class99.field1354 >= 0) {
            long var1 = class45.method252((byte) -8);
            class99.field1354 = (int) ((long) class99.field1354 - (var1 - class62.field712));
            if (class99.field1354 > 0) {
                int var3 = (class99.field1354 << 8) / class260.field3495;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class514.field7476 = ((class457.field6823 & 0xFF00) * var3 + ((class4.field18.field74 & 0xFF00) * var4) & 0xFF0000) + ((class457.field6823 & 0xFF00FF) * var3 + (class4.field18.field74 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class303.field4033 = class511.field7434 * var3 + class4.field18.field58 * var4 >> 8;
                class53.field619 = (class4.field18.field79 - class116.field1520) * var6 + class116.field1520;
                class189.field2447 = (class4.field18.field63 - class338.field4481) * var6 + class338.field4481;
                class148.field1944 = (class4.field18.field69 - class130.field1687) * var6 + class130.field1687;
                class287.field3770 = ((class169.field2195 & 0xFF00) * var3 + (class4.field18.field62 & 0xFF00) * var4 & 0xFF0000) + ((class169.field2195 & 0xFF00FF) * var3 + (class4.field18.field62 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class490.field7190 = (class4.field18.field59 - class408.field5854) * var6 + class408.field5854;
                class114.field1493 = (class4.field18.field67 - class422.field6151) * var6 + class422.field6151;
                class181.field2358 = (class4.field18.field78 - class532.field7835) * var6 + class532.field7835;
                if (class60.field699 != class4.field18.field65) {
                    class253.field3372 = class275.field3667.method1162(class60.field699, class4.field18.field65, var6, class253.field3372);
                }
            } else {
                class181.field2358 = class4.field18.field78;
                class303.field4033 = class4.field18.field58;
                class148.field1944 = class4.field18.field69;
                class490.field7190 = class4.field18.field59;
                class114.field1493 = class4.field18.field67;
                class53.field619 = class4.field18.field79;
                class253.field3372 = class4.field18.field65;
                class189.field2447 = class4.field18.field63;
                class99.field1354 = -1;
                class287.field3770 = class4.field18.field62;
                class514.field7476 = class4.field18.field74;
            }
            class62.field712 = var1;
        }
        field2368++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(CIB)I", line = 331)
    public final int method1062(char arg0, int arg1, byte arg2) {
        int var4 = 64 % ((-arg2 - 23) / 45);
        field2367++;
        return this.field2370 == null ? 0 : this.field2370[arg1][arg0];
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 345)
    public static final void method1063(int arg0) {
        field2377++;
        if (class527.field7734 == 8) {
            class57.method345(arg0 - 65279, 4);
        } else if (class527.field7734 == 4 || class527.field7734 == 5) {
            class57.method345(1, 2);
        } else if (class527.field7734 == 11) {
            class57.method345(1, 2);
        }
        if (arg0 != 65280) {
            method1063(-127);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[Lo;[I[Ljava/lang/String;Ljava/lang/String;)I", line = 374)
    public final int method1064(byte arg0, class24[] arg1, int[] arg2, String[] arg3, String arg4) {
        field2371++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = 12 % ((-arg0 - 60) / 49);
        int var13 = -1;
        int var14 = 0;
        int var15 = arg4.length();
        for (int var16 = 0; var16 < var15; var16++) {
            int var17 = class291.method1754(arg4.charAt(var16), 24391) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var11 = var16;
            } else {
                int var19;
                if (var11 == -1) {
                    var19 = var16;
                    var18 += this.method1067(var17, 255);
                    if (this.field2370 != null && var13 != -1) {
                        var18 += this.field2370[var13][var17];
                    }
                    var13 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var11;
                    String var20 = arg4.substring(var11 + 1, var16);
                    var11 = -1;
                    if (var20.equals("br")) {
                        arg3[var14] = arg4.substring(var7, var16 + 1);
                        var14++;
                        if (arg3.length <= var14) {
                            return 0;
                        }
                        var13 = -1;
                        var6 = 0;
                        var8 = -1;
                        var7 = var16 + 1;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method1067(60, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][60];
                        }
                        var13 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method1067(62, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][62];
                        }
                        var13 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method1067(160, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][160];
                        }
                        var13 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method1067(173, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][173];
                        }
                        var13 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method1067(215, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][215];
                        }
                        var13 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method1067(8364, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][8364];
                        }
                        var13 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method1067(169, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][169];
                        }
                        var13 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method1067(174, 255);
                        if (this.field2370 != null && var13 != -1) {
                            var18 += this.field2370[var13][174];
                        }
                        var13 = 174;
                    } else if (var20.startsWith("img=") && arg1 != null) {
                        try {
                            int var21 = class304.method1819((byte) -87, var20.substring(4));
                            var13 = -1;
                            var18 += arg1[var21].method155();
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg2 != null) {
                        if (var17 == 32) {
                            var10 = 1;
                            var8 = var16;
                            var9 = var6;
                        }
                        if (var6 > arg2[arg2.length > var14 ? var14 : arg2.length - 1]) {
                            if (var8 < 0) {
                                arg3[var14] = arg4.substring(var7, var19);
                                var14++;
                                if (arg3.length <= var14) {
                                    return 0;
                                }
                                var7 = var19;
                                var13 = -1;
                                var8 = -1;
                                var6 = var18;
                            } else {
                                arg3[var14] = arg4.substring(var7, var8 + 1 - var10);
                                var14++;
                                if (arg3.length <= var14) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var13 = -1;
                                var8 = -1;
                                var6 -= var9;
                            }
                        }
                        if (var17 == 45) {
                            var10 = 0;
                            var8 = var16;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (arg4.length() > var7) {
            arg3[var14] = arg4.substring(var7, arg4.length());
            var14++;
        }
        return var14;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lgp;I)I", line = 625)
    public static final int method1065(class36 arg0, int arg1) {
        field2375++;
        String var2 = class496.method2988((byte) 124, arg0);
        int[] var3 = null;
        int var4 = 23 / ((arg1 - 35) / 51);
        if (class75.method436(arg0.field361, 85)) {
            var3 = class237.field3158.method236(-18315, (int) arg0.field367).field2636;
        } else if (arg0.field364 != -1) {
            var3 = class237.field3158.method236(-18315, arg0.field364).field2636;
        } else if (class497.method2990(arg0.field361, -61)) {
            class22 var7 = class339.field4484[(int) arg0.field367];
            if (var7 != null) {
                class212 var8 = var7.field220;
                if (var8.field2903 != null) {
                    var8 = var8.method1350(class52.field606, -1);
                }
                if (var8 != null) {
                    var3 = var8.field2912;
                }
            }
        } else if (class195.method1115(-14, arg0.field361)) {
            Object var5 = null;
            class70 var6;
            if (arg0.field361 == 1002) {
                var6 = class123.field1593.method2920((int) arg0.field367, 19219);
            } else {
                var6 = class123.field1593.method2920((int) (arg0.field367 >>> 32 & 0x7FFFFFFFL), 19219);
            }
            if (var6.field848 != null) {
                var6 = var6.method403(-1, class52.field606);
            }
            if (var6 != null) {
                var3 = var6.field879;
            }
        }
        if (var3 != null) {
            var2 = var2 + class91.method507((byte) 27, var3);
        }
        int var9 = class121.field1570.method1058(-1, var2, class512.field7462);
        if (arg0.field363) {
            var9 += class483.field7124.method150() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)I", line = 694)
    public final int method1066(int arg0, String arg1) {
        int var3 = -41 / ((-arg0 - 30) / 57);
        field2365++;
        return this.method1058(-1, arg1, null);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I", line = 704)
    public final int method1067(int arg0, int arg1) {
        if (arg1 != 255) {
            field2376 = null;
        }
        field2381++;
        return this.field2382[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;BI[Lo;)I", line = 729)
    public final int method1068(String arg0, byte arg1, int arg2, class24[] arg3) {
        field2364++;
        int var5 = this.method1064((byte) -117, arg3, new int[] { arg2 }, class397.field5787, arg0);
        int var6 = 0;
        if (arg1 != -46) {
            method1060((byte) -56);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1058(-1, class397.field5787[var7], arg3);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B)V", line = 761)
    public class183(byte[] arg0) {
        class396 var2 = new class396(arg0);
        int var3 = var2.method2388((byte) -114);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2388((byte) -117) == 1;
        this.field2382 = new byte[256];
        var2.method2395((byte) -70, this.field2382, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2388((byte) -113);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2388((byte) -116);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2418(-51);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2418(102);
                    var11[var12][var16] = var15;
                }
            }
            this.field2370 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2370[var13][var14] = (byte) class415.method2538(255, var13, var9, var14, var5, var6, var11, this.field2382);
                        }
                    }
                }
            }
            this.field2373 = var5[32] + var6[32];
        } else {
            this.field2373 = var2.method2388((byte) -113);
        }
        var2.method2388((byte) -126);
        var2.method2388((byte) -118);
        this.field2366 = var2.method2388((byte) -122);
        this.field2369 = var2.method2388((byte) -124);
    }
}
