import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class306 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lkt;")
    private class61 field4141;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lza;")
    private class295 field4148;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field4142 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4154 = 0;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lhi;")
    public static class45 field4147 = new class45(20, 6);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Ldk;")
    public static class421 field4155;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[Lo;")
    public static class359[] field4149;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lo;ILjava/lang/String;[IIILta;B)V")
    private final void method1758(int arg0, class359[] arg1, int arg2, String arg3, int[] arg4, int arg5, int arg6, class336 arg7, byte arg8) {
        int var10 = arg0 - this.field4141.field885;
        field4138++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class355.method2125(-15205, arg3.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg3.substring(var11 + 1, var14);
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
                                    int var17 = class410.method2405(-124, var16.substring(4));
                                    class359 var18 = arg1[var17];
                                    int var19 = arg4 == null ? var18.method207() : arg4[var17];
                                    if ((class528.field7714 & 0xFF000000) == -16777216) {
                                        var18.method215(arg2, this.field4141.field885 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method215(arg2, this.field4141.field885 + var10 - var19, 0, class528.field7714 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg2 += arg1[var17].method204();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1771(var16, 4);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg2 += this.field4141.method409((byte) -78, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class41.field610 > 0) {
                            class255.field3475 += class41.field610;
                            arg2 += class255.field3475 >> 8;
                            class255.field3475 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class143.field2125 & 0xFF000000) != 0) {
                            this.method344(var15, arg2 + 1, var10 - -1, class143.field2125, true);
                        }
                        this.method344(var15, arg2, var10, class528.field7714, false);
                    } else {
                        if ((class143.field2125 & 0xFF000000) != 0) {
                            this.method343(var15, arg2 + 1, var10 - -1, class143.field2125, true, arg7, arg5, arg6);
                        }
                        this.method343(var15, arg2, var10, class528.field7714, false, arg7, arg5, arg6);
                    }
                    int var20 = this.field4141.method415(var15, (byte) 1);
                    if (class58.field828 != -1) {
                        this.field4148.method1711((byte) 121, var20, class58.field828, (int) ((double) this.field4141.field885 * 0.7D) + var10, arg2);
                    }
                    if (class441.field6351 != -1) {
                        this.field4148.method1711((byte) 123, var20, class441.field6351, this.field4141.field885 + var10 + 1, arg2);
                    }
                    var12 = var15;
                    arg2 += var20;
                }
            }
        }
        if (arg8 >= -19) {
            this.field4141 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;IZI)V")
    public final void method1759(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, boolean arg6, int arg7) {
        field4160++;
        if (arg4 == null) {
            return;
        }
        this.method1768(arg7, arg3, -101);
        double var9 = 7.0D - ((double) arg1 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (!arg6) {
            return;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg2));
        }
        this.method1761(arg0, arg5 - (this.field4141.method416(8364, arg4) / 2), null, var12, null, arg4, null, !arg6);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([II[Lo;ILjava/lang/String;III)V")
    public final void method1760(int[] arg0, int arg1, class359[] arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field4151++;
        if (arg4 == null) {
            return;
        }
        this.method1768(arg7, arg3, -100);
        this.method1758(arg6, arg2, arg1, arg4, arg0, 0, 0, null, (byte) -45);
        if (arg5 != -4713) {
            this.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I[I[ILjava/lang/String;[Lo;Z)V")
    private final void method1761(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, String arg5, class359[] arg6, boolean arg7) {
        int var9 = arg0 - this.field4141.field885;
        field4145++;
        int var10 = -1;
        if (arg7) {
            return;
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class355.method2125(-15205, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg5.substring(var10 + 1, var14);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class410.method2405(54, var16.substring(4));
                                    class359 var20 = arg6[var19];
                                    int var21 = arg2 == null ? var20.method207() : arg2[var19];
                                    var20.method215(arg1 + var17, -var21 + this.field4141.field885 + var9 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg1 += arg6[var19].method204();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1771(var16, 4);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field4141.method409((byte) -92, var15, var11);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class143.field2125 & 0xFF000000) != 0) {
                            this.method344(var15, arg1 + var22 + 1, var9 + 1 + var23, class143.field2125, true);
                        }
                        this.method344(var15, arg1 + var22, var9 - -var23, class528.field7714, false);
                    } else if (class41.field610 > 0) {
                        class255.field3475 += class41.field610;
                        arg1 += class255.field3475 >> 8;
                        class255.field3475 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4141.method415(var15, (byte) 1);
                    if (class58.field828 != -1) {
                        this.field4148.method1711((byte) 109, var24, class58.field828, (int) ((double) this.field4141.field885 * 0.7D) + var9, arg1);
                    }
                    if (class441.field6351 != -1) {
                        this.field4148.method1711((byte) 118, var24, class441.field6351, this.field4141.field885 + var9, arg1);
                    }
                    arg1 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lo;Ljava/lang/String;III[IIIILta;IIIIII)I")
    public final int method1762(int arg0, class359[] arg1, String arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, class336 arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field4137++;
        if (arg2 == null) {
            return 0;
        }
        this.method1768(arg3, arg7, -65);
        if (arg14 == 0) {
            arg14 = this.field4141.field885;
        }
        int[] var18;
        if (arg11 < this.field4141.field896 + this.field4141.field883 + arg14 && arg14 + arg14 > arg11) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        if (arg9 == -1) {
            arg9 = arg11 / arg14;
            if (arg9 <= 0) {
                arg9 = 1;
            }
        }
        int var19 = this.field4141.method412(arg1, (byte) 2, var18, arg2, class308.field4187);
        if (arg9 > 0 && arg9 <= var19) {
            class308.field4187[arg9 - 1] = this.field4141.method413((byte) -102, arg15, class308.field4187[arg9 - 1], arg1);
            var19 = arg9;
        }
        if (arg13 == 3 && var19 == 1) {
            arg13 = 1;
        }
        int var20;
        if (arg13 == 0) {
            var20 = this.field4141.field896 + arg12;
        } else if (arg13 == 1) {
            var20 = arg12 - (-this.field4141.field896 - (arg11 - this.field4141.field896 - this.field4141.field883 - ((var19 - 1) * arg14)) / 2);
        } else if (arg13 == 2) {
            var20 = arg12 - this.field4141.field883 - (-arg11 - -((var19 + -1) * arg14));
        } else {
            int var21 = (arg11 - this.field4141.field896 - ((var19 + -1) * arg14) - this.field4141.field883) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field4141.field896 + arg12 + var21;
            arg14 += var21;
        }
        int var22 = 0;
        if (arg4 != -61) {
            field4154 = -17;
        }
        while (var22 < var19) {
            if (arg5 == 0) {
                this.method1758(var20, arg1, arg8, class308.field4187[var22], arg6, arg0, arg16, arg10, (byte) -22);
            } else if (arg5 == 1) {
                this.method1758(var20, arg1, arg8 + ((arg15 - this.field4141.method416(8364, class308.field4187[var22])) / 2), class308.field4187[var22], arg6, arg0, arg16, arg10, (byte) -106);
            } else if (arg5 == 2) {
                this.method1758(var20, arg1, arg8 + arg15 - this.field4141.method416(8364, class308.field4187[var22]), class308.field4187[var22], arg6, arg0, arg16, arg10, (byte) -31);
            } else if (var19 - 1 == var22) {
                this.method1758(var20, arg1, arg8, class308.field4187[var22], arg6, arg0, arg16, arg10, (byte) -64);
            } else {
                this.method1766(arg4 ^ 0xFFFFFFF1, class308.field4187[var22], arg15);
                this.method1758(var20, arg1, arg8, class308.field4187[var22], arg6, arg0, arg16, arg10, (byte) -65);
                class41.field610 = 0;
            }
            var20 += arg14;
            var22++;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lo;I[IILjava/lang/String;ILjava/util/Random;IBI)I")
    public final int method1763(class359[] arg0, int arg1, int[] arg2, int arg3, String arg4, int arg5, Random arg6, int arg7, byte arg8, int arg9) {
        field4150++;
        if (arg4 == null) {
            return 0;
        }
        arg6.setSeed((long) arg7);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method1768(var11 << 24 | arg1 & 0xFFFFFF, var11 << 24 | arg5 & 0xFFFFFF, -62);
        int var12 = arg4.length();
        if (arg8 != -59) {
            field4147 = null;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1761(arg3, arg9, arg2, null, var13, arg4, arg0, false);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIII[Lo;IILjava/util/Random;I[II[I)I")
    public final int method1764(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, class359[] arg7, int arg8, int arg9, Random arg10, int arg11, int[] arg12, int arg13, int[] arg14) {
        field4152++;
        if (arg2 == null) {
            return 0;
        }
        arg10.setSeed((long) arg13);
        int var16 = (arg10.nextInt() & 0x1F) + 192;
        this.method1768(arg0 & 0xFFFFFF | var16 << 24, var16 << 24 | arg4 & 0xFFFFFF, -105);
        int var17 = arg2.length();
        int[] var18 = new int[var17];
        int var19 = 30 % ((17 - arg11) / 47);
        int var20 = 0;
        for (int var21 = 0; var21 < var17; var21++) {
            var18[var21] = var20;
            if ((arg10.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg5;
        int var23 = this.field4141.field896 + arg8;
        int var24 = -1;
        if (arg3 == 1) {
            var23 += (arg6 - this.field4141.field883 - this.field4141.field896) / 2;
        } else if (arg3 == 2) {
            var23 = arg8 + arg6 - this.field4141.field883;
        }
        if (arg9 == 1) {
            var24 = var20 + this.field4141.method416(8364, arg2);
            var22 = (arg1 - var24) / 2 + arg5;
        } else if (arg9 == 2) {
            var24 = this.field4141.method416(8364, arg2) + var20;
            var22 = arg1 + arg5 - var24;
        }
        this.method1761(var23, var22, arg12, null, var18, arg2, arg7, false);
        if (arg14 != null) {
            if (var24 == -1) {
                var24 = this.field4141.method416(8364, arg2) + var20;
            }
            arg14[3] = this.field4141.field896 + this.field4141.field883;
            arg14[0] = var22;
            arg14[2] = var24;
            arg14[1] = var23 - this.field4141.field896;
        }
        return var20;
    }

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method344(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1765(byte arg0) {
        field4142 = null;
        field4149 = null;
        if (arg0 < 117) {
            method1767(-58, 123, 126, (byte) -1, -33, 62, -86, 14);
        }
        field4147 = null;
        field4155 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method1766(int arg0, String arg1, int arg2) {
        field4159++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg0 < 16) {
            field4155 = null;
        }
        if (var4 > 0) {
            class41.field610 = (arg2 - this.field4141.method416(8364, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1767(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4153++;
        if (arg3 >= -96) {
            return;
        }
        int var8 = class486.method2879((byte) -92, arg1, class233.field3241, class23.field320);
        int var9 = class486.method2879((byte) -102, arg5, class233.field3241, class23.field320);
        int var10 = class486.method2879((byte) -123, arg0, class375.field5387, class519.field7633);
        int var11 = class486.method2879((byte) 108, arg2, class375.field5387, class519.field7633);
        int var12 = class486.method2879((byte) 96, arg1 + arg4, class233.field3241, class23.field320);
        int var13 = class486.method2879((byte) -88, arg5 - arg4, class233.field3241, class23.field320);
        for (int var14 = var8; var14 < var12; var14++) {
            class188.method1259(var10, (byte) 27, var11, arg7, class42.field626[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class188.method1259(var10, (byte) 27, var11, arg7, class42.field626[var15]);
        }
        int var16 = class486.method2879((byte) -104, arg0 + arg4, class375.field5387, class519.field7633);
        int var17 = class486.method2879((byte) -96, arg2 - arg4, class375.field5387, class519.field7633);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class42.field626[var18];
            class188.method1259(var10, (byte) 27, var16, arg7, var19);
            class188.method1259(var16, (byte) 27, var17, arg6, var19);
            class188.method1259(var17, (byte) 27, var11, arg7, var19);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method1768(int arg0, int arg1, int arg2) {
        field4146++;
        class441.field6351 = -1;
        class58.field828 = -1;
        class291.field3950 = arg1;
        class528.field7714 = arg1;
        if (arg2 >= -52) {
            return;
        }
        if (arg0 == -1) {
            arg0 = 0;
        }
        class255.field3475 = 0;
        class41.field610 = 0;
        class475.field6871 = arg0;
        class143.field2125 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1769(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field4144++;
        if (arg2 != null) {
            this.method1768(arg5, arg3, -56);
            this.method1758(arg0, null, arg1, arg2, null, arg4, 0, null, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1770(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4158++;
        if (arg4 == null) {
            return;
        }
        this.method1768(arg5, arg1, -126);
        int var8 = -123 % ((51 - arg6) / 34);
        int var9 = arg4.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method1761(arg0, arg3 - (this.field4141.method416(8364, arg4) / 2), null, var10, null, arg4, null, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1771(String arg0, int arg1) {
        field4157++;
        try {
            if (arg0.startsWith("col=")) {
                class528.field7714 = class528.field7714 & 0xFF000000 | class399.method2365(arg0.substring(4), arg1 - 128, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class528.field7714 = class291.field3950 & 0xFFFFFF | class528.field7714 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class528.field7714 = class399.method2365(arg0.substring(5), arg1 ^ 0xFFFFFF84, 16);
            } else if (arg0.equals("/argb")) {
                class528.field7714 = class291.field3950;
            } else if (arg0.startsWith("str=")) {
                class58.field828 = class528.field7714 & 0xFF000000 | class399.method2365(arg0.substring(4), -113, 16);
            } else if (arg0.equals("str")) {
                class58.field828 = class528.field7714 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class58.field828 = -1;
            } else if (arg0.startsWith("u=")) {
                class441.field6351 = class528.field7714 & 0xFF000000 | class399.method2365(arg0.substring(2), -116, 16);
            } else if (arg0.equals("u")) {
                class441.field6351 = class528.field7714 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class441.field6351 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class143.field2125 = 0;
            } else if (arg0.startsWith("shad=")) {
                class143.field2125 = class528.field7714 & 0xFF000000 | class399.method2365(arg0.substring(5), -126, 16);
            } else if (arg0.equals("shad")) {
                class143.field2125 = class528.field7714 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class143.field2125 = class475.field6871;
            } else if (arg0.equals("br")) {
                this.method1768(class475.field6871, class291.field3950, -105);
            }
        } catch (Exception var3) {
        }
        if (arg1 != 4) {
            this.method1772(8, null, -95, 75, 93, 15);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method1772(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4143++;
        if (arg1 == null) {
            return;
        }
        this.method1768(arg3, arg0, -95);
        if (arg2 >= -19) {
            this.method1762(106, null, null, -84, -98, 33, null, -119, 106, -30, null, -83, 127, -24, -99, -18, 68);
        }
        this.method1758(arg4, null, arg5 - (this.field4141.method416(8364, arg1) / 2), arg1, null, 0, 0, null, (byte) -120);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/lang/String;III)V")
    public final void method1773(int arg0, int arg1, byte arg2, String arg3, int arg4, int arg5, int arg6) {
        field4139++;
        if (arg3 == null) {
            return;
        }
        this.method1768(arg1, arg4, -118);
        if (arg2 != -43) {
            return;
        }
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1761(arg5, arg6 - this.field4141.method416(8364, arg3) / 2, null, var10, var9, arg3, null, false);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Lkt;)V")
    public class306(class295 arg0, class61 arg1) {
        this.field4141 = arg1;
        this.field4148 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lta;IIIIIIII[Lo;[IIILjava/lang/String;II)I")
    public final int method1774(class336 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class359[] arg9, int[] arg10, int arg11, int arg12, String arg13, int arg14, int arg15) {
        field4161++;
        if (arg5 != -22809) {
            field4142 = null;
        }
        return this.method1762(arg8, arg9, arg13, arg15, -61, arg2, arg10, arg11, arg3, 0, arg0, arg14, arg4, arg7, arg12, arg1, arg6);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method343(char arg0, int arg1, int arg2, int arg3, boolean arg4, class336 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;III)V")
    public final void method1775(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field4156++;
        if (arg2 != null) {
            this.method1768(arg1, arg5, -54);
            this.method1758(arg4, null, arg3 - this.field4141.method416(8364, arg2), arg2, null, 0, 0, null, (byte) -34);
            int var7 = -43 % ((-arg0 - 16) / 55);
        }
    }
}
