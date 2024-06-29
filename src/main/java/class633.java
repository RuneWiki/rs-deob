import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class633 {

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "[B")
    private byte[] field9206;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public int field9196;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[[B")
    private byte[][] field9207;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field9193;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public int field9192;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Lbv;")
    public static class567 field9200 = new class567("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "Z")
    public static boolean field9208 = false;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "[I")
    public static int[] field9205 = new int[1000];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;I[Lha;I)I", line = 8)
    public final int method3648(String arg0, int arg1, class116[] arg2, int arg3) {
        field9201++;
        if (arg1 > -57) {
            this.method3662((char) 65453, 0, -73);
        }
        return this.method3660(arg0, 4, arg2, new int[] { arg3 }, class644.field9379);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILtk;ZI)V", line = 19)
    public static final void method3649(int arg0, int arg1, class370 arg2, boolean arg3, int arg4) {
        field9191++;
        for (class154 var5 = (class154) class134.field2163.method427(arg3); var5 != null; var5 = (class154) class134.field2163.method420(!arg3)) {
            if (var5.field2328 == arg4 && (arg0 << 7) == var5.field2307 && (arg1 << 7) == var5.field2314 && var5.field2311.field5335 == arg2.field5335) {
                if (var5.field2312 != null) {
                    class35.field485.method44(var5.field2312);
                    var5.field2312 = null;
                }
                if (var5.field2310 != null) {
                    class35.field485.method44(var5.field2310);
                    var5.field2310 = null;
                }
                var5.method911(-52);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lha;Ljava/lang/String;II)I", line = 58)
    public final int method3650(class116[] arg0, String arg1, int arg2, int arg3) {
        field9202++;
        int var5 = this.method3660(arg1, 4, arg0, new int[] { arg3 }, class644.field9379);
        int var6 = 0;
        if (arg2 != 3) {
            return -121;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3654(arg0, class644.field9379[var7], -94);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)I", line = 91)
    public final int method3651(int arg0, String arg1) {
        if (arg0 != -10408) {
            this.method3648(null, 103, null, -32);
        }
        field9187++;
        return this.method3654(null, arg1, -100);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIIIFFII)[F", line = 103)
    public static final float[] method3652(float arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7) {
        field9194++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        if (arg1 > -34) {
            method3653(70);
        }
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[1] = 0.0F;
        var8[6] = -var11;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[2] = var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg3 / var19;
                var14 = (float) (-arg6) / var19;
            }
            var13[7] = -var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[1] = var15 * var17;
            var13[6] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[5] = var14 * var17;
            var13[4] = var16;
            var13[2] = var14 * var15 * var18;
            var13[3] = -var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[4] *= arg4;
        var9[0] *= arg0;
        var9[1] *= arg0;
        var9[7] *= arg5;
        var9[2] *= arg0;
        var9[8] *= arg5;
        var9[5] *= arg4;
        var9[3] *= arg4;
        var9[6] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)[Lqba;", line = 189)
    public static final class539[] method3653(int arg0) {
        if (arg0 != -19553) {
            method3652(1.4046013F, 50, 94, -38, -0.9499158F, -0.7173985F, -49, 73);
        }
        field9199++;
        return new class539[] { class97.field1678, class97.field1679, class97.field1680, class97.field1681, class97.field1682, class97.field1683, class97.field1684, class97.field1685, class97.field1686, class97.field1687, class97.field1688, class97.field1689, class97.field1690, class97.field1691 };
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lha;Ljava/lang/String;I)I", line = 200)
    public final int method3654(class116[] arg0, String arg1, int arg2) {
        field9190++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = -79 / ((arg2 + 48) / 46);
        for (int var9 = 0; var9 < var7; var9++) {
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
                                    int var12 = class302.method1889(var11.substring(4), false);
                                    var6 += arg0[var12].method955();
                                    var5 = -1;
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field9206[class365.method2205(var10, 82) & 0xFF] & 0xFF;
                    if (this.field9207 != null && var5 != -1) {
                        var6 += this.field9207[var5][var10];
                    }
                    var5 = var10;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;IB[Lha;)Ljava/lang/String;", line = 306)
    public final String method3655(String arg0, int arg1, byte arg2, class116[] arg3) {
        field9198++;
        if (arg1 >= this.method3654(arg3, arg0, 71)) {
            return arg0;
        }
        int var5 = arg1 - this.method3654(null, "...", -123);
        int var6 = -1;
        if (arg2 >= -54) {
            field9208 = true;
        }
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
                            if (var13.startsWith("img=") && arg3 != null) {
                                try {
                                    int var14 = class302.method1889(var13.substring(4), false);
                                    var7 = -1;
                                    var8 += arg3[var14].method955();
                                    if (var5 < var8) {
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
                    var8 += this.field9206[class365.method2205(var12, 104) & 0xFF] & 0xFF;
                    if (this.field9207 != null && var7 != -1) {
                        var8 += this.field9207[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field9207 != null) {
                        var15 = this.field9207[var12][46] + var8;
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

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 431)
    public static void method3656(byte arg0) {
        int var1 = 67 % ((-arg0 - 45) / 43);
        field9205 = null;
        field9200 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Loh;ZB)V", line = 441)
    public static final void method3657(class549 arg0, boolean arg1, byte arg2) {
        field9197++;
        if (arg2 <= 39) {
            method3653(47);
        }
        int var3 = arg0.field7694 == 0 ? arg0.field7678 : arg0.field7694;
        int var4 = arg0.field7750 == 0 ? arg0.field7776 : arg0.field7750;
        class496.method2827(true, arg0.field7734, arg1, var3, class177.field2593[arg0.field7734 >> 16], var4);
        if (arg0.field7684 != null) {
            class496.method2827(true, arg0.field7734, arg1, var3, arg0.field7684, var4);
        }
        class553 var5 = (class553) class639.field9274.method740(0, (long) arg0.field7734);
        if (var5 != null) {
            class539.method3033(var4, 0, arg1, var5.field7827, var3);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lha;ILjava/lang/String;II)I", line = 465)
    public final int method3658(class116[] arg0, int arg1, String arg2, int arg3, int arg4) {
        field9189++;
        if (arg4 == 0) {
            arg4 = this.field9196;
        }
        if (arg3 >= -100) {
            this.method3659(124, (byte) -90);
        }
        int var6 = this.method3660(arg2, 4, arg0, new int[] { arg1 }, class644.field9379);
        int var7 = (var6 - 1) * arg4;
        return this.field9193 + this.field9192 + var7;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)I", line = 483)
    public final int method3659(int arg0, byte arg1) {
        if (arg1 != 24) {
            method3649(-75, 4, null, false, 83);
        }
        field9204++;
        return this.field9206[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;I[Lha;[I[Ljava/lang/String;)I", line = 494)
    public final int method3660(String arg0, int arg1, class116[] arg2, int[] arg3, String[] arg4) {
        field9203++;
        if (arg0 == null) {
            return 0;
        }
        if (arg1 != 4) {
            method3653(12);
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
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class365.method2205(arg0.charAt(var15), 116) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method3659(var16, (byte) 24);
                    var18 = var15;
                    if (this.field9207 != null && var12 != -1) {
                        var17 += this.field9207[var12][var16];
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
                        arg4[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg4.length) {
                            return 0;
                        }
                        var6 = 0;
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3659(60, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3659(62, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3659(160, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3659(173, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3659(215, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3659(8364, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3659(169, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3659(174, (byte) 24);
                        if (this.field9207 != null && var12 != -1) {
                            var17 += this.field9207[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class302.method1889(var19.substring(4), false);
                            var17 += arg2[var20].method955();
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
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (var6 > arg3[arg3.length <= var13 ? arg3.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg4[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var7 = var18;
                                var8 = -1;
                                var12 = -1;
                            } else {
                                arg4[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
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
        if (arg0.length() > var7) {
            arg4[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILco;)V", line = 749)
    public static final void method3661(int arg0, class268 arg1) {
        field9188++;
        int var2 = arg1.method1749((byte) 119);
        class531.field7397 = new class266[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class531.field7397[var3] = new class266();
            class531.field7397[var3].field3881 = arg1.method1749((byte) -66);
            class531.field7397[var3].field3884 = arg1.method1729((byte) 24);
        }
        class92.field1624 = arg1.method1749((byte) 124);
        class12.field129 = arg1.method1749((byte) 124);
        class10.field111 = arg1.method1749((byte) 78);
        class206.field2916 = new class225[class12.field129 + 1 - class92.field1624];
        for (int var4 = 0; var4 < class10.field111; var4++) {
            int var5 = arg1.method1749((byte) 121);
            class225 var6 = class206.field2916[var5] = new class225();
            var6.field593 = arg1.method1738(255);
            var6.field596 = arg1.method1748(-102);
            var6.field3364 = class92.field1624 + var5;
            var6.field3362 = arg1.method1729((byte) 24);
            var6.field3366 = arg1.method1729((byte) 24);
        }
        if (arg0 > -127) {
            method3649(26, -56, null, false, 100);
        }
        class285.field4158 = arg1.method1748(-79);
        class596.field8491 = true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(CII)I", line = 796)
    public final int method3662(char arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.method3650(null, null, 97, 39);
        }
        field9195++;
        return this.field9207 == null ? 0 : this.field9207[arg1][arg0];
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([B)V", line = 825)
    public class633(byte[] arg0) {
        class268 var2 = new class268(arg0);
        int var3 = var2.method1738(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1738(255) == 1;
        this.field9206 = new byte[256];
        var2.method1695(this.field9206, (byte) -52, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1738(255);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1738(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1714(-31536);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1714(-31536);
                    var11[var12][var16] = var15;
                }
            }
            this.field9207 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field9207[var13][var14] = (byte) class648.method3727(this.field9206, (byte) -114, var6, var13, var9, var14, var11, var5);
                        }
                    }
                }
            }
            this.field9196 = var5[32] + var6[32];
        } else {
            this.field9196 = var2.method1738(255);
        }
        var2.method1738(255);
        var2.method1738(255);
        this.field9193 = var2.method1738(255);
        this.field9192 = var2.method1738(255);
    }
}
