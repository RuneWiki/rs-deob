import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class539 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[B")
    private byte[] field7135;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[[B")
    private byte[][] field7136;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field7142;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field7147;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field7145;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[I")
    public static int[] field7143 = new int[8];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;I[Lhu;I)I")
    public final int method2998(int arg0, String arg1, int arg2, class133[] arg3, int arg4) {
        field7134++;
        if (arg4 == 0) {
            arg4 = this.field7142;
        }
        int var6 = this.method3006(arg1, 174, new int[] { arg2 }, class347.field4872, arg3);
        int var7 = (arg0 + var6) * arg4;
        return this.field7147 + var7 + this.field7145;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B[Lhu;I)I")
    public final int method2999(String arg0, byte arg1, class133[] arg2, int arg3) {
        field7139++;
        return arg1 == -46 ? this.method3006(arg0, 174, new int[] { arg3 }, class347.field4872, arg2) : -108;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIC)I")
    public final int method3000(int arg0, int arg1, char arg2) {
        if (arg1 == 0) {
            field7140++;
            return this.field7136 == null ? 0 : this.field7136[arg0][arg2];
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method3001(int arg0, String arg1) {
        if (arg0 == -1) {
            field7148++;
            return this.method3004(215, arg1, null);
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method3002(byte arg0) {
        if (arg0 != -87) {
            field7143 = null;
        }
        field7143 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I[Lhu;I)I")
    public final int method3003(String arg0, int arg1, class133[] arg2, int arg3) {
        field7133++;
        int var5 = this.method3006(arg0, 174, new int[] { arg3 }, class347.field4872, arg2);
        if (arg1 >= -117) {
            return -19;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3004(215, class347.field4872[var7], arg2);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;[Lhu;)I")
    public final int method3004(int arg0, String arg1, class133[] arg2) {
        field7138++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
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
                                    int var11 = class397.method2337((byte) -110, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg2[var11].method1036();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field7135[class295.method1826(27, var9) & 0xFF] & 0xFF;
                    if (this.field7136 != null && var5 != -1) {
                        var6 += this.field7136[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg0 != 215) {
            this.field7145 = 98;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lhu;Ljava/lang/String;II)Ljava/lang/String;")
    public final String method3005(class133[] arg0, String arg1, int arg2, int arg3) {
        field7141++;
        if (this.method3004(215, arg1, arg0) <= arg3) {
            return arg1;
        }
        int var5 = arg3 - this.method3004(215, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        for (int var11 = arg2; var11 < var9; var11++) {
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class397.method2337((byte) -120, var13.substring(4));
                                    var8 += arg0[var14].method1036();
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
                    var8 += this.field7135[class295.method1826(47, var12) & 0xFF] & 0xFF;
                    if (this.field7136 != null && var7 != -1) {
                        var8 += this.field7136[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field7136 != null) {
                        var15 = this.field7136[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I[I[Ljava/lang/String;[Lhu;)I")
    public final int method3006(String arg0, int arg1, int[] arg2, String[] arg3, class133[] arg4) {
        field7137++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg1 != 174) {
            return 106;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class295.method1826(59, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method3008(-59, var16);
                    var18 = var15;
                    if (this.field7136 != null && var12 != -1) {
                        var17 += this.field7136[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg0.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg3[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (arg3.length <= var13) {
                            return 0;
                        }
                        var12 = -1;
                        var7 = var15 + 1;
                        var8 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3008(-117, 60);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3008(-39, 62);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3008(-65, 160);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3008(-112, 173);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3008(arg1 - 263, 215);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3008(arg1 ^ 0xFFFFFF1E, 8364);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3008(-35, 169);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3008(-51, 174);
                        if (this.field7136 != null && var12 != -1) {
                            var17 += this.field7136[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class397.method2337((byte) -123, var19.substring(4));
                            var12 = -1;
                            var17 += arg4[var20].method1036();
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
                        if (var6 > arg2[arg2.length <= var13 ? arg2.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg3[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg3[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var8 = -1;
                                var6 = var17;
                                var7 = var18;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var8 = var15;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (arg0.length() > var7) {
            arg3[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method3007(int arg0) throws IOException {
        if (arg0 != 7388) {
            method3002((byte) 105);
        }
        if (class209.field3089 != null && class18.field243 > 0) {
            class654.field8665.field9419 = 0;
            while (true) {
                class583 var1 = (class583) class731.field10136.method21(arg0 ^ 0x1CDE);
                if (var1 == null || (class654.field8665.field9399.length - class654.field8665.field9419) < var1.field7634) {
                    class209.field3089.method1442(class654.field8665.field9419, class654.field8665.field9399, 1232, 0);
                    class598.field7848 += class654.field8665.field9419;
                    class567.field7457 = 0;
                    break;
                }
                class654.field8665.method3827(0, (byte) -32, var1.field7637.field9399, var1.field7634);
                class18.field243 -= var1.field7634;
                var1.method3564(true);
                var1.field7637.method3813(16954);
                var1.method3185(arg0 + 9636);
            }
        }
        field7144++;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([B)V")
    public class539(byte[] arg0) {
        class677 var2 = new class677(arg0);
        int var3 = var2.method3821((byte) -82);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3821((byte) -45) == 1;
        this.field7135 = new byte[256];
        var2.method3801(this.field7135, 0, 256, 112);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method3821((byte) -87);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method3821((byte) 85);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3811(73);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3811(49);
                    var11[var12][var16] = var15;
                }
            }
            this.field7136 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field7136[var13][var14] = (byte) class338.method2033(var14, this.field7135, var7, (byte) 84, var13, var9, var11, var5);
                        }
                    }
                }
            }
            this.field7142 = var5[32] + var7[32];
        } else {
            this.field7142 = var2.method3821((byte) -21);
        }
        var2.method3821((byte) 118);
        var2.method3821((byte) 87);
        this.field7147 = var2.method3821((byte) -92);
        this.field7145 = var2.method3821((byte) 73);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public final int method3008(int arg0, int arg1) {
        if (arg0 >= -30) {
            this.field7145 = -53;
        }
        field7146++;
        return this.field7135[arg1] & 0xFF;
    }
}
