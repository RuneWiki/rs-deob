import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class578 {

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "[B")
    private byte[] field8585;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "[[B")
    private byte[][] field8573;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public int field8584;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public int field8574;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public int field8571;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8587 = new String[] { method4327(method4326(";MbU]")), method4327(method4326("9I {")), method4327(method4326("$T5")), method4327(method4326("4S<n")), method4327(method4326(">Q+*")), method4327(method4326(";MbV]")), method4327(method4326("9^?g")), method4327(method4326("2I>x")), method4327(method4326("#U!r\u0006")), method4327(method4326(";H")), method4327(method4326("%Y+")), method4327(method4326(",\u0012b9\b")), method4327(method4326("0H")), method4327(method4326(";Mb_]")), method4327(method4326(";Mb[]")), method4327(method4326(";Mb]]")), method4327(method4326(";MbS]")), method4327(method4326(";MbT]")), method4327(method4326("y\u0012b")), method4327(method4326(";Mb\\]")), method4327(method4326(";Mb^]")), method4327(method4326("5N")), method4327(method4326(";MbR]")), method4327(method4326(";Mb+\u001c9U8)]")), method4327(method4326("\u0012s\n")), method4327(method4326(";MbP]")), method4327(method4326(";MbQ]")) };

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 4)
    public static final void method4314(int arg0) {
        try {
            field8578++;
            class236 var1 = null;
            try {
                class42 var2 = class580.field8601.method213((byte) 118, true, "2");
                if (arg0 >= -60) {
                    return;
                }
                while (var2.field503 == 0) {
                    class151.method1269(false, 1L);
                }
                if (var2.field503 == 1) {
                    var1 = (class236) var2.field499;
                    byte[] var3 = new byte[(int) var1.method2014((byte) 93)];
                    int var5;
                    for (int var4 = 0; var4 < var3.length; var4 += var5) {
                        var5 = var1.method2013(var3.length - var4, var3, true, var4);
                        if (var5 == -1) {
                            throw new IOException(field8587[24]);
                        }
                    }
                    class779.method5636(new class163(var3), 46);
                }
            } catch (Exception var8) {
            }
            try {
                if (var1 != null) {
                    var1.method2011(-2968);
                }
            } catch (Exception var7) {
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8587[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[Lfs;BLjava/lang/String;)I", line = 54)
    public final int method4315(int arg0, class581[] arg1, byte arg2, String arg3) {
        try {
            int var5 = -36 % ((arg2 - 51) / 63);
            field8580++;
            return this.method4321(arg3, arg1, (byte) -18, class591.field8685, new int[] { arg0 });
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8587[14] + arg0 + ',' + (arg1 == null ? field8587[1] : field8587[11]) + ',' + arg2 + ',' + (arg3 == null ? field8587[1] : field8587[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;[Lfs;B)I", line = 66)
    public final int method4316(String arg0, class581[] arg1, byte arg2) {
        try {
            field8568++;
            if (arg0 == null) {
                return 0;
            }
            if (arg2 > -41) {
                this.method4315(-110, null, (byte) 41, null);
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
                        if (var10.equals(field8587[9])) {
                            var9 = '<';
                        } else if (var10.equals(field8587[12])) {
                            var9 = '>';
                        } else if (var10.equals(field8587[6])) {
                            var9 = ' ';
                        } else if (var10.equals(field8587[2])) {
                            var9 = '\u00AD';
                        } else if (var10.equals(field8587[8])) {
                            var9 = '×';
                        } else if (var10.equals(field8587[7])) {
                            var9 = '€';
                        } else if (var10.equals(field8587[3])) {
                            var9 = '©';
                        } else {
                            if (!var10.equals(field8587[10])) {
                                if (var10.startsWith(field8587[4]) && arg1 != null) {
                                    try {
                                        int var11 = class244.method2078(-7431, var10.substring(4));
                                        var6 += arg1[var11].method988();
                                        var5 = -1;
                                    } catch (Exception var13) {
                                    }
                                }
                                continue;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field8585[class513.method3867(7635, var9) & 0xFF] & 0xFF;
                        if (this.field8573 != null && var5 != -1) {
                            var6 += this.field8573[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field8587[5] + (arg0 == null ? field8587[1] : field8587[11]) + ',' + (arg1 == null ? field8587[1] : field8587[11]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([Lfs;IZILjava/lang/String;)I", line = 176)
    public final int method4317(class581[] arg0, int arg1, boolean arg2, int arg3, String arg4) {
        try {
            if (arg3 == 0) {
                arg3 = this.field8584;
            }
            if (arg2) {
                this.field8574 = -66;
            }
            field8579++;
            int var6 = this.method4321(arg4, arg0, (byte) -18, class591.field8685, new int[] { arg1 });
            int var7 = (var6 - 1) * arg3;
            return this.field8574 + this.field8571 + var7;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8587[20] + (arg0 == null ? field8587[1] : field8587[11]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field8587[1] : field8587[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)Z", line = 195)
    public static final boolean method4318(int arg0, int arg1, int arg2) {
        try {
            field8575++;
            if (arg0 < 40) {
                method4314(-109);
            }
            return (arg2 & 0x22) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8587[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(CII)I", line = 216)
    public final int method4319(char arg0, int arg1, int arg2) {
        try {
            if (arg2 != 0) {
                this.field8574 = 105;
            }
            field8569++;
            return this.field8573 == null ? 0 : this.field8573[arg1][arg0];
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8587[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)I", line = 234)
    public final int method4320(int arg0, byte arg1) {
        try {
            field8577++;
            return arg1 == -2 ? this.field8585[arg0] & 0xFF : 61;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8587[26] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;[Lfs;B[Ljava/lang/String;[I)I", line = 247)
    public final int method4321(String arg0, class581[] arg1, byte arg2, String[] arg3, int[] arg4) {
        try {
            field8581++;
            if (arg0 == null) {
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
            int var14 = arg0.length();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = class513.method3867(7635, arg0.charAt(var15)) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var18 = var15;
                        var17 += this.method4320(var16, (byte) -2);
                        if (this.field8573 != null && var12 != -1) {
                            var17 += this.field8573[var12][var16];
                        }
                        var12 = var16;
                    } else {
                        if (var16 != 62) {
                            continue;
                        }
                        var18 = var11;
                        String var19 = arg0.substring(var11 + 1, var15);
                        var11 = -1;
                        if (var19.equals(field8587[21])) {
                            arg3[var13] = arg0.substring(var7, var15 + 1);
                            var13++;
                            if (arg3.length <= var13) {
                                return 0;
                            }
                            var6 = 0;
                            var12 = -1;
                            var7 = var15 + 1;
                            var8 = -1;
                            continue;
                        }
                        if (var19.equals(field8587[9])) {
                            var17 += this.method4320(60, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals(field8587[12])) {
                            var17 += this.method4320(62, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals(field8587[6])) {
                            var17 += this.method4320(160, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals(field8587[2])) {
                            var17 += this.method4320(173, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals(field8587[8])) {
                            var17 += this.method4320(215, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals(field8587[7])) {
                            var17 += this.method4320(8364, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals(field8587[3])) {
                            var17 += this.method4320(169, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals(field8587[10])) {
                            var17 += this.method4320(174, (byte) -2);
                            if (this.field8573 != null && var12 != -1) {
                                var17 += this.field8573[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith(field8587[4]) && arg1 != null) {
                            try {
                                int var20 = class244.method2078(-7431, var19.substring(4));
                                var17 += arg1[var20].method988();
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
                            if (var6 > arg4[var13 >= arg4.length ? arg4.length - 1 : var13]) {
                                if (var8 >= 0) {
                                    arg3[var13] = arg0.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (arg3.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var8 = -1;
                                    var6 -= var9;
                                    var12 = -1;
                                } else {
                                    arg3[var13] = arg0.substring(var7, var18);
                                    var13++;
                                    if (arg3.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var18;
                                    var8 = -1;
                                    var12 = -1;
                                    var6 = var17;
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
            if (var7 < arg0.length()) {
                arg3[var13] = arg0.substring(var7, arg0.length());
                var13++;
            }
            if (arg2 != -18) {
                this.field8571 = -82;
            }
            return var13;
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field8587[22] + (arg0 == null ? field8587[1] : field8587[11]) + ',' + (arg1 == null ? field8587[1] : field8587[11]) + ',' + arg2 + ',' + (arg3 == null ? field8587[1] : field8587[11]) + ',' + (arg4 == null ? field8587[1] : field8587[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILjava/lang/String;)I", line = 495)
    public final int method4322(int arg0, String arg1) {
        try {
            field8583++;
            if (arg0 != 256) {
                this.method4322(-72, null);
            }
            return this.method4316(arg1, null, (byte) -67);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8587[15] + arg0 + ',' + (arg1 == null ? field8587[1] : field8587[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)J", line = 506)
    public static final long method4323(int arg0, int arg1) {
        try {
            if (arg1 != 29630) {
                field8582 = 7;
            }
            field8570++;
            return (long) (arg0 + 11745) * 86400000L;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8587[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([Lfs;Ljava/lang/String;IB)Ljava/lang/String;", line = 518)
    public final String method4324(class581[] arg0, String arg1, int arg2, byte arg3) {
        try {
            field8586++;
            if (arg2 >= this.method4316(arg1, arg0, (byte) -53)) {
                return arg1;
            }
            int var18 = arg2 - this.method4316(field8587[18], null, (byte) -60);
            int var5 = -1;
            if (arg3 != 123) {
                return null;
            }
            int var6 = -1;
            int var7 = 0;
            int var8 = arg1.length();
            String var9 = "";
            for (int var10 = 0; var10 < var8; var10++) {
                char var11 = arg1.charAt(var10);
                if (var11 == '<') {
                    var5 = var10;
                } else {
                    if (var11 == '>' && var5 != -1) {
                        String var12 = arg1.substring(var5 + 1, var10);
                        var5 = -1;
                        if (var12.equals(field8587[9])) {
                            var11 = '<';
                        } else if (var12.equals(field8587[12])) {
                            var11 = '>';
                        } else if (var12.equals(field8587[6])) {
                            var11 = ' ';
                        } else if (var12.equals(field8587[2])) {
                            var11 = '\u00AD';
                        } else if (var12.equals(field8587[8])) {
                            var11 = '×';
                        } else if (var12.equals(field8587[7])) {
                            var11 = '€';
                        } else if (var12.equals(field8587[3])) {
                            var11 = '©';
                        } else {
                            if (!var12.equals(field8587[10])) {
                                if (var12.startsWith(field8587[4]) && arg0 != null) {
                                    try {
                                        int var13 = class244.method2078(-7431, var12.substring(4));
                                        var6 = -1;
                                        var7 += arg0[var13].method988();
                                        if (var7 > var18) {
                                            return var9 + field8587[18];
                                        }
                                        var9 = arg1.substring(0, var10 + 1);
                                    } catch (Exception var16) {
                                    }
                                }
                                continue;
                            }
                            var11 = '®';
                        }
                    }
                    if (var5 == -1) {
                        var7 += this.field8585[class513.method3867(7635, var11) & 0xFF] & 0xFF;
                        if (this.field8573 != null && var6 != -1) {
                            var7 += this.field8573[var6][var11];
                        }
                        var6 = var11;
                        int var14 = var7;
                        if (this.field8573 != null) {
                            var14 = this.field8573[var11][46] + var7;
                        }
                        if (var18 < var14) {
                            return var9 + field8587[18];
                        }
                        var9 = arg1.substring(0, var10 + 1);
                    }
                }
            }
            return arg1;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field8587[19] + (arg0 == null ? field8587[1] : field8587[11]) + ',' + (arg1 == null ? field8587[1] : field8587[11]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([B)V", line = 642)
    public class578(byte[] arg0) {
        try {
            class163 var2 = new class163(arg0);
            int var3 = var2.method1455((byte) 62);
            if (var3 != 0) {
                throw new RuntimeException("");
            }
            boolean var4 = var2.method1455((byte) 62) == 1;
            this.field8585 = new byte[256];
            var2.method1413(this.field8585, -16385, 256, 0);
            if (var4) {
                int[] var5 = new int[256];
                for (int var6 = 0; var6 < 256; var6++) {
                    var5[var6] = var2.method1455((byte) 62);
                }
                int[] var7 = new int[256];
                for (int var8 = 0; var8 < 256; var8++) {
                    var7[var8] = var2.method1455((byte) 62);
                }
                byte[][] var9 = new byte[256][];
                for (int var10 = 0; var10 < 256; var10++) {
                    var9[var10] = new byte[var5[var10]];
                    byte var11 = 0;
                    for (int var12 = 0; var12 < var9[var10].length; var12++) {
                        var11 += var2.method1414(1);
                        var9[var10][var12] = var11;
                    }
                }
                byte[][] var13 = new byte[256][];
                for (int var14 = 0; var14 < 256; var14++) {
                    var13[var14] = new byte[var5[var14]];
                    byte var15 = 0;
                    for (int var16 = 0; var16 < var13[var14].length; var16++) {
                        var15 += var2.method1414(1);
                        var13[var14][var16] = var15;
                    }
                }
                this.field8573 = new byte[256][256];
                for (int var17 = 0; var17 < 256; var17++) {
                    if (var17 != 32 && var17 != 160) {
                        for (int var18 = 0; var18 < 256; var18++) {
                            if (var18 != 32 && var18 != 160) {
                                this.field8573[var17][var18] = (byte) class613.method4531(this.field8585, var9, var7, 0, var18, var5, var13, var17);
                            }
                        }
                    }
                }
                this.field8584 = var5[32] + var7[32];
            } else {
                this.field8584 = var2.method1455((byte) 62);
            }
            var2.method1455((byte) 62);
            var2.method1455((byte) 62);
            this.field8574 = var2.method1455((byte) 62);
            this.field8571 = var2.method1455((byte) 62);
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field8587[23] + (arg0 == null ? field8587[1] : field8587[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[Lfs;Ljava/lang/String;I)I", line = 764)
    public final int method4325(int arg0, class581[] arg1, String arg2, int arg3) {
        try {
            field8572++;
            int var5 = this.method4321(arg2, arg1, (byte) -18, class591.field8685, new int[] { arg0 });
            int var6 = 0;
            if (arg3 != -16125) {
                return 95;
            }
            for (int var7 = 0; var7 < var5; var7++) {
                int var8 = this.method4316(class591.field8685[var7], arg1, (byte) -99);
                if (var6 < var8) {
                    var6 = var8;
                }
            }
            return var6;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8587[13] + arg0 + ',' + (arg1 == null ? field8587[1] : field8587[11]) + ',' + (arg2 == null ? field8587[1] : field8587[11]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4326(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4327(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
