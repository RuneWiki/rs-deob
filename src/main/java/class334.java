import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class334 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lku;")
    private class232 field4846 = new class232(256);

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Lb;")
    private class201 field4857;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
    public static int[] field4848 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "[[I")
    public static int[][] field4856 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method2106(int arg0) {
        field4847++;
        if (class30.field406 != null) {
            return;
        }
        class30.field406 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 <= 7) {
            method2114((class145) null, (byte) 121);
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class30.field406[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method2107(boolean arg0) {
        field4856 = null;
        field4848 = null;
        if (arg0) {
            method2110((class146) null, -27);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Luc;")
    public final class23 method2108(byte arg0, int arg1) {
        field4853++;
        class232 var3 = this.field4846;
        class23 var4;
        synchronized (this.field4846) {
            var4 = (class23) this.field4846.method1479(0, (long) arg1);
            int var5 = -107 / ((-arg0 - 54) / 32);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field4857.method1257(arg1, 26, 24558);
        class23 var7 = new class23();
        if (var6 != null) {
            var7.method167(new class276(var6), true);
        }
        class232 var8 = this.field4846;
        synchronized (this.field4846) {
            this.field4846.method1473(var7, (long) arg1, 110);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILmj;IIII)Ljava/awt/Frame;")
    public static final Frame method2109(int arg0, class430 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4858++;
        if (!arg1.method2546((byte) 115)) {
            return null;
        }
        if (arg0 == 0) {
            class150[] var6 = class277.method1755(arg1, -12867);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2240 == arg3 && var6[var8].field2241 == arg4 && (arg5 == 0 || var6[var8].field2236 == arg5) && (!var7 || arg0 < var6[var8].field2237)) {
                    arg0 = var6[var8].field2237;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class366 var9 = arg1.method2526(arg3, arg4, arg5, true, arg0);
        while (var9.field5253 == 0) {
            class111.method713(46, 10L);
        }
        Frame var10 = (Frame) var9.field5255;
        if (var10 == null) {
            return null;
        }
        if (arg2 >= -98) {
            field4859 = 20;
        }
        if (var9.field5253 == 2) {
            class201.method1227(false, var10, arg1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbj;I)V")
    public static final void method2110(class146 arg0, int arg1) {
        arg0.field2086 = false;
        field4852++;
        if (arg0.field2105 != -1) {
            class153 var2 = class64.field836.method2081(arg0.field2105, 0);
            if (var2 == null || var2.field2254 == null) {
                arg0.field2121 = false;
                arg0.field2105 = -1;
            } else {
                label305: {
                    arg0.field2130++;
                    if (arg0.field2082 < var2.field2254.length && var2.field2275[arg0.field2082] < arg0.field2130) {
                        arg0.field2130 = 1;
                        arg0.field2082++;
                        arg0.field2110++;
                        class237.method1508(arg0.field4319, (byte) 125, arg0.field4331, arg0.field2082, var2, arg0.field4317, class492.field6935 == arg0);
                    }
                    if (var2.field2254.length <= arg0.field2082) {
                        arg0.field2082 = 0;
                        arg0.field2130 = 0;
                        if (arg0.field2121) {
                            arg0.field2105 = arg0.method924((byte) -32).method2096(8868);
                            if (arg0.field2105 == -1) {
                                arg0.field2121 = false;
                                break label305;
                            }
                            var2 = class64.field836.method2081(arg0.field2105, 0);
                        }
                        class237.method1508(arg0.field4319, (byte) 2, arg0.field4331, arg0.field2082, var2, arg0.field4317, class492.field6935 == arg0);
                    }
                    arg0.field2110 = arg0.field2082 + 1;
                    if (arg0.field2110 >= var2.field2254.length) {
                        arg0.field2110 = 0;
                    }
                }
            }
        }
        if (arg0.field2147 != -1 && class353.field5090 >= arg0.field2096) {
            class327 var3 = class324.field4674.method1279(arg0.field2147, -2);
            int var4 = var3.field4714;
            if (var4 == -1) {
                arg0.field2147 = -1;
            } else {
                label307: {
                    class153 var5 = class64.field836.method2081(var4, 0);
                    if (var3.field4728) {
                        if (var5.field2286 == 3) {
                            if (arg0.field2160 > 0 && arg0.field2111 <= class353.field5090 && class353.field5090 > arg0.field2148) {
                                arg0.field2147 = -1;
                                break label307;
                            }
                        } else if (var5.field2286 == 1 && arg0.field2160 > 0 && arg0.field2111 <= class353.field5090 && class353.field5090 > arg0.field2148) {
                            arg0.field2096 = class353.field5090 + 1;
                            break label307;
                        }
                    }
                    if (var5 == null || var5.field2254 == null) {
                        arg0.field2147 = -1;
                    } else {
                        if (arg0.field2129 < 0) {
                            arg0.field2129 = 0;
                            class237.method1508(arg0.field4319, (byte) 124, arg0.field4331, 0, var5, arg0.field4317, class492.field6935 == arg0);
                        }
                        arg0.field2139++;
                        if (var5.field2254.length > arg0.field2129 && arg0.field2139 > var5.field2275[arg0.field2129]) {
                            arg0.field2129++;
                            arg0.field2139 = 1;
                            class237.method1508(arg0.field4319, (byte) -33, arg0.field4331, arg0.field2129, var5, arg0.field4317, class492.field6935 == arg0);
                        }
                        if (var5.field2254.length <= arg0.field2129) {
                            if (var3.field4728) {
                                arg0.field2129 -= var5.field2255;
                                arg0.field2119++;
                                if (arg0.field2119 >= var5.field2283) {
                                    arg0.field2147 = -1;
                                } else if (arg0.field2129 >= 0 && var5.field2254.length > arg0.field2129) {
                                    class237.method1508(arg0.field4319, (byte) 121, arg0.field4331, arg0.field2129, var5, arg0.field4317, class492.field6935 == arg0);
                                } else {
                                    arg0.field2147 = -1;
                                }
                            } else {
                                arg0.field2147 = -1;
                            }
                        }
                        arg0.field2115 = arg0.field2129 + 1;
                        if (var5.field2254.length <= arg0.field2115) {
                            if (var3.field4728) {
                                arg0.field2115 -= var5.field2255;
                                if (arg0.field2119 + 1 >= var5.field2283) {
                                    arg0.field2115 = -1;
                                } else if (arg0.field2115 < 0 || var5.field2254.length <= arg0.field2115) {
                                    arg0.field2115 = -1;
                                }
                            } else {
                                arg0.field2115 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -39) {
            field4848 = null;
        }
        if (arg0.field2080 != -1 && arg0.field2094 <= 1) {
            class153 var6 = class64.field836.method2081(arg0.field2080, 0);
            if (var6.field2286 == 3) {
                if (arg0.field2160 > 0 && arg0.field2111 <= class353.field5090 && class353.field5090 > arg0.field2148) {
                    arg0.field2080 = -1;
                }
            } else if (var6.field2286 == 1 && arg0.field2160 > 0 && class353.field5090 >= arg0.field2111 && class353.field5090 > arg0.field2148) {
                arg0.field2094 = 2;
            }
        }
        if (arg0.field2080 != -1 && arg0.field2094 == 0) {
            class153 var7 = class64.field836.method2081(arg0.field2080, 0);
            if (var7 == null || var7.field2254 == null) {
                arg0.field2080 = -1;
            } else {
                arg0.field2141++;
                if (arg0.field2134 < var7.field2254.length && var7.field2275[arg0.field2134] < arg0.field2141) {
                    arg0.field2141 = 1;
                    arg0.field2134++;
                    class237.method1508(arg0.field4319, (byte) 124, arg0.field4331, arg0.field2134, var7, arg0.field4317, class492.field6935 == arg0);
                }
                if (arg0.field2134 >= var7.field2254.length) {
                    arg0.field2081++;
                    arg0.field2134 -= var7.field2255;
                    if (arg0.field2081 >= var7.field2283) {
                        arg0.field2080 = -1;
                    } else if (arg0.field2134 >= 0 && arg0.field2134 < var7.field2254.length) {
                        class237.method1508(arg0.field4319, (byte) 124, arg0.field4331, arg0.field2134, var7, arg0.field4317, class492.field6935 == arg0);
                    } else {
                        arg0.field2080 = -1;
                    }
                }
                arg0.field2083 = arg0.field2134 + 1;
                if (arg0.field2083 >= var7.field2254.length) {
                    arg0.field2083 -= var7.field2255;
                    if (var7.field2283 <= (arg0.field2081 + 1)) {
                        arg0.field2083 = -1;
                    } else if (arg0.field2083 < 0 || arg0.field2083 >= var7.field2254.length) {
                        arg0.field2083 = -1;
                    }
                }
                arg0.field2086 = var7.field2257;
            }
        }
        if (arg0.field2094 > 0) {
            arg0.field2094--;
        }
        for (int var8 = 0; var8 < arg0.field2120.length; var8++) {
            class360 var9 = arg0.field2120[var8];
            if (var9 != null) {
                if (var9.field5178 > 0) {
                    var9.field5178--;
                } else {
                    class153 var10 = class64.field836.method2081(var9.field5177, 0);
                    if (var10 == null || var10.field2254 == null) {
                        arg0.field2120[var8] = null;
                    } else {
                        var9.field5176++;
                        if (var10.field2254.length > var9.field5181 && var9.field5176 > var10.field2275[var9.field5181]) {
                            var9.field5176 = 1;
                            var9.field5181++;
                            class237.method1508(arg0.field4319, (byte) 120, arg0.field4331, var9.field5181, var10, arg0.field4317, class492.field6935 == arg0);
                        }
                        if (var10.field2254.length <= var9.field5181) {
                            var9.field5181 -= var10.field2255;
                            var9.field5175++;
                            if (var10.field2283 <= var9.field5175) {
                                arg0.field2120[var8] = null;
                            } else if (var9.field5181 >= 0 && var9.field5181 < var10.field2254.length) {
                                class237.method1508(arg0.field4319, (byte) 118, arg0.field4331, var9.field5181, var10, arg0.field4317, class492.field6935 == arg0);
                            } else {
                                arg0.field2120[var8] = null;
                            }
                        }
                        var9.field5182 = var9.field5181 + 1;
                        if (var9.field5182 >= var10.field2254.length) {
                            var9.field5182 -= var10.field2255;
                            if ((var9.field5175 + 1) >= var10.field2283) {
                                var9.field5182 = -1;
                            } else if (var9.field5182 < 0 || var9.field5182 >= var10.field2254.length) {
                                var9.field5182 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)I")
    public static final int method2111(int arg0, int arg1, byte arg2) {
        if (arg2 != -108) {
            method2114((class145) null, (byte) 117);
        }
        field4851++;
        return arg1 == 4 || arg1 == 5 ? class200.field2911[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)V")
    public final void method2112(byte arg0, int arg1) {
        class232 var3 = this.field4846;
        synchronized (this.field4846) {
            this.field4846.method1486(438127120, arg1);
        }
        field4849++;
        if (arg0 != -48) {
            method2106(-22);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public final void method2113(byte arg0) {
        class232 var2 = this.field4846;
        synchronized (this.field4846) {
            int var3 = 68 / (arg0 / 57);
            this.field4846.method1475(0);
        }
        field4854++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ldt;B)Z")
    public static final boolean method2114(class145 arg0, byte arg1) {
        field4850++;
        if (class211.field3205 == arg0.field2062) {
            class146.field2155 = 250;
            return true;
        } else {
            if (arg1 <= 39) {
                method2111(-47, -49, (byte) 5);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class334(class353 arg0, int arg1, class201 arg2) {
        this.field4857 = arg2;
        this.field4857.method1235(0, 26);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public final void method2115(boolean arg0) {
        class232 var2 = this.field4846;
        synchronized (this.field4846) {
            this.field4846.method1478((byte) -119);
        }
        field4855++;
        if (!arg0) {
            field4859 = -121;
        }
    }

    static {
        new class326("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        new class326("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field4859 = 0;
    }
}
