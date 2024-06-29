import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class366 extends class148 {

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Z")
    private boolean field5592 = true;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field5595 = 4096;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Lki;")
    public static class498 field5597;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "Z")
    public static boolean field5599;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Ldf;")
    public static class274 field5591;

    static {
        new class475("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field5597 = new class498(57, -1);
        new class475("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field5599 = false;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V", line = 5)
    public static void method2271(int arg0) {
        field5591 = null;
        if (arg0 != -2) {
            method2272(32, -114, -60);
        }
        field5597 = null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 27)
    public class366() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Ljava/lang/String;", line = 32)
    public static final String method2272(int arg0, int arg1, int arg2) {
        ++field5593;
        int var3 = -arg0 + arg1;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > arg2) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([IB[J)V", line = 71)
    public static final void method2273(int[] arg0, byte arg1, long[] arg2) {
        ++field5590;
        class246.method1657(-6474, arg2.length - 1, arg0, arg2, 0);
        if (arg1 >= -123) {
            method2274((byte) -52);
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)V", line = 82)
    public static final void method2274(byte arg0) {
        class307.method1935(false, arg0 ^ 69);
        ++field5594;
        if (arg0 == -51) {
            if (class91.field1366 >= 0 && ~class91.field1366 != -1) {
                class14.method91((byte) 121, class91.field1366);
                class91.field1366 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)[[I", line = 105)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field5589;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (!arg0) {
            method2271(-13);
        }
        if (super.field2189.field6033) {
            int[] var4 = this.method971(!arg0, class39.field569 & arg1 + -1, 0);
            int[] var5 = this.method971(!arg0, arg1, 0);
            int[] var6 = this.method971(false, arg1 + 1 & class39.field569, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class320.field4579; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field5595;
                int var12 = (var5[var10 + 1 & class304.field4339] + -var5[var10 - 1 & class304.field4339]) * this.field5595;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field5592) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILcn;Lqa;Ldt;Lum;IB)V", line = 188)
    public static final void method2275(int arg0, int arg1, class355 arg2, class162 arg3, class158 arg4, class362 arg5, int arg6, byte arg7) {
        ++field5596;
        int var8 = -(arg0 / 2) + arg2.field5466 - 5;
        int var9 = arg1 + 2;
        if (arg4.field2300 != 0) {
            arg3.method1087(var9, var8, 122, arg5.method2256() * arg6 + -var9 + arg1 - -1, arg4.field2300, arg0 + 10);
        }
        if (~arg4.field2332 != -1) {
            arg3.method1045(var8, var9, 1 + arg6 * arg5.method2256() + arg1 + -var9, 1, arg0 + 10, arg4.field2332);
        }
        int var10 = arg4.field2326;
        if (arg2.field5463 && ~arg4.field2307 != 0) {
            var10 = arg4.field2307;
        }
        for (int var11 = 0; ~arg6 < ~var11; ++var11) {
            String var12 = class34.field361[var11];
            if (arg6 - 1 > var11) {
                var12 = var12.substring(0, var12.length() + -4);
            }
            arg5.method2255(arg3, var12, arg2.field5466, arg1, var10, true);
            arg1 += arg5.method2256();
        }
        if (arg7 > -86) {
            field5598 = -54;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILdh;I)V", line = 232)
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = -80 % ((arg2 - -88) / 33);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field5592 = ~arg1.method1428(32122) == -2;
            }
        } else {
            this.field5595 = arg1.method1450((byte) 94);
        }
        ++field5588;
    }
}
