import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class396 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "[B")
    private byte[] field5776;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[[B")
    private byte[][] field5766;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public int field5780;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field5779;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field5770 = 0;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field5771 = 0;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "Z")
    public static boolean field5784 = false;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[Lig;Ljava/lang/String;I)I")
    public final int method2346(boolean arg0, class154[] arg1, String arg2, int arg3) {
        field5781++;
        int var5 = this.method2355(class383.field5568, (byte) 114, new int[] { arg3 }, arg2, arg1);
        int var6 = 0;
        if (!arg0) {
            this.field5780 = -86;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2357(-128, arg1, class383.field5568[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method2347(int arg0, int arg1, boolean arg2, int arg3) {
        field5767++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            int var4 = arg0;
            int var5 = arg3 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - (arg1 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lig;ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2348(class154[] arg0, int arg1, String arg2, int arg3) {
        field5772++;
        if (this.method2357(46, arg0, arg2) <= arg3) {
            return arg2;
        }
        int var5 = arg3 - this.method2357(-123, null, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        if (arg1 <= 30) {
            return null;
        }
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class218.method1335(var13.substring(4), 10);
                                    var8 += arg0[var14].method988();
                                    var7 = -1;
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
                    var8 += this.field5776[class467.method2825(338, var12) & 0xFF] & 0xFF;
                    if (this.field5766 != null && var7 != -1) {
                        var8 += this.field5766[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5766 != null) {
                        var15 = this.field5766[var12][46] + var8;
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

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2349(String arg0, int arg1) {
        field5775++;
        if (arg1 != 0) {
            this.method2348(null, -50, null, 53);
        }
        return this.method2357(95, null, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ[Ltq;III)V")
    public static final void method2350(byte arg0, boolean arg1, class427[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class427 var7 = arg2[var6];
            if (var7 != null && var7.field6253 == arg3) {
                class229.method1377(arg4, -5, arg5, arg1, var7);
                class290.method1767(30789, var7, arg5, arg4);
                if (var7.field6277 > (var7.field6164 - var7.field6175)) {
                    var7.field6277 = var7.field6164 - var7.field6175;
                }
                if (var7.field6179 > (var7.field6184 - var7.field6126)) {
                    var7.field6179 = var7.field6184 - var7.field6126;
                }
                if (var7.field6277 < 0) {
                    var7.field6277 = 0;
                }
                if (var7.field6179 < 0) {
                    var7.field6179 = 0;
                }
                if (var7.field6197 == 0) {
                    class82.method590(var7, arg1, true);
                }
            }
        }
        if (arg0 != -32) {
            field5784 = false;
        }
        field5785++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lig;IBLjava/lang/String;)I")
    public final int method2351(class154[] arg0, int arg1, byte arg2, String arg3) {
        field5783++;
        int var5 = 19 / ((arg2 + 68) / 54);
        return this.method2355(class383.field5568, (byte) 117, new int[] { arg1 }, arg3, arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIC)I")
    public final int method2352(byte arg0, int arg1, char arg2) {
        field5774++;
        if (arg0 >= -24) {
            field5771 = -12;
        }
        return this.field5766 == null ? 0 : this.field5766[arg1][arg2];
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)I")
    public final int method2353(boolean arg0, int arg1) {
        field5777++;
        if (arg0) {
            this.field5766 = null;
        }
        return this.field5776[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lig;IILjava/lang/String;)I")
    public final int method2354(int arg0, class154[] arg1, int arg2, int arg3, String arg4) {
        if (arg3 == 0) {
            arg3 = this.field5778;
        }
        field5773++;
        int var6 = this.method2355(class383.field5568, (byte) 103, new int[] { arg0 }, arg4, arg1);
        int var7 = (var6 - 1) * arg3;
        if (arg2 != 256) {
            this.field5776 = null;
        }
        return this.field5780 + this.field5779 + var7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Ljava/lang/String;B[ILjava/lang/String;[Lig;)I")
    public final int method2355(String[] arg0, byte arg1, int[] arg2, String arg3, class154[] arg4) {
        field5769++;
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
        if (arg1 <= 91) {
            this.field5776 = null;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class467.method2825(338, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2353(false, var16);
                    var18 = var15;
                    if (this.field5766 != null && var12 != -1) {
                        var17 += this.field5766[var12][var16];
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
                        arg0[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg0.length) {
                            return 0;
                        }
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2353(false, 60);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2353(false, 62);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2353(false, 160);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2353(false, 173);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2353(false, 215);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2353(false, 8364);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2353(false, 169);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2353(false, 174);
                        if (this.field5766 != null && var12 != -1) {
                            var17 += this.field5766[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class218.method1335(var19.substring(4), 10);
                            var17 += arg4[var20].method988();
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
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (arg2[var13 >= arg2.length ? arg2.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg0[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg0[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
                                var7 = var18;
                            }
                        }
                        if (var16 == 45) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (arg3.length() > var7) {
            arg0[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "([B)V")
    public class396(byte[] arg0) {
        class40 var2 = new class40(arg0);
        int var3 = var2.method257((byte) 32);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method257((byte) 82) == 1;
        this.field5776 = new byte[256];
        var2.method273(0, 49152, this.field5776, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method257((byte) 88);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method257((byte) 28);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method262(-2);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method262(-2);
                    var11[var12][var16] = var15;
                }
            }
            this.field5766 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5766[var13][var14] = (byte) class425.method2497(var7, this.field5776, var14, var5, var13, var9, 255, var11);
                        }
                    }
                }
            }
            this.field5778 = var5[32] + var7[32];
        } else {
            this.field5778 = var2.method257((byte) 37);
        }
        var2.method257((byte) 74);
        var2.method257((byte) 31);
        this.field5780 = var2.method257((byte) 40);
        this.field5779 = var2.method257((byte) 77);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZLtq;)V")
    public static final void method2356(int arg0, int arg1, boolean arg2, class427 arg3) {
        class98.field1776 = arg3;
        class158.field2492 = arg0;
        class313.field4740 = arg1;
        if (arg2) {
            field5782++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lig;Ljava/lang/String;)I")
    public final int method2357(int arg0, class154[] arg1, String arg2) {
        field5768++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = 101 / ((arg0 + 27) / 58);
        int var5 = -1;
        int var6 = -1;
        int var7 = 0;
        int var8 = arg2.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 == '<') {
                var5 = var9;
            } else {
                if (var10 == '>' && var5 != -1) {
                    String var11 = arg2.substring(var5 + 1, var9);
                    var5 = -1;
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
                            if (var11.startsWith("img=") && arg1 != null) {
                                try {
                                    int var12 = class218.method1335(var11.substring(4), 10);
                                    var6 = -1;
                                    var7 += arg1[var12].method988();
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var5 == -1) {
                    var7 += this.field5776[class467.method2825(338, var10) & 0xFF] & 0xFF;
                    if (this.field5766 != null && var6 != -1) {
                        var7 += this.field5766[var6][var10];
                    }
                    var6 = var10;
                }
            }
        }
        return var7;
    }
}
