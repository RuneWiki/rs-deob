import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class511 {

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "[B")
    private byte[] field6835;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public int field6820;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "[[B")
    private byte[][] field6831;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "I")
    public int field6828;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
    public int field6833;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "[F")
    public static float[] field6823 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "[I")
    public static int[] field6827 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "[Lwb;")
    public static class305[] field6819 = null;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "[Z")
    public static boolean[] field6834 = new boolean[100];

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field6816 = 0;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FIFF)F")
    public static final float method2835(float arg0, int arg1, float arg2, float arg3) {
        field6821++;
        if (arg1 != -6997) {
            field6816 = 88;
        }
        return (arg2 - arg3) * arg0 + arg3;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLjava/lang/String;[Lxa;I)Ljava/lang/String;")
    public final String method2836(byte arg0, String arg1, class468[] arg2, int arg3) {
        field6815++;
        if (this.method2838(arg2, arg1, (byte) -104) <= arg3) {
            return arg1;
        }
        int var5 = arg3 - this.method2838(null, "...", (byte) -61);
        if (arg0 != -123) {
            return null;
        }
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg1.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg1.substring(var6 + 1, var11);
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
                                    int var14 = class664.method3730(var13.substring(4), 122);
                                    var7 = -1;
                                    var8 += arg2[var14].method1025();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg1.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field6835[class350.method2086(var12, 3) & 0xFF] & 0xFF;
                    if (this.field6831 != null && var7 != -1) {
                        var8 += this.field6831[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field6831 != null) {
                        var15 = this.field6831[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)I")
    public final int method2837(int arg0, boolean arg1) {
        field6822++;
        if (arg1) {
            field6823 = null;
        }
        return this.field6835[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([Lxa;Ljava/lang/String;B)I")
    public final int method2838(class468[] arg0, String arg1, byte arg2) {
        field6832++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        if (arg2 > -59) {
            this.method2838(null, null, (byte) -28);
        }
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class664.method3730(var10.substring(4), 117);
                                    var6 += arg0[var11].method1025();
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
                    var6 += this.field6835[class350.method2086(var9, 3) & 0xFF] & 0xFF;
                    if (this.field6831 != null && var5 != -1) {
                        var6 += this.field6831[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public static void method2839(byte arg0) {
        field6819 = null;
        field6827 = null;
        field6834 = null;
        if (arg0 < 41) {
            method2844(114);
        }
        field6823 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[Lxa;Ljava/lang/String;I)I")
    public final int method2840(int arg0, int arg1, class468[] arg2, String arg3, int arg4) {
        if (arg1 == 0) {
            arg1 = this.field6820;
        }
        if (arg0 >= -90) {
            this.method2836((byte) 61, null, null, -90);
        }
        field6817++;
        int var6 = this.method2846(false, new int[] { arg4 }, class599.field7950, arg2, arg3);
        int var7 = (var6 - 1) * arg1;
        return this.field6828 + var7 + this.field6833;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;B[Lxa;I)I")
    public final int method2841(String arg0, byte arg1, class468[] arg2, int arg3) {
        field6830++;
        int var5 = this.method2846(false, new int[] { arg3 }, class599.field7950, arg2, arg0);
        int var6 = 0;
        int var7 = -95 % ((14 - arg1) / 58);
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2838(arg2, class599.field7950[var8], (byte) -80);
            if (var6 < var9) {
                var6 = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    public static final void method2842(boolean arg0) {
        field6818++;
        int var1 = 0;
        if (class344.field4718.method2330(-20622, class571.field7587)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class344.field4718.field5459) {
            var1 |= 0x40;
        }
        class491.method2742(arg0, var1);
        class470.field6288.method1262(false, var1);
        class193.field2826.method1048(127, var1);
        class239.field3369.method286(var1, -108);
        class120.field2028.method3726(var1, false);
        class524.method2933((byte) 106, var1);
        class191.method1246(var1, 3);
        class286.method1765((byte) 66, var1);
        class526.method2939(var1, arg0);
        class366.method2157(102);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILjava/lang/String;I[Lxa;)I")
    public final int method2843(int arg0, String arg1, int arg2, class468[] arg3) {
        field6826++;
        if (arg0 <= 65) {
            this.method2837(13, false);
        }
        return this.method2846(false, new int[] { arg2 }, class599.field7950, arg3, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Z")
    public static final boolean method2844(int arg0) {
        field6814++;
        class690 var1 = (class690) class214.field3063.method3257(-117);
        if (arg0 > -29) {
            return true;
        } else if (var1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < var1.field9727; var2++) {
                if (var1.field9719[var2] != null && var1.field9719[var2].field2816 == 0) {
                    return false;
                }
                if (var1.field9715[var2] != null && var1.field9715[var2].field2816 == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZIC)I")
    public final int method2845(boolean arg0, int arg1, char arg2) {
        field6825++;
        if (!arg0) {
            this.method2843(10, null, -107, null);
        }
        return this.field6831 == null ? 0 : this.field6831[arg1][arg2];
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z[I[Ljava/lang/String;[Lxa;Ljava/lang/String;)I")
    public final int method2846(boolean arg0, int[] arg1, String[] arg2, class468[] arg3, String arg4) {
        field6824++;
        if (arg4 == null) {
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
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class350.method2086(arg4.charAt(var15), 3) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2837(var16, false);
                    var18 = var15;
                    if (this.field6831 != null && var12 != -1) {
                        var17 += this.field6831[var12][var16];
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
                        arg2[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2837(60, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2837(62, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2837(160, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2837(173, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2837(215, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2837(8364, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2837(169, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2837(174, false);
                        if (this.field6831 != null && var12 != -1) {
                            var17 += this.field6831[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class664.method3730(var19.substring(4), 124);
                            var12 = -1;
                            var17 += arg3[var20].method1025();
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
                            var10 = 1;
                            var8 = var15;
                        }
                        if (var6 > arg1[arg1.length > var13 ? var13 : arg1.length - 1]) {
                            if (var8 >= 0) {
                                arg2[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg2[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var6 = var17;
                                var12 = -1;
                                var8 = -1;
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
        if (arg4.length() > var7) {
            arg2[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        if (arg0) {
            return 126;
        } else {
            return var13;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2847(String arg0, byte arg1) {
        if (arg1 >= -115) {
            return -111;
        } else {
            field6829++;
            return this.method2838(null, arg0, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "([B)V")
    public class511(byte[] arg0) {
        class335 var2 = new class335(arg0);
        int var3 = var2.method2034(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2034(255) == 1;
        this.field6835 = new byte[256];
        var2.method1985((byte) 0, 256, this.field6835, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2034(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2034(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2040(-65);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2040(-94);
                    var11[var12][var16] = var15;
                }
            }
            this.field6831 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6831[var13][var14] = (byte) class106.method801(var11, var13, 255, var7, var5, var14, var9, this.field6835);
                        }
                    }
                }
            }
            this.field6820 = var7[32] + var5[32];
        } else {
            this.field6820 = var2.method2034(255);
        }
        var2.method2034(255);
        var2.method2034(255);
        this.field6828 = var2.method2034(255);
        this.field6833 = var2.method2034(255);
    }
}
