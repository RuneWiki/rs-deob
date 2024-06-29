import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class67 {

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lbq;")
    private class307 field924;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lha;")
    private class66 field922;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lkja;")
    public static class686 field920 = new class686();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V", line = 4)
    public final void method653(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field926++;
        if (arg1 == null) {
            return;
        }
        if (arg5 > -67) {
            this.field924 = null;
        }
        this.method667(arg4, arg2, (byte) 56);
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg6));
        }
        this.method661(null, arg7 - (this.field924.method1819(arg1, (byte) 117) / 2), null, null, var12, 1764630264, arg3, arg1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B[Ltf;IIII[ILjava/util/Random;Ljava/lang/String;III[III)I", line = 40)
    public final int method654(byte arg0, class312[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, Random arg7, String arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        field911++;
        if (arg8 == null) {
            return 0;
        }
        arg7.setSeed((long) arg2);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method667(arg9 & 0xFFFFFF | var16 << 24, var16 << 24 | arg10 & 0xFFFFFF, (byte) 38);
        int var17 = arg8.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg11;
        int var22 = this.field924.field3773 + arg13;
        if (arg0 != 67) {
            this.method664(-118, -76, null);
        }
        if (arg5 == 1) {
            var22 += (arg3 - (this.field924.field3773 + this.field924.field3769)) / 2;
        } else if (arg5 == 2) {
            var22 = arg3 + arg13 - this.field924.field3769;
        }
        int var23 = -1;
        if (arg4 == 1) {
            var23 = this.field924.method1819(arg8, (byte) 126) + var19;
            var21 = (arg14 - var23) / 2 + arg11;
        } else if (arg4 == 2) {
            var23 = var19 + this.field924.method1819(arg8, (byte) 119);
            var21 = arg14 + arg11 - var23;
        }
        this.method661(arg12, var21, arg1, var18, null, arg0 + 1764630197, var22, arg8);
        if (arg6 != null) {
            if (var23 == -1) {
                var23 = this.field924.method1819(arg8, (byte) -84) + var19;
            }
            arg6[0] = var21;
            arg6[2] = var23;
            arg6[1] = var22 - this.field924.field3773;
            arg6[3] = this.field924.field3773 + this.field924.field3769;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 125)
    public final void method655(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field912++;
        if (arg1 == null) {
            return;
        }
        if (arg5 != 62) {
            this.method659(63, null, -28, 22, 28, -98, (byte) 93);
        }
        this.method667(arg3, arg4, (byte) 65);
        this.method663(0, arg0, arg2, arg1, null, (byte) 118, 0, null, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ltf;IIII[IILjava/lang/String;)V", line = 141)
    public final void method656(class312[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, String arg7) {
        field923++;
        if (arg7 == null) {
            return;
        }
        this.method667(arg6, arg4, (byte) 104);
        if (arg3 != -1) {
            this.method668(123, 95, true, -71, -58, 19, -32, null, 9, -1, null, null, 112, null, -27, -35);
        }
        this.method663(0, arg2, arg1, arg7, arg0, (byte) 117, 0, null, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 158)
    public final void method657(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field928++;
        if (arg0 == null) {
            return;
        }
        this.method667(arg3, arg2, (byte) 80);
        this.method663(0, arg5 - (this.field924.method1819(arg0, (byte) -88) / 2), arg4, arg0, null, (byte) 120, 0, null, null);
        if (arg1 != -16777216) {
            this.field924 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 175)
    public static void method658(int arg0) {
        field920 = null;
        if (arg0 != -16777216) {
            method658(-72);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIB)V", line = 185)
    public final void method659(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field925++;
        if (arg1 == null) {
            return;
        }
        this.method667(arg0, arg4, (byte) 24);
        int var8 = arg1.length();
        if (arg6 != 72) {
            this.field922 = null;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg3 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method661(null, arg2 - (this.field924.method1819(arg1, (byte) -32) / 2), null, var9, var10, arg6 + 1764630192, arg5, arg1);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 221)
    public final void method660(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field919++;
        if (arg0 == null) {
            return;
        }
        this.method667(arg3, arg4, (byte) 20);
        if (arg5 > -4) {
            this.method655(73, null, -78, -125, 3, 59);
        }
        this.method663(0, arg2 - this.field924.method1819(arg0, (byte) -61), arg1, arg0, null, (byte) 118, 0, null, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([II[Ltf;[I[IIILjava/lang/String;)V", line = 239)
    private final void method661(int[] arg0, int arg1, class312[] arg2, int[] arg3, int[] arg4, int arg5, int arg6, String arg7) {
        field913++;
        int var9 = arg6 - this.field924.field3782;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class61.method526(arg7.charAt(var14), (byte) -102) & 0xFF);
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
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class445.method2623(0, var16.substring(4));
                                    class312 var20 = arg2[var19];
                                    int var21 = arg0 == null ? var20.method1636() : arg0[var19];
                                    var20.method240(arg1 + var17, var9 - -this.field924.field3782 + -var21 + var18, 1, 0, 1);
                                    arg1 += arg2[var19].method1634();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method662(var16, -28);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field924.method1809((byte) 120, var15, var11);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    if (var15 != ' ') {
                        if ((class410.field5374 & 0xFF000000) != 0) {
                            this.method226(var15, arg1 + var22 + 1, var23 + 1 + var9, class410.field5374, true);
                        }
                        this.method226(var15, arg1 + var22, var9 + var23, class56.field765, false);
                    } else if (class31.field498 > 0) {
                        class453.field6394 += class31.field498;
                        arg1 += class453.field6394 >> 8;
                        class453.field6394 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field924.method1814(var15, false);
                    if (class409.field5358 != -1) {
                        this.field922.method580(arg1, (int) ((double) this.field924.field3782 * 0.7D) + var9, -123, class409.field5358, var24);
                    }
                    if (class400.field5224 != -1) {
                        this.field922.method580(arg1, var9 + this.field924.field3782, -95, class400.field5224, var24);
                    }
                    arg1 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg5 != 1764630264) {
            field920 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 402)
    private final void method662(String arg0, int arg1) {
        field914++;
        if (arg1 >= 0) {
            this.method655(-41, null, -78, -53, -34, 78);
        }
        try {
            if (arg0.startsWith("col=")) {
                class56.field765 = class56.field765 & 0xFF000000 | class152.method1087(arg0.substring(4), 0, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class56.field765 = class456.field6418 & 0xFFFFFF | class56.field765 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class56.field765 = class152.method1087(arg0.substring(5), 0, 16);
            } else if (arg0.equals("/argb")) {
                class56.field765 = class456.field6418;
            } else if (arg0.startsWith("str=")) {
                class409.field5358 = class56.field765 & 0xFF000000 | class152.method1087(arg0.substring(4), 0, 16);
            } else if (arg0.equals("str")) {
                class409.field5358 = class56.field765 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class409.field5358 = -1;
            } else if (arg0.startsWith("u=")) {
                class400.field5224 = class56.field765 & 0xFF000000 | class152.method1087(arg0.substring(2), 0, 16);
            } else if (arg0.equals("u")) {
                class400.field5224 = class56.field765 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class400.field5224 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class410.field5374 = 0;
            } else if (arg0.startsWith("shad=")) {
                class410.field5374 = class56.field765 & 0xFF000000 | class152.method1087(arg0.substring(5), 0, 16);
                return;
            } else if (arg0.equals("shad")) {
                class410.field5374 = class56.field765 & 0xFF000000;
                return;
            } else if (arg0.equals("/shad")) {
                class410.field5374 = class47.field639;
                return;
            } else if (arg0.equals("br")) {
                this.method667(class456.field6418, class47.field639, (byte) 67);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;[Ltf;BILaa;[I)V", line = 479)
    private final void method663(int arg0, int arg1, int arg2, String arg3, class312[] arg4, byte arg5, int arg6, class513 arg7, int[] arg8) {
        field917++;
        int var10 = arg2 - this.field924.field3782;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        int var14 = 0;
        if (arg5 < 104) {
            this.field922 = null;
        }
        while (var14 < var13) {
            char var15 = (char) (class61.method526(arg3.charAt(var14), (byte) -102) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
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
                                        int var17 = class445.method2623(0, var16.substring(4));
                                        class312 var18 = arg4[var17];
                                        int var19 = arg8 == null ? var18.method1636() : arg8[var17];
                                        if ((class56.field765 & 0xFF000000) == -16777216) {
                                            var18.method240(arg1, var10 + this.field924.field3782 - var19, 1, 0, 1);
                                        } else {
                                            var18.method240(arg1, var10 - (var19 - this.field924.field3782), 0, class56.field765 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        var12 = -1;
                                        arg1 += arg4[var17].method1634();
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method662(var16, -76);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg1 += this.field924.method1809((byte) 125, var15, var12);
                        }
                        if (var15 == ' ') {
                            if (class31.field498 > 0) {
                                class453.field6394 += class31.field498;
                                arg1 += class453.field6394 >> 8;
                                class453.field6394 &= 0xFF;
                            }
                        } else if (arg7 == null) {
                            if ((class410.field5374 & 0xFF000000) != 0) {
                                this.method226(var15, arg1 + 1, var10 + 1, class410.field5374, true);
                            }
                            this.method226(var15, arg1, var10, class56.field765, false);
                        } else {
                            if ((class410.field5374 & 0xFF000000) != 0) {
                                this.method225(var15, arg1 + 1, var10 - -1, class410.field5374, true, arg7, arg6, arg0);
                            }
                            this.method225(var15, arg1, var10, class56.field765, false, arg7, arg6, arg0);
                        }
                        int var20 = this.field924.method1814(var15, false);
                        if (class409.field5358 != -1) {
                            this.field922.method580(arg1, (int) ((double) this.field924.field3782 * 0.7D) + var10, -125, class409.field5358, var20);
                        }
                        if (class400.field5224 != -1) {
                            this.field922.method580(arg1, this.field924.field3782 + var10 + 1, -113, class400.field5224, var20);
                        }
                        arg1 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V", line = 631)
    private final void method664(int arg0, int arg1, String arg2) {
        field915++;
        int var4 = 0;
        boolean var5 = false;
        if (arg1 >= -122) {
            this.method668(-25, -16, false, -89, 34, 83, 27, null, -31, -16, null, null, 58, null, 33, -18);
        }
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class31.field498 = (arg0 - this.field924.method1819(arg2, (byte) 112) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 670)
    public final void method665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field921++;
        if (arg0 != 13109) {
            field920 = null;
        }
        if (arg6 == null) {
            return;
        }
        this.method667(arg5, arg3, (byte) 31);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method661(null, arg4 - (this.field924.method1819(arg6, (byte) 119) / 2), null, null, var9, 1764630264, arg1, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ltf;IILjava/lang/String;IIIIIIIII[IBLaa;I)I", line = 696)
    public final int method666(class312[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, byte arg14, class513 arg15, int arg16) {
        field916++;
        if (arg3 == null) {
            return 0;
        }
        this.method667(arg1, arg12, (byte) 31);
        if (arg5 == 0) {
            arg5 = this.field924.field3782;
        }
        int[] var18;
        if (arg10 < this.field924.field3773 + arg5 + this.field924.field3769 && arg10 < arg5 + arg5) {
            var18 = null;
        } else {
            var18 = new int[] { arg16 };
        }
        int var19 = this.field924.method1818(62, var18, arg3, class264.field3131, arg0);
        if (arg7 == -1) {
            arg7 = arg10 / arg5;
            if (arg7 <= 0) {
                arg7 = 1;
            }
        }
        if (arg7 > 0 && arg7 <= var19) {
            var19 = arg7;
            class264.field3131[arg7 - 1] = this.field924.method1810(arg0, class264.field3131[arg7 - 1], arg16, true);
        }
        if (arg11 == 3 && var19 == 1) {
            arg11 = 1;
        }
        int var20;
        if (arg11 == 0) {
            var20 = arg6 + this.field924.field3773;
        } else if (arg11 == 1) {
            var20 = (arg10 - this.field924.field3773 - this.field924.field3769 - (var19 + -1) * arg5) / 2 + this.field924.field3773 + arg6;
        } else if (arg11 == 2) {
            var20 = arg10 + arg6 - this.field924.field3769 - ((var19 - 1) * arg5);
        } else {
            int var21 = (arg10 - this.field924.field3773 - this.field924.field3769 - ((var19 + -1) * arg5)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg5 += var21;
            var20 = arg6 - (-this.field924.field3773 - var21);
        }
        if (arg14 != -40) {
            this.field924 = null;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg9 == 0) {
                this.method663(arg4, arg2, var20, class264.field3131[var22], arg0, (byte) 125, arg8, arg15, arg13);
            } else if (arg9 == 1) {
                this.method663(arg4, (arg16 - this.field924.method1819(class264.field3131[var22], (byte) -29)) / 2 + arg2, var20, class264.field3131[var22], arg0, (byte) 117, arg8, arg15, arg13);
            } else if (arg9 == 2) {
                this.method663(arg4, arg2 + arg16 - this.field924.method1819(class264.field3131[var22], (byte) -38), var20, class264.field3131[var22], arg0, (byte) 119, arg8, arg15, arg13);
            } else if ((var19 - 1) == var22) {
                this.method663(arg4, arg2, var20, class264.field3131[var22], arg0, (byte) 122, arg8, arg15, arg13);
            } else {
                this.method664(arg16, -127, class264.field3131[var22]);
                this.method663(arg4, arg2, var20, class264.field3131[var22], arg0, (byte) 114, arg8, arg15, arg13);
                class31.field498 = 0;
            }
            var20 += arg5;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V", line = 798)
    private final void method667(int arg0, int arg1, byte arg2) {
        field927++;
        class400.field5224 = -1;
        class456.field6418 = arg0;
        class56.field765 = arg0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        if (arg2 < 17) {
            this.method225('\'', -20, -22, 99, false, null, -63, 80);
        }
        class31.field498 = 0;
        class453.field6394 = 0;
        class409.field5358 = -1;
        class47.field639 = arg1;
        class410.field5374 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIIIILjava/lang/String;II[Ltf;Laa;I[III)I", line = 821)
    public final int method668(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, String arg7, int arg8, int arg9, class312[] arg10, class513 arg11, int arg12, int[] arg13, int arg14, int arg15) {
        if (arg2) {
            this.field924 = null;
        }
        field929++;
        return this.method666(arg10, arg15, arg14, arg7, arg0, arg8, arg5, 0, arg4, arg3, arg9, arg6, arg1, arg13, (byte) -40, arg11, arg12);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lbq;)V", line = 834)
    public class67(class66 arg0, class307 arg1) {
        this.field924 = arg1;
        this.field922 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[Ltf;ILjava/lang/String;ILjava/util/Random;II)I", line = 849)
    public final int method669(int arg0, int arg1, int[] arg2, class312[] arg3, int arg4, String arg5, int arg6, Random arg7, int arg8, int arg9) {
        field918++;
        if (arg5 == null) {
            return 0;
        }
        arg7.setSeed((long) arg9);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method667(var11 << 24 | arg6 & 0xFFFFFF, arg0 & 0xFFFFFF | var11 << 24, (byte) 25);
        int var12 = arg5.length();
        if (arg4 < 51) {
            return 51;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method661(arg2, arg8, arg3, var13, null, 1764630264, arg1, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method225(char arg0, int arg1, int arg2, int arg3, boolean arg4, class513 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method226(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
