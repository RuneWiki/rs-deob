import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class216 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[B")
    private byte[] field2625;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[[B")
    private byte[][] field2622;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
    public static boolean field2637 = false;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lcea;")
    public static class180 field2627 = new class180("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lsw;")
    public static class641 field2638 = new class641(8);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lgd;")
    public static class284 field2639;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient;")
    public static client field2633;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(CBI)I", line = 4)
    public final int method1236(char arg0, byte arg1, int arg2) {
        field2631++;
        if (arg1 != -105) {
            field2627 = null;
        }
        return this.field2622 == null ? 0 : this.field2622[arg2][arg0];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 19)
    public static void method1237(byte arg0) {
        if (arg0 <= 13) {
            field2633 = null;
        }
        field2639 = null;
        field2633 = null;
        field2627 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lha;ILjava/lang/String;)I", line = 34)
    public final int method1238(int arg0, class52[] arg1, int arg2, String arg3) {
        field2621++;
        int var5 = this.method1242(arg3, class356.field4683, arg1, (byte) 85, new int[] { arg0 });
        int var6 = 0;
        if (arg2 != 19635) {
            this.method1238(31, null, 82, null);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1244(class356.field4683[var7], arg1, true);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lha;IBLjava/lang/String;I)I", line = 66)
    public final int method1239(class52[] arg0, int arg1, byte arg2, String arg3, int arg4) {
        field2628++;
        if (arg1 == 0) {
            arg1 = this.field2632;
        }
        int var6 = this.method1242(arg3, class356.field4683, arg0, (byte) 66, new int[] { arg4 });
        int var7 = (var6 - 1) * arg1;
        if (arg2 < 69) {
            this.method1238(74, null, 113, null);
        }
        return this.field2634 + var7 + this.field2624;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I", line = 87)
    public final int method1240(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method1242(null, null, null, (byte) -58, null);
        }
        field2623++;
        return this.field2625[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 101)
    public final int method1241(String arg0, byte arg1) {
        if (arg1 != 0) {
            this.method1244(null, null, true);
        }
        field2636++;
        return this.method1244(arg0, null, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[Lha;B[I)I", line = 117)
    public final int method1242(String arg0, String[] arg1, class52[] arg2, byte arg3, int[] arg4) {
        field2630++;
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
        int var15 = 0;
        if (arg3 < 4) {
            this.field2625 = null;
        }
        while (var14 > var15) {
            int var16 = class313.method1736(arg0.charAt(var15), (byte) -110) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                label170: {
                    int var18;
                    if (var11 == -1) {
                        var17 += this.method1240(255, var16);
                        var18 = var15;
                        if (this.field2622 != null && var12 != -1) {
                            var17 += this.field2622[var12][var16];
                        }
                        var12 = var16;
                    } else {
                        if (var16 != 62) {
                            break label170;
                        }
                        var18 = var11;
                        String var19 = arg0.substring(var11 + 1, var15);
                        var11 = -1;
                        if (var19.equals("br")) {
                            arg1[var13] = arg0.substring(var7, var15 + 1);
                            var13++;
                            if (arg1.length <= var13) {
                                return 0;
                            }
                            var7 = var15 + 1;
                            var12 = -1;
                            var6 = 0;
                            var8 = -1;
                            break label170;
                        }
                        if (var19.equals("lt")) {
                            var17 += this.method1240(255, 60);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals("gt")) {
                            var17 += this.method1240(255, 62);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals("nbsp")) {
                            var17 += this.method1240(255, 160);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals("shy")) {
                            var17 += this.method1240(255, 173);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals("times")) {
                            var17 += this.method1240(255, 215);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals("euro")) {
                            var17 += this.method1240(255, 8364);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals("copy")) {
                            var17 += this.method1240(255, 169);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals("reg")) {
                            var17 += this.method1240(255, 174);
                            if (this.field2622 != null && var12 != -1) {
                                var17 += this.field2622[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith("img=") && arg2 != null) {
                            try {
                                int var20 = class232.method1325(var19.substring(4), 0);
                                var12 = -1;
                                var17 += arg2[var20].method292();
                            } catch (Exception var21) {
                            }
                        }
                        var16 = -1;
                    }
                    if (var17 > 0) {
                        var6 += var17;
                        if (arg4 != null) {
                            if (var16 == 32) {
                                var9 = var6;
                                var10 = 1;
                                var8 = var15;
                            }
                            if (arg4[arg4.length > var13 ? var13 : arg4.length - 1] < var6) {
                                if (var8 >= 0) {
                                    arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (var13 >= arg1.length) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var8 = -1;
                                    var12 = -1;
                                    var6 -= var9;
                                } else {
                                    arg1[var13] = arg0.substring(var7, var18);
                                    var13++;
                                    if (arg1.length <= var13) {
                                        return 0;
                                    }
                                    var12 = -1;
                                    var6 = var17;
                                    var8 = -1;
                                    var7 = var18;
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
            var15++;
        }
        if (arg0.length() > var7) {
            arg1[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;[Lha;I)Ljava/lang/String;", line = 370)
    public final String method1243(int arg0, String arg1, class52[] arg2, int arg3) {
        field2635++;
        if (this.method1244(arg1, arg2, true) <= arg3) {
            return arg1;
        }
        int var5 = arg3 - this.method1244("...", null, true);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        if (arg0 <= 90) {
            this.method1236((char) 65521, (byte) -88, -40);
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
                                    int var14 = class232.method1325(var13.substring(4), 0);
                                    var7 = -1;
                                    var8 += arg2[var14].method292();
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
                    var8 += this.field2625[class313.method1736(var12, (byte) -110) & 0xFF] & 0xFF;
                    if (this.field2622 != null && var7 != -1) {
                        var8 += this.field2622[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2622 != null) {
                        var15 = this.field2622[var12][46] + var8;
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;[Lha;Z)I", line = 492)
    public final int method1244(String arg0, class52[] arg1, boolean arg2) {
        field2629++;
        if (arg0 == null) {
            return 0;
        } else if (arg2) {
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
                                if (var10.startsWith("img=") && arg1 != null) {
                                    try {
                                        int var11 = class232.method1325(var10.substring(4), 0);
                                        var5 = -1;
                                        var6 += arg1[var11].method292();
                                    } catch (Exception var12) {
                                    }
                                }
                                continue;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field2625[class313.method1736(var9, (byte) -110) & 0xFF] & 0xFF;
                        if (this.field2622 != null && var5 != -1) {
                            var6 += this.field2622[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Z[Lha;I)I", line = 599)
    public final int method1245(String arg0, boolean arg1, class52[] arg2, int arg3) {
        if (arg1) {
            return -105;
        } else {
            field2626++;
            return this.method1242(arg0, class356.field4683, arg2, (byte) 22, new int[] { arg3 });
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V", line = 615)
    public class216(byte[] arg0) {
        class374 var2 = new class374(arg0);
        int var3 = var2.method2129(-94);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2129(-106) == 1;
        this.field2625 = new byte[256];
        var2.method2147(this.field2625, (byte) 65, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2129(-127);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2129(-106);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2124(120);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2124(119);
                    var11[var12][var16] = var15;
                }
            }
            this.field2622 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2622[var13][var14] = (byte) class531.method3038(var7, var11, var9, var13, this.field2625, 112, var5, var14);
                        }
                    }
                }
            }
            this.field2632 = var7[32] + var5[32];
        } else {
            this.field2632 = var2.method2129(-119);
        }
        var2.method2129(-120);
        var2.method2129(-90);
        this.field2634 = var2.method2129(-74);
        this.field2624 = var2.method2129(-106);
    }
}
