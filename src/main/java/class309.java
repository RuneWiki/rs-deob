import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class309 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4973 = 0;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4981 = -1;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Llc;")
    public static class270 field4980;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static final void method2089(byte arg0) {
        class287.field4595.method1420((byte) 107);
        int var1 = 96 / ((arg0 + 4) / 39);
        field4972++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)V")
    public static final void method2090(int arg0, int arg1, byte arg2) {
        class279 var3 = class111.method844(arg0, 7, -1780180960);
        var3.method1928(false);
        if (arg2 != -35) {
            method2092(103, -1);
        }
        var3.field4505 = arg1;
        field4974++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
    public static final void method2091(int arg0, int arg1, int arg2) {
        field4979++;
        class268 var3 = class288.method1970((byte) -43, arg1);
        int var4 = var3.field4306;
        int var5 = var3.field4299;
        int var6 = var3.field4307;
        int var7 = class172.field2606[var6 - var5];
        if (arg0 < arg2 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class281.method1944(var4, class9.field103[var4] & ~var8 | var8 & arg0 << var5, (byte) 121);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z")
    public static final boolean method2092(int arg0, int arg1) {
        field4975++;
        if (class44.field578[arg1]) {
            return true;
        } else if (class53.field805.method1873(arg0 ^ 0xFFFE9884, arg1)) {
            int var2 = class53.field805.method1891(arg1, 88);
            if (arg0 != 91923) {
                return true;
            } else if (var2 == 0) {
                class44.field578[arg1] = true;
                return true;
            } else {
                if (class134.field2195[arg1] == null) {
                    class134.field2195[arg1] = new class263[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class134.field2195[arg1][var3] == null) {
                        byte[] var4 = class53.field805.method1868(var3, arg1, arg0 - 91922);
                        if (var4 != null) {
                            class263 var5 = class134.field2195[arg1][var3] = new class263();
                            var5.field4083 = (arg1 << 16) + var3;
                            if (var4[0] == -1) {
                                var5.method1814(new class53(var4), arg0 ^ 0xFFFEAD6B);
                            } else {
                                var5.method1817(new class53(var4), (byte) 7);
                            }
                        }
                    }
                }
                class44.field578[arg1] = true;
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Llc;III)Lbc;")
    public static final class148 method2093(class270 arg0, int arg1, int arg2, int arg3) {
        field4976++;
        if (class144.method1079(arg3, arg0, arg1, (byte) 59)) {
            if (arg2 != 23048) {
                method2094(-17, 33, -22);
            }
            return class269.method1857(arg2 ^ 0x317F);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)I")
    public static final int method2094(int arg0, int arg1, int arg2) {
        field4978++;
        if (arg1 != -11926) {
            field4980 = null;
        }
        int var3 = class41.method259(arg1 + 77457, 4, arg0 + 45365, arg2 + 91923) - (-(class41.method259(65531, 2, arg0 + 10294, arg2 + 37821) - 128 >> 1) - (class41.method259(65531, 1, arg0, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method2095(int arg0) {
        if (arg0 == -128) {
            field4980 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static final void method2096(int arg0) {
        field4983++;
        class220.method1536(-125);
        class236.method1629(0);
        class57.method400(false);
        class44.method266(false);
        class155.method1134(-22127);
        class21.method145((byte) 10);
        class134.method1015(137);
        class197.method1394(arg0 - 28584);
        class25.method166(82);
        class138.method1040(false);
        class16.method109(arg0 ^ arg0);
        class94.method720(true);
        class151.method1122(-1);
        class156.method1141(arg0 - 32588);
        class180.method1274(-3);
        class165.method1184((byte) -128);
        class114.method852(arg0 - 18340);
        class8.method52((byte) -28);
        class258.method1776(true);
        if (class55.field811 != 0) {
            for (int var1 = 0; var1 < class204.field3014.length; var1++) {
                class204.field3014[var1] = null;
            }
            class174.field2656 = 0;
        }
        class4.method18(arg0 - 32719);
        class219.method1527(0);
        class55.method390((byte) 117);
        class275.method1915((byte) -63);
        class71.field1131.method1420((byte) -8);
        ((class274) class244.field3600).method1907((byte) -76);
        class222.field3251.method2101(3080);
        class142.field2282.method1892((byte) -59);
        class78.field1266.method1892((byte) 125);
        class282.field4546.method1892((byte) 125);
        class222.field3255.method1892((byte) 118);
        class296.field4754.method1892((byte) 121);
        class300.field4850.method1892((byte) -107);
        class193.field2855.method1892((byte) -67);
        class191.field2827.method1892((byte) -7);
        class269.field4327.method1892((byte) -47);
        class297.field4773.method1892((byte) 120);
        class20.field211.method1892((byte) 119);
        class38.field494.method1420((byte) -86);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
    public static final void method2097(int arg0, int arg1) {
        field4977++;
        class279 var2 = class111.method844(arg1, arg0, -1780180960);
        var2.method1934((byte) -114);
    }
}
