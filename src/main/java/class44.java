import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class44 {

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "Lea;")
    public static class474 field465 = new class474("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "Lov;")
    public static class161 field469;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "Lkea;")
    public static class203 field468;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Z")
    public static boolean field466;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V", line = 15)
    public static void method232(int arg0) {
        field465 = null;
        field469 = null;
        if (arg0 <= 45) {
            field468 = null;
        }
        field468 = null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 27)
    public static final void method233(byte arg0) {
        class548.method3186(false, (byte) 77);
        field467++;
        class531.field7692 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class290.field4014.length; var2++) {
            if (class475.field7018[var2] != -1 && class290.field4014[var2] == null) {
                class290.field4014[var2] = class647.field9367.method1286(0, class475.field7018[var2], (byte) -49);
                if (class290.field4014[var2] == null) {
                    class531.field7692++;
                    var1 = false;
                }
            }
            if (class621.field8995[var2] != -1 && class451.field6731[var2] == null) {
                class451.field6731[var2] = class647.field9367.method1297(false, 0, class514.field7496[var2], class621.field8995[var2]);
                if (class451.field6731[var2] == null) {
                    class531.field7692++;
                    var1 = false;
                }
            }
            if (class577.field8333[var2] != -1 && class348.field4971[var2] == null) {
                class348.field4971[var2] = class647.field9367.method1286(0, class577.field8333[var2], (byte) -49);
                if (class348.field4971[var2] == null) {
                    var1 = false;
                    class531.field7692++;
                }
            }
            if (class11.field99[var2] != -1 && class639.field9186[var2] == null) {
                class639.field9186[var2] = class647.field9367.method1286(0, class11.field99[var2], (byte) -49);
                if (class639.field9186[var2] == null) {
                    class531.field7692++;
                    var1 = false;
                }
            }
            if (class371.field5682 != null && class162.field1979[var2] == null && class371.field5682[var2] != -1) {
                class162.field1979[var2] = class647.field9367.method1297(false, 0, class514.field7496[var2], class371.field5682[var2]);
                if (class162.field1979[var2] == null) {
                    var1 = false;
                    class531.field7692++;
                }
            }
        }
        if (class561.field8015 == null) {
            if (class360.field5103 == null || !class144.field1770.method1294(-59, class360.field5103.field4039 + "_staticelements")) {
                class561.field8015 = new class136(0);
            } else if (class144.field1770.method1289(class360.field5103.field4039 + "_staticelements", -67)) {
                class561.field8015 = class408.method2581(false, class360.field5103.field4039 + "_staticelements", class144.field1770, class525.field7616);
            } else {
                class531.field7692++;
                var1 = false;
            }
        }
        if (!var1) {
            class620.field8986 = 1;
            return;
        }
        boolean var3 = true;
        class97.field1141 = 0;
        if (arg0 > -99) {
            field465 = null;
        }
        for (int var4 = 0; var4 < class290.field4014.length; var4++) {
            byte[] var19 = class451.field6731[var4];
            if (var19 != null) {
                int var20 = (class170.field2090[var4] >> 8) * 64 - class287.field3980;
                int var21 = (class170.field2090[var4] & 0xFF) * 64 - class250.field3549;
                if (class251.field3570 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class39.method206(var19, (byte) -87, class30.field349, var21, var20, class90.field1032);
            }
            byte[] var22 = class639.field9186[var4];
            if (var22 != null) {
                int var23 = (class170.field2090[var4] >> 8) * 64 - class287.field3980;
                int var24 = (class170.field2090[var4] & 0xFF) * 64 - class250.field3549;
                if (class251.field3570 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class39.method206(var22, (byte) -87, class30.field349, var24, var23, class90.field1032);
            }
        }
        if (!var3) {
            class620.field8986 = 2;
            return;
        }
        if (class620.field8986 != 0) {
            class120.method745(true, -51, class445.field6665, class151.field1857.method2902(class35.field396, -20139) + "<br>(100%)");
        }
        class453.method2798((byte) -54);
        class457.method2821((byte) -121);
        boolean var5 = false;
        if (class413.field6264.method322() && class595.field8694.field6556) {
            for (int var6 = 0; var6 < class290.field4014.length; var6++) {
                if (class639.field9186[var6] != null || class348.field4971[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class595.field8694.field6555) {
            var7 = class623.field9001[class616.field8962];
        } else {
            var7 = class163.field2006[class616.field8962];
        }
        if (class413.field6264.method341()) {
            var7++;
        }
        class118.method729(9, 4, class90.field1032, class30.field349, var7, var5, class413.field6264.method324() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class14.field120[var8].method2870(true);
        }
        class246.method1634(0);
        class253.method1660(-124, false);
        class171.method983(-124);
        class191.field2426 = false;
        class291.field4035 = null;
        class453.method2798((byte) -56);
        System.gc();
        class548.method3186(true, (byte) 77);
        class601.method3489(-1);
        class202.field2696 = class595.field8694.method2735((byte) -128, class81.field908);
        class146.field1797 = class595.field8694.field6556;
        class316.field4607 = class362.field5189 >= 96;
        class594.field8686 = class595.field8694.method2732(class81.field908, (byte) -120);
        class38.field419 = !class595.field8694.field6528;
        class496.field7248 = class595.field8694.method2426(class81.field908, -5) ? -1 : class394.field6023;
        class560.field7972 = class330.method2152(class81.field908, false) || class595.field8694.field6535;
        class441.field6583 = class595.field8694.field6539;
        class273.field3824 = new class270(4, class90.field1032, class30.field349, false);
        if (class251.field3570 == 0) {
            class9.method47(class273.field3824, class290.field4014, false);
        } else {
            class473.method2897(class290.field4014, 94, class273.field3824);
        }
        class9.method50(class90.field1032 >> 4, class30.field349 >> 4, (byte) -120);
        class110.method683((byte) -114);
        if (var5) {
            class199.method1266(true);
            class363.field5512 = new class270(1, class90.field1032, class30.field349, true);
            if (class251.field3570 == 0) {
                class9.method47(class363.field5512, class348.field4971, false);
                class548.method3186(true, (byte) 77);
            } else {
                class473.method2897(class348.field4971, 100, class363.field5512);
                class548.method3186(true, (byte) 77);
            }
            class363.field5512.method560(false, class273.field3824.field1006[0], 0);
            class363.field5512.method564(class413.field6264, (byte) 112, null, null);
            class199.method1266(false);
        }
        class273.field3824.method564(class413.field6264, (byte) 62, class14.field120, var5 ? class363.field5512.field1006 : null);
        if (class251.field3570 == 0) {
            class548.method3186(true, (byte) 77);
            class218.method1433(class273.field3824, -28946, class451.field6731);
            if (class162.field1979 != null) {
                class131.method809(-53);
            }
        } else {
            class548.method3186(true, (byte) 77);
            class471.method2889((byte) -109, class451.field6731, class273.field3824);
        }
        class457.method2821((byte) -121);
        if (class362.field5189 < 96) {
            class301.method1998(16384);
        }
        class548.method3186(true, (byte) 77);
        class273.field3824.method559(class413.field6264, null, true, var5 ? class492.field7164[0] : null);
        class273.field3824.method1760(class413.field6264, -13);
        class548.method3186(true, (byte) 77);
        if (var5) {
            class199.method1266(true);
            class548.method3186(true, (byte) 77);
            if (class251.field3570 == 0) {
                class218.method1433(class363.field5512, -28946, class639.field9186);
            } else {
                class471.method2889((byte) -86, class639.field9186, class363.field5512);
            }
            class457.method2821((byte) -120);
            class548.method3186(true, (byte) 77);
            class363.field5512.method559(class413.field6264, class544.field7780[0], true, null);
            class363.field5512.method1760(class413.field6264, -48);
            class548.method3186(true, (byte) 77);
            class199.method1266(false);
        }
        class270.method1762(11639);
        int var9 = class273.field3824.field3778;
        if (var9 > class226.field3179) {
            var9 = class226.field3179;
        }
        if (class226.field3179 - 1 > var9) {
            var9 = class226.field3179 - 1;
        }
        if (class595.field8694.method2426(class81.field908, -5)) {
            class268.method1754(0);
        } else {
            class268.method1754(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class90.field1032; var17++) {
                for (int var18 = 0; var18 < class30.field349; var18++) {
                    class187.method1083(var10, var17, var18, 26);
                }
            }
        }
        class395.method2536(77);
        class453.method2798((byte) 119);
        class224.method1460((byte) 124);
        class457.method2821((byte) -117);
        class100.method618(-31317);
        if (class114.field1430 != null && class170.field2077 != null && class133.field1673 == 10) {
            class308.method2044(class162.field1992, -7434);
            class3.field18++;
            class468.field6960.method1223(true, 1057001181);
        }
        if (class251.field3570 == 0) {
            int var11 = (class568.field8159 - (class90.field1032 >> 4)) / 8;
            int var12 = (class568.field8159 + (class90.field1032 >> 4)) / 8;
            int var13 = (class400.field6066 - (class30.field349 >> 4)) / 8;
            int var14 = ((class30.field349 >> 4) + class400.field6066) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var13 > var16 || var14 < var16) {
                        class647.field9367.method1302(true, "m" + var15 + "_" + var16);
                        class647.field9367.method1302(true, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class133.field1673 == 3) {
            class353.method2235(2, 1);
        } else if (class133.field1673 == 7) {
            class353.method2235(6, 1);
        } else {
            class353.method2235(9, 1);
            if (class170.field2077 != null) {
                class308.method2044(class225.field3175, -7434);
            }
        }
        class178.method1016((byte) 105);
        class453.method2798((byte) -65);
        class387.method2505(86);
    }
}
