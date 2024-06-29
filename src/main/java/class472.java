import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class472 extends class449 {

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Lrc;")
    public static class108 field6647 = new class108(96, 4);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public int field6640;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public int field6643;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public int field6651;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public int field6652;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lae;")
    public class172 field6639;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lae;")
    public class172 field6642;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Ljava/lang/String;")
    public String field6644;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Z")
    public boolean field6653;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field6649;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILdc;)Z")
    public static final boolean method2797(int arg0, class210 arg1) {
        if (arg0 <= 87) {
            field6647 = null;
        }
        field6648++;
        class267 var2 = class468.field6599.method506(-118, arg1.method80(10143));
        if (var2.field3865 == -1) {
            return true;
        } else {
            class51 var3 = class449.field6390.method843(126, var2.field3865);
            return var3.field735 == -1 ? true : var3.method492(-21);
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Ljava/lang/String;")
    public static final String method2798(int arg0) {
        field6645++;
        String var1 = "www";
        if (arg0 <= 41) {
            field6647 = null;
        }
        if (class404.field5527 == class389.field5379) {
            var1 = "www-wtrc";
        } else if (class406.field5544 == class389.field5379) {
            var1 = "www-wtqa";
        } else if (class389.field5379 == class325.field4529) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class114.field1604 != null) {
            var2 = "/p=" + class114.field1604;
        }
        return "http://" + var1 + "." + class35.field378.field4022 + ".com/l=" + class66.field967 + "/a=" + class96.field1351 + var2 + "/";
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2799(int arg0, String arg1) {
        field6641++;
        if (arg1 == null) {
            return null;
        } else if (arg0 <= 22) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (var2 < var3 && class344.method2139(arg1.charAt(var2), 63)) {
                var2++;
            }
            while (var3 > var2 && class344.method2139(arg1.charAt(var3 - 1), 120)) {
                var3--;
            }
            int var4 = var3 - var2;
            if (var4 < 1 || var4 > 12) {
                return null;
            }
            StringBuffer var5 = new StringBuffer(var4);
            for (int var6 = var2; var6 < var3; var6++) {
                char var7 = arg1.charAt(var6);
                if (class8.method45(var7, (byte) 115)) {
                    char var8 = class114.method902(4561, var7);
                    if (var8 != '\u0000') {
                        var5.append(var8);
                    }
                }
            }
            if (var5.length() == 0) {
                return null;
            } else {
                return var5.toString();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method2800(byte arg0) {
        class161.method1192(8, false);
        field6646++;
        class34.field357 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class295.field4169.length; var2++) {
            if (class334.field4638[var2] != -1 && class295.field4169[var2] == null) {
                class295.field4169[var2] = class280.field4026.method2633(class334.field4638[var2], 0, -69);
                if (class295.field4169[var2] == null) {
                    var1 = false;
                    class34.field357++;
                }
            }
            if (class264.field3813[var2] != -1 && class314.field4444[var2] == null) {
                class314.field4444[var2] = class280.field4026.method2652(class209.field3060[var2], (byte) 103, 0, class264.field3813[var2]);
                if (class314.field4444[var2] == null) {
                    var1 = false;
                    class34.field357++;
                }
            }
            if (class172.field2627[var2] != -1 && class423.field5855[var2] == null) {
                class423.field5855[var2] = class280.field4026.method2633(class172.field2627[var2], 0, arg0 + 13);
                if (class423.field5855[var2] == null) {
                    class34.field357++;
                    var1 = false;
                }
            }
            if (class280.field4029[var2] != -1 && client.field876[var2] == null) {
                client.field876[var2] = class280.field4026.method2633(class280.field4029[var2], 0, -93);
                if (client.field876[var2] == null) {
                    class34.field357++;
                    var1 = false;
                }
            }
            if (class398.field5457 != null && class342.field4720[var2] == null && class398.field5457[var2] != -1) {
                class342.field4720[var2] = class280.field4026.method2652(class209.field3060[var2], (byte) 118, 0, class398.field5457[var2]);
                if (class342.field4720[var2] == null) {
                    class34.field357++;
                    var1 = false;
                }
            }
        }
        if (class406.field5546 == null) {
            if (class162.field2360 == null || !class261.field3750.method2639(class162.field2360.field984 + "_staticelements", -31)) {
                class406.field5546 = new class481(0);
            } else if (class261.field3750.method2640(class162.field2360.field984 + "_staticelements", 0)) {
                class406.field5546 = class421.method2515(class162.field2360.field984 + "_staticelements", class261.field3750, -1, class205.field2999);
            } else {
                var1 = false;
                class34.field357++;
            }
        }
        if (!var1) {
            class134.field1874 = 1;
            return;
        }
        boolean var3 = true;
        class448.field6381 = 0;
        for (int var4 = 0; var4 < class295.field4169.length; var4++) {
            byte[] var19 = class314.field4444[var4];
            if (var19 != null) {
                int var20 = (class486.field6887[var4] >> 8) * 64 - class279.field4012;
                int var21 = (class486.field6887[var4] & 0xFF) * 64 - class189.field2810;
                if (class273.field3969) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class169.method1234(-121, var19, class36.field388, var21, var20, class68.field998);
            }
            byte[] var22 = client.field876[var4];
            if (var22 != null) {
                int var23 = (class486.field6887[var4] >> 8) * 64 - class279.field4012;
                int var24 = (class486.field6887[var4] & 0xFF) * 64 - class189.field2810;
                if (class273.field3969) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class169.method1234(102, var22, class36.field388, var24, var23, class68.field998);
            }
        }
        if (!var3) {
            class134.field1874 = 2;
            return;
        }
        if (class134.field1874 != 0) {
            class315.method2004((byte) 93, class189.field2830, true, class225.field3247.method1078(class66.field967, arg0 ^ 0xFFFFFFB2) + "<br>(100%)");
        }
        class208.method1423((byte) -70);
        class262.method1769(-19881);
        boolean var5 = false;
        if (class374.field5152.method375() && class273.field3964) {
            for (int var6 = 0; var6 < class295.field4169.length; var6++) {
                if (client.field876[var6] != null || class423.field5855[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class300.field4246) {
            var7 = class93.field1310[class342.field4721];
        } else {
            var7 = class478.field6787[class342.field4721];
        }
        if (class374.field5152.method330()) {
            var7++;
        }
        class399.method2402(7, 4, class36.field388, class68.field998, var7, var5, class374.field5152.method403() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class300.field4249[var8].method118(3174);
        }
        class317.method2020((byte) 83);
        class168.method1218(false, 3);
        class285.method1884((byte) -76);
        class208.method1423((byte) -100);
        System.gc();
        class161.method1192(8, true);
        class137.method1010(3);
        class414.field5685 = class364.field5008 >= 96;
        class392.field5411 = class62.field913;
        class398.field5461 = !class130.field1777;
        class37.field402 = class99.field1396;
        class361.field4977 = class273.field3964;
        class442.field6292 = class435.method2628(2) ? -1 : class259.field3691;
        class414.field5686 = class377.field5192 == 1 || class89.field1269;
        class311.field4402 = new class454(4, class36.field388, class68.field998, false);
        if (!class273.field3969) {
            class482.method2842(class311.field4402, class295.field4169, (byte) 120);
        }
        if (class273.field3969) {
            class441.method2682(8, class311.field4402, class295.field4169);
        }
        class161.method1174(class36.field388 >> 4, arg0 + 166, class68.field998 >> 4);
        class436.method2668(-31638);
        if (var5) {
            class484.method2859(true);
            class364.field5009 = new class454(1, class36.field388, class68.field998, true);
            if (!class273.field3969) {
                class482.method2842(class364.field5009, class423.field5855, (byte) 114);
                class161.method1192(8, true);
            }
            if (class273.field3969) {
                class441.method2682(8, class364.field5009, class423.field5855);
                class161.method1192(8, true);
            }
            class364.field5009.method2010(class311.field4402.field4484[0], 104, 0);
            class364.field5009.method2023((byte) -77, (class18[]) null, class374.field5152, (int[][][]) null);
            class484.method2859(false);
        }
        class311.field4402.method2023((byte) 120, class300.field4249, class374.field5152, var5 ? class364.field5009.field4484 : null);
        if (!class273.field3969) {
            class161.method1192(8, true);
            class247.method1704(arg0 ^ 0x7E, class314.field4444, class311.field4402);
            if (class342.field4720 != null) {
                class394.method2384((byte) -37);
            }
        }
        if (class273.field3969) {
            class161.method1192(8, true);
            class202.method1401(arg0 ^ 0x1E51, class314.field4444, class311.field4402);
        }
        class262.method1769(-19881);
        class161.method1192(8, true);
        class311.field4402.method2024((class241) null, var5 ? class427.field5960[0] : null, (byte) 96, class374.field5152);
        class311.field4402.method2736(class374.field5152, 39);
        class161.method1192(8, true);
        if (var5) {
            class484.method2859(true);
            class161.method1192(8, true);
            if (!class273.field3969) {
                class247.method1704(123, client.field876, class364.field5009);
            }
            if (class273.field3969) {
                class202.method1401(-7801, client.field876, class364.field5009);
            }
            class262.method1769(-19881);
            class161.method1192(arg0 ^ 0xFFFFFFDE, true);
            class364.field5009.method2024(class190.field2858[0], (class241) null, (byte) 104, class374.field5152);
            class364.field5009.method2736(class374.field5152, arg0 ^ 0xFFFFFF9E);
            class161.method1192(8, true);
            class484.method2859(false);
        }
        class391.method2369(-30);
        int var9 = class311.field4402.field6436;
        if (class387.field5306 < var9) {
            var9 = class387.field5306;
        }
        if (var9 < class387.field5306 - 1) {
            var9 = class387.field5306 - 1;
        }
        if (class435.method2628(2)) {
            class487.method2869(0);
        } else {
            class487.method2869(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class36.field388; var17++) {
                for (int var18 = 0; var18 < class68.field998; var18++) {
                    class478.method2830(arg0 + 78, var17, var10, var18);
                }
            }
        }
        class325.method2051(arg0 + 139);
        class208.method1423((byte) -66);
        class218.method1505(arg0);
        class262.method1769(-19881);
        class207.field3050 = false;
        class377.method2305(arg0 ^ 0xFFFFFFD2);
        if (class467.field6587 != null && class394.field5440 != null && class347.field4787 == 25) {
            class336.method2111(class448.field6375, 112);
            class401.field5491++;
            class311.field4403.method1177(1057001181, -119);
        }
        if (!class273.field3969) {
            int var11 = (class427.field5961 - (class36.field388 >> 4)) / 8;
            int var12 = ((class36.field388 >> 4) + class427.field5961) / 8;
            int var13 = (class309.field4391 - (class68.field998 >> 4)) / 8;
            int var14 = ((class68.field998 >> 4) + class309.field4391) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var13 > var16 || var14 < var16) {
                        class280.field4026.method2646("m" + var15 + "_" + var16, -7426);
                        class280.field4026.method2646("l" + var15 + "_" + var16, -7426);
                    }
                }
            }
        }
        if (class347.field4787 == 28) {
            class237.method1649(10, false);
        } else {
            class237.method1649(30, false);
            if (class394.field5440 != null) {
                class336.method2111(class175.field2664, arg0 + 139);
            }
        }
        class274.method1854(true);
        class208.method1423((byte) -42);
        class442.method2687((byte) 110);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public static void method2801(byte arg0) {
        field6647 = null;
        int var1 = 96 / ((arg0 + 28) / 44);
    }
}
