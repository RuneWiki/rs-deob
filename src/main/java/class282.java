import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class282 extends Canvas {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field4032;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lgr;")
    public static class296 field4034;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4035;

    static {
        new class342("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field4034 = new class296(4, 16);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 4)
    public static void method1798(byte arg0) {
        field4034 = null;
        if (arg0 <= 99) {
            field4034 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1799(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class531.field7826 == 1) {
            class414.field6182[class343.field5162 / 100].method3137(class374.field5666 - 8, class90.field1558 + -8);
        }
        if (arg4 != 15341) {
            return;
        }
        field4033++;
        if (class531.field7826 == 2) {
            class414.field6182[(class343.field5162 / 100) + 4].method3137(class374.field5666 - 8, class90.field1558 - 8);
        }
        class183.method1286(arg4 ^ 0x5869);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIIIIBII)V", line = 44)
    public static final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, int arg13) {
        field4035++;
        if (class88.field1546 == null) {
            return;
        }
        class517 var15;
        if (arg10 < 0) {
            int var14 = -arg10 - 1;
            if (class148.field2368 == var14) {
                var15 = class139.field2224;
            } else {
                var15 = class183.field2747[var14];
            }
        } else {
            int var16 = arg10 - 1;
            var15 = class34.field668[var16];
        }
        if (var15 == null) {
            return;
        }
        class79 var17 = class319.field4807.method2874(arg12, -17045);
        int var18;
        int var19;
        if (arg3 == 1 || arg3 == 3) {
            var19 = var17.field1345;
            var18 = var17.field1384;
        } else {
            var18 = var17.field1345;
            var19 = var17.field1384;
        }
        int var20 = (var18 >> 1) + arg5;
        int var21 = (var18 + 1 >> 1) + arg5;
        int var22 = arg4 + (var19 >> 1);
        int var23 = arg4 + (var19 + 1 >> 1);
        class35 var24 = class88.field1546[arg9];
        int var25 = var24.method376(var20, var22) + var24.method376(var21, var22) + var24.method376(var20, var23) + var24.method376(var21, var23) >> 2;
        class155 var26 = new class155();
        var26.field2439 = arg7;
        var26.field2433 = arg3;
        if (arg11 != 101) {
            field4034 = null;
        }
        var26.field2436 = var15.field6232;
        if (arg1 > arg0) {
            int var27 = arg1;
            arg1 = arg0;
            arg0 = var27;
        }
        var26.field2445 = arg12;
        var26.field2440 = arg4;
        var26.field2441 = class531.field7821 + arg8;
        var26.field2448 = class531.field7821 + arg6;
        var26.field2430 = arg5;
        if (arg13 < arg2) {
            int var28 = arg2;
            arg2 = arg13;
            arg13 = var28;
        }
        var26.field2432 = arg5 + arg0;
        var26.field2434 = arg1 + arg5;
        var26.field2442 = arg2 + arg4;
        var26.field2444 = (var26.field2430 << 7) + (var18 << 6);
        var26.field2437 = arg4 + arg13;
        var26.field2431 = (var26.field2440 << 7) + (var19 << 6);
        var26.field2447 = var25;
        class55.field964.method2417(-127, var26);
        var15.field7689 = var26;
    }

    @OriginalMember(owner = "client!dg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 146)
    public final void paint(Graphics arg0) {
        field4028++;
        this.field4032.paint(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 156)
    public final void update(Graphics arg0) {
        field4031++;
        this.field4032.update(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIII)Ldk;", line = 164)
    public static final class352 method1801(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4029++;
        class352 var5 = new class352();
        var5.field5391 = arg1;
        var5.field5390 = arg4;
        class162.field2507.method166(var5, (long) arg2, 52);
        class36.method383(arg1, (byte) -37);
        class350 var6 = class319.method2075(true, arg2);
        if (arg3 != 0) {
            method1802(-106, false, null, 37);
        }
        if (var6 != null) {
            class302.method1902((byte) 35, var6);
        }
        if (class162.field2513 != null) {
            class302.method1902((byte) 68, class162.field2513);
            class162.field2513 = null;
        }
        class105.method794((byte) -124);
        if (var6 != null) {
            class292.method1842(119, !arg0, var6);
        }
        if (!arg0) {
            class437.method2612(arg1);
        }
        if (!arg0 && class364.field5513 != -1) {
            class116.method861(-1, 1, class364.field5513);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 207)
    public class282(Component arg0) {
        this.field4032 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLen;I)V", line = 215)
    public static final void method1802(int arg0, boolean arg1, class208 arg2, int arg3) {
        field4030++;
        if (!arg1 || arg2 == null || class339.field5122.field5929 == arg2) {
            return;
        }
        int var4 = arg2.field3003;
        int var5 = arg2.field3001;
        int var6 = arg2.field3005;
        int var7 = (int) arg2.field3012;
        long var8 = arg2.field3012;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 57) {
            class343.field5162 = 0;
            class90.field1558 = arg3;
            class531.field7826 = 2;
            class374.field5666 = arg0;
            class281.field4022++;
            class28.method321(class359.field5450, -5001);
            class410.field6141.method1095(-59, class347.field5187);
            class410.field6141.method1068((byte) -24, class63.field1086);
            class410.field6141.method1068((byte) -23, class139.field2224.field7669);
            class410.field6141.method1117(class383.field5790, (byte) 12);
            class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
        }
        if (var6 == 44) {
            class531.field7826 = 2;
            class343.field5162 = 0;
            class374.field5666 = arg0;
            class510.field7525++;
            class90.field1558 = arg3;
            class28.method321(class426.field6344, -5001);
            class410.field6141.method1095(-12, var7);
            class410.field6141.method1095(-81, class403.field6059 + var5);
            class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1094(1618659784, class200.field2931 + var4);
            class217.method1448(var5, var4, (byte) 74);
        }
        if (var6 == 17) {
            class256 var10 = class183.field2747[var7];
            if (var10 != null) {
                class90.field1558 = arg3;
                class388.field5838++;
                class374.field5666 = arg0;
                class531.field7826 = 2;
                class343.field5162 = 0;
                class28.method321(class370.field5610, -5001);
                class410.field6141.method1082(119, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1080(var7, 125);
                class222.method1475(true, var10.field7694[0], 0, var10.method1654(107), var10.method1654(77), -2, true, var10.field7692[0], 0);
            }
        }
        if (var6 == 2) {
            class90.field1558 = arg3;
            class531.field7826 = 2;
            class374.field5666 = arg0;
            class343.field5162 = 0;
            class296.field4204++;
            class28.method321(class299.field4257, -5001);
            class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1094(1618659784, var5 + class403.field6059);
            class410.field6141.method1095(-13, class200.field2931 + var4);
            class410.field6141.method1095(100, var7);
            class217.method1448(var5, var4, (byte) -77);
        }
        if (var6 == 25) {
            class255 var11 = class34.field668[var7];
            if (var11 != null) {
                class531.field7826 = 2;
                class343.field5162 = 0;
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class214.field3077++;
                class28.method321(class217.field3119, -5001);
                class410.field6141.method1080(var7, 125);
                class410.field6141.method1109(false, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var11.field7694[0], 0, var11.method1654(86), var11.method1654(99), -2, true, var11.field7692[0], 0);
            }
        }
        if (var6 == 15 && class162.field2513 == null) {
            class197.method1368(var4, var5, (byte) 56);
            class162.field2513 = class83.method649((byte) 108, var5, var4);
            class302.method1902((byte) 57, class162.field2513);
        }
        if (var6 == 58) {
            class255 var12 = class34.field668[var7];
            if (var12 != null) {
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class531.field7826 = 2;
                class470.field7022++;
                class343.field5162 = 0;
                class28.method321(class530.field7802, -5001);
                class410.field6141.method1095(-24, var7);
                class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var12.field7694[0], 0, var12.method1654(109), var12.method1654(110), -2, true, var12.field7692[0], 0);
            }
        }
        if (var6 == 30) {
            class256 var13 = class183.field2747[var7];
            if (var13 != null) {
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class531.field7826 = 2;
                class23.field474++;
                class343.field5162 = 0;
                class28.method321(class108.field1792, -5001);
                class410.field6141.method1068((byte) -41, var7);
                class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var13.field7694[0], 0, var13.method1654(126), var13.method1654(95), -2, true, var13.field7692[0], 0);
            }
        }
        if (var6 == 3) {
            class343.field5162 = 0;
            class90.field1558 = arg3;
            class80.field1404++;
            class531.field7826 = 2;
            class374.field5666 = arg0;
            class28.method321(class373.field5658, -5001);
            class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1080(var4 + class200.field2931, 127);
            class410.field6141.method1080(var7, 124);
            class410.field6141.method1094(1618659784, class403.field6059 + var5);
            class217.method1448(var5, var4, (byte) -56);
        }
        if (var6 == 48) {
            class343.field5162 = 0;
            class215.field3093++;
            class531.field7826 = 2;
            class374.field5666 = arg0;
            class90.field1558 = arg3;
            class28.method321(class106.field1767, -5001);
            class410.field6141.method1068((byte) -116, var4 + class200.field2931);
            class410.field6141.method1109(false, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1080(var7, 127);
            class410.field6141.method1068((byte) -22, class403.field6059 + var5);
            class217.method1448(var5, var4, (byte) 127);
        }
        if (var6 == 1004) {
            class374.field5666 = arg0;
            class343.field5162 = 0;
            class90.field1558 = arg3;
            class531.field7826 = 2;
            class255 var14 = class34.field668[var7];
            if (var14 != null) {
                class42 var15 = var14.field3677;
                if (var15.field797 != null) {
                    var15 = var15.method427(class335.field5059, (byte) -117);
                }
                if (var15 != null) {
                    class28.method321(class309.field4723, -5001);
                    class494.field7303++;
                    class410.field6141.method1094(1618659784, var15.field751);
                }
            }
        }
        if (var6 == 59) {
            if (class75.field1260 > 0 && class380.field5726.method1584(14, 82) && class380.field5726.method1584(14, 81)) {
                class470.method2794(true, class200.field2931 + var4, class403.field6059 - -var5, class139.field2224.field6232);
            } else {
                class226.field3213++;
                class343.field5162 = 0;
                class374.field5666 = arg0;
                class531.field7826 = 1;
                class90.field1558 = arg3;
                class28.method321(class277.field4000, -5001);
                class410.field6141.method1094(1618659784, class403.field6059 + var5);
                class410.field6141.method1094(1618659784, class200.field2931 + var4);
            }
        }
        if (var6 == 18) {
            class255 var16 = class34.field668[var7];
            if (var16 != null) {
                class531.field7826 = 2;
                class343.field5162 = 0;
                class90.field1558 = arg3;
                class433.field6432++;
                class374.field5666 = arg0;
                class28.method321(class394.field5953, -5001);
                class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1094(1618659784, var7);
                class222.method1475(true, var16.field7694[0], 0, var16.method1654(116), var16.method1654(115), -2, arg1, var16.field7692[0], 0);
            }
        }
        if (var6 == 1006) {
            class333.field5037++;
            class531.field7826 = 2;
            class374.field5666 = arg0;
            class90.field1558 = arg3;
            class343.field5162 = 0;
            class28.method321(class348.field5205, -5001);
            class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1094(1618659784, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class410.field6141.method1068((byte) -117, var4 + class200.field2931);
            class410.field6141.method1080(class403.field6059 + var5, 125);
            class271.method1748(var8, var5, var4, 6503);
        }
        if (var6 == 13) {
            class343.field5162 = 0;
            class90.field1558 = arg3;
            class531.field7826 = 2;
            class374.field5666 = arg0;
            class55.field954++;
            class28.method321(class457.field6850, -5001);
            class410.field6141.method1088(class383.field5790, -268435456);
            class410.field6141.method1068((byte) -122, class347.field5187);
            class410.field6141.method1094(1618659784, var7);
            class410.field6141.method1094(1618659784, class200.field2931 + var4);
            class410.field6141.method1068((byte) -119, class403.field6059 + var5);
            class410.field6141.method1082(97, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1095(0, class63.field1086);
            class217.method1448(var5, var4, (byte) -83);
        }
        if (var6 == 47) {
            class531.field7826 = 2;
            class343.field5162 = 0;
            class374.field5666 = arg0;
            class90.field1558 = arg3;
            class197.field2911++;
            class28.method321(class404.field6068, -5001);
            class410.field6141.method1094(1618659784, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class410.field6141.method1109(!arg1, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1095(126, class200.field2931 + var4);
            class410.field6141.method1095(-25, class403.field6059 + var5);
            class271.method1748(var8, var5, var4, 6503);
        }
        if (var6 == 60) {
            class374.field5666 = arg0;
            class343.field5162 = 0;
            class187.field2778++;
            class90.field1558 = arg3;
            class531.field7826 = 2;
            class28.method321(class151.field2404, -5001);
            class410.field6141.method1080((int) (var8 >>> 32) & Integer.MAX_VALUE, 125);
            class410.field6141.method1095(101, class403.field6059 + var5);
            class410.field6141.method1095(101, class200.field2931 + var4);
            class410.field6141.method1095(116, class347.field5187);
            class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1095(121, class63.field1086);
            class410.field6141.method1064(class383.field5790, 122);
            class271.method1748(var8, var5, var4, 6503);
        }
        if (var6 == 45) {
            class374.field5666 = arg0;
            class531.field7826 = 2;
            class343.field5162 = 0;
            class90.field1558 = arg3;
            class475.field7102++;
            class28.method321(class163.field2529, -5001);
            class410.field6141.method1068((byte) -94, class403.field6059 + var5);
            class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1068((byte) -95, var4 + class200.field2931);
            class410.field6141.method1068((byte) -38, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class271.method1748(var8, var5, var4, 6503);
        }
        if (var6 == 12) {
            class256 var17 = class183.field2747[var7];
            if (var17 != null) {
                class531.field7826 = 2;
                class343.field5162 = 0;
                class374.field5666 = arg0;
                class90.field1558 = arg3;
                class447.field6712++;
                class28.method321(class462.field6927, -5001);
                class410.field6141.method1080(var7, 124);
                class410.field6141.method1082(116, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var17.field7694[0], 0, var17.method1654(114), var17.method1654(95), -2, true, var17.field7692[0], 0);
            }
        }
        if (var6 == 46) {
            class531.field7826 = 1;
            class374.field5666 = arg0;
            class34.field665++;
            class343.field5162 = 0;
            class90.field1558 = arg3;
            class28.method321(class471.field7070, -5001);
            class410.field6141.method1068((byte) -53, class347.field5187);
            class410.field6141.method1088(class383.field5790, -268435456);
            class410.field6141.method1095(-68, class63.field1086);
            class410.field6141.method1095(108, class200.field2931 + var4);
            class410.field6141.method1094(1618659784, class403.field6059 + var5);
            class222.method1475(true, var5, 0, 1, 1, -4, arg1, var4, 0);
        }
        if (var6 == 51) {
            class255 var18 = class34.field668[var7];
            if (var18 != null) {
                class531.field7826 = 2;
                class374.field5666 = arg0;
                class253.field3615++;
                class90.field1558 = arg3;
                class343.field5162 = 0;
                class28.method321(class26.field576, -5001);
                class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1095(111, var7);
                class222.method1475(true, var18.field7694[0], 0, var18.method1654(92), var18.method1654(76), -2, true, var18.field7692[0], 0);
            }
        }
        if (var6 == 5) {
            class531.field7826 = 2;
            class343.field5162 = 0;
            class519.field7719++;
            class374.field5666 = arg0;
            class90.field1558 = arg3;
            class28.method321(class185.field2770, -5001);
            class410.field6141.method1080(class200.field2931 + var4, 124);
            class410.field6141.method1068((byte) -24, class403.field6059 + var5);
            class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1094(1618659784, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class271.method1748(var8, var5, var4, 6503);
        }
        if (var6 == 21) {
            class531.field7826 = 2;
            class90.field1558 = arg3;
            class343.field5162 = 0;
            class374.field5666 = arg0;
            class45.field840++;
            class28.method321(class183.field2748, -5001);
            class410.field6141.method1109(false, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1080(class200.field2931 + var4, 125);
            class410.field6141.method1094(1618659784, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class410.field6141.method1068((byte) -26, var5 + class403.field6059);
            class271.method1748(var8, var5, var4, 6503);
        }
        if (var6 == 16) {
            if (class75.field1260 > 0 && class380.field5726.method1584(14, 82) && class380.field5726.method1584(14, 81)) {
                class470.method2794(true, class200.field2931 + var4, class403.field6059 + var5, class139.field2224.field6232);
            } else {
                class466.method2766(var5, var7, 30412, var4);
                if (var7 == 1) {
                    class410.field6141.method1109(!arg1, -1);
                    class410.field6141.method1109(false, -1);
                    class410.field6141.method1094(1618659784, (int) class526.field7779);
                    class410.field6141.method1109(!arg1, 57);
                    class410.field6141.method1109(false, class255.field3674);
                    class410.field6141.method1109(false, class70.field1215);
                    class410.field6141.method1109(false, 89);
                    class410.field6141.method1094(1618659784, class139.field2224.field6228);
                    class410.field6141.method1094(1618659784, class139.field2224.field6233);
                    class410.field6141.method1109(false, 63);
                } else {
                    class90.field1558 = arg3;
                    class531.field7826 = 1;
                    class374.field5666 = arg0;
                    class343.field5162 = 0;
                }
                class222.method1475(true, var5, 0, 1, 1, -4, arg1, var4, 0);
            }
        }
        if (var6 == 49) {
            class255 var19 = class34.field668[var7];
            if (var19 != null) {
                class343.field5162 = 0;
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class461.field6908++;
                class531.field7826 = 2;
                class28.method321(class140.field2232, -5001);
                class410.field6141.method1117(class383.field5790, (byte) 12);
                class410.field6141.method1109(!arg1, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1080(class63.field1086, 124);
                class410.field6141.method1094(1618659784, class347.field5187);
                class410.field6141.method1080(var7, 127);
                class222.method1475(true, var19.field7694[0], 0, var19.method1654(119), var19.method1654(107), -2, true, var19.field7692[0], 0);
            }
        }
        if (var6 == 1010) {
            class343.field5162 = 0;
            class531.field7826 = 2;
            class90.field1558 = arg3;
            class163.field2528++;
            class374.field5666 = arg0;
            class28.method321(class55.field963, -5001);
            class410.field6141.method1094(1618659784, var7);
        }
        if (var6 == 22) {
            class256 var20 = class183.field2747[var7];
            if (var20 != null) {
                class185.field2762++;
                class531.field7826 = 2;
                class343.field5162 = 0;
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class28.method321(class459.field6875, -5001);
                class410.field6141.method1109(!arg1, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1080(var7, 127);
                class222.method1475(true, var20.field7694[0], 0, var20.method1654(105), var20.method1654(79), -2, arg1, var20.field7692[0], 0);
            }
        }
        if (var6 == 8) {
            class350 var21 = class83.method649((byte) 113, var5, var4);
            if (var21 != null) {
                class227.method1486(0);
                class250 var22 = client.method1349(var21);
                class474.method2838(var22.method1607(-1), -11, var22.field3578, var21);
                class432.field6423 = class449.method2683(-1, var21);
                class1.field7 = var21.field5305 + "<col=ffffff>";
                if (class432.field6423 == null) {
                    class432.field6423 = "Null";
                }
            }
            return;
        }
        if (var6 == 50) {
            class350 var23 = class83.method649((byte) 99, var5, var4);
            if (var23 != null) {
                class277.method1767(true, var23);
            }
        }
        if (var6 == 4) {
            class256 var24 = class183.field2747[var7];
            if (var24 != null) {
                class343.field5162 = 0;
                class531.field7826 = 2;
                class268.field3866++;
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class28.method321(class196.field2894, -5001);
                class410.field6141.method1109(false, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1068((byte) -31, var7);
                class222.method1475(true, var24.field7694[0], 0, var24.method1654(94), var24.method1654(113), -2, true, var24.field7692[0], 0);
            }
        }
        if (var6 == 23) {
            class531.field7826 = 2;
            class90.field1558 = arg3;
            class343.field5162 = 0;
            class343.field5167++;
            class374.field5666 = arg0;
            class28.method321(class423.field6320, -5001);
            class410.field6141.method1095(112, class403.field6059 + var5);
            class410.field6141.method1068((byte) -37, var4 + class200.field2931);
            class410.field6141.method1082(104, class380.field5726.method1584(14, 82) ? 1 : 0);
            class410.field6141.method1095(116, var7);
            class217.method1448(var5, var4, (byte) -55);
        }
        if (var6 == 19) {
            class255 var25 = class34.field668[var7];
            if (var25 != null) {
                class501.field7383++;
                class374.field5666 = arg0;
                class90.field1558 = arg3;
                class531.field7826 = 2;
                class343.field5162 = 0;
                class28.method321(class510.field7532, -5001);
                class410.field6141.method1080(var7, 125);
                class410.field6141.method1082(74, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var25.field7694[0], 0, var25.method1654(111), var25.method1654(123), -2, true, var25.field7692[0], 0);
            }
        }
        if (var6 == 1011) {
            class374.field5666 = arg0;
            class221.field3176++;
            class90.field1558 = arg3;
            class531.field7826 = 2;
            class343.field5162 = 0;
            class28.method321(class102.field1691, -5001);
            class410.field6141.method1094(1618659784, var7);
        }
        if (var6 == 10 || var6 == 1002) {
            class329.method2118(var7, var4, var5, (byte) -56, arg2.field3007);
        }
        if (var6 == 9) {
            class256 var26 = class183.field2747[var7];
            if (var26 != null) {
                class531.field7826 = 2;
                class495.field7310++;
                class90.field1558 = arg3;
                class374.field5666 = arg0;
                class343.field5162 = 0;
                class28.method321(class166.field2577, -5001);
                class410.field6141.method1095(113, var7);
                class410.field6141.method1114(-1971649880, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var26.field7694[0], 0, var26.method1654(120), var26.method1654(97), -2, true, var26.field7692[0], 0);
            }
        }
        if (var6 == 20) {
            class256 var27 = class183.field2747[var7];
            if (var27 != null) {
                class531.field7826 = 2;
                class374.field5666 = arg0;
                class343.field5162 = 0;
                class147.field2349++;
                class90.field1558 = arg3;
                class28.method321(class431.field6410, -5001);
                class410.field6141.method1109(false, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1080(var7, 124);
                class222.method1475(true, var27.field7694[0], 0, var27.method1654(118), var27.method1654(76), -2, arg1, var27.field7692[0], 0);
            }
        }
        if (var6 == 1007 || var6 == 1008 || var6 == 1012 || var6 == 1003 || var6 == 1009) {
            class65.method551(var4, var7, 177016718, var6);
        }
        if (var6 == 11) {
            class256 var28 = class183.field2747[var7];
            if (var28 != null) {
                class158.field2465++;
                class90.field1558 = arg3;
                class531.field7826 = 2;
                class374.field5666 = arg0;
                class343.field5162 = 0;
                class28.method321(class56.field978, -5001);
                class410.field6141.method1082(125, class380.field5726.method1584(14, 82) ? 1 : 0);
                class410.field6141.method1095(-1, var7);
                class222.method1475(true, var28.field7694[0], 0, var28.method1654(104), var28.method1654(81), -2, true, var28.field7692[0], 0);
            }
        }
        if (var6 == 6) {
            class256 var29 = class183.field2747[var7];
            if (var29 != null) {
                class374.field5666 = arg0;
                class90.field1558 = arg3;
                class343.field5162 = 0;
                class281.field4022++;
                class531.field7826 = 2;
                class28.method321(class359.field5450, -5001);
                class410.field6141.method1095(118, class347.field5187);
                class410.field6141.method1068((byte) -100, class63.field1086);
                class410.field6141.method1068((byte) -120, var7);
                class410.field6141.method1117(class383.field5790, (byte) 12);
                class410.field6141.method1105(12074, class380.field5726.method1584(14, 82) ? 1 : 0);
                class222.method1475(true, var29.field7694[0], 0, var29.method1654(125), var29.method1654(106), -2, arg1, var29.field7692[0], 0);
            }
        }
        if (class99.field1638) {
            class227.method1486(0);
        }
        if (class212.field3041 != null && class360.field5461 == 0) {
            class302.method1902((byte) -108, class212.field3041);
        }
    }
}
