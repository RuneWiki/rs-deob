import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class317 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
    public static boolean field4757 = false;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    public static int[] field4756 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[B")
    public static byte[] field4765 = new byte[2048];

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lui;")
    public static class451 field4762;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 3)
    public static void method1950(byte arg0) {
        field4762 = null;
        field4765 = null;
        field4756 = null;
        if (arg0 > -18) {
            method1951(-83);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1951(int arg0) {
        field4759++;
        class320.method1966(false, -8109);
        class336.field5035 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class485.field6820.length; var2++) {
            if (class184.field2792[var2] != -1 && class485.field6820[var2] == null) {
                class485.field6820[var2] = class170.field2421.method2691(0, class184.field2792[var2], 0);
                if (class485.field6820[var2] == null) {
                    var1 = false;
                    class336.field5035++;
                }
            }
            if (class124.field1707[var2] != -1 && class209.field3151[var2] == null) {
                class209.field3151[var2] = class170.field2421.method2684(class124.field1707[var2], client.field6672[var2], 0, 0);
                if (class209.field3151[var2] == null) {
                    class336.field5035++;
                    var1 = false;
                }
            }
            if (class81.field1139[var2] != -1 && class408.field5915[var2] == null) {
                class408.field5915[var2] = class170.field2421.method2691(0, class81.field1139[var2], arg0 + 1);
                if (class408.field5915[var2] == null) {
                    class336.field5035++;
                    var1 = false;
                }
            }
            if (class298.field4462[var2] != -1 && class105.field1477[var2] == null) {
                class105.field1477[var2] = class170.field2421.method2691(0, class298.field4462[var2], arg0 + 1);
                if (class105.field1477[var2] == null) {
                    var1 = false;
                    class336.field5035++;
                }
            }
            if (class340.field5098 != null && client.field6674[var2] == null && class340.field5098[var2] != -1) {
                client.field6674[var2] = class170.field2421.method2684(class340.field5098[var2], client.field6672[var2], arg0 + 1, 0);
                if (client.field6674[var2] == null) {
                    class336.field5035++;
                    var1 = false;
                }
            }
        }
        if (class203.field3087 == null) {
            if (class361.field5470 == null || !class150.field2106.method2659((byte) -109, class361.field5470.field179 + "_staticelements")) {
                class203.field3087 = new class486(0);
            } else if (class150.field2106.method2664(class361.field5470.field179 + "_staticelements", true)) {
                class203.field3087 = class150.method1021(class361.field5470.field179 + "_staticelements", 23, class198.field2979, class150.field2106);
            } else {
                var1 = false;
                class336.field5035++;
            }
        }
        if (!var1) {
            class310.field4685 = 1;
            return;
        }
        class363.field5510 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class485.field6820.length; var4++) {
            byte[] var19 = class209.field3151[var4];
            if (var19 != null) {
                int var20 = (class145.field2052[var4] >> 8) * 64 - class68.field922;
                int var21 = (class145.field2052[var4] & 0xFF) * 64 - class468.field6588;
                if (class75.field1050) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class293.method1845(var20, var21, 65535, var19, class379.field5642, class456.field6477);
            }
            byte[] var22 = class105.field1477[var4];
            if (var22 != null) {
                int var23 = (class145.field2052[var4] >> 8) * 64 - class68.field922;
                int var24 = (class145.field2052[var4] & 0xFF) * 64 - class468.field6588;
                if (class75.field1050) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class293.method1845(var23, var24, 65535, var22, class379.field5642, class456.field6477);
            }
        }
        if (!var3) {
            class310.field4685 = 2;
            return;
        }
        if (class310.field4685 != 0) {
            class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21) + "<br>(100%)", 103, class310.field4690, true);
        }
        class418.method2483((byte) 93);
        class31.method268(arg0 + 9);
        boolean var5 = false;
        if (class138.field1976.method566() && class337.field5038.field3933) {
            for (int var6 = 0; var6 < class485.field6820.length; var6++) {
                if (class105.field1477[var6] != null || class408.field5915[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class337.field5038.field3924) {
            var7 = class166.field2325[class330.field4947];
        } else {
            var7 = class488.field6848[class330.field4947];
        }
        if (class138.field1976.method496()) {
            var7++;
        }
        class236.method1538(7, 4, class379.field5642, class456.field6477, var7, var5, class138.field1976.method524() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class183.field2717[var8].method2870(-112);
        }
        class451.method2677((byte) -102);
        class165.method1116(false, (byte) -103);
        class361.method2219(2);
        class418.method2483((byte) 115);
        System.gc();
        class320.method1966(true, -8109);
        class246.method1567(0);
        class408.field5922 = class337.field5038.field3952;
        class64.field879 = !class337.field5038.field3927;
        class206.field3125 = class337.field5038.field3933;
        class256.field3798 = class45.field646 >= 96;
        class433.field6160 = class337.field5038.field3957;
        class12.field181 = class337.field5038.method2209(class170.field2424, -104) ? -1 : class314.field4722;
        class115.field1600 = class170.field2424 == 1 || class337.field5038.field3945;
        class4.field80 = new class350(4, class379.field5642, class456.field6477, false);
        if (!class75.field1050) {
            class8.method97(class485.field6820, class4.field80, 64);
        }
        if (class75.field1050) {
            class182.method1251(class485.field6820, class4.field80, (byte) 127);
        }
        class53.method387(class379.field5642 >> 4, arg0 + 128, class456.field6477 >> 4);
        class53.method384(22717);
        if (var5) {
            class303.method1887(true);
            class492.field6929 = new class350(1, class379.field5642, class456.field6477, true);
            if (!class75.field1050) {
                class8.method97(class408.field5915, class492.field6929, 64);
                class320.method1966(true, -8109);
            }
            if (class75.field1050) {
                class182.method1251(class408.field5915, class492.field6929, (byte) 112);
                class320.method1966(true, -8109);
            }
            class492.field6929.method363((byte) 98, class4.field80.field719[0], 0);
            class492.field6929.method362(-126, class138.field1976, (class491[]) null, (int[][][]) null);
            class303.method1887(false);
        }
        class4.field80.method362(-123, class138.field1976, class183.field2717, var5 ? class492.field6929.field719 : null);
        if (!class75.field1050) {
            class320.method1966(true, -8109);
            class427.method2513(class4.field80, class209.field3151, (byte) -118);
            if (client.field6674 != null) {
                class68.method600(-95);
            }
        }
        if (class75.field1050) {
            class320.method1966(true, -8109);
            class443.method2575((byte) 92, class4.field80, class209.field3151);
        }
        class31.method268(8);
        class320.method1966(true, -8109);
        class4.field80.method357(var5 ? class55.field765[0] : null, arg0 + 1, class138.field1976, (class48) null);
        class4.field80.method2162(class138.field1976, 4921);
        class320.method1966(true, arg0 ^ 0x1FAC);
        if (var5) {
            class303.method1887(true);
            class320.method1966(true, -8109);
            if (!class75.field1050) {
                class427.method2513(class492.field6929, class105.field1477, (byte) -107);
            }
            if (class75.field1050) {
                class443.method2575((byte) 82, class492.field6929, class105.field1477);
            }
            class31.method268(8);
            class320.method1966(true, arg0 ^ 0x1FAC);
            class492.field6929.method357((class48) null, 0, class138.field1976, class483.field6781[0]);
            class492.field6929.method2162(class138.field1976, arg0 ^ 0xFFFFECC6);
            class320.method1966(true, -8109);
            class303.method1887(false);
        }
        class187.method1287(11642);
        int var9 = class4.field80.field5335;
        if (class486.field6836 < var9) {
            var9 = class486.field6836;
        }
        if (class486.field6836 + arg0 > var9) {
            var9 = class486.field6836 - 1;
        }
        if (class337.field5038.method2209(class170.field2424, 49)) {
            class128.method894(0);
        } else {
            class128.method894(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class379.field5642; var17++) {
                for (int var18 = 0; var18 < class456.field6477; var18++) {
                    class409.method2444(var10, var17, (byte) 26, var18);
                }
            }
        }
        class48.method349(arg0 ^ 0x3);
        class418.method2483((byte) 126);
        class237.method1543(-2);
        class31.method268(8);
        class389.field5719 = false;
        class154.method1053(4096);
        if (class316.field4749 != null && class27.field335 != null && class316.field4752 == 25) {
            class378.method2320(class441.field6232, (byte) 119);
            class492.field6930++;
            class230.field3390.method2596((byte) 105, 1057001181);
        }
        if (!class75.field1050) {
            int var11 = (class356.field5413 - (class379.field5642 >> 4)) / 8;
            int var12 = ((class379.field5642 >> 4) + class356.field5413) / 8;
            int var13 = (class314.field4728 - (class456.field6477 >> 4)) / 8;
            int var14 = ((class456.field6477 >> 4) + class314.field4728) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var16 < var13 || var14 < var16) {
                        class170.field2421.method2685((byte) 85, "m" + var15 + "_" + var16);
                        class170.field2421.method2685((byte) 127, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class316.field4752 == 28) {
            class144.method987((byte) 29, 10);
        } else {
            class144.method987((byte) 29, 30);
            if (class27.field335 != null) {
                class378.method2320(class316.field4747, (byte) 119);
            }
        }
        class290.method1837(arg0 ^ 0xFFFFF05B);
        class418.method2483((byte) 62);
        class382.method2331(false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)I", line = 479)
    public static final int method1952(byte arg0, int arg1, int arg2) {
        field4761++;
        if (arg0 >= -57) {
            field4762 = null;
        }
        return arg2 == 4 || arg2 == 5 ? class110.field1564[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZZI)Lui;", line = 498)
    public static final class451 method1953(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field4763++;
        class302 var5 = null;
        if (class270.field3999 != null) {
            var5 = new class302(arg1, class270.field3999, class475.field6652[arg1], 1000000);
        }
        class198.field2985[arg1] = class178.field2649.method2144(var5, (byte) 42, arg1, class416.field5996);
        if (arg3) {
            class198.field2985[arg1].method2801((byte) 121);
        }
        if (arg4 != -32717) {
            method1950((byte) 79);
        }
        return new class451(class198.field2985[arg1], arg2, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)I", line = 523)
    public static final int method1954(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 <= 0) {
            method1955(-32, (class309) null, false);
        }
        field4764++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILsk;Z)V", line = 549)
    public static final void method1955(int arg0, class309 arg1, boolean arg2) {
        field4758++;
        int var3 = -1;
        if (!arg2) {
            return;
        }
        int var4 = 0;
        if (class452.field6418 < arg1.field4616) {
            class203.method1388(arg1, false);
        } else if (arg1.field4628 >= class452.field6418) {
            class233.method1527((byte) -103, arg1);
        } else {
            class209.method1413(false, arg1, 0);
            var4 = class441.field6233;
            var3 = class21.field258;
        }
        if (arg1.field4543 < 128 || arg1.field4538 < 128 || arg1.field4543 >= class379.field5642 * 128 - 128 || class456.field6477 * 128 - 128 <= arg1.field4538) {
            arg1.field4618 = -1;
            arg1.field4616 = 0;
            var3 = -1;
            var4 = 0;
            arg1.field4628 = 0;
            arg1.field4612 = -1;
            arg1.field4543 = arg1.field4675[0] * 128 + arg1.method1705((byte) 65) * 64;
            arg1.field4538 = arg1.field4674[0] * 128 + arg1.method1705((byte) 65) * 64;
            arg1.method1923((byte) -36);
        }
        if (class472.field6622 == arg1 && (arg1.field4543 < 1536 || arg1.field4538 < 1536 || class379.field5642 * 128 - 1536 <= arg1.field4543 || ((class456.field6477 - 12) * 128) <= arg1.field4538)) {
            arg1.field4618 = -1;
            var4 = 0;
            arg1.field4616 = 0;
            var3 = -1;
            arg1.field4612 = -1;
            arg1.field4628 = 0;
            arg1.field4543 = arg1.field4675[0] * 128 + arg1.method1705((byte) 65) * 64;
            arg1.field4538 = arg1.field4674[0] * 128 + (arg1.method1705((byte) 65) * 64);
            arg1.method1923((byte) -36);
        }
        int var5 = class2.method13(arg1, -1);
        class282.method1811(var4, (byte) 19, arg1, var5, var3);
        class51.method370(67, arg1);
    }
}
