import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public abstract class class486 {

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "Lgaa;")
    public static class432 field6469 = new class432();

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "Lme;")
    public static class668 field6470 = new class668(64);

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "Z")
    public static boolean field6472 = false;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field6471 = 0;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)Z")
    public abstract boolean method2215(int arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
    public static final void method2671(byte arg0) {
        field6467++;
        class69.method555(63, false);
        class41.field577 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class124.field1607.length; var2++) {
            if (class266.field3568[var2] != -1 && class124.field1607[var2] == null) {
                class124.field1607[var2] = class277.field3630.method3346(-1, class266.field3568[var2], 0);
                if (class124.field1607[var2] == null) {
                    var1 = false;
                    class41.field577++;
                }
            }
            if (class515.field6753[var2] != -1 && class117.field1507[var2] == null) {
                class117.field1507[var2] = class277.field3630.method3344(class206.field2667[var2], true, class515.field6753[var2], 0);
                if (class117.field1507[var2] == null) {
                    class41.field577++;
                    var1 = false;
                }
            }
            if (class602.field8103[var2] != -1 && class229.field3047[var2] == null) {
                class229.field3047[var2] = class277.field3630.method3346(-1, class602.field8103[var2], 0);
                if (class229.field3047[var2] == null) {
                    class41.field577++;
                    var1 = false;
                }
            }
            if (class441.field5704[var2] != -1 && class594.field8029[var2] == null) {
                class594.field8029[var2] = class277.field3630.method3346(-1, class441.field5704[var2], 0);
                if (class594.field8029[var2] == null) {
                    class41.field577++;
                    var1 = false;
                }
            }
            if (class545.field7072 != null && class214.field2754[var2] == null && class545.field7072[var2] != -1) {
                class214.field2754[var2] = class277.field3630.method3344(class206.field2667[var2], true, class545.field7072[var2], 0);
                if (class214.field2754[var2] == null) {
                    var1 = false;
                    class41.field577++;
                }
            }
        }
        if (class155.field1966 == null) {
            if (class80.field1104 == null || !class52.field716.method3354(class80.field1104.field3075 + "_staticelements", arg0 - 115)) {
                class155.field1966 = new class657(0);
            } else if (class52.field716.method3370(class80.field1104.field3075 + "_staticelements", -2)) {
                class155.field1966 = class156.method1122((byte) 91, class454.field5922, class80.field1104.field3075 + "_staticelements", class52.field716);
            } else {
                class41.field577++;
                var1 = false;
            }
        }
        if (!var1) {
            class438.field5668 = 1;
            return;
        }
        boolean var3 = true;
        class402.field5147 = 0;
        for (int var4 = 0; var4 < class124.field1607.length; var4++) {
            byte[] var21 = class117.field1507[var4];
            if (var21 != null) {
                int var22 = (class547.field7096[var4] >> 8) * 64 - class100.field1326;
                int var23 = (class547.field7096[var4] & 0xFF) * 64 - class186.field2376;
                if (class105.field1383 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class601.method3271(var22, var21, class656.field9155, var23, 31724, class611.field8258);
            }
            byte[] var24 = class594.field8029[var4];
            if (var24 != null) {
                int var25 = (class547.field7096[var4] >> 8) * 64 - class100.field1326;
                int var26 = (class547.field7096[var4] & 0xFF) * 64 - class186.field2376;
                if (class105.field1383 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class601.method3271(var25, var24, class656.field9155, var26, arg0 + 31609, class611.field8258);
            }
        }
        if (!var3) {
            class438.field5668 = 2;
            return;
        }
        if (class438.field5668 != 0) {
            class542.method2877(true, class604.field8136.method3280((byte) 107, class144.field1890) + "<br>(100%)", class520.field6799, class562.field7337, class401.field5111, true);
        }
        class424.method2439(26);
        class705.method3852(arg0 - 115);
        boolean var5 = false;
        if (class520.field6799.method387() && class260.field3509.field1279) {
            for (int var6 = 0; var6 < class124.field1607.length; var6++) {
                if (class594.field8029[var6] != null || class229.field3047[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class260.field3509.field1278) {
            var7 = class377.field4836[class668.field9276];
        } else {
            var7 = class223.field2917[class668.field9276];
        }
        if (class520.field6799.method382()) {
            var7++;
        }
        class469.method2602(9, 4, class611.field8258, class656.field9155, var7, var5, class520.field6799.method384() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class703.field9806[var8].method284((byte) -116);
        }
        class657.method3614(-72);
        class628.method3486(false, (byte) 58);
        class347.method1996(arg0 ^ 0x73);
        class625.field8743 = null;
        class81.field1107 = false;
        class424.method2439(26);
        System.gc();
        class69.method555(125, true);
        class93.method720(118);
        class475.field6182 = class260.field3509.method733(class364.field4697, (byte) -127);
        class87.field1157 = class331.field4308 >= 96;
        class581.field7913 = class260.field3509.field1279;
        class13.field149 = class260.field3509.method734((byte) 86, class364.field4697);
        class379.field4849 = !class260.field3509.field1304;
        class145.field1894 = class260.field3509.method1571(class364.field4697, -23572) ? -1 : class517.field6768;
        class162.field2019 = class356.method2048((byte) 68, class364.field4697) || class260.field3509.field1268;
        class528.field6868 = class260.field3509.field1286;
        class568.field7424 = new class99(4, class611.field8258, class656.field9155, false);
        if (class105.field1383 == 0) {
            class61.method520(class568.field7424, class124.field1607, true);
        } else {
            class426.method2448(class124.field1607, class568.field7424, (byte) -104);
        }
        class249.method1564(class611.field8258 >> 4, class656.field9155 >> 4, (byte) 20);
        class126.method922(true);
        if (var5) {
            class160.method1139(true);
            class477.field6246 = new class99(1, class611.field8258, class656.field9155, true);
            if (class105.field1383 == 0) {
                class61.method520(class477.field6246, class229.field3047, true);
                class69.method555(58, true);
            } else {
                class426.method2448(class229.field3047, class477.field6246, (byte) -87);
                class69.method555(arg0 - 33, true);
            }
            class477.field6246.method1886(0, class568.field7424.field4226[0], false);
            class477.field6246.method1884(-122, null, null, class520.field6799);
            class160.method1139(false);
        }
        class568.field7424.method1884(-97, var5 ? class477.field6246.field4226 : null, class703.field9806, class520.field6799);
        if (class105.field1383 == 0) {
            class69.method555(71, true);
            class89.method675(class117.field1507, -18931, class568.field7424);
            if (class214.field2754 != null) {
                class332.method1917((byte) -25);
            }
        } else {
            class69.method555(91, true);
            class470.method2611(class568.field7424, class117.field1507, (byte) 83);
        }
        class705.method3852(arg0 ^ 0x73);
        if (class331.field4308 < 96) {
            class483.method2664(true);
        }
        class69.method555(81, true);
        class568.field7424.method1874((byte) 119, null, var5 ? class477.field6327[0] : null, class520.field6799);
        class568.field7424.method747(false, class520.field6799);
        class69.method555(102, true);
        if (var5) {
            class160.method1139(true);
            class69.method555(93, true);
            if (class105.field1383 == 0) {
                class89.method675(class594.field8029, -18931, class477.field6246);
            } else {
                class470.method2611(class477.field6246, class594.field8029, (byte) 83);
            }
            class705.method3852(0);
            class69.method555(arg0 - 29, true);
            class477.field6246.method1874((byte) 124, class353.field4540[0], null, class520.field6799);
            class477.field6246.method747(false, class520.field6799);
            class69.method555(127, true);
            class160.method1139(false);
        }
        class477.method2634(false);
        int var9 = class568.field7424.field1319;
        if (arg0 != 115) {
            return;
        }
        if (var9 > class390.field4991) {
            var9 = class390.field4991;
        }
        if (var9 < class390.field4991 - 1) {
            var9 = class390.field4991 - 1;
        }
        if (class260.field3509.method1571(class364.field4697, -23572)) {
            class530.method2818(0);
        } else {
            class530.method2818(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class611.field8258; var19++) {
                for (int var20 = 0; var20 < class656.field9155; var20++) {
                    class210.method1353(var20, var19, 65535, var10);
                }
            }
        }
        class540.method2867(arg0 - 112);
        class424.method2439(26);
        class332.method1915(arg0 ^ 0x73);
        class705.method3852(0);
        class611.method3312(70);
        if (class425.field5520 != null && class2.field15 != null && class566.field7391 == 11) {
            class143.field1876++;
            class11 var11 = class130.method931(class649.field9035, (byte) 54, class129.field1645);
            var11.field114.method2353(1057001181, (byte) -71);
            class100.method760(var11, arg0 - 236);
        }
        if (class105.field1383 == 0) {
            int var12 = (class677.field9340 - (class611.field8258 >> 4)) / 8;
            int var13 = ((class611.field8258 >> 4) + class677.field9340) / 8;
            int var14 = (class649.field9048 - (class656.field9155 >> 4)) / 8;
            int var15 = ((class656.field9155 >> 4) + class649.field9048) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var15 < var17) {
                        class277.field3630.method3345("m" + var16 + "_" + var17, false);
                        class277.field3630.method3345("l" + var16 + "_" + var17, false);
                    }
                }
            }
        }
        if (class566.field7391 == 4) {
            class442.method2508(3, arg0 ^ 0x72);
        } else if (class566.field7391 == 8) {
            class442.method2508(7, 1);
        } else {
            class442.method2508(10, 1);
            if (class2.field15 != null) {
                class11 var18 = class130.method931(class649.field9035, (byte) 54, class546.field7086);
                class100.method760(var18, 67);
            }
        }
        class100.method765((byte) 93);
        class424.method2439(arg0 - 89);
        class442.method2510(arg0 ^ 0x53);
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V")
    public abstract void method2213(int arg0);

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
    public abstract boolean method2216(byte arg0);

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)Z")
    public final boolean method2672(byte arg0) {
        if (arg0 >= -60) {
            return false;
        } else {
            field6466++;
            return this.method2216((byte) -116) || this.method2205(64) || this.method2215(64);
        }
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)I")
    public abstract int method2214(int arg0);

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)I")
    public abstract int method2208(int arg0);

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)V")
    public static void method2673(byte arg0) {
        field6470 = null;
        field6469 = null;
        if (arg0 != -87) {
            method2671((byte) -30);
        }
    }

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)Z")
    public abstract boolean method2205(int arg0);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
    public abstract void method2209(boolean arg0);

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Lpc;")
    public abstract class252 method2211(int arg0);
}
