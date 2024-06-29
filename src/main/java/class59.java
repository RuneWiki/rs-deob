import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class59 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lqm;")
    private class143 field718;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lha;")
    private class58 field726;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lg;")
    public static class153 field723 = new class153(1, 2);

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Z")
    public static boolean field737 = false;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V", line = 10)
    private final void method494(int arg0, byte arg1, int arg2) {
        class10.field238 = arg0;
        class392.field5547 = arg0;
        class9.field133 = -1;
        class673.field9121 = -1;
        if (arg1 >= -87) {
            field737 = false;
        }
        class291.field4099 = 0;
        field721++;
        class469.field6655 = 0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class123.field1482 = arg2;
        class598.field8407 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 32)
    public final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field725++;
        if (arg6 == null) {
            return;
        }
        this.method494(arg3, (byte) -100, arg0);
        int var8 = arg6.length();
        if (arg4 < 111) {
            this.method509(false, -89, null, null, null, null, -114, null);
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method509(true, arg1 - (this.field718.method992(arg6, (byte) -5) / 2), var9, arg6, null, var10, arg5, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 68)
    private final void method496(String arg0, int arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class392.field5547 = class392.field5547 & 0xFF000000 | class77.method616(arg0.substring(4), -6671, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class392.field5547 = class392.field5547 & 0xFF000000 | class10.field238 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class392.field5547 = class77.method616(arg0.substring(5), -6671, 16);
            } else if (arg0.equals("/argb")) {
                class392.field5547 = class10.field238;
            } else if (arg0.startsWith("str=")) {
                class673.field9121 = class392.field5547 & 0xFF000000 | class77.method616(arg0.substring(4), -6671, 16);
            } else if (arg0.equals("str")) {
                class673.field9121 = class392.field5547 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class673.field9121 = -1;
            } else if (arg0.startsWith("u=")) {
                class9.field133 = class392.field5547 & 0xFF000000 | class77.method616(arg0.substring(2), -6671, 16);
            } else if (arg0.equals("u")) {
                class9.field133 = class392.field5547 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class9.field133 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class598.field8407 = 0;
            } else if (arg0.startsWith("shad=")) {
                class598.field8407 = class392.field5547 & 0xFF000000 | class77.method616(arg0.substring(5), -6671, 16);
            } else if (arg0.equals("shad")) {
                class598.field8407 = class392.field5547 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class598.field8407 = class123.field1482;
            } else if (arg0.equals("br")) {
                this.method494(class10.field238, (byte) -121, class123.field1482);
            }
        } catch (Exception var3) {
        }
        field736++;
        if (arg1 != 1937763080) {
            this.method510(56, -25, 68, null, 111, -35, null, 37, -115, 8, 96, 112, 0, null, null, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 148)
    private final void method497(int arg0, String arg1, int arg2) {
        field732++;
        if (arg0 != -20971) {
            this.method504(-127, -90, -123, null, -114, 44, -9);
        }
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
        if (var4 > 0) {
            class291.field4099 = (arg2 - this.field718.method992(arg1, (byte) -67) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V", line = 188)
    public final void method498(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field728++;
        if (arg4 != null) {
            this.method494(arg2, (byte) -118, arg5);
            if (arg1 == 173) {
                this.method503(arg4, null, null, 0, arg0, 0, 64, arg3, null);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZILjava/lang/String;)V", line = 204)
    public final void method499(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        field720++;
        if (arg5 != null && !arg3) {
            this.method494(arg4, (byte) -101, arg2);
            this.method503(arg5, null, null, 0, arg1 - this.field718.method992(arg5, (byte) -6) / 2, 0, 107, arg0, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Loia;IIIIIIIII[IILjava/lang/String;ILaa;)I", line = 219)
    public final int method500(int arg0, int arg1, class88[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, String arg14, int arg15, class486 arg16) {
        int var18 = -97 % ((arg1 - 65) / 41);
        field729++;
        if (arg14 == null) {
            return 0;
        }
        this.method494(arg13, (byte) -124, arg8);
        if (arg3 == 0) {
            arg3 = this.field718.field2035;
        }
        int[] var19;
        if (arg11 < this.field718.field2047 + this.field718.field2039 + arg3 && arg3 + arg3 > arg11) {
            var19 = null;
        } else {
            var19 = new int[] { arg7 };
        }
        int var20 = this.field718.method993(arg14, class55.field640, var19, 60, arg2);
        if (arg0 == -1) {
            arg0 = arg11 / arg3;
            if (arg0 <= 0) {
                arg0 = 1;
            }
        }
        if (arg0 > 0 && var20 >= arg0) {
            class55.field640[arg0 - 1] = this.field718.method999(-103, class55.field640[arg0 - 1], arg7, arg2);
            var20 = arg0;
        }
        if (arg9 == 3 && var20 == 1) {
            arg9 = 1;
        }
        int var21;
        if (arg9 == 0) {
            var21 = this.field718.field2039 + arg10;
        } else if (arg9 == 1) {
            var21 = (arg11 - this.field718.field2039 - (var20 - 1) * arg3 - this.field718.field2047) / 2 + arg10 + this.field718.field2039;
        } else if (arg9 == 2) {
            var21 = arg10 + arg11 - this.field718.field2047 - (var20 - 1) * arg3;
        } else {
            int var22 = (arg11 - ((var20 - 1) * arg3) - this.field718.field2047 - this.field718.field2039) / (var20 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            arg3 += var22;
            var21 = arg10 + this.field718.field2039 + var22;
        }
        for (int var23 = 0; var23 < var20; var23++) {
            if (arg5 == 0) {
                this.method503(class55.field640[var23], arg16, arg2, arg6, arg15, arg4, 67, var21, arg12);
            } else if (arg5 == 1) {
                this.method503(class55.field640[var23], arg16, arg2, arg6, arg15 + (arg7 - this.field718.method992(class55.field640[var23], (byte) -64)) / 2, arg4, 61, var21, arg12);
            } else if (arg5 == 2) {
                this.method503(class55.field640[var23], arg16, arg2, arg6, arg7 + arg15 - this.field718.method992(class55.field640[var23], (byte) -61), arg4, 93, var21, arg12);
            } else if (var20 - 1 == var23) {
                this.method503(class55.field640[var23], arg16, arg2, arg6, arg15, arg4, 64, var21, arg12);
            } else {
                this.method497(-20971, class55.field640[var23], arg7);
                this.method503(class55.field640[var23], arg16, arg2, arg6, arg15, arg4, 51, var21, arg12);
                class291.field4099 = 0;
            }
            var21 += arg3;
        }
        return var20;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 319)
    public static void method501(int arg0) {
        if (arg0 != 15578) {
            field737 = false;
        }
        field723 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;IIIB[I[Loia;)I", line = 332)
    public final int method502(int arg0, Random arg1, int arg2, String arg3, int arg4, int arg5, int arg6, byte arg7, int[] arg8, class88[] arg9) {
        field735++;
        if (arg3 == null) {
            return 0;
        }
        arg1.setSeed((long) arg0);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        int var12 = 125 / ((arg7 - 42) / 57);
        this.method494(arg6 & 0xFFFFFF | var11 << 24, (byte) -94, arg5 & 0xFFFFFF | var11 << 24);
        int var13 = arg3.length();
        int[] var14 = new int[var13];
        int var15 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            var14[var16] = var15;
            if ((arg1.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method509(true, arg2, var14, arg3, arg9, null, arg4, arg8);
        return var15;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Laa;[Loia;IIIII[I)V", line = 372)
    private final void method503(String arg0, class486 arg1, class88[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = arg7 - this.field718.field2035;
        field724++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg0.length();
        int var14 = 0;
        if (arg6 <= 33) {
            this.method495(-71, -34, -51, 29, -39, -108, null);
        }
        while (var14 < var13) {
            char var15 = (char) (class272.method1774(arg0.charAt(var14), -8910) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg0.substring(var11 + 1, var14);
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
                                        int var17 = class325.method2121(var16.substring(4), -23213);
                                        class88 var18 = arg2[var17];
                                        int var19 = arg8 == null ? var18.method670() : arg8[var17];
                                        if ((class392.field5547 & 0xFF000000) == -16777216) {
                                            var18.method672(arg4, var10 + this.field718.field2035 - var19, 1, 0, 1);
                                        } else {
                                            var18.method672(arg4, this.field718.field2035 + var10 - var19, 0, class392.field5547 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        arg4 += arg2[var17].method656();
                                        var12 = -1;
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method496(var16, 1937763080);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg4 += this.field718.method995(var12, false, var15);
                        }
                        if (var15 == ' ') {
                            if (class291.field4099 > 0) {
                                class469.field6655 += class291.field4099;
                                arg4 += class469.field6655 >> 8;
                                class469.field6655 &= 0xFF;
                            }
                        } else if (arg1 == null) {
                            if ((class598.field8407 & 0xFF000000) != 0) {
                                this.method104(var15, arg4 + 1, var10 + 1, class598.field8407, true);
                            }
                            this.method104(var15, arg4, var10, class392.field5547, false);
                        } else {
                            if ((class598.field8407 & 0xFF000000) != 0) {
                                this.method102(var15, arg4 + 1, var10 + 1, class598.field8407, true, arg1, arg3, arg5);
                            }
                            this.method102(var15, arg4, var10, class392.field5547, false, arg1, arg3, arg5);
                        }
                        int var20 = this.field718.method997(var15, 7125);
                        if (class673.field9121 != -1) {
                            this.field726.method458(arg4, var10 + ((int) ((double) this.field718.field2035 * 0.7D)), 8985, var20, class673.field9121);
                        }
                        if (class9.field133 != -1) {
                            this.field726.method458(arg4, this.field718.field2035 + var10 + 1, 8985, var20, class9.field133);
                        }
                        arg4 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 525)
    public final void method504(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 20066) {
            this.method494(12, (byte) 58, -75);
        }
        field727++;
        if (arg3 == null) {
            return;
        }
        this.method494(arg0, (byte) -107, arg2);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method509(true, arg1 - (this.field718.method992(arg3, (byte) -70) / 2), null, arg3, null, var9, arg4, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;II[II[II[Loia;ILjava/util/Random;IIII)I", line = 552)
    public final int method505(int arg0, String arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, class88[] arg8, int arg9, Random arg10, int arg11, int arg12, int arg13, int arg14) {
        field722++;
        if (arg1 == null) {
            return 0;
        }
        arg10.setSeed((long) arg12);
        int var16 = (arg10.nextInt() & 0x1F) + 192;
        this.method494(arg9 & 0xFFFFFF | var16 << 24, (byte) -120, var16 << 24 | arg2 & 0xFFFFFF);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = arg11; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg10.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        int var22 = this.field718.field2039 + arg13;
        int var23 = -1;
        if (arg14 == 1) {
            var22 += (arg3 - this.field718.field2039 - this.field718.field2047) / 2;
        } else if (arg14 == 2) {
            var22 = arg13 + arg3 - this.field718.field2047;
        }
        if (arg7 == 1) {
            var23 = this.field718.method992(arg1, (byte) -84) + var19;
            var21 = (arg0 - var23) / 2 + arg5;
        } else if (arg7 == 2) {
            var23 = this.field718.method992(arg1, (byte) -24) + var19;
            var21 = arg0 + arg5 - var23;
        }
        this.method509(true, var21, var18, arg1, arg8, null, var22, arg6);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = this.field718.method992(arg1, (byte) -36) + var19;
            }
            arg4[3] = this.field718.field2039 + this.field718.field2047;
            arg4[0] = var21;
            arg4[1] = var22 - this.field718.field2039;
            arg4[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;II)V", line = 626)
    public final void method506(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field730++;
        if (arg0 < -79 && arg3 != null) {
            this.method494(arg4, (byte) -93, arg1);
            this.method503(arg3, null, null, 0, arg2 - this.field718.method992(arg3, (byte) -7), 0, 80, arg5, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;II)V", line = 642)
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field734++;
        if (arg5 == null) {
            return;
        }
        this.method494(arg2, (byte) -105, arg0);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method509(true, arg3 - (this.field718.method992(arg5, (byte) -53) / arg7), null, arg5, null, var12, arg1, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[Loia;Ljava/lang/String;[II)V", line = 678)
    public final void method508(int arg0, int arg1, int arg2, int arg3, class88[] arg4, String arg5, int[] arg6, int arg7) {
        field731++;
        if (arg2 <= 96) {
            this.field726 = null;
        }
        if (arg5 != null) {
            this.method494(arg1, (byte) -116, arg0);
            this.method503(arg5, null, arg4, 0, arg3, 0, 36, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lqm;)V", line = 694)
    public class59(class58 arg0, class143 arg1) {
        this.field718 = arg1;
        this.field726 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI[ILjava/lang/String;[Loia;[II[I)V", line = 712)
    private final void method509(boolean arg0, int arg1, int[] arg2, String arg3, class88[] arg4, int[] arg5, int arg6, int[] arg7) {
        int var9 = arg6 - this.field718.field2035;
        field719++;
        int var10 = -1;
        if (!arg0) {
            return;
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class272.method1774(arg3.charAt(var14), -8910) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg3.substring(var10 + 1, var14);
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
                                    if (arg2 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg2[var12];
                                    }
                                    int var18;
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var12];
                                    }
                                    var12++;
                                    int var19 = class325.method2121(var16.substring(4), -23213);
                                    class88 var20 = arg4[var19];
                                    int var21 = arg7 == null ? var20.method670() : arg7[var19];
                                    var20.method672(arg1 + var17, var9 - var21 - -var18 + this.field718.field2035, 1, 0, 1);
                                    var11 = -1;
                                    arg1 += arg4[var19].method656();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method496(var16, 1937763080);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field718.method995(var11, false, var15);
                    }
                    int var22;
                    if (arg2 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg2[var12];
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var12];
                    }
                    if (var15 != ' ') {
                        if ((class598.field8407 & 0xFF000000) != 0) {
                            this.method104(var15, arg1 + var22 + 1, var9 + 1 + var23, class598.field8407, true);
                        }
                        this.method104(var15, arg1 + var22, var9 + var23, class392.field5547, false);
                    } else if (class291.field4099 > 0) {
                        class469.field6655 += class291.field4099;
                        arg1 += class469.field6655 >> 8;
                        class469.field6655 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field718.method997(var15, 7125);
                    if (class673.field9121 != -1) {
                        this.field726.method458(arg1, (int) ((double) this.field718.field2035 * 0.7D) + var9, 8985, var24, class673.field9121);
                    }
                    if (class9.field133 != -1) {
                        this.field726.method458(arg1, this.field718.field2035 + var9, 8985, var24, class9.field133);
                    }
                    arg1 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[Loia;IILaa;IIIIII[ILjava/lang/String;B)I", line = 874)
    public final int method510(int arg0, int arg1, int arg2, class88[] arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, String arg14, byte arg15) {
        if (arg15 == 100) {
            field733++;
            return this.method500(0, 116, arg3, arg4, arg1, arg7, arg11, arg2, arg8, arg10, arg0, arg9, arg13, arg5, arg14, arg12, arg6);
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method102(char arg0, int arg1, int arg2, int arg3, boolean arg4, class486 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
