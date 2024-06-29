import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class308 {

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field4405 = 127;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field4400 = 0;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
    public static boolean field4408 = false;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "S")
    public static short field4410 = 320;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field4403 = 0;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "[[I")
    public static int[][] field4407;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static final void method1926(byte arg0) {
        field4402++;
        class220.method1437(-175);
        class252.method1575((byte) 32);
        class138.method823((byte) -119);
        class252.method1576(-47);
        class276.method1742((byte) 14);
        class406.method2563(1);
        class244.method1543(-105);
        class247.method1558(-8193);
        class206.method1308((byte) -8);
        class128.method778(true);
        class341.method2190((byte) 1);
        class424.method2626((byte) 23);
        class184.method1191((byte) 73);
        class108.method597(14958);
        class50.method303(6791);
        class342.method2195(0);
        class397.method2526(29328);
        class341.method2189(2);
        class330.method2040(false);
        class351.method2237(1023);
        class170.method1127(false);
        class171.method1136((byte) -32);
        if (class228.field3117 != 0) {
            for (int var1 = 0; var1 < class99.field1114.length; var1++) {
                class99.field1114[var1] = null;
            }
            class102.field1150 = 0;
        }
        class43.method269((byte) 100);
        class270.method1721((byte) -6);
        class279.method1760((byte) 126);
        class223.method1450(-29167);
        class57.method362(0);
        class387.field5680.method2043(-59);
        class218.field2991.method947();
        class71.field802.method415((byte) -122);
        class122.method693(9);
        class350.field5114.method338(-85);
        class335.field4932.method338(-36);
        class324.field4574.method338(-39);
        class220.field3018.method338(-91);
        class151.field2113.method338(-118);
        class282.field3968.method338(-99);
        int var2 = -51 % ((arg0 - 14) / 33);
        class354.field5165.method338(-40);
        class144.field2031.method338(-37);
        class92.field1012.method338(-63);
        class105.field1199.method338(-108);
        class118.field1403.method338(-50);
        class213.field2919.method338(-67);
        class78.field889.method338(-70);
        class323.field4546.method338(-103);
        class3.field41.method338(-104);
        class303.field4336.method338(-113);
        class162.field2280.method338(-93);
        class151.field2129.method338(-34);
        class364.field5295.method338(-109);
        class362.field5273.method338(-118);
        class6.field70.method338(-59);
        class8.field98.method338(-52);
        class318.field4502.method338(-104);
        class54.field611.method338(-74);
        class101.field1133.method338(-41);
        class97.field1093.method338(-113);
        class134.field1883.method338(-38);
        class132.field1809.method338(-81);
        class341.field5016.method338(-47);
        class24.field241.method2043(-63);
        class297.field4240.method2043(-42);
        class330.field4714.method2043(-27);
        class410.field5935.method2043(-53);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
    public static final void method1927(byte arg0) {
        int var1 = 63 % ((81 - arg0) / 40);
        field4406++;
        class167 var2 = null;
        try {
            class241 var3 = class323.field4554.method2379(true);
            while (var3.field3268 == 0) {
                class278.method1757(1L, 0);
            }
            if (var3.field3268 == 1) {
                var2 = (class167) var3.field3270;
                class211 var4 = new class211(class152.field2142 * 6 + 3);
                var4.method1396(21375, 1);
                var4.method1380(class152.field2142, (byte) -8);
                for (int var5 = 0; var5 < class160.field2272.length; var5++) {
                    if (class148.field2087[var5]) {
                        var4.method1380(var5, (byte) -8);
                        var4.method1361((byte) -124, class160.field2272[var5]);
                    }
                }
                var2.method1103(-1, var4.field2888, 0, var4.field2867);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method1107((byte) -123);
            }
        } catch (Exception var6) {
        }
        class193.field2642 = class203.method1299((byte) 5);
        class400.field5811 = false;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)V")
    public static void method1928(byte arg0) {
        field4407 = null;
        if (arg0 != -5) {
            method1926((byte) -114);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)Lma;")
    public static final class8 method1929(byte arg0, int arg1) {
        field4404++;
        int var2 = 64 / ((arg0 + 73) / 33);
        class8 var3 = (class8) class238.field3241.method2049(-120, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class123.field1629.method361(26, 70, arg1);
        class8 var5 = new class8();
        if (var4 != null) {
            var5.method74(new class211(var4), (byte) -32);
        }
        class238.field3241.method2046((long) arg1, 0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lra;Lra;Lra;Lra;Z)V")
    public static final void method1930(class57 arg0, class57 arg1, class57 arg2, class57 arg3, boolean arg4) {
        class287.field4066 = arg0;
        class172.field2401 = arg1;
        class168.field2348 = arg3;
        class443.field6475 = arg2;
        field4401++;
        class224.field3054 = new class119[class172.field2401.method358((byte) -111)][];
        if (!arg4) {
            class45.field542 = new boolean[class172.field2401.method358((byte) -111)];
        }
    }
}
