import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class198 extends class467 {

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "S")
    public short field2795;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lcm;")
    public static class449 field2798;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lpg;")
    public static class492 field2801;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static final void method1385(boolean arg0) {
        field2794++;
        int var1 = class442.field6574;
        int[] var2 = class320.field4896;
        for (int var3 = 0; var3 < var1; var3++) {
            class322 var7 = class439.field6539[var2[var3]];
            if (var7 != null && var7.field5318 > 0) {
                var7.field5318--;
                if (var7.field5318 == 0) {
                    var7.field5327 = null;
                }
            }
        }
        if (arg0) {
            field2799 = 103;
        }
        for (int var4 = 0; var4 < class25.field411; var4++) {
            int var5 = class259.field3609[var4];
            class194 var6 = class151.field2174[var5];
            if (var6 != null && var6.field5318 > 0) {
                var6.field5318--;
                if (var6.field5318 == 0) {
                    var6.field5327 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII[BI[B)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, byte[] arg8) {
        if (arg3 > -67) {
            return;
        }
        field2793++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg6[arg2++];
                int var14 = arg0++;
                arg8[var14] += arg6[arg2++];
                int var15 = arg0++;
                arg8[var15] += arg6[arg2++];
                int var16 = arg0++;
                arg8[var16] += arg6[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg6[arg2++];
            }
            arg2 += arg5;
            arg0 += arg4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class198() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([Ljb;ZI)V")
    public static final void method1387(class499[] arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1388(-115, 74);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class499 var4 = arg0[var3];
            if (var4 != null && var4.field7322 == arg2 && !client.method452(var4)) {
                if (var4.field7355 == 0) {
                    method1387(arg0, arg1, var4.field7312);
                    if (var4.field7423 != null) {
                        method1387(var4.field7423, false, var4.field7312);
                    }
                    class407 var5 = (class407) class27.field449.method943((long) var4.field7312, -1);
                    if (var5 != null) {
                        class201.method1404(var5.field6155, 96);
                    }
                }
                if (var4.field7355 == 6 && var4.field7438 != -1) {
                    class270 var6 = class260.field3621.method1934(119, var4.field7438);
                    if (var6 != null) {
                        var4.field7287 += class501.field7485;
                        while (var4.field7287 > var6.field3746[var4.field7412]) {
                            var4.field7287 -= var6.field3746[var4.field7412];
                            var4.field7412++;
                            if (var6.field3765.length <= var4.field7412) {
                                var4.field7412 -= var6.field3737;
                                if (var4.field7412 < 0 || var4.field7412 >= var6.field3765.length) {
                                    var4.field7412 = 0;
                                }
                            }
                            var4.field7335 = var4.field7412 + 1;
                            if (var4.field7335 >= var6.field3765.length) {
                                var4.field7335 -= var6.field3737;
                                if (var4.field7335 < 0 || var4.field7335 >= var6.field3765.length) {
                                    var4.field7335 = -1;
                                }
                            }
                            class338.method2189((byte) 126, var4);
                        }
                    }
                }
            }
        }
        field2792++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lud;")
    public static final class63 method1388(int arg0, int arg1) {
        field2796++;
        int var2 = 6 / ((arg1 + 11) / 63);
        class63[] var3 = class509.method3034(false);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class63 var5 = var3[var4];
            if (var5.field893 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2797++;
        int var6 = 0;
        if (!arg4) {
            method1389(-95, -26, -109, -6, false, -85);
        }
        int var7 = arg2;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        class271.method1736(arg0 + arg1, arg3, arg1 - arg0, -11, class23.field356[arg5]);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class271.method1736(var23, arg3, var24, -11, class23.field356[var21]);
            class271.method1736(var23, arg3, var24, -11, class23.field356[var22]);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(S)V")
    public class198(short arg0) {
        this.field2795 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        if (arg0 != 120) {
            field2798 = null;
        }
        field2798 = null;
        field2801 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1391(int arg0) {
        field2800++;
        class338.method2189((byte) 105, class362.field5615);
        class102.field1457++;
        if (class111.field1560 && class181.field2577) {
            int var1 = class346.field5419.method812(false);
            int var2 = class346.field5419.method811(false);
            int var3 = var1 - class103.field1475;
            int var4 = var2 - class460.field6750;
            if (arg0 != 1952301889) {
                field2799 = 35;
            }
            if (var3 < class441.field6562) {
                var3 = class441.field6562;
            }
            if (var4 < class354.field5495) {
                var4 = class354.field5495;
            }
            if ((var3 + class362.field5615.field7348) > (class441.field6562 + class439.field6543.field7348)) {
                var3 = class441.field6562 + class439.field6543.field7348 - class362.field5615.field7348;
            }
            if ((class354.field5495 + class439.field6543.field7386) < (class362.field5615.field7386 + var4)) {
                var4 = class439.field6543.field7386 + class354.field5495 - class362.field5615.field7386;
            }
            int var5 = class439.field6543.field7418 + var3 - class441.field6562;
            int var6 = var4 + class439.field6543.field7389 - class354.field5495;
            if (class346.field5419.method810(-2)) {
                if (class102.field1457 > class362.field5615.field7365) {
                    int var7 = var3 - class106.field1506;
                    int var8 = var4 - class101.field1453;
                    if (var7 > class362.field5615.field7302 || var7 < (-class362.field5615.field7302) || class362.field5615.field7302 < var8 || var8 < (-class362.field5615.field7302)) {
                        class237.field3370 = true;
                    }
                }
                if (class362.field5615.field7446 != null && class237.field3370) {
                    class199 var9 = new class199();
                    var9.field2813 = class362.field5615.field7446;
                    var9.field2803 = var5;
                    var9.field2817 = class362.field5615;
                    var9.field2814 = var6;
                    class291.method1886(var9);
                    return;
                }
            } else {
                if (class237.field3370) {
                    class457.method2749(-1);
                    if (class362.field5615.field7407 != null) {
                        class199 var10 = new class199();
                        var10.field2813 = class362.field5615.field7407;
                        var10.field2810 = class58.field775;
                        var10.field2814 = var6;
                        var10.field2817 = class362.field5615;
                        var10.field2803 = var5;
                        class291.method1886(var10);
                    }
                    if (class58.field775 != null && client.method447(class362.field5615) != null) {
                        class25.method203(class362.field5615, arg0 - 1952302009, class58.field775);
                    }
                } else if ((class299.field4423 == 1 || class115.method744((byte) -83)) && class12.field201 > 2) {
                    class492.method2919(arg0 - 1952301889, class460.field6750 + class101.field1453, class106.field1506 + class103.field1475);
                } else if (class106.method711(-81)) {
                    class492.method2919(0, class460.field6750 + class101.field1453, class106.field1506 + class103.field1475);
                }
                class362.field5615 = null;
            }
        } else if (class102.field1457 > 1) {
            class362.field5615 = null;
        }
    }

    static {
        new class375("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field2798 = new class449(14, 6);
        field2801 = new class492(27, 3);
    }
}
