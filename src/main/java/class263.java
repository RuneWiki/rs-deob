import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class263 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
    private byte[] field3712;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[[B")
    private byte[][] field3722;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;ZI[Lqda;)Ljava/lang/String;")
    public final String method1727(String arg0, boolean arg1, int arg2, class112[] arg3) {
        field3710++;
        if (arg2 >= this.method1735((byte) -12, arg3, arg0)) {
            return arg0;
        }
        int var5 = arg2 - this.method1735((byte) -12, null, "...");
        int var6 = -1;
        int var7 = -1;
        if (!arg1) {
            this.field3711 = -107;
        }
        int var8 = 0;
        int var9 = arg0.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg0.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg0.substring(var6 + 1, var11);
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
                            if (var13.startsWith("img=") && arg3 != null) {
                                try {
                                    int var14 = class4.method25(0, var13.substring(4));
                                    var8 += arg3[var14].method781();
                                    var7 = -1;
                                    if (var8 > var5) {
                                        return var10 + "...";
                                    }
                                    var10 = arg0.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field3712[class483.method2829((byte) -83, var12) & 0xFF] & 0xFF;
                    if (this.field3722 != null && var7 != -1) {
                        var8 += this.field3722[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3722 != null) {
                        var15 = this.field3722[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg0.substring(0, var11 + 1);
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1728(String arg0, int arg1) {
        int var3 = -106 / ((arg1 - 59) / 56);
        field3718++;
        return this.method1735((byte) -12, null, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
    public final int method1729(int arg0, byte arg1) {
        field3719++;
        return arg1 < 30 ? 51 : this.field3712[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1730(boolean arg0, String arg1, byte arg2) {
        field3715++;
        if (arg1 == null) {
            return;
        }
        if (class155.field2304 >= 100) {
            class64.method386(class674.field9590.method3825((byte) -10, class526.field7494), 4, false);
            return;
        }
        String var3 = class221.method1524(arg1, -68);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class155.field2304; var4++) {
            String var9 = class221.method1524(class127.field1657[var4], -79);
            if (var9 != null && var9.equals(var3)) {
                class64.method386(arg1 + class674.field9591.method3825((byte) -10, class526.field7494), 4, false);
                return;
            }
            if (class241.field3456[var4] != null) {
                String var10 = class221.method1524(class241.field3456[var4], -64);
                if (var10 != null && var10.equals(var3)) {
                    class64.method386(arg1 + class674.field9591.method3825((byte) -10, class526.field7494), 4, false);
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg2 > -39) {
            return;
        }
        while (var5 < class50.field719) {
            String var7 = class221.method1524(class662.field9293[var5], -83);
            if (var7 != null && var7.equals(var3)) {
                class64.method386(class674.field9596.method3825((byte) -10, class526.field7494) + arg1 + class674.field9597.method3825((byte) -10, class526.field7494), 4, false);
                return;
            }
            if (class738.field10303[var5] != null) {
                String var8 = class221.method1524(class738.field10303[var5], -104);
                if (var8 != null && var8.equals(var3)) {
                    class64.method386(class674.field9596.method3825((byte) -10, class526.field7494) + arg1 + class674.field9597.method3825((byte) -10, class526.field7494), 4, false);
                    return;
                }
            }
            var5++;
        }
        if (class221.method1524(class251.field3549.field7955, -126).equals(var3)) {
            class64.method386(class674.field9593.method3825((byte) -10, class526.field7494), 4, false);
            return;
        }
        class184.field2782++;
        class731 var6 = class155.method1222(260, class258.field3630, class237.field3417);
        var6.field10211.method851((byte) -2, class233.method1612(1, arg1) + 1);
        var6.field10211.method880(true, arg1);
        var6.field10211.method851((byte) -2, arg0 ? 1 : 0);
        class533.method3088(var6, 0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(CII)I")
    public final int method1731(char arg0, int arg1, int arg2) {
        if (arg2 != 1230) {
            this.field3722 = null;
        }
        field3714++;
        return this.field3722 == null ? 0 : this.field3722[arg1][arg0];
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZBLha;I)Ljc;")
    public static final class461 method1732(boolean arg0, byte arg1, class66 arg2, int arg3) {
        field3717++;
        if (arg3 == -1) {
            return null;
        }
        if (class469.field6699 != null) {
            for (int var4 = 0; var4 < class469.field6699.length; var4++) {
                if (class469.field6699[var4] == arg3) {
                    return class391.field5552[var4];
                }
            }
        }
        int var5 = -30 % ((42 - arg1) / 35);
        class461 var6 = (class461) class772.field10654.method2373((long) arg3, 103);
        if (var6 != null) {
            if (arg0 && var6.field6592 == null) {
                class263 var7 = class96.method677(class13.field257, arg3, (byte) -125);
                if (var7 == null) {
                    return null;
                }
                var6.field6592 = var7;
            }
            return var6;
        }
        class625[] var8 = class625.method3581(class412.field5831, arg3);
        if (var8 == null) {
            return null;
        }
        class263 var9 = class96.method677(class13.field257, arg3, (byte) -125);
        if (var9 == null) {
            return null;
        }
        class461 var10;
        if (arg0) {
            var10 = new class461(arg2.method403(var9, var8, true), var9);
        } else {
            var10 = new class461(arg2.method403(var9, var8, true));
        }
        class772.field10654.method2362(var10, 0, (long) arg3);
        return var10;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;[Lqda;II)I")
    public final int method1733(String arg0, class112[] arg1, int arg2, int arg3) {
        field3720++;
        return arg3 > -98 ? -52 : this.method1737(class705.field9920, arg1, arg0, new int[] { arg2 }, true);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILjava/lang/String;[Lqda;)I")
    public final int method1734(int arg0, int arg1, int arg2, String arg3, class112[] arg4) {
        if (arg1 == arg2) {
            arg1 = this.field3711;
        }
        field3709++;
        int var6 = this.method1737(class705.field9920, arg4, arg3, new int[] { arg0 }, true);
        int var7 = (var6 - 1) * arg1;
        return this.field3723 + this.field3724 + var7;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[Lqda;Ljava/lang/String;)I")
    public final int method1735(byte arg0, class112[] arg1, String arg2) {
        field3721++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg0 != -12) {
            return -49;
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class4.method25(0, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method781();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field3712[class483.method2829((byte) -83, var9) & 0xFF] & 0xFF;
                    if (this.field3722 != null && var5 != -1) {
                        var6 += this.field3722[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[Lqda;Ljava/lang/String;I)I")
    public final int method1736(int arg0, class112[] arg1, String arg2, int arg3) {
        field3716++;
        int var5 = this.method1737(class705.field9920, arg1, arg2, new int[] { arg0 }, true);
        int var6 = arg3;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1735((byte) -12, arg1, class705.field9920[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ljava/lang/String;[Lqda;Ljava/lang/String;[IZ)I")
    public final int method1737(String[] arg0, class112[] arg1, String arg2, int[] arg3, boolean arg4) {
        field3713++;
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
        if (!arg4) {
            return -35;
        }
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class483.method2829((byte) -83, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1729(var16, (byte) 54);
                    var18 = var15;
                    if (this.field3722 != null && var12 != -1) {
                        var17 += this.field3722[var12][var16];
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
                        if (var13 >= arg0.length) {
                            return 0;
                        }
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1729(60, (byte) 103);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1729(62, (byte) 94);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1729(160, (byte) 91);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1729(173, (byte) 94);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1729(215, (byte) 105);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1729(8364, (byte) 104);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1729(169, (byte) 85);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1729(174, (byte) 57);
                        if (this.field3722 != null && var12 != -1) {
                            var17 += this.field3722[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class4.method25(0, var19.substring(4));
                            var12 = -1;
                            var17 += arg1[var20].method781();
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
                            var10 = 1;
                            var8 = var15;
                        }
                        if (var6 > arg3[arg3.length <= var13 ? arg3.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg0[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg0[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var8 = -1;
                                var7 = var18;
                                var6 = var17;
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
        if (arg2.length() > var7) {
            arg0[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
    public class263(byte[] arg0) {
        class120 var2 = new class120(arg0);
        int var3 = var2.method842(2384);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method842(2384) == 1;
        this.field3712 = new byte[256];
        var2.method850(255, 0, 256, this.field3712);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method842(2384);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method842(2384);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method877(-252);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method877(-252);
                    var11[var12][var16] = var15;
                }
            }
            this.field3722 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3722[var13][var14] = (byte) class74.method583(var9, var13, var5, this.field3712, var6, var11, var14, (byte) 30);
                        }
                    }
                }
            }
            this.field3711 = var5[32] + var6[32];
        } else {
            this.field3711 = var2.method842(2384);
        }
        var2.method842(2384);
        var2.method842(2384);
        this.field3723 = var2.method842(2384);
        this.field3724 = var2.method842(2384);
    }
}
