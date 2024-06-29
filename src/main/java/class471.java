import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class471 {

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Lvh;")
    private class328 field6583 = new class328(256);

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Le;")
    private class489 field6582;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Len;")
    private class289 field6575;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[Leaa;")
    public static class460[] field6572 = new class460[2048];

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Z")
    public static boolean field6573 = true;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field6576 = 0;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "[[S")
    public static short[][] field6577;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lwaa;", line = 4)
    public final class646 method2677(int arg0, int arg1) {
        field6574++;
        Object var3 = this.field6583.method1986((byte) -104, (long) arg1);
        if (var3 != null) {
            return (class646) var3;
        } else if (!this.field6582.method590(arg1, (byte) -50)) {
            return null;
        } else if (arg0 < 45) {
            return null;
        } else {
            class269 var4 = this.field6582.method588(-26679, arg1);
            int var5 = var4.field3823 ? 64 : this.field6575.field4189;
            class646 var7;
            if (var4.field3815 && this.field6575.method308()) {
                float[] var6 = this.field6582.method585(var5, arg1, 0.7F, var5, 25948, false);
                var7 = new class646(this.field6575, 3553, 34842, var5, var5, var4.field3809 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field3813) {
                    var8 = this.field6582.method582(var5, var5, 23117, false, arg1, 0.7F);
                } else {
                    var8 = this.field6582.method586(arg1, var5, 0.7F, var5, true, 106);
                }
                var7 = new class646(this.field6575, 3553, 6408, var5, var5, var4.field3809 != 0, var8, false);
            }
            var7.method3601(var4.field3807, var4.field3824, -128);
            this.field6583.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 55)
    public final void method2678(int arg0) {
        field6580++;
        this.field6583.method1997(1);
        if (arg0 != -67524572) {
            method2680(124, -38);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 70)
    public static final void method2679(byte arg0) {
        class558.method3062(-23356, false);
        field6581++;
        class388.field5452 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class590.field8213.length; var2++) {
            if (class684.field9628[var2] != -1 && class590.field8213[var2] == null) {
                class590.field8213[var2] = class11.field211.method940(class684.field9628[var2], 0, 0);
                if (class590.field8213[var2] == null) {
                    class388.field5452++;
                    var1 = false;
                }
            }
            if (class73.field1019[var2] != -1 && class417.field5874[var2] == null) {
                class417.field5874[var2] = class11.field211.method942(class73.field1019[var2], class283.field3935[var2], 7904, 0);
                if (class417.field5874[var2] == null) {
                    var1 = false;
                    class388.field5452++;
                }
            }
            if (class180.field2663[var2] != -1 && class313.field4658[var2] == null) {
                class313.field4658[var2] = class11.field211.method940(class180.field2663[var2], 0, 0);
                if (class313.field4658[var2] == null) {
                    var1 = false;
                    class388.field5452++;
                }
            }
            if (class72.field1001[var2] != -1 && class377.field5331[var2] == null) {
                class377.field5331[var2] = class11.field211.method940(class72.field1001[var2], 0, 0);
                if (class377.field5331[var2] == null) {
                    var1 = false;
                    class388.field5452++;
                }
            }
            if (class105.field1407 != null && class298.field4458[var2] == null && class105.field1407[var2] != -1) {
                class298.field4458[var2] = class11.field211.method942(class105.field1407[var2], class283.field3935[var2], 7904, 0);
                if (class298.field4458[var2] == null) {
                    class388.field5452++;
                    var1 = false;
                }
            }
        }
        if (class663.field9360 == null) {
            if (class466.field6555 == null || !class688.field9672.method934(class466.field6555.field3126 + "_staticelements", (byte) -128)) {
                class663.field9360 = new class216(0);
            } else if (class688.field9672.method946(class466.field6555.field3126 + "_staticelements", (byte) 3)) {
                class663.field9360 = class175.method1201(class466.field6555.field3126 + "_staticelements", 2, class192.field2834, class688.field9672);
            } else {
                var1 = false;
                class388.field5452++;
            }
        }
        if (!var1) {
            class594.field8263 = 1;
            return;
        }
        class336.field4907 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class590.field8213.length; var4++) {
            byte[] var20 = class417.field5874[var4];
            if (var20 != null) {
                int var21 = (class234.field3367[var4] >> 8) * 64 - class511.field6989;
                int var22 = (class234.field3367[var4] & 0xFF) * 64 - class124.field1726;
                if (class161.field2465 != 0) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class315.method1928(class526.field7212, var21, var22, -2456, class86.field1185, var20);
            }
            byte[] var23 = class377.field5331[var4];
            if (var23 != null) {
                int var24 = (class234.field3367[var4] >> 8) * 64 - class511.field6989;
                int var25 = (class234.field3367[var4] & 0xFF) * 64 - class124.field1726;
                if (class161.field2465 != 0) {
                    var25 = 10;
                    var24 = 10;
                }
                var3 &= class315.method1928(class526.field7212, var24, var25, -2456, class86.field1185, var23);
            }
        }
        if (!var3) {
            class594.field8263 = 2;
            return;
        }
        if (class594.field8263 != 0) {
            class364.method2133(class9.field99.method42(class666.field9377, 19572) + "<br>(100%)", 0, class668.field9418, true);
        }
        class74.method592(0);
        class658.method3646(14344);
        boolean var5 = false;
        if (class630.field8790.method461() && class274.field3872.field884) {
            for (int var6 = 0; var6 < class590.field8213.length; var6++) {
                if (class377.field5331[var6] != null || class313.field4658[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class274.field3872.field902) {
            var7 = class98.field1334[class101.field1370];
        } else {
            var7 = class117.field1562[class101.field1370];
        }
        if (class630.field8790.method407()) {
            var7++;
        }
        class188.method1251(9, 4, class86.field1185, class526.field7212, var7, var5, class630.field8790.method473() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class480.field6696[var8].method2612((byte) 0);
        }
        class572.method3149(-116);
        class211.method1386(false, (byte) -43);
        class233.method1475(true);
        class127.field1765 = null;
        class633.field8858 = false;
        class74.method592(0);
        System.gc();
        class558.method3062(-23356, true);
        class261.method1597(true);
        class333.field4888 = class274.field3872.method543(class429.field6020, (byte) 20);
        class324.field4791 = class202.field2968 >= 96;
        class644.field9150 = class274.field3872.field884;
        class335.field4900 = class274.field3872.method546((byte) -110, class429.field6020);
        class441.field6212 = !class274.field3872.field887;
        class174.field2606 = class274.field3872.method2433(0, class429.field6020) ? -1 : class122.field1683;
        int var9 = -30 / ((arg0 + 16) / 47);
        class353.field5072 = class296.method1847(-98, class429.field6020) || class274.field3872.field876;
        class658.field9260 = class274.field3872.field885;
        class340.field4946 = new class172(4, class86.field1185, class526.field7212, false);
        if (class161.field2465 == 0) {
            class201.method1349(false, class590.field8213, class340.field4946);
        } else {
            class89.method668(class590.field8213, (byte) 73, class340.field4946);
        }
        class167.method1150(class86.field1185 >> 4, -4, class526.field7212 >> 4);
        class172.method1174((byte) -124);
        if (var5) {
            class19.method100(true);
            class654.field9232 = new class172(1, class86.field1185, class526.field7212, true);
            if (class161.field2465 == 0) {
                class201.method1349(false, class313.field4658, class654.field9232);
                class558.method3062(-23356, true);
            } else {
                class89.method668(class313.field4658, (byte) 65, class654.field9232);
                class558.method3062(-23356, true);
            }
            class654.field9232.method1623(0, 11168, class340.field4946.field3751[0]);
            class654.field9232.method1612(null, null, class630.field8790, 0);
            class19.method100(false);
        }
        class340.field4946.method1612(class480.field6696, var5 ? class654.field9232.field3751 : null, class630.field8790, 0);
        if (class161.field2465 == 0) {
            class558.method3062(-23356, true);
            class689.method3796(class417.field5874, 117, class340.field4946);
            if (class298.field4458 != null) {
                class653.method3632((byte) -98);
            }
        } else {
            class558.method3062(-23356, true);
            class93.method686(class417.field5874, 64, class340.field4946);
        }
        class658.method3646(14344);
        if (class202.field2968 < 96) {
            class597.method3300(24983);
        }
        class558.method3062(-23356, true);
        class340.field4946.method1620(null, class630.field8790, -81, var5 ? class581.field8114[0] : null);
        class340.field4946.method1184(class630.field8790, (byte) 7);
        class558.method3062(-23356, true);
        if (var5) {
            class19.method100(true);
            class558.method3062(-23356, true);
            if (class161.field2465 == 0) {
                class689.method3796(class377.field5331, 115, class654.field9232);
            } else {
                class93.method686(class377.field5331, 59, class654.field9232);
            }
            class658.method3646(14344);
            class558.method3062(-23356, true);
            class654.field9232.method1620(class31.field369[0], class630.field8790, -105, null);
            class654.field9232.method1184(class630.field8790, (byte) 7);
            class558.method3062(-23356, true);
            class19.method100(false);
        }
        class139.method983(112);
        int var10 = class340.field4946.field2581;
        if (var10 > class233.field3305) {
            var10 = class233.field3305;
        }
        if (var10 < class233.field3305 - 1) {
            var10 = class233.field3305 - 1;
        }
        if (class274.field3872.method2433(0, class429.field6020)) {
            class152.method1064(0);
        } else {
            class152.method1064(var10);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class86.field1185; var18++) {
                for (int var19 = 0; var19 < class526.field7212; var19++) {
                    class442.method2527(var19, var18, (byte) -1, var11);
                }
            }
        }
        class640.method3569((byte) -103);
        class74.method592(0);
        class274.method1668(-18820);
        class658.method3646(14344);
        class86.method657(54);
        if (class166.field2513 != null && class53.field758 != null && class340.field4947 == 11) {
            class178.field2637++;
            class1.method5(1, class689.field9688);
            class288.field4014.method741(1057001181, (byte) 27);
        }
        if (class161.field2465 == 0) {
            int var12 = (class357.field5117 - (class86.field1185 >> 4)) / 8;
            int var13 = (class357.field5117 + (class86.field1185 >> 4)) / 8;
            int var14 = (class326.field4813 - (class526.field7212 >> 4)) / 8;
            int var15 = ((class526.field7212 >> 4) + class326.field4813) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class11.field211.method932("m" + var16 + "_" + var17, (byte) -118);
                        class11.field211.method932("l" + var16 + "_" + var17, (byte) -124);
                    }
                }
            }
        }
        if (class340.field4947 == 4) {
            class94.method690(3, (byte) 125);
        } else if (class340.field4947 == 8) {
            class94.method690(7, (byte) 125);
        } else {
            class94.method690(10, (byte) 125);
            if (class53.field758 != null) {
                class1.method5(1, class23.field316);
            }
        }
        class509.method2831((byte) 73);
        class74.method592(0);
        class456.method2629(true);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)Z", line = 543)
    public static final boolean method2680(int arg0, int arg1) {
        field6578++;
        if (arg0 == 45 || arg0 == 13 || arg0 == 20 || arg0 == 47 || arg0 == 1008) {
            return true;
        } else if (arg1 == -14) {
            return arg0 == 18 || arg0 == 1007;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 569)
    public final void method2681(boolean arg0) {
        this.field6583.method1989(5, (byte) 91);
        if (!arg0) {
            field6579++;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Len;Le;)V", line = 595)
    public class471(class289 arg0, class489 arg1) {
        this.field6582 = arg1;
        this.field6575 = arg0;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V", line = 586)
    public static void method2682(byte arg0) {
        field6577 = null;
        int var1 = 62 / ((arg0 + 72) / 46);
        field6572 = null;
    }
}
