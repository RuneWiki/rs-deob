import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class302 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Lh;")
    public static class434 field4022 = new class434(60, -2);

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Lmc;")
    public static class78 field4026 = new class78(14, 8);

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Lgd;")
    public static class206 field4029 = new class206("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lkm;")
    public static class216 field4021;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "Lsg;")
    public static class250 field4030;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "[I")
    public static int[] field4031;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
    public static final void method1688(int arg0, int arg1, int arg2) {
        field4024++;
        if (arg1 == -12370) {
            class106 var3 = class250.method1400(1, 117, arg0);
            var3.method658(0);
            var3.field1589 = arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZIIIIIIII)Z")
    public static final boolean method1689(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4020++;
        if (arg7 <= 119) {
            field4029 = null;
        }
        int var9 = class233.field3103.field1193[0];
        int var10 = class233.field3103.field1197[0];
        if (var9 < 0 || class295.field3947 <= var9 || var10 < 0 || class39.field567 <= var10) {
            return false;
        } else if (arg5 >= 0 && arg5 < class295.field3947 && arg2 >= 0 && arg2 < class39.field567) {
            int var11 = class30.method175(arg0, class93.field1361, arg6, arg1, 1, arg8, arg3, class60.field805[class233.field3103.field6502], var9, arg4, arg5, class193.field2613, class233.field3103.method545(false), arg2, var10);
            if (var11 < 1) {
                return false;
            }
            class345.field4761 = class93.field1361[var11 - 1];
            class124.field1817 = class193.field2613[var11 - 1];
            class187.field2565 = false;
            class1.method5(true);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static final void method1690(int arg0) {
        class205.method1173((byte) -118, false);
        field4019++;
        class6.field74 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class243.field3238.length; var2++) {
            if (class86.field1164[var2] != -1 && class243.field3238[var2] == null) {
                class243.field3238[var2] = class87.field1219.method702((byte) 114, 0, class86.field1164[var2]);
                if (class243.field3238[var2] == null) {
                    var1 = false;
                    class6.field74++;
                }
            }
            if (class80.field1078[var2] != -1 && class136.field1976[var2] == null) {
                class136.field1976[var2] = class87.field1219.method693(class270.field3605[var2], 1, 0, class80.field1078[var2]);
                if (class136.field1976[var2] == null) {
                    var1 = false;
                    class6.field74++;
                }
            }
            if (class132.field1934[var2] != -1 && class208.field2813[var2] == null) {
                class208.field2813[var2] = class87.field1219.method702((byte) -88, 0, class132.field1934[var2]);
                if (class208.field2813[var2] == null) {
                    var1 = false;
                    class6.field74++;
                }
            }
            if (class36.field545[var2] != -1 && class316.field4174[var2] == null) {
                class316.field4174[var2] = class87.field1219.method702((byte) -119, 0, class36.field545[var2]);
                if (class316.field4174[var2] == null) {
                    class6.field74++;
                    var1 = false;
                }
            }
            if (class98.field1430 != null && class91.field1343[var2] == null && class98.field1430[var2] != -1) {
                class91.field1343[var2] = class87.field1219.method693(class270.field3605[var2], 1, 0, class98.field1430[var2]);
                if (class91.field1343[var2] == null) {
                    class6.field74++;
                    var1 = false;
                }
            }
        }
        if (class32.field485 == null) {
            if (class491.field6859 == null || !class484.field6701.method714(-1, class491.field6859.field3783 + "_staticelements")) {
                class32.field485 = new class455(0);
            } else if (class484.field6701.method685(class491.field6859.field3783 + "_staticelements", (byte) 67)) {
                class32.field485 = class48.method347(class484.field6701, class491.field6859.field3783 + "_staticelements", class158.field2174, -2);
            } else {
                class6.field74++;
                var1 = false;
            }
        }
        if (!var1) {
            class123.field1802 = 1;
            return;
        }
        boolean var3 = true;
        class2.field39 = 0;
        for (int var4 = 0; var4 < class243.field3238.length; var4++) {
            byte[] var19 = class136.field1976[var4];
            if (var19 != null) {
                int var20 = (class306.field4050[var4] >> 8) * 64 - class162.field2260;
                int var21 = (class306.field4050[var4] & 0xFF) * 64 - class266.field3511;
                if (class323.field4311) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class288.method1626(var21, var20, var19, class39.field567, class295.field3947, 63);
            }
            byte[] var22 = class316.field4174[var4];
            if (var22 != null) {
                int var23 = (class306.field4050[var4] >> 8) * 64 - class162.field2260;
                int var24 = (class306.field4050[var4] & 0xFF) * 64 - class266.field3511;
                if (class323.field4311) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class288.method1626(var24, var23, var22, class39.field567, class295.field3947, 63);
            }
        }
        if (!var3) {
            class123.field1802 = 2;
            return;
        }
        if (class123.field1802 != 0) {
            class363.method2212(class284.field3828, true, class230.field3051.method1176(class110.field1676, (byte) -95) + "<br>(100%)", (byte) 113);
        }
        class183.method1073(-1);
        class412.method2470(0);
        boolean var5 = false;
        if (class98.field1432.method1991() && class488.field6789.field6686) {
            for (int var6 = 0; var6 < class243.field3238.length; var6++) {
                if (class316.field4174[var6] != null || class208.field2813[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class488.field6789.field6665) {
            var7 = class120.field1770[class239.field3188];
        } else {
            var7 = class193.field2615[class239.field3188];
        }
        if (class98.field1432.method1996()) {
            var7++;
        }
        class267.method1506(7, 4, class295.field3947, class39.field567, var7, var5, class98.field1432.method1977() > 0);
        if (arg0 < 31) {
            method1690(-5);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class60.field805[var8].method1469(-123);
        }
        class324.method1800(false);
        class263.method1489(16955, false);
        class42.method284(25981);
        class183.method1073(-1);
        System.gc();
        class205.method1173((byte) -84, true);
        class385.method2360(-115);
        class123.field1801 = class488.field6789.field6696;
        class4.field57 = class488.field6789.field6686;
        class51.field681 = class428.field5792 >= 96;
        class449.field6109 = class488.field6789.field6682;
        class30.field405 = !class488.field6789.field6676;
        class279.field3716 = class488.field6789.method2415(109, class222.field2958) ? -1 : class160.field2220;
        class59.field791 = class222.field2958 == 1 || class488.field6789.field6680;
        class98.field1438 = new class17(4, class295.field3947, class39.field567, false);
        if (!class323.field4311) {
            class390.method2390(class98.field1438, class243.field3238, 8);
        }
        if (class323.field4311) {
            class33.method252(class243.field3238, (byte) -43, class98.field1438);
        }
        class262.method1485(class295.field3947 >> 4, class39.field567 >> 4, (byte) -42);
        class458.method2690((byte) 72);
        if (var5) {
            class410.method2459(true);
            class445.field6061 = new class17(1, class295.field3947, class39.field567, true);
            if (!class323.field4311) {
                class390.method2390(class445.field6061, class208.field2813, 8);
                class205.method1173((byte) -111, true);
            }
            if (class323.field4311) {
                class33.method252(class208.field2813, (byte) -55, class445.field6061);
                class205.method1173((byte) -75, true);
            }
            class445.field6061.method2849(0, true, class98.field1438.field6798[0]);
            class445.field6061.method2837((byte) -64, (int[][][]) null, (class261[]) null, class98.field1432);
            class410.method2459(false);
        }
        class98.field1438.method2837((byte) -69, var5 ? class445.field6061.field6798 : null, class60.field805, class98.field1432);
        if (!class323.field4311) {
            class205.method1173((byte) -99, true);
            class199.method1139(12, class98.field1438, class136.field1976);
            if (class91.field1343 != null) {
                class402.method2435(-77);
            }
        }
        if (class323.field4311) {
            class205.method1173((byte) -102, true);
            class453.method2661(class98.field1438, -57, class136.field1976);
        }
        class412.method2470(0);
        class205.method1173((byte) -82, true);
        class98.field1438.method2845(var5 ? class312.field4112[0] : null, 27043, class98.field1432, (class177) null);
        class98.field1438.method108(-119, class98.field1432);
        class205.method1173((byte) -122, true);
        if (var5) {
            class410.method2459(true);
            class205.method1173((byte) -91, true);
            if (!class323.field4311) {
                class199.method1139(77, class445.field6061, class316.field4174);
            }
            if (class323.field4311) {
                class453.method2661(class445.field6061, -50, class316.field4174);
            }
            class412.method2470(0);
            class205.method1173((byte) -83, true);
            class445.field6061.method2845((class177) null, 27043, class98.field1432, class289.field3896[0]);
            class445.field6061.method108(85, class98.field1432);
            class205.method1173((byte) -69, true);
            class410.method2459(false);
        }
        class110.method707((byte) 90);
        int var9 = class98.field1438.field240;
        if (class373.field5104 < var9) {
            var9 = class373.field5104;
        }
        if ((class373.field5104 - 1) > var9) {
            var9 = class373.field5104 - 1;
        }
        if (class488.field6789.method2415(106, class222.field2958)) {
            class222.method1260(0);
        } else {
            class222.method1260(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class295.field3947; var17++) {
                for (int var18 = 0; var18 < class39.field567; var18++) {
                    class448.method2637(var17, -751, var10, var18);
                }
            }
        }
        class34.method256(103);
        class183.method1073(-1);
        class6.method39(false);
        class412.method2470(0);
        class437.field5931 = false;
        class88.method571((byte) -111);
        if (class492.field6883 != null && class280.field3743 != null && class18.field258 == 25) {
            class491.method2861(class473.field6526, 1);
            class409.field5596++;
            class203.field2751.method199((byte) -117, 1057001181);
        }
        if (!class323.field4311) {
            int var11 = (class4.field60 - (class295.field3947 >> 4)) / 8;
            int var12 = ((class295.field3947 >> 4) + class4.field60) / 8;
            int var13 = (class391.field5426 - (class39.field567 >> 4)) / 8;
            int var14 = ((class39.field567 >> 4) + class391.field5426) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var16 < var13 || var14 < var16) {
                        class87.field1219.method689("m" + var15 + "_" + var16, (byte) -83);
                        class87.field1219.method689("l" + var15 + "_" + var16, (byte) -83);
                    }
                }
            }
        }
        if (class18.field258 == 28) {
            class119.method746(10, (byte) -39);
        } else {
            class119.method746(30, (byte) 6);
            if (class280.field3743 != null) {
                class491.method2861(class451.field6128, 1);
            }
        }
        class235.method1312(124);
        class183.method1073(-1);
        class383.method2351((byte) 123);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static void method1691(byte arg0) {
        field4029 = null;
        field4022 = null;
        field4021 = null;
        field4030 = null;
        field4026 = null;
        field4031 = null;
        if (arg0 != -99) {
            field4027 = 34;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public static final void method1692(int arg0) {
        field4023++;
        if (class377.field5197 == class374.field5160) {
            return;
        }
        try {
            class361.method2207(class6.field81, "tbrefresh", (byte) -117);
        } catch (Throwable var1) {
        }
        if (arg0 != 31534) {
            method1692(-109);
        }
    }
}
