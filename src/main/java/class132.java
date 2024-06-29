import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class132 {

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "Lmw;")
    public static class517 field1817 = new class517(30, 3);

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "Z")
    public static boolean field1818 = true;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "C")
    public char field1813;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ldt;I)V", line = 3)
    public final void method931(class254 arg0, int arg1) {
        field1816++;
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                if (arg1 == 27941) {
                    return;
                } else {
                    method934(83);
                    return;
                }
            }
            this.method933(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 34)
    public static final void method932(byte arg0) {
        field1811++;
        class540.method3125(false, 0);
        class441.field6340 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class754.field10206.length; var2++) {
            if (class592.field8095[var2] != -1 && class754.field10206[var2] == null) {
                class754.field10206[var2] = class577.field7862.method1188(class592.field8095[var2], -18047, 0);
                if (class754.field10206[var2] == null) {
                    var1 = false;
                    class441.field6340++;
                }
            }
            if (class238.field3158[var2] != -1 && class168.field2216[var2] == null) {
                class168.field2216[var2] = class577.field7862.method1183(class92.field1289[var2], class238.field3158[var2], (byte) 104, 0);
                if (class168.field2216[var2] == null) {
                    class441.field6340++;
                    var1 = false;
                }
            }
            if (class542.field7496[var2] != -1 && class294.field4168[var2] == null) {
                class294.field4168[var2] = class577.field7862.method1188(class542.field7496[var2], -18047, 0);
                if (class294.field4168[var2] == null) {
                    var1 = false;
                    class441.field6340++;
                }
            }
            if (class639.field8603[var2] != -1 && class328.field4651[var2] == null) {
                class328.field4651[var2] = class577.field7862.method1188(class639.field8603[var2], class250.method1635(arg0, 18040), 0);
                if (class328.field4651[var2] == null) {
                    var1 = false;
                    class441.field6340++;
                }
            }
            if (class550.field7592 != null && class361.field5245[var2] == null && class550.field7592[var2] != -1) {
                class361.field5245[var2] = class577.field7862.method1183(class92.field1289[var2], class550.field7592[var2], (byte) -99, 0);
                if (class361.field5245[var2] == null) {
                    class441.field6340++;
                    var1 = false;
                }
            }
        }
        if (class498.field6992 == null) {
            if (class781.field10724 == null || !class627.field8494.method1181(-5252, class781.field10724.field2583 + "_staticelements")) {
                class498.field6992 = new class329(0);
            } else if (class627.field8494.method1159(class781.field10724.field2583 + "_staticelements", (byte) -87)) {
                class498.field6992 = class64.method413(class86.field1212, class627.field8494, 1, class781.field10724.field2583 + "_staticelements");
            } else {
                class441.field6340++;
                var1 = false;
            }
        }
        if (!var1) {
            class290.field4150 = 1;
            return;
        }
        boolean var3 = true;
        class493.field6947 = 0;
        for (int var4 = 0; var4 < class754.field10206.length; var4++) {
            byte[] var21 = class168.field2216[var4];
            if (var21 != null) {
                int var22 = (class649.field8753[var4] >> 8) * 64 - class120.field1625;
                int var23 = (class649.field8753[var4] & 0xFF) * 64 - class259.field3849;
                if (class389.field5637 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class520.method3025(var22, (byte) 40, class102.field1467, var23, class393.field5663, var21);
            }
            byte[] var24 = class328.field4651[var4];
            if (var24 != null) {
                int var25 = (class649.field8753[var4] >> 8) * 64 - class120.field1625;
                int var26 = (class649.field8753[var4] & 0xFF) * 64 - class259.field3849;
                if (class389.field5637 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class520.method3025(var25, (byte) 40, class102.field1467, var26, class393.field5663, var24);
            }
        }
        if (!var3) {
            class290.field4150 = 2;
            return;
        }
        if (class290.field4150 != 0) {
            class316.method2017(0, true, class58.field709.method365(class55.field647, (byte) 94) + "<br>(100%)", class375.field5490, class355.field5157, class166.field2202);
        }
        class324.method2095(arg0 - 102);
        class74.method601((byte) 50);
        class23.method134((byte) -92);
        boolean var5 = false;
        if (class375.field5490.method459() && class125.field1721.field5188.method2377(43) == 2) {
            for (int var6 = 0; var6 < class754.field10206.length; var6++) {
                if (class328.field4651[var6] != null || class294.field4168[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class125.field1721.field5171.method3709(43) == 1) {
            var7 = class415.field5992[class114.field1544];
        } else {
            var7 = class482.field6756[class114.field1544];
        }
        if (class375.field5490.method455()) {
            var7++;
        }
        class720.method3972(class375.field5490, class552.field7620, 9, 4, class102.field1467, class393.field5663, var7, var5, class375.field5490.method489() > 0);
        class205.method1348(class134.field1827);
        if (class134.field1827 == 0) {
            class282.method1842(null);
        } else {
            class282.method1842(class734.field9957);
        }
        if (arg0 != -7) {
            field1817 = null;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class257.field3830[var8].method1425(-1);
        }
        class23.method139(89);
        class214.method1386(-1, false);
        class302.method1951((byte) -48);
        class123.field1701 = false;
        class126.field1734 = null;
        class324.method2095(-72);
        System.gc();
        class540.method3125(true, 0);
        class69.method578(10);
        class319.field4533 = class125.field1721.field5156.method159(43);
        class682.field9117 = class115.field1557 >= 96;
        class792.field10866 = class125.field1721.field5188.method2377(43) == 2;
        class717.field9768 = class125.field1721.field5160.method3282(43) == 1;
        class584.field7965 = class125.field1721.field5155.method591(43) == 1 ? -1 : class786.field10794;
        class714.field9740 = class125.field1721.field5147.method3686(43) == 1;
        class377.field5508 = class125.field1721.field5167.method1438(43) == 1;
        class131.field1803 = new class760(4, class102.field1467, class393.field5663, false);
        if (class389.field5637 == 0) {
            class726.method4004((byte) -122, class754.field10206, class131.field1803);
        } else {
            class561.method3200(class131.field1803, class754.field10206, (byte) 34);
        }
        class458.method2714(0, class393.field5663 >> 4, class102.field1467 >> 4);
        class411.method2465((byte) -65);
        if (var5) {
            class416.method2507(true);
            class120.field1621 = new class760(1, class102.field1467, class393.field5663, true);
            if (class389.field5637 == 0) {
                class726.method4004((byte) 107, class294.field4168, class120.field1621);
                class540.method3125(true, arg0 ^ 0xFFFFFFF9);
            } else {
                class561.method3200(class120.field1621, class294.field4168, (byte) 34);
                class540.method3125(true, arg0 + 7);
            }
            class120.field1621.method2858(class131.field1803.field6792[0], (byte) -45, 0);
            class120.field1621.method2851(null, null, false, class375.field5490);
            class416.method2507(false);
        }
        class131.field1803.method2851(var5 ? class120.field1621.field6792 : null, class257.field3830, false, class375.field5490);
        if (class389.field5637 == 0) {
            class540.method3125(true, 0);
            class144.method1001(-61, class131.field1803, class168.field2216);
            if (class361.field5245 != null) {
                class28.method162((byte) 118);
            }
        } else {
            class540.method3125(true, 0);
            class664.method3665(class168.field2216, class131.field1803, arg0 - 94);
        }
        class74.method601((byte) 50);
        if (class115.field1557 < 96) {
            class555.method3186(-81);
        }
        class540.method3125(true, arg0 ^ 0xFFFFFFF9);
        class131.field1803.method2849(arg0 ^ 0x7955, class375.field5490, var5 ? class737.field10008[0] : null, null);
        class131.field1803.method4187(false, (byte) 21, class375.field5490);
        class540.method3125(true, 0);
        if (var5) {
            class416.method2507(true);
            class540.method3125(true, 0);
            if (class389.field5637 == 0) {
                class144.method1001(-112, class120.field1621, class328.field4651);
            } else {
                class664.method3665(class328.field4651, class120.field1621, 89);
            }
            class74.method601((byte) 50);
            class540.method3125(true, 0);
            class120.field1621.method2849(-31060, class375.field5490, null, class648.field8748[0]);
            class120.field1621.method4187(true, (byte) 21, class375.field5490);
            class540.method3125(true, 0);
            class416.method2507(false);
        }
        client.method2056(19898);
        int var9 = class131.field1803.field10440;
        if (var9 > class184.field2420) {
            var9 = class184.field2420;
        }
        if ((class184.field2420 - 1) > var9) {
            var9 = class184.field2420 - 1;
        }
        if (class125.field1721.field5155.method591(43) == 0) {
            class458.method2712(var9);
        } else {
            class458.method2712(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class102.field1467; var19++) {
                for (int var20 = 0; var20 < class393.field5663; var20++) {
                    class215.method1390(var10, var20, var19, -1);
                }
            }
        }
        class18.method99(-126);
        class324.method2095(arg0 - 121);
        class270.method1793(false);
        class74.method601((byte) 50);
        class171.method1155(121);
        if (class639.field8606 != null && class710.field9707 != null && class780.field10712 == 11) {
            class492.field6927++;
            class43 var11 = class492.method2903(class259.field3839, 0, class73.field983);
            var11.field457.method1686(-57, 1057001181);
            class409.method2457((byte) -100, var11);
        }
        if (class389.field5637 == 0) {
            int var12 = (class759.field10402 - (class102.field1467 >> 4)) / 8;
            int var13 = (class759.field10402 + (class102.field1467 >> 4)) / 8;
            int var14 = (class559.field7668 - (class393.field5663 >> 4)) / 8;
            int var15 = ((class393.field5663 >> 4) + class559.field7668) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class577.field7862.method1184("m" + var16 + "_" + var17, -16298);
                        class577.field7862.method1184("l" + var16 + "_" + var17, -16298);
                    }
                }
            }
        }
        if (class780.field10712 == 4) {
            class170.method1148(3, -11239);
        } else if (class780.field10712 == 8) {
            class170.method1148(7, arg0 ^ 0x2BE0);
        } else {
            class170.method1148(10, -11239);
            if (class710.field9707 != null) {
                class43 var18 = class492.method2903(class583.field7923, 0, class73.field983);
                class409.method2457((byte) -100, var18);
            }
        }
        class399.method2433(14265);
        class324.method2095(-94);
        class597.method3344((byte) -36);
        field1818 = true;
        if (class246.field3213) {
            class280.method1834((byte) 88, "Took: " + (class401.method2440(false) - class620.field8395) + "ms");
            class246.field3213 = false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZILdt;)V", line = 517)
    private final void method933(boolean arg0, int arg1, class254 arg2) {
        field1815++;
        if (arg1 == 1) {
            this.field1813 = class207.method1357(true, arg2.method1737(true));
        } else if (arg1 == 2) {
            this.field1814 = arg2.method1728((byte) 50);
            this.field1809 = arg2.method1731((byte) 64);
            this.field1810 = arg2.method1731((byte) 64);
        }
        if (!arg0) {
            method932((byte) -38);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 541)
    public static final void method934(int arg0) {
        class525.method3048((byte) -78, false);
        if (arg0 != 64) {
            method932((byte) -30);
        }
        field1808++;
        if (class680.field9103 >= 0 && class680.field9103 != 0) {
            class399.method2434(false, (byte) -61, class680.field9103);
            class680.field9103 = -1;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V", line = 558)
    public static void method935(boolean arg0) {
        field1817 = null;
        if (!arg0) {
            field1818 = true;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLha;)V", line = 569)
    public static final void method936(byte arg0, class66 arg1) {
        if (class677.field9075) {
            class501.method2931(arg1, (byte) -122);
        } else {
            class289.method1857(arg1, 0);
        }
        if (arg0 > -8) {
            method932((byte) 9);
        }
        field1812++;
    }
}
