import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class class175 {

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Lpe;")
    private class391 field2583;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Lvm;")
    private class323 field2601;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Z")
    public static boolean field2586 = false;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    private static int field2590 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method804(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method1299(int arg0, int arg1, String arg2) {
        field2591++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var8 = arg2.charAt(var6);
            if (var8 == '<') {
                var5 = true;
            } else if (var8 == '>') {
                var5 = false;
            } else if (!var5 && var8 == ' ') {
                var4++;
            }
        }
        int var7 = -121 % ((arg0 + 36) / 54);
        if (var4 > 0) {
            class385.field5431 = (arg1 - this.field2601.method2060(arg2, (byte) 79) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(CIIIZLvj;II)V")
    public abstract void method806(char arg0, int arg1, int arg2, int arg3, boolean arg4, class179 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZIILjava/lang/String;)V")
    public final void method1300(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5) {
        field2580++;
        if (arg5 != null) {
            this.method1313(arg0, 0, arg1);
            this.method1302((int[]) null, arg5, (class80[]) null, 0, 0, arg3, (class179) null, arg2, arg4 - this.field2601.method2060(arg5, (byte) 74));
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III[IZ[Lkb;Ljava/lang/String;I)V")
    public final void method1301(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, class80[] arg5, String arg6, int arg7) {
        field2600++;
        if (arg4 && arg6 != null) {
            this.method1313(arg1, 0, arg2);
            this.method1302(arg3, arg6, arg5, 0, 0, arg7, (class179) null, false, arg0 - (this.field2601.method2060(arg6, (byte) 41) / 2));
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([ILjava/lang/String;[Lkb;IIILvj;ZI)V")
    private final void method1302(int[] arg0, String arg1, class80[] arg2, int arg3, int arg4, int arg5, class179 arg6, boolean arg7, int arg8) {
        int var10 = arg5 - this.field2601.field4383;
        field2593++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        if (arg7) {
            this.method1301(-93, -13, 59, (int[]) null, false, (class80[]) null, (String) null, 108);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class286.method1798(87, arg1.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg1.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class362.method2277(var16.substring(4), -77);
                                    class80 var18 = arg2[var17];
                                    int var19 = arg0 == null ? var18.method739() : arg0[var17];
                                    if ((class284.field3802 & 0xFF000000) == -16777216) {
                                        var18.method730(arg8, this.field2601.field4383 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method730(arg8, this.field2601.field4383 + var10 - var19, 1, class284.field3802 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg8 += arg2[var17].method740();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1308(var16, -25292);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field2601.method2054(var12, (byte) 121, var15);
                    }
                    if (var15 == ' ') {
                        if (class385.field5431 > 0) {
                            class1.field8 += class385.field5431;
                            arg8 += class1.field8 >> 8;
                            class1.field8 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class138.field1942 & 0xFF000000) != 0) {
                            this.method804(var15, arg8 + 1, var10 + 1, class138.field1942, true);
                        }
                        this.method804(var15, arg8, var10, class284.field3802, false);
                    } else {
                        if ((class138.field1942 & 0xFF000000) != 0) {
                            this.method806(var15, arg8 + 1, var10 - -1, class138.field1942, true, arg6, arg3, arg4);
                        }
                        this.method806(var15, arg8, var10, class284.field3802, false, arg6, arg3, arg4);
                    }
                    int var20 = this.field2601.method2047(var15, -118);
                    if (class53.field868 != -1) {
                        this.field2583.method2411(arg8, var20, (int) ((double) this.field2601.field4383 * 0.7D) + var10, class53.field868, true);
                    }
                    if (class395.field5540 != -1) {
                        this.field2583.method2411(arg8, var20, this.field2601.field4383 + var10 + 1, class395.field5540, true);
                    }
                    var12 = var15;
                    arg8 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1303(int arg0, int arg1, int arg2, int arg3) {
        if (!class176.method1318(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class91.field1351[arg0].method1509(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class128.field1814) {
                    if (!class10.method51(var4, var6, var5)) {
                        return false;
                    }
                    if (!class10.method51(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method51(var4, var7, var5)) {
                        return false;
                    }
                    if (!class10.method51(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class10.method51(var4, var8, var5)) {
                    return false;
                }
                if (!class10.method51(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class81.field1200) {
                    if (!class10.method51(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class10.method51(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method51(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class10.method51(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class10.method51(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class10.method51(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class128.field1814) {
                    if (!class10.method51(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class10.method51(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method51(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class10.method51(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class10.method51(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class10.method51(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class81.field1200) {
                    if (!class10.method51(var4, var6, var5)) {
                        return false;
                    }
                    if (!class10.method51(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method51(var4, var7, var5)) {
                        return false;
                    }
                    if (!class10.method51(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class10.method51(var4, var8, var5)) {
                    return false;
                }
                if (!class10.method51(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class10.method51(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class10.method51(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class10.method51(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class10.method51(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class10.method51(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method1304(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        if (arg1 > -66) {
            method1307((byte) 123);
        }
        field2595++;
        if (arg5 == null) {
            return;
        }
        this.method1313(arg3, 0, arg7);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method1306((int[]) null, var12, (int[]) null, arg0, arg2 - (this.field2601.method2060(arg5, (byte) 115) / 2), 128, (class80[]) null, arg5);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB[ILjava/util/Random;Ljava/lang/String;I[Lkb;III)I")
    public final int method1305(int arg0, byte arg1, int[] arg2, Random arg3, String arg4, int arg5, class80[] arg6, int arg7, int arg8, int arg9) {
        field2587++;
        if (arg4 == null) {
            return 0;
        }
        arg3.setSeed((long) arg7);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1313(var11 << 24 | arg0 & 0xFFFFFF, 0, arg8 & 0xFFFFFF | var11 << 24);
        int var12 = arg4.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg1 < 124) {
            this.field2583 = null;
        }
        this.method1306(var13, (int[]) null, arg2, arg9, arg5, 128, arg6, arg4);
        return var14;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([I[I[IIII[Lkb;Ljava/lang/String;)V")
    private final void method1306(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, class80[] arg6, String arg7) {
        field2584++;
        int var9 = arg3 - this.field2601.field4383;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        if (arg5 != 128) {
            this.method1305(-69, (byte) 118, (int[]) null, (Random) null, (String) null, -40, (class80[]) null, -51, 12, -54);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class286.method1798(103, arg7.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class362.method2277(var16.substring(4), -59);
                                    class80 var20 = arg6[var19];
                                    int var21 = arg2 == null ? var20.method739() : arg2[var19];
                                    var20.method730(arg4 + var17, -var21 + this.field2601.field4383 + var9 + var18, 0, 0, 1);
                                    var11 = -1;
                                    arg4 += arg6[var19].method740();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1308(var16, -25292);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field2601.method2054(var11, (byte) -85, var15);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class138.field1942 & 0xFF000000) != 0) {
                            this.method804(var15, arg4 + var22 + 1, var9 + 1 + var23, class138.field1942, true);
                        }
                        this.method804(var15, arg4 + var22, var9 - -var23, class284.field3802, false);
                    } else if (class385.field5431 > 0) {
                        class1.field8 += class385.field5431;
                        arg4 += class1.field8 >> 8;
                        class1.field8 &= 0xFF;
                    }
                    int var24 = this.field2601.method2047(var15, -108);
                    if (class53.field868 != -1) {
                        this.field2583.method2411(arg4, var24, (int) ((double) this.field2601.field4383 * 0.7D) + var9, class53.field868, true);
                    }
                    if (class395.field5540 != -1) {
                        this.field2583.method2411(arg4, var24, this.field2601.field4383 + var9, class395.field5540, true);
                    }
                    arg4 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public static final void method1307(byte arg0) {
        field2596++;
        class276.field3719 = null;
        class434.field6179 = false;
        class323.field4388 = null;
        class88.field1306 = null;
        class64.field971 = null;
        class172.field2522 = null;
        class125.method973(0);
        if (arg0 <= 81) {
            field2590 = -115;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1308(String arg0, int arg1) {
        field2588++;
        if (arg1 != -25292) {
            field2590 = 49;
        }
        try {
            if (arg0.startsWith("col=")) {
                class284.field3802 = class284.field3802 & 0xFF000000 | class374.method2336((byte) -109, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class284.field3802 = class192.field2770 & 0xFFFFFF | class284.field3802 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class284.field3802 = class374.method2336((byte) -126, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class284.field3802 = class192.field2770;
            } else if (arg0.startsWith("str=")) {
                class53.field868 = class374.method2336((byte) -88, arg0.substring(4), 16) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class53.field868 = -8388608;
            } else if (arg0.equals("/str")) {
                class53.field868 = -1;
            } else if (arg0.startsWith("u=")) {
                class395.field5540 = class374.method2336((byte) -87, arg0.substring(2), 16) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class395.field5540 = -16777216;
            } else if (arg0.equals("/u")) {
                class395.field5540 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class138.field1942 = 0;
            } else if (arg0.startsWith("shad=")) {
                class138.field1942 = class374.method2336((byte) -117, arg0.substring(5), 16) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class138.field1942 = -16777216;
            } else if (arg0.equals("/shad")) {
                class138.field1942 = field2590;
                return;
            } else if (arg0.equals("br")) {
                this.method1313(class192.field2770, 0, field2590);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;BIII)V")
    public final void method1309(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2581++;
        if (arg1 == null) {
            return;
        }
        this.method1313(arg3, 0, arg0);
        this.method1302((int[]) null, arg1, (class80[]) null, 0, 0, arg4, (class179) null, false, arg5 - (this.field2601.method2060(arg1, (byte) 48) / 2));
        if (arg2 != 106) {
            this.field2583 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLjava/lang/String;IIIII[I[Lkb;Ljava/util/Random;[IIII)I")
    public final int method1310(int arg0, byte arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, class80[] arg9, Random arg10, int[] arg11, int arg12, int arg13, int arg14) {
        field2597++;
        if (arg2 == null) {
            return 0;
        } else if (arg1 > -17) {
            return 77;
        } else {
            arg10.setSeed((long) arg14);
            int var16 = (arg10.nextInt() & 0x1F) + 192;
            this.method1313(arg12 & 0xFFFFFF | var16 << 24, 0, arg13 & 0xFFFFFF | var16 << 24);
            int var17 = arg2.length();
            int[] var18 = new int[var17];
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                var18[var20] = var19;
                if ((arg10.nextInt() & 0x3) == 0) {
                    var19++;
                }
            }
            int var21 = arg0;
            int var22 = this.field2601.field4389 + arg5;
            int var23 = -1;
            if (arg6 == 1) {
                var22 += (arg4 - this.field2601.field4376 - this.field2601.field4389) / 2;
            } else if (arg6 == 2) {
                var22 = arg5 + arg4 - this.field2601.field4376;
            }
            if (arg3 == 1) {
                var23 = var19 + this.field2601.method2060(arg2, (byte) 50);
                var21 = (arg7 - var23) / 2 + arg0;
            } else if (arg3 == 2) {
                var23 = var19 + this.field2601.method2060(arg2, (byte) 74);
                var21 = arg7 + arg0 - var23;
            }
            this.method1306(var18, (int[]) null, arg8, var22, var21, 128, arg9, arg2);
            if (arg11 != null) {
                if (var23 == -1) {
                    var23 = this.field2601.method2060(arg2, (byte) 124) + var19;
                }
                arg11[2] = var23;
                arg11[1] = var22 - this.field2601.field4389;
                arg11[0] = var21;
                arg11[3] = this.field2601.field4389 + this.field2601.field4376;
            }
            return var19;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([Lkb;Ljava/lang/String;IIII[II)V")
    public final void method1311(class80[] arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field2589++;
        if (arg1 == null) {
            return;
        }
        this.method1313(arg3, 0, arg7);
        this.method1302(arg6, arg1, arg0, 0, 0, arg4, (class179) null, false, arg5);
        if (arg2 >= -83) {
            field2586 = true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1312(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field2594++;
        if (arg3 == null) {
            return;
        }
        this.method1313(arg4, 0, arg0);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1306((int[]) null, var9, (int[]) null, arg1, arg2 - (this.field2601.method2060(arg3, (byte) 93) / arg6), arg6 + 126, (class80[]) null, arg3);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
    private final void method1313(int arg0, int arg1, int arg2) {
        class1.field8 = arg1;
        class53.field868 = -1;
        class385.field5431 = 0;
        field2585++;
        class192.field2770 = arg0;
        class284.field3802 = arg0;
        class395.field5540 = -1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        field2590 = arg2;
        class138.field1942 = arg2;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1314(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field2582++;
        int var7 = -58 / ((arg3 - 76) / 37);
        if (arg2 != null) {
            this.method1313(arg1, 0, arg5);
            this.method1302((int[]) null, arg2, (class80[]) null, 0, 0, arg4, (class179) null, false, arg0);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII[IBIIILvj;III[Lkb;Ljava/lang/String;I)I")
    public final int method1315(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6, int arg7, int arg8, class179 arg9, int arg10, int arg11, int arg12, class80[] arg13, String arg14, int arg15) {
        field2598++;
        if (arg14 == null) {
            return 0;
        }
        this.method1313(arg10, 0, arg1);
        if (arg15 == 0) {
            arg15 = this.field2601.field4383;
        }
        int[] var17;
        if (arg6 < (this.field2601.field4389 - (-this.field2601.field4376 - arg15)) && arg6 < arg15 + arg15) {
            var17 = null;
        } else {
            var17 = new int[] { arg11 };
        }
        if (arg5 > -90) {
            return 2;
        }
        int var18 = this.field2601.method2048((byte) 58, arg14, class290.field3942, arg13, var17);
        if (arg7 == 3 && var18 == 1) {
            arg7 = 1;
        }
        int var19;
        if (arg7 == 0) {
            var19 = this.field2601.field4389 + arg12;
        } else if (arg7 == 1) {
            var19 = arg12 + this.field2601.field4389 + ((arg6 - this.field2601.field4376 + -((var18 + -1) * arg15) + -this.field2601.field4389) / 2);
        } else if (arg7 == 2) {
            var19 = arg6 + arg12 - ((var18 + -1) * arg15) - this.field2601.field4376;
        } else {
            int var20 = (arg6 - (var18 - 1) * arg15 - this.field2601.field4389 - this.field2601.field4376) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = this.field2601.field4389 + arg12 + var20;
            arg15 += var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg3 == 0) {
                this.method1302(arg4, class290.field3942[var21], arg13, arg8, arg0, var19, arg9, false, arg2);
            } else if (arg3 == 1) {
                this.method1302(arg4, class290.field3942[var21], arg13, arg8, arg0, var19, arg9, false, arg2 + (arg11 - this.field2601.method2060(class290.field3942[var21], (byte) 81)) / 2);
            } else if (arg3 == 2) {
                this.method1302(arg4, class290.field3942[var21], arg13, arg8, arg0, var19, arg9, false, arg11 + arg2 - this.field2601.method2060(class290.field3942[var21], (byte) 58));
            } else if (var18 - 1 == var21) {
                this.method1302(arg4, class290.field3942[var21], arg13, arg8, arg0, var19, arg9, false, arg2);
            } else {
                this.method1299(-97, arg11, class290.field3942[var21]);
                this.method1302(arg4, class290.field3942[var21], arg13, arg8, arg0, var19, arg9, false, arg2);
                class385.field5431 = 0;
            }
            var19 += arg15;
        }
        return var18;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III[Lkb;Ljava/lang/String;II[I)V")
    public final void method1316(int arg0, int arg1, int arg2, class80[] arg3, String arg4, int arg5, int arg6, int[] arg7) {
        field2599++;
        if (arg0 < -125 && arg4 != null) {
            this.method1313(arg5, 0, arg2);
            this.method1302(arg7, arg4, arg3, 0, 0, arg6, (class179) null, false, arg1 - this.field2601.method2060(arg4, (byte) 52));
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
    public final void method1317(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2592++;
        if (arg1 == null) {
            return;
        }
        this.method1313(arg6, 0, arg4);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3 > -92) {
            this.field2583 = null;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1306(var9, var10, (int[]) null, arg2, arg0 - (this.field2601.method2060(arg1, (byte) 107) / 2), 128, (class80[]) null, arg1);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lpe;Lvm;)V")
    public class175(class391 arg0, class323 arg1) {
        this.field2583 = arg0;
        this.field2601 = arg1;
    }
}
