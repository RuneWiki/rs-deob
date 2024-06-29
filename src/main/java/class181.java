import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class181 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Loa;")
    private class605 field2231;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lcq;")
    private class402 field2236;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "F")
    public static float field2223;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lxa;")
    public static class433 field2229;

    static {
        new class474("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 14)
    private final void method1028(int arg0, int arg1, int arg2) {
        class628.field9074 = -1;
        class644.field9276 = -1;
        class458.field6842 = 0;
        if (arg0 == arg1) {
            arg1 = 0;
        }
        class488.field7121 = 0;
        class615.field8950 = arg2;
        class555.field7891 = arg2;
        field2233++;
        class464.field6902 = arg1;
        class571.field8248 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILfa;IIILjava/lang/String;[Lxa;[IIII)I", line = 31)
    public final int method1029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8, int arg9, String arg10, class433[] arg11, int[] arg12, int arg13, int arg14, int arg15) {
        field2221++;
        int var17 = 51 % ((57 - arg1) / 37);
        return this.method1045(arg12, arg5, arg4, arg7, arg8, arg14, 0, arg3, arg0, arg6, arg9, arg11, arg15, arg10, arg2, arg13, -16777216);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V", line = 42)
    public final void method1030(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2238++;
        if (arg1 == null) {
            return;
        }
        if (arg5) {
            method1040(-127, (byte) 71);
        }
        this.method1028(-1, arg6, arg4);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1041(var10, arg1, null, arg3, 126, var9, arg2 - (this.field2236.method2554(arg1, (byte) 0) / 2), null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 75)
    public final void method1031(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 26404) {
            field2229 = null;
        }
        field2232++;
        if (arg2 != null) {
            this.method1028(arg4 - 26405, arg3, arg0);
            this.method1043(null, arg2, arg5 - this.field2236.method2554(arg2, (byte) 0) / 2, 0, -94, null, null, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 92)
    public static void method1032(boolean arg0) {
        if (!arg0) {
            field2229 = null;
        }
        field2229 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lxa;IILjava/util/Random;I[II[IIIIIBLjava/lang/String;)I", line = 103)
    public final int method1033(int arg0, class433[] arg1, int arg2, int arg3, Random arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, String arg14) {
        field2230++;
        if (arg14 == null) {
            return 0;
        }
        arg4.setSeed((long) arg11);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method1028(-1, arg10 & 0xFFFFFF | var16 << 24, arg3 & 0xFFFFFF | var16 << 24);
        int var17 = -31 % ((arg13 - 56) / 51);
        int var18 = arg14.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg4.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg12;
        int var23 = this.field2236.field6073 + arg0;
        int var24 = -1;
        if (arg9 == 1) {
            var23 += (arg2 - this.field2236.field6073 - this.field2236.field6077) / 2;
        } else if (arg9 == 2) {
            var23 = arg0 + arg2 - this.field2236.field6077;
        }
        if (arg7 == 1) {
            var24 = var20 + this.field2236.method2554(arg14, (byte) 0);
            var22 = (arg5 - var24) / 2 + arg12;
        } else if (arg7 == 2) {
            var24 = var20 + this.field2236.method2554(arg14, (byte) 0);
            var22 = arg5 + arg12 - var24;
        }
        this.method1041(null, arg14, arg6, var23, 127, var19, var22, arg1);
        if (arg8 != null) {
            if (var24 == -1) {
                var24 = this.field2236.method2554(arg14, (byte) 0) + var20;
            }
            arg8[0] = var22;
            arg8[2] = var24;
            arg8[1] = var23 - this.field2236.field6073;
            arg8[3] = this.field2236.field6073 + this.field2236.field6077;
        }
        return var20;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 181)
    public final void method1034(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field2234++;
        if (arg2 == null) {
            return;
        }
        this.method1028(-1, arg4, arg3);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        if (arg1 > -37) {
            field2223 = 1.9781523F;
        }
        this.method1041(var9, arg2, null, arg6, 122, null, arg5 - (this.field2236.method2554(arg2, (byte) 0) / 2), null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;Ljava/lang/String;[IIIIII)V", line = 210)
    public final void method1035(class433[] arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2240++;
        if (arg1 != null && arg4 == 62) {
            this.method1028(arg4 ^ 0xFFFFFFC1, arg3, arg6);
            this.method1043(arg2, arg1, arg7, 0, -83, arg0, null, arg5, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 225)
    public final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field2239++;
        if (arg6 == null) {
            return;
        }
        this.method1028(arg0, arg4, arg7);
        double var9 = 7.0D - ((double) arg3 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg1));
        }
        this.method1041(var12, arg6, null, arg5, 120, null, arg2 - this.field2236.method2554(arg6, (byte) 0) / 2, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;)V", line = 256)
    private final void method1037(int arg0, int arg1, String arg2) {
        field2227++;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 != -19519) {
            this.field2231 = null;
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
            class458.field6842 = (arg1 - this.field2236.method2554(arg2, (byte) 0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;", line = 295)
    public static final Class method1038(String arg0, boolean arg1) throws ClassNotFoundException {
        field2222++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg1) {
            return null;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 335)
    private final void method1039(String arg0, byte arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class555.field7891 = class555.field7891 & 0xFF000000 | class541.method3142(arg0.substring(4), 16, 0) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class555.field7891 = class555.field7891 & 0xFF000000 | class615.field8950 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class555.field7891 = class541.method3142(arg0.substring(5), 16, 0);
            } else if (arg0.equals("/argb")) {
                class555.field7891 = class615.field8950;
            } else if (arg0.startsWith("str=")) {
                class644.field9276 = class555.field7891 & 0xFF000000 | class541.method3142(arg0.substring(4), 16, 0);
            } else if (arg0.equals("str")) {
                class644.field9276 = class555.field7891 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class644.field9276 = -1;
            } else if (arg0.startsWith("u=")) {
                class628.field9074 = class555.field7891 & 0xFF000000 | class541.method3142(arg0.substring(2), 16, 0);
            } else if (arg0.equals("u")) {
                class628.field9074 = class555.field7891 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class628.field9074 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class571.field8248 = 0;
            } else if (arg0.startsWith("shad=")) {
                class571.field8248 = class555.field7891 & 0xFF000000 | class541.method3142(arg0.substring(5), 16, 0);
            } else if (arg0.equals("shad")) {
                class571.field8248 = class555.field7891 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class571.field8248 = class464.field6902;
            } else if (arg0.equals("br")) {
                this.method1028(-1, class464.field6902, class615.field8950);
            }
        } catch (Exception var4) {
        }
        int var3 = 39 / ((-arg1 - 55) / 43);
        field2220++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lraa;", line = 412)
    public static final class528 method1040(int arg0, byte arg1) {
        field2241++;
        class528[] var2 = class572.method3327(true);
        if (arg1 != 119) {
            field2223 = 0.6603787F;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class528 var4 = var2[var3];
            if (var4.field7648 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([ILjava/lang/String;[III[II[Lxa;)V", line = 442)
    private final void method1041(int[] arg0, String arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, class433[] arg7) {
        if (arg4 < 115) {
            field2229 = null;
        }
        field2224++;
        int var9 = arg3 - this.field2236.field6079;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class479.method2919(arg1.charAt(var14), -6030) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    if (arg5 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg5[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class575.method3340((byte) 61, var16.substring(4));
                                    class433 var20 = arg7[var19];
                                    int var21 = arg2 == null ? var20.method1568() : arg2[var19];
                                    var20.method1571(arg6 + var17, -var21 + var18 + var9 - -this.field2236.field6079, 1, 0, 1);
                                    arg6 += arg7[var19].method1577();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1039(var16, (byte) -105);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field2236.method2553(var15, var11, (byte) -111);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    if (var15 != ' ') {
                        if ((class571.field8248 & 0xFF000000) != 0) {
                            this.method69(var15, arg6 + var22 + 1, var9 - -1 + var23, class571.field8248, true);
                        }
                        this.method69(var15, arg6 + var22, var9 + var23, class555.field7891, false);
                    } else if (class458.field6842 > 0) {
                        class488.field7121 += class458.field6842;
                        arg6 += class488.field7121 >> 8;
                        class488.field7121 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field2236.method2555(var15, 57);
                    if (class644.field9276 != -1) {
                        this.field2231.method3521(arg6, var24, class644.field9276, 2, var9 + ((int) ((double) this.field2236.field6079 * 0.7D)));
                    }
                    if (class628.field9074 != -1) {
                        this.field2231.method3521(arg6, var24, class628.field9074, 2, this.field2236.field6079 + var9);
                    }
                    var11 = var15;
                    arg6 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 606)
    public final void method1042(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field2228++;
        if (arg3 == null) {
            return;
        }
        if (arg4 <= 100) {
            this.method1039(null, (byte) -56);
        }
        this.method1028(-1, arg2, arg0);
        this.method1043(null, arg3, arg1 - this.field2236.method2554(arg3, (byte) 0), 0, -126, null, null, arg5, 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([ILjava/lang/String;III[Lxa;Lfa;II)V", line = 622)
    private final void method1043(int[] arg0, String arg1, int arg2, int arg3, int arg4, class433[] arg5, class199 arg6, int arg7, int arg8) {
        int var10 = arg7 - this.field2236.field6079;
        field2226++;
        int var11 = -1;
        if (arg4 >= -82) {
            return;
        }
        int var12 = -1;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class479.method2919(arg1.charAt(var14), -6030) & 0xFF);
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
                                    int var17 = class575.method3340((byte) 83, var16.substring(4));
                                    class433 var18 = arg5[var17];
                                    int var19 = arg0 == null ? var18.method1568() : arg0[var17];
                                    if ((class555.field7891 & 0xFF000000) == -16777216) {
                                        var18.method1571(arg2, var10 + this.field2236.field6079 - var19, 1, 0, 1);
                                    } else {
                                        var18.method1571(arg2, this.field2236.field6079 + var10 - var19, 0, class555.field7891 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg2 += arg5[var17].method1577();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1039(var16, (byte) 6);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg2 += this.field2236.method2553(var15, var12, (byte) -123);
                    }
                    if (var15 == ' ') {
                        if (class458.field6842 > 0) {
                            class488.field7121 += class458.field6842;
                            arg2 += class488.field7121 >> 8;
                            class488.field7121 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class571.field8248 & 0xFF000000) != 0) {
                            this.method69(var15, arg2 + 1, var10 + 1, class571.field8248, true);
                        }
                        this.method69(var15, arg2, var10, class555.field7891, false);
                    } else {
                        if ((class571.field8248 & 0xFF000000) != 0) {
                            this.method73(var15, arg2 + 1, var10 + 1, class571.field8248, true, arg6, arg3, arg8);
                        }
                        this.method73(var15, arg2, var10, class555.field7891, false, arg6, arg3, arg8);
                    }
                    int var20 = this.field2236.method2555(var15, 83);
                    if (class644.field9276 != -1) {
                        this.field2231.method3521(arg2, var20, class644.field9276, 2, (int) ((double) this.field2236.field6079 * 0.7D) + var10);
                    }
                    if (class628.field9074 != -1) {
                        this.field2231.method3521(arg2, var20, class628.field9074, 2, this.field2236.field6079 + var10 + 1);
                    }
                    arg2 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Lcq;)V", line = 774)
    public class181(class605 arg0, class402 arg1) {
        this.field2231 = arg0;
        this.field2236 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;ILjava/util/Random;BI[Lxa;I[I)I", line = 783)
    public final int method1044(int arg0, int arg1, String arg2, int arg3, Random arg4, byte arg5, int arg6, class433[] arg7, int arg8, int[] arg9) {
        field2235++;
        if (arg2 == null) {
            return 0;
        }
        arg4.setSeed((long) arg3);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method1028(-1, var11 << 24 | arg8 & 0xFFFFFF, var11 << 24 | arg1 & 0xFFFFFF);
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1041(null, arg2, arg9, arg0, 121, var13, arg6, arg7);
        int var16 = 93 % ((19 - arg5) / 43);
        return var14;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIIIIIIILfa;I[Lxa;ILjava/lang/String;III)I", line = 821)
    public final int method1045(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class199 arg9, int arg10, class433[] arg11, int arg12, String arg13, int arg14, int arg15, int arg16) {
        field2225++;
        if (arg13 == null) {
            return 0;
        }
        this.method1028(arg16 + 16777215, arg5, arg1);
        if (arg4 == 0) {
            arg4 = this.field2236.field6079;
        }
        int[] var18;
        if (arg7 < (this.field2236.field6077 + this.field2236.field6073 + arg4) && (arg4 + arg4) > arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg12 };
        }
        int var19 = this.field2236.method2561(arg13, var18, (byte) -109, arg11, class576.field8326);
        if (arg6 == -1) {
            arg6 = arg7 / arg4;
            if (arg6 <= 0) {
                arg6 = 1;
            }
        }
        if (arg6 > 0 && arg6 <= var19) {
            var19 = arg6;
            class576.field8326[arg6 - 1] = this.field2236.method2556(arg12, arg11, class576.field8326[arg6 - 1], arg16 + 16777215);
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field2236.field6073 + arg14;
        } else if (arg8 == 1) {
            var21 = (arg7 - this.field2236.field6073 - this.field2236.field6077 - ((var19 + -1) * arg4)) / 2 + this.field2236.field6073 + arg14;
        } else if (arg8 == 2) {
            var21 = arg7 + arg14 - ((var19 - 1) * arg4) - this.field2236.field6077;
        } else {
            int var20 = (arg7 - this.field2236.field6077 - this.field2236.field6073 - (var19 + -1) * arg4) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg4 += var20;
            var21 = this.field2236.field6073 + arg14 + var20;
        }
        if (arg16 != -16777216) {
            field2229 = null;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg3 == 0) {
                this.method1043(arg0, class576.field8326[var22], arg10, arg2, -128, arg11, arg9, var21, arg15);
            } else if (arg3 == 1) {
                this.method1043(arg0, class576.field8326[var22], arg10 + (arg12 - this.field2236.method2554(class576.field8326[var22], (byte) 0)) / 2, arg2, -115, arg11, arg9, var21, arg15);
            } else if (arg3 == 2) {
                this.method1043(arg0, class576.field8326[var22], arg12 + (arg10 - this.field2236.method2554(class576.field8326[var22], (byte) 0)), arg2, -103, arg11, arg9, var21, arg15);
            } else if (var19 - 1 == var22) {
                this.method1043(arg0, class576.field8326[var22], arg10, arg2, -88, arg11, arg9, var21, arg15);
            } else {
                this.method1037(arg16 ^ 0xFFB3C1, arg12, class576.field8326[var22]);
                this.method1043(arg0, class576.field8326[var22], arg10, arg2, arg16 + 16777125, arg11, arg9, var21, arg15);
                class458.field6842 = 0;
            }
            var21 += arg4;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IILjava/lang/String;III)V", line = 931)
    public final void method1046(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field2237++;
        if (arg0 != -8500) {
            method1032(true);
        }
        if (arg2 != null) {
            this.method1028(-1, arg4, arg3);
            this.method1043(null, arg2, arg5, 0, -122, null, null, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method73(char arg0, int arg1, int arg2, int arg3, boolean arg4, class199 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method69(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
