import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class82 {

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "[B")
    private byte[] field1198;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "[[B")
    private byte[][] field1196;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "Lni;")
    public static class367 field1199 = new class367(3, -1);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lbw;")
    public static class493 field1190;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)I")
    public final int method554(int arg0, int arg1) {
        if (arg0 != 255) {
            method561(114, 50, 8, (byte) 28);
        }
        field1187++;
        return this.field1198[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
    public static void method555(boolean arg0) {
        field1190 = null;
        field1199 = null;
        if (arg0) {
            field1199 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBLjava/lang/String;I[Laa;)I")
    public final int method556(int arg0, byte arg1, String arg2, int arg3, class341[] arg4) {
        field1189++;
        if (arg0 == 0) {
            arg0 = this.field1195;
        }
        if (arg1 == 1) {
            int var6 = this.method565(arg4, class293.field4276, arg2, new int[] { arg3 }, (byte) 95);
            int var7 = (var6 - 1) * arg0;
            return this.field1191 + var7 + this.field1201;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIC)I")
    public final int method557(int arg0, int arg1, char arg2) {
        field1194++;
        if (arg0 != 0) {
            this.field1195 = -34;
        }
        return this.field1196 == null ? 0 : this.field1196[arg1][arg2];
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)V")
    public static final void method558(int arg0, byte arg1) {
        int var2 = 102 % ((34 - arg1) / 36);
        class283.field4160.method2140(-112, arg0);
        field1200++;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILjava/lang/String;[Laa;I)Ljava/lang/String;")
    public final String method559(int arg0, String arg1, class341[] arg2, int arg3) {
        field1202++;
        if (arg0 >= this.method560(arg2, arg1, -1)) {
            return arg1;
        }
        int var5 = arg0 - this.method560(null, "...", -1);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        if (arg3 >= -27) {
            this.field1201 = 75;
        }
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
                                    int var14 = class370.method2349(10, var13.substring(4));
                                    var8 += arg2[var14].method302();
                                    var7 = -1;
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
                    var8 += this.field1198[class286.method1838(1, var12) & 0xFF] & 0xFF;
                    if (this.field1196 != null && var7 != -1) {
                        var8 += this.field1196[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field1196 != null) {
                        var15 = this.field1196[var12][46] + var8;
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

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([Laa;Ljava/lang/String;I)I")
    public final int method560(class341[] arg0, String arg1, int arg2) {
        field1193++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = arg2;
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class370.method2349(10, var10.substring(4));
                                    var6 += arg0[var11].method302();
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
                    var6 += this.field1198[class286.method1838(1, var9) & 0xFF] & 0xFF;
                    if (this.field1196 != null && var5 != -1) {
                        var6 += this.field1196[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIB)Lwj;")
    public static final class275 method561(int arg0, int arg1, int arg2, byte arg3) {
        field1203++;
        class452 var4 = class443.field6672[arg1][arg2][arg0];
        if (var4 == null) {
            return null;
        }
        class275 var5 = null;
        int var6 = -1;
        if (arg3 < 80) {
            field1190 = null;
        }
        for (class384 var7 = var4.field6814; var7 != null; var7 = var7.field5834) {
            class140 var8 = var7.field5832;
            if (var8 instanceof class275) {
                class275 var9 = (class275) var8;
                int var10 = (var9.method637((byte) -97) - 1) * 64 + 60;
                int var11 = var9.field1867 - var10 >> 7;
                int var12 = var9.field1862 - var10 >> 7;
                int var13 = var9.field1867 + var10 >> 7;
                int var14 = var9.field1862 + var10 >> 7;
                if (arg2 >= var11 && arg0 >= var12 && var13 >= arg2 && arg0 <= var14) {
                    int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg2);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([Laa;ILjava/lang/String;I)I")
    public final int method562(class341[] arg0, int arg1, String arg2, int arg3) {
        field1192++;
        int var5 = this.method565(arg0, class293.field4276, arg2, new int[] { arg3 }, (byte) 105);
        int var6 = 110 % ((arg1 + 60) / 62);
        int var7 = 0;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method560(arg0, class293.field4276[var8], -1);
            if (var7 < var9) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[Laa;Ljava/lang/String;Z)I")
    public final int method563(int arg0, class341[] arg1, String arg2, boolean arg3) {
        if (!arg3) {
            this.method564(-68, null);
        }
        field1197++;
        return this.method565(arg1, class293.field4276, arg2, new int[] { arg0 }, (byte) 103);
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "([B)V")
    public class82(byte[] arg0) {
        class164 var2 = new class164(arg0);
        int var3 = var2.method1087(false);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1087(false) == 1;
        this.field1198 = new byte[256];
        var2.method1109(this.field1198, (byte) 23, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1087(false);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1087(false);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1088((byte) 103);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1088((byte) -92);
                    var11[var12][var16] = var15;
                }
            }
            this.field1196 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field1196[var13][var14] = (byte) class374.method2358(var9, var11, var14, true, var5, this.field1198, var13, var7);
                        }
                    }
                }
            }
            this.field1195 = var5[32] + var7[32];
        } else {
            this.field1195 = var2.method1087(false);
        }
        var2.method1087(false);
        var2.method1087(false);
        this.field1201 = var2.method1087(false);
        this.field1191 = var2.method1087(false);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method564(int arg0, String arg1) {
        int var3 = 113 % ((arg0 + 16) / 56);
        field1204++;
        return this.method560(null, arg1, -1);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([Laa;[Ljava/lang/String;Ljava/lang/String;[IB)I")
    public final int method565(class341[] arg0, String[] arg1, String arg2, int[] arg3, byte arg4) {
        field1188++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg4 <= 94) {
            return -107;
        }
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class286.method1838(1, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method554(255, var16);
                    if (this.field1196 != null && var12 != -1) {
                        var17 += this.field1196[var12][var16];
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
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method554(255, 60);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method554(255, 62);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method554(255, 160);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method554(255, 173);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method554(255, 215);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method554(255, 8364);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method554(255, 169);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method554(255, 174);
                        if (this.field1196 != null && var12 != -1) {
                            var17 += this.field1196[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class370.method2349(10, var19.substring(4));
                            var17 += arg0[var20].method302();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg3 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (arg3[var13 >= arg3.length ? arg3.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg1[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
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
                                var12 = -1;
                                var7 = var18;
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
        if (var7 < arg2.length()) {
            arg1[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }
}
