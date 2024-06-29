import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class235 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3726 = -1;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field3725 = 1;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public static final void method1556(int arg0, int arg1) {
        field3723++;
        class23 var2 = class91.method694(arg0, arg1, arg1 ^ 0xC);
        var2.method183(-105);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lb;")
    public static final class262 method1557(int arg0, byte arg1) {
        field3724++;
        class262 var2 = (class262) class25.field417.method1518((long) arg0, 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2663.method900(26, arg0, false);
        class262 var4 = new class262();
        if (var3 != null) {
            var4.method1759((byte) 68, new class136(var3));
        }
        if (arg1 != -109) {
            method1556(18, -67);
        }
        class25.field417.method1514(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1558(int arg0) {
        field3719++;
        class72.method556(0, class23.field365);
        if (arg0 < 99) {
            return;
        }
        class210.field3368++;
        if (class279.field4437 && class140.field2337) {
            int var1 = class165.field2719;
            int var2 = var1 - class14.field220;
            int var3 = class269.field4311;
            int var4 = var3 - class255.field4064;
            if (class212.field3398 > var2) {
                var2 = class212.field3398;
            }
            int var5 = class23.field365.field1784;
            if ((class23.field365.field1919 + var2) > (class212.field3398 + class189.field3092.field1919)) {
                var2 = class212.field3398 + class189.field3092.field1919 - class23.field365.field1919;
            }
            int var6 = var2 - class220.field3526;
            if (class160.field2616 > var4) {
                var4 = class160.field2616;
            }
            if ((class23.field365.field1790 + var4) > (class160.field2616 + class189.field3092.field1790)) {
                var4 = class189.field3092.field1790 + class160.field2616 - class23.field365.field1790;
            }
            int var7 = var2 - (class212.field3398 - class189.field3092.field1842);
            int var8 = var4 - class269.field4326;
            int var9 = class189.field3092.field1828 + var4 - class160.field2616;
            if (class23.field365.field1893 < class210.field3368 && (var8 > var5 || var8 < -var5 || var6 > var5 || -var5 > var6)) {
                class141.field2343 = true;
            }
            if (class23.field365.field1811 != null && class141.field2343) {
                class196 var10 = new class196();
                var10.field3205 = class23.field365.field1811;
                var10.field3211 = var9;
                var10.field3203 = var7;
                var10.field3213 = class23.field365;
                class129.method938(-42, var10);
            }
            if (class216.field3469 == 0) {
                if (class141.field2343) {
                    if (class23.field365.field1795 != null) {
                        class196 var11 = new class196();
                        var11.field3203 = var7;
                        var11.field3211 = var9;
                        var11.field3213 = class23.field365;
                        var11.field3205 = class23.field365.field1795;
                        var11.field3207 = class114.field1882;
                        class129.method938(-108, var11);
                    }
                    if (class114.field1882 != null && client.method1922(class23.field365) != null) {
                        class251.field3990++;
                        class87.field1405.method607(60, (byte) 63);
                        class87.field1405.method973(1111986640, class114.field1882.field1789);
                        class87.field1405.method971(3792, class114.field1882.field1916);
                        class87.field1405.method1026(34, class23.field365.field1789);
                        class87.field1405.method1017((byte) 111, class23.field365.field1916);
                    }
                } else if ((class131.field2183 == 1 || class170.method1215((byte) 17, class42.field776 - 1)) && class42.field776 > 2) {
                    class270.method1837(-109);
                } else if (class42.field776 > 0) {
                    class89.method689(0);
                }
                class23.field365 = null;
            }
        } else if (class210.field3368 > 1) {
            class23.field365 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static final void method1559(int arg0) {
        if (arg0 != 1444) {
            method1560((byte) 87);
        }
        for (class197 var1 = (class197) class229.field3655.method1807(-105); var1 != null; var1 = (class197) class229.field3655.method1808((byte) 102)) {
            class50 var2 = var1.field3222;
            if (class92.field1448 != var2.field917 || var2.field915) {
                var1.method1074((byte) -125);
            } else if (var2.field904 <= class207.field3336) {
                var2.method426(0, class232.field3681);
                if (var2.field915) {
                    var1.method1074((byte) -127);
                } else {
                    class130.method942(var2.field917, var2.field920, var2.field914, var2.field923, 60, var2, 0, -1L, false);
                }
            }
        }
        field3727++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BZ)V")
    public abstract void method705(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)[B")
    public abstract byte[] method704(int arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method1560(byte arg0) {
        field3720++;
        class112.method830((byte) 96);
        class262.method1762(-18203);
        class87.method683(-128);
        class9.method54(70);
        class293.method1962(3075);
        class161.method1165((byte) -75);
        int var1 = -44 / ((18 - arg0) / 59);
        class192.method1320(15);
        class274.method1854(-334);
        class171.method1231(128);
        class267.method1823(-49);
        class102.method758(false);
        class66.method510((byte) 56);
        class137.method1032(-108);
        class230.method1532((byte) -99);
        class18.method141(-71);
        class248.method1648(-1);
        class227.method1516(-111);
        class259.method1731(65381);
        class50.method424(-65536);
        class23.method186(323132448);
        class50.field922.method1156(-54);
        class3.field37.method1156(-120);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(CLjava/lang/String;B)I")
    public static final int method1561(char arg0, String arg1, byte arg2) {
        int var3 = 0;
        int var4 = arg1.length();
        if (arg2 <= 117) {
            field3726 = 70;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
        }
        field3722++;
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1562(int arg0, int arg1, int arg2) {
        field3721++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (arg2 > ~var3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }
}
