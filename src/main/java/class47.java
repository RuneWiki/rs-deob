import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class47 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field754 = new int[2500];

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
    public static boolean field759 = false;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lcf;")
    private static class93 field762 = class147.method1066("Nehmen", -48);

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[Lcf;")
    public static class93[] field758 = new class93[1000];

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Lcf;")
    public static class93 field764 = class147.method1066("loc", -48);

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lcf;")
    private static class93 field761 = class147.method1066("blinken3:", -48);

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field767 = 0;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lcf;")
    public static class93 field769 = class147.method1066(" <col=ffff00>", -48);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)[B")
    public abstract byte[] method260(int arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILhg;Lhg;IZ)Lak;")
    public static final class138 method261(int arg0, class177 arg1, class177 arg2, int arg3, boolean arg4) {
        if (arg3 != -13203) {
            return null;
        }
        field766++;
        boolean var5 = true;
        int[] var6 = arg2.method1260(arg0, 0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1265(arg0, false, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg1.method1265(0, false, var9);
                } else {
                    var10 = arg1.method1265(var9, false, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class138(arg2, arg1, arg0, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method262(boolean arg0) {
        field762 = null;
        if (!arg0) {
            return;
        }
        field758 = null;
        field764 = null;
        field761 = null;
        field769 = null;
        field754 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BB)V")
    public abstract void method263(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static final void method264(int arg0) {
        field765++;
        int var1 = 72 / ((-arg0 - 36) / 60);
        if (class283.field5078 == 0) {
            return;
        }
        try {
            if ((++class208.field3735) > 2000) {
                if (class92.field1625 != null) {
                    class92.field1625.method947((byte) 74);
                    class92.field1625 = null;
                }
                if (class266.field4738 >= 1) {
                    class68.field1235 = -5;
                    class283.field5078 = 0;
                    return;
                }
                if (class283.field5082 == class137.field2390) {
                    class137.field2390 = class148.field2608;
                } else {
                    class137.field2390 = class283.field5082;
                }
                class266.field4738++;
                class208.field3735 = 0;
                class283.field5078 = 1;
            }
            if (class283.field5078 == 1) {
                class57.field957 = class169.field2967.method1959((byte) -31, class137.field2390, class157.field2787);
                class283.field5078 = 2;
            }
            if (class283.field5078 == 2) {
                if (class57.field957.field290 == 2) {
                    throw new IOException();
                }
                if (class57.field957.field290 != 1) {
                    return;
                }
                class92.field1625 = new class130((Socket) class57.field957.field292, class169.field2967);
                class57.field957 = null;
                class92.field1625.method945(class285.field5105.field5011, (byte) 127, 0, class285.field5105.field5027);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                int var2 = class92.field1625.method951(0);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                if (var2 != 21) {
                    class283.field5078 = 0;
                    class68.field1235 = var2;
                    class92.field1625.method947((byte) 52);
                    class92.field1625 = null;
                    return;
                }
                class283.field5078 = 3;
            }
            if (class283.field5078 == 3) {
                if (class92.field1625.method950(false) < 1) {
                    return;
                }
                class8.field115 = new class93[class92.field1625.method951(0)];
                class283.field5078 = 4;
            }
            if (class283.field5078 == 4 && class92.field1625.method950(false) >= (class8.field115.length * 8)) {
                class250.field4504.field5027 = 0;
                class92.field1625.method946(class250.field4504.field5011, class8.field115.length * 8, 0, 1);
                for (int var3 = 0; var3 < class8.field115.length; var3++) {
                    class8.field115[var3] = class205.method1454((byte) 36, class250.field4504.method1873((byte) 6));
                }
                class68.field1235 = 21;
                class283.field5078 = 0;
                class92.field1625.method947((byte) 101);
                class92.field1625 = null;
            }
        } catch (IOException var4) {
            if (class92.field1625 != null) {
                class92.field1625.method947((byte) 78);
                class92.field1625 = null;
            }
            if (class266.field4738 >= 1) {
                class283.field5078 = 0;
                class68.field1235 = -4;
            } else {
                class266.field4738++;
                class283.field5078 = 1;
                class208.field3735 = 0;
                if (class283.field5082 == class137.field2390) {
                    class137.field2390 = class148.field2608;
                } else {
                    class137.field2390 = class283.field5082;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method265(byte arg0) {
        class53.field884 = class146.field2580;
        class140.field2430 = class147.field2595;
        class8.field109 = class80.field1499;
        class129.field2278 = class220.field3991;
        class101.field1756 = class223.field4019;
        class85.field1548 = class45.field723;
        class181.field3338 = class277.field4963;
        class73.field1337 = class199.field3608;
        class18.field233 = class105.field1818;
        class264.field4704 = class14.field178;
        class66.field1218 = class152.field2679;
        class266.field4735 = class255.field4613;
        class220.field3997 = class213.field3901;
        class280.field5041 = class65.field1202;
        class46.field749 = class130.field2303;
        class185.field3414 = class275.field4922;
        class104.field1800 = class178.field3118;
        class1.field9 = class273.field4864;
        class42.field662 = class124.field2199;
        class51.field846 = class16.field211;
        field760++;
        class32.field502 = class200.field3642;
        class45.field735 = class69.field1260;
        class258.field4648 = class159.field2811;
        class200.field3621 = class26.field347;
        class234.field4180 = field762;
        class111.field1895 = class130.field2293;
        class19.field255 = class50.field831;
        class134.field2349 = class181.field3332;
        class181.field3226 = class207.field3716;
        class131.field2322 = class243.field4391;
        class156.field2767 = class147.field2588;
        class31.field496 = class130.field2310;
        class86.field1556 = class72.field1297;
        class15.field204 = class247.field4450;
        class124.field2210 = class115.field1988;
        class156.field2763 = class147.field2588;
        class141.field2444 = class176.field3059;
        class205.field3697 = class103.field1796;
        class50.field830 = class257.field4635;
        class276.field4956 = class196.field3592;
        class200.field3635 = class6.field78;
        class258.field4646 = class33.field527;
        class152.field2671 = class3.field37;
        class183.field3379 = class41.field629;
        class263.field4689 = class106.field1832;
        class183.field3380 = class41.field629;
        class257.field4633 = class254.field4602;
        class11.field154 = class204.field3673;
        class263.field4694 = class185.field3406;
        class232.field4137 = class272.field4834;
        class217.field3954 = class249.field4485;
        class251.field4522 = class247.field4456;
        class76.field1420 = class227.field4074;
        class31.field501 = class31.field495;
        class275.field4927 = class97.field1729;
        class147.field2591 = class138.field2400;
        class35.field541 = class255.field4612;
        if (arg0 >= -55) {
            method266(-127);
        }
        class78.field1464 = class111.field1889;
        class126.field2235 = class58.field994;
        class200.field3624 = class77.field1440;
        class177.field3103 = class268.field4768;
        class276.field4942 = class171.field3010;
        class5.field69 = class231.field4130;
        class256.field4618 = class93.field1632;
        class151.field2645 = class19.field250;
        class5.field72 = class217.field3950;
        class282.field5071 = class208.field3733;
        class68.field1247 = class187.field3440;
        class76.field1416 = class217.field3962;
        class19.field253 = class288.field5141;
        class156.field2768 = class14.field177;
        class32.field509 = class26.field335;
        class104.field1807 = class246.field4437;
        class253.field4566 = class73.field1321;
        class205.field3698 = class39.field613;
        class129.field2266 = class37.field565;
        class43.field696 = class54.field893;
        class277.field4969 = class37.field559;
        class70.field1281 = class76.field1422;
        class177.field3094 = class268.field4768;
        class19.field245 = class135.field2353;
        class126.field2239 = class229.field4098;
        class48.field781 = class37.field566;
        class228.field4093 = class3.field27;
        class249.field4483 = class227.field4073;
        class271.field4824 = class71.field1286;
        class147.field2594 = class139.field2419;
        class151.field2646 = field761;
        class68.field1236 = class249.field4492;
        class285.field5108 = class7.field93;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Llf;")
    public static final class212 method266(int arg0) {
        field763++;
        class212 var1 = (class212) class165.field2914.method1196(2);
        if (var1 != null) {
            var1.method1544((byte) -83);
            var1.method1728(28169);
            return var1;
        }
        if (arg0 != 0) {
            field759 = false;
        }
        class212 var2;
        do {
            var2 = (class212) class40.field614.method1196(arg0 ^ 0x2);
            if (var2 == null) {
                return null;
            }
            if (var2.method1500(arg0 ^ 0xFFFFFFCF) > class28.method155((byte) 124)) {
                return null;
            }
            var2.method1544((byte) -24);
            var2.method1728(28169);
        } while ((var2.field4598 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
