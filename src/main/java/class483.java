import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class483 {

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "[B")
    private byte[] field6797;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public int field6803;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "[[B")
    private byte[][] field6805;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "Lh;")
    public static class571 field6809 = new class571(10);

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "[I")
    public static int[] field6817 = new int[13];

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "[[I")
    public static int[][] field6816 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "Z")
    public static boolean field6820 = false;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method2807(int arg0, int arg1, String arg2) {
        field6800++;
        if (class288.field3965 != 3) {
            class336.field4477 = new class189();
            class336.field4477.field2680 = arg1;
            class336.field4477.field2686 = arg2;
            if (class71.field1181 != class53.field988) {
                class336.field4477.field2682 = class336.field4477.field2680 + 40000;
                class336.field4477.field2685 = class336.field4477.field2680 + 50000;
            }
            if (class35.field749.length > arg1 && class35.field749[arg1] != null) {
                class224.field3218 = class35.field749[arg1].field4366;
            }
            return true;
        }
        String var3 = "";
        if (class71.field1181 != class53.field988) {
            var3 = ":" + (arg1 + 7000);
        }
        if (arg0 != 18205) {
            field6809 = null;
        }
        String var4 = "";
        if (class310.field4180 != null) {
            var4 = "/p=" + class310.field4180;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class173.field2491 + "/a=" + class517.field7259 + var4 + "/j" + (class589.field8420 ? "1" : "0") + ",o" + (class623.field8997 ? "1" : "0") + ",a2";
        try {
            class313.field4221.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIII)V")
    public static final void method2808(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 215) {
            return;
        }
        field6798++;
        if (arg0 <= arg2) {
            class266.method1742(arg1 + 26629, class182.field2580[arg4], arg2, arg3, arg0);
        } else {
            class266.method1742(26844, class182.field2580[arg4], arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)Z")
    public static final boolean method2809(int arg0, int arg1, int arg2) {
        field6811++;
        int var3 = 100 / ((arg0 - 27) / 58);
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2810(String arg0, byte arg1) {
        field6812++;
        return arg1 == 124 ? this.method2811(null, arg0, -82) : 83;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([Lha;Ljava/lang/String;I)I")
    public final int method2811(class52[] arg0, String arg1, int arg2) {
        field6819++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -6 / ((-arg2 - 4) / 35);
        int var6 = -1;
        int var7 = 0;
        int var8 = arg1.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 == '<') {
                var4 = var9;
            } else {
                if (var10 == '>' && var4 != -1) {
                    String var11 = arg1.substring(var4 + 1, var9);
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
                                    int var12 = class547.method3122(var11.substring(4), 102);
                                    var7 += arg0[var12].method419();
                                    var6 = -1;
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var7 += this.field6797[class228.method1452(var10, (byte) -126) & 0xFF] & 0xFF;
                    if (this.field6805 != null && var6 != -1) {
                        var7 += this.field6805[var6][var10];
                    }
                    var6 = var10;
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILqa;Lj;Ldu;)V")
    public static final void method2812(int arg0, class207 arg1, class463 arg2, class299 arg3) {
        field6807++;
        class52 var4 = arg2.method2711(arg1, arg0 - 102);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method429();
        if (var5 < var4.method422()) {
            var5 = var4.method422();
        }
        byte var6 = 10;
        int var7 = arg3.field4090;
        int var8 = arg3.field4084;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0;
        if (arg2.field6531 != null) {
            var9 = class451.field6372.method2821(class118.field1937, null, arg0 - 1, arg2.field6531, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class118.field1937[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class205.field2886.method1495(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class205.field2886.method1497() + (class205.field2886.method1500() / 2);
        }
        int var15 = var5 / 2 + arg3.field4090;
        int var16 = arg3.field4084;
        if (var7 < (class413.field5834 + var5)) {
            var15 = var10 / 2 + (class413.field5834 + var6 - (-(var5 / 2) - 5));
            var7 = class413.field5834;
        } else if (var7 > class413.field5841 - var5) {
            var15 = class413.field5841 - (var5 / 2) - (var10 / 2) - var6 - 5;
            var7 = class413.field5841 - var5;
        }
        if (var8 < (class413.field5823 + var5)) {
            var16 = var6 + (var5 / 2) + class413.field5823;
            var8 = class413.field5823;
        } else if ((class413.field5827 - var5) < var8) {
            var16 = class413.field5827 - (var5 / 2) - var11 - var6;
            var8 = class413.field5827 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg3.field4090), (double) (var8 - arg3.field4084)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method500((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field6531 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var20 = var10 + var18 + 10;
            var21 = var9 * class205.field2886.method1497() + var16 + 3;
            if (arg2.field6508 != 0) {
                arg1.method1368(var16, var20 - var18, -var16 + var21, arg2.field6508, var18, (byte) -16);
            }
            if (arg2.field6528 != 0) {
                arg1.method1291(arg2.field6528, var20 - var18, var21 - var16, var18, var16, arg0);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class118.field1937[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class205.field2886.method1501(arg1, var23, var15, var16, arg2.field6505, true);
                var16 += class205.field2886.method1497();
            }
        }
        if (arg2.field6512 == -1 && arg2.field6531 == null) {
            return;
        }
        class542 var24 = new class542(arg3);
        int var25 = var5 >> 1;
        var24.field7544 = var18;
        var24.field7543 = var7 + var25;
        var24.field7538 = var8 + var25;
        var24.field7542 = var20;
        var24.field7548 = var19;
        var24.field7546 = var7 - var25;
        var24.field7541 = var21;
        var24.field7545 = var8 - var25;
        class317.field4305.method463(var24, -96);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I[Lha;B)I")
    public final int method2813(String arg0, int arg1, class52[] arg2, byte arg3) {
        int var5 = 5 / ((-arg3 - 54) / 52);
        field6801++;
        return this.method2821(class358.field4822, arg2, -1, arg0, new int[] { arg1 });
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static void method2814(int arg0) {
        field6817 = null;
        field6816 = null;
        field6809 = null;
        if (arg0 != 0) {
            method2812(69, null, null, null);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I[Lha;I)Ljava/lang/String;")
    public final String method2815(String arg0, int arg1, class52[] arg2, int arg3) {
        field6810++;
        if (this.method2811(arg2, arg0, -127) <= arg1) {
            return arg0;
        }
        int var5 = arg1 - this.method2811(null, "...", -94);
        int var6 = arg3;
        int var7 = -1;
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
                            if (var13.startsWith("img=") && arg2 != null) {
                                try {
                                    int var14 = class547.method3122(var13.substring(4), arg3 + 71);
                                    var7 = -1;
                                    var8 += arg2[var14].method419();
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
                    var8 += this.field6797[class228.method1452(var12, (byte) -126) & 0xFF] & 0xFF;
                    if (this.field6805 != null && var7 != -1) {
                        var8 += this.field6805[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field6805 != null) {
                        var15 = this.field6805[var12][46] + var8;
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

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2816(int arg0, byte arg1, int arg2) {
        field6815++;
        if (arg1 == -35) {
            return (arg0 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BIC)I")
    public final int method2817(byte arg0, int arg1, char arg2) {
        if (arg0 >= -89) {
            this.method2813(null, 81, null, (byte) -10);
        }
        field6814++;
        return this.field6805 == null ? 0 : this.field6805[arg1][arg2];
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
    public final int method2818(int arg0, int arg1) {
        if (arg1 != 0) {
            method2807(124, -42, null);
        }
        field6802++;
        return this.field6797[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)Lbk;")
    public static final class314 method2819(int arg0, int arg1, int arg2) {
        field6806++;
        class314 var3 = (class314) class111.field1715.method1242(arg2 ^ arg2, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class314(arg0, arg1);
            class111.field1715.method1241(var3, var3.field2524, -124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([Lha;ILjava/lang/String;II)I")
    public final int method2820(class52[] arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field6803;
        }
        field6808++;
        if (arg1 == -13791) {
            int var6 = this.method2821(class358.field4822, arg0, -1, arg2, new int[] { arg3 });
            int var7 = (var6 - 1) * arg4;
            return this.field6813 + var7 + this.field6799;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([Ljava/lang/String;[Lha;ILjava/lang/String;[I)I")
    public final int method2821(String[] arg0, class52[] arg1, int arg2, String arg3, int[] arg4) {
        field6796++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = arg2;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class228.method1452(arg3.charAt(var15), (byte) -126) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2818(var16, 0);
                    if (this.field6805 != null && var12 != -1) {
                        var17 += this.field6805[var12][var16];
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
                        var7 = var15 + 1;
                        var8 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2818(60, arg2 + 1);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2818(62, ~arg2);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2818(160, 0);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2818(173, 0);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2818(215, 0);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2818(8364, 0);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2818(169, 0);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2818(174, arg2 + 1);
                        if (this.field6805 != null && var12 != -1) {
                            var17 += this.field6805[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class547.method3122(var19.substring(4), arg2 - 126);
                            var12 = -1;
                            var17 += arg1[var20].method419();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var8 = var15;
                            var9 = var6;
                        }
                        if (arg4[var13 >= arg4.length ? arg4.length - 1 : var13] < var6) {
                            if (var8 < 0) {
                                arg0[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
                            } else {
                                arg0[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
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
        if (arg3.length() > var7) {
            arg0[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([Lha;ILjava/lang/String;I)I")
    public final int method2822(class52[] arg0, int arg1, String arg2, int arg3) {
        field6804++;
        int var5 = this.method2821(class358.field4822, arg0, -1, arg2, new int[] { arg3 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2811(arg0, class358.field4822[var7], 99);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        if (arg1 != 28353) {
            this.method2821(null, null, 101, null, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "([B)V")
    public class483(byte[] arg0) {
        class11 var2 = new class11(arg0);
        int var3 = var2.method110((byte) 92);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method110((byte) 63) == 1;
        this.field6797 = new byte[256];
        var2.method75(0, 256, (byte) 103, this.field6797);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method110((byte) 27);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method110((byte) 55);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method67(65280);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method67(65280);
                    var11[var12][var16] = var15;
                }
            }
            this.field6805 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6805[var13][var14] = (byte) class351.method2107(var13, var14, var11, 2, var7, var5, this.field6797, var9);
                        }
                    }
                }
            }
            this.field6803 = var5[32] + var7[32];
        } else {
            this.field6803 = var2.method110((byte) 57);
        }
        var2.method110((byte) 49);
        var2.method110((byte) 24);
        this.field6799 = var2.method110((byte) 49);
        this.field6813 = var2.method110((byte) 87);
    }
}
