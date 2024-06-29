import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class296 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lza;")
    private class491 field4760;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lqm;")
    private class331 field4772;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field4781 = -2;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Llo;")
    public static class306 field4777 = new class306("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field4782 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method336(char arg0, int arg1, int arg2, int arg3, boolean arg4, class448 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1893(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -1) {
            method1896(106, -18, (byte) -123);
        }
        field4763++;
        if (arg3 == null) {
            return;
        }
        this.method1899(arg6, true, arg0);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1898(arg5, var10, null, arg4 - this.field4772.method2085((byte) -124, arg3) / 2, null, false, arg3, var9);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLia;)Lvs;")
    public static final class363 method1894(byte arg0, class23 arg1) {
        if (arg0 == 118) {
            field4766++;
            return new class363(arg1.method170(492756037), arg1.method170(492756037), arg1.method170(492756037), arg1.method170(492756037), arg1.method170(492756037), arg1.method170(492756037), arg1.method170(arg0 + 492755919), arg1.method170(arg0 ^ 0x1D5EDC33), arg1.method181(122), arg1.method126((byte) -82));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lo;Ljava/lang/String;Lta;II[I)V")
    private final void method1895(int arg0, int arg1, int arg2, class138[] arg3, String arg4, class448 arg5, int arg6, int arg7, int[] arg8) {
        int var10 = arg0 - this.field4772.field5208;
        field4779++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        int var14 = 0;
        if (arg2 != 1) {
            return;
        }
        while (var14 < var13) {
            char var15 = (char) (class376.method2389(arg4.charAt(var14), 352) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg4.substring(var11 + 1, var14);
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
                                        int var17 = class508.method2990(var16.substring(4), arg2 ^ 0x5B6A);
                                        class138 var18 = arg3[var17];
                                        int var19 = arg8 == null ? var18.method198() : arg8[var17];
                                        if ((class142.field2344 & 0xFF000000) == -16777216) {
                                            var18.method199(arg7, this.field4772.field5208 + var10 - var19, 1, 0, 1);
                                        } else {
                                            var18.method199(arg7, var10 + this.field4772.field5208 - var19, 0, class142.field2344 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        arg7 += arg3[var17].method200();
                                        var12 = -1;
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method1901(var16, 31);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg7 += this.field4772.method2082(arg2 - 1, var15, var12);
                        }
                        if (var15 == ' ') {
                            if (class508.field7391 > 0) {
                                class201.field3198 += class508.field7391;
                                arg7 += class201.field3198 >> 8;
                                class201.field3198 &= 0xFF;
                            }
                        } else if (arg5 == null) {
                            if ((class320.field5018 & 0xFF000000) != 0) {
                                this.method335(var15, arg7 + 1, var10 + 1, class320.field5018, true);
                            }
                            this.method335(var15, arg7, var10, class142.field2344, false);
                        } else {
                            if ((class320.field5018 & 0xFF000000) != 0) {
                                this.method336(var15, arg7 + 1, var10 + 1, class320.field5018, true, arg5, arg1, arg6);
                            }
                            this.method336(var15, arg7, var10, class142.field2344, false, arg5, arg1, arg6);
                        }
                        int var20 = this.field4772.method2088(-16703, var15);
                        if (class345.field5418 != -1) {
                            this.field4760.method2865(class345.field5418, var20, arg7, (byte) 87, (int) ((double) this.field4772.field5208 * 0.7D) + var10);
                        }
                        if (class387.field5965 != -1) {
                            this.field4760.method2865(class387.field5965, var20, arg7, (byte) 87, var10 + this.field4772.field5208 + 1);
                        }
                        var12 = var15;
                        arg7 += var20;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)B")
    public static final byte method1896(int arg0, int arg1, byte arg2) {
        field4770++;
        if (arg0 == 9) {
            if (arg2 < 45) {
                method1896(-88, 113, (byte) -82);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method1897(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field4780++;
        if (arg3 != null && arg4 == 24244) {
            this.method1899(arg2, true, arg5);
            this.method1895(arg1, 0, arg4 ^ 0x5EB5, null, arg3, null, 0, arg0 - (this.field4772.method2085((byte) -91, arg3) / 2), null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[I[Lo;I[IZLjava/lang/String;[I)V")
    private final void method1898(int arg0, int[] arg1, class138[] arg2, int arg3, int[] arg4, boolean arg5, String arg6, int[] arg7) {
        if (arg5) {
            return;
        }
        int var9 = arg0 - this.field4772.field5208;
        field4775++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class376.method2389(arg6.charAt(var14), 352) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg6.substring(var10 + 1, var14);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class508.method2990(var16.substring(4), 23403);
                                    class138 var20 = arg2[var19];
                                    int var21 = arg4 == null ? var20.method198() : arg4[var19];
                                    var20.method199(arg3 + var17, -var21 + this.field4772.field5208 + var9 - -var18, 1, 0, 1);
                                    arg3 += arg2[var19].method200();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1901(var16, -118);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field4772.method2082(0, var15, var11);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    if (var15 != ' ') {
                        if ((class320.field5018 & 0xFF000000) != 0) {
                            this.method335(var15, arg3 + var22 + 1, var9 + 1 + var23, class320.field5018, true);
                        }
                        this.method335(var15, arg3 + var22, var9 + var23, class142.field2344, false);
                    } else if (class508.field7391 > 0) {
                        class201.field3198 += class508.field7391;
                        arg3 += class201.field3198 >> 8;
                        class201.field3198 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4772.method2088(-16703, var15);
                    if (class345.field5418 != -1) {
                        this.field4760.method2865(class345.field5418, var24, arg3, (byte) 87, (int) ((double) this.field4772.field5208 * 0.7D) + var9);
                    }
                    if (class387.field5965 != -1) {
                        this.field4760.method2865(class387.field5965, var24, arg3, (byte) 87, this.field4772.field5208 + var9);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V")
    private final void method1899(int arg0, boolean arg1, int arg2) {
        class508.field7391 = 0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class345.field5418 = -1;
        field4765++;
        class387.field5965 = -1;
        if (!arg1) {
            field4764 = 69;
        }
        class480.field7079 = arg0;
        class142.field2344 = arg0;
        class201.field3198 = 0;
        class205.field3252 = arg2;
        class320.field5018 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;B)V")
    private final void method1900(int arg0, String arg1, byte arg2) {
        field4773++;
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
        if (arg2 <= 27) {
            this.field4760 = null;
        }
        if (var4 > 0) {
            class508.field7391 = (arg0 - this.field4772.method2085((byte) -121, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1901(String arg0, int arg1) {
        field4762++;
        try {
            if (arg0.startsWith("col=")) {
                class142.field2344 = class142.field2344 & 0xFF000000 | class157.method1101(16, arg0.substring(4), 1) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class142.field2344 = class142.field2344 & 0xFF000000 | class480.field7079 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class142.field2344 = class157.method1101(16, arg0.substring(5), 1);
            } else if (arg0.equals("/argb")) {
                class142.field2344 = class480.field7079;
            } else if (arg0.startsWith("str=")) {
                class345.field5418 = class142.field2344 & 0xFF000000 | class157.method1101(16, arg0.substring(4), 1);
            } else if (arg0.equals("str")) {
                class345.field5418 = class142.field2344 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class345.field5418 = -1;
            } else if (arg0.startsWith("u=")) {
                class387.field5965 = class142.field2344 & 0xFF000000 | class157.method1101(16, arg0.substring(2), 1);
            } else if (arg0.equals("u")) {
                class387.field5965 = class142.field2344 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class387.field5965 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class320.field5018 = 0;
            } else if (arg0.startsWith("shad=")) {
                class320.field5018 = class142.field2344 & 0xFF000000 | class157.method1101(16, arg0.substring(5), 1);
            } else if (arg0.equals("shad")) {
                class320.field5018 = class142.field2344 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class320.field5018 = class205.field3252;
            } else if (arg0.equals("br")) {
                this.method1899(class480.field7079, true, class205.field3252);
            }
            int var3 = 45 % ((-arg1 - 41) / 41);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method1902(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4778++;
        if (arg1 == null) {
            return;
        }
        this.method1899(arg0, true, arg3);
        if (arg2 != -16777216) {
            field4777 = null;
        }
        this.method1895(arg5, 0, 1, null, arg1, null, 0, arg4 - this.field4772.method2085((byte) -90, arg1), null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method1903(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field4776++;
        if (arg5 != null) {
            this.method1899(arg4, true, arg0);
            this.method1895(arg2, arg3, 1, null, arg5, null, 0, arg1, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lo;I[IILjava/lang/String;IB)V")
    public final void method1904(int arg0, class138[] arg1, int arg2, int[] arg3, int arg4, String arg5, int arg6, byte arg7) {
        field4758++;
        if (arg5 == null) {
            return;
        }
        if (arg7 != 66) {
            method1896(48, 20, (byte) -28);
        }
        this.method1899(arg0, true, arg4);
        this.method1895(arg6, 0, 1, arg1, arg5, null, 0, arg2, arg3);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method1905(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4768++;
        if (arg1 == null) {
            return;
        }
        this.method1899(arg0, true, arg5);
        int var8 = arg1.length();
        if (arg2 != -28597) {
            field4777 = null;
        }
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1898(arg4, var9, null, arg6 - (this.field4772.method2085((byte) -104, arg1) / 2), null, false, arg1, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1906(int arg0) {
        if (arg0 == -6047) {
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[IIBIIII[Lo;IIILjava/util/Random;[II)I")
    public final int method1907(String arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class138[] arg8, int arg9, int arg10, int arg11, Random arg12, int[] arg13, int arg14) {
        field4759++;
        if (arg0 == null) {
            return 0;
        }
        arg12.setSeed((long) arg10);
        int var16 = (arg12.nextInt() & 0x1F) + 192;
        this.method1899(var16 << 24 | arg2 & 0xFFFFFF, true, var16 << 24 | arg14 & 0xFFFFFF);
        int var17 = arg0.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg12.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        if (arg3 > -79) {
            return 110;
        }
        int var22 = arg11 + this.field4772.field5218;
        if (arg4 == 1) {
            var22 += (arg6 - this.field4772.field5218 - this.field4772.field5202) / 2;
        } else if (arg4 == 2) {
            var22 = arg11 + arg6 - this.field4772.field5202;
        }
        int var23 = -1;
        if (arg5 == 1) {
            var23 = this.field4772.method2085((byte) -87, arg0) + var19;
            var21 = (arg7 - var23) / 2 + arg9;
        } else if (arg5 == 2) {
            var23 = var19 + this.field4772.method2085((byte) -118, arg0);
            var21 = arg7 + arg9 - var23;
        }
        this.method1898(var22, null, arg8, var21, arg13, false, arg0, var18);
        if (arg1 != null) {
            if (var23 == -1) {
                var23 = this.field4772.method2085((byte) -123, arg0) + var19;
            }
            arg1[3] = this.field4772.field5218 + this.field4772.field5202;
            arg1[1] = var22 - this.field4772.field5218;
            arg1[2] = var23;
            arg1[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public final void method1908(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4769++;
        if (arg0 == null) {
            return;
        }
        this.method1899(arg2, true, arg5);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        if (arg6 < -80) {
            for (int var13 = 0; var13 < var11; var13++) {
                var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
            }
            this.method1898(arg1, var12, null, arg7 - this.field4772.method2085((byte) -82, arg0) / 2, null, false, arg0, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;IIII[Lo;ILjava/lang/String;[II)I")
    public final int method1909(Random arg0, int arg1, int arg2, int arg3, int arg4, class138[] arg5, int arg6, String arg7, int[] arg8, int arg9) {
        field4771++;
        if (arg7 == null) {
            return 0;
        }
        arg0.setSeed((long) arg1);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method1899(arg2 & 0xFFFFFF | var11 << 24, true, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg7.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 0;
        int var16 = -50 / ((-arg6 - 2) / 44);
        while (var12 > var15) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
            var15++;
        }
        this.method1898(arg4, null, arg5, arg3, arg8, false, arg7, var13);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;IIIIIIII[Lo;IIIILta;)I")
    public final int method1910(int[] arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class138[] arg11, int arg12, int arg13, int arg14, int arg15, class448 arg16) {
        field4774++;
        if (arg2 == null) {
            return 0;
        }
        this.method1899(arg3, true, arg6);
        if (arg13 == 0) {
            arg13 = this.field4772.field5208;
        }
        int[] var18;
        if ((this.field4772.field5218 + this.field4772.field5202 + arg13) > arg12 && arg12 < arg13 + arg13) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        if (arg4 != -6040) {
            return 118;
        }
        int var19 = this.field4772.method2083(arg11, false, arg2, var18, class316.field4972);
        if (arg10 == -1) {
            arg10 = arg12 / arg13;
            if (arg10 <= 0) {
                arg10 = 1;
            }
        }
        if (arg10 > 0 && arg10 <= var19) {
            var19 = arg10;
            class316.field4972[arg10 - 1] = this.field4772.method2086(arg11, arg15, 0, class316.field4972[arg10 - 1]);
        }
        if (arg5 == 3 && var19 == 1) {
            arg5 = 1;
        }
        int var20;
        if (arg5 == 0) {
            var20 = this.field4772.field5218 + arg8;
        } else if (arg5 == 1) {
            var20 = this.field4772.field5218 + arg8 + ((-((var19 + -1) * arg13) + -this.field4772.field5202 + -this.field4772.field5218 + arg12) / 2);
        } else if (arg5 == 2) {
            var20 = arg12 + arg8 - this.field4772.field5202 - ((var19 + -1) * arg13);
        } else {
            int var21 = (arg12 - (var19 - 1) * arg13 - this.field4772.field5218 - this.field4772.field5202) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg13 += var21;
            var20 = arg8 + var21 + this.field4772.field5218;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg1 == 0) {
                this.method1895(var20, arg14, 1, arg11, class316.field4972[var22], arg16, arg7, arg9, arg0);
            } else if (arg1 == 1) {
                this.method1895(var20, arg14, 1, arg11, class316.field4972[var22], arg16, arg7, (arg15 - this.field4772.method2085((byte) -121, class316.field4972[var22])) / 2 + arg9, arg0);
            } else if (arg1 == 2) {
                this.method1895(var20, arg14, 1, arg11, class316.field4972[var22], arg16, arg7, arg9 + arg15 - this.field4772.method2085((byte) -95, class316.field4972[var22]), arg0);
            } else if ((var19 - 1) == var22) {
                this.method1895(var20, arg14, 1, arg11, class316.field4972[var22], arg16, arg7, arg9, arg0);
            } else {
                this.method1900(arg15, class316.field4972[var22], (byte) 108);
                this.method1895(var20, arg14, 1, arg11, class316.field4972[var22], arg16, arg7, arg9, arg0);
                class508.field7391 = 0;
            }
            var20 += arg13;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;III[Lo;IILta;[IIIIII)I")
    public final int method1911(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, class138[] arg6, int arg7, int arg8, class448 arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg1) {
            this.method1905(6, null, 52, 21, -74, 70, 31);
        }
        field4767++;
        return this.method1910(arg10, arg15, arg2, arg8, -6040, arg0, arg4, arg13, arg5, arg7, 0, arg6, arg12, arg11, arg14, arg3, arg9);
    }

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method335(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Lqm;)V")
    public class296(class491 arg0, class331 arg1) {
        this.field4760 = arg0;
        this.field4772 = arg1;
    }

    static {
        new class306("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}
