import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class332 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field4900 = 16;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public int field4908 = 8;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field4902 = -1;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
    public boolean field4909 = false;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public int field4903 = -1;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field4906 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
    public boolean field4914 = true;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
    public boolean field4905 = true;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field4917 = 127;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field4901 = 1190717;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field4922 = -1;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public int field4919 = 128;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "J")
    public static long field4918 = -1L;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "[I")
    public static int[] field4923;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "[I")
    public static int[] field4924;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Lef;")
    public class344 field4920;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "Z")
    public static boolean field4925;

    static {
        new class44("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field4923 = new int[8];
        new class44("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field4924 = new int[] { 1, 4 };
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BILwn;)V", line = 7)
    private final void method2099(byte arg0, int arg1, class519 arg2) {
        int var4 = -116 / ((arg0 + 6) / 34);
        field4916++;
        if (arg1 == 1) {
            this.field4906 = class149.method1052(arg2.method3040((byte) -3), -16711936);
        } else if (arg1 == 2) {
            this.field4922 = arg2.method3072((byte) -122);
        } else if (arg1 == 3) {
            this.field4922 = arg2.method3018(566990904);
            if (this.field4922 == 65535) {
                this.field4922 = -1;
            }
        } else if (arg1 == 5) {
            this.field4914 = false;
        } else if (arg1 == 7) {
            this.field4902 = class149.method1052(arg2.method3040((byte) -3), -16711936);
        } else if (arg1 == 8) {
            this.field4920.field5073 = this.field4904;
        } else if (arg1 == 9) {
            this.field4919 = arg2.method3018(566990904) << 0;
        } else if (arg1 == 10) {
            this.field4905 = false;
        } else if (arg1 == 11) {
            this.field4908 = arg2.method3072((byte) -119);
        } else if (arg1 == 12) {
            this.field4909 = true;
        } else if (arg1 == 13) {
            this.field4901 = arg2.method3040((byte) -3);
        } else if (arg1 == 14) {
            this.field4900 = arg2.method3072((byte) -121) << 0;
        } else if (arg1 == 15) {
            this.field4903 = arg2.method3018(566990904);
            if (this.field4903 == 65535) {
                this.field4903 = -1;
                return;
            }
            return;
        } else if (arg1 == 16) {
            this.field4917 = arg2.method3072((byte) -119);
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)Z", line = 85)
    public static final boolean method2100(int arg0, byte arg1, int arg2) {
        if (arg1 >= -30) {
            method2102(26, -28, 123, true, -3, -28, 102, 18);
        }
        field4907++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lqa;IILn;III[[[B[I[I[I[I[IIBIIZ)V", line = 103)
    public static final void method2101(class167 arg0, int arg1, int arg2, class15 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class141.field2179 = arg0;
        class442.field6292 = arg1;
        class98.field1538 = arg3;
        class530.field7833 = class141.field2179.method303() > 0;
        class295.field4418 = arg4 >> class322.field4795;
        class118.field1845 = arg6 >> class322.field4795;
        class510.field7387 = arg4;
        class14.field161 = arg6;
        class431.field6195 = arg5;
        class11.field111 = class295.field4418 - class272.field4085;
        if (class11.field111 < 0) {
            class107.field1612 = -class11.field111;
            class11.field111 = 0;
        } else {
            class107.field1612 = 0;
        }
        class27.field383 = class118.field1845 - class272.field4085;
        if (class27.field383 < 0) {
            class261.field3934 = -class27.field383;
            class27.field383 = 0;
        } else {
            class261.field3934 = 0;
        }
        class520.field7589 = class295.field4418 + class272.field4085;
        if (class520.field7589 > class394.field5608) {
            class520.field7589 = class394.field5608;
        }
        class56.field1010 = class272.field4085 + class118.field1845;
        if (class56.field1010 > class337.field5000) {
            class56.field1010 = class337.field5000;
        }
        for (int var18 = 0; var18 < class272.field4085 + class272.field4085 + 2; var18++) {
            for (int var23 = 0; var23 < class272.field4085 + class272.field4085 + 2; var23++) {
                int var24 = class295.field4418 + var18 - class272.field4085;
                int var25 = class118.field1845 + var23 - class272.field4085;
                if (var24 >= 0 && var25 >= 0 && var24 < class394.field5608 && var25 < class337.field5000) {
                    int var26 = var24 << class322.field4795;
                    int var27 = var25 << class322.field4795;
                    int var28 = class393.field5594[class393.field5594.length - 1].method156(var24, var25) - (0x3E8 << class322.field4795 - 7);
                    int var29 = class477.field6942 == null ? class393.field5594[0].method156(var24, var25) + class291.field4317 : class477.field6942[0].method156(var24, var25) + class291.field4317;
                    class214.field3232[var18][var23] = class141.field2179.method328(var26, var28, var27, var26, var29, var27);
                } else {
                    class214.field3232[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class272.field4085 + class272.field4085 + 1; var19++) {
            for (int var22 = 0; var22 < class272.field4085 + class272.field4085 + 1; var22++) {
                class334.field4958[var19][var22] = class214.field3232[var19][var22] || class214.field3232[var19 + 1][var22] || class214.field3232[var19][var22 + 1] || class214.field3232[var19 + 1][var22 + 1];
            }
        }
        class341.field5043 = arg8;
        class120.field1880 = arg9;
        class320.field4775 = arg10;
        class127.field1990 = arg11;
        class131.field2052 = arg12;
        class90.method667();
        class256.method1656(2213, class141.field2179);
        for (class166 var20 = (class166) class302.field4481.method904(false); var20 != null; var20 = (class166) class302.field4481.method907(-1)) {
            var20.method2429(121);
            class128.method944(false, var20);
        }
        if (class530.field7833) {
            for (int var21 = 0; var21 < class234.field3499; var21++) {
                client.field3117[var21].method959(arg1, arg17, (byte) 124);
            }
        }
        if (arg2 > 1) {
            class141.field2179.method213(0);
            if (class386.field5506 == null || class386.field5506 instanceof class106) {
                class386.field5506 = new class494();
            }
        } else if (class386.field5506 == null || class386.field5506 instanceof class494) {
            class386.field5506 = new class106();
        }
        class386.field5506.method780(-91, arg2);
        class386.field5506.method769(-94);
        if (class277.field4137 != null) {
            class193.method1317(true);
            class386.field5506.method770(22, -26602);
            class392.method2365(arg2, null, 0, (byte) 0, arg15, arg16);
            class386.field5506.method769(-94);
            class386.field5506.method770(23, -26602);
            class193.method1317(false);
        }
        class392.method2365(arg2, arg7, arg13, arg14, arg15, arg16);
        class386.field5506.method769(-107);
        class386.field5506.method777((byte) 123);
        class386.field5506.method769(-102);
        if (arg2 > 1) {
            class141.field2179.method192(0);
        }
        class141.field2179.method226(0, null);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZIIII)V", line = 258)
    public static final void method2102(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4899++;
        int var8 = arg1 + arg5;
        int var9 = arg7 - arg5;
        for (int var10 = arg1; var10 < var8; var10++) {
            class479.method2839(arg4, arg2, class271.field4078[var10], 82, arg6);
        }
        for (int var11 = arg7; var11 > var9; var11--) {
            class479.method2839(arg4, arg2, class271.field4078[var11], 95, arg6);
        }
        if (!arg3) {
            method2106(null, null, -61);
        }
        int var12 = arg2 + arg5;
        int var13 = arg4 - arg5;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class271.field4078[var14];
            class479.method2839(var12, arg2, var15, 83, arg6);
            class479.method2839(var13, var12, var15, 111, arg0);
            class479.method2839(arg4, var13, var15, 116, arg6);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 309)
    public final void method2103(byte arg0) {
        if (this.field4903 == -1) {
            this.field4903 = this.field4922;
        }
        if (arg0 != -65) {
            method2105(95, -30, 87, null, 10, -49, null, null);
        }
        field4910++;
        this.field4908 = this.field4904 | this.field4908 << 8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILka;III)Lem;", line = 325)
    public static final class154 method2104(int arg0, class336 arg1, int arg2, int arg3, int arg4) {
        field4912++;
        if (arg1 == null) {
            return null;
        } else {
            class154 var5 = new class154(arg3, arg0, arg2, arg1.method1150(), arg1.method1137(), arg1.method1164(), arg1.method1130(), arg1.method1147(), arg1.method1139(), arg1.method1160());
            int var6 = -111 % ((arg4 - 55) / 63);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILsg;IILku;Lki;)V", line = 355)
    public static final void method2105(int arg0, int arg1, int arg2, class279 arg3, int arg4, int arg5, class261 arg6, class510 arg7) {
        field4911++;
        if (arg0 <= 35) {
            return;
        }
        class211 var8 = new class211();
        var8.field3171 = arg2;
        var8.field3167 = arg1 << 7;
        var8.field3169 = arg5 << 7;
        if (arg6 != null) {
            var8.field3172 = arg6;
            int var10 = arg6.field3864;
            int var11 = arg6.field3859;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg6.field3859;
                var11 = arg6.field3864;
            }
            var8.field3178 = arg6.field3898;
            var8.field3182 = arg6.field3912;
            var8.field3187 = arg6.field3888;
            var8.field3176 = arg6.field3853;
            var8.field3170 = arg6.field3876;
            var8.field3180 = arg5 + var11 << 7;
            var8.field3188 = arg6.field3874 << 7;
            var8.field3177 = arg1 + var10 << 7;
            if (arg6.field3926 != null) {
                var8.field3166 = true;
                var8.method1421(123);
            }
            if (var8.field3176 != null) {
                var8.field3175 = var8.field3187 + ((int) ((double) (var8.field3182 - var8.field3187) * Math.random()));
            }
            class153.field2328.method866((byte) 10, var8);
        } else if (arg3 != null) {
            var8.field3168 = arg3;
            class311 var9 = arg3.field4157;
            if (var9.field4631 != null) {
                var8.field3166 = true;
                var9 = var9.method1972(class84.field1335, (byte) 99);
            }
            if (var9 != null) {
                var8.field3180 = var9.field4620 + arg5 << 7;
                var8.field3177 = arg1 + var9.field4620 << 7;
                var8.field3178 = class173.method1218(arg3, true);
                var8.field3170 = var9.field4587;
                var8.field3188 = var9.field4617 << 7;
            }
            class293.field4353.method866((byte) 10, var8);
        } else if (arg7 != null) {
            var8.field3179 = arg7;
            var8.field3177 = arg1 + arg7.method135((byte) 72) << 7;
            var8.field3180 = arg7.method135((byte) 72) + arg5 << 7;
            var8.field3178 = class182.method1263(2048, arg7);
            var8.field3170 = arg7.field7356;
            var8.field3188 = arg7.field7405 << 7;
            class462.field6679.method2292((long) arg7.field290, var8, (byte) -127);
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lth;[[BI)V", line = 448)
    public static final void method2106(class431 arg0, byte[][] arg1, int arg2) {
        if (arg2 > -111) {
            method2101(null, 112, 30, null, -28, 111, -115, null, null, null, null, null, null, -35, (byte) 96, -2, -73, true);
        }
        field4915++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field6023; var4++) {
            class259.method1668(8101);
            for (int var5 = 0; var5 < (class69.field1139 >> 3); var5++) {
                for (int var6 = 0; var6 < (class255.field3763 >> 3); var6++) {
                    int var7 = class320.field4754[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3D85627) >> 24;
                        if (!arg0.field6006 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class475.field6929.length; var13++) {
                                if (class475.field6929[var13] == var12 && arg1[var13] != null) {
                                    class519 var14 = new class519(arg1[var13]);
                                    arg0.method2519(var9, var10, var11, var6 * 8, var5 * 8, var4, false, var14, class19.field213, var8);
                                    arg0.method2555(var3[0] == -1 ? var3 : null, var6 * 8, var14, var9, class76.field1256, var8, (byte) -39, var11, var4, var10, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class391.field5551 = class175.field2614.method1021(class59.field1057, var3[3], var3[1], var3[2], var3[0], -105);
            class358.field5198 = var3[4];
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 531)
    public static void method2107(byte arg0) {
        field4923 = null;
        field4924 = null;
        int var1 = 56 / ((arg0 - 30) / 43);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lwn;I)V", line = 580)
    public final void method2108(class519 arg0, int arg1) {
        field4913++;
        if (arg1 != -1) {
            field4923 = null;
        }
        while (true) {
            int var3 = arg0.method3072((byte) -127);
            if (var3 == 0) {
                return;
            }
            this.method2099((byte) -58, var3, arg0);
        }
    }
}
