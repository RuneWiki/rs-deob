import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class502 {

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "[B")
    private byte[] field7289;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public int field7298;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "[[B")
    private byte[][] field7288;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public int field7292;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public int field7295;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field7297 = -1;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Llc;")
    public static class435 field7284 = new class435(36, 2);

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "Z")
    public static boolean field7304 = false;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "Lgr;")
    public static class530 field7303 = new class530(73, 3);

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLcs;Z)V")
    public static final void method3056(byte arg0, class335 arg1, boolean arg2) {
        field7290++;
        class83 var3 = arg1.method2052(-5569);
        if (arg1.field4637 == 0) {
            arg1.field4643 = 0;
            class235.field3517 = -1;
            class465.field6624 = 0;
            return;
        }
        if (arg1.field4545 != -1 && arg1.field4535 == 0) {
            class131 var4 = class610.field8698.method2999(arg1.field4545, false);
            if (arg1.field4641 > 0 && var4.field1795 == 0) {
                class235.field3517 = -1;
                arg1.field4643++;
                class465.field6624 = 0;
                return;
            }
            if (arg1.field4641 <= 0 && var4.field1788 == 0) {
                class465.field6624 = 0;
                arg1.field4643++;
                class235.field3517 = -1;
                return;
            }
        }
        if (arg1.field4547 != -1 && class703.field9918 >= arg1.field4587) {
            class365 var5 = class596.field8476.method2263(arg1.field4547, -113);
            if (var5.field5345 && var5.field5332 != -1) {
                class131 var6 = class610.field8698.method2999(var5.field5332, false);
                if (arg1.field4641 > 0 && var6.field1795 == 0) {
                    arg1.field4643++;
                    class465.field6624 = 0;
                    class235.field3517 = -1;
                    return;
                }
                if (arg1.field4641 <= 0 && var6.field1788 == 0) {
                    class235.field3517 = -1;
                    arg1.field4643++;
                    class465.field6624 = 0;
                    return;
                }
            }
        }
        if (arg1.field4547 != -1 && arg1.field4587 <= class703.field9918) {
            class365 var7 = class596.field8476.method2263(arg1.field4547, -120);
            if (var7.field5345 && var7.field5332 != -1) {
                class131 var8 = class610.field8698.method2999(var7.field5332, false);
                if (arg1.field4641 > 0 && var8.field1795 == 0) {
                    class235.field3517 = -1;
                    class465.field6624 = 0;
                    arg1.field4643++;
                    return;
                }
                if (arg1.field4641 <= 0 && var8.field1788 == 0) {
                    arg1.field4643++;
                    class465.field6624 = 0;
                    class235.field3517 = -1;
                    return;
                }
            }
        }
        int var9 = arg1.field3923;
        int var10 = arg1.field3916;
        int var11 = arg1.field4646[arg1.field4637 - 1] * 512 + (arg1.method2053(true) * 256);
        int var12 = arg1.field4645[arg1.field4637 - 1] * 512 + arg1.method2053(true) * 256;
        if (var11 <= var9) {
            if (var9 > var11) {
                if (var10 < var12) {
                    arg1.method2059(6144, false);
                } else if (var10 <= var12) {
                    arg1.method2059(4096, false);
                } else {
                    arg1.method2059(2048, false);
                }
            } else if (var10 < var12) {
                arg1.method2059(8192, false);
            } else if (var12 < var10) {
                arg1.method2059(0, false);
            }
        } else if (var10 < var12) {
            arg1.method2059(10240, false);
        } else if (var10 <= var12) {
            arg1.method2059(12288, false);
        } else {
            arg1.method2059(14336, false);
        }
        byte var13 = arg1.field4642[arg1.field4637 - 1];
        if (!arg2 && var11 - var9 > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || (var12 - var10) < -1024) {
            arg1.field3916 = var12;
            arg1.field3923 = var11;
            arg1.method2061((byte) 116, arg1.field4538, false);
            arg1.field4637--;
            class235.field3517 = -1;
            class465.field6624 = 0;
            if (arg1.field4641 > 0) {
                arg1.field4641--;
            }
            return;
        }
        if (arg0 != 107) {
            method3058(30, 0.3471536617647735D);
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg1 instanceof class571) {
            var15 = ((class571) arg1).field8235.field7519;
        }
        if (var15) {
            int var16 = arg1.field4538 - arg1.field4598.field4729;
            if (var16 != 0 && arg1.field4576 == -1 && arg1.field4571 != 0) {
                var14 = 8;
            }
            if (!arg2 && arg1.field4637 > 2) {
                var14 = 24;
            }
            if (!arg2 && arg1.field4637 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg2 && arg1.field4637 > 1) {
                var14 = 24;
            }
            if (!arg2 && arg1.field4637 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field4643 > 0 && arg1.field4637 > 1) {
            arg1.field4643--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field1210 != -1) {
            int var17 = var14 << 9;
            if (arg1.field4637 == 1) {
                int var18 = arg1.field4644 * arg1.field4644;
                int var19 = (var11 < arg1.field3923 ? arg1.field3923 - var11 : -arg1.field3923 + var11) << 9;
                int var20 = (arg1.field3916 <= var12 ? var12 - arg1.field3916 : -var12 + arg1.field3916) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var21 * 2 * var3.field1210;
                if (var22 < var18) {
                    arg1.field4644 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg1.field4644 -= var3.field1210;
                    if (arg1.field4644 < 0) {
                        arg1.field4644 = 0;
                    }
                } else if (arg1.field4644 < var17) {
                    arg1.field4644 += var3.field1210;
                    if (arg1.field4644 > var17) {
                        arg1.field4644 = var17;
                    }
                }
            } else if (var17 > arg1.field4644) {
                arg1.field4644 += var3.field1210;
                if (var17 < arg1.field4644) {
                    arg1.field4644 = var17;
                }
            } else if (arg1.field4644 > 0) {
                arg1.field4644 -= var3.field1210;
                if (arg1.field4644 < 0) {
                    arg1.field4644 = 0;
                }
            }
            var14 = arg1.field4644 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class465.field6624 = 0;
        if (var9 == var11 && var10 == var12) {
            class235.field3517 = -1;
        } else {
            if (var11 > var9) {
                class465.field6624 |= 0x4;
                arg1.field3923 += var14;
                if (arg1.field3923 > var11) {
                    arg1.field3923 = var11;
                }
            } else if (var11 < var9) {
                arg1.field3923 -= var14;
                class465.field6624 |= 0x8;
                if (arg1.field3923 < var11) {
                    arg1.field3923 = var11;
                }
            }
            if (var10 < var12) {
                class465.field6624 |= 0x1;
                arg1.field3916 += var14;
                if (var12 < arg1.field3916) {
                    arg1.field3916 = var12;
                }
            } else if (var12 < var10) {
                arg1.field3916 -= var14;
                class465.field6624 |= 0x2;
                if (var12 > arg1.field3916) {
                    arg1.field3916 = var12;
                }
            }
            if (var14 < 32) {
                class235.field3517 = var13;
            } else {
                class235.field3517 = 2;
            }
        }
        if (arg1.field3923 == var11 && arg1.field3916 == var12) {
            if (arg1.field4641 > 0) {
                arg1.field4641--;
            }
            arg1.field4637--;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method3057(int arg0) {
        if (arg0 > 85) {
            field7284 = null;
            field7303 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ID)V")
    public static final void method3058(int arg0, double arg1) {
        if (arg0 != -1) {
            method3058(-74, -0.8937393623952219D);
        }
        field7299++;
        if (class161.field2311 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class280.field3928[var3] = var4 <= 255 ? var4 : 255;
        }
        class161.field2311 = arg1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;[Ltd;I)I")
    public final int method3059(int arg0, String arg1, class515[] arg2, int arg3) {
        if (arg3 == 160) {
            field7300++;
            return this.method3064(new int[] { arg0 }, arg1, class567.field8201, 0, arg2);
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
    public static final void method3060(int arg0, int[] arg1, Object[] arg2) {
        field7294++;
        if (arg0 > -74) {
            field7303 = null;
        }
        class510.method3103(arg2, arg1.length - 1, 255, 0, arg1);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljw;)V")
    public static final void method3061(class280 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class355.field5248[var1]; var2++) {
                if (class132.field1818[var1][var2] == arg0) {
                    class85.method680(class132.field1818[var1], var2 + 1, class132.field1818[var1], var2, class355.field5248[var1] - var2 - 1);
                    var10002 = class355.field5248[var1]--;
                    class235.field3518 = true;
                    return;
                }
            }
            for (int var3 = 0; var3 < class575.field8273[var1]; var3++) {
                if (class499.field7174[var1][var3] == arg0) {
                    class85.method680(class499.field7174[var1], var3 + 1, class499.field7174[var1], var3, class575.field8273[var1] - var3 - 1);
                    var10002 = class575.field8273[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class145.field1963[var1]; var4++) {
                if (class399.field5714[var1][var4] == arg0) {
                    class85.method680(class399.field5714[var1], var4 + 1, class399.field5714[var1], var4, class145.field1963[var1] - var4 - 1);
                    var10002 = class145.field1963[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ICB)I")
    public final int method3062(int arg0, char arg1, byte arg2) {
        if (arg2 > -49) {
            method3057(24);
        }
        field7287++;
        return this.field7288 == null ? 0 : this.field7288[arg0][arg1];
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method3063(int arg0, String arg1) {
        field7296++;
        if (arg0 != 0) {
            this.method3070(122, null, null, -115);
        }
        return this.method3066(null, arg1, (byte) 20);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([ILjava/lang/String;[Ljava/lang/String;I[Ltd;)I")
    public final int method3064(int[] arg0, String arg1, String[] arg2, int arg3, class515[] arg4) {
        field7286++;
        if (arg1 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = arg3;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class594.method3483(arg1.charAt(var15), (byte) -117) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method3068(255, var16);
                    if (this.field7288 != null && var12 != -1) {
                        var17 += this.field7288[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg1.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg2[var13] = arg1.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3068(255, 60);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3068(255, 62);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3068(arg3 + 255, 160);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3068(255, 173);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3068(255, 215);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3068(255, 8364);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3068(255, 169);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3068(arg3 + 255, 174);
                        if (this.field7288 != null && var12 != -1) {
                            var17 += this.field7288[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class321.method1993(var19.substring(4), (byte) 87);
                            var17 += arg4[var20].method784();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (var6 > arg0[var13 < arg0.length ? var13 : arg0.length - 1]) {
                            if (var8 < 0) {
                                arg2[var13] = arg1.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var7 = var18;
                                var12 = -1;
                            } else {
                                arg2[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var12 = -1;
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
        if (var7 < arg1.length()) {
            arg2[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[Ltd;Ljava/lang/String;II)I")
    public final int method3065(int arg0, class515[] arg1, String arg2, int arg3, int arg4) {
        field7285++;
        if (arg3 == arg4) {
            arg3 = this.field7298;
        }
        int var6 = this.method3064(new int[] { arg0 }, arg2, class567.field8201, 0, arg1);
        int var7 = (var6 - 1) * arg3;
        return this.field7295 + this.field7292 + var7;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([Ltd;Ljava/lang/String;B)I")
    public final int method3066(class515[] arg0, String arg1, byte arg2) {
        field7301++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg2 <= 13) {
            this.method3064(null, null, null, -93, null);
        }
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
                                    int var11 = class321.method1993(var10.substring(4), (byte) 76);
                                    var5 = -1;
                                    var6 += arg0[var11].method784();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field7289[class594.method3483(var9, (byte) -117) & 0xFF] & 0xFF;
                    if (this.field7288 != null && var5 != -1) {
                        var6 += this.field7288[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;I[Ltd;)I")
    public final int method3067(int arg0, String arg1, int arg2, class515[] arg3) {
        field7291++;
        int var5 = -93 % ((69 - arg2) / 47);
        int var6 = this.method3064(new int[] { arg0 }, arg1, class567.field8201, 0, arg3);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method3066(arg3, class567.field8201[var8], (byte) 34);
            if (var9 > var7) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
    public final int method3068(int arg0, int arg1) {
        if (arg0 == 255) {
            field7302++;
            return this.field7289[arg1] & 0xFF;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "()V")
    public static final void method3069() {
        for (int var0 = class518.field7465; var0 < class433.field6202; var0++) {
            for (int var1 = 0; var1 < class439.field6264; var1++) {
                for (int var2 = 0; var2 < class408.field5806; var2++) {
                    class375 var3 = class565.field8185[var0][var1][var2];
                    if (var3 != null) {
                        class19 var4 = var3.field5431;
                        class19 var5 = var3.field5427;
                        if (var4 != null && var4.method715(-12888)) {
                            class87.method689(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method715(-12888)) {
                                class87.method689(var5, var0, var1, var2, 1, 1);
                                var5.method711(0, var4, class391.field5644, (byte) 35, 0, false, 0);
                                var5.method713(-16221);
                            }
                            var4.method713(-16221);
                        }
                        for (class208 var6 = var3.field5425; var6 != null; var6 = var6.field3146) {
                            class638 var8 = var6.field3144;
                            if (var8 != null && var8.method715(-12888)) {
                                class87.method689(var8, var0, var1, var2, var8.field9036 + 1 - var8.field9038, var8.field9042 - var8.field9035 + 1);
                                var8.method713(-16221);
                            }
                        }
                        class644 var7 = var3.field5422;
                        if (var7 != null && var7.method715(-12888)) {
                            class469.method2835(var7, var0, var1, var2);
                            var7.method713(-16221);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[Ltd;Ljava/lang/String;I)Ljava/lang/String;")
    public final String method3070(int arg0, class515[] arg1, String arg2, int arg3) {
        field7293++;
        if (arg0 >= this.method3066(arg1, arg2, (byte) 109)) {
            return arg2;
        }
        int var5 = arg0 - this.method3066(null, "...", (byte) 115);
        int var6 = -1;
        int var7 = -1;
        if (arg3 != 7725) {
            this.field7288 = null;
        }
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class321.method1993(var13.substring(4), (byte) 83);
                                    var7 = -1;
                                    var8 += arg1[var14].method784();
                                    if (var5 < var8) {
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
                    var8 += this.field7289[class594.method3483(var12, (byte) -117) & 0xFF] & 0xFF;
                    if (this.field7288 != null && var7 != -1) {
                        var8 += this.field7288[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field7288 != null) {
                        var15 = this.field7288[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([B)V")
    public class502(byte[] arg0) {
        class479 var2 = new class479(arg0);
        int var3 = var2.method2886(true);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2886(true) == 1;
        this.field7289 = new byte[256];
        var2.method2867(-290150072, this.field7289, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2886(true);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2886(true);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2915(-107);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2915(-121);
                    var11[var12][var16] = var15;
                }
            }
            this.field7288 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field7288[var13][var14] = (byte) class503.method3072(var9, (byte) -121, this.field7289, var5, var6, var14, var11, var13);
                        }
                    }
                }
            }
            this.field7298 = var5[32] + var6[32];
        } else {
            this.field7298 = var2.method2886(true);
        }
        var2.method2886(true);
        var2.method2886(true);
        this.field7292 = var2.method2886(true);
        this.field7295 = var2.method2886(true);
    }
}
