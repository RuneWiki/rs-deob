import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class365 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "[B")
    private byte[] field5277;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[[B")
    private byte[][] field5278;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[[B")
    public static byte[][] field5267 = new byte[50][];

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Ljn;")
    public static class409 field5285 = new class409("K", "T", "K", "K");

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([Lae;ILjava/lang/String;)I", line = 4)
    public final int method2320(class285[] arg0, int arg1, String arg2) {
        field5270++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -97 / ((arg1 + 55) / 54);
        int var6 = -1;
        int var7 = 0;
        int var8 = arg2.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 == '<') {
                var4 = var9;
            } else {
                if (var10 == '>' && var4 != -1) {
                    String var11 = arg2.substring(var4 + 1, var9);
                    var4 = -1;
                    if (var11.equals("lt")) {
                        var10 = '<';
                    } else if (var11.equals("gt")) {
                        var10 = '>';
                    } else if (var11.equals("nbsp")) {
                        var10 = ' ';
                    } else if (var11.equals("shy")) {
                        var10 = '\u00AD';
                    } else if (var11.equals("times")) {
                        var10 = '×';
                    } else if (var11.equals("euro")) {
                        var10 = '€';
                    } else if (var11.equals("copy")) {
                        var10 = '©';
                    } else {
                        if (!var11.equals("reg")) {
                            if (var11.startsWith("img=") && arg0 != null) {
                                try {
                                    int var12 = class92.method627(var11.substring(4), (byte) 77);
                                    var6 = -1;
                                    var7 += arg0[var12].method1861();
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var7 += this.field5277[class420.method2594(-104, var10) & 0xFF] & 0xFF;
                    if (this.field5278 != null && var6 != -1) {
                        var7 += this.field5278[var6][var10];
                    }
                    var6 = var10;
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lct;Lct;Lct;ILct;)V", line = 115)
    public static final void method2321(class104 arg0, class104 arg1, class104 arg2, int arg3, class104 arg4) {
        class305.field4505 = arg0;
        class199.field2820 = arg1;
        field5280++;
        if (arg3 != 0) {
            field5267 = null;
        }
        class245.field3623 = arg2;
        class303.field4434 = arg4;
        class444.field6470 = new class223[class199.field2820.method712(false)][];
        class22.field318 = new boolean[class199.field2820.method712(false)];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I", line = 131)
    public final int method2322(int arg0, int arg1) {
        field5279++;
        return arg1 == 0 ? this.field5277[arg0] & 0xFF : -20;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILjava/lang/String;[Lae;)I", line = 145)
    public final int method2323(int arg0, int arg1, int arg2, String arg3, class285[] arg4) {
        if (arg0 == 0) {
            arg0 = this.field5274;
        }
        field5269++;
        int var6 = this.method2330(arg4, 0, new int[] { arg1 }, class326.field4800, arg3);
        int var7 = (var6 - 1) * arg0;
        return arg2 == 18531 ? this.field5284 + var7 + this.field5268 : 51;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 164)
    public static final void method2324(int arg0) {
        if (arg0 != -1) {
            method2331((String) null, (Throwable) null, -79);
        }
        field5273++;
        class257.method1773((byte) -10, class260.field3855);
        class452.field6666++;
        class159.field2132.method1727(-128, 0);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;[Lae;IB)I", line = 179)
    public final int method2325(String arg0, class285[] arg1, int arg2, byte arg3) {
        field5283++;
        return arg3 == 27 ? this.method2330(arg1, 0, new int[] { arg2 }, class326.field4800, arg0) : 76;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIILub;II)V", line = 196)
    public static final void method2326(byte arg0, int arg1, int arg2, class138 arg3, int arg4, int arg5) {
        field5275++;
        if (arg3.field1901 == -1 && arg3.field1896 == null) {
            return;
        }
        int var6 = 0;
        if (arg5 > arg3.field1892) {
            var6 += arg5 - arg3.field1892;
        } else if (arg3.field1897 > arg5) {
            var6 += arg3.field1897 - arg5;
        }
        int var7 = class178.field2539 * arg3.field1884 >> 8;
        if (arg4 > arg3.field1887) {
            var6 += arg4 - arg3.field1887;
        } else if (arg4 < arg3.field1900) {
            var6 += arg3.field1900 - arg4;
        }
        if (arg0 < 120) {
            method2329(-63);
        }
        if (arg3.field1882 == 0 || var6 - 64 > arg3.field1882 || class178.field2539 == 0 || arg3.field1894 != arg1) {
            if (arg3.field1898 != null) {
                class452.field6671.method278(arg3.field1898);
                arg3.field1898 = null;
            }
            if (arg3.field1886 != null) {
                class452.field6671.method278(arg3.field1886);
                arg3.field1886 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field1882 - var6) * var7 / arg3.field1882;
        if (arg3.field1898 != null) {
            arg3.field1898.method1325(var8);
        } else if (arg3.field1901 >= 0) {
            class360 var9 = class360.method2290(class288.field4221, arg3.field1901, 0);
            if (var9 != null) {
                class179 var10 = var9.method2288().method1246(class189.field2637);
                class190 var11 = class190.method1329(var10, 100, var8);
                var11.method1333(-1);
                class452.field6671.method276(var11);
                arg3.field1898 = var11;
            }
        }
        if (arg3.field1886 != null) {
            arg3.field1886.method1325(var8);
            if (!arg3.field1886.method1822(-98)) {
                arg3.field1886 = null;
            }
        } else if (arg3.field1896 != null && (arg3.field1888 -= arg2) <= 0) {
            int var12 = (int) ((double) arg3.field1896.length * Math.random());
            class360 var13 = class360.method2290(class288.field4221, arg3.field1896[var12], 0);
            if (var13 != null) {
                class179 var14 = var13.method2288().method1246(class189.field2637);
                class190 var15 = class190.method1329(var14, 100, var8);
                var15.method1333(0);
                class452.field6671.method276(var15);
                arg3.field1886 = var15;
                arg3.field1888 = (int) (Math.random() * (double) (arg3.field1883 - arg3.field1893)) + arg3.field1893;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(CIZ)I", line = 322)
    public final int method2327(char arg0, int arg1, boolean arg2) {
        field5286++;
        if (arg2) {
            return 54;
        } else if (this.field5278 == null) {
            return 0;
        } else {
            return this.field5278[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;[Lae;B)I", line = 339)
    public final int method2328(int arg0, String arg1, class285[] arg2, byte arg3) {
        field5282++;
        int var5 = this.method2330(arg2, 0, new int[] { arg0 }, class326.field4800, arg1);
        int var6 = 0;
        if (arg3 != -56) {
            return -119;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2320(arg2, -120, class326.field4800[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 371)
    public static final void method2329(int arg0) {
        class455.field6729 = true;
        int var1 = -103 % ((arg0 - 74) / 46);
        field5281++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([Lae;I[I[Ljava/lang/String;Ljava/lang/String;)I", line = 381)
    public final int method2330(class285[] arg0, int arg1, int[] arg2, String[] arg3, String arg4) {
        field5271++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = arg1;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class420.method2594(-121, arg4.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2322(var16, 0);
                    if (this.field5278 != null && var12 != -1) {
                        var17 += this.field5278[var12][var16];
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
                        var12 = -1;
                        var7 = var15 + 1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2322(60, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2322(62, arg1);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2322(160, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2322(173, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2322(215, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2322(8364, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2322(169, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2322(174, 0);
                        if (this.field5278 != null && var12 != -1) {
                            var17 += this.field5278[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class92.method627(var19.substring(4), (byte) 123);
                            var17 += arg0[var20].method1861();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg2 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg2[arg2.length > var13 ? var13 : arg2.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg3[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
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

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 626)
    public static final void method2331(String arg0, Throwable arg1, int arg2) {
        field5272++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class304.method2019(arg1, -115);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class225.method1547(3, var3);
            String var4 = class373.method2368(":", arg2 - 28692, var3, "%3a");
            String var5 = class373.method2368("@", arg2 ^ arg2, var4, "%40");
            String var6 = class373.method2368("&", 0, var5, "%26");
            String var7 = class373.method2368("#", 0, var6, "%23");
            if (class363.field5258.field5023 != null) {
                class350 var8 = class363.field5258.method2214(new URL(class363.field5258.field5023.getCodeBase(), "clienterror.ws?c=" + class125.field1664 + "&u=" + class135.field1853 + "&v1=" + class341.field5020 + "&v2=" + class341.field5018 + "&e=" + var7), arg2 ^ 0x7014);
                while (var8.field5134 == 0) {
                    class418.method2587(false, 1L);
                }
                if (var8.field5134 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field5129;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 675)
    public static void method2332(int arg0) {
        field5267 = null;
        field5285 = null;
        if (arg0 != 1) {
            field5285 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)I", line = 686)
    public final int method2333(int arg0, String arg1) {
        int var3 = 114 / ((36 - arg0) / 58);
        field5276++;
        return this.method2320((class285[]) null, 85, arg1);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V", line = 698)
    public class365(byte[] arg0) {
        class256 var2 = new class256(arg0);
        int var3 = var2.method1738((byte) 117);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1738((byte) 106) == 1;
        this.field5277 = new byte[256];
        var2.method1710(256, 0, this.field5277, -119);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1738((byte) -70);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1738((byte) 111);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1728((byte) 120);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1728((byte) 114);
                    var11[var12][var16] = var15;
                }
            }
            this.field5278 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5278[var13][var14] = (byte) class446.method2746(var11, var6, 255, var5, this.field5277, var13, var14, var9);
                        }
                    }
                }
            }
            this.field5274 = var5[32] + var6[32];
        } else {
            this.field5274 = var2.method1738((byte) 68);
        }
        var2.method1738((byte) -87);
        var2.method1738((byte) -61);
        this.field5284 = var2.method1738((byte) 99);
        this.field5268 = var2.method1738((byte) -124);
    }
}
